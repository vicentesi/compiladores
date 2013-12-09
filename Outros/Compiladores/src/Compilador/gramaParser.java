// $ANTLR 3.4 /home/luis/workspace/Grama2/src/Compilador/Grama.g 2013-02-20 15:48:13

package Compilador;

import java.util.HashMap;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

@SuppressWarnings({ "all", "warnings", "unchecked" })
public class gramaParser extends Parser {
	public static final String[] tokenNames = new String[] { "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASSIGN",
			"CHEST", "COLON", "COMMA", "COMMENT", "DIGIT", "DO", "DOT", "ELSE", "ELSEIF", "END", "EQUAL",
			"EscapeSequence", "FALSE", "FLOAT", "FOR", "GREATER", "GREATEREQUAL", "IF", "IN", "INT", "LBRACK",
			"LCURLY", "LESS", "LESSEQUAL", "LETTER", "LETTERL", "LETTERU", "LINE_COMMENT", "LPAREN", "MINUS", "NAME",
			"NORMALSTRING", "NOT", "NOTEQUAL", "OR", "PERCENT", "PLUS", "POWER", "PRINT", "RBRACK", "RCURLY", "REPEAT",
			"RETURN", "RPAREN", "SEMI", "SLASH", "STAR", "THEN", "TO", "TRUE", "T_BOOL", "T_CHAIN", "T_INT", "T_REAL",
			"T_STRING", "T_VOID", "UNTIL", "WHILE", "WITH", "WS" };

	public static final int EOF = -1;
	public static final int AND = 4;
	public static final int ASSIGN = 5;
	public static final int CHEST = 6;
	public static final int COLON = 7;
	public static final int COMMA = 8;
	public static final int COMMENT = 9;
	public static final int DIGIT = 10;
	public static final int DO = 11;
	public static final int DOT = 12;
	public static final int ELSE = 13;
	public static final int ELSEIF = 14;
	public static final int END = 15;
	public static final int EQUAL = 16;
	public static final int EscapeSequence = 17;
	public static final int FALSE = 18;
	public static final int FLOAT = 19;
	public static final int FOR = 20;
	public static final int GREATER = 21;
	public static final int GREATEREQUAL = 22;
	public static final int IF = 23;
	public static final int IN = 24;
	public static final int INT = 25;
	public static final int LBRACK = 26;
	public static final int LCURLY = 27;
	public static final int LESS = 28;
	public static final int LESSEQUAL = 29;
	public static final int LETTER = 30;
	public static final int LETTERL = 31;
	public static final int LETTERU = 32;
	public static final int LINE_COMMENT = 33;
	public static final int LPAREN = 34;
	public static final int MINUS = 35;
	public static final int NAME = 36;
	public static final int NORMALSTRING = 37;
	public static final int NOT = 38;
	public static final int NOTEQUAL = 39;
	public static final int OR = 40;
	public static final int PERCENT = 41;
	public static final int PLUS = 42;
	public static final int POWER = 43;
	public static final int PRINT = 44;
	public static final int RBRACK = 45;
	public static final int RCURLY = 46;
	public static final int REPEAT = 47;
	public static final int RETURN = 48;
	public static final int RPAREN = 49;
	public static final int SEMI = 50;
	public static final int SLASH = 51;
	public static final int STAR = 52;
	public static final int THEN = 53;
	public static final int TO = 54;
	public static final int TRUE = 55;
	public static final int T_BOOL = 56;
	public static final int T_CHAIN = 57;
	public static final int T_INT = 58;
	public static final int T_REAL = 59;
	public static final int T_STRING = 60;
	public static final int T_VOID = 61;
	public static final int UNTIL = 62;
	public static final int WHILE = 63;
	public static final int WITH = 64;
	public static final int WS = 65;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators

