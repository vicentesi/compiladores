// $ANTLR 3.3 Nov 30, 2010 12:45:30 /home/cesar/UFSC/Compiladores/FINAL/javax.g 2011-05-12 20:13:02

	package Tools;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class javaxLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int SEMI=4;
    public static final int NAME=5;
    public static final int ASSIGN=6;
    public static final int COMMA=7;
    public static final int LPAREN=8;
    public static final int RPAREN=9;
    public static final int DOSTAT=10;
    public static final int ENDSTAT=11;
    public static final int IFSTAT=12;
    public static final int THENSTAT=13;
    public static final int ELSEIFSTAT=14;
    public static final int ELSESTAT=15;
    public static final int FORSTAT=16;
    public static final int INSTAT=17;
    public static final int REPEATSTAT=18;
    public static final int UNTILSTAT=19;
    public static final int CHESTSTAT=20;
    public static final int WITHSTAT=21;
    public static final int TYPE=22;
    public static final int DOT=23;
    public static final int RETURNSTAT=24;
    public static final int PLUS=25;
    public static final int MINUS=26;
    public static final int STAR=27;
    public static final int SLASH=28;
    public static final int PERCENT=29;
    public static final int POWER=30;
    public static final int LESS=31;
    public static final int TO=32;
    public static final int LESSEQUAL=33;
    public static final int GREATER=34;
    public static final int GREATEREQUAL=35;
    public static final int EQUAL=36;
    public static final int AND=37;
    public static final int OR=38;
    public static final int NOTEQUAL=39;
    public static final int NOT=40;
    public static final int INT=41;
    public static final int FLOAT=42;
    public static final int HEX=43;
    public static final int NORMALSTRING=44;
    public static final int LBRACK=45;
    public static final int RBRACK=46;
    public static final int COLON=47;
    public static final int LCURLY=48;
    public static final int RCURLY=49;
    public static final int EscapeSequence=50;
    public static final int WS=51;
    public static final int COMMENT=52;
    public static final int LINE_COMMENT=53;


    int implicitLineJoiningLevel = 0;
    int startPos=-1;


    // delegates
    // delegators

    public javaxLexer() {;} 
    public javaxLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public javaxLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/cesar/UFSC/Compiladores/FINAL/javax.g"; }

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:16:7: ( 'false' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:16:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:17:7: ( 'true' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:17:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:79:11: ( '(' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:79:13: '('
            {
            match('('); 
            implicitLineJoiningLevel++;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:81:11: ( ')' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:81:13: ')'
            {
            match(')'); 
            implicitLineJoiningLevel--;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LBRACK"
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:83:11: ( '[' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:83:13: '['
            {
            match('['); 
            implicitLineJoiningLevel++;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACK"

    // $ANTLR start "RBRACK"
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:85:11: ( ']' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:85:13: ']'
            {
            match(']'); 
            implicitLineJoiningLevel--;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACK"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:87:11: ( ':' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:87:13: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:89:10: ( ',' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:89:12: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:91:9: ( ';' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:91:11: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:93:9: ( '+' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:93:11: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:95:10: ( '-' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:95:12: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:97:9: ( '*' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:97:11: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:99:10: ( '/' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:99:12: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "POWER"
    public final void mPOWER() throws RecognitionException {
        try {
            int _type = POWER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:101:8: ( '^' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:101:10: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POWER"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:103:9: ( '<' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:103:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "GREATER"
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:105:12: ( '>' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:105:14: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:107:11: ( '=' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:107:13: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:109:12: ( '%' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:109:14: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "LCURLY"
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:111:11: ( '{' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:111:13: '{'
            {
            match('{'); 
            implicitLineJoiningLevel++;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LCURLY"

    // $ANTLR start "RCURLY"
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:113:11: ( '}' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:113:13: '}'
            {
            match('}'); 
            implicitLineJoiningLevel--;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RCURLY"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:115:10: ( '==' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:115:12: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "NOTEQUAL"
    public final void mNOTEQUAL() throws RecognitionException {
        try {
            int _type = NOTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:117:9: ( '<>' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:117:11: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTEQUAL"

    // $ANTLR start "LESSEQUAL"
    public final void mLESSEQUAL() throws RecognitionException {
        try {
            int _type = LESSEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:119:14: ( '<=' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:119:16: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESSEQUAL"

    // $ANTLR start "GREATEREQUAL"
    public final void mGREATEREQUAL() throws RecognitionException {
        try {
            int _type = GREATEREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:121:17: ( '>=' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:121:19: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATEREQUAL"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:123:5: ( '.' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:123:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:125:5: ( 'and' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:125:7: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:127:4: ( 'or' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:127:6: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:129:5: ( 'not' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:129:7: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "TO"
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:131:4: ( '..' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:131:6: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TO"

    // $ANTLR start "FORSTAT"
    public final void mFORSTAT() throws RecognitionException {
        try {
            int _type = FORSTAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:133:9: ( 'for' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:133:11: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FORSTAT"

    // $ANTLR start "REPEATSTAT"
    public final void mREPEATSTAT() throws RecognitionException {
        try {
            int _type = REPEATSTAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:135:12: ( 'repeat' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:135:14: 'repeat'
            {
            match("repeat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REPEATSTAT"

    // $ANTLR start "IFSTAT"
    public final void mIFSTAT() throws RecognitionException {
        try {
            int _type = IFSTAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:137:8: ( 'if' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:137:10: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IFSTAT"

    // $ANTLR start "ELSESTAT"
    public final void mELSESTAT() throws RecognitionException {
        try {
            int _type = ELSESTAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:139:10: ( 'else' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:139:12: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSESTAT"

    // $ANTLR start "ELSEIFSTAT"
    public final void mELSEIFSTAT() throws RecognitionException {
        try {
            int _type = ELSEIFSTAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:141:12: ( 'elif' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:141:14: 'elif'
            {
            match("elif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSEIFSTAT"

    // $ANTLR start "UNTILSTAT"
    public final void mUNTILSTAT() throws RecognitionException {
        try {
            int _type = UNTILSTAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:143:11: ( 'until' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:143:13: 'until'
            {
            match("until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNTILSTAT"

    // $ANTLR start "DOSTAT"
    public final void mDOSTAT() throws RecognitionException {
        try {
            int _type = DOSTAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:145:8: ( 'do' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:145:10: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOSTAT"

    // $ANTLR start "WITHSTAT"
    public final void mWITHSTAT() throws RecognitionException {
        try {
            int _type = WITHSTAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:147:10: ( 'with' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:147:12: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WITHSTAT"

    // $ANTLR start "INSTAT"
    public final void mINSTAT() throws RecognitionException {
        try {
            int _type = INSTAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:149:8: ( 'in' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:149:10: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INSTAT"

    // $ANTLR start "ENDSTAT"
    public final void mENDSTAT() throws RecognitionException {
        try {
            int _type = ENDSTAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:151:9: ( 'end' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:151:11: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENDSTAT"

    // $ANTLR start "RETURNSTAT"
    public final void mRETURNSTAT() throws RecognitionException {
        try {
            int _type = RETURNSTAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:153:12: ( 'return' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:153:14: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURNSTAT"

    // $ANTLR start "CHESTSTAT"
    public final void mCHESTSTAT() throws RecognitionException {
        try {
            int _type = CHESTSTAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:155:11: ( 'chest' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:155:13: 'chest'
            {
            match("chest"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHESTSTAT"

    // $ANTLR start "THENSTAT"
    public final void mTHENSTAT() throws RecognitionException {
        try {
            int _type = THENSTAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:157:10: ( 'then' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:157:12: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THENSTAT"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:159:6: ( 'int' | 'real' | 'bool' | 'string' | 'chain' | 'hex' | 'void' )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt1=1;
                }
                break;
            case 'r':
                {
                alt1=2;
                }
                break;
            case 'b':
                {
                alt1=3;
                }
                break;
            case 's':
                {
                alt1=4;
                }
                break;
            case 'c':
                {
                alt1=5;
                }
                break;
            case 'h':
                {
                alt1=6;
                }
                break;
            case 'v':
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:159:8: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 2 :
                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:159:16: 'real'
                    {
                    match("real"); 


                    }
                    break;
                case 3 :
                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:159:25: 'bool'
                    {
                    match("bool"); 


                    }
                    break;
                case 4 :
                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:159:34: 'string'
                    {
                    match("string"); 


                    }
                    break;
                case 5 :
                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:159:45: 'chain'
                    {
                    match("chain"); 


                    }
                    break;
                case 6 :
                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:159:55: 'hex'
                    {
                    match("hex"); 


                    }
                    break;
                case 7 :
                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:159:63: 'void'
                    {
                    match("void"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:161:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( options {greedy=true; } : 'a' .. 'z' | 'A' .. 'Z' | '_' | '?' | '0' .. '9' )* )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:161:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( options {greedy=true; } : 'a' .. 'z' | 'A' .. 'Z' | '_' | '?' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:161:34: ( options {greedy=true; } : 'a' .. 'z' | 'A' .. 'Z' | '_' | '?' | '0' .. '9' )*
            loop2:
            do {
                int alt2=6;
                switch ( input.LA(1) ) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt2=1;
                    }
                    break;
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    {
                    alt2=2;
                    }
                    break;
                case '_':
                    {
                    alt2=3;
                    }
                    break;
                case '?':
                    {
                    alt2=4;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt2=5;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:161:58: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:161:67: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 3 :
            	    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:161:76: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 4 :
            	    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:161:80: '?'
            	    {
            	    match('?'); 

            	    }
            	    break;
            	case 5 :
            	    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:161:84: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:163:5: ( ( '0' .. '9' )+ )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:163:7: ( '0' .. '9' )+
            {
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:163:7: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:163:8: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:165:7: ( INT '.' INT )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:165:9: INT '.' INT
            {
            mINT(); 
            match('.'); 
            mINT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "HEX"
    public final void mHEX() throws RecognitionException {
        try {
            int _type = HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:167:5: ( '0x' ( '0' .. '9' | 'a' .. 'f' )+ )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:167:7: '0x' ( '0' .. '9' | 'a' .. 'f' )+
            {
            match("0x"); 

            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:167:12: ( '0' .. '9' | 'a' .. 'f' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='a' && LA4_0<='f')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
        }
    }
    // $ANTLR end "HEX"

    // $ANTLR start "NORMALSTRING"
    public final void mNORMALSTRING() throws RecognitionException {
        try {
            int _type = NORMALSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:169:13: ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:169:15: '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:169:18: ( EscapeSequence | ~ ( '\\\\' | '\"' ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\\') ) {
                    alt5=1;
                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:169:20: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:169:37: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
        }
    }
    // $ANTLR end "NORMALSTRING"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:173:2: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:173:4: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:176:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )+ )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:176:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )+
            {
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:176:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\t' && LA6_0<='\n')||(LA6_0>='\f' && LA6_0<='\r')||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:180:2: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:180:4: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:180:9: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:180:36: .
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
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:184:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:184:4: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:184:9: (~ ( '\\n' | '\\r' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:184:9: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:184:23: ( '\\r' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:184:23: '\\r'
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
        }
    }
    // $ANTLR end "LINE_COMMENT"

    public void mTokens() throws RecognitionException {
        // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:8: ( T__54 | T__55 | LPAREN | RPAREN | LBRACK | RBRACK | COLON | COMMA | SEMI | PLUS | MINUS | STAR | SLASH | POWER | LESS | GREATER | ASSIGN | PERCENT | LCURLY | RCURLY | EQUAL | NOTEQUAL | LESSEQUAL | GREATEREQUAL | DOT | AND | OR | NOT | TO | FORSTAT | REPEATSTAT | IFSTAT | ELSESTAT | ELSEIFSTAT | UNTILSTAT | DOSTAT | WITHSTAT | INSTAT | ENDSTAT | RETURNSTAT | CHESTSTAT | THENSTAT | TYPE | NAME | INT | FLOAT | HEX | NORMALSTRING | WS | COMMENT | LINE_COMMENT )
        int alt10=51;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:10: T__54
                {
                mT__54(); 

                }
                break;
            case 2 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:16: T__55
                {
                mT__55(); 

                }
                break;
            case 3 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:22: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 4 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:29: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 5 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:36: LBRACK
                {
                mLBRACK(); 

                }
                break;
            case 6 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:43: RBRACK
                {
                mRBRACK(); 

                }
                break;
            case 7 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:50: COLON
                {
                mCOLON(); 

                }
                break;
            case 8 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:56: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 9 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:62: SEMI
                {
                mSEMI(); 

                }
                break;
            case 10 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:67: PLUS
                {
                mPLUS(); 

                }
                break;
            case 11 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:72: MINUS
                {
                mMINUS(); 

                }
                break;
            case 12 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:78: STAR
                {
                mSTAR(); 

                }
                break;
            case 13 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:83: SLASH
                {
                mSLASH(); 

                }
                break;
            case 14 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:89: POWER
                {
                mPOWER(); 

                }
                break;
            case 15 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:95: LESS
                {
                mLESS(); 

                }
                break;
            case 16 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:100: GREATER
                {
                mGREATER(); 

                }
                break;
            case 17 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:108: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 18 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:115: PERCENT
                {
                mPERCENT(); 

                }
                break;
            case 19 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:123: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 20 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:130: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 21 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:137: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 22 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:143: NOTEQUAL
                {
                mNOTEQUAL(); 

                }
                break;
            case 23 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:152: LESSEQUAL
                {
                mLESSEQUAL(); 

                }
                break;
            case 24 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:162: GREATEREQUAL
                {
                mGREATEREQUAL(); 

                }
                break;
            case 25 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:175: DOT
                {
                mDOT(); 

                }
                break;
            case 26 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:179: AND
                {
                mAND(); 

                }
                break;
            case 27 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:183: OR
                {
                mOR(); 

                }
                break;
            case 28 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:186: NOT
                {
                mNOT(); 

                }
                break;
            case 29 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:190: TO
                {
                mTO(); 

                }
                break;
            case 30 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:193: FORSTAT
                {
                mFORSTAT(); 

                }
                break;
            case 31 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:201: REPEATSTAT
                {
                mREPEATSTAT(); 

                }
                break;
            case 32 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:212: IFSTAT
                {
                mIFSTAT(); 

                }
                break;
            case 33 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:219: ELSESTAT
                {
                mELSESTAT(); 

                }
                break;
            case 34 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:228: ELSEIFSTAT
                {
                mELSEIFSTAT(); 

                }
                break;
            case 35 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:239: UNTILSTAT
                {
                mUNTILSTAT(); 

                }
                break;
            case 36 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:249: DOSTAT
                {
                mDOSTAT(); 

                }
                break;
            case 37 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:256: WITHSTAT
                {
                mWITHSTAT(); 

                }
                break;
            case 38 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:265: INSTAT
                {
                mINSTAT(); 

                }
                break;
            case 39 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:272: ENDSTAT
                {
                mENDSTAT(); 

                }
                break;
            case 40 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:280: RETURNSTAT
                {
                mRETURNSTAT(); 

                }
                break;
            case 41 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:291: CHESTSTAT
                {
                mCHESTSTAT(); 

                }
                break;
            case 42 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:301: THENSTAT
                {
                mTHENSTAT(); 

                }
                break;
            case 43 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:310: TYPE
                {
                mTYPE(); 

                }
                break;
            case 44 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:315: NAME
                {
                mNAME(); 

                }
                break;
            case 45 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:320: INT
                {
                mINT(); 

                }
                break;
            case 46 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:324: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 47 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:330: HEX
                {
                mHEX(); 

                }
                break;
            case 48 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:334: NORMALSTRING
                {
                mNORMALSTRING(); 

                }
                break;
            case 49 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:347: WS
                {
                mWS(); 

                }
                break;
            case 50 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:350: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 51 :
                // /home/cesar/UFSC/Compiladores/FINAL/javax.g:1:358: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\2\44\12\uffff\1\57\1\uffff\1\62\1\64\1\66\3\uffff\1\70"+
        "\16\44\1\uffff\2\112\2\uffff\4\44\14\uffff\1\44\1\121\2\44\1\126"+
        "\1\130\3\44\1\135\6\44\3\uffff\1\44\1\146\2\44\1\151\1\uffff\1\152"+
        "\3\44\1\uffff\1\156\1\uffff\2\44\1\161\1\44\1\uffff\5\44\1\156\2"+
        "\44\1\uffff\1\172\1\173\2\uffff\2\44\1\156\1\uffff\1\176\1\177\1"+
        "\uffff\1\44\1\u0081\2\44\1\156\1\44\1\156\1\u0085\2\uffff\2\44\2"+
        "\uffff\1\u0088\1\uffff\1\u0089\1\156\1\44\1\uffff\1\u008b\1\u008c"+
        "\2\uffff\1\156\2\uffff";
    static final String DFA10_eofS =
        "\u008d\uffff";
    static final String DFA10_minS =
        "\1\11\1\141\1\150\12\uffff\1\52\1\uffff\3\75\3\uffff\1\56\1\156"+
        "\1\162\1\157\1\145\1\146\1\154\1\156\1\157\1\151\1\150\1\157\1\164"+
        "\1\145\1\157\1\uffff\2\56\2\uffff\1\154\1\162\1\165\1\145\14\uffff"+
        "\1\144\1\60\1\164\1\141\2\60\1\151\1\144\1\164\1\60\1\164\1\141"+
        "\1\157\1\162\1\170\1\151\3\uffff\1\163\1\60\1\145\1\156\1\60\1\uffff"+
        "\1\60\1\145\1\165\1\154\1\uffff\1\60\1\uffff\1\145\1\146\1\60\1"+
        "\151\1\uffff\1\150\1\163\1\151\1\154\1\151\1\60\1\144\1\145\1\uffff"+
        "\2\60\2\uffff\1\141\1\162\1\60\1\uffff\2\60\1\uffff\1\154\1\60\1"+
        "\164\1\156\1\60\1\156\2\60\2\uffff\1\164\1\156\2\uffff\1\60\1\uffff"+
        "\2\60\1\147\1\uffff\2\60\2\uffff\1\60\2\uffff";
    static final String DFA10_maxS =
        "\1\175\1\157\1\162\12\uffff\1\57\1\uffff\1\76\2\75\3\uffff\1\56"+
        "\1\156\1\162\1\157\1\145\3\156\1\157\1\151\1\150\1\157\1\164\1\145"+
        "\1\157\1\uffff\1\170\1\71\2\uffff\1\154\1\162\1\165\1\145\14\uffff"+
        "\1\144\1\172\2\164\2\172\1\163\1\144\1\164\1\172\1\164\1\145\1\157"+
        "\1\162\1\170\1\151\3\uffff\1\163\1\172\1\145\1\156\1\172\1\uffff"+
        "\1\172\1\145\1\165\1\154\1\uffff\1\172\1\uffff\1\145\1\146\1\172"+
        "\1\151\1\uffff\1\150\1\163\1\151\1\154\1\151\1\172\1\144\1\145\1"+
        "\uffff\2\172\2\uffff\1\141\1\162\1\172\1\uffff\2\172\1\uffff\1\154"+
        "\1\172\1\164\1\156\1\172\1\156\2\172\2\uffff\1\164\1\156\2\uffff"+
        "\1\172\1\uffff\2\172\1\147\1\uffff\2\172\2\uffff\1\172\2\uffff";
    static final String DFA10_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\uffff\1"+
        "\16\3\uffff\1\22\1\23\1\24\17\uffff\1\54\2\uffff\1\60\1\61\4\uffff"+
        "\1\62\1\63\1\15\1\26\1\27\1\17\1\30\1\20\1\25\1\21\1\35\1\31\20"+
        "\uffff\1\57\1\55\1\56\5\uffff\1\33\4\uffff\1\40\1\uffff\1\46\4\uffff"+
        "\1\44\10\uffff\1\36\2\uffff\1\32\1\34\3\uffff\1\53\2\uffff\1\47"+
        "\10\uffff\1\2\1\52\2\uffff\1\41\1\42\1\uffff\1\45\3\uffff\1\1\2"+
        "\uffff\1\43\1\51\1\uffff\1\37\1\50";
    static final String DFA10_specialS =
        "\u008d\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\50\1\uffff\2\50\22\uffff\1\50\1\uffff\1\47\2\uffff\1\22\2"+
            "\uffff\1\3\1\4\1\14\1\12\1\10\1\13\1\25\1\15\1\45\11\46\1\7"+
            "\1\11\1\17\1\21\1\20\2\uffff\32\44\1\5\1\uffff\1\6\1\16\1\44"+
            "\1\uffff\1\26\1\40\1\37\1\35\1\33\1\1\1\44\1\42\1\32\4\44\1"+
            "\30\1\27\2\44\1\31\1\41\1\2\1\34\1\43\1\36\3\44\1\23\1\uffff"+
            "\1\24",
            "\1\51\15\uffff\1\52",
            "\1\54\11\uffff\1\53",
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
            "\1\55\4\uffff\1\56",
            "",
            "\1\61\1\60",
            "\1\63",
            "\1\65",
            "",
            "",
            "",
            "\1\67",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75\7\uffff\1\76",
            "\1\77\1\uffff\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "\1\113\1\uffff\12\46\76\uffff\1\111",
            "\1\113\1\uffff\12\46",
            "",
            "",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
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
            "\1\120",
            "\12\44\5\uffff\1\44\1\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\122",
            "\1\125\16\uffff\1\123\3\uffff\1\124",
            "\12\44\5\uffff\1\44\1\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\5\uffff\1\44\1\uffff\32\44\4\uffff\1\44\1\uffff\23\44"+
            "\1\127\6\44",
            "\1\132\11\uffff\1\131",
            "\1\133",
            "\1\134",
            "\12\44\5\uffff\1\44\1\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\136",
            "\1\140\3\uffff\1\137",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "",
            "",
            "",
            "\1\145",
            "\12\44\5\uffff\1\44\1\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\147",
            "\1\150",
            "\12\44\5\uffff\1\44\1\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\5\uffff\1\44\1\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\153",
            "\1\154",
            "\1\155",
            "",
            "\12\44\5\uffff\1\44\1\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\157",
            "\1\160",
            "\12\44\5\uffff\1\44\1\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\162",
            "",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\12\44\5\uffff\1\44\1\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\170",
            "\1\171",
            "",
            "\12\44\5\uffff\1\44\1\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\5\uffff\1\44\1\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\1\174",
            "\1\175",
            "\12\44\5\uffff\1\44\1\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\5\uffff\1\44\1\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\5\uffff\1\44\1\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u0080",
            "\12\44\5\uffff\1\44\1\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0082",
            "\1\u0083",
            "\12\44\5\uffff\1\44\1\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0084",
            "\12\44\5\uffff\1\44\1\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\5\uffff\1\44\1\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\1\u0086",
            "\1\u0087",
            "",
            "",
            "\12\44\5\uffff\1\44\1\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\5\uffff\1\44\1\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\5\uffff\1\44\1\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u008a",
            "",
            "\12\44\5\uffff\1\44\1\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\5\uffff\1\44\1\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\12\44\5\uffff\1\44\1\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
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
            return "1:1: Tokens : ( T__54 | T__55 | LPAREN | RPAREN | LBRACK | RBRACK | COLON | COMMA | SEMI | PLUS | MINUS | STAR | SLASH | POWER | LESS | GREATER | ASSIGN | PERCENT | LCURLY | RCURLY | EQUAL | NOTEQUAL | LESSEQUAL | GREATEREQUAL | DOT | AND | OR | NOT | TO | FORSTAT | REPEATSTAT | IFSTAT | ELSESTAT | ELSEIFSTAT | UNTILSTAT | DOSTAT | WITHSTAT | INSTAT | ENDSTAT | RETURNSTAT | CHESTSTAT | THENSTAT | TYPE | NAME | INT | FLOAT | HEX | NORMALSTRING | WS | COMMENT | LINE_COMMENT );";
        }
    }
 

}