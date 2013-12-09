// Generated from javax.g by ANTLR 4.1

package Compilador;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class javaxLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, LBRACK=3, RBRACK=4, COLON=5, COMMA=6, SEMI=7, DOT=8, 
		PLUS=9, MINUS=10, STAR=11, SLASH=12, POWER=13, LESS=14, GREATER=15, ASSIGN=16, 
		PERCENT=17, LCURLY=18, RCURLY=19, EQUAL=20, NOTEQUAL=21, LESSEQUAL=22, 
		GREATEREQUAL=23, AND=24, OR=25, NOT=26, FALSE=27, TRUE=28, TO=29, FOR=30, 
		REPEAT=31, WHILE=32, IF=33, ELSE=34, ELSEIF=35, UNTIL=36, DO=37, WITH=38, 
		IN=39, END=40, RETURN=41, CHEST=42, THEN=43, T_INT=44, T_REAL=45, T_STRING=46, 
		T_CHAIN=47, T_VOID=48, T_BOOL=49, NAME=50, INT=51, FLOAT=52, NORMALSTRING=53, 
		WS=54, COMMENT=55, LINE_COMMENT=56;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'('", "')'", "'['", "']'", "':'", "','", "';'", "'.'", "'+'", "'-'", 
		"'*'", "'/'", "'^'", "'<'", "'>'", "'='", "'%'", "'{'", "'}'", "'=='", 
		"'<>'", "'<='", "'>='", "'and'", "'or'", "'not'", "'false'", "'true'", 
		"'..'", "'for'", "'repeat'", "'while'", "'if'", "'else'", "'elif'", "'until'", 
		"'do'", "'with'", "'in'", "'end'", "'return'", "'chest'", "'then'", "'int'", 
		"'real'", "'string'", "'chain'", "'void'", "'bool'", "NAME", "INT", "FLOAT", 
		"NORMALSTRING", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"LPAREN", "RPAREN", "LBRACK", "RBRACK", "COLON", "COMMA", "SEMI", "DOT", 
		"PLUS", "MINUS", "STAR", "SLASH", "POWER", "LESS", "GREATER", "ASSIGN", 
		"PERCENT", "LCURLY", "RCURLY", "EQUAL", "NOTEQUAL", "LESSEQUAL", "GREATEREQUAL", 
		"AND", "OR", "NOT", "FALSE", "TRUE", "TO", "FOR", "REPEAT", "WHILE", "IF", 
		"ELSE", "ELSEIF", "UNTIL", "DO", "WITH", "IN", "END", "RETURN", "CHEST", 
		"THEN", "T_INT", "T_REAL", "T_STRING", "T_CHAIN", "T_VOID", "T_BOOL", 
		"NAME", "INT", "FLOAT", "NORMALSTRING", "EscapeSequence", "WS", "COMMENT", 
		"LINE_COMMENT", "DIGIT", "LETTER", "LETTERL", "LETTERU"
	};


	/** Handles context-sensitive lexing of implicit line joining such as
	 *  the case where newline is ignored in cases like this:
	 *  a = [3,
	 *       4]
	 */
	int implicitLineJoiningLevel = 0;


	public javaxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "javax.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0: LPAREN_action((RuleContext)_localctx, actionIndex); break;

		case 1: RPAREN_action((RuleContext)_localctx, actionIndex); break;

		case 2: LBRACK_action((RuleContext)_localctx, actionIndex); break;

		case 3: RBRACK_action((RuleContext)_localctx, actionIndex); break;

		case 17: LCURLY_action((RuleContext)_localctx, actionIndex); break;

		case 18: RCURLY_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void RBRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: implicitLineJoiningLevel--; break;
		}
	}
	private void RPAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: implicitLineJoiningLevel--; break;
		}
	}
	private void LCURLY_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: implicitLineJoiningLevel++; break;
		}
	}
	private void LBRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: implicitLineJoiningLevel++; break;
		}
	}
	private void LPAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: implicitLineJoiningLevel++; break;
		}
	}
	private void RCURLY_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: implicitLineJoiningLevel--; break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2:\u017e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3"+
		"%\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3*"+
		"\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3.\3."+
		"\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\7\63\u0137\n\63"+
		"\f\63\16\63\u013a\13\63\3\64\6\64\u013d\n\64\r\64\16\64\u013e\3\65\6\65"+
		"\u0142\n\65\r\65\16\65\u0143\3\65\3\65\6\65\u0148\n\65\r\65\16\65\u0149"+
		"\3\66\3\66\3\66\7\66\u014f\n\66\f\66\16\66\u0152\13\66\3\66\3\66\3\67"+
		"\3\67\3\67\38\38\39\39\39\39\79\u015f\n9\f9\169\u0162\139\39\39\39\3:"+
		"\3:\3:\3:\7:\u016b\n:\f:\16:\u016e\13:\3:\5:\u0171\n:\3:\3:\3;\3;\3<\3"+
		"<\5<\u0179\n<\3=\3=\3>\3>\3\u0160?\3\3\2\5\4\3\7\5\4\t\6\5\13\7\1\r\b"+
		"\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1"+
		"!\22\1#\23\1%\24\6\'\25\7)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34"+
		"\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S"+
		"+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\64\1g\65\1i\66\1k\67\1m\2"+
		"\1o8\1q9\1s:\1u\2\1w\2\1y\2\1{\2\1\3\2\6\4\2$$^^\n\2$$))^^ddhhppttvv\5"+
		"\2\13\f\16\17\"\"\4\2\f\f\17\17\u0183\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3}\3\2\2"+
		"\2\5\u0080\3\2\2\2\7\u0083\3\2\2\2\t\u0086\3\2\2\2\13\u0089\3\2\2\2\r"+
		"\u008b\3\2\2\2\17\u008d\3\2\2\2\21\u008f\3\2\2\2\23\u0091\3\2\2\2\25\u0093"+
		"\3\2\2\2\27\u0095\3\2\2\2\31\u0097\3\2\2\2\33\u0099\3\2\2\2\35\u009b\3"+
		"\2\2\2\37\u009d\3\2\2\2!\u009f\3\2\2\2#\u00a1\3\2\2\2%\u00a3\3\2\2\2\'"+
		"\u00a6\3\2\2\2)\u00a9\3\2\2\2+\u00ac\3\2\2\2-\u00af\3\2\2\2/\u00b2\3\2"+
		"\2\2\61\u00b5\3\2\2\2\63\u00b9\3\2\2\2\65\u00bc\3\2\2\2\67\u00c0\3\2\2"+
		"\29\u00c6\3\2\2\2;\u00cb\3\2\2\2=\u00ce\3\2\2\2?\u00d2\3\2\2\2A\u00d9"+
		"\3\2\2\2C\u00df\3\2\2\2E\u00e2\3\2\2\2G\u00e7\3\2\2\2I\u00ec\3\2\2\2K"+
		"\u00f2\3\2\2\2M\u00f5\3\2\2\2O\u00fa\3\2\2\2Q\u00fd\3\2\2\2S\u0101\3\2"+
		"\2\2U\u0108\3\2\2\2W\u010e\3\2\2\2Y\u0113\3\2\2\2[\u0117\3\2\2\2]\u011c"+
		"\3\2\2\2_\u0123\3\2\2\2a\u0129\3\2\2\2c\u012e\3\2\2\2e\u0133\3\2\2\2g"+
		"\u013c\3\2\2\2i\u0141\3\2\2\2k\u014b\3\2\2\2m\u0155\3\2\2\2o\u0158\3\2"+
		"\2\2q\u015a\3\2\2\2s\u0166\3\2\2\2u\u0174\3\2\2\2w\u0178\3\2\2\2y\u017a"+
		"\3\2\2\2{\u017c\3\2\2\2}~\7*\2\2~\177\b\2\2\2\177\4\3\2\2\2\u0080\u0081"+
		"\7+\2\2\u0081\u0082\b\3\3\2\u0082\6\3\2\2\2\u0083\u0084\7]\2\2\u0084\u0085"+
		"\b\4\4\2\u0085\b\3\2\2\2\u0086\u0087\7_\2\2\u0087\u0088\b\5\5\2\u0088"+
		"\n\3\2\2\2\u0089\u008a\7<\2\2\u008a\f\3\2\2\2\u008b\u008c\7.\2\2\u008c"+
		"\16\3\2\2\2\u008d\u008e\7=\2\2\u008e\20\3\2\2\2\u008f\u0090\7\60\2\2\u0090"+
		"\22\3\2\2\2\u0091\u0092\7-\2\2\u0092\24\3\2\2\2\u0093\u0094\7/\2\2\u0094"+
		"\26\3\2\2\2\u0095\u0096\7,\2\2\u0096\30\3\2\2\2\u0097\u0098\7\61\2\2\u0098"+
		"\32\3\2\2\2\u0099\u009a\7`\2\2\u009a\34\3\2\2\2\u009b\u009c\7>\2\2\u009c"+
		"\36\3\2\2\2\u009d\u009e\7@\2\2\u009e \3\2\2\2\u009f\u00a0\7?\2\2\u00a0"+
		"\"\3\2\2\2\u00a1\u00a2\7\'\2\2\u00a2$\3\2\2\2\u00a3\u00a4\7}\2\2\u00a4"+
		"\u00a5\b\23\6\2\u00a5&\3\2\2\2\u00a6\u00a7\7\177\2\2\u00a7\u00a8\b\24"+
		"\7\2\u00a8(\3\2\2\2\u00a9\u00aa\7?\2\2\u00aa\u00ab\7?\2\2\u00ab*\3\2\2"+
		"\2\u00ac\u00ad\7>\2\2\u00ad\u00ae\7@\2\2\u00ae,\3\2\2\2\u00af\u00b0\7"+
		">\2\2\u00b0\u00b1\7?\2\2\u00b1.\3\2\2\2\u00b2\u00b3\7@\2\2\u00b3\u00b4"+
		"\7?\2\2\u00b4\60\3\2\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8"+
		"\7f\2\2\u00b8\62\3\2\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7t\2\2\u00bb\64"+
		"\3\2\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7v\2\2\u00bf"+
		"\66\3\2\2\2\u00c0\u00c1\7h\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7n\2\2\u00c3"+
		"\u00c4\7u\2\2\u00c4\u00c5\7g\2\2\u00c58\3\2\2\2\u00c6\u00c7\7v\2\2\u00c7"+
		"\u00c8\7t\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7g\2\2\u00ca:\3\2\2\2\u00cb"+
		"\u00cc\7\60\2\2\u00cc\u00cd\7\60\2\2\u00cd<\3\2\2\2\u00ce\u00cf\7h\2\2"+
		"\u00cf\u00d0\7q\2\2\u00d0\u00d1\7t\2\2\u00d1>\3\2\2\2\u00d2\u00d3\7t\2"+
		"\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7r\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7"+
		"\7c\2\2\u00d7\u00d8\7v\2\2\u00d8@\3\2\2\2\u00d9\u00da\7y\2\2\u00da\u00db"+
		"\7j\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7n\2\2\u00dd\u00de\7g\2\2\u00de"+
		"B\3\2\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7h\2\2\u00e1D\3\2\2\2\u00e2\u00e3"+
		"\7g\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5\7u\2\2\u00e5\u00e6\7g\2\2\u00e6"+
		"F\3\2\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ea\7k\2\2\u00ea"+
		"\u00eb\7h\2\2\u00ebH\3\2\2\2\u00ec\u00ed\7w\2\2\u00ed\u00ee\7p\2\2\u00ee"+
		"\u00ef\7v\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7n\2\2\u00f1J\3\2\2\2\u00f2"+
		"\u00f3\7f\2\2\u00f3\u00f4\7q\2\2\u00f4L\3\2\2\2\u00f5\u00f6\7y\2\2\u00f6"+
		"\u00f7\7k\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7j\2\2\u00f9N\3\2\2\2\u00fa"+
		"\u00fb\7k\2\2\u00fb\u00fc\7p\2\2\u00fcP\3\2\2\2\u00fd\u00fe\7g\2\2\u00fe"+
		"\u00ff\7p\2\2\u00ff\u0100\7f\2\2\u0100R\3\2\2\2\u0101\u0102\7t\2\2\u0102"+
		"\u0103\7g\2\2\u0103\u0104\7v\2\2\u0104\u0105\7w\2\2\u0105\u0106\7t\2\2"+
		"\u0106\u0107\7p\2\2\u0107T\3\2\2\2\u0108\u0109\7e\2\2\u0109\u010a\7j\2"+
		"\2\u010a\u010b\7g\2\2\u010b\u010c\7u\2\2\u010c\u010d\7v\2\2\u010dV\3\2"+
		"\2\2\u010e\u010f\7v\2\2\u010f\u0110\7j\2\2\u0110\u0111\7g\2\2\u0111\u0112"+
		"\7p\2\2\u0112X\3\2\2\2\u0113\u0114\7k\2\2\u0114\u0115\7p\2\2\u0115\u0116"+
		"\7v\2\2\u0116Z\3\2\2\2\u0117\u0118\7t\2\2\u0118\u0119\7g\2\2\u0119\u011a"+
		"\7c\2\2\u011a\u011b\7n\2\2\u011b\\\3\2\2\2\u011c\u011d\7u\2\2\u011d\u011e"+
		"\7v\2\2\u011e\u011f\7t\2\2\u011f\u0120\7k\2\2\u0120\u0121\7p\2\2\u0121"+
		"\u0122\7i\2\2\u0122^\3\2\2\2\u0123\u0124\7e\2\2\u0124\u0125\7j\2\2\u0125"+
		"\u0126\7c\2\2\u0126\u0127\7k\2\2\u0127\u0128\7p\2\2\u0128`\3\2\2\2\u0129"+
		"\u012a\7x\2\2\u012a\u012b\7q\2\2\u012b\u012c\7k\2\2\u012c\u012d\7f\2\2"+
		"\u012db\3\2\2\2\u012e\u012f\7d\2\2\u012f\u0130\7q\2\2\u0130\u0131\7q\2"+
		"\2\u0131\u0132\7n\2\2\u0132d\3\2\2\2\u0133\u0138\5w<\2\u0134\u0137\5w"+
		"<\2\u0135\u0137\5u;\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137\u013a"+
		"\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139f\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013b\u013d\5u;\2\u013c\u013b\3\2\2\2\u013d\u013e\3\2\2"+
		"\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013fh\3\2\2\2\u0140\u0142"+
		"\5u;\2\u0141\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0141\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\7\60\2\2\u0146\u0148\5"+
		"u;\2\u0147\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014aj\3\2\2\2\u014b\u0150\7$\2\2\u014c\u014f\5m\67\2\u014d"+
		"\u014f\n\2\2\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2"+
		"\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0153\u0154\7$\2\2\u0154l\3\2\2\2\u0155\u0156\7^\2\2\u0156"+
		"\u0157\t\3\2\2\u0157n\3\2\2\2\u0158\u0159\t\4\2\2\u0159p\3\2\2\2\u015a"+
		"\u015b\7\61\2\2\u015b\u015c\7,\2\2\u015c\u0160\3\2\2\2\u015d\u015f\13"+
		"\2\2\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u0161\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\7,"+
		"\2\2\u0164\u0165\7\61\2\2\u0165r\3\2\2\2\u0166\u0167\7\61\2\2\u0167\u0168"+
		"\7\61\2\2\u0168\u016c\3\2\2\2\u0169\u016b\n\5\2\2\u016a\u0169\3\2\2\2"+
		"\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0170"+
		"\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0171\7\17\2\2\u0170\u016f\3\2\2\2"+
		"\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\7\f\2\2\u0173t\3"+
		"\2\2\2\u0174\u0175\4\62;\2\u0175v\3\2\2\2\u0176\u0179\5y=\2\u0177\u0179"+
		"\5{>\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179x\3\2\2\2\u017a\u017b"+
		"\4c|\2\u017bz\3\2\2\2\u017c\u017d\4C\\\2\u017d|\3\2\2\2\16\2\u0136\u0138"+
		"\u013e\u0143\u0149\u014e\u0150\u0160\u016c\u0170\u0178";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}