	public gramaParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}

	public gramaParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	public String[] getTokenNames() {
		return gramaParser.tokenNames;
	}

	public String getGrammarFileName() {
		return "/home/luis/workspace/Grama2/src/Compilador/Grama.g";
	}

	Semantico semantico = new Semantico(this);
	Generator generator = new Generator(semantico);

	// $ANTLR start "grama"
	// /home/luis/workspace/Grama2/src/Compilador/Grama.g:103:1: grama : ( (
	// vardecl SEMI )* ( stat ) )+ ;
	public final void grama() throws RecognitionException {
		try {
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:104:2: ( ( (
			// vardecl SEMI )* ( stat ) )+ )
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:104:4: ( (
			// vardecl SEMI )* ( stat ) )+
			{
				// /home/luis/workspace/Grama2/src/Compilador/Grama.g:104:4: ( (
				// vardecl SEMI )* ( stat ) )+
				int cnt2 = 0;
				loop2: do {
					int alt2 = 2;
					int LA2_0 = input.LA(1);

					if (((LA2_0 == NAME) || (LA2_0 == PRINT) || ((LA2_0 >= T_BOOL) && (LA2_0 <= T_VOID)))) {
						alt2 = 1;
					}

					switch (alt2) {
					case 1:
					// /home/luis/workspace/Grama2/src/Compilador/Grama.g:104:5:
					// ( vardecl SEMI )* ( stat )
					{
						// /home/luis/workspace/Grama2/src/Compilador/Grama.g:104:5:
						// ( vardecl SEMI )*
						loop1: do {
							int alt1 = 2;
							switch (input.LA(1)) {
							case T_INT: {
								int LA1_1 = input.LA(2);

								if ((LA1_1 == NAME)) {
									int LA1_8 = input.LA(3);

									if (((LA1_8 == COMMA) || (LA1_8 == SEMI))) {
										alt1 = 1;
									}

								}

							}
								break;
							case T_REAL: {
								int LA1_2 = input.LA(2);

								if ((LA1_2 == NAME)) {
									int LA1_8 = input.LA(3);

									if (((LA1_8 == COMMA) || (LA1_8 == SEMI))) {
										alt1 = 1;
									}

								}

							}
								break;
							case T_STRING: {
								int LA1_3 = input.LA(2);

								if ((LA1_3 == NAME)) {
									int LA1_8 = input.LA(3);

									if (((LA1_8 == COMMA) || (LA1_8 == SEMI))) {
										alt1 = 1;
									}

								}

							}
								break;
							case T_BOOL: {
								int LA1_4 = input.LA(2);

								if ((LA1_4 == NAME)) {
									int LA1_8 = input.LA(3);

									if (((LA1_8 == COMMA) || (LA1_8 == SEMI))) {
										alt1 = 1;
									}

								}

							}
								break;
							case T_VOID: {
								int LA1_5 = input.LA(2);

								if ((LA1_5 == NAME)) {
									int LA1_8 = input.LA(3);

									if (((LA1_8 == COMMA) || (LA1_8 == SEMI))) {
										alt1 = 1;
									}

								}

							}
								break;
							case T_CHAIN: {
								int LA1_6 = input.LA(2);

								if ((LA1_6 == NAME)) {
									int LA1_8 = input.LA(3);

									if (((LA1_8 == COMMA) || (LA1_8 == SEMI))) {
										alt1 = 1;
									}

								}

							}
								break;

							}

							switch (alt1) {
							case 1:
							// /home/luis/workspace/Grama2/src/Compilador/Grama.g:104:6:
							// vardecl SEMI
							{
								pushFollow(FOLLOW_vardecl_in_grama691);
								vardecl();

								state._fsp--;

								match(input, SEMI, FOLLOW_SEMI_in_grama693);

							}
								break;

							default:
								break loop1;
							}
						} while (true);

						// /home/luis/workspace/Grama2/src/Compilador/Grama.g:104:20:
						// ( stat )
						// /home/luis/workspace/Grama2/src/Compilador/Grama.g:104:21:
						// stat
						{
							pushFollow(FOLLOW_stat_in_grama697);
							stat();

							state._fsp--;

						}

					}
						break;

					default:
						if (cnt2 >= 1) {
							break loop2;
						}
						EarlyExitException eee = new EarlyExitException(2, input);
						throw eee;
					}
					cnt2++;
				} while (true);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return;
	}

	// $ANTLR end "grama"

	// $ANTLR start "stat"
	// /home/luis/workspace/Grama2/src/Compilador/Grama.g:107:1: stat : (
	// def_func | funccall SEMI | def_print SEMI );
	public final void stat() throws RecognitionException {
		try {
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:108:2: (
			// def_func | funccall SEMI | def_print SEMI )
			int alt3 = 3;
			switch (input.LA(1)) {
			case T_BOOL:
			case T_CHAIN:
			case T_INT:
			case T_REAL:
			case T_STRING:
			case T_VOID: {
				alt3 = 1;
			}
				break;
			case NAME: {
				alt3 = 2;
			}
				break;
			case PRINT: {
				alt3 = 3;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException("", 3, 0, input);

				throw nvae;

			}

			switch (alt3) {
			case 1:
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:108:4:
			// def_func
			{
				pushFollow(FOLLOW_def_func_in_stat712);
				def_func();

				state._fsp--;

			}
				break;
			case 2:
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:109:6:
			// funccall SEMI
			{
				pushFollow(FOLLOW_funccall_in_stat722);
				funccall();

				state._fsp--;

				match(input, SEMI, FOLLOW_SEMI_in_stat724);

			}
				break;
			case 3:
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:110:4:
			// def_print SEMI
			{
				pushFollow(FOLLOW_def_print_in_stat729);
				def_print();

				state._fsp--;

				match(input, SEMI, FOLLOW_SEMI_in_stat731);

			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return;
	}

	// $ANTLR end "stat"

	// $ANTLR start "bloco"
	// /home/luis/workspace/Grama2/src/Compilador/Grama.g:113:1: bloco returns [
	// String type ] : ( varatrib SEMI | vardecl SEMI | funccall SEMI | def_if |
	// def_while |t= def_return SEMI | def_print SEMI );
	public final String bloco() throws RecognitionException {
		String type = null;

		String t = null;

		try {
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:114:2: (
			// varatrib SEMI | vardecl SEMI | funccall SEMI | def_if | def_while
			// |t= def_return SEMI | def_print SEMI )
			int alt4 = 7;
			switch (input.LA(1)) {
			case NAME: {
				int LA4_1 = input.LA(2);

				if ((LA4_1 == ASSIGN)) {
					alt4 = 1;
				} else if ((LA4_1 == LPAREN)) {
					alt4 = 3;
				} else {
					NoViableAltException nvae = new NoViableAltException("", 4, 1, input);

					throw nvae;

				}
			}
				break;
			case T_BOOL:
			case T_CHAIN:
			case T_INT:
			case T_REAL:
			case T_STRING:
			case T_VOID: {
				alt4 = 2;
			}
				break;
			case IF: {
				alt4 = 4;
			}
				break;
			case WHILE: {
				alt4 = 5;
			}
				break;
			case RETURN: {
				alt4 = 6;
			}
				break;
			case PRINT: {
				alt4 = 7;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException("", 4, 0, input);

				throw nvae;

			}

			switch (alt4) {
			case 1:
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:114:4:
			// varatrib SEMI
			{
				pushFollow(FOLLOW_varatrib_in_bloco746);
				varatrib();

				state._fsp--;

				match(input, SEMI, FOLLOW_SEMI_in_bloco748);

			}
				break;
			case 2:
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:115:4: vardecl
			// SEMI
			{
				pushFollow(FOLLOW_vardecl_in_bloco754);
				vardecl();

				state._fsp--;

				match(input, SEMI, FOLLOW_SEMI_in_bloco760);

			}
				break;
			case 3:
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:116:4:
			// funccall SEMI
			{
				pushFollow(FOLLOW_funccall_in_bloco766);
				funccall();

				state._fsp--;

				match(input, SEMI, FOLLOW_SEMI_in_bloco768);

			}
				break;
			case 4:
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:117:4: def_if
			{
				pushFollow(FOLLOW_def_if_in_bloco774);
				def_if();

				state._fsp--;

			}
				break;
			case 5:
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:118:4:
			// def_while
			{
				pushFollow(FOLLOW_def_while_in_bloco783);
				def_while();

				state._fsp--;

			}
				break;
			case 6:
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:119:4: t=
			// def_return SEMI
			{
				pushFollow(FOLLOW_def_return_in_bloco794);
				t = def_return();

				state._fsp--;

				type = t;

				match(input, SEMI, FOLLOW_SEMI_in_bloco798);

			}
				break;
			case 7:
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:120:4:
			// def_print SEMI
			{
				pushFollow(FOLLOW_def_print_in_bloco804);
				def_print();

				state._fsp--;

				match(input, SEMI, FOLLOW_SEMI_in_bloco806);

			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return type;
	}

	// $ANTLR end "bloco"

	// $ANTLR start "varatrib"
	// /home/luis/workspace/Grama2/src/Compilador/Grama.g:123:1: varatrib : n=
	// NAME ASSIGN le= logic_op_expr ;
	public final void varatrib() throws RecognitionException {
		Token n = null;
		gramaParser.logic_op_expr_return le = null;

		try {
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:124:2: (n=
			// NAME ASSIGN le= logic_op_expr )
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:124:5: n= NAME
			// ASSIGN le= logic_op_expr
			{
				n = (Token) match(input, NAME, FOLLOW_NAME_in_varatrib821);

				match(input, ASSIGN, FOLLOW_ASSIGN_in_varatrib823);

				pushFollow(FOLLOW_logic_op_expr_in_varatrib827);
				le = logic_op_expr();

				state._fsp--;

				semantico.eval_assign(semantico.get_type(n.getText(), n.getLine()), le.type, n.getLine());
				generator.addVarAtrib(n.getText(), le.type);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return;
	}

	// $ANTLR end "varatrib"

	// $ANTLR start "vardecl"
	// /home/luis/workspace/Grama2/src/Compilador/Grama.g:127:1: vardecl : t=
	// type v= NAME ( COMMA v= NAME )* ;
	public final void vardecl() throws RecognitionException {
		Token v = null;
		String t = null;

		try {
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:128:2: (t=
			// type v= NAME ( COMMA v= NAME )* )
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:128:5: t= type
			// v= NAME ( COMMA v= NAME )*
			{
				pushFollow(FOLLOW_type_in_vardecl844);
				t = type();

				state._fsp--;

				v = (Token) match(input, NAME, FOLLOW_NAME_in_vardecl848);

				semantico.add_variable(v.getText(), t, v.getLine());
				generator.addVarDec(v.getText(), t);

				// /home/luis/workspace/Grama2/src/Compilador/Grama.g:129:3: (
				// COMMA v= NAME )*
				loop5: do {
					int alt5 = 2;
					int LA5_0 = input.LA(1);

					if ((LA5_0 == COMMA)) {
						alt5 = 1;
					}

					switch (alt5) {
					case 1:
					// /home/luis/workspace/Grama2/src/Compilador/Grama.g:129:4:
					// COMMA v= NAME
					{
						match(input, COMMA, FOLLOW_COMMA_in_vardecl857);

						v = (Token) match(input, NAME, FOLLOW_NAME_in_vardecl861);

						semantico.add_variable(v.getText(), t, v.getLine());
						generator.addVarDec(v.getText(), t);

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
		}

		finally {
			// do for sure before leaving
		}
		return;
	}

	// $ANTLR end "vardecl"

	// $ANTLR start "funccall"
	// /home/luis/workspace/Grama2/src/Compilador/Grama.g:132:1: funccall
	// returns [ String type ] : n= NAME LPAREN h= arglist RPAREN ;
	public final String funccall() throws RecognitionException {
		String type = null;

		Token n = null;
		HashMap<String, String> h = null;

		try {
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:133:2: (n=
			// NAME LPAREN h= arglist RPAREN )
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:133:5: n= NAME
			// LPAREN h= arglist RPAREN
			{
				n = (Token) match(input, NAME, FOLLOW_NAME_in_funccall886);

				match(input, LPAREN, FOLLOW_LPAREN_in_funccall888);

				pushFollow(FOLLOW_arglist_in_funccall892);
				h = arglist();

				state._fsp--;

				match(input, RPAREN, FOLLOW_RPAREN_in_funccall894);

				type = semantico.eval_funccall(n.getText(), h, n.getLine());
				generator.addFunctionCall(n.getText(), h, type);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return type;
	}

	// $ANTLR end "funccall"

	// $ANTLR start "def_func"
	// /home/luis/workspace/Grama2/src/Compilador/Grama.g:136:1: def_func : t=
	// type n= NAME LPAREN h= typedarglist RPAREN LCURLY (tw= bloco )* RCURLY ;
	public final void def_func() throws RecognitionException {
		Token n = null;
		String t = null;

		HashMap<String, String> h = null;

		String tw = null;

		try {
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:137:2: (t=
			// type n= NAME LPAREN h= typedarglist RPAREN LCURLY (tw= bloco )*
			// RCURLY )
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:137:5: t= type
			// n= NAME LPAREN h= typedarglist RPAREN LCURLY (tw= bloco )* RCURLY
			{
				pushFollow(FOLLOW_type_in_def_func912);
				t = type();

				state._fsp--;

				n = (Token) match(input, NAME, FOLLOW_NAME_in_def_func916);

				match(input, LPAREN, FOLLOW_LPAREN_in_def_func918);

				pushFollow(FOLLOW_typedarglist_in_def_func922);
				h = typedarglist();

				state._fsp--;

				match(input, RPAREN, FOLLOW_RPAREN_in_def_func924);

				match(input, LCURLY, FOLLOW_LCURLY_in_def_func926);

				semantico.open_function_decl(t, h, n.getText(), n.getLine());
				generator.addFunction(n.getText(), h, t);

				// /home/luis/workspace/Grama2/src/Compilador/Grama.g:137:146:
				// (tw= bloco )*
				loop6: do {
					int alt6 = 2;
					int LA6_0 = input.LA(1);

					if (((LA6_0 == IF) || (LA6_0 == NAME) || (LA6_0 == PRINT) || (LA6_0 == RETURN)
							|| ((LA6_0 >= T_BOOL) && (LA6_0 <= T_VOID)) || (LA6_0 == WHILE))) {
						alt6 = 1;
					}

					switch (alt6) {
					case 1:
					// /home/luis/workspace/Grama2/src/Compilador/Grama.g:137:147:
					// tw= bloco
					{
						pushFollow(FOLLOW_bloco_in_def_func933);
						tw = bloco();

						state._fsp--;

					}
						break;

					default:
						break loop6;
					}
				} while (true);

				semantico.close_function_decl(tw);
				generator.addEnd(t);

				match(input, RCURLY, FOLLOW_RCURLY_in_def_func940);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return;
	}

	// $ANTLR end "def_func"

	// $ANTLR start "def_if"
	// /home/luis/workspace/Grama2/src/Compilador/Grama.g:140:1: def_if : IF
	// LPAREN e= logic_op_expr RPAREN LCURLY ( bloco )* ( RCURLY | ( RCURLY ELSE
	// LCURLY ( bloco )* RCURLY ) ) ;
	public final void def_if() throws RecognitionException {
		gramaParser.logic_op_expr_return e = null;

		try {
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:141:2: ( IF
			// LPAREN e= logic_op_expr RPAREN LCURLY ( bloco )* ( RCURLY | (
			// RCURLY ELSE LCURLY ( bloco )* RCURLY ) ) )
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:141:5: IF
			// LPAREN e= logic_op_expr RPAREN LCURLY ( bloco )* ( RCURLY | (
			// RCURLY ELSE LCURLY ( bloco )* RCURLY ) )
			{
				match(input, IF, FOLLOW_IF_in_def_if953);

				match(input, LPAREN, FOLLOW_LPAREN_in_def_if955);

				pushFollow(FOLLOW_logic_op_expr_in_def_if959);
				e = logic_op_expr();

				state._fsp--;

				generator.addIf(e.type, e.opr, "Else");

				match(input, RPAREN, FOLLOW_RPAREN_in_def_if963);

				match(input, LCURLY, FOLLOW_LCURLY_in_def_if965);

				// /home/luis/workspace/Grama2/src/Compilador/Grama.g:142:3: (
				// bloco )*
				loop7: do {
					int alt7 = 2;
					int LA7_0 = input.LA(1);

					if (((LA7_0 == IF) || (LA7_0 == NAME) || (LA7_0 == PRINT) || (LA7_0 == RETURN)
							|| ((LA7_0 >= T_BOOL) && (LA7_0 <= T_VOID)) || (LA7_0 == WHILE))) {
						alt7 = 1;
					}

					switch (alt7) {
					case 1:
					// /home/luis/workspace/Grama2/src/Compilador/Grama.g:142:3:
					// bloco
					{
						pushFollow(FOLLOW_bloco_in_def_if970);
						bloco();

						state._fsp--;

					}
						break;

					default:
						break loop7;
					}
				} while (true);

				generator.addGoTo("Done" + generator.addLabel("Done"));
				generator.addElse();

				// /home/luis/workspace/Grama2/src/Compilador/Grama.g:144:3: (
				// RCURLY | ( RCURLY ELSE LCURLY ( bloco )* RCURLY ) )
				int alt9 = 2;
				int LA9_0 = input.LA(1);

				if ((LA9_0 == RCURLY)) {
					int LA9_1 = input.LA(2);

					if ((LA9_1 == ELSE)) {
						alt9 = 2;
					} else if (((LA9_1 == IF) || (LA9_1 == NAME) || (LA9_1 == PRINT) || (LA9_1 == RCURLY)
							|| (LA9_1 == RETURN) || ((LA9_1 >= T_BOOL) && (LA9_1 <= T_VOID)) || (LA9_1 == WHILE))) {
						alt9 = 1;
					} else {
						NoViableAltException nvae = new NoViableAltException("", 9, 1, input);

						throw nvae;

					}
				} else {
					NoViableAltException nvae = new NoViableAltException("", 9, 0, input);

					throw nvae;

				}
				switch (alt9) {
				case 1:
				// /home/luis/workspace/Grama2/src/Compilador/Grama.g:144:5:
				// RCURLY
				{
					match(input, RCURLY, FOLLOW_RCURLY_in_def_if982);

				}
					break;
				case 2:
				// /home/luis/workspace/Grama2/src/Compilador/Grama.g:144:14: (
				// RCURLY ELSE LCURLY ( bloco )* RCURLY )
				{
					// /home/luis/workspace/Grama2/src/Compilador/Grama.g:144:14:
					// ( RCURLY ELSE LCURLY ( bloco )* RCURLY )
					// /home/luis/workspace/Grama2/src/Compilador/Grama.g:144:16:
					// RCURLY ELSE LCURLY ( bloco )* RCURLY
					{
						match(input, RCURLY, FOLLOW_RCURLY_in_def_if988);

						match(input, ELSE, FOLLOW_ELSE_in_def_if990);

						match(input, LCURLY, FOLLOW_LCURLY_in_def_if992);

						// /home/luis/workspace/Grama2/src/Compilador/Grama.g:144:35:
						// ( bloco )*
						loop8: do {
							int alt8 = 2;
							int LA8_0 = input.LA(1);

							if (((LA8_0 == IF) || (LA8_0 == NAME) || (LA8_0 == PRINT) || (LA8_0 == RETURN)
									|| ((LA8_0 >= T_BOOL) && (LA8_0 <= T_VOID)) || (LA8_0 == WHILE))) {
								alt8 = 1;
							}

							switch (alt8) {
							case 1:
							// /home/luis/workspace/Grama2/src/Compilador/Grama.g:144:35:
							// bloco
							{
								pushFollow(FOLLOW_bloco_in_def_if994);
								bloco();

								state._fsp--;

							}
								break;

							default:
								break loop8;
							}
						} while (true);

						match(input, RCURLY, FOLLOW_RCURLY_in_def_if997);

					}

				}
					break;

				}

				generator.addDone();

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return;
	}

	// $ANTLR end "def_if"

	// $ANTLR start "def_while"
	// /home/luis/workspace/Grama2/src/Compilador/Grama.g:148:1: def_while :
	// WHILE LPAREN le= logic_op_expr RPAREN LCURLY ( bloco )* RCURLY ;
	public final void def_while() throws RecognitionException {
		gramaParser.logic_op_expr_return le = null;

		try {
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:148:11: (
			// WHILE LPAREN le= logic_op_expr RPAREN LCURLY ( bloco )* RCURLY )
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:148:13: WHILE
			// LPAREN le= logic_op_expr RPAREN LCURLY ( bloco )* RCURLY
			{
				generator.addWhileL();

				match(input, WHILE, FOLLOW_WHILE_in_def_while1020);

				match(input, LPAREN, FOLLOW_LPAREN_in_def_while1022);

				pushFollow(FOLLOW_logic_op_expr_in_def_while1026);
				le = logic_op_expr();

				state._fsp--;

				generator.pushWhile(le.type, le.opr);

				match(input, RPAREN, FOLLOW_RPAREN_in_def_while1030);

				match(input, LCURLY, FOLLOW_LCURLY_in_def_while1032);

				// /home/luis/workspace/Grama2/src/Compilador/Grama.g:150:3: (
				// bloco )*
				loop10: do {
					int alt10 = 2;
					int LA10_0 = input.LA(1);

					if (((LA10_0 == IF) || (LA10_0 == NAME) || (LA10_0 == PRINT) || (LA10_0 == RETURN)
							|| ((LA10_0 >= T_BOOL) && (LA10_0 <= T_VOID)) || (LA10_0 == WHILE))) {
						alt10 = 1;
					}

					switch (alt10) {
					case 1:
					// /home/luis/workspace/Grama2/src/Compilador/Grama.g:150:3:
					// bloco
					{
						pushFollow(FOLLOW_bloco_in_def_while1036);
						bloco();

						state._fsp--;

					}
						break;

					default:
						break loop10;
					}
				} while (true);

				generator.addGoTo("While" + generator.addLabel("While"));

				match(input, RCURLY, FOLLOW_RCURLY_in_def_while1041);

				generator.addDone();

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return;
	}

	// $ANTLR end "def_while"

	// $ANTLR start "type"
	// /home/luis/workspace/Grama2/src/Compilador/Grama.g:154:1: type returns [
	// String type ] : ( T_INT | T_REAL | T_STRING | T_BOOL | T_VOID | T_CHAIN
	// );
	public final String type() throws RecognitionException {
		String type = null;

		try {
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:155:2: ( T_INT
			// | T_REAL | T_STRING | T_BOOL | T_VOID | T_CHAIN )
			int alt11 = 6;
			switch (input.LA(1)) {
			case T_INT: {
				alt11 = 1;
			}
				break;
			case T_REAL: {
				alt11 = 2;
			}
				break;
			case T_STRING: {
				alt11 = 3;
			}
				break;
			case T_BOOL: {
				alt11 = 4;
			}
				break;
			case T_VOID: {
				alt11 = 5;
			}
				break;
			case T_CHAIN: {
				alt11 = 6;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException("", 11, 0, input);

				throw nvae;

			}

			switch (alt11) {
			case 1:
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:155:4: T_INT
			{
				match(input, T_INT, FOLLOW_T_INT_in_type1060);

				type = "Integer";

			}
				break;
			case 2:
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:156:4: T_REAL
			{
				match(input, T_REAL, FOLLOW_T_REAL_in_type1068);

				type = "Real";

			}
				break;
			case 3:
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:157:4:
			// T_STRING
			{
				match(input, T_STRING, FOLLOW_T_STRING_in_type1075);

				type = "String";

			}
				break;
			case 4:
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:158:4: T_BOOL
			{
				match(input, T_BOOL, FOLLOW_T_BOOL_in_type1082);

				type = "Boolean";

			}
				break;
			case 5:
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:159:4: T_VOID
			{
				match(input, T_VOID, FOLLOW_T_VOID_in_type1089);

				type = "Void";

			}
				break;
			case 6:
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:160:4: T_CHAIN
			{
				match(input, T_CHAIN, FOLLOW_T_CHAIN_in_type1096);

				type = "Chain";

			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return type;
	}

	// $ANTLR end "type"

	// $ANTLR start "term"
	// /home/luis/workspace/Grama2/src/Compilador/Grama.g:163:1: term returns [
	// String type ] : (v= variable |f= funccall |n= number |str= string );
	public final String term() throws RecognitionException {
		String type = null;

		String v = null;

		String f = null;

		String n = null;

		String str = null;

		try {
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:164:2: (v=
			// variable |f= funccall |n= number |str= string )
			int alt12 = 4;
			switch (input.LA(1)) {
			case NAME: {
				int LA12_1 = input.LA(2);

				if ((LA12_1 == LPAREN)) {
					alt12 = 2;
				} else if (((LA12_1 == AND) || (LA12_1 == DOT) || (LA12_1 == EQUAL)
						|| ((LA12_1 >= GREATER) && (LA12_1 <= GREATEREQUAL))
						|| ((LA12_1 >= LESS) && (LA12_1 <= LESSEQUAL)) || (LA12_1 == MINUS)
						|| ((LA12_1 >= NOTEQUAL) && (LA12_1 <= PLUS)) || ((LA12_1 >= RPAREN) && (LA12_1 <= STAR)))) {
					alt12 = 1;
				} else {
					NoViableAltException nvae = new NoViableAltException("", 12, 1, input);

					throw nvae;

				}
			}
				break;
			case FLOAT:
			case INT: {
				alt12 = 3;
			}
				break;
			case NORMALSTRING: {
				alt12 = 4;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException("", 12, 0, input);

				throw nvae;

			}

			switch (alt12) {
			case 1:
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:164:4: v=
			// variable
			{
				pushFollow(FOLLOW_variable_in_term1115);
				v = variable();

				state._fsp--;

				type = semantico.get_type(v);

			}
				break;
			case 2:
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:165:6: f=
			// funccall
			{
				pushFollow(FOLLOW_funccall_in_term1126);
				f = funccall();

				state._fsp--;

				type = f;

			}
				break;
			case 3:
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:166:4: n=
			// number
			{
				pushFollow(FOLLOW_number_in_term1136);
				n = number();

				state._fsp--;

				type = n;

			}
				break;
			case 4:
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:167:4: str=
			// string
			{
				pushFollow(FOLLOW_string_in_term1145);
				str = string();

				state._fsp--;

				type = str;

			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return type;
	}

	// $ANTLR end "term"

	// $ANTLR start "unary_op_expr"
	// /home/luis/workspace/Grama2/src/Compilador/Grama.g:170:1: unary_op_expr
	// returns [ String type ] : (op= ( MINUS | NOT ) )? t= term ;
	public final String unary_op_expr() throws RecognitionException {
		String type = null;

		Token op = null;
		String t = null;

		try {
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:171:2: ( (op=
			// ( MINUS | NOT ) )? t= term )
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:171:4: (op= (
			// MINUS | NOT ) )? t= term
			{
				// /home/luis/workspace/Grama2/src/Compilador/Grama.g:171:6:
				// (op= ( MINUS | NOT ) )?
				int alt13 = 2;
				int LA13_0 = input.LA(1);

				if (((LA13_0 == MINUS) || (LA13_0 == NOT))) {
					alt13 = 1;
				}
				switch (alt13) {
				case 1:
				// /home/luis/workspace/Grama2/src/Compilador/Grama.g:171:6: op=
				// ( MINUS | NOT )
				{
					op = (Token) input.LT(1);

					if ((input.LA(1) == MINUS) || (input.LA(1) == NOT)) {
						input.consume();
						state.errorRecovery = false;
					} else {
						MismatchedSetException mse = new MismatchedSetException(null, input);
						throw mse;
					}

				}
					break;

				}

				pushFollow(FOLLOW_term_in_unary_op_expr1177);
				t = term();

				state._fsp--;

				type = t;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return type;
	}

	// $ANTLR end "unary_op_expr"

	// $ANTLR start "strong_op_expr"
	// /home/luis/workspace/Grama2/src/Compilador/Grama.g:174:1: strong_op_expr
	// returns [ String type ] : t1= unary_op_expr (op= ( STAR | SLASH | PERCENT
	// ) t2= unary_op_expr )* ;
	public final String strong_op_expr() throws RecognitionException {
		String type = null;

		Token op = null;
		String t1 = null;

		String t2 = null;

		try {
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:175:2: (t1=
			// unary_op_expr (op= ( STAR | SLASH | PERCENT ) t2= unary_op_expr
			// )* )
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:175:4: t1=
			// unary_op_expr (op= ( STAR | SLASH | PERCENT ) t2= unary_op_expr
			// )*
			{
				pushFollow(FOLLOW_unary_op_expr_in_strong_op_expr1196);
				t1 = unary_op_expr();

				state._fsp--;

				type = t1;

				// /home/luis/workspace/Grama2/src/Compilador/Grama.g:176:16:
				// (op= ( STAR | SLASH | PERCENT ) t2= unary_op_expr )*
				loop14: do {
					int alt14 = 2;
					int LA14_0 = input.LA(1);

					if (((LA14_0 == PERCENT) || ((LA14_0 >= SLASH) && (LA14_0 <= STAR)))) {
						alt14 = 1;
					}

					switch (alt14) {
					case 1:
					// /home/luis/workspace/Grama2/src/Compilador/Grama.g:176:18:
					// op= ( STAR | SLASH | PERCENT ) t2= unary_op_expr
					{
						op = (Token) input.LT(1);

						if ((input.LA(1) == PERCENT) || ((input.LA(1) >= SLASH) && (input.LA(1) <= STAR))) {
							input.consume();
							state.errorRecovery = false;
						} else {
							MismatchedSetException mse = new MismatchedSetException(null, input);
							throw mse;
						}

						pushFollow(FOLLOW_unary_op_expr_in_strong_op_expr1222);
						t2 = unary_op_expr();

						state._fsp--;

						type = semantico.eval_strong_expr(t1, t2, op.getText());
						generator.pushOperator(op.getText(), t1);

					}
						break;

					default:
						break loop14;
					}
				} while (true);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return type;
	}

	// $ANTLR end "strong_op_expr"

	// $ANTLR start "weak_op_expr"
	// /home/luis/workspace/Grama2/src/Compilador/Grama.g:181:1: weak_op_expr
	// returns [ String type ] : (t1= strong_op_expr (op= ( PLUS | MINUS ) t2=
	// strong_op_expr )* |f= FALSE |t= TRUE );
	public final String weak_op_expr() throws RecognitionException {
		String type = null;

		Token op = null;
		Token f = null;
		Token t = null;
		String t1 = null;

		String t2 = null;

		try {
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:182:2: (t1=
			// strong_op_expr (op= ( PLUS | MINUS ) t2= strong_op_expr )* |f=
			// FALSE |t= TRUE )
			int alt16 = 3;
			switch (input.LA(1)) {
			case FLOAT:
			case INT:
			case MINUS:
			case NAME:
			case NORMALSTRING:
			case NOT: {
				alt16 = 1;
			}
				break;
			case FALSE: {
				alt16 = 2;
			}
				break;
			case TRUE: {
				alt16 = 3;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException("", 16, 0, input);

				throw nvae;

			}

			switch (alt16) {
			case 1:
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:182:4: t1=
			// strong_op_expr (op= ( PLUS | MINUS ) t2= strong_op_expr )*
			{
				pushFollow(FOLLOW_strong_op_expr_in_weak_op_expr1247);
				t1 = strong_op_expr();

				state._fsp--;

				type = t1;

				// /home/luis/workspace/Grama2/src/Compilador/Grama.g:182:35:
				// (op= ( PLUS | MINUS ) t2= strong_op_expr )*
				loop15: do {
					int alt15 = 2;
					int LA15_0 = input.LA(1);

					if (((LA15_0 == MINUS) || (LA15_0 == PLUS))) {
						alt15 = 1;
					}

					switch (alt15) {
					case 1:
					// /home/luis/workspace/Grama2/src/Compilador/Grama.g:182:37:
					// op= ( PLUS | MINUS ) t2= strong_op_expr
					{
						op = (Token) input.LT(1);

						if ((input.LA(1) == MINUS) || (input.LA(1) == PLUS)) {
							input.consume();
							state.errorRecovery = false;
						} else {
							MismatchedSetException mse = new MismatchedSetException(null, input);
							throw mse;
						}

						pushFollow(FOLLOW_strong_op_expr_in_weak_op_expr1267);
						t2 = strong_op_expr();

						state._fsp--;

						type = semantico.eval_weak_expr(t1, t2, op.getText(), op.getLine());
						generator.pushOperator(op.getText(), t1);

					}
						break;

					default:
						break loop15;
					}
				} while (true);

			}
				break;
			case 2:
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:184:4: f=
			// FALSE
			{
				f = (Token) match(input, FALSE, FOLLOW_FALSE_in_weak_op_expr1282);

				generator.pushBoolean(f.getText());

			}
				break;
			case 3:
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:185:4: t= TRUE
			{
				t = (Token) match(input, TRUE, FOLLOW_TRUE_in_weak_op_expr1291);

				generator.pushBoolean(t.getText());

			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return type;
	}

	// $ANTLR end "weak_op_expr"

	public static class relational_op_expr_return extends ParserRuleReturnScope {
		public String type;
		public String opr;
	};

	// $ANTLR start "relational_op_expr"
	// /home/luis/workspace/Grama2/src/Compilador/Grama.g:188:1:
	// relational_op_expr returns [ String type, String opr ] : t1= weak_op_expr
	// (op= ( LESS | GREATER | EQUAL | NOTEQUAL | GREATEREQUAL | LESSEQUAL ) t2=
	// weak_op_expr )* ;
	public final gramaParser.relational_op_expr_return relational_op_expr() throws RecognitionException {
		gramaParser.relational_op_expr_return retval = new gramaParser.relational_op_expr_return();
		retval.start = input.LT(1);

		Token op = null;
		String t1 = null;

		String t2 = null;

		try {
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:189:2: (t1=
			// weak_op_expr (op= ( LESS | GREATER | EQUAL | NOTEQUAL |
			// GREATEREQUAL | LESSEQUAL ) t2= weak_op_expr )* )
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:189:4: t1=
			// weak_op_expr (op= ( LESS | GREATER | EQUAL | NOTEQUAL |
			// GREATEREQUAL | LESSEQUAL ) t2= weak_op_expr )*
			{
				pushFollow(FOLLOW_weak_op_expr_in_relational_op_expr1311);
				t1 = weak_op_expr();

				state._fsp--;

				retval.type = t1;

				// /home/luis/workspace/Grama2/src/Compilador/Grama.g:189:33:
				// (op= ( LESS | GREATER | EQUAL | NOTEQUAL | GREATEREQUAL |
				// LESSEQUAL ) t2= weak_op_expr )*
				loop17: do {
					int alt17 = 2;
					int LA17_0 = input.LA(1);

					if (((LA17_0 == EQUAL) || ((LA17_0 >= GREATER) && (LA17_0 <= GREATEREQUAL))
							|| ((LA17_0 >= LESS) && (LA17_0 <= LESSEQUAL)) || (LA17_0 == NOTEQUAL))) {
						alt17 = 1;
					}

					switch (alt17) {
					case 1:
					// /home/luis/workspace/Grama2/src/Compilador/Grama.g:189:35:
					// op= ( LESS | GREATER | EQUAL | NOTEQUAL | GREATEREQUAL |
					// LESSEQUAL ) t2= weak_op_expr
					{
						op = (Token) input.LT(1);

						if ((input.LA(1) == EQUAL) || ((input.LA(1) >= GREATER) && (input.LA(1) <= GREATEREQUAL))
								|| ((input.LA(1) >= LESS) && (input.LA(1) <= LESSEQUAL)) || (input.LA(1) == NOTEQUAL)) {
							input.consume();
							state.errorRecovery = false;
						} else {
							MismatchedSetException mse = new MismatchedSetException(null, input);
							throw mse;
						}

						pushFollow(FOLLOW_weak_op_expr_in_relational_op_expr1347);
						t2 = weak_op_expr();

						state._fsp--;

						semantico.eval_relational_expr(t1, t2, op.getText(), op.getLine());
						retval.opr = op.getText();

					}
						break;

					default:
						break loop17;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "relational_op_expr"

	public static class logic_op_expr_return extends ParserRuleReturnScope {
		public String type;
		public String opr;
	};

	// $ANTLR start "logic_op_expr"
	// /home/luis/workspace/Grama2/src/Compilador/Grama.g:194:1: logic_op_expr
	// returns [ String type, String opr ] : r1= relational_op_expr (op= ( OR |
	// AND ) r2= relational_op_expr )* ;
	public final gramaParser.logic_op_expr_return logic_op_expr() throws RecognitionException {
		gramaParser.logic_op_expr_return retval = new gramaParser.logic_op_expr_return();
		retval.start = input.LT(1);

		Token op = null;
		gramaParser.relational_op_expr_return r1 = null;

		gramaParser.relational_op_expr_return r2 = null;

		try {
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:195:2: (r1=
			// relational_op_expr (op= ( OR | AND ) r2= relational_op_expr )* )
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:195:4: r1=
			// relational_op_expr (op= ( OR | AND ) r2= relational_op_expr )*
			{
				pushFollow(FOLLOW_relational_op_expr_in_logic_op_expr1371);
				r1 = relational_op_expr();

				state._fsp--;

				retval.type = r1.type;
				retval.opr = r1.opr;

				// /home/luis/workspace/Grama2/src/Compilador/Grama.g:195:58:
				// (op= ( OR | AND ) r2= relational_op_expr )*
				loop18: do {
					int alt18 = 2;
					int LA18_0 = input.LA(1);

					if (((LA18_0 == AND) || (LA18_0 == OR))) {
						alt18 = 1;
					}

					switch (alt18) {
					case 1:
					// /home/luis/workspace/Grama2/src/Compilador/Grama.g:195:60:
					// op= ( OR | AND ) r2= relational_op_expr
					{
						op = (Token) input.LT(1);

						if ((input.LA(1) == AND) || (input.LA(1) == OR)) {
							input.consume();
							state.errorRecovery = false;
						} else {
							MismatchedSetException mse = new MismatchedSetException(null, input);
							throw mse;
						}

						pushFollow(FOLLOW_relational_op_expr_in_logic_op_expr1391);
						r2 = relational_op_expr();

						state._fsp--;

						semantico.eval_logic_expr(r1.type, r2.type, op.getText(), op.getLine());
						retval.opr = op.getText();

					}
						break;

					default:
						break loop18;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "logic_op_expr"

	// $ANTLR start "typedarglist"
	// /home/luis/workspace/Grama2/src/Compilador/Grama.g:200:1: typedarglist
	// returns [ HashMap<String,String> tamap ] : (t= type n= NAME ( COMMA t=
	// type n= NAME )* )? ;
	public final HashMap<String, String> typedarglist() throws RecognitionException {
		HashMap<String, String> tamap = null;

		Token n = null;
		String t = null;

		try {
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:201:2: ( (t=
			// type n= NAME ( COMMA t= type n= NAME )* )? )
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:201:3: (t=
			// type n= NAME ( COMMA t= type n= NAME )* )?
			{
				tamap = new HashMap<String, String>();

				// /home/luis/workspace/Grama2/src/Compilador/Grama.g:202:2: (t=
				// type n= NAME ( COMMA t= type n= NAME )* )?
				int alt20 = 2;
				int LA20_0 = input.LA(1);

				if ((((LA20_0 >= T_BOOL) && (LA20_0 <= T_VOID)))) {
					alt20 = 1;
				}
				switch (alt20) {
				case 1:
				// /home/luis/workspace/Grama2/src/Compilador/Grama.g:202:4: t=
				// type n= NAME ( COMMA t= type n= NAME )*
				{
					pushFollow(FOLLOW_type_in_typedarglist1421);
					t = type();

					state._fsp--;

					n = (Token) match(input, NAME, FOLLOW_NAME_in_typedarglist1425);

					tamap.put(n.getText(), t);

					// /home/luis/workspace/Grama2/src/Compilador/Grama.g:202:48:
					// ( COMMA t= type n= NAME )*
					loop19: do {
						int alt19 = 2;
						int LA19_0 = input.LA(1);

						if ((LA19_0 == COMMA)) {
							alt19 = 1;
						}

						switch (alt19) {
						case 1:
						// /home/luis/workspace/Grama2/src/Compilador/Grama.g:202:50:
						// COMMA t= type n= NAME
						{
							match(input, COMMA, FOLLOW_COMMA_in_typedarglist1430);

							pushFollow(FOLLOW_type_in_typedarglist1434);
							t = type();

							state._fsp--;

							n = (Token) match(input, NAME, FOLLOW_NAME_in_typedarglist1438);

							tamap.put(n.getText(), t);

						}
							break;

						default:
							break loop19;
						}
					} while (true);

				}
					break;

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return tamap;
	}

	// $ANTLR end "typedarglist"

	// $ANTLR start "chestaccess"
	// /home/luis/workspace/Grama2/src/Compilador/Grama.g:205:1: chestaccess :
	// NAME ( DOT NAME )+ ;
	public final void chestaccess() throws RecognitionException {
		try {
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:206:2: ( NAME
			// ( DOT NAME )+ )
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:206:4: NAME (
			// DOT NAME )+
			{
				match(input, NAME, FOLLOW_NAME_in_chestaccess1458);

				// /home/luis/workspace/Grama2/src/Compilador/Grama.g:206:9: (
				// DOT NAME )+
				int cnt21 = 0;
				loop21: do {
					int alt21 = 2;
					int LA21_0 = input.LA(1);

					if ((LA21_0 == DOT)) {
						alt21 = 1;
					}

					switch (alt21) {
					case 1:
					// /home/luis/workspace/Grama2/src/Compilador/Grama.g:206:11:
					// DOT NAME
					{
						match(input, DOT, FOLLOW_DOT_in_chestaccess1462);

						match(input, NAME, FOLLOW_NAME_in_chestaccess1464);

					}
						break;

					default:
						if (cnt21 >= 1) {
							break loop21;
						}
						EarlyExitException eee = new EarlyExitException(21, input);
						throw eee;
					}
					cnt21++;
				} while (true);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return;
	}

	// $ANTLR end "chestaccess"

	// $ANTLR start "def_return"
	// /home/luis/workspace/Grama2/src/Compilador/Grama.g:209:1: def_return
	// returns [ String type ] : RETURN t= logic_op_expr ;
	public final String def_return() throws RecognitionException {
		String type = null;

		gramaParser.logic_op_expr_return t = null;

		try {
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:210:2: (
			// RETURN t= logic_op_expr )
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:210:4: RETURN
			// t= logic_op_expr
			{
				match(input, RETURN, FOLLOW_RETURN_in_def_return1483);

				pushFollow(FOLLOW_logic_op_expr_in_def_return1487);
				t = logic_op_expr();

				state._fsp--;

				type = t.type;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return type;
	}

	// $ANTLR end "def_return"

	// $ANTLR start "arglist"
	// /home/luis/workspace/Grama2/src/Compilador/Grama.g:213:1: arglist returns
	// [ HashMap<String,String> amap ] : (n= variable ( COMMA n1= variable )* )?
	// ;
	public final HashMap<String, String> arglist() throws RecognitionException {
		HashMap<String, String> amap = null;

		String n = null;

		String n1 = null;

		try {
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:214:2: ( (n=
			// variable ( COMMA n1= variable )* )? )
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:214:3: (n=
			// variable ( COMMA n1= variable )* )?
			{
				amap = new HashMap<String, String>();

				// /home/luis/workspace/Grama2/src/Compilador/Grama.g:215:2: (n=
				// variable ( COMMA n1= variable )* )?
				int alt23 = 2;
				int LA23_0 = input.LA(1);

				if ((LA23_0 == NAME)) {
					alt23 = 1;
				}
				switch (alt23) {
				case 1:
				// /home/luis/workspace/Grama2/src/Compilador/Grama.g:215:4: n=
				// variable ( COMMA n1= variable )*
				{
					pushFollow(FOLLOW_variable_in_arglist1510);
					n = variable();

					state._fsp--;

					amap.put(n, semantico.get_type(n));

					// /home/luis/workspace/Grama2/src/Compilador/Grama.g:215:44:
					// ( COMMA n1= variable )*
					loop22: do {
						int alt22 = 2;
						int LA22_0 = input.LA(1);

						if ((LA22_0 == COMMA)) {
							alt22 = 1;
						}

						switch (alt22) {
						case 1:
						// /home/luis/workspace/Grama2/src/Compilador/Grama.g:215:46:
						// COMMA n1= variable
						{
							match(input, COMMA, FOLLOW_COMMA_in_arglist1515);

							pushFollow(FOLLOW_variable_in_arglist1519);
							n1 = variable();

							state._fsp--;

							amap.put(n1, semantico.get_type(n1));

						}
							break;

						default:
							break loop22;
						}
					} while (true);

				}
					break;

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return amap;
	}

	// $ANTLR end "arglist"

	// $ANTLR start "variable"
	// /home/luis/workspace/Grama2/src/Compilador/Grama.g:218:1: variable
	// returns [ String name ] : (n= NAME | chestaccess );
	public final String variable() throws RecognitionException {
		String name = null;

		Token n = null;

		try {
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:219:2: (n=
			// NAME | chestaccess )
			int alt24 = 2;
			int LA24_0 = input.LA(1);

			if ((LA24_0 == NAME)) {
				int LA24_1 = input.LA(2);

				if (((LA24_1 == AND) || (LA24_1 == COMMA) || (LA24_1 == EQUAL)
						|| ((LA24_1 >= GREATER) && (LA24_1 <= GREATEREQUAL))
						|| ((LA24_1 >= LESS) && (LA24_1 <= LESSEQUAL)) || (LA24_1 == MINUS)
						|| ((LA24_1 >= NOTEQUAL) && (LA24_1 <= PLUS)) || ((LA24_1 >= RPAREN) && (LA24_1 <= STAR)))) {
					alt24 = 1;
				} else if ((LA24_1 == DOT)) {
					alt24 = 2;
				} else {
					NoViableAltException nvae = new NoViableAltException("", 24, 1, input);

					throw nvae;

				}
			} else {
				NoViableAltException nvae = new NoViableAltException("", 24, 0, input);

				throw nvae;

			}
			switch (alt24) {
			case 1:
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:219:4: n= NAME
			{
				n = (Token) match(input, NAME, FOLLOW_NAME_in_variable1544);

				name = n.getText();
				generator.loadVariable(n.getText(), semantico.get_type(n.getText(), n.getLine()));

			}
				break;
			case 2:
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:220:4:
			// chestaccess
			{
				pushFollow(FOLLOW_chestaccess_in_variable1551);
				chestaccess();

				state._fsp--;

			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return name;
	}

	// $ANTLR end "variable"

	// $ANTLR start "number"
	// /home/luis/workspace/Grama2/src/Compilador/Grama.g:223:1: number returns
	// [ String type ] : (inteiro= INT |real= FLOAT );
	public final String number() throws RecognitionException {
		String type = null;

		Token inteiro = null;
		Token real = null;

		try {
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:224:2:
			// (inteiro= INT |real= FLOAT )
			int alt25 = 2;
			int LA25_0 = input.LA(1);

			if ((LA25_0 == INT)) {
				alt25 = 1;
			} else if ((LA25_0 == FLOAT)) {
				alt25 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException("", 25, 0, input);

				throw nvae;

			}
			switch (alt25) {
			case 1:
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:224:4:
			// inteiro= INT
			{
				inteiro = (Token) match(input, INT, FOLLOW_INT_in_number1569);

				type = "Integer";
				generator.pushConstant(inteiro.getText());

			}
				break;
			case 2:
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:225:4: real=
			// FLOAT
			{
				real = (Token) match(input, FLOAT, FOLLOW_FLOAT_in_number1578);

				type = "Real";
				generator.pushConstant(real.getText());

			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return type;
	}

	// $ANTLR end "number"

	// $ANTLR start "string"
	// /home/luis/workspace/Grama2/src/Compilador/Grama.g:228:1: string returns
	// [ String type ] : strg= NORMALSTRING ;
	public final String string() throws RecognitionException {
		String type = null;

		Token strg = null;

		try {
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:229:2: (strg=
			// NORMALSTRING )
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:229:4: strg=
			// NORMALSTRING
			{
				strg = (Token) match(input, NORMALSTRING, FOLLOW_NORMALSTRING_in_string1597);

				type = "String";
				generator.pushConstant(strg.getText());

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return type;
	}

	// $ANTLR end "string"

	// $ANTLR start "def_print"
	// /home/luis/workspace/Grama2/src/Compilador/Grama.g:232:1: def_print
	// returns [ String type ] : PRINT LPAREN t= term RPAREN ;
	public final String def_print() throws RecognitionException {
		String type = null;

		String t = null;

		try {
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:233:2: ( PRINT
			// LPAREN t= term RPAREN )
			// /home/luis/workspace/Grama2/src/Compilador/Grama.g:233:4: PRINT
			// LPAREN t= term RPAREN
			{
				generator.pushPrint();

				match(input, PRINT, FOLLOW_PRINT_in_def_print1619);

				match(input, LPAREN, FOLLOW_LPAREN_in_def_print1621);

				pushFollow(FOLLOW_term_in_def_print1625);
				t = term();

				state._fsp--;

				match(input, RPAREN, FOLLOW_RPAREN_in_def_print1627);

				generator.pushInvokePrint(t);
				type = t;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return type;
	}

	// $ANTLR end "def_print"

	// Delegated rules

	public static final BitSet FOLLOW_vardecl_in_grama691 = new BitSet(new long[] { 0x0004000000000000L });
	public static final BitSet FOLLOW_SEMI_in_grama693 = new BitSet(new long[] { 0x3F00101000000000L });
	public static final BitSet FOLLOW_stat_in_grama697 = new BitSet(new long[] { 0x3F00101000000002L });
	public static final BitSet FOLLOW_def_func_in_stat712 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_funccall_in_stat722 = new BitSet(new long[] { 0x0004000000000000L });
	public static final BitSet FOLLOW_SEMI_in_stat724 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_def_print_in_stat729 = new BitSet(new long[] { 0x0004000000000000L });
	public static final BitSet FOLLOW_SEMI_in_stat731 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_varatrib_in_bloco746 = new BitSet(new long[] { 0x0004000000000000L });
	public static final BitSet FOLLOW_SEMI_in_bloco748 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_vardecl_in_bloco754 = new BitSet(new long[] { 0x0004000000000000L });
	public static final BitSet FOLLOW_SEMI_in_bloco760 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_funccall_in_bloco766 = new BitSet(new long[] { 0x0004000000000000L });
	public static final BitSet FOLLOW_SEMI_in_bloco768 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_def_if_in_bloco774 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_def_while_in_bloco783 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_def_return_in_bloco794 = new BitSet(new long[] { 0x0004000000000000L });
	public static final BitSet FOLLOW_SEMI_in_bloco798 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_def_print_in_bloco804 = new BitSet(new long[] { 0x0004000000000000L });
	public static final BitSet FOLLOW_SEMI_in_bloco806 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_NAME_in_varatrib821 = new BitSet(new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_ASSIGN_in_varatrib823 = new BitSet(new long[] { 0x00800078020C0000L });
	public static final BitSet FOLLOW_logic_op_expr_in_varatrib827 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_type_in_vardecl844 = new BitSet(new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_NAME_in_vardecl848 = new BitSet(new long[] { 0x0000000000000102L });
	public static final BitSet FOLLOW_COMMA_in_vardecl857 = new BitSet(new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_NAME_in_vardecl861 = new BitSet(new long[] { 0x0000000000000102L });
	public static final BitSet FOLLOW_NAME_in_funccall886 = new BitSet(new long[] { 0x0000000400000000L });
	public static final BitSet FOLLOW_LPAREN_in_funccall888 = new BitSet(new long[] { 0x0002001000000000L });
	public static final BitSet FOLLOW_arglist_in_funccall892 = new BitSet(new long[] { 0x0002000000000000L });
	public static final BitSet FOLLOW_RPAREN_in_funccall894 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_type_in_def_func912 = new BitSet(new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_NAME_in_def_func916 = new BitSet(new long[] { 0x0000000400000000L });
	public static final BitSet FOLLOW_LPAREN_in_def_func918 = new BitSet(new long[] { 0x3F02000000000000L });
	public static final BitSet FOLLOW_typedarglist_in_def_func922 = new BitSet(new long[] { 0x0002000000000000L });
	public static final BitSet FOLLOW_RPAREN_in_def_func924 = new BitSet(new long[] { 0x0000000008000000L });
	public static final BitSet FOLLOW_LCURLY_in_def_func926 = new BitSet(new long[] { 0xBF01501000800000L });
	public static final BitSet FOLLOW_bloco_in_def_func933 = new BitSet(new long[] { 0xBF01501000800000L });
	public static final BitSet FOLLOW_RCURLY_in_def_func940 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_IF_in_def_if953 = new BitSet(new long[] { 0x0000000400000000L });
	public static final BitSet FOLLOW_LPAREN_in_def_if955 = new BitSet(new long[] { 0x00800078020C0000L });
	public static final BitSet FOLLOW_logic_op_expr_in_def_if959 = new BitSet(new long[] { 0x0002000000000000L });
	public static final BitSet FOLLOW_RPAREN_in_def_if963 = new BitSet(new long[] { 0x0000000008000000L });
	public static final BitSet FOLLOW_LCURLY_in_def_if965 = new BitSet(new long[] { 0xBF01501000800000L });
	public static final BitSet FOLLOW_bloco_in_def_if970 = new BitSet(new long[] { 0xBF01501000800000L });
	public static final BitSet FOLLOW_RCURLY_in_def_if982 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RCURLY_in_def_if988 = new BitSet(new long[] { 0x0000000000002000L });
	public static final BitSet FOLLOW_ELSE_in_def_if990 = new BitSet(new long[] { 0x0000000008000000L });
	public static final BitSet FOLLOW_LCURLY_in_def_if992 = new BitSet(new long[] { 0xBF01501000800000L });
	public static final BitSet FOLLOW_bloco_in_def_if994 = new BitSet(new long[] { 0xBF01501000800000L });
	public static final BitSet FOLLOW_RCURLY_in_def_if997 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_WHILE_in_def_while1020 = new BitSet(new long[] { 0x0000000400000000L });
	public static final BitSet FOLLOW_LPAREN_in_def_while1022 = new BitSet(new long[] { 0x00800078020C0000L });
	public static final BitSet FOLLOW_logic_op_expr_in_def_while1026 = new BitSet(new long[] { 0x0002000000000000L });
	public static final BitSet FOLLOW_RPAREN_in_def_while1030 = new BitSet(new long[] { 0x0000000008000000L });
	public static final BitSet FOLLOW_LCURLY_in_def_while1032 = new BitSet(new long[] { 0xBF01501000800000L });
	public static final BitSet FOLLOW_bloco_in_def_while1036 = new BitSet(new long[] { 0xBF01501000800000L });
	public static final BitSet FOLLOW_RCURLY_in_def_while1041 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_T_INT_in_type1060 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_T_REAL_in_type1068 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_T_STRING_in_type1075 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_T_BOOL_in_type1082 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_T_VOID_in_type1089 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_T_CHAIN_in_type1096 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_variable_in_term1115 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_funccall_in_term1126 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_number_in_term1136 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_string_in_term1145 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_set_in_unary_op_expr1164 = new BitSet(new long[] { 0x0000003002080000L });
	public static final BitSet FOLLOW_term_in_unary_op_expr1177 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_unary_op_expr_in_strong_op_expr1196 = new BitSet(
			new long[] { 0x0018020000000002L });
	public static final BitSet FOLLOW_set_in_strong_op_expr1206 = new BitSet(new long[] { 0x0000007802080000L });
	public static final BitSet FOLLOW_unary_op_expr_in_strong_op_expr1222 = new BitSet(
			new long[] { 0x0018020000000002L });
	public static final BitSet FOLLOW_strong_op_expr_in_weak_op_expr1247 = new BitSet(
			new long[] { 0x0000040800000002L });
	public static final BitSet FOLLOW_set_in_weak_op_expr1255 = new BitSet(new long[] { 0x0000007802080000L });
	public static final BitSet FOLLOW_strong_op_expr_in_weak_op_expr1267 = new BitSet(
			new long[] { 0x0000040800000002L });
	public static final BitSet FOLLOW_FALSE_in_weak_op_expr1282 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_TRUE_in_weak_op_expr1291 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_weak_op_expr_in_relational_op_expr1311 = new BitSet(
			new long[] { 0x0000008030610002L });
	public static final BitSet FOLLOW_set_in_relational_op_expr1319 = new BitSet(new long[] { 0x00800078020C0000L });
	public static final BitSet FOLLOW_weak_op_expr_in_relational_op_expr1347 = new BitSet(
			new long[] { 0x0000008030610002L });
	public static final BitSet FOLLOW_relational_op_expr_in_logic_op_expr1371 = new BitSet(
			new long[] { 0x0000010000000012L });
	public static final BitSet FOLLOW_set_in_logic_op_expr1379 = new BitSet(new long[] { 0x00800078020C0000L });
	public static final BitSet FOLLOW_relational_op_expr_in_logic_op_expr1391 = new BitSet(
			new long[] { 0x0000010000000012L });
	public static final BitSet FOLLOW_type_in_typedarglist1421 = new BitSet(new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_NAME_in_typedarglist1425 = new BitSet(new long[] { 0x0000000000000102L });
	public static final BitSet FOLLOW_COMMA_in_typedarglist1430 = new BitSet(new long[] { 0x3F00000000000000L });
	public static final BitSet FOLLOW_type_in_typedarglist1434 = new BitSet(new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_NAME_in_typedarglist1438 = new BitSet(new long[] { 0x0000000000000102L });
	public static final BitSet FOLLOW_NAME_in_chestaccess1458 = new BitSet(new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_DOT_in_chestaccess1462 = new BitSet(new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_NAME_in_chestaccess1464 = new BitSet(new long[] { 0x0000000000001002L });
	public static final BitSet FOLLOW_RETURN_in_def_return1483 = new BitSet(new long[] { 0x00800078020C0000L });
	public static final BitSet FOLLOW_logic_op_expr_in_def_return1487 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_variable_in_arglist1510 = new BitSet(new long[] { 0x0000000000000102L });
	public static final BitSet FOLLOW_COMMA_in_arglist1515 = new BitSet(new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_variable_in_arglist1519 = new BitSet(new long[] { 0x0000000000000102L });
	public static final BitSet FOLLOW_NAME_in_variable1544 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_chestaccess_in_variable1551 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_INT_in_number1569 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_FLOAT_in_number1578 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_NORMALSTRING_in_string1597 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_PRINT_in_def_print1619 = new BitSet(new long[] { 0x0000000400000000L });
	public static final BitSet FOLLOW_LPAREN_in_def_print1621 = new BitSet(new long[] { 0x0000003002080000L });
	public static final BitSet FOLLOW_term_in_def_print1625 = new BitSet(new long[] { 0x0002000000000000L });
	public static final BitSet FOLLOW_RPAREN_in_def_print1627 = new BitSet(new long[] { 0x0000000000000002L });

}