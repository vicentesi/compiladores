// $ANTLR 3.4 Fast.g 2012-11-26 17:50:03

package Compilador;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class FastLexer extends Lexer {
    public static final int EOF=-1;
    public static final int AND=4;
    public static final int ASSIGN=5;
    public static final int CHEST=6;
    public static final int COLON=7;
    public static final int COMMA=8;
    public static final int COMMENT=9;
    public static final int DIGIT=10;
    public static final int DO=11;
    public static final int DOT=12;
    public static final int ELSE=13;
    public static final int ELSEIF=14;
    public static final int END=15;
    public static final int EQUAL=16;
    public static final int EscapeSequence=17;
    public static final int FALSE=18;
    public static final int FLOAT=19;
    public static final int FOR=20;
    public static final int GREATER=21;
    public static final int GREATEREQUAL=22;
    public static final int IF=23;
    public static final int IN=24;
    public static final int INT=25;
    public static final int LBRACK=26;
    public static final int LCURLY=27;
    public static final int LESS=28;
    public static final int LESSEQUAL=29;
    public static final int LETTER=30;
    public static final int LETTERL=31;
    public static final int LETTERU=32;
    public static final int LINE_COMMENT=33;
    public static final int LPAREN=34;
    public static final int MINUS=35;
    public static final int NAME=36;
    public static final int NORMALSTRING=37;
    public static final int NOT=38;
    public static final int NOTEQUAL=39;
    public static final int OR=40;
    public static final int PERCENT=41;
    public static final int PLUS=42;
    public static final int POWER=43;
    public static final int RBRACK=44;
    public static final int RCURLY=45;
    public static final int REPEAT=46;
    public static final int RETURN=47;
    public static final int RPAREN=48;
    public static final int SEMI=49;
    public static final int SLASH=50;
    public static final int STAR=51;
    public static final int THEN=52;
    public static final int TO=53;
    public static final int TRUE=54;
    public static final int T_BOOL=55;
    public static final int T_CHAIN=56;
    public static final int T_INT=57;
    public static final int T_REAL=58;
    public static final int T_STRING=59;
    public static final int T_VOID=60;
    public static final int UNTIL=61;
    public static final int WHILE=62;
    public static final int WITH=63;
    public static final int WS=64;

    /** Handles context-sensitive lexing of implicit line joining such as
     *  the case where newline is ignored in cases like this:
     *  a = [3,
     *       4]
     */
    int implicitLineJoiningLevel = 0;


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public FastLexer() {} 
    public FastLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public FastLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Fast.g"; }

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:39:13: ( '(' )
            // Fast.g:39:15: '('
            {
            match('('); 

            implicitLineJoiningLevel++;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:40:12: ( ')' )
            // Fast.g:40:14: ')'
            {
            match(')'); 

            implicitLineJoiningLevel--;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LBRACK"
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:41:13: ( '[' )
            // Fast.g:41:15: '['
            {
            match('['); 

            implicitLineJoiningLevel++;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBRACK"

    // $ANTLR start "RBRACK"
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:42:13: ( ']' )
            // Fast.g:42:15: ']'
            {
            match(']'); 

            implicitLineJoiningLevel--;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRACK"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:44:13: ( ':' )
            // Fast.g:44:15: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:45:13: ( ',' )
            // Fast.g:45:15: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:46:13: ( ';' )
            // Fast.g:46:15: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:47:8: ( '.' )
            // Fast.g:47:10: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:49:13: ( '+' )
            // Fast.g:49:15: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:50:12: ( '-' )
            // Fast.g:50:14: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:51:13: ( '*' )
            // Fast.g:51:15: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:52:16: ( '/' )
            // Fast.g:52:18: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "POWER"
    public final void mPOWER() throws RecognitionException {
        try {
            int _type = POWER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:53:14: ( '^' )
            // Fast.g:53:16: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POWER"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:55:16: ( '<' )
            // Fast.g:55:18: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "GREATER"
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:56:16: ( '>' )
            // Fast.g:56:18: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATER"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:57:15: ( '=' )
            // Fast.g:57:17: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:58:15: ( '%' )
            // Fast.g:58:17: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "LCURLY"
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:59:15: ( '{' )
            // Fast.g:59:17: '{'
            {
            match('{'); 

            implicitLineJoiningLevel++;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LCURLY"

    // $ANTLR start "RCURLY"
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:60:15: ( '}' )
            // Fast.g:60:17: '}'
            {
            match('}'); 

            implicitLineJoiningLevel--;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RCURLY"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:61:15: ( '==' )
            // Fast.g:61:17: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "NOTEQUAL"
    public final void mNOTEQUAL() throws RecognitionException {
        try {
            int _type = NOTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:62:16: ( '<>' )
            // Fast.g:62:18: '<>'
            {
            match("<>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTEQUAL"

    // $ANTLR start "LESSEQUAL"
    public final void mLESSEQUAL() throws RecognitionException {
        try {
            int _type = LESSEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:63:16: ( '<=' )
            // Fast.g:63:18: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESSEQUAL"

    // $ANTLR start "GREATEREQUAL"
    public final void mGREATEREQUAL() throws RecognitionException {
        try {
            int _type = GREATEREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:64:16: ( '>=' )
            // Fast.g:64:18: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATEREQUAL"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:66:8: ( 'and' )
            // Fast.g:66:10: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:67:8: ( 'or' )
            // Fast.g:67:10: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:68:8: ( 'not' )
            // Fast.g:68:10: 'not'
            {
            match("not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:69:9: ( 'false' )
            // Fast.g:69:11: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:70:8: ( 'true' )
            // Fast.g:70:10: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "TO"
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:72:8: ( '..' )
            // Fast.g:72:10: '..'
            {
            match(".."); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TO"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:73:8: ( 'for' )
            // Fast.g:73:10: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "REPEAT"
    public final void mREPEAT() throws RecognitionException {
        try {
            int _type = REPEAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:74:10: ( 'repeat' )
            // Fast.g:74:12: 'repeat'
            {
            match("repeat"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REPEAT"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:75:9: ( 'while' )
            // Fast.g:75:11: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:76:7: ( 'if' )
            // Fast.g:76:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:77:10: ( 'else' )
            // Fast.g:77:12: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ELSEIF"
    public final void mELSEIF() throws RecognitionException {
        try {
            int _type = ELSEIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:78:12: ( 'elif' )
            // Fast.g:78:14: 'elif'
            {
            match("elif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSEIF"

    // $ANTLR start "UNTIL"
    public final void mUNTIL() throws RecognitionException {
        try {
            int _type = UNTIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:79:11: ( 'until' )
            // Fast.g:79:13: 'until'
            {
            match("until"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNTIL"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:80:9: ( 'do' )
            // Fast.g:80:11: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "WITH"
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:81:10: ( 'with' )
            // Fast.g:81:12: 'with'
            {
            match("with"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WITH"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:82:9: ( 'in' )
            // Fast.g:82:11: 'in'
            {
            match("in"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:83:9: ( 'end' )
            // Fast.g:83:11: 'end'
            {
            match("end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:84:12: ( 'return' )
            // Fast.g:84:14: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "CHEST"
    public final void mCHEST() throws RecognitionException {
        try {
            int _type = CHEST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:85:11: ( 'chest' )
            // Fast.g:85:13: 'chest'
            {
            match("chest"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHEST"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:86:10: ( 'then' )
            // Fast.g:86:12: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "T_INT"
    public final void mT_INT() throws RecognitionException {
        try {
            int _type = T_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:88:9: ( 'int' )
            // Fast.g:88:11: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T_INT"

    // $ANTLR start "T_REAL"
    public final void mT_REAL() throws RecognitionException {
        try {
            int _type = T_REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:89:10: ( 'real' )
            // Fast.g:89:12: 'real'
            {
            match("real"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T_REAL"

    // $ANTLR start "T_STRING"
    public final void mT_STRING() throws RecognitionException {
        try {
            int _type = T_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:90:11: ( 'string' )
            // Fast.g:90:13: 'string'
            {
            match("string"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T_STRING"

    // $ANTLR start "T_CHAIN"
    public final void mT_CHAIN() throws RecognitionException {
        try {
            int _type = T_CHAIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:91:11: ( 'chain' )
            // Fast.g:91:13: 'chain'
            {
            match("chain"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T_CHAIN"

    // $ANTLR start "T_VOID"
    public final void mT_VOID() throws RecognitionException {
        try {
            int _type = T_VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:92:10: ( 'void' )
            // Fast.g:92:12: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T_VOID"

    // $ANTLR start "T_BOOL"
    public final void mT_BOOL() throws RecognitionException {
        try {
            int _type = T_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:93:10: ( 'bool' )
            // Fast.g:93:12: 'bool'
            {
            match("bool"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T_BOOL"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:230:2: ( LETTER ( LETTER | DIGIT )* )
            // Fast.g:230:4: LETTER ( LETTER | DIGIT )*
            {
            mLETTER(); 


            // Fast.g:230:11: ( LETTER | DIGIT )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Fast.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:234:2: ( ( DIGIT )+ )
            // Fast.g:234:4: ( DIGIT )+
            {
            // Fast.g:234:4: ( DIGIT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Fast.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:238:2: ( ( DIGIT )+ '.' ( DIGIT )+ )
            // Fast.g:238:4: ( DIGIT )+ '.' ( DIGIT )+
            {
            // Fast.g:238:4: ( DIGIT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Fast.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            match('.'); 

            // Fast.g:238:15: ( DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Fast.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "NORMALSTRING"
    public final void mNORMALSTRING() throws RecognitionException {
        try {
            int _type = NORMALSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:242:2: ( '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"' )
            // Fast.g:242:4: '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // Fast.g:242:7: ( EscapeSequence |~ ( '\\\\' | '\"' ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\\') ) {
                    alt5=1;
                }
                else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '[')||(LA5_0 >= ']' && LA5_0 <= '\uFFFF')) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // Fast.g:242:9: EscapeSequence
            	    {
            	    mEscapeSequence(); 


            	    }
            	    break;
            	case 2 :
            	    // Fast.g:242:26: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NORMALSTRING"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // Fast.g:248:2: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // Fast.g:248:4: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 

            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:250:5: ( ( ' ' | '\\r' | '\\t' | '\\n' | '\\u000C' )+ )
            // Fast.g:250:8: ( ' ' | '\\r' | '\\t' | '\\n' | '\\u000C' )+
            {
            // Fast.g:250:8: ( ' ' | '\\r' | '\\t' | '\\n' | '\\u000C' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||(LA6_0 >= '\f' && LA6_0 <= '\r')||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Fast.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:254:2: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // Fast.g:254:4: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // Fast.g:254:9: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1 >= '\u0000' && LA7_1 <= '.')||(LA7_1 >= '0' && LA7_1 <= '\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0 >= '\u0000' && LA7_0 <= ')')||(LA7_0 >= '+' && LA7_0 <= '\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Fast.g:254:36: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match("*/"); 



             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Fast.g:258:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // Fast.g:258:4: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 



            // Fast.g:258:9: (~ ( '\\n' | '\\r' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\t')||(LA8_0 >= '\u000B' && LA8_0 <= '\f')||(LA8_0 >= '\u000E' && LA8_0 <= '\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Fast.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            // Fast.g:258:23: ( '\\r' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Fast.g:258:23: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // Fast.g:262:2: ( '0' .. '9' )
            // Fast.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // Fast.g:266:2: ( LETTERL | LETTERU )
            // Fast.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "LETTERL"
    public final void mLETTERL() throws RecognitionException {
        try {
            // Fast.g:270:2: ( 'a' .. 'z' )
            // Fast.g:
            {
            if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTERL"

    // $ANTLR start "LETTERU"
    public final void mLETTERU() throws RecognitionException {
        try {
            // Fast.g:274:2: ( 'A' .. 'Z' )
            // Fast.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTERU"

    public void mTokens() throws RecognitionException {
        // Fast.g:1:8: ( LPAREN | RPAREN | LBRACK | RBRACK | COLON | COMMA | SEMI | DOT | PLUS | MINUS | STAR | SLASH | POWER | LESS | GREATER | ASSIGN | PERCENT | LCURLY | RCURLY | EQUAL | NOTEQUAL | LESSEQUAL | GREATEREQUAL | AND | OR | NOT | FALSE | TRUE | TO | FOR | REPEAT | WHILE | IF | ELSE | ELSEIF | UNTIL | DO | WITH | IN | END | RETURN | CHEST | THEN | T_INT | T_REAL | T_STRING | T_CHAIN | T_VOID | T_BOOL | NAME | INT | FLOAT | NORMALSTRING | WS | COMMENT | LINE_COMMENT )
        int alt10=56;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // Fast.g:1:10: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 2 :
                // Fast.g:1:17: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 3 :
                // Fast.g:1:24: LBRACK
                {
                mLBRACK(); 


                }
                break;
            case 4 :
                // Fast.g:1:31: RBRACK
                {
                mRBRACK(); 


                }
                break;
            case 5 :
                // Fast.g:1:38: COLON
                {
                mCOLON(); 


                }
                break;
            case 6 :
                // Fast.g:1:44: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 7 :
                // Fast.g:1:50: SEMI
                {
                mSEMI(); 


                }
                break;
            case 8 :
                // Fast.g:1:55: DOT
                {
                mDOT(); 


                }
                break;
            case 9 :
                // Fast.g:1:59: PLUS
                {
                mPLUS(); 


                }
                break;
            case 10 :
                // Fast.g:1:64: MINUS
                {
                mMINUS(); 


                }
                break;
            case 11 :
                // Fast.g:1:70: STAR
                {
                mSTAR(); 


                }
                break;
            case 12 :
                // Fast.g:1:75: SLASH
                {
                mSLASH(); 


                }
                break;
            case 13 :
                // Fast.g:1:81: POWER
                {
                mPOWER(); 


                }
                break;
            case 14 :
                // Fast.g:1:87: LESS
                {
                mLESS(); 


                }
                break;
            case 15 :
                // Fast.g:1:92: GREATER
                {
                mGREATER(); 


                }
                break;
            case 16 :
                // Fast.g:1:100: ASSIGN
                {
                mASSIGN(); 


                }
                break;
            case 17 :
                // Fast.g:1:107: PERCENT
                {
                mPERCENT(); 


                }
                break;
            case 18 :
                // Fast.g:1:115: LCURLY
                {
                mLCURLY(); 


                }
                break;
            case 19 :
                // Fast.g:1:122: RCURLY
                {
                mRCURLY(); 


                }
                break;
            case 20 :
                // Fast.g:1:129: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 21 :
                // Fast.g:1:135: NOTEQUAL
                {
                mNOTEQUAL(); 


                }
                break;
            case 22 :
                // Fast.g:1:144: LESSEQUAL
                {
                mLESSEQUAL(); 


                }
                break;
            case 23 :
                // Fast.g:1:154: GREATEREQUAL
                {
                mGREATEREQUAL(); 


                }
                break;
            case 24 :
                // Fast.g:1:167: AND
                {
                mAND(); 


                }
                break;
            case 25 :
                // Fast.g:1:171: OR
                {
                mOR(); 


                }
                break;
            case 26 :
                // Fast.g:1:174: NOT
                {
                mNOT(); 


                }
                break;
            case 27 :
                // Fast.g:1:178: FALSE
                {
                mFALSE(); 


                }
                break;
            case 28 :
                // Fast.g:1:184: TRUE
                {
                mTRUE(); 


                }
                break;
            case 29 :
                // Fast.g:1:189: TO
                {
                mTO(); 


                }
                break;
            case 30 :
                // Fast.g:1:192: FOR
                {
                mFOR(); 


                }
                break;
            case 31 :
                // Fast.g:1:196: REPEAT
                {
                mREPEAT(); 


                }
                break;
            case 32 :
                // Fast.g:1:203: WHILE
                {
                mWHILE(); 


                }
                break;
            case 33 :
                // Fast.g:1:209: IF
                {
                mIF(); 


                }
                break;
            case 34 :
                // Fast.g:1:212: ELSE
                {
                mELSE(); 


                }
                break;
            case 35 :
                // Fast.g:1:217: ELSEIF
                {
                mELSEIF(); 


                }
                break;
            case 36 :
                // Fast.g:1:224: UNTIL
                {
                mUNTIL(); 


                }
                break;
            case 37 :
                // Fast.g:1:230: DO
                {
                mDO(); 


                }
                break;
            case 38 :
                // Fast.g:1:233: WITH
                {
                mWITH(); 


                }
                break;
            case 39 :
                // Fast.g:1:238: IN
                {
                mIN(); 


                }
                break;
            case 40 :
                // Fast.g:1:241: END
                {
                mEND(); 


                }
                break;
            case 41 :
                // Fast.g:1:245: RETURN
                {
                mRETURN(); 


                }
                break;
            case 42 :
                // Fast.g:1:252: CHEST
                {
                mCHEST(); 


                }
                break;
            case 43 :
                // Fast.g:1:258: THEN
                {
                mTHEN(); 


                }
                break;
            case 44 :
                // Fast.g:1:263: T_INT
                {
                mT_INT(); 


                }
                break;
            case 45 :
                // Fast.g:1:269: T_REAL
                {
                mT_REAL(); 


                }
                break;
            case 46 :
                // Fast.g:1:276: T_STRING
                {
                mT_STRING(); 


                }
                break;
            case 47 :
                // Fast.g:1:285: T_CHAIN
                {
                mT_CHAIN(); 


                }
                break;
            case 48 :
                // Fast.g:1:293: T_VOID
                {
                mT_VOID(); 


                }
                break;
            case 49 :
                // Fast.g:1:300: T_BOOL
                {
                mT_BOOL(); 


                }
                break;
            case 50 :
                // Fast.g:1:307: NAME
                {
                mNAME(); 


                }
                break;
            case 51 :
                // Fast.g:1:312: INT
                {
                mINT(); 


                }
                break;
            case 52 :
                // Fast.g:1:316: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 53 :
                // Fast.g:1:322: NORMALSTRING
                {
                mNORMALSTRING(); 


                }
                break;
            case 54 :
                // Fast.g:1:335: WS
                {
                mWS(); 


                }
                break;
            case 55 :
                // Fast.g:1:338: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 56 :
                // Fast.g:1:346: LINE_COMMENT
                {
                mLINE_COMMENT(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\10\uffff\1\50\3\uffff\1\53\1\uffff\1\56\1\60\1\62\3\uffff\17\43"+
        "\1\uffff\1\107\16\uffff\1\43\1\112\10\43\1\125\1\127\3\43\1\134"+
        "\4\43\2\uffff\1\142\1\uffff\1\143\1\43\1\145\7\43\1\uffff\1\155"+
        "\1\uffff\2\43\1\160\1\43\1\uffff\5\43\2\uffff\1\43\1\uffff\1\170"+
        "\1\171\2\43\1\174\1\43\1\176\1\uffff\1\177\1\u0080\1\uffff\4\43"+
        "\1\u0085\1\u0086\1\u0087\2\uffff\2\43\1\uffff\1\u008a\3\uffff\1"+
        "\u008b\1\u008c\1\u008d\1\43\3\uffff\1\u008f\1\u0090\4\uffff\1\u0091"+
        "\3\uffff";
    static final String DFA10_eofS =
        "\u0092\uffff";
    static final String DFA10_minS =
        "\1\11\7\uffff\1\56\3\uffff\1\52\1\uffff\3\75\3\uffff\1\156\1\162"+
        "\1\157\1\141\1\150\1\145\1\150\1\146\1\154\1\156\1\157\1\150\1\164"+
        "\2\157\1\uffff\1\56\16\uffff\1\144\1\60\1\164\1\154\1\162\1\165"+
        "\1\145\1\141\1\151\1\164\2\60\1\151\1\144\1\164\1\60\1\141\1\162"+
        "\1\151\1\157\2\uffff\1\60\1\uffff\1\60\1\163\1\60\1\145\1\156\1"+
        "\145\1\165\2\154\1\150\1\uffff\1\60\1\uffff\1\145\1\146\1\60\1\151"+
        "\1\uffff\1\163\2\151\1\144\1\154\2\uffff\1\145\1\uffff\2\60\1\141"+
        "\1\162\1\60\1\145\1\60\1\uffff\2\60\1\uffff\1\154\1\164\2\156\3"+
        "\60\2\uffff\1\164\1\156\1\uffff\1\60\3\uffff\3\60\1\147\3\uffff"+
        "\2\60\4\uffff\1\60\3\uffff";
    static final String DFA10_maxS =
        "\1\175\7\uffff\1\56\3\uffff\1\57\1\uffff\1\76\2\75\3\uffff\1\156"+
        "\1\162\2\157\1\162\1\145\1\151\3\156\1\157\1\150\1\164\2\157\1\uffff"+
        "\1\71\16\uffff\1\144\1\172\1\164\1\154\1\162\1\165\1\145\1\164\1"+
        "\151\1\164\2\172\1\163\1\144\1\164\1\172\1\145\1\162\1\151\1\157"+
        "\2\uffff\1\172\1\uffff\1\172\1\163\1\172\1\145\1\156\1\145\1\165"+
        "\2\154\1\150\1\uffff\1\172\1\uffff\1\145\1\146\1\172\1\151\1\uffff"+
        "\1\163\2\151\1\144\1\154\2\uffff\1\145\1\uffff\2\172\1\141\1\162"+
        "\1\172\1\145\1\172\1\uffff\2\172\1\uffff\1\154\1\164\2\156\3\172"+
        "\2\uffff\1\164\1\156\1\uffff\1\172\3\uffff\3\172\1\147\3\uffff\2"+
        "\172\4\uffff\1\172\3\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\1\12\1\13\1\uffff"+
        "\1\15\3\uffff\1\21\1\22\1\23\17\uffff\1\62\1\uffff\1\65\1\66\1\35"+
        "\1\10\1\67\1\70\1\14\1\25\1\26\1\16\1\27\1\17\1\24\1\20\24\uffff"+
        "\1\63\1\64\1\uffff\1\31\12\uffff\1\41\1\uffff\1\47\4\uffff\1\45"+
        "\5\uffff\1\30\1\32\1\uffff\1\36\7\uffff\1\54\2\uffff\1\50\7\uffff"+
        "\1\34\1\53\2\uffff\1\55\1\uffff\1\46\1\42\1\43\4\uffff\1\60\1\61"+
        "\1\33\2\uffff\1\40\1\44\1\52\1\57\1\uffff\1\37\1\51\1\56";
    static final String DFA10_specialS =
        "\u0092\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\46\1\uffff\2\46\22\uffff\1\46\1\uffff\1\45\2\uffff\1\21\2"+
            "\uffff\1\1\1\2\1\13\1\11\1\6\1\12\1\10\1\14\12\44\1\5\1\7\1"+
            "\16\1\20\1\17\2\uffff\32\43\1\3\1\uffff\1\4\1\15\2\uffff\1\24"+
            "\1\42\1\37\1\36\1\34\1\27\2\43\1\33\4\43\1\26\1\25\2\43\1\31"+
            "\1\40\1\30\1\35\1\41\1\32\3\43\1\22\1\uffff\1\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\47",
            "",
            "",
            "",
            "\1\51\4\uffff\1\52",
            "",
            "\1\55\1\54",
            "\1\57",
            "\1\61",
            "",
            "",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66\15\uffff\1\67",
            "\1\71\11\uffff\1\70",
            "\1\72",
            "\1\73\1\74",
            "\1\75\7\uffff\1\76",
            "\1\77\1\uffff\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "\1\110\1\uffff\12\44",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\111",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\122\16\uffff\1\120\3\uffff\1\121",
            "\1\123",
            "\1\124",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\12\43\7\uffff\32\43\6\uffff\23\43\1\126\6\43",
            "\1\131\11\uffff\1\130",
            "\1\132",
            "\1\133",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\136\3\uffff\1\135",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\144",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "",
            "\1\156",
            "\1\157",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\161",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "",
            "",
            "\1\167",
            "",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\172",
            "\1\173",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\175",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "",
            "",
            "\1\u0088",
            "\1\u0089",
            "",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\u008e",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( LPAREN | RPAREN | LBRACK | RBRACK | COLON | COMMA | SEMI | DOT | PLUS | MINUS | STAR | SLASH | POWER | LESS | GREATER | ASSIGN | PERCENT | LCURLY | RCURLY | EQUAL | NOTEQUAL | LESSEQUAL | GREATEREQUAL | AND | OR | NOT | FALSE | TRUE | TO | FOR | REPEAT | WHILE | IF | ELSE | ELSEIF | UNTIL | DO | WITH | IN | END | RETURN | CHEST | THEN | T_INT | T_REAL | T_STRING | T_CHAIN | T_VOID | T_BOOL | NAME | INT | FLOAT | NORMALSTRING | WS | COMMENT | LINE_COMMENT );";
        }
    }
 

}