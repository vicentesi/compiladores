// Generated from AnaliseSemantica.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AnaliseSemanticaParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__46=1, T__45=2, T__44=3, T__43=4, T__42=5, T__41=6, T__40=7, T__39=8, 
		T__38=9, T__37=10, T__36=11, T__35=12, T__34=13, T__33=14, T__32=15, T__31=16, 
		T__30=17, T__29=18, T__28=19, T__27=20, T__26=21, T__25=22, T__24=23, 
		T__23=24, T__22=25, T__21=26, T__20=27, T__19=28, T__18=29, T__17=30, 
		T__16=31, T__15=32, T__14=33, T__13=34, T__12=35, T__11=36, T__10=37, 
		T__9=38, T__8=39, T__7=40, T__6=41, T__5=42, T__4=43, T__3=44, T__2=45, 
		T__1=46, T__0=47, CHAR=48, STRING=49, INT=50, TI=51;
	public static final String[] tokenNames = {
		"<INVALID>", "'read'", "']'", "'default'", "','", "'['", "'while'", "'-'", 
		"'*'", "'**'", "'('", "':'", "'if'", "'<'", "'int'", "'!='", "'<='", "'{'", 
		"'break'", "'extends'", "'constructor'", "'else'", "'}'", "'char'", "'case'", 
		"'super'", "'do'", "'%'", "')'", "'.'", "'_'", "'+'", "'print'", "'for'", 
		"'='", "'return'", "';'", "'ident'", "'>'", "'null'", "'\"'", "'string'", 
		"'switch'", "'new'", "'=='", "'/'", "'>='", "'class'", "CHAR", "STRING", 
		"INT", "TI"
	};
	public static final int
		RULE_program = 0, RULE_classlist = 1, RULE_classdecl = 2, RULE_classbody = 3, 
		RULE_vardecl = 4, RULE_type = 5, RULE_constructdecl = 6, RULE_methoddecl = 7, 
		RULE_methodbody = 8, RULE_paramlist = 9, RULE_statement = 10, RULE_expr = 11, 
		RULE_atribstat = 12, RULE_printstat = 13, RULE_readstat = 14, RULE_returnstat = 15, 
		RULE_superstat = 16, RULE_ifstat = 17, RULE_forstat = 18, RULE_whilestat = 19, 
		RULE_dowhilestat = 20, RULE_switchcasestat = 21, RULE_lvalue = 22, RULE_alocexpr = 23, 
		RULE_arglist = 24, RULE_numexpr = 25, RULE_term = 26, RULE_unaryexpr = 27, 
		RULE_factor = 28, RULE_statlist = 29, RULE_ident = 30;
	public static final String[] ruleNames = {
		"program", "classlist", "classdecl", "classbody", "vardecl", "type", "constructdecl", 
		"methoddecl", "methodbody", "paramlist", "statement", "expr", "atribstat", 
		"printstat", "readstat", "returnstat", "superstat", "ifstat", "forstat", 
		"whilestat", "dowhilestat", "switchcasestat", "lvalue", "alocexpr", "arglist", 
		"numexpr", "term", "unaryexpr", "factor", "statlist", "ident"
	};

	@Override
	public String getGrammarFileName() { return "AnaliseSemantica.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public AnaliseSemanticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ClasslistContext classlist() {
			return getRuleContext(ClasslistContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if (_la==47) {
				{
				setState(62); classlist();
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

	public static class ClasslistContext extends ParserRuleContext {
		public ClasslistContext classlist() {
			return getRuleContext(ClasslistContext.class,0);
		}
		public ClassdeclContext classdecl() {
			return getRuleContext(ClassdeclContext.class,0);
		}
		public ClasslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterClasslist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitClasslist(this);
		}
	}

	public final ClasslistContext classlist() throws RecognitionException {
		ClasslistContext _localctx = new ClasslistContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); classdecl();
			setState(67);
			_la = _input.LA(1);
			if (_la==47) {
				{
				setState(66); classlist();
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

	public static class ClassdeclContext extends ParserRuleContext {
		public ClassbodyContext classbody() {
			return getRuleContext(ClassbodyContext.class,0);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public ClassdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterClassdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitClassdecl(this);
		}
	}

	public final ClassdeclContext classdecl() throws RecognitionException {
		ClassdeclContext _localctx = new ClassdeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classdecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); match(47);
			setState(70); ident();
			setState(73);
			_la = _input.LA(1);
			if (_la==19) {
				{
				setState(71); match(19);
				setState(72); ident();
				}
			}

			setState(75); classbody();
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

	public static class ClassbodyContext extends ParserRuleContext {
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public MethoddeclContext methoddecl(int i) {
			return getRuleContext(MethoddeclContext.class,i);
		}
		public List<MethoddeclContext> methoddecl() {
			return getRuleContexts(MethoddeclContext.class);
		}
		public List<ConstructdeclContext> constructdecl() {
			return getRuleContexts(ConstructdeclContext.class);
		}
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public ConstructdeclContext constructdecl(int i) {
			return getRuleContext(ConstructdeclContext.class,i);
		}
		public ClasslistContext classlist() {
			return getRuleContext(ClasslistContext.class,0);
		}
		public ClassbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterClassbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitClassbody(this);
		}
	}

	public final ClassbodyContext classbody() throws RecognitionException {
		ClassbodyContext _localctx = new ClassbodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classbody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77); match(17);
			setState(79);
			_la = _input.LA(1);
			if (_la==47) {
				{
				setState(78); classlist();
				}
			}

			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(81); vardecl();
					setState(82); match(36);
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==20) {
				{
				{
				setState(89); constructdecl();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 14) | (1L << 23) | (1L << 41) | (1L << CHAR) | (1L << STRING))) != 0)) {
				{
				{
				setState(95); methoddecl();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101); match(22);
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
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitVardecl(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vardecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); type();
			setState(104); ident();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(105); match(5);
				setState(106); match(2);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(112); match(4);
				setState(113); ident();
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==5) {
					{
					{
					setState(114); match(5);
					setState(115); match(2);
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(125);
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

	public static class TypeContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(130);
			switch (_input.LA(1)) {
			case 41:
				enterOuterAlt(_localctx, 1);
				{
				setState(126); match(41);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 2);
				{
				setState(127); match(14);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 3);
				{
				setState(128); match(23);
				}
				break;
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(129); ident();
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

	public static class ConstructdeclContext extends ParserRuleContext {
		public MethodbodyContext methodbody() {
			return getRuleContext(MethodbodyContext.class,0);
		}
		public ConstructdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterConstructdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitConstructdecl(this);
		}
	}

	public final ConstructdeclContext constructdecl() throws RecognitionException {
		ConstructdeclContext _localctx = new ConstructdeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constructdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); match(20);
			setState(133); methodbody();
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

	public static class MethoddeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodbodyContext methodbody() {
			return getRuleContext(MethodbodyContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public MethoddeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methoddecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterMethoddecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitMethoddecl(this);
		}
	}

	public final MethoddeclContext methoddecl() throws RecognitionException {
		MethoddeclContext _localctx = new MethoddeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methoddecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); type();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(136); match(5);
				setState(137); match(2);
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143); ident();
			setState(144); methodbody();
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

	public static class MethodbodyContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public MethodbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterMethodbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitMethodbody(this);
		}
	}

	public final MethodbodyContext methodbody() throws RecognitionException {
		MethodbodyContext _localctx = new MethodbodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodbody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); match(10);
			setState(147); paramlist();
			setState(148); match(28);
			setState(149); statement();
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

	public static class ParamlistContext extends ParserRuleContext {
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public ParamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterParamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitParamlist(this);
		}
	}

	public final ParamlistContext paramlist() throws RecognitionException {
		ParamlistContext _localctx = new ParamlistContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_paramlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 14) | (1L << 23) | (1L << 41) | (1L << CHAR) | (1L << STRING))) != 0)) {
				{
				setState(151); type();
				setState(152); ident();
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==5) {
					{
					{
					setState(153); match(5);
					setState(154); match(2);
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(160); match(4);
					setState(161); type();
					setState(162); ident();
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==5) {
						{
						{
						setState(163); match(5);
						setState(164); match(2);
						}
						}
						setState(169);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(174);
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

	public static class StatementContext extends ParserRuleContext {
		public AtribstatContext atribstat() {
			return getRuleContext(AtribstatContext.class,0);
		}
		public ForstatContext forstat() {
			return getRuleContext(ForstatContext.class,0);
		}
		public StatlistContext statlist() {
			return getRuleContext(StatlistContext.class,0);
		}
		public DowhilestatContext dowhilestat() {
			return getRuleContext(DowhilestatContext.class,0);
		}
		public ReadstatContext readstat() {
			return getRuleContext(ReadstatContext.class,0);
		}
		public ReturnstatContext returnstat() {
			return getRuleContext(ReturnstatContext.class,0);
		}
		public PrintstatContext printstat() {
			return getRuleContext(PrintstatContext.class,0);
		}
		public SwitchcasestatContext switchcasestat() {
			return getRuleContext(SwitchcasestatContext.class,0);
		}
		public SuperstatContext superstat() {
			return getRuleContext(SuperstatContext.class,0);
		}
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public IfstatContext ifstat() {
			return getRuleContext(IfstatContext.class,0);
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
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		try {
			setState(209);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177); vardecl();
				setState(178); match(36);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180); atribstat();
				setState(181); match(36);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183); printstat();
				setState(184); match(36);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(186); readstat();
				setState(187); match(36);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(189); returnstat();
				setState(190); match(36);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(192); superstat();
				setState(193); match(36);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(195); ifstat();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(196); whilestat();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(197); forstat();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(198); match(17);
				setState(199); statlist();
				setState(200); match(22);
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(202); dowhilestat();
				setState(203); match(36);
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(205); switchcasestat();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(206); match(18);
				setState(207); match(36);
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(208); match(36);
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

	public static class ExprContext extends ParserRuleContext {
		public NumexprContext numexpr(int i) {
			return getRuleContext(NumexprContext.class,i);
		}
		public List<NumexprContext> numexpr() {
			return getRuleContexts(NumexprContext.class);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211); numexpr();
			setState(214);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 13) | (1L << 15) | (1L << 16) | (1L << 38) | (1L << 44) | (1L << 46))) != 0)) {
				{
				setState(212);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 13) | (1L << 15) | (1L << 16) | (1L << 38) | (1L << 44) | (1L << 46))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(213); numexpr();
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

	public static class AtribstatContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AlocexprContext alocexpr() {
			return getRuleContext(AlocexprContext.class,0);
		}
		public AtribstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterAtribstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitAtribstat(this);
		}
	}

	public final AtribstatContext atribstat() throws RecognitionException {
		AtribstatContext _localctx = new AtribstatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_atribstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); lvalue();
			setState(217); match(34);
			setState(220);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(218); expr();
				}
				break;

			case 2:
				{
				setState(219); alocexpr();
				}
				break;
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

	public static class PrintstatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterPrintstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitPrintstat(this);
		}
	}

	public final PrintstatContext printstat() throws RecognitionException {
		PrintstatContext _localctx = new PrintstatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_printstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); match(32);
			setState(223); expr();
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

	public static class ReadstatContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ReadstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterReadstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitReadstat(this);
		}
	}

	public final ReadstatContext readstat() throws RecognitionException {
		ReadstatContext _localctx = new ReadstatContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_readstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); match(1);
			setState(226); lvalue();
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterReturnstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitReturnstat(this);
		}
	}

	public final ReturnstatContext returnstat() throws RecognitionException {
		ReturnstatContext _localctx = new ReturnstatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_returnstat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228); match(35);
			setState(230);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 10) | (1L << 31) | (1L << 39) | (1L << 40) | (1L << CHAR) | (1L << STRING) | (1L << INT))) != 0)) {
				{
				setState(229); expr();
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

	public static class SuperstatContext extends ParserRuleContext {
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public SuperstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterSuperstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitSuperstat(this);
		}
	}

	public final SuperstatContext superstat() throws RecognitionException {
		SuperstatContext _localctx = new SuperstatContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_superstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232); match(25);
			setState(233); match(10);
			setState(234); arglist();
			setState(235); match(28);
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

	public static class IfstatContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterIfstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitIfstat(this);
		}
	}

	public final IfstatContext ifstat() throws RecognitionException {
		IfstatContext _localctx = new IfstatContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237); match(12);
			setState(238); match(10);
			setState(239); expr();
			setState(240); match(28);
			setState(241); statement();
			setState(244);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(242); match(21);
				setState(243); statement();
				}
				break;
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

	public static class ForstatContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public AtribstatContext atribstat() {
			return getRuleContext(AtribstatContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ForstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterForstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitForstat(this);
		}
	}

	public final ForstatContext forstat() throws RecognitionException {
		ForstatContext _localctx = new ForstatContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_forstat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246); match(33);
			setState(247); match(10);
			setState(271);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				{
				setState(249);
				_la = _input.LA(1);
				if (_la==CHAR || _la==STRING) {
					{
					setState(248); atribstat();
					}
				}

				setState(251); match(36);
				setState(253);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 10) | (1L << 31) | (1L << 39) | (1L << 40) | (1L << CHAR) | (1L << STRING) | (1L << INT))) != 0)) {
					{
					setState(252); expr();
					}
				}

				setState(255); match(36);
				setState(257);
				_la = _input.LA(1);
				if (_la==CHAR || _la==STRING) {
					{
					setState(256); atribstat();
					}
				}

				}
				}
				break;

			case 2:
				{
				{
				setState(259); type();
				setState(260); match(37);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==5) {
					{
					{
					setState(261); match(5);
					setState(262); match(2);
					}
					}
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(268); match(11);
				setState(269); lvalue();
				}
				}
				break;
			}
			setState(273); match(28);
			setState(274); statement();
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhilestatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterWhilestat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitWhilestat(this);
		}
	}

	public final WhilestatContext whilestat() throws RecognitionException {
		WhilestatContext _localctx = new WhilestatContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whilestat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276); match(6);
			setState(277); match(10);
			setState(278); expr();
			setState(279); match(28);
			setState(280); statement();
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

	public static class DowhilestatContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DowhilestatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhilestat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterDowhilestat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitDowhilestat(this);
		}
	}

	public final DowhilestatContext dowhilestat() throws RecognitionException {
		DowhilestatContext _localctx = new DowhilestatContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dowhilestat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282); match(26);
			setState(283); statement();
			setState(284); match(6);
			setState(285); match(10);
			setState(286); expr();
			setState(287); match(28);
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

	public static class SwitchcasestatContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public SwitchcasestatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchcasestat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterSwitchcasestat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitSwitchcasestat(this);
		}
	}

	public final SwitchcasestatContext switchcasestat() throws RecognitionException {
		SwitchcasestatContext _localctx = new SwitchcasestatContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_switchcasestat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289); match(42);
			setState(290); match(10);
			setState(291); ident();
			setState(292); match(28);
			setState(293); match(17);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==24) {
				{
				{
				setState(294); match(24);
				setState(295); expr();
				setState(296); match(11);
				setState(297); statement();
				setState(298); match(18);
				setState(299); match(36);
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306); match(3);
			setState(307); match(11);
			setState(308); statement();
			setState(309); match(22);
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

	public static class LvalueContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ArglistContext arglist(int i) {
			return getRuleContext(ArglistContext.class,i);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public List<ArglistContext> arglist() {
			return getRuleContexts(ArglistContext.class);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitLvalue(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_lvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311); ident();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5 || _la==29) {
				{
				setState(324);
				switch (_input.LA(1)) {
				case 5:
					{
					setState(312); match(5);
					setState(313); expr();
					setState(314); match(2);
					}
					break;
				case 29:
					{
					setState(316); match(29);
					setState(317); ident();
					setState(322);
					_la = _input.LA(1);
					if (_la==10) {
						{
						setState(318); match(10);
						setState(319); arglist();
						setState(320); match(28);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(328);
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

	public static class AlocexprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public AlocexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alocexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterAlocexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitAlocexpr(this);
		}
	}

	public final AlocexprContext alocexpr() throws RecognitionException {
		AlocexprContext _localctx = new AlocexprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_alocexpr);
		int _la;
		try {
			setState(344);
			switch (_input.LA(1)) {
			case 43:
				enterOuterAlt(_localctx, 1);
				{
				setState(329); match(43);
				{
				setState(330); ident();
				setState(331); match(10);
				setState(332); arglist();
				setState(333); match(28);
				}
				}
				break;
			case 14:
			case 23:
			case 41:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(335); type();
				setState(340); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(336); match(5);
					setState(337); expr();
					setState(338); match(2);
					}
					}
					setState(342); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==5 );
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

	public static class ArglistContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterArglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitArglist(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arglist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 10) | (1L << 31) | (1L << 39) | (1L << 40) | (1L << CHAR) | (1L << STRING) | (1L << INT))) != 0)) {
				{
				setState(346); expr();
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(347); match(4);
					setState(348); expr();
					}
					}
					setState(353);
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

	public static class NumexprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public NumexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterNumexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitNumexpr(this);
		}
	}

	public final NumexprContext numexpr() throws RecognitionException {
		NumexprContext _localctx = new NumexprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_numexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356); term();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==7 || _la==31) {
				{
				{
				setState(357);
				_la = _input.LA(1);
				if ( !(_la==7 || _la==31) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(358); term();
				}
				}
				setState(363);
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

	public static class TermContext extends ParserRuleContext {
		public UnaryexprContext unaryexpr(int i) {
			return getRuleContext(UnaryexprContext.class,i);
		}
		public List<UnaryexprContext> unaryexpr() {
			return getRuleContexts(UnaryexprContext.class);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364); unaryexpr();
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 9) | (1L << 27) | (1L << 45))) != 0)) {
				{
				{
				setState(365);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 9) | (1L << 27) | (1L << 45))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(366); unaryexpr();
				}
				}
				setState(371);
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

	public static class UnaryexprContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public UnaryexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterUnaryexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitUnaryexpr(this);
		}
	}

	public final UnaryexprContext unaryexpr() throws RecognitionException {
		UnaryexprContext _localctx = new UnaryexprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_unaryexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_la = _input.LA(1);
			if (_la==7 || _la==31) {
				{
				setState(372);
				_la = _input.LA(1);
				if ( !(_la==7 || _la==31) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(375); factor();
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

	public static class FactorContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode INT() { return getToken(AnaliseSemanticaParser.INT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(AnaliseSemanticaParser.STRING, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(377); match(INT);
				}
				break;
			case 40:
				{
				setState(378); match(40);
				setState(379); match(STRING);
				setState(380); match(40);
				}
				break;
			case 39:
				{
				setState(381); match(39);
				}
				break;
			case CHAR:
			case STRING:
				{
				setState(382); lvalue();
				}
				break;
			case 10:
				{
				setState(383); match(10);
				setState(384); expr();
				setState(385); match(28);
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

	public static class StatlistContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<StatlistContext> statlist() {
			return getRuleContexts(StatlistContext.class);
		}
		public StatlistContext statlist(int i) {
			return getRuleContext(StatlistContext.class,i);
		}
		public StatlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterStatlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitStatlist(this);
		}
	}

	public final StatlistContext statlist() throws RecognitionException {
		StatlistContext _localctx = new StatlistContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_statlist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(389); statement();
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(390); statlist();
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static class IdentContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AnaliseSemanticaParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(AnaliseSemanticaParser.CHAR, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnaliseSemanticaListener ) ((AnaliseSemanticaListener)listener).exitIdent(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_la = _input.LA(1);
			if ( !(_la==CHAR || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==30) {
				{
				{
				setState(397); match(30);
				}
				}
				setState(402);
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\65\u0196\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\5\2B\n\2\3\3\3\3\5\3F\n\3\3\4\3\4\3\4\3\4\5\4L\n\4\3\4\3\4\3\5\3\5\5"+
		"\5R\n\5\3\5\3\5\3\5\7\5W\n\5\f\5\16\5Z\13\5\3\5\7\5]\n\5\f\5\16\5`\13"+
		"\5\3\5\7\5c\n\5\f\5\16\5f\13\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6n\n\6\f\6\16"+
		"\6q\13\6\3\6\3\6\3\6\3\6\7\6w\n\6\f\6\16\6z\13\6\7\6|\n\6\f\6\16\6\177"+
		"\13\6\3\7\3\7\3\7\3\7\5\7\u0085\n\7\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u008d"+
		"\n\t\f\t\16\t\u0090\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\7\13\u009e\n\13\f\13\16\13\u00a1\13\13\3\13\3\13\3\13\3\13\3\13"+
		"\7\13\u00a8\n\13\f\13\16\13\u00ab\13\13\7\13\u00ad\n\13\f\13\16\13\u00b0"+
		"\13\13\5\13\u00b2\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u00d4\n\f\3\r\3\r\3\r\5\r\u00d9\n\r\3\16\3\16\3\16\3\16"+
		"\5\16\u00df\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\5\21\u00e9\n"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f7"+
		"\n\23\3\24\3\24\3\24\5\24\u00fc\n\24\3\24\3\24\5\24\u0100\n\24\3\24\3"+
		"\24\5\24\u0104\n\24\3\24\3\24\3\24\3\24\7\24\u010a\n\24\f\24\16\24\u010d"+
		"\13\24\3\24\3\24\3\24\5\24\u0112\n\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0130\n\27\f\27\16\27\u0133"+
		"\13\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u0145\n\30\7\30\u0147\n\30\f\30\16\30\u014a\13\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\6\31\u0157\n\31"+
		"\r\31\16\31\u0158\5\31\u015b\n\31\3\32\3\32\3\32\7\32\u0160\n\32\f\32"+
		"\16\32\u0163\13\32\5\32\u0165\n\32\3\33\3\33\3\33\7\33\u016a\n\33\f\33"+
		"\16\33\u016d\13\33\3\34\3\34\3\34\7\34\u0172\n\34\f\34\16\34\u0175\13"+
		"\34\3\35\5\35\u0178\n\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u0186\n\36\3\37\3\37\7\37\u018a\n\37\f\37\16\37\u018d"+
		"\13\37\3 \3 \7 \u0191\n \f \16 \u0194\13 \3 \2!\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\6\7\2\17\17\21\22((..\60\60"+
		"\4\2\t\t!!\5\2\n\13\35\35//\3\2\62\63\u01af\2A\3\2\2\2\4C\3\2\2\2\6G\3"+
		"\2\2\2\bO\3\2\2\2\ni\3\2\2\2\f\u0084\3\2\2\2\16\u0086\3\2\2\2\20\u0089"+
		"\3\2\2\2\22\u0094\3\2\2\2\24\u00b1\3\2\2\2\26\u00d3\3\2\2\2\30\u00d5\3"+
		"\2\2\2\32\u00da\3\2\2\2\34\u00e0\3\2\2\2\36\u00e3\3\2\2\2 \u00e6\3\2\2"+
		"\2\"\u00ea\3\2\2\2$\u00ef\3\2\2\2&\u00f8\3\2\2\2(\u0116\3\2\2\2*\u011c"+
		"\3\2\2\2,\u0123\3\2\2\2.\u0139\3\2\2\2\60\u015a\3\2\2\2\62\u0164\3\2\2"+
		"\2\64\u0166\3\2\2\2\66\u016e\3\2\2\28\u0177\3\2\2\2:\u0185\3\2\2\2<\u0187"+
		"\3\2\2\2>\u018e\3\2\2\2@B\5\4\3\2A@\3\2\2\2AB\3\2\2\2B\3\3\2\2\2CE\5\6"+
		"\4\2DF\5\4\3\2ED\3\2\2\2EF\3\2\2\2F\5\3\2\2\2GH\7\61\2\2HK\5> \2IJ\7\25"+
		"\2\2JL\5> \2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\5\b\5\2N\7\3\2\2\2OQ\7\23"+
		"\2\2PR\5\4\3\2QP\3\2\2\2QR\3\2\2\2RX\3\2\2\2ST\5\n\6\2TU\7&\2\2UW\3\2"+
		"\2\2VS\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y^\3\2\2\2ZX\3\2\2\2[]\5\16"+
		"\b\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_d\3\2\2\2`^\3\2\2\2ac\5"+
		"\20\t\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh"+
		"\7\30\2\2h\t\3\2\2\2ij\5\f\7\2jo\5> \2kl\7\7\2\2ln\7\4\2\2mk\3\2\2\2n"+
		"q\3\2\2\2om\3\2\2\2op\3\2\2\2p}\3\2\2\2qo\3\2\2\2rs\7\6\2\2sx\5> \2tu"+
		"\7\7\2\2uw\7\4\2\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y|\3\2\2\2z"+
		"x\3\2\2\2{r\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\13\3\2\2\2\177}"+
		"\3\2\2\2\u0080\u0085\7+\2\2\u0081\u0085\7\20\2\2\u0082\u0085\7\31\2\2"+
		"\u0083\u0085\5> \2\u0084\u0080\3\2\2\2\u0084\u0081\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0083\3\2\2\2\u0085\r\3\2\2\2\u0086\u0087\7\26\2\2\u0087"+
		"\u0088\5\22\n\2\u0088\17\3\2\2\2\u0089\u008e\5\f\7\2\u008a\u008b\7\7\2"+
		"\2\u008b\u008d\7\4\2\2\u008c\u008a\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0092\5> \2\u0092\u0093\5\22\n\2\u0093\21\3\2\2\2\u0094\u0095\7\f\2\2"+
		"\u0095\u0096\5\24\13\2\u0096\u0097\7\36\2\2\u0097\u0098\5\26\f\2\u0098"+
		"\23\3\2\2\2\u0099\u009a\5\f\7\2\u009a\u009f\5> \2\u009b\u009c\7\7\2\2"+
		"\u009c\u009e\7\4\2\2\u009d\u009b\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00ae\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u00a3\7\6\2\2\u00a3\u00a4\5\f\7\2\u00a4\u00a9\5> \2\u00a5\u00a6\7\7\2"+
		"\2\u00a6\u00a8\7\4\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\u00a2\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u0099\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\25\3\2\2\2\u00b3\u00b4\5\n\6\2\u00b4\u00b5\7&\2\2"+
		"\u00b5\u00d4\3\2\2\2\u00b6\u00b7\5\32\16\2\u00b7\u00b8\7&\2\2\u00b8\u00d4"+
		"\3\2\2\2\u00b9\u00ba\5\34\17\2\u00ba\u00bb\7&\2\2\u00bb\u00d4\3\2\2\2"+
		"\u00bc\u00bd\5\36\20\2\u00bd\u00be\7&\2\2\u00be\u00d4\3\2\2\2\u00bf\u00c0"+
		"\5 \21\2\u00c0\u00c1\7&\2\2\u00c1\u00d4\3\2\2\2\u00c2\u00c3\5\"\22\2\u00c3"+
		"\u00c4\7&\2\2\u00c4\u00d4\3\2\2\2\u00c5\u00d4\5$\23\2\u00c6\u00d4\5(\25"+
		"\2\u00c7\u00d4\5&\24\2\u00c8\u00c9\7\23\2\2\u00c9\u00ca\5<\37\2\u00ca"+
		"\u00cb\7\30\2\2\u00cb\u00d4\3\2\2\2\u00cc\u00cd\5*\26\2\u00cd\u00ce\7"+
		"&\2\2\u00ce\u00d4\3\2\2\2\u00cf\u00d4\5,\27\2\u00d0\u00d1\7\24\2\2\u00d1"+
		"\u00d4\7&\2\2\u00d2\u00d4\7&\2\2\u00d3\u00b3\3\2\2\2\u00d3\u00b6\3\2\2"+
		"\2\u00d3\u00b9\3\2\2\2\u00d3\u00bc\3\2\2\2\u00d3\u00bf\3\2\2\2\u00d3\u00c2"+
		"\3\2\2\2\u00d3\u00c5\3\2\2\2\u00d3\u00c6\3\2\2\2\u00d3\u00c7\3\2\2\2\u00d3"+
		"\u00c8\3\2\2\2\u00d3\u00cc\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d3\u00d0\3\2"+
		"\2\2\u00d3\u00d2\3\2\2\2\u00d4\27\3\2\2\2\u00d5\u00d8\5\64\33\2\u00d6"+
		"\u00d7\t\2\2\2\u00d7\u00d9\5\64\33\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3"+
		"\2\2\2\u00d9\31\3\2\2\2\u00da\u00db\5.\30\2\u00db\u00de\7$\2\2\u00dc\u00df"+
		"\5\30\r\2\u00dd\u00df\5\60\31\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2"+
		"\2\u00df\33\3\2\2\2\u00e0\u00e1\7\"\2\2\u00e1\u00e2\5\30\r\2\u00e2\35"+
		"\3\2\2\2\u00e3\u00e4\7\3\2\2\u00e4\u00e5\5.\30\2\u00e5\37\3\2\2\2\u00e6"+
		"\u00e8\7%\2\2\u00e7\u00e9\5\30\r\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9!\3\2\2\2\u00ea\u00eb\7\33\2\2\u00eb\u00ec\7\f\2\2\u00ec\u00ed"+
		"\5\62\32\2\u00ed\u00ee\7\36\2\2\u00ee#\3\2\2\2\u00ef\u00f0\7\16\2\2\u00f0"+
		"\u00f1\7\f\2\2\u00f1\u00f2\5\30\r\2\u00f2\u00f3\7\36\2\2\u00f3\u00f6\5"+
		"\26\f\2\u00f4\u00f5\7\27\2\2\u00f5\u00f7\5\26\f\2\u00f6\u00f4\3\2\2\2"+
		"\u00f6\u00f7\3\2\2\2\u00f7%\3\2\2\2\u00f8\u00f9\7#\2\2\u00f9\u0111\7\f"+
		"\2\2\u00fa\u00fc\5\32\16\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00ff\7&\2\2\u00fe\u0100\5\30\r\2\u00ff\u00fe\3\2"+
		"\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\7&\2\2\u0102"+
		"\u0104\5\32\16\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0112\3"+
		"\2\2\2\u0105\u0106\5\f\7\2\u0106\u010b\7\'\2\2\u0107\u0108\7\7\2\2\u0108"+
		"\u010a\7\4\2\2\u0109\u0107\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e"+
		"\u010f\7\r\2\2\u010f\u0110\5.\30\2\u0110\u0112\3\2\2\2\u0111\u00fb\3\2"+
		"\2\2\u0111\u0105\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\7\36\2\2\u0114"+
		"\u0115\5\26\f\2\u0115\'\3\2\2\2\u0116\u0117\7\b\2\2\u0117\u0118\7\f\2"+
		"\2\u0118\u0119\5\30\r\2\u0119\u011a\7\36\2\2\u011a\u011b\5\26\f\2\u011b"+
		")\3\2\2\2\u011c\u011d\7\34\2\2\u011d\u011e\5\26\f\2\u011e\u011f\7\b\2"+
		"\2\u011f\u0120\7\f\2\2\u0120\u0121\5\30\r\2\u0121\u0122\7\36\2\2\u0122"+
		"+\3\2\2\2\u0123\u0124\7,\2\2\u0124\u0125\7\f\2\2\u0125\u0126\5> \2\u0126"+
		"\u0127\7\36\2\2\u0127\u0131\7\23\2\2\u0128\u0129\7\32\2\2\u0129\u012a"+
		"\5\30\r\2\u012a\u012b\7\r\2\2\u012b\u012c\5\26\f\2\u012c\u012d\7\24\2"+
		"\2\u012d\u012e\7&\2\2\u012e\u0130\3\2\2\2\u012f\u0128\3\2\2\2\u0130\u0133"+
		"\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0134\u0135\7\5\2\2\u0135\u0136\7\r\2\2\u0136\u0137\5\26"+
		"\f\2\u0137\u0138\7\30\2\2\u0138-\3\2\2\2\u0139\u0148\5> \2\u013a\u013b"+
		"\7\7\2\2\u013b\u013c\5\30\r\2\u013c\u013d\7\4\2\2\u013d\u0147\3\2\2\2"+
		"\u013e\u013f\7\37\2\2\u013f\u0144\5> \2\u0140\u0141\7\f\2\2\u0141\u0142"+
		"\5\62\32\2\u0142\u0143\7\36\2\2\u0143\u0145\3\2\2\2\u0144\u0140\3\2\2"+
		"\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u013a\3\2\2\2\u0146\u013e"+
		"\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"/\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\7-\2\2\u014c\u014d\5> \2\u014d"+
		"\u014e\7\f\2\2\u014e\u014f\5\62\32\2\u014f\u0150\7\36\2\2\u0150\u015b"+
		"\3\2\2\2\u0151\u0156\5\f\7\2\u0152\u0153\7\7\2\2\u0153\u0154\5\30\r\2"+
		"\u0154\u0155\7\4\2\2\u0155\u0157\3\2\2\2\u0156\u0152\3\2\2\2\u0157\u0158"+
		"\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a"+
		"\u014b\3\2\2\2\u015a\u0151\3\2\2\2\u015b\61\3\2\2\2\u015c\u0161\5\30\r"+
		"\2\u015d\u015e\7\6\2\2\u015e\u0160\5\30\r\2\u015f\u015d\3\2\2\2\u0160"+
		"\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0165\3\2"+
		"\2\2\u0163\u0161\3\2\2\2\u0164\u015c\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\63\3\2\2\2\u0166\u016b\5\66\34\2\u0167\u0168\t\3\2\2\u0168\u016a\5\66"+
		"\34\2\u0169\u0167\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\65\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0173\58\35"+
		"\2\u016f\u0170\t\4\2\2\u0170\u0172\58\35\2\u0171\u016f\3\2\2\2\u0172\u0175"+
		"\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\67\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0176\u0178\t\3\2\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2"+
		"\2\2\u0178\u0179\3\2\2\2\u0179\u017a\5:\36\2\u017a9\3\2\2\2\u017b\u0186"+
		"\7\64\2\2\u017c\u017d\7*\2\2\u017d\u017e\7\63\2\2\u017e\u0186\7*\2\2\u017f"+
		"\u0186\7)\2\2\u0180\u0186\5.\30\2\u0181\u0182\7\f\2\2\u0182\u0183\5\30"+
		"\r\2\u0183\u0184\7\36\2\2\u0184\u0186\3\2\2\2\u0185\u017b\3\2\2\2\u0185"+
		"\u017c\3\2\2\2\u0185\u017f\3\2\2\2\u0185\u0180\3\2\2\2\u0185\u0181\3\2"+
		"\2\2\u0186;\3\2\2\2\u0187\u018b\5\26\f\2\u0188\u018a\5<\37\2\u0189\u0188"+
		"\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"=\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u0192\t\5\2\2\u018f\u0191\7 \2\2\u0190"+
		"\u018f\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2"+
		"\2\2\u0193?\3\2\2\2\u0194\u0192\3\2\2\2*AEKQX^dox}\u0084\u008e\u009f\u00a9"+
		"\u00ae\u00b1\u00d3\u00d8\u00de\u00e8\u00f6\u00fb\u00ff\u0103\u010b\u0111"+
		"\u0131\u0144\u0146\u0148\u0158\u015a\u0161\u0164\u016b\u0173\u0177\u0185"+
		"\u018b\u0192";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}