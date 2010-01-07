package com.aptana.editor.common;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.UIJob;
import org.jruby.runtime.builtin.IRubyObject;

import com.aptana.scripting.ScriptUtils;
import com.aptana.scripting.model.CommandContext;
import com.aptana.scripting.model.CommandElement;
import com.aptana.scripting.model.ContextContributor;

public class EditorContextContributor implements ContextContributor
{
	private static final String EDITOR_PROPERTY_NAME = "editor";
	private static final String EDITOR_RUBY_CLASS = "Editor";
	
	private IEditorPart _editor;
	
	/**
	 * EditorContextContributor
	 */
	public EditorContextContributor()
	{
	}

	/**
	 * getActiveEditor
	 * 
	 * @return
	 */
	private IEditorPart getActiveEditor()
	{
		UIJob job = new UIJob("Get active editor")
		{
			public IStatus runInUIThread(IProgressMonitor monitor)
			{
				IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
				
				if (window != null)
				{
					IWorkbenchPage page = window.getActivePage();
					
					if (page != null)
					{
						_editor = page.getActiveEditor();
					}
				}
				
				return null;
			}
		};
		IEditorPart result = null;
		
		// run the job
		try
		{
			job.schedule();
			job.join();
			
			// grab the result
			result = this._editor;
			
			// lose the reference so we don't hang on to the editor
			this._editor = null;
		}
		catch (InterruptedException e)
		{
			// fail silently
		}
		
		return result;
	}

	/*
	 * (non-Javadoc)
	 * @see com.aptana.scripting.model.ContextContributor#modifyContext(com.aptana.scripting.model.CommandElement,
	 * com.aptana.scripting.model.CommandContext)
	 */
	public void modifyContext(CommandElement command, CommandContext context)
	{
		IEditorPart editor = this.getActiveEditor();
		
		if (editor != null)
		{
			IRubyObject[] args = new IRubyObject[] { ScriptUtils.javaToRuby(editor) };
			IRubyObject rubyInstance = ScriptUtils.instantiateClass(ScriptUtils.RADRAILS_MODULE, EDITOR_RUBY_CLASS, args);

			context.put(EDITOR_PROPERTY_NAME, rubyInstance);
		}
		else
		{
			context.put(EDITOR_PROPERTY_NAME, null);
		}
	}
}
