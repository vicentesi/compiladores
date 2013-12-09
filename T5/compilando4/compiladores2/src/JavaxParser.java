import java.util.HashMap;

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.BitSet;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

// $ANTLR 3.2 Sep 23, 2009 12:02:23 ../compiladores2/src/javax.g 2010-05-31 10:46:51

public class JavaxParser extends Parser {
	public static final String[] tokenNames = new String[] { "<invalid>",
			"<EOR>", "<DOWN>", "<UP>", "LPAREN", "RPAREN", "LBRACK", "RBRACK",
			"COLON", "COMMA", "SEMI", "DOT", "PLUS", "MINUS", "STAR", "SLASH",
			"POWER", "LESS", "GREATER", "ASSIGN", "PERCENT", "LCURLY",
			"RCURLY", "EQUAL", "NOTEQUAL", "LESSEQUAL", "GREATEREQUAL", "AND",
			"OR", "NOT", "FALSE", "TRUE", "TO", "FOR", "REPEAT", "WHILE", "IF",
			"ELSE", "ELSEIF", "UNTIL", "DO", "WITH", "IN", "END", "RETURN",
			"CHEST", "THEN", "T_INT", "T_REAL", "T_STRING", "T_CHAIN",
			"T_VOID", "T_BOOL", "NAME", "INT", "FLOAT", "NORMALSTRING",
			"LETTER", "DIGIT", "EscapeSequence", "WS", "COMMENT",
			"LINE_COMMENT", "LETTERL", "LETTERU" };
	public static final int STAR = 14;
	public static final int LBRACK = 6;
	public static final int WHILE = 35;
	public static final int LETTER = 57;
	public static final int T_STRING = 49;
	public static final int T_BOOL = 52;
	public static final int GREATEREQUAL = 26;
	public static final int FOR = 33;
	public static final int DO = 40;
	public static final int FLOAT = 55;
	public static final int NOT = 29;
	public static final int AND = 27;
	public static final int EOF = -1;
	public static final int T_VOID = 51;
	public static final int T_REAL = 48;
	public static final int LPAREN = 4;
	public static final int IF = 36;
	public static final int NOTEQUAL = 24;
	public static final int RPAREN = 5;
	public static final int NAME = 53;
	public static final int GREATER = 18;
	public static final int SLASH = 15;
	public static final int THEN = 46;
	public static final int IN = 42;
	public static final int COMMA = 9;
	public static final int T_INT = 47;
	public static final int EQUAL = 23;
	public static final int RETURN = 44;
	public static final int LESS = 17;
	public static final int PLUS = 12;
	public static final int DIGIT = 58;
	public static final int COMMENT = 61;
	public static final int DOT = 11;
	public static final int WITH = 41;
	public static final int RBRACK = 7;
	public static final int PERCENT = 20;
	public static final int LINE_COMMENT = 62;
	public static final int TO = 32;
	public static final int ELSE = 37;
	public static final int POWER = 16;
	public static final int LCURLY = 21;
	public static final int INT = 54;
	public static final int LETTERU = 64;
	public static final int MINUS = 13;
	public static final int CHEST = 45;
	public static final int SEMI = 10;
	public static final int TRUE = 31;
	public static final int LETTERL = 63;
	public static final int ELSEIF = 38;
	public static final int COLON = 8;
	public static final int NORMALSTRING = 56;
	public static final int WS = 60;
	public static final int T_CHAIN = 50;
	public static final int UNTIL = 39;
	public static final int RCURLY = 22;
	public static final int OR = 28;
	public static final int ASSIGN = 19;
	public static final int REPEAT = 34;
	public static final int END = 43;
	public static final int FALSE = 30;
	public static final int LESSEQUAL = 25;
	public static final int EscapeSequence = 59;

	// delegates
	// delegators

