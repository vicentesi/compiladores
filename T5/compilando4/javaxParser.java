// Generated from javax.g by ANTLR 4.1

package Compilador;
import Compilador.Semanticator;
import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class javaxParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "'('", "')'", "'['", "']'", "':'", "','", "';'", "'.'", "'+'", 
		"'-'", "'*'", "'/'", "'^'", "'<'", "'>'", "'='", "'%'", "'{'", "'}'", 
		"'=='", "'<>'", "'<='", "'>='", "'and'", "'or'", "'not'", "'false'", "'true'", 
		"'..'", "'for'", "'repeat'", "'while'", "'if'", "'else'", "'elif'", "'until'", 
		"'do'", "'with'", "'in'", "'end'", "'return'", "'chest'", "'then'", "'int'", 
		"'real'", "'string'", "'chain'", "'void'", "'bool'", "NAME", "INT", "FLOAT", 
		"NORMALSTRING", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_javax = 0, RULE_stat = 1, RULE_weakstat = 2, RULE_varatrib = 3, RULE_vardecl = 4, 
		RULE_funccall = 5, RULE_def_func = 6, RULE_def_if = 7, RULE_def_repeat = 8, 
		RULE_def_chest = 9, RULE_def_while = 10, RULE_type = 11, RULE_term = 12, 
		RULE_unary_op_expr = 13, RULE_strong_op_expr = 14, RULE_weak_op_expr = 15, 
		RULE_relational_op_expr = 16, RULE_logic_op_expr = 17, RULE_typedarglist = 18, 
		RULE_chestaccess = 19, RULE_def_return = 20, RULE_arglist = 21, RULE_variable = 22, 
		RULE_number = 23, RULE_string = 24;
	public static final String[] ruleNames = {
		"javax", "stat", "weakstat", "varatrib", "vardecl", "funccall", "def_func", 
		"def_if", "def_repeat", "def_chest", "def_while", "type", "term", "unary_op_expr", 
		"strong_op_expr", "weak_op_expr", "relational_op_expr", "logic_op_expr", 
		"typedarglist", "chestaccess", "def_return", "arglist", "variable", "number", 
		"string"
	};

	@Override
	public String getGrammarFileName() { return "javax.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


	Semanticator s = new Semanticator(this);

	public javaxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class JavaxContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(javaxParser.SEMI); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public TerminalNode SEMI(int i) {
			return getToken(javaxParser.SEMI, i);
		}
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public JavaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).enterJavax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).exitJavax(this);
		}
	}

	public final JavaxContext javax() throws RecognitionException {
		JavaxContext _localctx = new JavaxContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_javax);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(50); vardecl();
						setState(51); match(SEMI);
						}
						} 
					}
					setState(57);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				{
				setState(58); stat();
				}
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHEST) | (1L << T_INT) | (1L << T_REAL) | (1L << T_STRING) | (1L << T_CHAIN) | (1L << T_VOID) | (1L << T_BOOL))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public Def_chestContext def_chest() {
			return getRuleContext(Def_chestContext.class,0);
		}
		public Def_funcContext def_func() {
			return getRuleContext(Def_funcContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(65);
			switch (_input.LA(1)) {
			case T_INT:
			case T_REAL:
			case T_STRING:
			case T_CHAIN:
			case T_VOID:
			case T_BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(63); def_func();
				}
				break;
			case CHEST:
				enterOuterAlt(_localctx, 2);
				{
				setState(64); def_chest();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WeakstatContext extends ParserRuleContext {
		public String typeS;
		public Def_returnContext t;
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public Def_whileContext def_while() {
			return getRuleContext(Def_whileContext.class,0);
		}
		public Def_ifContext def_if() {
			return getRuleContext(Def_ifContext.class,0);
		}
		public Def_repeatContext def_repeat() {
			return getRuleContext(Def_repeatContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(javaxParser.SEMI, 0); }
		public Def_returnContext def_return() {
			return getRuleContext(Def_returnContext.class,0);
		}
		public ChestaccessContext chestaccess() {
			return getRuleContext(ChestaccessContext.class,0);
		}
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public VaratribContext varatrib() {
			return getRuleContext(VaratribContext.class,0);
		}
		public WeakstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weakstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).enterWeakstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).exitWeakstat(this);
		}
	}

	public final WeakstatContext weakstat() throws RecognitionException {
		WeakstatContext _localctx = new WeakstatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_weakstat);
		try {
			setState(86);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67); varatrib();
				setState(68); match(SEMI);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70); vardecl();
				setState(71); match(SEMI);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73); funccall();
				setState(74); match(SEMI);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(76); def_if();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(77); def_while();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(78); ((WeakstatContext)_localctx).t = def_return();
				((WeakstatContext)_localctx).typeS = t;
				setState(80); match(SEMI);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(82); chestaccess();
				setState(83); match(SEMI);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(85); def_repeat();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VaratribContext extends ParserRuleContext {
		public Token n;
		public Logic_op_exprContext t;
		public TerminalNode ASSIGN() { return getToken(javaxParser.ASSIGN, 0); }
		public TerminalNode NAME() { return getToken(javaxParser.NAME, 0); }
		public Logic_op_exprContext logic_op_expr() {
			return getRuleContext(Logic_op_exprContext.class,0);
		}
		public VaratribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varatrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).enterVaratrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).exitVaratrib(this);
		}
	}

	public final VaratribContext varatrib() throws RecognitionException {
		VaratribContext _localctx = new VaratribContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varatrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); ((VaratribContext)_localctx).n = match(NAME);
			setState(89); match(ASSIGN);
			setState(90); ((VaratribContext)_localctx).t = logic_op_expr();
			 s.eval_assign(s.get_type(n.getText()), t, n); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VardeclContext extends ParserRuleContext {
		public TypeContext t;
		public Token v;
		public TerminalNode NAME(int i) {
			return getToken(javaxParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(javaxParser.COMMA); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NAME() { return getTokens(javaxParser.NAME); }
		public TerminalNode COMMA(int i) {
			return getToken(javaxParser.COMMA, i);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).exitVardecl(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vardecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); ((VardeclContext)_localctx).t = type();
			setState(94); ((VardeclContext)_localctx).v = match(NAME);
			 s.add_variable(v.getText(), t);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(96); match(COMMA);
				setState(97); ((VardeclContext)_localctx).v = match(NAME);
				 s.add_variable(v.getText(), t);
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunccallContext extends ParserRuleContext {
		public String typeS;
		public Token n;
		public ArglistContext h;
		public TerminalNode RPAREN() { return getToken(javaxParser.RPAREN, 0); }
		public TerminalNode NAME() { return getToken(javaxParser.NAME, 0); }
		public TerminalNode LPAREN() { return getToken(javaxParser.LPAREN, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public FunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).enterFunccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).exitFunccall(this);
		}
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funccall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); ((FunccallContext)_localctx).n = match(NAME);
			setState(105); match(LPAREN);
			setState(106); ((FunccallContext)_localctx).h = arglist();
			setState(107); match(RPAREN);
			 ((FunccallContext)_localctx).typeS = s.eval_funccall(n.getText(), h);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Def_funcContext extends ParserRuleContext {
		public TypeContext t;
		public Token n;
		public TypedarglistContext h;
		public WeakstatContext tw;
		public TypedarglistContext typedarglist() {
			return getRuleContext(TypedarglistContext.class,0);
		}
		public List<WeakstatContext> weakstat() {
			return getRuleContexts(WeakstatContext.class);
		}
		public TerminalNode RPAREN() { return getToken(javaxParser.RPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NAME() { return getToken(javaxParser.NAME, 0); }
		public WeakstatContext weakstat(int i) {
			return getRuleContext(WeakstatContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(javaxParser.LPAREN, 0); }
		public TerminalNode END() { return getToken(javaxParser.END, 0); }
		public Def_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).enterDef_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).exitDef_func(this);
		}
	}

	public final Def_funcContext def_func() throws RecognitionException {
		Def_funcContext _localctx = new Def_funcContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_def_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); ((Def_funcContext)_localctx).t = type();
			setState(111); ((Def_funcContext)_localctx).n = match(NAME);
			setState(112); match(LPAREN);
			setState(113); ((Def_funcContext)_localctx).h = typedarglist();
			setState(114); match(RPAREN);
			s.open_function_decl(t,h,n.getText());
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REPEAT) | (1L << WHILE) | (1L << IF) | (1L << RETURN) | (1L << T_INT) | (1L << T_REAL) | (1L << T_STRING) | (1L << T_CHAIN) | (1L << T_VOID) | (1L << T_BOOL) | (1L << NAME))) != 0)) {
				{
				{
				setState(116); ((Def_funcContext)_localctx).tw = weakstat();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			s.close_function_decl(tw);
			setState(123); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Def_ifContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(javaxParser.THEN, 0); }
		public TerminalNode IF() { return getToken(javaxParser.IF, 0); }
		public List<WeakstatContext> weakstat() {
			return getRuleContexts(WeakstatContext.class);
		}
		public TerminalNode ELSE() { return getToken(javaxParser.ELSE, 0); }
		public WeakstatContext weakstat(int i) {
			return getRuleContext(WeakstatContext.class,i);
		}
		public TerminalNode END() { return getToken(javaxParser.END, 0); }
		public Logic_op_exprContext logic_op_expr() {
			return getRuleContext(Logic_op_exprContext.class,0);
		}
		public Def_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).enterDef_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).exitDef_if(this);
		}
	}

	public final Def_ifContext def_if() throws RecognitionException {
		Def_ifContext _localctx = new Def_ifContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_def_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); match(IF);
			setState(126); logic_op_expr();
			setState(127); match(THEN);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REPEAT) | (1L << WHILE) | (1L << IF) | (1L << RETURN) | (1L << T_INT) | (1L << T_REAL) | (1L << T_STRING) | (1L << T_CHAIN) | (1L << T_VOID) | (1L << T_BOOL) | (1L << NAME))) != 0)) {
				{
				{
				setState(128); weakstat();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			switch (_input.LA(1)) {
			case END:
				{
				setState(134); match(END);
				}
				break;
			case ELSE:
				{
				{
				setState(135); match(ELSE);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REPEAT) | (1L << WHILE) | (1L << IF) | (1L << RETURN) | (1L << T_INT) | (1L << T_REAL) | (1L << T_STRING) | (1L << T_CHAIN) | (1L << T_VOID) | (1L << T_BOOL) | (1L << NAME))) != 0)) {
					{
					{
					setState(136); weakstat();
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(142); match(END);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Def_repeatContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(javaxParser.REPEAT, 0); }
		public List<WeakstatContext> weakstat() {
			return getRuleContexts(WeakstatContext.class);
		}
		public TerminalNode RPAREN() { return getToken(javaxParser.RPAREN, 0); }
		public TerminalNode UNTIL() { return getToken(javaxParser.UNTIL, 0); }
		public WeakstatContext weakstat(int i) {
			return getRuleContext(WeakstatContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(javaxParser.LPAREN, 0); }
		public TerminalNode END() { return getToken(javaxParser.END, 0); }
		public Logic_op_exprContext logic_op_expr() {
			return getRuleContext(Logic_op_exprContext.class,0);
		}
		public Def_repeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).enterDef_repeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).exitDef_repeat(this);
		}
	}

	public final Def_repeatContext def_repeat() throws RecognitionException {
		Def_repeatContext _localctx = new Def_repeatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_def_repeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); match(REPEAT);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REPEAT) | (1L << WHILE) | (1L << IF) | (1L << RETURN) | (1L << T_INT) | (1L << T_REAL) | (1L << T_STRING) | (1L << T_CHAIN) | (1L << T_VOID) | (1L << T_BOOL) | (1L << NAME))) != 0)) {
				{
				{
				setState(146); weakstat();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152); match(UNTIL);
			setState(153); match(LPAREN);
			setState(154); logic_op_expr();
			setState(155); match(RPAREN);
			setState(156); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Def_chestContext extends ParserRuleContext {
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public FunccallContext funccall(int i) {
			return getRuleContext(FunccallContext.class,i);
		}
		public List<FunccallContext> funccall() {
			return getRuleContexts(FunccallContext.class);
		}
		public List<TerminalNode> SEMI() { return getTokens(javaxParser.SEMI); }
		public TerminalNode CHEST() { return getToken(javaxParser.CHEST, 0); }
		public TerminalNode NAME() { return getToken(javaxParser.NAME, 0); }
		public TerminalNode SEMI(int i) {
			return getToken(javaxParser.SEMI, i);
		}
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public TerminalNode COLON() { return getToken(javaxParser.COLON, 0); }
		public TerminalNode END() { return getToken(javaxParser.END, 0); }
		public Def_chestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_chest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).enterDef_chest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).exitDef_chest(this);
		}
	}

	public final Def_chestContext def_chest() throws RecognitionException {
		Def_chestContext _localctx = new Def_chestContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_def_chest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); match(CHEST);
			setState(159); match(NAME);
			setState(160); match(COLON);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_INT) | (1L << T_REAL) | (1L << T_STRING) | (1L << T_CHAIN) | (1L << T_VOID) | (1L << T_BOOL) | (1L << NAME))) != 0)) {
				{
				setState(167);
				switch (_input.LA(1)) {
				case T_INT:
				case T_REAL:
				case T_STRING:
				case T_CHAIN:
				case T_VOID:
				case T_BOOL:
					{
					setState(161); vardecl();
					setState(162); match(SEMI);
					}
					break;
				case NAME:
					{
					setState(164); funccall();
					setState(165); match(SEMI);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Def_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(javaxParser.WHILE, 0); }
		public List<WeakstatContext> weakstat() {
			return getRuleContexts(WeakstatContext.class);
		}
		public TerminalNode RPAREN() { return getToken(javaxParser.RPAREN, 0); }
		public WeakstatContext weakstat(int i) {
			return getRuleContext(WeakstatContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(javaxParser.LPAREN, 0); }
		public TerminalNode END() { return getToken(javaxParser.END, 0); }
		public Logic_op_exprContext logic_op_expr() {
			return getRuleContext(Logic_op_exprContext.class,0);
		}
		public Def_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).enterDef_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).exitDef_while(this);
		}
	}

	public final Def_whileContext def_while() throws RecognitionException {
		Def_whileContext _localctx = new Def_whileContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_def_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174); match(WHILE);
			setState(175); match(LPAREN);
			setState(176); logic_op_expr();
			setState(177); match(RPAREN);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REPEAT) | (1L << WHILE) | (1L << IF) | (1L << RETURN) | (1L << T_INT) | (1L << T_REAL) | (1L << T_STRING) | (1L << T_CHAIN) | (1L << T_VOID) | (1L << T_BOOL) | (1L << NAME))) != 0)) {
				{
				{
				setState(178); weakstat();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public String typeS;
		public TerminalNode T_CHAIN() { return getToken(javaxParser.T_CHAIN, 0); }
		public TerminalNode T_INT() { return getToken(javaxParser.T_INT, 0); }
		public TerminalNode T_STRING() { return getToken(javaxParser.T_STRING, 0); }
		public TerminalNode T_REAL() { return getToken(javaxParser.T_REAL, 0); }
		public TerminalNode T_VOID() { return getToken(javaxParser.T_VOID, 0); }
		public TerminalNode T_BOOL() { return getToken(javaxParser.T_BOOL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		try {
			setState(198);
			switch (_input.LA(1)) {
			case T_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(186); match(T_INT);
				 ((TypeContext)_localctx).typeS =  "Integer"; 
				}
				break;
			case T_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(188); match(T_REAL);
				 ((TypeContext)_localctx).typeS =  "Real"; 
				}
				break;
			case T_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(190); match(T_STRING);
				 ((TypeContext)_localctx).typeS =  "String"; 
				}
				break;
			case T_BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(192); match(T_BOOL);
				 ((TypeContext)_localctx).typeS =  "Boolean"; 
				}
				break;
			case T_VOID:
				enterOuterAlt(_localctx, 5);
				{
				setState(194); match(T_VOID);
				 ((TypeContext)_localctx).typeS =  "Void"; 
				}
				break;
			case T_CHAIN:
				enterOuterAlt(_localctx, 6);
				{
				setState(196); match(T_CHAIN);
				 ((TypeContext)_localctx).typeS =  "Chain"; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public String typeS;
		public VariableContext v;
		public FunccallContext f;
		public NumberContext n;
		public StringContext str;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_term);
		try {
			setState(212);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200); ((TermContext)_localctx).v = variable();
				 ((TermContext)_localctx).typeS =  s.get_type(v); 
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203); ((TermContext)_localctx).f = funccall();
				 ((TermContext)_localctx).typeS =  f;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(206); ((TermContext)_localctx).n = number();
				 ((TermContext)_localctx).typeS =  n; 
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(209); ((TermContext)_localctx).str = string();
				 ((TermContext)_localctx).typeS =  str; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_op_exprContext extends ParserRuleContext {
		public String typeS;
		public TermContext t;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(javaxParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(javaxParser.NOT, 0); }
		public TerminalNode PLUS() { return getToken(javaxParser.PLUS, 0); }
		public Unary_op_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_op_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).enterUnary_op_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).exitUnary_op_expr(this);
		}
	}

	public final Unary_op_exprContext unary_op_expr() throws RecognitionException {
		Unary_op_exprContext _localctx = new Unary_op_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unary_op_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NOT))) != 0)) {
				{
				setState(214);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NOT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(217); ((Unary_op_exprContext)_localctx).t = term();
			 ((Unary_op_exprContext)_localctx).typeS = t; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Strong_op_exprContext extends ParserRuleContext {
		public String typeS;
		public Unary_op_exprContext t1;
		public Token op;
		public Unary_op_exprContext t2;
		public TerminalNode SLASH(int i) {
			return getToken(javaxParser.SLASH, i);
		}
		public TerminalNode PERCENT(int i) {
			return getToken(javaxParser.PERCENT, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(javaxParser.PERCENT); }
		public List<TerminalNode> STAR() { return getTokens(javaxParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(javaxParser.STAR, i);
		}
		public Unary_op_exprContext unary_op_expr(int i) {
			return getRuleContext(Unary_op_exprContext.class,i);
		}
		public List<TerminalNode> SLASH() { return getTokens(javaxParser.SLASH); }
		public List<Unary_op_exprContext> unary_op_expr() {
			return getRuleContexts(Unary_op_exprContext.class);
		}
		public Strong_op_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strong_op_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).enterStrong_op_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).exitStrong_op_expr(this);
		}
	}

	public final Strong_op_exprContext strong_op_expr() throws RecognitionException {
		Strong_op_exprContext _localctx = new Strong_op_exprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_strong_op_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220); ((Strong_op_exprContext)_localctx).t1 = unary_op_expr();
			((Strong_op_exprContext)_localctx).typeS =  t1;
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << SLASH) | (1L << PERCENT))) != 0)) {
				{
				{
				setState(222);
				((Strong_op_exprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << SLASH) | (1L << PERCENT))) != 0)) ) {
					((Strong_op_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(223); ((Strong_op_exprContext)_localctx).t2 = unary_op_expr();
				 ((Strong_op_exprContext)_localctx).typeS =  s.eval_strong_expr(t1,t2,op.getText()); 
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Weak_op_exprContext extends ParserRuleContext {
		public String typeS;
		public Strong_op_exprContext t1;
		public Token op;
		public Strong_op_exprContext t2;
		public List<Strong_op_exprContext> strong_op_expr() {
			return getRuleContexts(Strong_op_exprContext.class);
		}
		public TerminalNode MINUS(int i) {
			return getToken(javaxParser.MINUS, i);
		}
		public TerminalNode TRUE() { return getToken(javaxParser.TRUE, 0); }
		public List<TerminalNode> MINUS() { return getTokens(javaxParser.MINUS); }
		public Strong_op_exprContext strong_op_expr(int i) {
			return getRuleContext(Strong_op_exprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(javaxParser.PLUS); }
		public TerminalNode FALSE() { return getToken(javaxParser.FALSE, 0); }
		public TerminalNode PLUS(int i) {
			return getToken(javaxParser.PLUS, i);
		}
		public Weak_op_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weak_op_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).enterWeak_op_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).exitWeak_op_expr(this);
		}
	}

	public final Weak_op_exprContext weak_op_expr() throws RecognitionException {
		Weak_op_exprContext _localctx = new Weak_op_exprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_weak_op_expr);
		int _la;
		try {
			setState(244);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NOT:
			case NAME:
			case INT:
			case FLOAT:
			case NORMALSTRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(231); ((Weak_op_exprContext)_localctx).t1 = strong_op_expr();
				 ((Weak_op_exprContext)_localctx).typeS = t1;
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS || _la==MINUS) {
					{
					{
					setState(233);
					((Weak_op_exprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
						((Weak_op_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(234); ((Weak_op_exprContext)_localctx).t2 = strong_op_expr();
					((Weak_op_exprContext)_localctx).typeS = s.eval_weak_expr(t1,t2,op.getText()); 
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(242); match(FALSE);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(243); match(TRUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_op_exprContext extends ParserRuleContext {
		public String typeS;
		public Weak_op_exprContext t1;
		public Token op;
		public Weak_op_exprContext t2;
		public TerminalNode GREATER(int i) {
			return getToken(javaxParser.GREATER, i);
		}
		public List<TerminalNode> GREATEREQUAL() { return getTokens(javaxParser.GREATEREQUAL); }
		public TerminalNode NOTEQUAL(int i) {
			return getToken(javaxParser.NOTEQUAL, i);
		}
		public TerminalNode LESS(int i) {
			return getToken(javaxParser.LESS, i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(javaxParser.EQUAL); }
		public TerminalNode LESSEQUAL(int i) {
			return getToken(javaxParser.LESSEQUAL, i);
		}
		public TerminalNode GREATEREQUAL(int i) {
			return getToken(javaxParser.GREATEREQUAL, i);
		}
		public Weak_op_exprContext weak_op_expr(int i) {
			return getRuleContext(Weak_op_exprContext.class,i);
		}
		public List<Weak_op_exprContext> weak_op_expr() {
			return getRuleContexts(Weak_op_exprContext.class);
		}
		public List<TerminalNode> LESS() { return getTokens(javaxParser.LESS); }
		public TerminalNode EQUAL(int i) {
			return getToken(javaxParser.EQUAL, i);
		}
		public List<TerminalNode> GREATER() { return getTokens(javaxParser.GREATER); }
		public List<TerminalNode> LESSEQUAL() { return getTokens(javaxParser.LESSEQUAL); }
		public List<TerminalNode> NOTEQUAL() { return getTokens(javaxParser.NOTEQUAL); }
		public Relational_op_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_op_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).enterRelational_op_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).exitRelational_op_expr(this);
		}
	}

	public final Relational_op_exprContext relational_op_expr() throws RecognitionException {
		Relational_op_exprContext _localctx = new Relational_op_exprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_relational_op_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246); ((Relational_op_exprContext)_localctx).t1 = weak_op_expr();
			 ((Relational_op_exprContext)_localctx).typeS = t1;
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << GREATER) | (1L << EQUAL) | (1L << NOTEQUAL) | (1L << LESSEQUAL) | (1L << GREATEREQUAL))) != 0)) {
				{
				{
				setState(248);
				((Relational_op_exprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << GREATER) | (1L << EQUAL) | (1L << NOTEQUAL) | (1L << LESSEQUAL) | (1L << GREATEREQUAL))) != 0)) ) {
					((Relational_op_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(249); ((Relational_op_exprContext)_localctx).t2 = weak_op_expr();
				 s.eval_relational_expr(t1,t2,op.getText());
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logic_op_exprContext extends ParserRuleContext {
		public String typeS;
		public Relational_op_exprContext t1;
		public Token op;
		public Relational_op_exprContext t2;
		public List<TerminalNode> AND() { return getTokens(javaxParser.AND); }
		public List<TerminalNode> OR() { return getTokens(javaxParser.OR); }
		public TerminalNode AND(int i) {
			return getToken(javaxParser.AND, i);
		}
		public TerminalNode OR(int i) {
			return getToken(javaxParser.OR, i);
		}
		public List<Relational_op_exprContext> relational_op_expr() {
			return getRuleContexts(Relational_op_exprContext.class);
		}
		public Relational_op_exprContext relational_op_expr(int i) {
			return getRuleContext(Relational_op_exprContext.class,i);
		}
		public Logic_op_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_op_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).enterLogic_op_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).exitLogic_op_expr(this);
		}
	}

	public final Logic_op_exprContext logic_op_expr() throws RecognitionException {
		Logic_op_exprContext _localctx = new Logic_op_exprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_logic_op_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257); ((Logic_op_exprContext)_localctx).t1 = relational_op_expr();
			((Logic_op_exprContext)_localctx).typeS = t1;
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(259);
				((Logic_op_exprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
					((Logic_op_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(260); ((Logic_op_exprContext)_localctx).t2 = relational_op_expr();
				 s.eval_logic_expr(t1,t2,op.getText());
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedarglistContext extends ParserRuleContext {
		public HashMap<String,String> tamap;
		public TypeContext t;
		public Token n;
		public TerminalNode NAME(int i) {
			return getToken(javaxParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(javaxParser.COMMA); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public List<TerminalNode> NAME() { return getTokens(javaxParser.NAME); }
		public TerminalNode COMMA(int i) {
			return getToken(javaxParser.COMMA, i);
		}
		public TypedarglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedarglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).enterTypedarglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).exitTypedarglist(this);
		}
	}

	public final TypedarglistContext typedarglist() throws RecognitionException {
		TypedarglistContext _localctx = new TypedarglistContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typedarglist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((TypedarglistContext)_localctx).tamap =  new HashMap<String,String>(); 
			setState(282);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_INT) | (1L << T_REAL) | (1L << T_STRING) | (1L << T_CHAIN) | (1L << T_VOID) | (1L << T_BOOL))) != 0)) {
				{
				setState(269); ((TypedarglistContext)_localctx).t = type();
				setState(270); ((TypedarglistContext)_localctx).n = match(NAME);
				 tamap.put(n.getText(), t); 
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(272); match(COMMA);
					setState(273); ((TypedarglistContext)_localctx).t = type();
					setState(274); ((TypedarglistContext)_localctx).n = match(NAME);
					 tamap.put(n.getText(), t); 
					}
					}
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChestaccessContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(javaxParser.DOT); }
		public TerminalNode NAME(int i) {
			return getToken(javaxParser.NAME, i);
		}
		public List<TerminalNode> NAME() { return getTokens(javaxParser.NAME); }
		public TerminalNode DOT(int i) {
			return getToken(javaxParser.DOT, i);
		}
		public ChestaccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chestaccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).enterChestaccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).exitChestaccess(this);
		}
	}

	public final ChestaccessContext chestaccess() throws RecognitionException {
		ChestaccessContext _localctx = new ChestaccessContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_chestaccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284); match(NAME);
			setState(287); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(285); match(DOT);
				setState(286); match(NAME);
				}
				}
				setState(289); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DOT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Def_returnContext extends ParserRuleContext {
		public String typeS;
		public Logic_op_exprContext t;
		public TerminalNode RETURN() { return getToken(javaxParser.RETURN, 0); }
		public Logic_op_exprContext logic_op_expr() {
			return getRuleContext(Logic_op_exprContext.class,0);
		}
		public Def_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).enterDef_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).exitDef_return(this);
		}
	}

	public final Def_returnContext def_return() throws RecognitionException {
		Def_returnContext _localctx = new Def_returnContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_def_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291); match(RETURN);
			setState(292); ((Def_returnContext)_localctx).t = logic_op_expr();
			 ((Def_returnContext)_localctx).typeS = t;
			s.eval_return(t);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArglistContext extends ParserRuleContext {
		public HashMap<String,String> amap;
		public Token n;
		public Token n1;
		public TerminalNode NAME(int i) {
			return getToken(javaxParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(javaxParser.COMMA); }
		public List<TerminalNode> NAME() { return getTokens(javaxParser.NAME); }
		public TerminalNode COMMA(int i) {
			return getToken(javaxParser.COMMA, i);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).enterArglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).exitArglist(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arglist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ArglistContext)_localctx).amap =  new HashMap<String,String>(); 
			setState(307);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(297); ((ArglistContext)_localctx).n = match(NAME);
				amap.put(n.getText(), s.get_type(n.getText()));
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(299); match(COMMA);
					setState(300); ((ArglistContext)_localctx).n1 = match(NAME);
					amap.put(n.getText(), s.get_type(n1.getText()));
					}
					}
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public String name;
		public Token n;
		public TerminalNode NAME() { return getToken(javaxParser.NAME, 0); }
		public ChestaccessContext chestaccess() {
			return getRuleContext(ChestaccessContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_variable);
		try {
			setState(313);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309); ((VariableContext)_localctx).n = match(NAME);
				 ((VariableContext)_localctx).name =  n.getText();
				s.eval_atrib(n);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312); chestaccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public String typeS;
		public TerminalNode FLOAT() { return getToken(javaxParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(javaxParser.INT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_number);
		try {
			setState(319);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(315); match(INT);
				 ((NumberContext)_localctx).typeS =  "Integer"; 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(317); match(FLOAT);
				 ((NumberContext)_localctx).typeS =  "Real"; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public String typeS;
		public TerminalNode NORMALSTRING() { return getToken(javaxParser.NORMALSTRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaxListener ) ((javaxListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321); match(NORMALSTRING);
			 ((StringContext)_localctx).typeS =  "String"; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3:\u0147\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\6\2>\n\2\r\2\16\2?"+
		"\3\3\3\3\5\3D\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4Y\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6f\n\6\f\6\16\6i\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\7\bx\n\b\f\b\16\b{\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t"+
		"\u0084\n\t\f\t\16\t\u0087\13\t\3\t\3\t\3\t\7\t\u008c\n\t\f\t\16\t\u008f"+
		"\13\t\3\t\5\t\u0092\n\t\3\n\3\n\7\n\u0096\n\n\f\n\16\n\u0099\13\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u00aa\n\13\f\13\16\13\u00ad\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\f\u00b6"+
		"\n\f\f\f\16\f\u00b9\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00c9\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00d7\n\16\3\17\5\17\u00da\n\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\7\20\u00e5\n\20\f\20\16\20\u00e8\13\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\7\21\u00f0\n\21\f\21\16\21\u00f3\13\21\3"+
		"\21\3\21\5\21\u00f7\n\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00ff\n\22"+
		"\f\22\16\22\u0102\13\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u010a\n\23"+
		"\f\23\16\23\u010d\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7"+
		"\24\u0118\n\24\f\24\16\24\u011b\13\24\5\24\u011d\n\24\3\25\3\25\3\25\6"+
		"\25\u0122\n\25\r\25\16\25\u0123\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\7\27\u0131\n\27\f\27\16\27\u0134\13\27\5\27\u0136\n\27"+
		"\3\30\3\30\3\30\3\30\5\30\u013c\n\30\3\31\3\31\3\31\3\31\5\31\u0142\n"+
		"\31\3\32\3\32\3\32\3\32\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\2\7\4\2\13\f\34\34\4\2\r\16\23\23\3\2\13\f\4\2\20\21\26\31"+
		"\3\2\32\33\u0156\2=\3\2\2\2\4C\3\2\2\2\6X\3\2\2\2\bZ\3\2\2\2\n_\3\2\2"+
		"\2\fj\3\2\2\2\16p\3\2\2\2\20\177\3\2\2\2\22\u0093\3\2\2\2\24\u00a0\3\2"+
		"\2\2\26\u00b0\3\2\2\2\30\u00c8\3\2\2\2\32\u00d6\3\2\2\2\34\u00d9\3\2\2"+
		"\2\36\u00de\3\2\2\2 \u00f6\3\2\2\2\"\u00f8\3\2\2\2$\u0103\3\2\2\2&\u010e"+
		"\3\2\2\2(\u011e\3\2\2\2*\u0125\3\2\2\2,\u012a\3\2\2\2.\u013b\3\2\2\2\60"+
		"\u0141\3\2\2\2\62\u0143\3\2\2\2\64\65\5\n\6\2\65\66\7\t\2\2\668\3\2\2"+
		"\2\67\64\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<"+
		">\5\4\3\2=9\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\3\3\2\2\2AD\5\16\b"+
		"\2BD\5\24\13\2CA\3\2\2\2CB\3\2\2\2D\5\3\2\2\2EF\5\b\5\2FG\7\t\2\2GY\3"+
		"\2\2\2HI\5\n\6\2IJ\7\t\2\2JY\3\2\2\2KL\5\f\7\2LM\7\t\2\2MY\3\2\2\2NY\5"+
		"\20\t\2OY\5\26\f\2PQ\5*\26\2QR\b\4\1\2RS\7\t\2\2SY\3\2\2\2TU\5(\25\2U"+
		"V\7\t\2\2VY\3\2\2\2WY\5\22\n\2XE\3\2\2\2XH\3\2\2\2XK\3\2\2\2XN\3\2\2\2"+
		"XO\3\2\2\2XP\3\2\2\2XT\3\2\2\2XW\3\2\2\2Y\7\3\2\2\2Z[\7\64\2\2[\\\7\22"+
		"\2\2\\]\5$\23\2]^\b\5\1\2^\t\3\2\2\2_`\5\30\r\2`a\7\64\2\2ag\b\6\1\2b"+
		"c\7\b\2\2cd\7\64\2\2df\b\6\1\2eb\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2"+
		"h\13\3\2\2\2ig\3\2\2\2jk\7\64\2\2kl\7\3\2\2lm\5,\27\2mn\7\4\2\2no\b\7"+
		"\1\2o\r\3\2\2\2pq\5\30\r\2qr\7\64\2\2rs\7\3\2\2st\5&\24\2tu\7\4\2\2uy"+
		"\b\b\1\2vx\5\6\4\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{"+
		"y\3\2\2\2|}\b\b\1\2}~\7*\2\2~\17\3\2\2\2\177\u0080\7#\2\2\u0080\u0081"+
		"\5$\23\2\u0081\u0085\7-\2\2\u0082\u0084\5\6\4\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0091\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0088\u0092\7*\2\2\u0089\u008d\7$\2\2\u008a\u008c"+
		"\5\6\4\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0092\7*"+
		"\2\2\u0091\u0088\3\2\2\2\u0091\u0089\3\2\2\2\u0092\21\3\2\2\2\u0093\u0097"+
		"\7!\2\2\u0094\u0096\5\6\4\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u009a\u009b\7&\2\2\u009b\u009c\7\3\2\2\u009c\u009d\5$\23\2\u009d"+
		"\u009e\7\4\2\2\u009e\u009f\7*\2\2\u009f\23\3\2\2\2\u00a0\u00a1\7,\2\2"+
		"\u00a1\u00a2\7\64\2\2\u00a2\u00ab\7\7\2\2\u00a3\u00a4\5\n\6\2\u00a4\u00a5"+
		"\7\t\2\2\u00a5\u00aa\3\2\2\2\u00a6\u00a7\5\f\7\2\u00a7\u00a8\7\t\2\2\u00a8"+
		"\u00aa\3\2\2\2\u00a9\u00a3\3\2\2\2\u00a9\u00a6\3\2\2\2\u00aa\u00ad\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae\u00af\7*\2\2\u00af\25\3\2\2\2\u00b0\u00b1\7\"\2\2"+
		"\u00b1\u00b2\7\3\2\2\u00b2\u00b3\5$\23\2\u00b3\u00b7\7\4\2\2\u00b4\u00b6"+
		"\5\6\4\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7*"+
		"\2\2\u00bb\27\3\2\2\2\u00bc\u00bd\7.\2\2\u00bd\u00c9\b\r\1\2\u00be\u00bf"+
		"\7/\2\2\u00bf\u00c9\b\r\1\2\u00c0\u00c1\7\60\2\2\u00c1\u00c9\b\r\1\2\u00c2"+
		"\u00c3\7\63\2\2\u00c3\u00c9\b\r\1\2\u00c4\u00c5\7\62\2\2\u00c5\u00c9\b"+
		"\r\1\2\u00c6\u00c7\7\61\2\2\u00c7\u00c9\b\r\1\2\u00c8\u00bc\3\2\2\2\u00c8"+
		"\u00be\3\2\2\2\u00c8\u00c0\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c4\3\2"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c9\31\3\2\2\2\u00ca\u00cb\5.\30\2\u00cb\u00cc"+
		"\b\16\1\2\u00cc\u00d7\3\2\2\2\u00cd\u00ce\5\f\7\2\u00ce\u00cf\b\16\1\2"+
		"\u00cf\u00d7\3\2\2\2\u00d0\u00d1\5\60\31\2\u00d1\u00d2\b\16\1\2\u00d2"+
		"\u00d7\3\2\2\2\u00d3\u00d4\5\62\32\2\u00d4\u00d5\b\16\1\2\u00d5\u00d7"+
		"\3\2\2\2\u00d6\u00ca\3\2\2\2\u00d6\u00cd\3\2\2\2\u00d6\u00d0\3\2\2\2\u00d6"+
		"\u00d3\3\2\2\2\u00d7\33\3\2\2\2\u00d8\u00da\t\2\2\2\u00d9\u00d8\3\2\2"+
		"\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\5\32\16\2\u00dc"+
		"\u00dd\b\17\1\2\u00dd\35\3\2\2\2\u00de\u00df\5\34\17\2\u00df\u00e6\b\20"+
		"\1\2\u00e0\u00e1\t\3\2\2\u00e1\u00e2\5\34\17\2\u00e2\u00e3\b\20\1\2\u00e3"+
		"\u00e5\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\37\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea"+
		"\5\36\20\2\u00ea\u00f1\b\21\1\2\u00eb\u00ec\t\4\2\2\u00ec\u00ed\5\36\20"+
		"\2\u00ed\u00ee\b\21\1\2\u00ee\u00f0\3\2\2\2\u00ef\u00eb\3\2\2\2\u00f0"+
		"\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f7\3\2"+
		"\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\7\35\2\2\u00f5\u00f7\7\36\2\2\u00f6"+
		"\u00e9\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7!\3\2\2\2"+
		"\u00f8\u00f9\5 \21\2\u00f9\u0100\b\22\1\2\u00fa\u00fb\t\5\2\2\u00fb\u00fc"+
		"\5 \21\2\u00fc\u00fd\b\22\1\2\u00fd\u00ff\3\2\2\2\u00fe\u00fa\3\2\2\2"+
		"\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101#\3"+
		"\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\5\"\22\2\u0104\u010b\b\23\1\2\u0105"+
		"\u0106\t\6\2\2\u0106\u0107\5\"\22\2\u0107\u0108\b\23\1\2\u0108\u010a\3"+
		"\2\2\2\u0109\u0105\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c%\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u011c\b\24\1\2"+
		"\u010f\u0110\5\30\r\2\u0110\u0111\7\64\2\2\u0111\u0119\b\24\1\2\u0112"+
		"\u0113\7\b\2\2\u0113\u0114\5\30\r\2\u0114\u0115\7\64\2\2\u0115\u0116\b"+
		"\24\1\2\u0116\u0118\3\2\2\2\u0117\u0112\3\2\2\2\u0118\u011b\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2"+
		"\2\2\u011c\u010f\3\2\2\2\u011c\u011d\3\2\2\2\u011d\'\3\2\2\2\u011e\u0121"+
		"\7\64\2\2\u011f\u0120\7\n\2\2\u0120\u0122\7\64\2\2\u0121\u011f\3\2\2\2"+
		"\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124)\3"+
		"\2\2\2\u0125\u0126\7+\2\2\u0126\u0127\5$\23\2\u0127\u0128\b\26\1\2\u0128"+
		"\u0129\b\26\1\2\u0129+\3\2\2\2\u012a\u0135\b\27\1\2\u012b\u012c\7\64\2"+
		"\2\u012c\u0132\b\27\1\2\u012d\u012e\7\b\2\2\u012e\u012f\7\64\2\2\u012f"+
		"\u0131\b\27\1\2\u0130\u012d\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3"+
		"\2\2\2\u0132\u0133\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0135"+
		"\u012b\3\2\2\2\u0135\u0136\3\2\2\2\u0136-\3\2\2\2\u0137\u0138\7\64\2\2"+
		"\u0138\u0139\b\30\1\2\u0139\u013c\b\30\1\2\u013a\u013c\5(\25\2\u013b\u0137"+
		"\3\2\2\2\u013b\u013a\3\2\2\2\u013c/\3\2\2\2\u013d\u013e\7\65\2\2\u013e"+
		"\u0142\b\31\1\2\u013f\u0140\7\66\2\2\u0140\u0142\b\31\1\2\u0141\u013d"+
		"\3\2\2\2\u0141\u013f\3\2\2\2\u0142\61\3\2\2\2\u0143\u0144\7\67\2\2\u0144"+
		"\u0145\b\32\1\2\u0145\63\3\2\2\2\369?CXgy\u0085\u008d\u0091\u0097\u00a9"+
		"\u00ab\u00b7\u00c8\u00d6\u00d9\u00e6\u00f1\u00f6\u0100\u010b\u0119\u011c"+
		"\u0123\u0132\u0135\u013b\u0141";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}