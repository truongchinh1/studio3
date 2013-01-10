/* The following code was generated by JFlex 1.4.3 on 1/8/13 12:49 PM */

// $codepro.audit.disable
/**
 * Aptana Studio
 * Copyright (c) 2005-2013 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the GNU Public License (GPL) v3 (with exceptions).
 * Please see the license.html included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package com.aptana.json.core.parsing;

import java.io.Reader;
import java.io.StringReader;

import beaver.Symbol;
import beaver.Scanner;

import org.eclipse.core.internal.utils.StringPool;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 1/8/13 12:49 PM from the specification file
 * <tt>/Users/cwilliams/repos/studio3/plugins/com.aptana.editor.json/parsing/JSON.flex</tt>
 */
public class JSONFlexScanner extends Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\2\1\1\1\0\1\2\1\1\22\0\1\2\1\0\1\13"+
    "\4\0\1\15\3\0\1\12\1\33\1\12\1\10\1\0\1\4\11\7"+
    "\1\34\6\0\4\6\1\11\1\6\21\0\1\5\2\0\1\31\1\14"+
    "\1\32\3\0\1\17\3\6\1\22\1\16\5\0\1\20\1\0\1\23"+
    "\3\0\1\26\1\21\1\25\1\24\2\0\1\5\2\0\1\27\1\0"+
    "\1\30\u05e2\0\12\3\206\0\12\3\u026c\0\12\3\166\0\12\3\166\0"+
    "\12\3\166\0\12\3\166\0\12\3\167\0\11\3\166\0\12\3\166\0"+
    "\12\3\166\0\12\3\340\0\12\3\166\0\12\3\106\0\12\3\u0116\0"+
    "\12\3\u031f\0\11\3\u046e\0\12\3\46\0\12\3\u012c\0\12\3\ue5c0\0"+
    "\12\3\346\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\3\6\1\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\3\3\0\1\12\1\1\1\0"+
    "\1\1\3\0\1\3\1\0\1\3\6\0\1\13\1\14"+
    "\1\15";

  private static int [] zzUnpackAction() {
    int [] result = new int[40];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\35\0\72\0\127\0\164\0\221\0\256\0\313"+
    "\0\350\0\u0105\0\u0122\0\35\0\35\0\35\0\35\0\35"+
    "\0\35\0\u013f\0\u015c\0\u0179\0\u0196\0\35\0\u01b3\0\u01d0"+
    "\0\u01ed\0\u020a\0\u0227\0\u0244\0\u0261\0\u0261\0\u0179\0\u01b3"+
    "\0\u01ed\0\u027e\0\u029b\0\u02b8\0\u02d5\0\35\0\35\0\35";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[40];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\5\2\2\1\4\1\6\2\2"+
    "\1\7\1\2\1\10\1\11\4\2\1\12\1\2\1\13"+
    "\1\2\1\14\1\15\1\16\1\17\1\20\1\21\36\0"+
    "\2\3\35\0\2\4\2\0\1\4\1\22\1\23\10\0"+
    "\1\23\15\0\2\4\1\24\1\0\1\4\1\22\1\23"+
    "\10\0\1\23\15\0\2\22\2\0\1\22\25\0\1\25"+
    "\1\0\11\25\1\26\1\27\20\25\1\30\1\0\12\30"+
    "\1\31\1\26\17\30\17\0\1\32\41\0\1\33\36\0"+
    "\1\34\11\0\2\22\2\0\1\22\1\0\1\23\10\0"+
    "\1\23\15\0\2\35\2\0\1\35\2\0\1\36\26\0"+
    "\1\37\1\0\2\37\1\0\1\37\4\0\2\37\2\0"+
    "\1\37\12\0\1\25\1\0\11\25\1\26\1\40\55\25"+
    "\1\30\1\0\12\30\1\41\1\26\54\30\20\0\1\42"+
    "\34\0\1\43\40\0\1\44\13\0\2\35\2\0\1\35"+
    "\46\0\1\45\33\0\1\46\36\0\1\47\34\0\1\50"+
    "\12\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[754];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\11\1\6\11\1\1\3\0\1\11\1\1"+
    "\1\0\1\1\3\0\1\1\1\0\1\1\6\0\3\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[40];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
	// last token used for look behind. Also needed when implementing the ITokenScanner interface
	private Symbol _lastToken;
	
	private StringPool _stringPool;


	public JSONFlexScanner()
	{
		this((Reader) null);
	}

	public Symbol getLastToken()
	{
		return _lastToken;
	}
	
	private String pool(String value)
	{
		return _stringPool.add(value);
	}
	
	private Symbol newToken(short id)
	{
		return new Symbol(id, yychar, yychar + yylength() - 1, null);
	}

	private Symbol newToken(short id, Object value)
	{
		return new Symbol(id, yychar, yychar + yylength() - 1, value);
	}

	public Symbol nextToken() throws java.io.IOException, Scanner.Exception
	{
		try
		{
			// get next token
			_lastToken = yylex();
		} 
		catch (Scanner.Exception e)
		{
			// create default token type
			String text = yytext();
			int end = yychar + text.length() - 1;

			_lastToken = new Symbol(Terminals.EOF, yychar, end, text);
		}

		return _lastToken;
	}

	public void setSource(String source)
	{
		yyreset(new StringReader(source));

		_stringPool = new StringPool();

		// clear last token
		_lastToken = null;
	}


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public JSONFlexScanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public JSONFlexScanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 184) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Symbol yylex() throws java.io.IOException, Scanner.Exception {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 13: 
          { return newToken(Terminals.FALSE);
          }
        case 14: break;
        case 2: 
          { /* ignore */
          }
        case 15: break;
        case 7: 
          { return newToken(Terminals.RBRACKET);
          }
        case 16: break;
        case 8: 
          { return newToken(Terminals.COMMA);
          }
        case 17: break;
        case 11: 
          { return newToken(Terminals.NULL);
          }
        case 18: break;
        case 3: 
          { return newToken(Terminals.NUMBER, pool(yytext()));
          }
        case 19: break;
        case 12: 
          { return newToken(Terminals.TRUE);
          }
        case 20: break;
        case 6: 
          { return newToken(Terminals.LBRACKET);
          }
        case 21: break;
        case 5: 
          { return newToken(Terminals.RCURLY);
          }
        case 22: break;
        case 9: 
          { return newToken(Terminals.COLON);
          }
        case 23: break;
        case 1: 
          { // make sure we reset the lexer state for next (potential) scan
				yybegin(YYINITIAL);
				throw new Scanner.Exception("Unexpected character '" + yytext() + "' around offset " + yychar);
          }
        case 24: break;
        case 4: 
          { return newToken(Terminals.LCURLY);
          }
        case 25: break;
        case 10: 
          { return newToken(Terminals.STRING, pool(yytext()));
          }
        case 26: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
              { 	return newToken(Terminals.EOF, "end-of-file");
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