	public JavaxParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}

	public JavaxParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);

	}

	public String[] getTokenNames() {
		return JavaxParser.tokenNames;
	}

	public String getGrammarFileName() {
		return "../compiladores2/src/javax.g";
	}

	Semanticator s = new Semanticator(this);

	// $ANTLR start "javax"
	// ../compiladores2/src/javax.g:100:1: javax : ( ( vardecl SEMI )* ( stat )
	// )+ ;
	public final void javax() throws RecognitionException {
		try {
			// ../compiladores2/src/javax.g:101:2: ( ( ( vardecl SEMI )* ( stat
			// ) )+ )
			// ../compiladores2/src/javax.g:101:4: ( ( vardecl SEMI )* ( stat )
			// )+
			{
				// ../compiladores2/src/javax.g:101:4: ( ( vardecl SEMI )* (
				// stat ) )+
				int cnt2 = 0;
				loop2: do {
					int alt2 = 2;
					int LA2_0 = input.LA(1);

					if ((LA2_0 == CHEST || (LA2_0 >= T_INT && LA2_0 <= T_BOOL))) {
						alt2 = 1;
					}

					switch (alt2) {
					case 1:
						// ../compiladores2/src/javax.g:101:5: ( vardecl SEMI )*
						// ( stat )
					{
						// ../compiladores2/src/javax.g:101:5: ( vardecl SEMI )*
						loop1: do {
							int alt1 = 2;
							alt1 = dfa1.predict(input);
							switch (alt1) {
							case 1:
								// ../compiladores2/src/javax.g:101:6: vardecl
								// SEMI
							{
								pushFollow(FOLLOW_vardecl_in_javax681);
								vardecl();

								state._fsp--;

								match(input, SEMI, FOLLOW_SEMI_in_javax683);

							}
								break;

							default:
								break loop1;
							}
						} while (true);

						// ../compiladores2/src/javax.g:101:20: ( stat )
						// ../compiladores2/src/javax.g:101:21: stat
						{
							pushFollow(FOLLOW_stat_in_javax687);
							stat();

							state._fsp--;

						}

					}
						break;

					default:
						if (cnt2 >= 1)
							break loop2;
						EarlyExitException eee = new EarlyExitException(2,
								input);
						throw eee;
					}
					cnt2++;
				} while (true);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "javax"

	// $ANTLR start "stat"
	// ../compiladores2/src/javax.g:104:1: stat : ( def_func | def_chest );
	public final void stat() throws RecognitionException {
		try {
			// ../compiladores2/src/javax.g:105:2: ( def_func | def_chest )
			int alt3 = 2;
			int LA3_0 = input.LA(1);

			if (((LA3_0 >= T_INT && LA3_0 <= T_BOOL))) {
				alt3 = 1;
			} else if ((LA3_0 == CHEST)) {
				alt3 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException("", 3, 0,
						input);

				throw nvae;
			}
			switch (alt3) {
			case 1:
				// ../compiladores2/src/javax.g:105:4: def_func
			{
				pushFollow(FOLLOW_def_func_in_stat702);
				def_func();

				state._fsp--;

			}
				break;
			case 2:
				// ../compiladores2/src/javax.g:106:4: def_chest
			{
				pushFollow(FOLLOW_def_chest_in_stat710);
				def_chest();

				state._fsp--;

			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "stat"

	// $ANTLR start "weakstat"
	// ../compiladores2/src/javax.g:109:1: weakstat returns [ String type ] : (
	// varatrib SEMI | vardecl SEMI | funccall SEMI | def_if | def_while | t=
	// def_return SEMI | chestaccess SEMI | def_repeat );
	public final String weakstat() throws RecognitionException {
		String type = null;

		String t = null;

		try {
			// ../compiladores2/src/javax.g:110:2: ( varatrib SEMI | vardecl
			// SEMI | funccall SEMI | def_if | def_while | t= def_return SEMI |
			// chestaccess SEMI | def_repeat )
			int alt4 = 8;
			alt4 = dfa4.predict(input);
			switch (alt4) {
			case 1:
				// ../compiladores2/src/javax.g:110:4: varatrib SEMI
			{
				pushFollow(FOLLOW_varatrib_in_weakstat725);
				varatrib();

				state._fsp--;

				match(input, SEMI, FOLLOW_SEMI_in_weakstat727);

			}
				break;
			case 2:
				// ../compiladores2/src/javax.g:111:4: vardecl SEMI
			{
				pushFollow(FOLLOW_vardecl_in_weakstat733);
				vardecl();

				state._fsp--;

				match(input, SEMI, FOLLOW_SEMI_in_weakstat739);

			}
				break;
			case 3:
				// ../compiladores2/src/javax.g:112:4: funccall SEMI
			{
				pushFollow(FOLLOW_funccall_in_weakstat745);
				funccall();

				state._fsp--;

				match(input, SEMI, FOLLOW_SEMI_in_weakstat747);

			}
				break;
			case 4:
				// ../compiladores2/src/javax.g:113:4: def_if
			{
				pushFollow(FOLLOW_def_if_in_weakstat753);
				def_if();

				state._fsp--;

			}
				break;
			case 5:
				// ../compiladores2/src/javax.g:114:4: def_while
			{
				pushFollow(FOLLOW_def_while_in_weakstat762);
				def_while();

				state._fsp--;

			}
				break;
			case 6:
				// ../compiladores2/src/javax.g:115:4: t= def_return SEMI
			{
				pushFollow(FOLLOW_def_return_in_weakstat773);
				t = def_return();

				state._fsp--;

				type = t;
				match(input, SEMI, FOLLOW_SEMI_in_weakstat777);

			}
				break;
			case 7:
				// ../compiladores2/src/javax.g:116:4: chestaccess SEMI
			{
				pushFollow(FOLLOW_chestaccess_in_weakstat783);
				chestaccess();

				state._fsp--;

				match(input, SEMI, FOLLOW_SEMI_in_weakstat785);

			}
				break;
			case 8:
				// ../compiladores2/src/javax.g:117:4: def_repeat
			{
				pushFollow(FOLLOW_def_repeat_in_weakstat794);
				def_repeat();

				state._fsp--;

			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return type;
	}

	// $ANTLR end "weakstat"

	// $ANTLR start "varatrib"
	// ../compiladores2/src/javax.g:120:1: varatrib : n= NAME ASSIGN t=
	// logic_op_expr ;
	public final void varatrib() throws RecognitionException {
		Token n = null;
		String t = null;

		try {
			// ../compiladores2/src/javax.g:121:2: (n= NAME ASSIGN t=
			// logic_op_expr )
			// ../compiladores2/src/javax.g:121:5: n= NAME ASSIGN t=
			// logic_op_expr
			{
				n = (Token) match(input, NAME, FOLLOW_NAME_in_varatrib809);
				match(input, ASSIGN, FOLLOW_ASSIGN_in_varatrib811);
				pushFollow(FOLLOW_logic_op_expr_in_varatrib815);
				t = logic_op_expr();

				state._fsp--;

				s.eval_assign(s.get_type(n.getText()), t, n.getText());

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "varatrib"

	// $ANTLR start "vardecl"
	// ../compiladores2/src/javax.g:124:1: vardecl : t= type v= NAME ( COMMA v=
	// NAME )* ;
	public final void vardecl() throws RecognitionException {
		Token v = null;
		String t = null;

		try {
			// ../compiladores2/src/javax.g:125:2: (t= type v= NAME ( COMMA v=
			// NAME )* )
			// ../compiladores2/src/javax.g:125:5: t= type v= NAME ( COMMA v=
			// NAME )*
			{
				pushFollow(FOLLOW_type_in_vardecl832);
				t = type();

				state._fsp--;

				v = (Token) match(input, NAME, FOLLOW_NAME_in_vardecl836);
				s.add_variable(v.getText(), t);
				// ../compiladores2/src/javax.g:125:56: ( COMMA v= NAME )*
				loop5: do {
					int alt5 = 2;
					int LA5_0 = input.LA(1);

					if ((LA5_0 == COMMA)) {
						alt5 = 1;
					}

					switch (alt5) {
					case 1:
						// ../compiladores2/src/javax.g:125:57: COMMA v= NAME
					{
						match(input, COMMA, FOLLOW_COMMA_in_vardecl842);
						v = (Token) match(input, NAME,
								FOLLOW_NAME_in_vardecl846);
						s.add_variable(v.getText(), t);

					}
						break;

					default:
						break loop5;
					}
				} while (true);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "vardecl"

	// $ANTLR start "funccall"
	// ../compiladores2/src/javax.g:128:1: funccall returns [ String type ] : n=
	// NAME LPAREN h= arglist RPAREN ;
	public final String funccall() throws RecognitionException {
		String type = null;

		Token n = null;
		HashMap<String, String> h = null;

		try {
			// ../compiladores2/src/javax.g:129:2: (n= NAME LPAREN h= arglist
			// RPAREN )
			// ../compiladores2/src/javax.g:129:5: n= NAME LPAREN h= arglist
			// RPAREN
			{
				n = (Token) match(input, NAME, FOLLOW_NAME_in_funccall871);
				match(input, LPAREN, FOLLOW_LPAREN_in_funccall873);
				pushFollow(FOLLOW_arglist_in_funccall877);
				h = arglist();

				state._fsp--;

				match(input, RPAREN, FOLLOW_RPAREN_in_funccall879);
				type = s.eval_funccall(n.getText(), h);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return type;
	}

	// $ANTLR end "funccall"

	// $ANTLR start "def_func"
	// ../compiladores2/src/javax.g:132:1: def_func : t= type n= NAME LPAREN h=
	// typedarglist RPAREN (tw= weakstat )* END ;
	public final void def_func() throws RecognitionException {
		Token n = null;
		String t = null;

		HashMap<String, String> h = null;

		String tw = null;

		try {
			// ../compiladores2/src/javax.g:133:2: (t= type n= NAME LPAREN h=
			// typedarglist RPAREN (tw= weakstat )* END )
			// ../compiladores2/src/javax.g:133:5: t= type n= NAME LPAREN h=
			// typedarglist RPAREN (tw= weakstat )* END
			{
				pushFollow(FOLLOW_type_in_def_func897);
				t = type();

				state._fsp--;

				n = (Token) match(input, NAME, FOLLOW_NAME_in_def_func901);
				match(input, LPAREN, FOLLOW_LPAREN_in_def_func903);
				pushFollow(FOLLOW_typedarglist_in_def_func907);
				h = typedarglist();

				state._fsp--;

				match(input, RPAREN, FOLLOW_RPAREN_in_def_func909);
				s.open_function_decl(t, h, n.getText());
				// ../compiladores2/src/javax.g:134:47: (tw= weakstat )*
				loop6: do {
					int alt6 = 2;
					int LA6_0 = input.LA(1);

					if (((LA6_0 >= REPEAT && LA6_0 <= IF) || LA6_0 == RETURN || (LA6_0 >= T_INT && LA6_0 <= NAME))) {
						alt6 = 1;
					}

					switch (alt6) {
					case 1:
						// ../compiladores2/src/javax.g:134:47: tw= weakstat
					{
						pushFollow(FOLLOW_weakstat_in_def_func919);
						tw = weakstat();

						state._fsp--;

					}
						break;

					default:
						break loop6;
					}
				} while (true);

				s.close_function_decl(tw);
				match(input, END, FOLLOW_END_in_def_func924);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "def_func"

	// $ANTLR start "def_if"
	// ../compiladores2/src/javax.g:137:1: def_if : IF logic_op_expr THEN (
	// weakstat )* ( END | ( ELSE ( weakstat )* END ) ) ;
	public final void def_if() throws RecognitionException {
		try {
			// ../compiladores2/src/javax.g:138:2: ( IF logic_op_expr THEN (
			// weakstat )* ( END | ( ELSE ( weakstat )* END ) ) )
			// ../compiladores2/src/javax.g:138:5: IF logic_op_expr THEN (
			// weakstat )* ( END | ( ELSE ( weakstat )* END ) )
			{
				match(input, IF, FOLLOW_IF_in_def_if937);
				pushFollow(FOLLOW_logic_op_expr_in_def_if939);
				logic_op_expr();

				state._fsp--;

				match(input, THEN, FOLLOW_THEN_in_def_if941);
				// ../compiladores2/src/javax.g:138:27: ( weakstat )*
				loop7: do {
					int alt7 = 2;
					int LA7_0 = input.LA(1);

					if (((LA7_0 >= REPEAT && LA7_0 <= IF) || LA7_0 == RETURN || (LA7_0 >= T_INT && LA7_0 <= NAME))) {
						alt7 = 1;
					}

					switch (alt7) {
					case 1:
						// ../compiladores2/src/javax.g:138:27: weakstat
					{
						pushFollow(FOLLOW_weakstat_in_def_if943);
						weakstat();

						state._fsp--;

					}
						break;

					default:
						break loop7;
					}
				} while (true);

				// ../compiladores2/src/javax.g:138:37: ( END | ( ELSE (
				// weakstat )* END ) )
				int alt9 = 2;
				int LA9_0 = input.LA(1);

				if ((LA9_0 == END)) {
					alt9 = 1;
				} else if ((LA9_0 == ELSE)) {
					alt9 = 2;
				} else {
					NoViableAltException nvae = new NoViableAltException("", 9,
							0, input);

					throw nvae;
				}
				switch (alt9) {
				case 1:
					// ../compiladores2/src/javax.g:138:39: END
				{
					match(input, END, FOLLOW_END_in_def_if948);

				}
					break;
				case 2:
					// ../compiladores2/src/javax.g:138:45: ( ELSE ( weakstat )*
					// END )
				{
					// ../compiladores2/src/javax.g:138:45: ( ELSE ( weakstat )*
					// END )
					// ../compiladores2/src/javax.g:138:47: ELSE ( weakstat )*
					// END
					{
						match(input, ELSE, FOLLOW_ELSE_in_def_if954);
						// ../compiladores2/src/javax.g:138:52: ( weakstat )*
						loop8: do {
							int alt8 = 2;
							int LA8_0 = input.LA(1);

							if (((LA8_0 >= REPEAT && LA8_0 <= IF)
									|| LA8_0 == RETURN || (LA8_0 >= T_INT && LA8_0 <= NAME))) {
								alt8 = 1;
							}

							switch (alt8) {
							case 1:
								// ../compiladores2/src/javax.g:138:52: weakstat
							{
								pushFollow(FOLLOW_weakstat_in_def_if956);
								weakstat();

								state._fsp--;

							}
								break;

							default:
								break loop8;
							}
						} while (true);

						match(input, END, FOLLOW_END_in_def_if959);

					}

				}
					break;

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "def_if"

	// $ANTLR start "def_repeat"
	// ../compiladores2/src/javax.g:141:1: def_repeat : REPEAT ( weakstat )*
	// UNTIL LPAREN logic_op_expr RPAREN END ;
	public final void def_repeat() throws RecognitionException {
		try {
			// ../compiladores2/src/javax.g:142:2: ( REPEAT ( weakstat )* UNTIL
			// LPAREN logic_op_expr RPAREN END )
			// ../compiladores2/src/javax.g:142:5: REPEAT ( weakstat )* UNTIL
			// LPAREN logic_op_expr RPAREN END
			{
				match(input, REPEAT, FOLLOW_REPEAT_in_def_repeat977);
				// ../compiladores2/src/javax.g:142:12: ( weakstat )*
				loop10: do {
					int alt10 = 2;
					int LA10_0 = input.LA(1);

					if (((LA10_0 >= REPEAT && LA10_0 <= IF) || LA10_0 == RETURN || (LA10_0 >= T_INT && LA10_0 <= NAME))) {
						alt10 = 1;
					}

					switch (alt10) {
					case 1:
						// ../compiladores2/src/javax.g:142:12: weakstat
					{
						pushFollow(FOLLOW_weakstat_in_def_repeat979);
						weakstat();

						state._fsp--;

					}
						break;

					default:
						break loop10;
					}
				} while (true);

				match(input, UNTIL, FOLLOW_UNTIL_in_def_repeat982);
				match(input, LPAREN, FOLLOW_LPAREN_in_def_repeat984);
				pushFollow(FOLLOW_logic_op_expr_in_def_repeat986);
				logic_op_expr();

				state._fsp--;

				match(input, RPAREN, FOLLOW_RPAREN_in_def_repeat988);
				match(input, END, FOLLOW_END_in_def_repeat990);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "def_repeat"

	// $ANTLR start "def_chest"
	// ../compiladores2/src/javax.g:145:1: def_chest : CHEST NAME COLON (
	// vardecl SEMI | funccall SEMI )* END ;
	public final void def_chest() throws RecognitionException {
		try {
			// ../compiladores2/src/javax.g:146:2: ( CHEST NAME COLON ( vardecl
			// SEMI | funccall SEMI )* END )
			// ../compiladores2/src/javax.g:146:4: CHEST NAME COLON ( vardecl
			// SEMI | funccall SEMI )* END
			{
				match(input, CHEST, FOLLOW_CHEST_in_def_chest1002);
				match(input, NAME, FOLLOW_NAME_in_def_chest1004);
				match(input, COLON, FOLLOW_COLON_in_def_chest1006);
				// ../compiladores2/src/javax.g:146:21: ( vardecl SEMI |
				// funccall SEMI )*
				loop11: do {
					int alt11 = 3;
					int LA11_0 = input.LA(1);

					if (((LA11_0 >= T_INT && LA11_0 <= T_BOOL))) {
						alt11 = 1;
					} else if ((LA11_0 == NAME)) {
						alt11 = 2;
					}

					switch (alt11) {
					case 1:
						// ../compiladores2/src/javax.g:146:23: vardecl SEMI
					{
						pushFollow(FOLLOW_vardecl_in_def_chest1010);
						vardecl();

						state._fsp--;

						match(input, SEMI, FOLLOW_SEMI_in_def_chest1012);

					}
						break;
					case 2:
						// ../compiladores2/src/javax.g:146:38: funccall SEMI
					{
						pushFollow(FOLLOW_funccall_in_def_chest1016);
						funccall();

						state._fsp--;

						match(input, SEMI, FOLLOW_SEMI_in_def_chest1018);

					}
						break;

					default:
						break loop11;
					}
				} while (true);

				match(input, END, FOLLOW_END_in_def_chest1023);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "def_chest"

	// $ANTLR start "def_while"
	// ../compiladores2/src/javax.g:149:1: def_while : WHILE LPAREN
	// logic_op_expr RPAREN ( weakstat )* END ;
	public final void def_while() throws RecognitionException {
		try {
			// ../compiladores2/src/javax.g:150:2: ( WHILE LPAREN logic_op_expr
			// RPAREN ( weakstat )* END )
			// ../compiladores2/src/javax.g:150:4: WHILE LPAREN logic_op_expr
			// RPAREN ( weakstat )* END
			{
				match(input, WHILE, FOLLOW_WHILE_in_def_while1034);
				match(input, LPAREN, FOLLOW_LPAREN_in_def_while1036);
				pushFollow(FOLLOW_logic_op_expr_in_def_while1038);
				logic_op_expr();

				state._fsp--;

				match(input, RPAREN, FOLLOW_RPAREN_in_def_while1040);
				// ../compiladores2/src/javax.g:150:38: ( weakstat )*
				loop12: do {
					int alt12 = 2;
					int LA12_0 = input.LA(1);

					if (((LA12_0 >= REPEAT && LA12_0 <= IF) || LA12_0 == RETURN || (LA12_0 >= T_INT && LA12_0 <= NAME))) {
						alt12 = 1;
					}

					switch (alt12) {
					case 1:
						// ../compiladores2/src/javax.g:150:38: weakstat
					{
						pushFollow(FOLLOW_weakstat_in_def_while1042);
						weakstat();

						state._fsp--;

					}
						break;

					default:
						break loop12;
					}
				} while (true);

				match(input, END, FOLLOW_END_in_def_while1045);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "def_while"

	// $ANTLR start "type"
	// ../compiladores2/src/javax.g:154:1: type returns [ String type ] : (
	// T_INT | T_REAL | T_STRING | T_BOOL | T_VOID | T_CHAIN );
	public final String type() throws RecognitionException {
		String type = null;

		try {
			// ../compiladores2/src/javax.g:155:2: ( T_INT | T_REAL | T_STRING |
			// T_BOOL | T_VOID | T_CHAIN )
			int alt13 = 6;
			switch (input.LA(1)) {
			case T_INT: {
				alt13 = 1;
			}
				break;
			case T_REAL: {
				alt13 = 2;
			}
				break;
			case T_STRING: {
				alt13 = 3;
			}
				break;
			case T_BOOL: {
				alt13 = 4;
			}
				break;
			case T_VOID: {
				alt13 = 5;
			}
				break;
			case T_CHAIN: {
				alt13 = 6;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException("", 13, 0,
						input);

				throw nvae;
			}

			switch (alt13) {
			case 1:
				// ../compiladores2/src/javax.g:155:4: T_INT
			{
				match(input, T_INT, FOLLOW_T_INT_in_type1062);
				type = "Integer";

			}
				break;
			case 2:
				// ../compiladores2/src/javax.g:156:4: T_REAL
			{
				match(input, T_REAL, FOLLOW_T_REAL_in_type1070);
				type = "Real";

			}
				break;
			case 3:
				// ../compiladores2/src/javax.g:157:4: T_STRING
			{
				match(input, T_STRING, FOLLOW_T_STRING_in_type1077);
				type = "String";

			}
				break;
			case 4:
				// ../compiladores2/src/javax.g:158:4: T_BOOL
			{
				match(input, T_BOOL, FOLLOW_T_BOOL_in_type1084);
				type = "Boolean";

			}
				break;
			case 5:
				// ../compiladores2/src/javax.g:159:4: T_VOID
			{
				match(input, T_VOID, FOLLOW_T_VOID_in_type1091);
				type = "Void";

			}
				break;
			case 6:
				// ../compiladores2/src/javax.g:160:4: T_CHAIN
			{
				match(input, T_CHAIN, FOLLOW_T_CHAIN_in_type1098);
				type = "Chain";

			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return type;
	}

	// $ANTLR end "type"

	// $ANTLR start "term"
	// ../compiladores2/src/javax.g:163:1: term returns [ String type ] : (v=
	// variable | f= funccall | n= number | str= string );
	public final String term() throws RecognitionException {
		String type = null;

		String v = null;

		String f = null;

		String n = null;

		String str = null;

		try {
			// ../compiladores2/src/javax.g:164:2: (v= variable | f= funccall |
			// n= number | str= string )
			int alt14 = 4;
			switch (input.LA(1)) {
			case NAME: {
				int LA14_1 = input.LA(2);

				if ((LA14_1 == LPAREN)) {
					alt14 = 2;
				} else if ((LA14_1 == RPAREN
						|| (LA14_1 >= SEMI && LA14_1 <= SLASH)
						|| (LA14_1 >= LESS && LA14_1 <= GREATER)
						|| LA14_1 == PERCENT
						|| (LA14_1 >= EQUAL && LA14_1 <= OR) || LA14_1 == THEN)) {
					alt14 = 1;
				} else {
					NoViableAltException nvae = new NoViableAltException("",
							14, 1, input);

					throw nvae;
				}
			}
				break;
			case INT:
			case FLOAT: {
				alt14 = 3;
			}
				break;
			case NORMALSTRING: {
				alt14 = 4;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException("", 14, 0,
						input);

				throw nvae;
			}

			switch (alt14) {
			case 1:
				// ../compiladores2/src/javax.g:164:4: v= variable
			{
				pushFollow(FOLLOW_variable_in_term1117);
				v = variable();

				state._fsp--;

				type = s.get_type(v);

			}
				break;
			case 2:
				// ../compiladores2/src/javax.g:165:6: f= funccall
			{
				pushFollow(FOLLOW_funccall_in_term1128);
				f = funccall();

				state._fsp--;

				type = f;

			}
				break;
			case 3:
				// ../compiladores2/src/javax.g:166:4: n= number
			{
				pushFollow(FOLLOW_number_in_term1138);
				n = number();

				state._fsp--;

				type = n;

			}
				break;
			case 4:
				// ../compiladores2/src/javax.g:167:4: str= string
			{
				pushFollow(FOLLOW_string_in_term1147);
				str = string();

				state._fsp--;

				type = str;

			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return type;
	}

	// $ANTLR end "term"

	// $ANTLR start "unary_op_expr"
	// ../compiladores2/src/javax.g:170:1: unary_op_expr returns [ String type ]
	// : ( MINUS | PLUS | NOT )? t= term ;
	public final String unary_op_expr() throws RecognitionException {
		String type = null;

		String t = null;

		try {
			// ../compiladores2/src/javax.g:171:2: ( ( MINUS | PLUS | NOT )? t=
			// term )
			// ../compiladores2/src/javax.g:171:4: ( MINUS | PLUS | NOT )? t=
			// term
			{
				// ../compiladores2/src/javax.g:171:4: ( MINUS | PLUS | NOT )?
				int alt15 = 2;
				int LA15_0 = input.LA(1);

				if (((LA15_0 >= PLUS && LA15_0 <= MINUS) || LA15_0 == NOT)) {
					alt15 = 1;
				}
				switch (alt15) {
				case 1:
					// ../compiladores2/src/javax.g:
				{
					if ((input.LA(1) >= PLUS && input.LA(1) <= MINUS)
							|| input.LA(1) == NOT) {
						input.consume();
						state.errorRecovery = false;
					} else {
						MismatchedSetException mse = new MismatchedSetException(
								null, input);
						throw mse;
					}

				}
					break;

				}

				pushFollow(FOLLOW_term_in_unary_op_expr1181);
				t = term();

				state._fsp--;

				type = t;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return type;
	}

	// $ANTLR end "unary_op_expr"

	// $ANTLR start "strong_op_expr"
	// ../compiladores2/src/javax.g:174:1: strong_op_expr returns [ String type
	// ] : t1= unary_op_expr (op= ( STAR | SLASH | PERCENT ) t2= unary_op_expr
	// )* ;
	public final String strong_op_expr() throws RecognitionException {
		String type = null;

		Token op = null;
		String t1 = null;

		String t2 = null;

		try {
			// ../compiladores2/src/javax.g:175:2: (t1= unary_op_expr (op= (
			// STAR | SLASH | PERCENT ) t2= unary_op_expr )* )
			// ../compiladores2/src/javax.g:175:4: t1= unary_op_expr (op= ( STAR
			// | SLASH | PERCENT ) t2= unary_op_expr )*
			{
				pushFollow(FOLLOW_unary_op_expr_in_strong_op_expr1200);
				t1 = unary_op_expr();

				state._fsp--;

				type = t1;
				// ../compiladores2/src/javax.g:175:34: (op= ( STAR | SLASH |
				// PERCENT ) t2= unary_op_expr )*
				loop16: do {
					int alt16 = 2;
					int LA16_0 = input.LA(1);

					if (((LA16_0 >= STAR && LA16_0 <= SLASH) || LA16_0 == PERCENT)) {
						alt16 = 1;
					}

					switch (alt16) {
					case 1:
						// ../compiladores2/src/javax.g:175:36: op= ( STAR |
						// SLASH | PERCENT ) t2= unary_op_expr
					{
						op = (Token) input.LT(1);
						if ((input.LA(1) >= STAR && input.LA(1) <= SLASH)
								|| input.LA(1) == PERCENT) {
							input.consume();
							state.errorRecovery = false;
						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							throw mse;
						}

						pushFollow(FOLLOW_unary_op_expr_in_strong_op_expr1223);
						t2 = unary_op_expr();

						state._fsp--;

						type = s.eval_strong_expr(t1, t2, op.getText());

					}
						break;

					default:
						break loop16;
					}
				} while (true);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return type;
	}

	// $ANTLR end "strong_op_expr"

	// $ANTLR start "weak_op_expr"
	// ../compiladores2/src/javax.g:178:1: weak_op_expr returns [ String type ]
	// : (t1= strong_op_expr (op= ( PLUS | MINUS ) t2= strong_op_expr )* | FALSE
	// | TRUE );
	public final String weak_op_expr() throws RecognitionException {
		String type = null;

		Token op = null;
		String t1 = null;

		String t2 = null;

		try {
			// ../compiladores2/src/javax.g:179:2: (t1= strong_op_expr (op= (
			// PLUS | MINUS ) t2= strong_op_expr )* | FALSE | TRUE )
			int alt18 = 3;
			switch (input.LA(1)) {
			case PLUS:
			case MINUS:
			case NOT:
			case NAME:
			case INT:
			case FLOAT:
			case NORMALSTRING: {
				alt18 = 1;
			}
				break;
			case FALSE: {
				alt18 = 2;
			}
				break;
			case TRUE: {
				alt18 = 3;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException("", 18, 0,
						input);

				throw nvae;
			}

			switch (alt18) {
			case 1:
				// ../compiladores2/src/javax.g:179:4: t1= strong_op_expr (op= (
				// PLUS | MINUS ) t2= strong_op_expr )*
			{
				pushFollow(FOLLOW_strong_op_expr_in_weak_op_expr1245);
				t1 = strong_op_expr();

				state._fsp--;

				type = t1;
				// ../compiladores2/src/javax.g:179:35: (op= ( PLUS | MINUS )
				// t2= strong_op_expr )*
				loop17: do {
					int alt17 = 2;
					int LA17_0 = input.LA(1);

					if (((LA17_0 >= PLUS && LA17_0 <= MINUS))) {
						alt17 = 1;
					}

					switch (alt17) {
					case 1:
						// ../compiladores2/src/javax.g:179:37: op= ( PLUS |
						// MINUS ) t2= strong_op_expr
					{
						op = (Token) input.LT(1);
						if ((input.LA(1) >= PLUS && input.LA(1) <= MINUS)) {
							input.consume();
							state.errorRecovery = false;
						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							throw mse;
						}

						pushFollow(FOLLOW_strong_op_expr_in_weak_op_expr1265);
						t2 = strong_op_expr();

						state._fsp--;

						type = s.eval_weak_expr(t1, t2, op.getText());

					}
						break;

					default:
						break loop17;
					}
				} while (true);

			}
				break;
			case 2:
				// ../compiladores2/src/javax.g:180:4: FALSE
			{
				match(input, FALSE, FOLLOW_FALSE_in_weak_op_expr1276);

			}
				break;
			case 3:
				// ../compiladores2/src/javax.g:181:4: TRUE
			{
				match(input, TRUE, FOLLOW_TRUE_in_weak_op_expr1282);

			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return type;
	}

	// $ANTLR end "weak_op_expr"

	// $ANTLR start "relational_op_expr"
	// ../compiladores2/src/javax.g:184:1: relational_op_expr returns [ String
	// type ] : t1= weak_op_expr (op= ( LESS | GREATER | EQUAL | NOTEQUAL |
	// GREATEREQUAL | LESSEQUAL ) t2= weak_op_expr )* ;
	public final String relational_op_expr() throws RecognitionException {
		String type = null;

		Token op = null;
		String t1 = null;

		String t2 = null;

		try {
			// ../compiladores2/src/javax.g:185:2: (t1= weak_op_expr (op= ( LESS
			// | GREATER | EQUAL | NOTEQUAL | GREATEREQUAL | LESSEQUAL ) t2=
			// weak_op_expr )* )
			// ../compiladores2/src/javax.g:185:4: t1= weak_op_expr (op= ( LESS
			// | GREATER | EQUAL | NOTEQUAL | GREATEREQUAL | LESSEQUAL ) t2=
			// weak_op_expr )*
			{
				pushFollow(FOLLOW_weak_op_expr_in_relational_op_expr1299);
				t1 = weak_op_expr();

				state._fsp--;

				type = t1;
				// ../compiladores2/src/javax.g:185:33: (op= ( LESS | GREATER |
				// EQUAL | NOTEQUAL | GREATEREQUAL | LESSEQUAL ) t2=
				// weak_op_expr )*
				loop19: do {
					int alt19 = 2;
					int LA19_0 = input.LA(1);

					if (((LA19_0 >= LESS && LA19_0 <= GREATER) || (LA19_0 >= EQUAL && LA19_0 <= GREATEREQUAL))) {
						alt19 = 1;
					}

					switch (alt19) {
					case 1:
						// ../compiladores2/src/javax.g:185:35: op= ( LESS |
						// GREATER | EQUAL | NOTEQUAL | GREATEREQUAL | LESSEQUAL
						// ) t2= weak_op_expr
					{
						op = (Token) input.LT(1);
						if ((input.LA(1) >= LESS && input.LA(1) <= GREATER)
								|| (input.LA(1) >= EQUAL && input.LA(1) <= GREATEREQUAL)) {
							input.consume();
							state.errorRecovery = false;
						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							throw mse;
						}

						pushFollow(FOLLOW_weak_op_expr_in_relational_op_expr1335);
						t2 = weak_op_expr();

						state._fsp--;

						s.eval_relational_expr(t1, t2, op.getText());

					}
						break;

					default:
						break loop19;
					}
				} while (true);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return type;
	}

	// $ANTLR end "relational_op_expr"

	// $ANTLR start "logic_op_expr"
	// ../compiladores2/src/javax.g:189:1: logic_op_expr returns [ String type ]
	// : t1= relational_op_expr (op= ( OR | AND ) t2= relational_op_expr )* ;
	public final String logic_op_expr() throws RecognitionException {
		String type = null;

		Token op = null;
		String t1 = null;

		String t2 = null;

		try {
			// ../compiladores2/src/javax.g:190:2: (t1= relational_op_expr (op=
			// ( OR | AND ) t2= relational_op_expr )* )
			// ../compiladores2/src/javax.g:190:4: t1= relational_op_expr (op= (
			// OR | AND ) t2= relational_op_expr )*
			{
				pushFollow(FOLLOW_relational_op_expr_in_logic_op_expr1358);
				t1 = relational_op_expr();

				state._fsp--;

				type = t1;
				// ../compiladores2/src/javax.g:190:38: (op= ( OR | AND ) t2=
				// relational_op_expr )*
				loop20: do {
					int alt20 = 2;
					int LA20_0 = input.LA(1);

					if (((LA20_0 >= AND && LA20_0 <= OR))) {
						alt20 = 1;
					}

					switch (alt20) {
					case 1:
						// ../compiladores2/src/javax.g:190:40: op= ( OR | AND )
						// t2= relational_op_expr
					{
						op = (Token) input.LT(1);
						if ((input.LA(1) >= AND && input.LA(1) <= OR)) {
							input.consume();
							state.errorRecovery = false;
						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							throw mse;
						}

						pushFollow(FOLLOW_relational_op_expr_in_logic_op_expr1378);
						t2 = relational_op_expr();

						state._fsp--;

						s.eval_logic_expr(t1, t2, op.getText());

					}
						break;

					default:
						break loop20;
					}
				} while (true);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return type;
	}

	// $ANTLR end "logic_op_expr"

	// $ANTLR start "typedarglist"
	// ../compiladores2/src/javax.g:193:1: typedarglist returns [
	// HashMap<String,String> tamap ] : (t= type n= NAME ( COMMA t= type n= NAME
	// )* )? ;
	public final HashMap<String, String> typedarglist()
			throws RecognitionException {
		HashMap<String, String> tamap = null;

		Token n = null;
		String t = null;

		try {
			// ../compiladores2/src/javax.g:194:2: ( (t= type n= NAME ( COMMA t=
			// type n= NAME )* )? )
			// ../compiladores2/src/javax.g:194:3: (t= type n= NAME ( COMMA t=
			// type n= NAME )* )?
			{
				tamap = new HashMap<String, String>();
				// ../compiladores2/src/javax.g:195:2: (t= type n= NAME ( COMMA
				// t= type n= NAME )* )?
				int alt22 = 2;
				int LA22_0 = input.LA(1);

				if (((LA22_0 >= T_INT && LA22_0 <= T_BOOL))) {
					alt22 = 1;
				}
				switch (alt22) {
				case 1:
					// ../compiladores2/src/javax.g:195:4: t= type n= NAME (
					// COMMA t= type n= NAME )*
				{
					pushFollow(FOLLOW_type_in_typedarglist1405);
					t = type();

					state._fsp--;

					n = (Token) match(input, NAME,
							FOLLOW_NAME_in_typedarglist1409);
					tamap.put(n.getText(), t);
					// ../compiladores2/src/javax.g:195:48: ( COMMA t= type n=
					// NAME )*
					loop21: do {
						int alt21 = 2;
						int LA21_0 = input.LA(1);

						if ((LA21_0 == COMMA)) {
							alt21 = 1;
						}

						switch (alt21) {
						case 1:
							// ../compiladores2/src/javax.g:195:50: COMMA t=
							// type n= NAME
						{
							match(input, COMMA,
									FOLLOW_COMMA_in_typedarglist1414);
							pushFollow(FOLLOW_type_in_typedarglist1418);
							t = type();

							state._fsp--;

							n = (Token) match(input, NAME,
									FOLLOW_NAME_in_typedarglist1422);
							tamap.put(n.getText(), t);

						}
							break;

						default:
							break loop21;
						}
					} while (true);

				}
					break;

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return tamap;
	}

	// $ANTLR end "typedarglist"

	// $ANTLR start "chestaccess"
	// ../compiladores2/src/javax.g:198:1: chestaccess : NAME ( DOT NAME )+ ;
	public final void chestaccess() throws RecognitionException {
		try {
			// ../compiladores2/src/javax.g:199:2: ( NAME ( DOT NAME )+ )
			// ../compiladores2/src/javax.g:199:4: NAME ( DOT NAME )+
			{
				match(input, NAME, FOLLOW_NAME_in_chestaccess1442);
				// ../compiladores2/src/javax.g:199:9: ( DOT NAME )+
				int cnt23 = 0;
				loop23: do {
					int alt23 = 2;
					int LA23_0 = input.LA(1);

					if ((LA23_0 == DOT)) {
						alt23 = 1;
					}

					switch (alt23) {
					case 1:
						// ../compiladores2/src/javax.g:199:11: DOT NAME
					{
						match(input, DOT, FOLLOW_DOT_in_chestaccess1446);
						match(input, NAME, FOLLOW_NAME_in_chestaccess1448);

					}
						break;

					default:
						if (cnt23 >= 1)
							break loop23;
						EarlyExitException eee = new EarlyExitException(23,
								input);
						throw eee;
					}
					cnt23++;
				} while (true);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "chestaccess"

	// $ANTLR start "def_return"
	// ../compiladores2/src/javax.g:202:1: def_return returns [ String type ] :
	// RETURN t= logic_op_expr ;
	public final String def_return() throws RecognitionException {
		String type = null;

		String t = null;

		try {
			// ../compiladores2/src/javax.g:203:2: ( RETURN t= logic_op_expr )
			// ../compiladores2/src/javax.g:203:4: RETURN t= logic_op_expr
			{
				match(input, RETURN, FOLLOW_RETURN_in_def_return1467);
				pushFollow(FOLLOW_logic_op_expr_in_def_return1471);
				t = logic_op_expr();

				state._fsp--;

				type = t;
				s.eval_return(t);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return type;
	}

	// $ANTLR end "def_return"

	// $ANTLR start "arglist"
	// ../compiladores2/src/javax.g:206:1: arglist returns [
	// HashMap<String,String> amap ] : (n= NAME ( COMMA n1= NAME )* )? ;
	public final HashMap<String, String> arglist() throws RecognitionException {
		HashMap<String, String> amap = null;

		Token n = null;
		Token n1 = null;

		try {
			// ../compiladores2/src/javax.g:207:2: ( (n= NAME ( COMMA n1= NAME
			// )* )? )
			// ../compiladores2/src/javax.g:207:3: (n= NAME ( COMMA n1= NAME )*
			// )?
			{
				amap = new HashMap<String, String>();
				// ../compiladores2/src/javax.g:208:2: (n= NAME ( COMMA n1= NAME
				// )* )?
				int alt25 = 2;
				int LA25_0 = input.LA(1);

				if ((LA25_0 == NAME)) {
					alt25 = 1;
				}
				switch (alt25) {
				case 1:
					// ../compiladores2/src/javax.g:208:4: n= NAME ( COMMA n1=
					// NAME )*
				{
					n = (Token) match(input, NAME, FOLLOW_NAME_in_arglist1494);
					amap.put(n.getText(), s.get_type(n.getText()));
					// ../compiladores2/src/javax.g:208:60: ( COMMA n1= NAME )*
					loop24: do {
						int alt24 = 2;
						int LA24_0 = input.LA(1);

						if ((LA24_0 == COMMA)) {
							alt24 = 1;
						}

						switch (alt24) {
						case 1:
							// ../compiladores2/src/javax.g:208:62: COMMA n1=
							// NAME
						{
							match(input, COMMA, FOLLOW_COMMA_in_arglist1499);
							n1 = (Token) match(input, NAME,
									FOLLOW_NAME_in_arglist1503);
							amap.put(n.getText(), s.get_type(n1.getText()));

						}
							break;

						default:
							break loop24;
						}
					} while (true);

				}
					break;

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return amap;
	}

	// $ANTLR end "arglist"

	// $ANTLR start "variable"
	// ../compiladores2/src/javax.g:211:1: variable returns [ String name ] :
	// (n= NAME | chestaccess );
	public final String variable() throws RecognitionException {
		String name = null;

		Token n = null;

		try {
			// ../compiladores2/src/javax.g:212:2: (n= NAME | chestaccess )
			int alt26 = 2;
			int LA26_0 = input.LA(1);

			if ((LA26_0 == NAME)) {
				int LA26_1 = input.LA(2);

				if ((LA26_1 == DOT)) {
					alt26 = 2;
				} else if ((LA26_1 == RPAREN || LA26_1 == SEMI
						|| (LA26_1 >= PLUS && LA26_1 <= SLASH)
						|| (LA26_1 >= LESS && LA26_1 <= GREATER)
						|| LA26_1 == PERCENT
						|| (LA26_1 >= EQUAL && LA26_1 <= OR) || LA26_1 == THEN)) {
					alt26 = 1;
				} else {
					NoViableAltException nvae = new NoViableAltException("",
							26, 1, input);

					throw nvae;
				}
			} else {
				NoViableAltException nvae = new NoViableAltException("", 26, 0,
						input);

				throw nvae;
			}
			switch (alt26) {
			case 1:
				// ../compiladores2/src/javax.g:212:4: n= NAME
			{
				n = (Token) match(input, NAME, FOLLOW_NAME_in_variable1528);
				name = n.getText();
				s.eval_atrib(n.getText());

			}
				break;
			case 2:
				// ../compiladores2/src/javax.g:213:4: chestaccess
			{
				pushFollow(FOLLOW_chestaccess_in_variable1535);
				chestaccess();

				state._fsp--;

			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return name;
	}

	// $ANTLR end "variable"

	// $ANTLR start "number"
	// ../compiladores2/src/javax.g:216:1: number returns [ String type ] : (
	// INT | FLOAT );
	public final String number() throws RecognitionException {
		String type = null;

		try {
			// ../compiladores2/src/javax.g:217:2: ( INT | FLOAT )
			int alt27 = 2;
			int LA27_0 = input.LA(1);

			if ((LA27_0 == INT)) {
				alt27 = 1;
			} else if ((LA27_0 == FLOAT)) {
				alt27 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException("", 27, 0,
						input);

				throw nvae;
			}
			switch (alt27) {
			case 1:
				// ../compiladores2/src/javax.g:217:4: INT
			{
				match(input, INT, FOLLOW_INT_in_number1551);
				type = "Integer";

			}
				break;
			case 2:
				// ../compiladores2/src/javax.g:218:4: FLOAT
			{
				match(input, FLOAT, FOLLOW_FLOAT_in_number1558);
				type = "Real";

			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return type;
	}

	// $ANTLR end "number"

	// $ANTLR start "string"
	// ../compiladores2/src/javax.g:221:1: string returns [ String type ] :
	// NORMALSTRING ;
	public final String string() throws RecognitionException {
		String type = null;

		try {
			// ../compiladores2/src/javax.g:222:2: ( NORMALSTRING )
			// ../compiladores2/src/javax.g:222:4: NORMALSTRING
			{
				match(input, NORMALSTRING, FOLLOW_NORMALSTRING_in_string1575);
				type = "String";

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return type;
	}

	// $ANTLR end "string"

	// Delegated rules

	protected DFA1 dfa1 = new DFA1(this);
	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA1_eotS = "\12\uffff";
	static final String DFA1_eofS = "\12\uffff";
	static final String DFA1_minS = "\1\55\6\65\1\uffff\1\4\1\uffff";
	static final String DFA1_maxS = "\1\64\6\65\1\uffff\1\12\1\uffff";
	static final String DFA1_acceptS = "\7\uffff\1\2\1\uffff\1\1";
	static final String DFA1_specialS = "\12\uffff}>";
	static final String[] DFA1_transitionS = {
			"\1\7\1\uffff\1\1\1\2\1\3\1\6\1\5\1\4", "\1\10", "\1\10", "\1\10",
			"\1\10", "\1\10", "\1\10", "", "\1\7\4\uffff\2\11", "" };

	static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
	static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
	static final char[] DFA1_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA1_minS);
	static final char[] DFA1_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA1_maxS);
	static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
	static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
	static final short[][] DFA1_transition;

	static {
		int numStates = DFA1_transitionS.length;
		DFA1_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
		}
	}

	class DFA1 extends DFA {

		public DFA1(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 1;
			this.eot = DFA1_eot;
			this.eof = DFA1_eof;
			this.min = DFA1_min;
			this.max = DFA1_max;
			this.accept = DFA1_accept;
			this.special = DFA1_special;
			this.transition = DFA1_transition;
		}

		public String getDescription() {
			return "()* loopback of 101:5: ( vardecl SEMI )*";
		}
	}

	static final String DFA4_eotS = "\12\uffff";
	static final String DFA4_eofS = "\12\uffff";
	static final String DFA4_minS = "\1\42\1\4\10\uffff";
	static final String DFA4_maxS = "\1\65\1\23\10\uffff";
	static final String DFA4_acceptS = "\2\uffff\1\2\1\4\1\5\1\6\1\10\1\1\1\3\1\7";
	static final String DFA4_specialS = "\12\uffff}>";
	static final String[] DFA4_transitionS = {
			"\1\6\1\4\1\3\7\uffff\1\5\2\uffff\6\2\1\1",
			"\1\10\6\uffff\1\11\7\uffff\1\7", "", "", "", "", "", "", "", "" };

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}

		public String getDescription() {
			return "109:1: weakstat returns [ String type ] : ( varatrib SEMI | vardecl SEMI | funccall SEMI | def_if | def_while | t= def_return SEMI | chestaccess SEMI | def_repeat );";
		}
	}

	public static final BitSet FOLLOW_vardecl_in_javax681 = new BitSet(
			new long[] { 0x0000000000000400L });
	public static final BitSet FOLLOW_SEMI_in_javax683 = new BitSet(
			new long[] { 0x001FA00000000000L });
	public static final BitSet FOLLOW_stat_in_javax687 = new BitSet(
			new long[] { 0x001FA00000000002L });
	public static final BitSet FOLLOW_def_func_in_stat702 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_def_chest_in_stat710 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_varatrib_in_weakstat725 = new BitSet(
			new long[] { 0x0000000000000400L });
	public static final BitSet FOLLOW_SEMI_in_weakstat727 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_vardecl_in_weakstat733 = new BitSet(
			new long[] { 0x0000000000000400L });
	public static final BitSet FOLLOW_SEMI_in_weakstat739 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_funccall_in_weakstat745 = new BitSet(
			new long[] { 0x0000000000000400L });
	public static final BitSet FOLLOW_SEMI_in_weakstat747 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_def_if_in_weakstat753 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_def_while_in_weakstat762 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_def_return_in_weakstat773 = new BitSet(
			new long[] { 0x0000000000000400L });
	public static final BitSet FOLLOW_SEMI_in_weakstat777 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_chestaccess_in_weakstat783 = new BitSet(
			new long[] { 0x0000000000000400L });
	public static final BitSet FOLLOW_SEMI_in_weakstat785 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_def_repeat_in_weakstat794 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_NAME_in_varatrib809 = new BitSet(
			new long[] { 0x0000000000080000L });
	public static final BitSet FOLLOW_ASSIGN_in_varatrib811 = new BitSet(
			new long[] { 0x01E00000E0003000L });
	public static final BitSet FOLLOW_logic_op_expr_in_varatrib815 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_type_in_vardecl832 = new BitSet(
			new long[] { 0x0020000000000000L });
	public static final BitSet FOLLOW_NAME_in_vardecl836 = new BitSet(
			new long[] { 0x0000000000000202L });
	public static final BitSet FOLLOW_COMMA_in_vardecl842 = new BitSet(
			new long[] { 0x0020000000000000L });
	public static final BitSet FOLLOW_NAME_in_vardecl846 = new BitSet(
			new long[] { 0x0000000000000202L });
	public static final BitSet FOLLOW_NAME_in_funccall871 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_LPAREN_in_funccall873 = new BitSet(
			new long[] { 0x0020000000000020L });
	public static final BitSet FOLLOW_arglist_in_funccall877 = new BitSet(
			new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_RPAREN_in_funccall879 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_type_in_def_func897 = new BitSet(
			new long[] { 0x0020000000000000L });
	public static final BitSet FOLLOW_NAME_in_def_func901 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_LPAREN_in_def_func903 = new BitSet(
			new long[] { 0x001F800000000020L });
	public static final BitSet FOLLOW_typedarglist_in_def_func907 = new BitSet(
			new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_RPAREN_in_def_func909 = new BitSet(
			new long[] { 0x003FB81C00000000L });
	public static final BitSet FOLLOW_weakstat_in_def_func919 = new BitSet(
			new long[] { 0x003FB81C00000000L });
	public static final BitSet FOLLOW_END_in_def_func924 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_IF_in_def_if937 = new BitSet(
			new long[] { 0x01E00000E0003000L });
	public static final BitSet FOLLOW_logic_op_expr_in_def_if939 = new BitSet(
			new long[] { 0x0000400000000000L });
	public static final BitSet FOLLOW_THEN_in_def_if941 = new BitSet(
			new long[] { 0x003FB83C00000000L });
	public static final BitSet FOLLOW_weakstat_in_def_if943 = new BitSet(
			new long[] { 0x003FB83C00000000L });
	public static final BitSet FOLLOW_END_in_def_if948 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ELSE_in_def_if954 = new BitSet(
			new long[] { 0x003FB81C00000000L });
	public static final BitSet FOLLOW_weakstat_in_def_if956 = new BitSet(
			new long[] { 0x003FB81C00000000L });
	public static final BitSet FOLLOW_END_in_def_if959 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_REPEAT_in_def_repeat977 = new BitSet(
			new long[] { 0x003FB09C00000000L });
	public static final BitSet FOLLOW_weakstat_in_def_repeat979 = new BitSet(
			new long[] { 0x003FB09C00000000L });
	public static final BitSet FOLLOW_UNTIL_in_def_repeat982 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_LPAREN_in_def_repeat984 = new BitSet(
			new long[] { 0x01E00000E0003000L });
	public static final BitSet FOLLOW_logic_op_expr_in_def_repeat986 = new BitSet(
			new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_RPAREN_in_def_repeat988 = new BitSet(
			new long[] { 0x0000080000000000L });
	public static final BitSet FOLLOW_END_in_def_repeat990 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CHEST_in_def_chest1002 = new BitSet(
			new long[] { 0x0020000000000000L });
	public static final BitSet FOLLOW_NAME_in_def_chest1004 = new BitSet(
			new long[] { 0x0000000000000100L });
	public static final BitSet FOLLOW_COLON_in_def_chest1006 = new BitSet(
			new long[] { 0x003FA80000000000L });
	public static final BitSet FOLLOW_vardecl_in_def_chest1010 = new BitSet(
			new long[] { 0x0000000000000400L });
	public static final BitSet FOLLOW_SEMI_in_def_chest1012 = new BitSet(
			new long[] { 0x003FA80000000000L });
	public static final BitSet FOLLOW_funccall_in_def_chest1016 = new BitSet(
			new long[] { 0x0000000000000400L });
	public static final BitSet FOLLOW_SEMI_in_def_chest1018 = new BitSet(
			new long[] { 0x003FA80000000000L });
	public static final BitSet FOLLOW_END_in_def_chest1023 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_WHILE_in_def_while1034 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_LPAREN_in_def_while1036 = new BitSet(
			new long[] { 0x01E00000E0003000L });
	public static final BitSet FOLLOW_logic_op_expr_in_def_while1038 = new BitSet(
			new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_RPAREN_in_def_while1040 = new BitSet(
			new long[] { 0x003FB81C00000000L });
	public static final BitSet FOLLOW_weakstat_in_def_while1042 = new BitSet(
			new long[] { 0x003FB81C00000000L });
	public static final BitSet FOLLOW_END_in_def_while1045 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_T_INT_in_type1062 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_T_REAL_in_type1070 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_T_STRING_in_type1077 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_T_BOOL_in_type1084 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_T_VOID_in_type1091 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_T_CHAIN_in_type1098 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_variable_in_term1117 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_funccall_in_term1128 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_number_in_term1138 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_string_in_term1147 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_set_in_unary_op_expr1164 = new BitSet(
			new long[] { 0x01E0000020003000L });
	public static final BitSet FOLLOW_term_in_unary_op_expr1181 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_unary_op_expr_in_strong_op_expr1200 = new BitSet(
			new long[] { 0x000000000010C002L });
	public static final BitSet FOLLOW_set_in_strong_op_expr1207 = new BitSet(
			new long[] { 0x01E0000020003000L });
	public static final BitSet FOLLOW_unary_op_expr_in_strong_op_expr1223 = new BitSet(
			new long[] { 0x000000000010C002L });
	public static final BitSet FOLLOW_strong_op_expr_in_weak_op_expr1245 = new BitSet(
			new long[] { 0x0000000000003002L });
	public static final BitSet FOLLOW_set_in_weak_op_expr1253 = new BitSet(
			new long[] { 0x01E0000020003000L });
	public static final BitSet FOLLOW_strong_op_expr_in_weak_op_expr1265 = new BitSet(
			new long[] { 0x0000000000003002L });
	public static final BitSet FOLLOW_FALSE_in_weak_op_expr1276 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_TRUE_in_weak_op_expr1282 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_weak_op_expr_in_relational_op_expr1299 = new BitSet(
			new long[] { 0x0000000007860002L });
	public static final BitSet FOLLOW_set_in_relational_op_expr1307 = new BitSet(
			new long[] { 0x01E00000E0003000L });
	public static final BitSet FOLLOW_weak_op_expr_in_relational_op_expr1335 = new BitSet(
			new long[] { 0x0000000007860002L });
	public static final BitSet FOLLOW_relational_op_expr_in_logic_op_expr1358 = new BitSet(
			new long[] { 0x0000000018000002L });
	public static final BitSet FOLLOW_set_in_logic_op_expr1366 = new BitSet(
			new long[] { 0x01E00000E0003000L });
	public static final BitSet FOLLOW_relational_op_expr_in_logic_op_expr1378 = new BitSet(
			new long[] { 0x0000000018000002L });
	public static final BitSet FOLLOW_type_in_typedarglist1405 = new BitSet(
			new long[] { 0x0020000000000000L });
	public static final BitSet FOLLOW_NAME_in_typedarglist1409 = new BitSet(
			new long[] { 0x0000000000000202L });
	public static final BitSet FOLLOW_COMMA_in_typedarglist1414 = new BitSet(
			new long[] { 0x001F800000000000L });
	public static final BitSet FOLLOW_type_in_typedarglist1418 = new BitSet(
			new long[] { 0x0020000000000000L });
	public static final BitSet FOLLOW_NAME_in_typedarglist1422 = new BitSet(
			new long[] { 0x0000000000000202L });
	public static final BitSet FOLLOW_NAME_in_chestaccess1442 = new BitSet(
			new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_DOT_in_chestaccess1446 = new BitSet(
			new long[] { 0x0020000000000000L });
	public static final BitSet FOLLOW_NAME_in_chestaccess1448 = new BitSet(
			new long[] { 0x0000000000000802L });
	public static final BitSet FOLLOW_RETURN_in_def_return1467 = new BitSet(
			new long[] { 0x01E00000E0003000L });
	public static final BitSet FOLLOW_logic_op_expr_in_def_return1471 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_NAME_in_arglist1494 = new BitSet(
			new long[] { 0x0000000000000202L });
	public static final BitSet FOLLOW_COMMA_in_arglist1499 = new BitSet(
			new long[] { 0x0020000000000000L });
	public static final BitSet FOLLOW_NAME_in_arglist1503 = new BitSet(
			new long[] { 0x0000000000000202L });
	public static final BitSet FOLLOW_NAME_in_variable1528 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_chestaccess_in_variable1535 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_INT_in_number1551 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_FLOAT_in_number1558 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_NORMALSTRING_in_string1575 = new BitSet(
			new long[] { 0x0000000000000002L });

}