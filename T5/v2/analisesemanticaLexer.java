// Generated from analisesemantica.g by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class analisesemanticaLexer extends Lexer {
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
		T_CHAIN=47, T_VOID=48, T_BOOL=49, NAME=50, INT=51, STRING=52, TI=53, COMMENT=54;
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
		"'real'", "'string'", "'chain'", "'void'", "'bool'", "NAME", "INT", "STRING", 
		"TI", "COMMENT"
	};
	public static final String[] ruleNames = {
		"LPAREN", "RPAREN", "LBRACK", "RBRACK", "COLON", "COMMA", "SEMI", "DOT", 
		"PLUS", "MINUS", "STAR", "SLASH", "POWER", "LESS", "GREATER", "ASSIGN", 
		"PERCENT", "LCURLY", "RCURLY", "EQUAL", "NOTEQUAL", "LESSEQUAL", "GREATEREQUAL", 
		"AND", "OR", "NOT", "FALSE", "TRUE", "TO", "FOR", "REPEAT", "WHILE", "IF", 
		"ELSE", "ELSEIF", "UNTIL", "DO", "WITH", "IN", "END", "RETURN", "CHEST", 
		"THEN", "T_INT", "T_REAL", "T_STRING", "T_CHAIN", "T_VOID", "T_BOOL", 
		"NAME", "INT", "STRING", "EscapeSequence", "TI", "COMMENT", "CHAR"
	};


	public analisesemanticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "analisesemantica.g"; }

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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\28\u015d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3"+
		"+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3"+
		"\62\3\62\3\63\3\63\3\63\7\63\u012d\n\63\f\63\16\63\u0130\13\63\3\64\6"+
		"\64\u0133\n\64\r\64\16\64\u0134\3\65\3\65\3\65\7\65\u013a\n\65\f\65\16"+
		"\65\u013d\13\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\38\38\38\38\78\u014a"+
		"\n8\f8\168\u014d\138\38\38\38\38\38\38\78\u0155\n8\f8\168\u0158\138\5"+
		"8\u015a\n8\39\39\4\u014b\u0156:\3\3\2\5\4\3\7\5\4\t\6\5\13\7\1\r\b\1\17"+
		"\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22"+
		"\1#\23\1%\24\6\'\25\7)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1"+
		"\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1"+
		"U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\64\1g\65\1i\66\1k\2\1m\67\1"+
		"o8\1q\2\1\3\2\7\3\2\62;\4\2$$^^\n\2$$))^^ddhhppttvv\5\2\13\f\16\17\"\""+
		"\4\2C\\c|\u0162\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2m\3"+
		"\2\2\2\2o\3\2\2\2\3s\3\2\2\2\5v\3\2\2\2\7y\3\2\2\2\t|\3\2\2\2\13\177\3"+
		"\2\2\2\r\u0081\3\2\2\2\17\u0083\3\2\2\2\21\u0085\3\2\2\2\23\u0087\3\2"+
		"\2\2\25\u0089\3\2\2\2\27\u008b\3\2\2\2\31\u008d\3\2\2\2\33\u008f\3\2\2"+
		"\2\35\u0091\3\2\2\2\37\u0093\3\2\2\2!\u0095\3\2\2\2#\u0097\3\2\2\2%\u0099"+
		"\3\2\2\2\'\u009c\3\2\2\2)\u009f\3\2\2\2+\u00a2\3\2\2\2-\u00a5\3\2\2\2"+
		"/\u00a8\3\2\2\2\61\u00ab\3\2\2\2\63\u00af\3\2\2\2\65\u00b2\3\2\2\2\67"+
		"\u00b6\3\2\2\29\u00bc\3\2\2\2;\u00c1\3\2\2\2=\u00c4\3\2\2\2?\u00c8\3\2"+
		"\2\2A\u00cf\3\2\2\2C\u00d5\3\2\2\2E\u00d8\3\2\2\2G\u00dd\3\2\2\2I\u00e2"+
		"\3\2\2\2K\u00e8\3\2\2\2M\u00eb\3\2\2\2O\u00f0\3\2\2\2Q\u00f3\3\2\2\2S"+
		"\u00f7\3\2\2\2U\u00fe\3\2\2\2W\u0104\3\2\2\2Y\u0109\3\2\2\2[\u010d\3\2"+
		"\2\2]\u0112\3\2\2\2_\u0119\3\2\2\2a\u011f\3\2\2\2c\u0124\3\2\2\2e\u0129"+
		"\3\2\2\2g\u0132\3\2\2\2i\u0136\3\2\2\2k\u0140\3\2\2\2m\u0143\3\2\2\2o"+
		"\u0159\3\2\2\2q\u015b\3\2\2\2st\7*\2\2tu\b\2\2\2u\4\3\2\2\2vw\7+\2\2w"+
		"x\b\3\3\2x\6\3\2\2\2yz\7]\2\2z{\b\4\4\2{\b\3\2\2\2|}\7_\2\2}~\b\5\5\2"+
		"~\n\3\2\2\2\177\u0080\7<\2\2\u0080\f\3\2\2\2\u0081\u0082\7.\2\2\u0082"+
		"\16\3\2\2\2\u0083\u0084\7=\2\2\u0084\20\3\2\2\2\u0085\u0086\7\60\2\2\u0086"+
		"\22\3\2\2\2\u0087\u0088\7-\2\2\u0088\24\3\2\2\2\u0089\u008a\7/\2\2\u008a"+
		"\26\3\2\2\2\u008b\u008c\7,\2\2\u008c\30\3\2\2\2\u008d\u008e\7\61\2\2\u008e"+
		"\32\3\2\2\2\u008f\u0090\7`\2\2\u0090\34\3\2\2\2\u0091\u0092\7>\2\2\u0092"+
		"\36\3\2\2\2\u0093\u0094\7@\2\2\u0094 \3\2\2\2\u0095\u0096\7?\2\2\u0096"+
		"\"\3\2\2\2\u0097\u0098\7\'\2\2\u0098$\3\2\2\2\u0099\u009a\7}\2\2\u009a"+
		"\u009b\b\23\6\2\u009b&\3\2\2\2\u009c\u009d\7\177\2\2\u009d\u009e\b\24"+
		"\7\2\u009e(\3\2\2\2\u009f\u00a0\7?\2\2\u00a0\u00a1\7?\2\2\u00a1*\3\2\2"+
		"\2\u00a2\u00a3\7>\2\2\u00a3\u00a4\7@\2\2\u00a4,\3\2\2\2\u00a5\u00a6\7"+
		">\2\2\u00a6\u00a7\7?\2\2\u00a7.\3\2\2\2\u00a8\u00a9\7@\2\2\u00a9\u00aa"+
		"\7?\2\2\u00aa\60\3\2\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae"+
		"\7f\2\2\u00ae\62\3\2\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7t\2\2\u00b1\64"+
		"\3\2\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7v\2\2\u00b5"+
		"\66\3\2\2\2\u00b6\u00b7\7h\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7n\2\2\u00b9"+
		"\u00ba\7u\2\2\u00ba\u00bb\7g\2\2\u00bb8\3\2\2\2\u00bc\u00bd\7v\2\2\u00bd"+
		"\u00be\7t\2\2\u00be\u00bf\7w\2\2\u00bf\u00c0\7g\2\2\u00c0:\3\2\2\2\u00c1"+
		"\u00c2\7\60\2\2\u00c2\u00c3\7\60\2\2\u00c3<\3\2\2\2\u00c4\u00c5\7h\2\2"+
		"\u00c5\u00c6\7q\2\2\u00c6\u00c7\7t\2\2\u00c7>\3\2\2\2\u00c8\u00c9\7t\2"+
		"\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7r\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd"+
		"\7c\2\2\u00cd\u00ce\7v\2\2\u00ce@\3\2\2\2\u00cf\u00d0\7y\2\2\u00d0\u00d1"+
		"\7j\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7g\2\2\u00d4"+
		"B\3\2\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7h\2\2\u00d7D\3\2\2\2\u00d8\u00d9"+
		"\7g\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7u\2\2\u00db\u00dc\7g\2\2\u00dc"+
		"F\3\2\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7k\2\2\u00e0"+
		"\u00e1\7h\2\2\u00e1H\3\2\2\2\u00e2\u00e3\7w\2\2\u00e3\u00e4\7p\2\2\u00e4"+
		"\u00e5\7v\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7n\2\2\u00e7J\3\2\2\2\u00e8"+
		"\u00e9\7f\2\2\u00e9\u00ea\7q\2\2\u00eaL\3\2\2\2\u00eb\u00ec\7y\2\2\u00ec"+
		"\u00ed\7k\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7j\2\2\u00efN\3\2\2\2\u00f0"+
		"\u00f1\7k\2\2\u00f1\u00f2\7p\2\2\u00f2P\3\2\2\2\u00f3\u00f4\7g\2\2\u00f4"+
		"\u00f5\7p\2\2\u00f5\u00f6\7f\2\2\u00f6R\3\2\2\2\u00f7\u00f8\7t\2\2\u00f8"+
		"\u00f9\7g\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb\7w\2\2\u00fb\u00fc\7t\2\2"+
		"\u00fc\u00fd\7p\2\2\u00fdT\3\2\2\2\u00fe\u00ff\7e\2\2\u00ff\u0100\7j\2"+
		"\2\u0100\u0101\7g\2\2\u0101\u0102\7u\2\2\u0102\u0103\7v\2\2\u0103V\3\2"+
		"\2\2\u0104\u0105\7v\2\2\u0105\u0106\7j\2\2\u0106\u0107\7g\2\2\u0107\u0108"+
		"\7p\2\2\u0108X\3\2\2\2\u0109\u010a\7k\2\2\u010a\u010b\7p\2\2\u010b\u010c"+
		"\7v\2\2\u010cZ\3\2\2\2\u010d\u010e\7t\2\2\u010e\u010f\7g\2\2\u010f\u0110"+
		"\7c\2\2\u0110\u0111\7n\2\2\u0111\\\3\2\2\2\u0112\u0113\7u\2\2\u0113\u0114"+
		"\7v\2\2\u0114\u0115\7t\2\2\u0115\u0116\7k\2\2\u0116\u0117\7p\2\2\u0117"+
		"\u0118\7i\2\2\u0118^\3\2\2\2\u0119\u011a\7e\2\2\u011a\u011b\7j\2\2\u011b"+
		"\u011c\7c\2\2\u011c\u011d\7k\2\2\u011d\u011e\7p\2\2\u011e`\3\2\2\2\u011f"+
		"\u0120\7x\2\2\u0120\u0121\7q\2\2\u0121\u0122\7k\2\2\u0122\u0123\7f\2\2"+
		"\u0123b\3\2\2\2\u0124\u0125\7d\2\2\u0125\u0126\7q\2\2\u0126\u0127\7q\2"+
		"\2\u0127\u0128\7n\2\2\u0128d\3\2\2\2\u0129\u012e\5q9\2\u012a\u012d\5q"+
		"9\2\u012b\u012d\5g\64\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d"+
		"\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012ff\3\2\2\2"+
		"\u0130\u012e\3\2\2\2\u0131\u0133\t\2\2\2\u0132\u0131\3\2\2\2\u0133\u0134"+
		"\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135h\3\2\2\2\u0136"+
		"\u013b\7$\2\2\u0137\u013a\5k\66\2\u0138\u013a\n\3\2\2\u0139\u0137\3\2"+
		"\2\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\7$"+
		"\2\2\u013fj\3\2\2\2\u0140\u0141\7^\2\2\u0141\u0142\t\4\2\2\u0142l\3\2"+
		"\2\2\u0143\u0144\t\5\2\2\u0144n\3\2\2\2\u0145\u0146\7\61\2\2\u0146\u0147"+
		"\7,\2\2\u0147\u014b\3\2\2\2\u0148\u014a\13\2\2\2\u0149\u0148\3\2\2\2\u014a"+
		"\u014d\3\2\2\2\u014b\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014e\3\2"+
		"\2\2\u014d\u014b\3\2\2\2\u014e\u014f\7,\2\2\u014f\u015a\7\61\2\2\u0150"+
		"\u0151\7\61\2\2\u0151\u0152\7\61\2\2\u0152\u0156\3\2\2\2\u0153\u0155\13"+
		"\2\2\2\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0157\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u0145\3\2"+
		"\2\2\u0159\u0150\3\2\2\2\u015ap\3\2\2\2\u015b\u015c\t\6\2\2\u015cr\3\2"+
		"\2\2\13\2\u012c\u012e\u0134\u0139\u013b\u014b\u0156\u0159";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}