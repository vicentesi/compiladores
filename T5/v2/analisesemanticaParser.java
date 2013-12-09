// Generated from analisesemantica.g by ANTLR 4.1

package Compilador;
import Compilador.Semantica;
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
public class analisesemanticaParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "'('", "')'", "'['", "']'", "':'", "','", "';'", "'.'", "'+'", 
		"'-'", "'*'", "'/'", "'^'", "'<'", "'>'", "'='", "'%'", "'{'", "'}'", 
		"'=='", "'<>'", "'<='", "'>='", "'and'", "'or'", "'not'", "'false'", "'true'", 
		"'..'", "'for'", "'repeat'", "'while'", "'if'", "'else'", "'elif'", "'until'", 
		"'do'", "'with'", "'in'", "'end'", "'return'", "'chest'", "'then'", "'int'", 
		"'real'", "'string'", "'chain'", "'void'", "'bool'", "NAME", "INT", "STRING", 
		"TI", "COMMENT"
	};
	public static final int
		RULE_analisesemantica = 0, RULE_stat = 1, RULE_statement = 2, RULE_varatrib = 3, 
		RULE_vardecl = 4, RULE_funccall = 5, RULE_def_func = 6, RULE_def_if = 7, 
		RULE_whilestat = 8, RULE_type = 9, RULE_term = 10, RULE_unaryexpr = 11, 
		RULE_strong_op_expr = 12, RULE_weak_op_expr = 13, RULE_relational_op_expr = 14, 
		RULE_logic_op_expr = 15, RULE_typedarglist = 16, RULE_chestaccess = 17, 
		RULE_returnstat = 18, RULE_arglist = 19, RULE_variable = 20, RULE_number = 21, 
		RULE_string = 22;
	public static final String[] ruleNames = {
		"analisesemantica", "stat", "statement", "varatrib", "vardecl", "funccall", 
		"def_func", "def_if", "whilestat", "type", "term", "unaryexpr", "strong_op_expr", 
		"weak_op_expr", "relational_op_expr", "logic_op_expr", "typedarglist", 
		"chestaccess", "returnstat", "arglist", "variable", "number", "string"
	};

	@Override
	public String getGrammarFileName() { return "analisesemantica.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


	Semantica s = new Semantica(this);

	public analisesemanticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AnalisesemanticaContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(analisesemanticaParser.SEMI); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public TerminalNode SEMI(int i) {
			return getToken(analisesemanticaParser.SEMI, i);
		}
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public AnalisesemanticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analisesemantica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).enterAnalisesemantica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).exitAnalisesemantica(this);
		}
	}

	public final AnalisesemanticaContext analisesemantica() throws RecognitionException {
		AnalisesemanticaContext _localctx = new AnalisesemanticaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_analisesemantica);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(46); vardecl();
						setState(47); match(SEMI);
						}
						} 
					}
					setState(53);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				{
				setState(54); stat();
				}
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_INT) | (1L << T_REAL) | (1L << T_STRING) | (1L << T_CHAIN) | (1L << T_VOID) | (1L << T_BOOL))) != 0) );
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
		public Def_funcContext def_func() {
			return getRuleContext(Def_funcContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); def_func();
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

	public static class StatementContext extends ParserRuleContext {
		public String typeS;
		public ReturnstatContext t;
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public Def_ifContext def_if() {
			return getRuleContext(Def_ifContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(analisesemanticaParser.SEMI, 0); }
		public ReturnstatContext returnstat() {
			return getRuleContext(ReturnstatContext.class,0);
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
		public WhilestatContext whilestat() {
			return getRuleContext(WhilestatContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(79);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61); varatrib();
				setState(62); match(SEMI);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64); vardecl();
				setState(65); match(SEMI);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67); funccall();
				setState(68); match(SEMI);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70); def_if();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(71); whilestat();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(72); ((StatementContext)_localctx).t = returnstat();
				((StatementContext)_localctx).typeS = t;
				setState(74); match(SEMI);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(76); chestaccess();
				setState(77); match(SEMI);
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
		public TerminalNode ASSIGN() { return getToken(analisesemanticaParser.ASSIGN, 0); }
		public TerminalNode NAME() { return getToken(analisesemanticaParser.NAME, 0); }
		public Logic_op_exprContext logic_op_expr() {
			return getRuleContext(Logic_op_exprContext.class,0);
		}
		public VaratribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varatrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).enterVaratrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).exitVaratrib(this);
		}
	}

	public final VaratribContext varatrib() throws RecognitionException {
		VaratribContext _localctx = new VaratribContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varatrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); ((VaratribContext)_localctx).n = match(NAME);
			setState(82); match(ASSIGN);
			setState(83); ((VaratribContext)_localctx).t = logic_op_expr();
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
			return getToken(analisesemanticaParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(analisesemanticaParser.COMMA); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NAME() { return getTokens(analisesemanticaParser.NAME); }
		public TerminalNode COMMA(int i) {
			return getToken(analisesemanticaParser.COMMA, i);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).exitVardecl(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vardecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); ((VardeclContext)_localctx).t = type();
			setState(87); ((VardeclContext)_localctx).v = match(NAME);
			 s.add_variable(v.getText(), t);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(89); match(COMMA);
				setState(90); ((VardeclContext)_localctx).v = match(NAME);
				 s.add_variable(v.getText(), t);
				}
				}
				setState(96);
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
		public TerminalNode RPAREN() { return getToken(analisesemanticaParser.RPAREN, 0); }
		public TerminalNode NAME() { return getToken(analisesemanticaParser.NAME, 0); }
		public TerminalNode LPAREN() { return getToken(analisesemanticaParser.LPAREN, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public FunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).enterFunccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).exitFunccall(this);
		}
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funccall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); ((FunccallContext)_localctx).n = match(NAME);
			setState(98); match(LPAREN);
			setState(99); ((FunccallContext)_localctx).h = arglist();
			setState(100); match(RPAREN);
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
		public StatementContext tw;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TypedarglistContext typedarglist() {
			return getRuleContext(TypedarglistContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(analisesemanticaParser.RPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NAME() { return getToken(analisesemanticaParser.NAME, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(analisesemanticaParser.LPAREN, 0); }
		public TerminalNode END() { return getToken(analisesemanticaParser.END, 0); }
		public Def_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).enterDef_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).exitDef_func(this);
		}
	}

	public final Def_funcContext def_func() throws RecognitionException {
		Def_funcContext _localctx = new Def_funcContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_def_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); ((Def_funcContext)_localctx).t = type();
			setState(104); ((Def_funcContext)_localctx).n = match(NAME);
			setState(105); match(LPAREN);
			setState(106); ((Def_funcContext)_localctx).h = typedarglist();
			setState(107); match(RPAREN);
			s.open_function_decl(t,h,n.getText());
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << RETURN) | (1L << T_INT) | (1L << T_REAL) | (1L << T_STRING) | (1L << T_CHAIN) | (1L << T_VOID) | (1L << T_BOOL) | (1L << NAME))) != 0)) {
				{
				{
				setState(109); ((Def_funcContext)_localctx).tw = statement();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			s.close_function_decl(tw);
			setState(116); match(END);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode THEN() { return getToken(analisesemanticaParser.THEN, 0); }
		public TerminalNode IF() { return getToken(analisesemanticaParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(analisesemanticaParser.ELSE, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode END() { return getToken(analisesemanticaParser.END, 0); }
		public Logic_op_exprContext logic_op_expr() {
			return getRuleContext(Logic_op_exprContext.class,0);
		}
		public Def_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).enterDef_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).exitDef_if(this);
		}
	}

	public final Def_ifContext def_if() throws RecognitionException {
		Def_ifContext _localctx = new Def_ifContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_def_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(IF);
			setState(119); logic_op_expr();
			setState(120); match(THEN);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << RETURN) | (1L << T_INT) | (1L << T_REAL) | (1L << T_STRING) | (1L << T_CHAIN) | (1L << T_VOID) | (1L << T_BOOL) | (1L << NAME))) != 0)) {
				{
				{
				setState(121); statement();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			switch (_input.LA(1)) {
			case END:
				{
				setState(127); match(END);
				}
				break;
			case ELSE:
				{
				{
				setState(128); match(ELSE);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << RETURN) | (1L << T_INT) | (1L << T_REAL) | (1L << T_STRING) | (1L << T_CHAIN) | (1L << T_VOID) | (1L << T_BOOL) | (1L << NAME))) != 0)) {
					{
					{
					setState(129); statement();
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135); match(END);
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

	public static class WhilestatContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode WHILE() { return getToken(analisesemanticaParser.WHILE, 0); }
		public TerminalNode RPAREN() { return getToken(analisesemanticaParser.RPAREN, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(analisesemanticaParser.LPAREN, 0); }
		public TerminalNode END() { return getToken(analisesemanticaParser.END, 0); }
		public Logic_op_exprContext logic_op_expr() {
			return getRuleContext(Logic_op_exprContext.class,0);
		}
		public WhilestatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).enterWhilestat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).exitWhilestat(this);
		}
	}

	public final WhilestatContext whilestat() throws RecognitionException {
		WhilestatContext _localctx = new WhilestatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whilestat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); match(WHILE);
			setState(139); match(LPAREN);
			setState(140); logic_op_expr();
			setState(141); match(RPAREN);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << RETURN) | (1L << T_INT) | (1L << T_REAL) | (1L << T_STRING) | (1L << T_CHAIN) | (1L << T_VOID) | (1L << T_BOOL) | (1L << NAME))) != 0)) {
				{
				{
				setState(142); statement();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148); match(END);
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
		public TerminalNode T_CHAIN() { return getToken(analisesemanticaParser.T_CHAIN, 0); }
		public TerminalNode T_INT() { return getToken(analisesemanticaParser.T_INT, 0); }
		public TerminalNode T_STRING() { return getToken(analisesemanticaParser.T_STRING, 0); }
		public TerminalNode T_REAL() { return getToken(analisesemanticaParser.T_REAL, 0); }
		public TerminalNode T_VOID() { return getToken(analisesemanticaParser.T_VOID, 0); }
		public TerminalNode T_BOOL() { return getToken(analisesemanticaParser.T_BOOL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(162);
			switch (_input.LA(1)) {
			case T_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(150); match(T_INT);
				 ((TypeContext)_localctx).typeS =  "Integer"; 
				}
				break;
			case T_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(152); match(T_REAL);
				 ((TypeContext)_localctx).typeS =  "Real"; 
				}
				break;
			case T_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(154); match(T_STRING);
				 ((TypeContext)_localctx).typeS =  "String"; 
				}
				break;
			case T_BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(156); match(T_BOOL);
				 ((TypeContext)_localctx).typeS =  "Boolean"; 
				}
				break;
			case T_VOID:
				enterOuterAlt(_localctx, 5);
				{
				setState(158); match(T_VOID);
				 ((TypeContext)_localctx).typeS =  "Void"; 
				}
				break;
			case T_CHAIN:
				enterOuterAlt(_localctx, 6);
				{
				setState(160); match(T_CHAIN);
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
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_term);
		try {
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164); ((TermContext)_localctx).v = variable();
				 ((TermContext)_localctx).typeS =  s.get_type(v); 
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167); ((TermContext)_localctx).f = funccall();
				 ((TermContext)_localctx).typeS =  f;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170); ((TermContext)_localctx).n = number();
				 ((TermContext)_localctx).typeS =  n; 
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(173); ((TermContext)_localctx).str = string();
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

	public static class UnaryexprContext extends ParserRuleContext {
		public String typeS;
		public TermContext t;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(analisesemanticaParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(analisesemanticaParser.PLUS, 0); }
		public UnaryexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).enterUnaryexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).exitUnaryexpr(this);
		}
	}

	public final UnaryexprContext unaryexpr() throws RecognitionException {
		UnaryexprContext _localctx = new UnaryexprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_unaryexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(178);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(181); ((UnaryexprContext)_localctx).t = term();
			 ((UnaryexprContext)_localctx).typeS = t; 
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
		public UnaryexprContext t1;
		public Token op;
		public UnaryexprContext t2;
		public TerminalNode SLASH(int i) {
			return getToken(analisesemanticaParser.SLASH, i);
		}
		public UnaryexprContext unaryexpr(int i) {
			return getRuleContext(UnaryexprContext.class,i);
		}
		public TerminalNode PERCENT(int i) {
			return getToken(analisesemanticaParser.PERCENT, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(analisesemanticaParser.PERCENT); }
		public List<TerminalNode> STAR() { return getTokens(analisesemanticaParser.STAR); }
		public List<UnaryexprContext> unaryexpr() {
			return getRuleContexts(UnaryexprContext.class);
		}
		public TerminalNode STAR(int i) {
			return getToken(analisesemanticaParser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(analisesemanticaParser.SLASH); }
		public Strong_op_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strong_op_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).enterStrong_op_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).exitStrong_op_expr(this);
		}
	}

	public final Strong_op_exprContext strong_op_expr() throws RecognitionException {
		Strong_op_exprContext _localctx = new Strong_op_exprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_strong_op_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184); ((Strong_op_exprContext)_localctx).t1 = unaryexpr();
			((Strong_op_exprContext)_localctx).typeS =  t1;
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << SLASH) | (1L << PERCENT))) != 0)) {
				{
				{
				setState(186);
				((Strong_op_exprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << SLASH) | (1L << PERCENT))) != 0)) ) {
					((Strong_op_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(187); ((Strong_op_exprContext)_localctx).t2 = unaryexpr();
				 ((Strong_op_exprContext)_localctx).typeS =  s.eval_strong_expr(t1,t2,op.getText()); 
				}
				}
				setState(194);
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
			return getToken(analisesemanticaParser.MINUS, i);
		}
		public TerminalNode TRUE() { return getToken(analisesemanticaParser.TRUE, 0); }
		public List<TerminalNode> MINUS() { return getTokens(analisesemanticaParser.MINUS); }
		public Strong_op_exprContext strong_op_expr(int i) {
			return getRuleContext(Strong_op_exprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(analisesemanticaParser.PLUS); }
		public TerminalNode FALSE() { return getToken(analisesemanticaParser.FALSE, 0); }
		public TerminalNode PLUS(int i) {
			return getToken(analisesemanticaParser.PLUS, i);
		}
		public Weak_op_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weak_op_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).enterWeak_op_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).exitWeak_op_expr(this);
		}
	}

	public final Weak_op_exprContext weak_op_expr() throws RecognitionException {
		Weak_op_exprContext _localctx = new Weak_op_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_weak_op_expr);
		int _la;
		try {
			setState(208);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NAME:
			case INT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(195); ((Weak_op_exprContext)_localctx).t1 = strong_op_expr();
				 ((Weak_op_exprContext)_localctx).typeS = t1;
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS || _la==MINUS) {
					{
					{
					setState(197);
					((Weak_op_exprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
						((Weak_op_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(198); ((Weak_op_exprContext)_localctx).t2 = strong_op_expr();
					((Weak_op_exprContext)_localctx).typeS = s.eval_weak_expr(t1,t2,op.getText()); 
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(206); match(FALSE);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(207); match(TRUE);
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
			return getToken(analisesemanticaParser.GREATER, i);
		}
		public List<TerminalNode> GREATEREQUAL() { return getTokens(analisesemanticaParser.GREATEREQUAL); }
		public TerminalNode NOTEQUAL(int i) {
			return getToken(analisesemanticaParser.NOTEQUAL, i);
		}
		public TerminalNode LESS(int i) {
			return getToken(analisesemanticaParser.LESS, i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(analisesemanticaParser.EQUAL); }
		public TerminalNode LESSEQUAL(int i) {
			return getToken(analisesemanticaParser.LESSEQUAL, i);
		}
		public TerminalNode GREATEREQUAL(int i) {
			return getToken(analisesemanticaParser.GREATEREQUAL, i);
		}
		public Weak_op_exprContext weak_op_expr(int i) {
			return getRuleContext(Weak_op_exprContext.class,i);
		}
		public List<Weak_op_exprContext> weak_op_expr() {
			return getRuleContexts(Weak_op_exprContext.class);
		}
		public List<TerminalNode> LESS() { return getTokens(analisesemanticaParser.LESS); }
		public TerminalNode EQUAL(int i) {
			return getToken(analisesemanticaParser.EQUAL, i);
		}
		public List<TerminalNode> GREATER() { return getTokens(analisesemanticaParser.GREATER); }
		public List<TerminalNode> LESSEQUAL() { return getTokens(analisesemanticaParser.LESSEQUAL); }
		public List<TerminalNode> NOTEQUAL() { return getTokens(analisesemanticaParser.NOTEQUAL); }
		public Relational_op_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_op_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).enterRelational_op_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).exitRelational_op_expr(this);
		}
	}

	public final Relational_op_exprContext relational_op_expr() throws RecognitionException {
		Relational_op_exprContext _localctx = new Relational_op_exprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_relational_op_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); ((Relational_op_exprContext)_localctx).t1 = weak_op_expr();
			 ((Relational_op_exprContext)_localctx).typeS = t1;
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << GREATER) | (1L << EQUAL) | (1L << NOTEQUAL) | (1L << LESSEQUAL) | (1L << GREATEREQUAL))) != 0)) {
				{
				{
				setState(212);
				((Relational_op_exprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << GREATER) | (1L << EQUAL) | (1L << NOTEQUAL) | (1L << LESSEQUAL) | (1L << GREATEREQUAL))) != 0)) ) {
					((Relational_op_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(213); ((Relational_op_exprContext)_localctx).t2 = weak_op_expr();
				 s.eval_relational_expr(t1,t2,op.getText());
				}
				}
				setState(220);
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
		public List<TerminalNode> AND() { return getTokens(analisesemanticaParser.AND); }
		public List<TerminalNode> OR() { return getTokens(analisesemanticaParser.OR); }
		public TerminalNode AND(int i) {
			return getToken(analisesemanticaParser.AND, i);
		}
		public TerminalNode OR(int i) {
			return getToken(analisesemanticaParser.OR, i);
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
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).enterLogic_op_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).exitLogic_op_expr(this);
		}
	}

	public final Logic_op_exprContext logic_op_expr() throws RecognitionException {
		Logic_op_exprContext _localctx = new Logic_op_exprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_logic_op_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); ((Logic_op_exprContext)_localctx).t1 = relational_op_expr();
			((Logic_op_exprContext)_localctx).typeS = t1;
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(223);
				((Logic_op_exprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
					((Logic_op_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(224); ((Logic_op_exprContext)_localctx).t2 = relational_op_expr();
				 s.eval_logic_expr(t1,t2,op.getText());
				}
				}
				setState(231);
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
			return getToken(analisesemanticaParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(analisesemanticaParser.COMMA); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public List<TerminalNode> NAME() { return getTokens(analisesemanticaParser.NAME); }
		public TerminalNode COMMA(int i) {
			return getToken(analisesemanticaParser.COMMA, i);
		}
		public TypedarglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedarglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).enterTypedarglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).exitTypedarglist(this);
		}
	}

	public final TypedarglistContext typedarglist() throws RecognitionException {
		TypedarglistContext _localctx = new TypedarglistContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typedarglist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((TypedarglistContext)_localctx).tamap =  new HashMap<String,String>(); 
			setState(246);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_INT) | (1L << T_REAL) | (1L << T_STRING) | (1L << T_CHAIN) | (1L << T_VOID) | (1L << T_BOOL))) != 0)) {
				{
				setState(233); ((TypedarglistContext)_localctx).t = type();
				setState(234); ((TypedarglistContext)_localctx).n = match(NAME);
				 tamap.put(n.getText(), t); 
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(236); match(COMMA);
					setState(237); ((TypedarglistContext)_localctx).t = type();
					setState(238); ((TypedarglistContext)_localctx).n = match(NAME);
					 tamap.put(n.getText(), t); 
					}
					}
					setState(245);
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
		public List<TerminalNode> DOT() { return getTokens(analisesemanticaParser.DOT); }
		public TerminalNode NAME(int i) {
			return getToken(analisesemanticaParser.NAME, i);
		}
		public List<TerminalNode> NAME() { return getTokens(analisesemanticaParser.NAME); }
		public TerminalNode DOT(int i) {
			return getToken(analisesemanticaParser.DOT, i);
		}
		public ChestaccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chestaccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).enterChestaccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).exitChestaccess(this);
		}
	}

	public final ChestaccessContext chestaccess() throws RecognitionException {
		ChestaccessContext _localctx = new ChestaccessContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_chestaccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); match(NAME);
			setState(251); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(249); match(DOT);
				setState(250); match(NAME);
				}
				}
				setState(253); 
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

	public static class ReturnstatContext extends ParserRuleContext {
		public String typeS;
		public Logic_op_exprContext t;
		public TerminalNode RETURN() { return getToken(analisesemanticaParser.RETURN, 0); }
		public Logic_op_exprContext logic_op_expr() {
			return getRuleContext(Logic_op_exprContext.class,0);
		}
		public ReturnstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).enterReturnstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).exitReturnstat(this);
		}
	}

	public final ReturnstatContext returnstat() throws RecognitionException {
		ReturnstatContext _localctx = new ReturnstatContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_returnstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255); match(RETURN);
			setState(256); ((ReturnstatContext)_localctx).t = logic_op_expr();
			 ((ReturnstatContext)_localctx).typeS = t;
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
			return getToken(analisesemanticaParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(analisesemanticaParser.COMMA); }
		public List<TerminalNode> NAME() { return getTokens(analisesemanticaParser.NAME); }
		public TerminalNode COMMA(int i) {
			return getToken(analisesemanticaParser.COMMA, i);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).enterArglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).exitArglist(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arglist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ArglistContext)_localctx).amap =  new HashMap<String,String>(); 
			setState(271);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(261); ((ArglistContext)_localctx).n = match(NAME);
				amap.put(n.getText(), s.get_type(n.getText()));
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(263); match(COMMA);
					setState(264); ((ArglistContext)_localctx).n1 = match(NAME);
					amap.put(n.getText(), s.get_type(n1.getText()));
					}
					}
					setState(270);
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
		public TerminalNode NAME() { return getToken(analisesemanticaParser.NAME, 0); }
		public ChestaccessContext chestaccess() {
			return getRuleContext(ChestaccessContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variable);
		try {
			setState(277);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273); ((VariableContext)_localctx).n = match(NAME);
				 ((VariableContext)_localctx).name =  n.getText();
				s.eval_atrib(n);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276); chestaccess();
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
		public TerminalNode INT() { return getToken(analisesemanticaParser.INT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279); match(INT);
			 ((NumberContext)_localctx).typeS =  "Integer"; 
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
		public TerminalNode STRING() { return getToken(analisesemanticaParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analisesemanticaListener ) ((analisesemanticaListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282); match(STRING);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\38\u0120\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\6\2:\n\2\r\2\16\2;\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4R"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6_\n\6\f\6\16\6b\13"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bq\n\b\f\b\16"+
		"\bt\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t}\n\t\f\t\16\t\u0080\13\t\3\t"+
		"\3\t\3\t\7\t\u0085\n\t\f\t\16\t\u0088\13\t\3\t\5\t\u008b\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\7\n\u0092\n\n\f\n\16\n\u0095\13\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a5\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b3\n\f\3\r\5\r\u00b6\n\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00c1\n\16\f\16\16\16"+
		"\u00c4\13\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00cc\n\17\f\17\16\17"+
		"\u00cf\13\17\3\17\3\17\5\17\u00d3\n\17\3\20\3\20\3\20\3\20\3\20\3\20\7"+
		"\20\u00db\n\20\f\20\16\20\u00de\13\20\3\21\3\21\3\21\3\21\3\21\3\21\7"+
		"\21\u00e6\n\21\f\21\16\21\u00e9\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\7\22\u00f4\n\22\f\22\16\22\u00f7\13\22\5\22\u00f9\n\22\3"+
		"\23\3\23\3\23\6\23\u00fe\n\23\r\23\16\23\u00ff\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u010d\n\25\f\25\16\25\u0110\13\25"+
		"\5\25\u0112\n\25\3\26\3\26\3\26\3\26\5\26\u0118\n\26\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\2\6\3\2\13\f\4\2\r\16\23\23\4\2\20\21\26\31\3\2\32\33\u012b\29\3\2"+
		"\2\2\4=\3\2\2\2\6Q\3\2\2\2\bS\3\2\2\2\nX\3\2\2\2\fc\3\2\2\2\16i\3\2\2"+
		"\2\20x\3\2\2\2\22\u008c\3\2\2\2\24\u00a4\3\2\2\2\26\u00b2\3\2\2\2\30\u00b5"+
		"\3\2\2\2\32\u00ba\3\2\2\2\34\u00d2\3\2\2\2\36\u00d4\3\2\2\2 \u00df\3\2"+
		"\2\2\"\u00ea\3\2\2\2$\u00fa\3\2\2\2&\u0101\3\2\2\2(\u0106\3\2\2\2*\u0117"+
		"\3\2\2\2,\u0119\3\2\2\2.\u011c\3\2\2\2\60\61\5\n\6\2\61\62\7\t\2\2\62"+
		"\64\3\2\2\2\63\60\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66"+
		"8\3\2\2\2\67\65\3\2\2\28:\5\4\3\29\65\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3"+
		"\2\2\2<\3\3\2\2\2=>\5\16\b\2>\5\3\2\2\2?@\5\b\5\2@A\7\t\2\2AR\3\2\2\2"+
		"BC\5\n\6\2CD\7\t\2\2DR\3\2\2\2EF\5\f\7\2FG\7\t\2\2GR\3\2\2\2HR\5\20\t"+
		"\2IR\5\22\n\2JK\5&\24\2KL\b\4\1\2LM\7\t\2\2MR\3\2\2\2NO\5$\23\2OP\7\t"+
		"\2\2PR\3\2\2\2Q?\3\2\2\2QB\3\2\2\2QE\3\2\2\2QH\3\2\2\2QI\3\2\2\2QJ\3\2"+
		"\2\2QN\3\2\2\2R\7\3\2\2\2ST\7\64\2\2TU\7\22\2\2UV\5 \21\2VW\b\5\1\2W\t"+
		"\3\2\2\2XY\5\24\13\2YZ\7\64\2\2Z`\b\6\1\2[\\\7\b\2\2\\]\7\64\2\2]_\b\6"+
		"\1\2^[\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\13\3\2\2\2b`\3\2\2\2cd\7"+
		"\64\2\2de\7\3\2\2ef\5(\25\2fg\7\4\2\2gh\b\7\1\2h\r\3\2\2\2ij\5\24\13\2"+
		"jk\7\64\2\2kl\7\3\2\2lm\5\"\22\2mn\7\4\2\2nr\b\b\1\2oq\5\6\4\2po\3\2\2"+
		"\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\b\b\1\2vw\7*\2"+
		"\2w\17\3\2\2\2xy\7#\2\2yz\5 \21\2z~\7-\2\2{}\5\6\4\2|{\3\2\2\2}\u0080"+
		"\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u008a\3\2\2\2\u0080~\3\2\2\2\u0081"+
		"\u008b\7*\2\2\u0082\u0086\7$\2\2\u0083\u0085\5\6\4\2\u0084\u0083\3\2\2"+
		"\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008b\7*\2\2\u008a\u0081\3\2\2\2\u008a"+
		"\u0082\3\2\2\2\u008b\21\3\2\2\2\u008c\u008d\7\"\2\2\u008d\u008e\7\3\2"+
		"\2\u008e\u008f\5 \21\2\u008f\u0093\7\4\2\2\u0090\u0092\5\6\4\2\u0091\u0090"+
		"\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7*\2\2\u0097\23\3\2\2\2"+
		"\u0098\u0099\7.\2\2\u0099\u00a5\b\13\1\2\u009a\u009b\7/\2\2\u009b\u00a5"+
		"\b\13\1\2\u009c\u009d\7\60\2\2\u009d\u00a5\b\13\1\2\u009e\u009f\7\63\2"+
		"\2\u009f\u00a5\b\13\1\2\u00a0\u00a1\7\62\2\2\u00a1\u00a5\b\13\1\2\u00a2"+
		"\u00a3\7\61\2\2\u00a3\u00a5\b\13\1\2\u00a4\u0098\3\2\2\2\u00a4\u009a\3"+
		"\2\2\2\u00a4\u009c\3\2\2\2\u00a4\u009e\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\25\3\2\2\2\u00a6\u00a7\5*\26\2\u00a7\u00a8\b\f\1"+
		"\2\u00a8\u00b3\3\2\2\2\u00a9\u00aa\5\f\7\2\u00aa\u00ab\b\f\1\2\u00ab\u00b3"+
		"\3\2\2\2\u00ac\u00ad\5,\27\2\u00ad\u00ae\b\f\1\2\u00ae\u00b3\3\2\2\2\u00af"+
		"\u00b0\5.\30\2\u00b0\u00b1\b\f\1\2\u00b1\u00b3\3\2\2\2\u00b2\u00a6\3\2"+
		"\2\2\u00b2\u00a9\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b2\u00af\3\2\2\2\u00b3"+
		"\27\3\2\2\2\u00b4\u00b6\t\2\2\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2"+
		"\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\5\26\f\2\u00b8\u00b9\b\r\1\2\u00b9"+
		"\31\3\2\2\2\u00ba\u00bb\5\30\r\2\u00bb\u00c2\b\16\1\2\u00bc\u00bd\t\3"+
		"\2\2\u00bd\u00be\5\30\r\2\u00be\u00bf\b\16\1\2\u00bf\u00c1\3\2\2\2\u00c0"+
		"\u00bc\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\33\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\5\32\16\2\u00c6"+
		"\u00cd\b\17\1\2\u00c7\u00c8\t\2\2\2\u00c8\u00c9\5\32\16\2\u00c9\u00ca"+
		"\b\17\1\2\u00ca\u00cc\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cc\u00cf\3\2\2\2"+
		"\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d3\3\2\2\2\u00cf\u00cd"+
		"\3\2\2\2\u00d0\u00d3\7\35\2\2\u00d1\u00d3\7\36\2\2\u00d2\u00c5\3\2\2\2"+
		"\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\35\3\2\2\2\u00d4\u00d5"+
		"\5\34\17\2\u00d5\u00dc\b\20\1\2\u00d6\u00d7\t\4\2\2\u00d7\u00d8\5\34\17"+
		"\2\u00d8\u00d9\b\20\1\2\u00d9\u00db\3\2\2\2\u00da\u00d6\3\2\2\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\37\3\2\2"+
		"\2\u00de\u00dc\3\2\2\2\u00df\u00e0\5\36\20\2\u00e0\u00e7\b\21\1\2\u00e1"+
		"\u00e2\t\5\2\2\u00e2\u00e3\5\36\20\2\u00e3\u00e4\b\21\1\2\u00e4\u00e6"+
		"\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8!\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00f8\b\22\1\2"+
		"\u00eb\u00ec\5\24\13\2\u00ec\u00ed\7\64\2\2\u00ed\u00f5\b\22\1\2\u00ee"+
		"\u00ef\7\b\2\2\u00ef\u00f0\5\24\13\2\u00f0\u00f1\7\64\2\2\u00f1\u00f2"+
		"\b\22\1\2\u00f2\u00f4\3\2\2\2\u00f3\u00ee\3\2\2\2\u00f4\u00f7\3\2\2\2"+
		"\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5"+
		"\3\2\2\2\u00f8\u00eb\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9#\3\2\2\2\u00fa"+
		"\u00fd\7\64\2\2\u00fb\u00fc\7\n\2\2\u00fc\u00fe\7\64\2\2\u00fd\u00fb\3"+
		"\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"%\3\2\2\2\u0101\u0102\7+\2\2\u0102\u0103\5 \21\2\u0103\u0104\b\24\1\2"+
		"\u0104\u0105\b\24\1\2\u0105\'\3\2\2\2\u0106\u0111\b\25\1\2\u0107\u0108"+
		"\7\64\2\2\u0108\u010e\b\25\1\2\u0109\u010a\7\b\2\2\u010a\u010b\7\64\2"+
		"\2\u010b\u010d\b\25\1\2\u010c\u0109\3\2\2\2\u010d\u0110\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0111\u0107\3\2\2\2\u0111\u0112\3\2\2\2\u0112)\3\2\2\2\u0113\u0114"+
		"\7\64\2\2\u0114\u0115\b\26\1\2\u0115\u0118\b\26\1\2\u0116\u0118\5$\23"+
		"\2\u0117\u0113\3\2\2\2\u0117\u0116\3\2\2\2\u0118+\3\2\2\2\u0119\u011a"+
		"\7\65\2\2\u011a\u011b\b\27\1\2\u011b-\3\2\2\2\u011c\u011d\7\66\2\2\u011d"+
		"\u011e\b\30\1\2\u011e/\3\2\2\2\31\65;Q`r~\u0086\u008a\u0093\u00a4\u00b2"+
		"\u00b5\u00c2\u00cd\u00d2\u00dc\u00e7\u00f5\u00f8\u00ff\u010e\u0111\u0117";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}