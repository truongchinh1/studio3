/**
 * Aptana Studio
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the GNU Public License (GPL) v3 (with exceptions).
 * Please see the license.html included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package com.aptana.samples.model;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;

import com.aptana.core.util.ArrayUtil;
import com.aptana.samples.handlers.ISamplePreviewHandler;
import com.aptana.samples.handlers.ISampleProjectHandler;

public class SamplesReference implements IProjectSample
{

	private static final String ATTR_PROJECT_HANDLER = "projectHandler"; //$NON-NLS-1$
	private static final String ATTR_PREVIEW_HANDLER = "previewHandler"; //$NON-NLS-1$
	public static final String REMOTE_DESCRIPTION_KEY = "remoteDescription"; //$NON-NLS-1$

	private final SampleCategory category;
	private final String location;
	private final IConfigurationElement configElement;

	private final String id;
	private final String name;
	private String description;
	private boolean isRemote;
	private String infoFile;
	private ISampleProjectHandler projectHandler;
	private ISamplePreviewHandler previewHandler;
	private String[] natures;
	private String[] includePaths;

	public SamplesReference(SampleCategory category, String id, String name, String location, boolean isRemote,
			String description, IConfigurationElement element)
	{
		this.category = category;
		this.id = id;
		this.name = name;
		this.location = location;
		this.isRemote = isRemote;
		this.description = description;
		configElement = element;
		natures = ArrayUtil.NO_STRINGS;
		includePaths = ArrayUtil.NO_STRINGS;
	}

	public String getDescription()
	{
		return description;
	}

	public SampleCategory getCategory()
	{
		return category;
	}

	public String getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public String getLocation()
	{
		return location;
	}

	public String getInfoFile()
	{
		return infoFile;
	}

	public ISampleProjectHandler getProjectHandler()
	{
		if (projectHandler == null)
		{
			try
			{
				projectHandler = (ISampleProjectHandler) configElement.createExecutableExtension(ATTR_PROJECT_HANDLER);
			}
			catch (CoreException e)
			{
				// ignores the exception since it's optional
			}
		}
		return projectHandler;
	}

	public ISamplePreviewHandler getPreviewHandler()
	{
		if (previewHandler == null)
		{
			try
			{
				previewHandler = (ISamplePreviewHandler) configElement.createExecutableExtension(ATTR_PREVIEW_HANDLER);
			}
			catch (CoreException e)
			{
				// ignores the exception since it's optional
			}
		}
		return previewHandler;
	}

	public String[] getNatures()
	{
		return natures;
	}

	public String[] getIncludePaths()
	{
		return includePaths;
	}

	public boolean isRemote()
	{
		return isRemote;
	}

	public void setInfoFile(String infoFile)
	{
		this.infoFile = infoFile;
	}

	public void setNatures(String[] natures)
	{
		this.natures = natures;
	}

	public void setIncludePaths(String[] paths)
	{
		includePaths = paths;
	}
}
