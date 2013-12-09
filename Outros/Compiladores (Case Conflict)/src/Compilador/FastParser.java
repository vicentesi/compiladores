// $ANTLR 3.4 Fast.g 2012-11-26 17:50:02

package Compilador;
import Compilador.Semanticator;
import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class FastParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASSIGN", "CHEST", "COLON", "COMMA", "COMMENT", "DIGIT", "DO", "DOT", "ELSE", "ELSEIF", "END", "EQUAL", "EscapeSequence", "FALSE", "FLOAT", "FOR", "GREATER", "GREATEREQUAL", "IF", "IN", "INT", "LBRACK", "LCURLY", "LESS", "LESSEQUAL", "LETTER", "LETTERL", "LETTERU", "LINE_COMMENT", "LPAREN", "MINUS", "NAME", "NORMALSTRING", "NOT", "NOTEQUAL", "OR", "PERCENT", "PLUS", "POWER", "RBRACK", "RCURLY", "REPEAT", "RETURN", "RPAREN", "SEMI", "SLASH", "STAR", "THEN", "TO", "TRUE", "T_BOOL", "T_CHAIN", "T_INT", "T_REAL", "T_STRING", "T_VOID", "UNTIL", "WHILE", "WITH", "WS"
    };

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

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public FastParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public FastParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return FastParser.tokenNames; }
    public String getGrammarFileName() { return "Fast.g"; }


    Semanticator s = new Semanticator(this);



    // $ANTLR start "fast"
    // Fast.g:100:1: fast : ( ( vardecl SEMI )* ( stat ) )+ ;
    public final void fast() throws RecognitionException {
        try {
            // Fast.g:101:2: ( ( ( vardecl SEMI )* ( stat ) )+ )
            // Fast.g:101:4: ( ( vardecl SEMI )* ( stat ) )+
            {
            // Fast.g:101:4: ( ( vardecl SEMI )* ( stat ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CHEST||(LA2_0 >= T_BOOL && LA2_0 <= T_VOID)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Fast.g:101:5: ( vardecl SEMI )* ( stat )
            	    {
            	    // Fast.g:101:5: ( vardecl SEMI )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        switch ( input.LA(1) ) {
            	        case T_INT:
            	            {
            	            int LA1_1 = input.LA(2);

            	            if ( (LA1_1==NAME) ) {
            	                int LA1_8 = input.LA(3);

            	                if ( (LA1_8==COMMA||LA1_8==SEMI) ) {
            	                    alt1=1;
            	                }


            	            }


            	            }
            	            break;
            	        case T_REAL:
            	            {
            	            int LA1_2 = input.LA(2);

            	            if ( (LA1_2==NAME) ) {
            	                int LA1_8 = input.LA(3);

            	                if ( (LA1_8==COMMA||LA1_8==SEMI) ) {
            	                    alt1=1;
            	                }


            	            }


            	            }
            	            break;
            	        case T_STRING:
            	            {
            	            int LA1_3 = input.LA(2);

            	            if ( (LA1_3==NAME) ) {
            	                int LA1_8 = input.LA(3);

            	                if ( (LA1_8==COMMA||LA1_8==SEMI) ) {
            	                    alt1=1;
            	                }


            	            }


            	            }
            	            break;
            	        case T_BOOL:
            	            {
            	            int LA1_4 = input.LA(2);

            	            if ( (LA1_4==NAME) ) {
            	                int LA1_8 = input.LA(3);

            	                if ( (LA1_8==COMMA||LA1_8==SEMI) ) {
            	                    alt1=1;
            	                }


            	            }


            	            }
            	            break;
            	        case T_VOID:
            	            {
            	            int LA1_5 = input.LA(2);

            	            if ( (LA1_5==NAME) ) {
            	                int LA1_8 = input.LA(3);

            	                if ( (LA1_8==COMMA||LA1_8==SEMI) ) {
            	                    alt1=1;
            	                }


            	            }


            	            }
            	            break;
            	        case T_CHAIN:
            	            {
            	            int LA1_6 = input.LA(2);

            	            if ( (LA1_6==NAME) ) {
            	                int LA1_8 = input.LA(3);

            	                if ( (LA1_8==COMMA||LA1_8==SEMI) ) {
            	                    alt1=1;
            	                }


            	            }


            	            }
            	            break;

            	        }

            	        switch (alt1) {
            	    	case 1 :
            	    	    // Fast.g:101:6: vardecl SEMI
            	    	    {
            	    	    pushFollow(FOLLOW_vardecl_in_fast681);
            	    	    vardecl();

            	    	    state._fsp--;


            	    	    match(input,SEMI,FOLLOW_SEMI_in_fast683); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);


            	    // Fast.g:101:20: ( stat )
            	    // Fast.g:101:21: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_fast687);
            	    stat();

            	    state._fsp--;


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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "fast"



    // $ANTLR start "stat"
    // Fast.g:104:1: stat : ( def_func | def_chest );
    public final void stat() throws RecognitionException {
        try {
            // Fast.g:105:2: ( def_func | def_chest )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0 >= T_BOOL && LA3_0 <= T_VOID)) ) {
                alt3=1;
            }
            else if ( (LA3_0==CHEST) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // Fast.g:105:4: def_func
                    {
                    pushFollow(FOLLOW_def_func_in_stat702);
                    def_func();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Fast.g:106:4: def_chest
                    {
                    pushFollow(FOLLOW_def_chest_in_stat710);
                    def_chest();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "stat"



    // $ANTLR start "weakstat"
    // Fast.g:109:1: weakstat returns [ String type ] : ( varatrib SEMI | vardecl SEMI | funccall SEMI | def_if | def_while |t= def_return SEMI | chestaccess SEMI | def_repeat );
    public final String weakstat() throws RecognitionException {
        String type = null;


        String t =null;


        try {
            // Fast.g:110:2: ( varatrib SEMI | vardecl SEMI | funccall SEMI | def_if | def_while |t= def_return SEMI | chestaccess SEMI | def_repeat )
            int alt4=8;
            switch ( input.LA(1) ) {
            case NAME:
                {
                switch ( input.LA(2) ) {
                case ASSIGN:
                    {
                    alt4=1;
                    }
                    break;
                case LPAREN:
                    {
                    alt4=3;
                    }
                    break;
                case DOT:
                    {
                    alt4=7;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }

                }
                break;
            case T_BOOL:
            case T_CHAIN:
            case T_INT:
            case T_REAL:
            case T_STRING:
            case T_VOID:
                {
                alt4=2;
                }
                break;
            case IF:
                {
                alt4=4;
                }
                break;
            case WHILE:
                {
                alt4=5;
                }
                break;
            case RETURN:
                {
                alt4=6;
                }
                break;
            case REPEAT:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // Fast.g:110:4: varatrib SEMI
                    {
                    pushFollow(FOLLOW_varatrib_in_weakstat725);
                    varatrib();

                    state._fsp--;


                    match(input,SEMI,FOLLOW_SEMI_in_weakstat727); 

                    }
                    break;
                case 2 :
                    // Fast.g:111:4: vardecl SEMI
                    {
                    pushFollow(FOLLOW_vardecl_in_weakstat733);
                    vardecl();

                    state._fsp--;


                    match(input,SEMI,FOLLOW_SEMI_in_weakstat739); 

                    }
                    break;
                case 3 :
                    // Fast.g:112:4: funccall SEMI
                    {
                    pushFollow(FOLLOW_funccall_in_weakstat745);
                    funccall();

                    state._fsp--;


                    match(input,SEMI,FOLLOW_SEMI_in_weakstat747); 

                    }
                    break;
                case 4 :
                    // Fast.g:113:4: def_if
                    {
                    pushFollow(FOLLOW_def_if_in_weakstat753);
                    def_if();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // Fast.g:114:4: def_while
                    {
                    pushFollow(FOLLOW_def_while_in_weakstat762);
                    def_while();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // Fast.g:115:4: t= def_return SEMI
                    {
                    pushFollow(FOLLOW_def_return_in_weakstat773);
                    t=def_return();

                    state._fsp--;


                    type =t;

                    match(input,SEMI,FOLLOW_SEMI_in_weakstat777); 

                    }
                    break;
                case 7 :
                    // Fast.g:116:4: chestaccess SEMI
                    {
                    pushFollow(FOLLOW_chestaccess_in_weakstat783);
                    chestaccess();

                    state._fsp--;


                    match(input,SEMI,FOLLOW_SEMI_in_weakstat785); 

                    }
                    break;
                case 8 :
                    // Fast.g:117:4: def_repeat
                    {
                    pushFollow(FOLLOW_def_repeat_in_weakstat794);
                    def_repeat();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return type;
    }
    // $ANTLR end "weakstat"



    // $ANTLR start "varatrib"
    // Fast.g:120:1: varatrib : n= NAME ASSIGN t= logic_op_expr ;
    public final void varatrib() throws RecognitionException {
        Token n=null;
        String t =null;


        try {
            // Fast.g:121:2: (n= NAME ASSIGN t= logic_op_expr )
            // Fast.g:121:5: n= NAME ASSIGN t= logic_op_expr
            {
            n=(Token)match(input,NAME,FOLLOW_NAME_in_varatrib809); 

            match(input,ASSIGN,FOLLOW_ASSIGN_in_varatrib811); 

            pushFollow(FOLLOW_logic_op_expr_in_varatrib815);
            t=logic_op_expr();

            state._fsp--;


             s.eval_assign(s.get_type(n.getText()), t, n.getText()); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "varatrib"



    // $ANTLR start "vardecl"
    // Fast.g:124:1: vardecl : t= type v= NAME ( COMMA v= NAME )* ;
    public final void vardecl() throws RecognitionException {
        Token v=null;
        String t =null;


        try {
            // Fast.g:125:2: (t= type v= NAME ( COMMA v= NAME )* )
            // Fast.g:125:5: t= type v= NAME ( COMMA v= NAME )*
            {
            pushFollow(FOLLOW_type_in_vardecl831);
            t=type();

            state._fsp--;


            v=(Token)match(input,NAME,FOLLOW_NAME_in_vardecl835); 

             s.add_variable(v.getText(), t);

            // Fast.g:125:55: ( COMMA v= NAME )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Fast.g:125:56: COMMA v= NAME
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_vardecl841); 

            	    v=(Token)match(input,NAME,FOLLOW_NAME_in_vardecl845); 

            	     s.add_variable(v.getText(), t);

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "vardecl"



    // $ANTLR start "funccall"
    // Fast.g:128:1: funccall returns [ String type ] : n= NAME LPAREN h= arglist RPAREN ;
    public final String funccall() throws RecognitionException {
        String type = null;


        Token n=null;
        HashMap<String,String> h =null;


        try {
            // Fast.g:129:2: (n= NAME LPAREN h= arglist RPAREN )
            // Fast.g:129:5: n= NAME LPAREN h= arglist RPAREN
            {
            n=(Token)match(input,NAME,FOLLOW_NAME_in_funccall870); 

            match(input,LPAREN,FOLLOW_LPAREN_in_funccall872); 

            pushFollow(FOLLOW_arglist_in_funccall876);
            h=arglist();

            state._fsp--;


            match(input,RPAREN,FOLLOW_RPAREN_in_funccall878); 

             type =s.eval_funccall(n.getText(), h);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return type;
    }
    // $ANTLR end "funccall"



    // $ANTLR start "def_func"
    // Fast.g:132:1: def_func : t= type n= NAME LPAREN h= typedarglist RPAREN (tw= weakstat )* END ;
    public final void def_func() throws RecognitionException {
        Token n=null;
        String t =null;

        HashMap<String,String> h =null;

        String tw =null;


        try {
            // Fast.g:133:2: (t= type n= NAME LPAREN h= typedarglist RPAREN (tw= weakstat )* END )
            // Fast.g:133:5: t= type n= NAME LPAREN h= typedarglist RPAREN (tw= weakstat )* END
            {
            pushFollow(FOLLOW_type_in_def_func896);
            t=type();

            state._fsp--;


            n=(Token)match(input,NAME,FOLLOW_NAME_in_def_func900); 

            match(input,LPAREN,FOLLOW_LPAREN_in_def_func902); 

            pushFollow(FOLLOW_typedarglist_in_def_func906);
            h=typedarglist();

            state._fsp--;


            match(input,RPAREN,FOLLOW_RPAREN_in_def_func908); 

            s.open_function_decl(t,h,n.getText());

            // Fast.g:134:47: (tw= weakstat )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==IF||LA6_0==NAME||(LA6_0 >= REPEAT && LA6_0 <= RETURN)||(LA6_0 >= T_BOOL && LA6_0 <= T_VOID)||LA6_0==WHILE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Fast.g:134:47: tw= weakstat
            	    {
            	    pushFollow(FOLLOW_weakstat_in_def_func918);
            	    tw=weakstat();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            s.close_function_decl(tw);

            match(input,END,FOLLOW_END_in_def_func923); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "def_func"



    // $ANTLR start "def_if"
    // Fast.g:137:1: def_if : IF logic_op_expr THEN ( weakstat )* ( END | ( ELSE ( weakstat )* END ) ) ;
    public final void def_if() throws RecognitionException {
        try {
            // Fast.g:138:2: ( IF logic_op_expr THEN ( weakstat )* ( END | ( ELSE ( weakstat )* END ) ) )
            // Fast.g:138:5: IF logic_op_expr THEN ( weakstat )* ( END | ( ELSE ( weakstat )* END ) )
            {
            match(input,IF,FOLLOW_IF_in_def_if936); 

            pushFollow(FOLLOW_logic_op_expr_in_def_if938);
            logic_op_expr();

            state._fsp--;


            match(input,THEN,FOLLOW_THEN_in_def_if940); 

            // Fast.g:138:27: ( weakstat )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==IF||LA7_0==NAME||(LA7_0 >= REPEAT && LA7_0 <= RETURN)||(LA7_0 >= T_BOOL && LA7_0 <= T_VOID)||LA7_0==WHILE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Fast.g:138:27: weakstat
            	    {
            	    pushFollow(FOLLOW_weakstat_in_def_if942);
            	    weakstat();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // Fast.g:138:37: ( END | ( ELSE ( weakstat )* END ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==END) ) {
                alt9=1;
            }
            else if ( (LA9_0==ELSE) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // Fast.g:138:39: END
                    {
                    match(input,END,FOLLOW_END_in_def_if947); 

                    }
                    break;
                case 2 :
                    // Fast.g:138:45: ( ELSE ( weakstat )* END )
                    {
                    // Fast.g:138:45: ( ELSE ( weakstat )* END )
                    // Fast.g:138:47: ELSE ( weakstat )* END
                    {
                    match(input,ELSE,FOLLOW_ELSE_in_def_if953); 

                    // Fast.g:138:52: ( weakstat )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==IF||LA8_0==NAME||(LA8_0 >= REPEAT && LA8_0 <= RETURN)||(LA8_0 >= T_BOOL && LA8_0 <= T_VOID)||LA8_0==WHILE) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // Fast.g:138:52: weakstat
                    	    {
                    	    pushFollow(FOLLOW_weakstat_in_def_if955);
                    	    weakstat();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    match(input,END,FOLLOW_END_in_def_if958); 

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "def_if"



    // $ANTLR start "def_repeat"
    // Fast.g:141:1: def_repeat : REPEAT ( weakstat )* UNTIL LPAREN logic_op_expr RPAREN END ;
    public final void def_repeat() throws RecognitionException {
        try {
            // Fast.g:142:2: ( REPEAT ( weakstat )* UNTIL LPAREN logic_op_expr RPAREN END )
            // Fast.g:142:5: REPEAT ( weakstat )* UNTIL LPAREN logic_op_expr RPAREN END
            {
            match(input,REPEAT,FOLLOW_REPEAT_in_def_repeat976); 

            // Fast.g:142:12: ( weakstat )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==IF||LA10_0==NAME||(LA10_0 >= REPEAT && LA10_0 <= RETURN)||(LA10_0 >= T_BOOL && LA10_0 <= T_VOID)||LA10_0==WHILE) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Fast.g:142:12: weakstat
            	    {
            	    pushFollow(FOLLOW_weakstat_in_def_repeat978);
            	    weakstat();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            match(input,UNTIL,FOLLOW_UNTIL_in_def_repeat981); 

            match(input,LPAREN,FOLLOW_LPAREN_in_def_repeat983); 

            pushFollow(FOLLOW_logic_op_expr_in_def_repeat985);
            logic_op_expr();

            state._fsp--;


            match(input,RPAREN,FOLLOW_RPAREN_in_def_repeat987); 

            match(input,END,FOLLOW_END_in_def_repeat989); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "def_repeat"



    // $ANTLR start "def_chest"
    // Fast.g:145:1: def_chest : CHEST NAME COLON ( vardecl SEMI | funccall SEMI )* END ;
    public final void def_chest() throws RecognitionException {
        try {
            // Fast.g:146:2: ( CHEST NAME COLON ( vardecl SEMI | funccall SEMI )* END )
            // Fast.g:146:4: CHEST NAME COLON ( vardecl SEMI | funccall SEMI )* END
            {
            match(input,CHEST,FOLLOW_CHEST_in_def_chest1001); 

            match(input,NAME,FOLLOW_NAME_in_def_chest1003); 

            match(input,COLON,FOLLOW_COLON_in_def_chest1005); 

            // Fast.g:146:21: ( vardecl SEMI | funccall SEMI )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= T_BOOL && LA11_0 <= T_VOID)) ) {
                    alt11=1;
                }
                else if ( (LA11_0==NAME) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // Fast.g:146:23: vardecl SEMI
            	    {
            	    pushFollow(FOLLOW_vardecl_in_def_chest1009);
            	    vardecl();

            	    state._fsp--;


            	    match(input,SEMI,FOLLOW_SEMI_in_def_chest1011); 

            	    }
            	    break;
            	case 2 :
            	    // Fast.g:146:38: funccall SEMI
            	    {
            	    pushFollow(FOLLOW_funccall_in_def_chest1015);
            	    funccall();

            	    state._fsp--;


            	    match(input,SEMI,FOLLOW_SEMI_in_def_chest1017); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            match(input,END,FOLLOW_END_in_def_chest1022); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "def_chest"



    // $ANTLR start "def_while"
    // Fast.g:149:1: def_while : WHILE LPAREN logic_op_expr RPAREN ( weakstat )* END ;
    public final void def_while() throws RecognitionException {
        try {
            // Fast.g:150:2: ( WHILE LPAREN logic_op_expr RPAREN ( weakstat )* END )
            // Fast.g:150:4: WHILE LPAREN logic_op_expr RPAREN ( weakstat )* END
            {
            match(input,WHILE,FOLLOW_WHILE_in_def_while1033); 

            match(input,LPAREN,FOLLOW_LPAREN_in_def_while1035); 

            pushFollow(FOLLOW_logic_op_expr_in_def_while1037);
            logic_op_expr();

            state._fsp--;


            match(input,RPAREN,FOLLOW_RPAREN_in_def_while1039); 

            // Fast.g:150:38: ( weakstat )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==IF||LA12_0==NAME||(LA12_0 >= REPEAT && LA12_0 <= RETURN)||(LA12_0 >= T_BOOL && LA12_0 <= T_VOID)||LA12_0==WHILE) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Fast.g:150:38: weakstat
            	    {
            	    pushFollow(FOLLOW_weakstat_in_def_while1041);
            	    weakstat();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            match(input,END,FOLLOW_END_in_def_while1044); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "def_while"



    // $ANTLR start "type"
    // Fast.g:154:1: type returns [ String type ] : ( T_INT | T_REAL | T_STRING | T_BOOL | T_VOID | T_CHAIN );
    public final String type() throws RecognitionException {
        String type = null;


        try {
            // Fast.g:155:2: ( T_INT | T_REAL | T_STRING | T_BOOL | T_VOID | T_CHAIN )
            int alt13=6;
            switch ( input.LA(1) ) {
            case T_INT:
                {
                alt13=1;
                }
                break;
            case T_REAL:
                {
                alt13=2;
                }
                break;
            case T_STRING:
                {
                alt13=3;
                }
                break;
            case T_BOOL:
                {
                alt13=4;
                }
                break;
            case T_VOID:
                {
                alt13=5;
                }
                break;
            case T_CHAIN:
                {
                alt13=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // Fast.g:155:4: T_INT
                    {
                    match(input,T_INT,FOLLOW_T_INT_in_type1061); 

                     type = "Integer"; 

                    }
                    break;
                case 2 :
                    // Fast.g:156:4: T_REAL
                    {
                    match(input,T_REAL,FOLLOW_T_REAL_in_type1069); 

                     type = "Real"; 

                    }
                    break;
                case 3 :
                    // Fast.g:157:4: T_STRING
                    {
                    match(input,T_STRING,FOLLOW_T_STRING_in_type1076); 

                     type = "String"; 

                    }
                    break;
                case 4 :
                    // Fast.g:158:4: T_BOOL
                    {
                    match(input,T_BOOL,FOLLOW_T_BOOL_in_type1083); 

                     type = "Boolean"; 

                    }
                    break;
                case 5 :
                    // Fast.g:159:4: T_VOID
                    {
                    match(input,T_VOID,FOLLOW_T_VOID_in_type1090); 

                     type = "Void"; 

                    }
                    break;
                case 6 :
                    // Fast.g:160:4: T_CHAIN
                    {
                    match(input,T_CHAIN,FOLLOW_T_CHAIN_in_type1097); 

                     type = "Chain"; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return type;
    }
    // $ANTLR end "type"



    // $ANTLR start "term"
    // Fast.g:163:1: term returns [ String type ] : (v= variable |f= funccall |n= number |str= string );
    public final String term() throws RecognitionException {
        String type = null;


        String v =null;

        String f =null;

        String n =null;

        String str =null;


        try {
            // Fast.g:164:2: (v= variable |f= funccall |n= number |str= string )
            int alt14=4;
            switch ( input.LA(1) ) {
            case NAME:
                {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==LPAREN) ) {
                    alt14=2;
                }
                else if ( (LA14_1==AND||LA14_1==DOT||LA14_1==EQUAL||(LA14_1 >= GREATER && LA14_1 <= GREATEREQUAL)||(LA14_1 >= LESS && LA14_1 <= LESSEQUAL)||LA14_1==MINUS||(LA14_1 >= NOTEQUAL && LA14_1 <= PLUS)||(LA14_1 >= RPAREN && LA14_1 <= THEN)) ) {
                    alt14=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;

                }
                }
                break;
            case FLOAT:
            case INT:
                {
                alt14=3;
                }
                break;
            case NORMALSTRING:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // Fast.g:164:4: v= variable
                    {
                    pushFollow(FOLLOW_variable_in_term1116);
                    v=variable();

                    state._fsp--;


                     type = s.get_type(v); 

                    }
                    break;
                case 2 :
                    // Fast.g:165:6: f= funccall
                    {
                    pushFollow(FOLLOW_funccall_in_term1127);
                    f=funccall();

                    state._fsp--;


                     type = f;

                    }
                    break;
                case 3 :
                    // Fast.g:166:4: n= number
                    {
                    pushFollow(FOLLOW_number_in_term1137);
                    n=number();

                    state._fsp--;


                     type = n; 

                    }
                    break;
                case 4 :
                    // Fast.g:167:4: str= string
                    {
                    pushFollow(FOLLOW_string_in_term1146);
                    str=string();

                    state._fsp--;


                     type = str; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return type;
    }
    // $ANTLR end "term"



    // $ANTLR start "unary_op_expr"
    // Fast.g:170:1: unary_op_expr returns [ String type ] : ( MINUS | PLUS | NOT )? t= term ;
    public final String unary_op_expr() throws RecognitionException {
        String type = null;


        String t =null;


        try {
            // Fast.g:171:2: ( ( MINUS | PLUS | NOT )? t= term )
            // Fast.g:171:4: ( MINUS | PLUS | NOT )? t= term
            {
            // Fast.g:171:4: ( MINUS | PLUS | NOT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==MINUS||LA15_0==NOT||LA15_0==PLUS) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Fast.g:
                    {
                    if ( input.LA(1)==MINUS||input.LA(1)==NOT||input.LA(1)==PLUS ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            pushFollow(FOLLOW_term_in_unary_op_expr1180);
            t=term();

            state._fsp--;


             type =t; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return type;
    }
    // $ANTLR end "unary_op_expr"



    // $ANTLR start "strong_op_expr"
    // Fast.g:174:1: strong_op_expr returns [ String type ] : t1= unary_op_expr (op= ( STAR | SLASH | PERCENT ) t2= unary_op_expr )* ;
    public final String strong_op_expr() throws RecognitionException {
        String type = null;


        Token op=null;
        String t1 =null;

        String t2 =null;


        try {
            // Fast.g:175:2: (t1= unary_op_expr (op= ( STAR | SLASH | PERCENT ) t2= unary_op_expr )* )
            // Fast.g:175:4: t1= unary_op_expr (op= ( STAR | SLASH | PERCENT ) t2= unary_op_expr )*
            {
            pushFollow(FOLLOW_unary_op_expr_in_strong_op_expr1199);
            t1=unary_op_expr();

            state._fsp--;


            type = t1;

            // Fast.g:175:34: (op= ( STAR | SLASH | PERCENT ) t2= unary_op_expr )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==PERCENT||(LA16_0 >= SLASH && LA16_0 <= STAR)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // Fast.g:175:36: op= ( STAR | SLASH | PERCENT ) t2= unary_op_expr
            	    {
            	    op=(Token)input.LT(1);

            	    if ( input.LA(1)==PERCENT||(input.LA(1) >= SLASH && input.LA(1) <= STAR) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unary_op_expr_in_strong_op_expr1222);
            	    t2=unary_op_expr();

            	    state._fsp--;


            	     type = s.eval_strong_expr(t1,t2,op.getText()); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return type;
    }
    // $ANTLR end "strong_op_expr"



    // $ANTLR start "weak_op_expr"
    // Fast.g:178:1: weak_op_expr returns [ String type ] : (t1= strong_op_expr (op= ( PLUS | MINUS ) t2= strong_op_expr )* | FALSE | TRUE );
    public final String weak_op_expr() throws RecognitionException {
        String type = null;


        Token op=null;
        String t1 =null;

        String t2 =null;


        try {
            // Fast.g:179:2: (t1= strong_op_expr (op= ( PLUS | MINUS ) t2= strong_op_expr )* | FALSE | TRUE )
            int alt18=3;
            switch ( input.LA(1) ) {
            case FLOAT:
            case INT:
            case MINUS:
            case NAME:
            case NORMALSTRING:
            case NOT:
            case PLUS:
                {
                alt18=1;
                }
                break;
            case FALSE:
                {
                alt18=2;
                }
                break;
            case TRUE:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // Fast.g:179:4: t1= strong_op_expr (op= ( PLUS | MINUS ) t2= strong_op_expr )*
                    {
                    pushFollow(FOLLOW_strong_op_expr_in_weak_op_expr1244);
                    t1=strong_op_expr();

                    state._fsp--;


                     type =t1;

                    // Fast.g:179:35: (op= ( PLUS | MINUS ) t2= strong_op_expr )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==MINUS||LA17_0==PLUS) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // Fast.g:179:37: op= ( PLUS | MINUS ) t2= strong_op_expr
                    	    {
                    	    op=(Token)input.LT(1);

                    	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
                    	        input.consume();
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }


                    	    pushFollow(FOLLOW_strong_op_expr_in_weak_op_expr1264);
                    	    t2=strong_op_expr();

                    	    state._fsp--;


                    	    type =s.eval_weak_expr(t1,t2,op.getText()); 

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Fast.g:180:4: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_weak_op_expr1275); 

                    }
                    break;
                case 3 :
                    // Fast.g:181:4: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_weak_op_expr1281); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return type;
    }
    // $ANTLR end "weak_op_expr"



    // $ANTLR start "relational_op_expr"
    // Fast.g:184:1: relational_op_expr returns [ String type ] : t1= weak_op_expr (op= ( LESS | GREATER | EQUAL | NOTEQUAL | GREATEREQUAL | LESSEQUAL ) t2= weak_op_expr )* ;
    public final String relational_op_expr() throws RecognitionException {
        String type = null;


        Token op=null;
        String t1 =null;

        String t2 =null;


        try {
            // Fast.g:185:2: (t1= weak_op_expr (op= ( LESS | GREATER | EQUAL | NOTEQUAL | GREATEREQUAL | LESSEQUAL ) t2= weak_op_expr )* )
            // Fast.g:185:4: t1= weak_op_expr (op= ( LESS | GREATER | EQUAL | NOTEQUAL | GREATEREQUAL | LESSEQUAL ) t2= weak_op_expr )*
            {
            pushFollow(FOLLOW_weak_op_expr_in_relational_op_expr1298);
            t1=weak_op_expr();

            state._fsp--;


             type =t1;

            // Fast.g:185:33: (op= ( LESS | GREATER | EQUAL | NOTEQUAL | GREATEREQUAL | LESSEQUAL ) t2= weak_op_expr )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==EQUAL||(LA19_0 >= GREATER && LA19_0 <= GREATEREQUAL)||(LA19_0 >= LESS && LA19_0 <= LESSEQUAL)||LA19_0==NOTEQUAL) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // Fast.g:185:35: op= ( LESS | GREATER | EQUAL | NOTEQUAL | GREATEREQUAL | LESSEQUAL ) t2= weak_op_expr
            	    {
            	    op=(Token)input.LT(1);

            	    if ( input.LA(1)==EQUAL||(input.LA(1) >= GREATER && input.LA(1) <= GREATEREQUAL)||(input.LA(1) >= LESS && input.LA(1) <= LESSEQUAL)||input.LA(1)==NOTEQUAL ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_weak_op_expr_in_relational_op_expr1334);
            	    t2=weak_op_expr();

            	    state._fsp--;


            	     s.eval_relational_expr(t1,t2,op.getText());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return type;
    }
    // $ANTLR end "relational_op_expr"



    // $ANTLR start "logic_op_expr"
    // Fast.g:189:1: logic_op_expr returns [ String type ] : t1= relational_op_expr (op= ( OR | AND ) t2= relational_op_expr )* ;
    public final String logic_op_expr() throws RecognitionException {
        String type = null;


        Token op=null;
        String t1 =null;

        String t2 =null;


        try {
            // Fast.g:190:2: (t1= relational_op_expr (op= ( OR | AND ) t2= relational_op_expr )* )
            // Fast.g:190:4: t1= relational_op_expr (op= ( OR | AND ) t2= relational_op_expr )*
            {
            pushFollow(FOLLOW_relational_op_expr_in_logic_op_expr1357);
            t1=relational_op_expr();

            state._fsp--;


            type =t1;

            // Fast.g:190:38: (op= ( OR | AND ) t2= relational_op_expr )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==AND||LA20_0==OR) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Fast.g:190:40: op= ( OR | AND ) t2= relational_op_expr
            	    {
            	    op=(Token)input.LT(1);

            	    if ( input.LA(1)==AND||input.LA(1)==OR ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_relational_op_expr_in_logic_op_expr1377);
            	    t2=relational_op_expr();

            	    state._fsp--;


            	     s.eval_logic_expr(t1,t2,op.getText());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return type;
    }
    // $ANTLR end "logic_op_expr"



    // $ANTLR start "typedarglist"
    // Fast.g:193:1: typedarglist returns [ HashMap<String,String> tamap ] : (t= type n= NAME ( COMMA t= type n= NAME )* )? ;
    public final HashMap<String,String> typedarglist() throws RecognitionException {
        HashMap<String,String> tamap = null;


        Token n=null;
        String t =null;


        try {
            // Fast.g:194:2: ( (t= type n= NAME ( COMMA t= type n= NAME )* )? )
            // Fast.g:194:3: (t= type n= NAME ( COMMA t= type n= NAME )* )?
            {
             tamap = new HashMap<String,String>(); 

            // Fast.g:195:2: (t= type n= NAME ( COMMA t= type n= NAME )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0 >= T_BOOL && LA22_0 <= T_VOID)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // Fast.g:195:4: t= type n= NAME ( COMMA t= type n= NAME )*
                    {
                    pushFollow(FOLLOW_type_in_typedarglist1404);
                    t=type();

                    state._fsp--;


                    n=(Token)match(input,NAME,FOLLOW_NAME_in_typedarglist1408); 

                     tamap.put(n.getText(), t); 

                    // Fast.g:195:48: ( COMMA t= type n= NAME )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==COMMA) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // Fast.g:195:50: COMMA t= type n= NAME
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_typedarglist1413); 

                    	    pushFollow(FOLLOW_type_in_typedarglist1417);
                    	    t=type();

                    	    state._fsp--;


                    	    n=(Token)match(input,NAME,FOLLOW_NAME_in_typedarglist1421); 

                    	     tamap.put(n.getText(), t); 

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return tamap;
    }
    // $ANTLR end "typedarglist"



    // $ANTLR start "chestaccess"
    // Fast.g:198:1: chestaccess : NAME ( DOT NAME )+ ;
    public final void chestaccess() throws RecognitionException {
        try {
            // Fast.g:199:2: ( NAME ( DOT NAME )+ )
            // Fast.g:199:4: NAME ( DOT NAME )+
            {
            match(input,NAME,FOLLOW_NAME_in_chestaccess1441); 

            // Fast.g:199:9: ( DOT NAME )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==DOT) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Fast.g:199:11: DOT NAME
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_chestaccess1445); 

            	    match(input,NAME,FOLLOW_NAME_in_chestaccess1447); 

            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "chestaccess"



    // $ANTLR start "def_return"
    // Fast.g:202:1: def_return returns [ String type ] : RETURN t= logic_op_expr ;
    public final String def_return() throws RecognitionException {
        String type = null;


        String t =null;


        try {
            // Fast.g:203:2: ( RETURN t= logic_op_expr )
            // Fast.g:203:4: RETURN t= logic_op_expr
            {
            match(input,RETURN,FOLLOW_RETURN_in_def_return1466); 

            pushFollow(FOLLOW_logic_op_expr_in_def_return1470);
            t=logic_op_expr();

            state._fsp--;


             type =t;

            s.eval_return(t);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return type;
    }
    // $ANTLR end "def_return"



    // $ANTLR start "arglist"
    // Fast.g:206:1: arglist returns [ HashMap<String,String> amap ] : (n= NAME ( COMMA n1= NAME )* )? ;
    public final HashMap<String,String> arglist() throws RecognitionException {
        HashMap<String,String> amap = null;


        Token n=null;
        Token n1=null;

        try {
            // Fast.g:207:2: ( (n= NAME ( COMMA n1= NAME )* )? )
            // Fast.g:207:3: (n= NAME ( COMMA n1= NAME )* )?
            {
             amap = new HashMap<String,String>(); 

            // Fast.g:208:2: (n= NAME ( COMMA n1= NAME )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==NAME) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // Fast.g:208:4: n= NAME ( COMMA n1= NAME )*
                    {
                    n=(Token)match(input,NAME,FOLLOW_NAME_in_arglist1495); 

                    amap.put(n.getText(), s.get_type(n.getText()));

                    // Fast.g:208:60: ( COMMA n1= NAME )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==COMMA) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // Fast.g:208:62: COMMA n1= NAME
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_arglist1500); 

                    	    n1=(Token)match(input,NAME,FOLLOW_NAME_in_arglist1504); 

                    	    amap.put(n.getText(), s.get_type(n1.getText()));

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return amap;
    }
    // $ANTLR end "arglist"



    // $ANTLR start "variable"
    // Fast.g:211:1: variable returns [ String name ] : (n= NAME | chestaccess );
    public final String variable() throws RecognitionException {
        String name = null;


        Token n=null;

        try {
            // Fast.g:212:2: (n= NAME | chestaccess )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==NAME) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==AND||LA26_1==EQUAL||(LA26_1 >= GREATER && LA26_1 <= GREATEREQUAL)||(LA26_1 >= LESS && LA26_1 <= LESSEQUAL)||LA26_1==MINUS||(LA26_1 >= NOTEQUAL && LA26_1 <= PLUS)||(LA26_1 >= RPAREN && LA26_1 <= THEN)) ) {
                    alt26=1;
                }
                else if ( (LA26_1==DOT) ) {
                    alt26=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // Fast.g:212:4: n= NAME
                    {
                    n=(Token)match(input,NAME,FOLLOW_NAME_in_variable1529); 

                     name = n.getText();

                    s.eval_atrib(n.getText());

                    }
                    break;
                case 2 :
                    // Fast.g:213:4: chestaccess
                    {
                    pushFollow(FOLLOW_chestaccess_in_variable1538);
                    chestaccess();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "variable"



    // $ANTLR start "number"
    // Fast.g:216:1: number returns [ String type ] : ( INT | FLOAT );
    public final String number() throws RecognitionException {
        String type = null;


        try {
            // Fast.g:217:2: ( INT | FLOAT )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==INT) ) {
                alt27=1;
            }
            else if ( (LA27_0==FLOAT) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // Fast.g:217:4: INT
                    {
                    match(input,INT,FOLLOW_INT_in_number1554); 

                     type = "Integer"; 

                    }
                    break;
                case 2 :
                    // Fast.g:218:4: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_number1561); 

                     type = "Real"; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return type;
    }
    // $ANTLR end "number"



    // $ANTLR start "string"
    // Fast.g:221:1: string returns [ String type ] : NORMALSTRING ;
    public final String string() throws RecognitionException {
        String type = null;


        try {
            // Fast.g:222:2: ( NORMALSTRING )
            // Fast.g:222:4: NORMALSTRING
            {
            match(input,NORMALSTRING,FOLLOW_NORMALSTRING_in_string1578); 

             type = "String"; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return type;
    }
    // $ANTLR end "string"

    // Delegated rules


 

    public static final BitSet FOLLOW_vardecl_in_fast681 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_SEMI_in_fast683 = new BitSet(new long[]{0x1F80000000000040L});
    public static final BitSet FOLLOW_stat_in_fast687 = new BitSet(new long[]{0x1F80000000000042L});
    public static final BitSet FOLLOW_def_func_in_stat702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_chest_in_stat710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varatrib_in_weakstat725 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_SEMI_in_weakstat727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vardecl_in_weakstat733 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_SEMI_in_weakstat739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funccall_in_weakstat745 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_SEMI_in_weakstat747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_if_in_weakstat753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_while_in_weakstat762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_return_in_weakstat773 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_SEMI_in_weakstat777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chestaccess_in_weakstat783 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_SEMI_in_weakstat785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_repeat_in_weakstat794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_varatrib809 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_varatrib811 = new BitSet(new long[]{0x00400478020C0000L});
    public static final BitSet FOLLOW_logic_op_expr_in_varatrib815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_vardecl831 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_NAME_in_vardecl835 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COMMA_in_vardecl841 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_NAME_in_vardecl845 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_NAME_in_funccall870 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LPAREN_in_funccall872 = new BitSet(new long[]{0x0001001000000000L});
    public static final BitSet FOLLOW_arglist_in_funccall876 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funccall878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_def_func896 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_NAME_in_def_func900 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LPAREN_in_def_func902 = new BitSet(new long[]{0x1F81000000000000L});
    public static final BitSet FOLLOW_typedarglist_in_def_func906 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_def_func908 = new BitSet(new long[]{0x5F80C01000808000L});
    public static final BitSet FOLLOW_weakstat_in_def_func918 = new BitSet(new long[]{0x5F80C01000808000L});
    public static final BitSet FOLLOW_END_in_def_func923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_def_if936 = new BitSet(new long[]{0x00400478020C0000L});
    public static final BitSet FOLLOW_logic_op_expr_in_def_if938 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_THEN_in_def_if940 = new BitSet(new long[]{0x5F80C0100080A000L});
    public static final BitSet FOLLOW_weakstat_in_def_if942 = new BitSet(new long[]{0x5F80C0100080A000L});
    public static final BitSet FOLLOW_END_in_def_if947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_def_if953 = new BitSet(new long[]{0x5F80C01000808000L});
    public static final BitSet FOLLOW_weakstat_in_def_if955 = new BitSet(new long[]{0x5F80C01000808000L});
    public static final BitSet FOLLOW_END_in_def_if958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEAT_in_def_repeat976 = new BitSet(new long[]{0x7F80C01000800000L});
    public static final BitSet FOLLOW_weakstat_in_def_repeat978 = new BitSet(new long[]{0x7F80C01000800000L});
    public static final BitSet FOLLOW_UNTIL_in_def_repeat981 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LPAREN_in_def_repeat983 = new BitSet(new long[]{0x00400478020C0000L});
    public static final BitSet FOLLOW_logic_op_expr_in_def_repeat985 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_def_repeat987 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_def_repeat989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHEST_in_def_chest1001 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_NAME_in_def_chest1003 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_def_chest1005 = new BitSet(new long[]{0x1F80001000008000L});
    public static final BitSet FOLLOW_vardecl_in_def_chest1009 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_SEMI_in_def_chest1011 = new BitSet(new long[]{0x1F80001000008000L});
    public static final BitSet FOLLOW_funccall_in_def_chest1015 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_SEMI_in_def_chest1017 = new BitSet(new long[]{0x1F80001000008000L});
    public static final BitSet FOLLOW_END_in_def_chest1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_def_while1033 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LPAREN_in_def_while1035 = new BitSet(new long[]{0x00400478020C0000L});
    public static final BitSet FOLLOW_logic_op_expr_in_def_while1037 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_def_while1039 = new BitSet(new long[]{0x5F80C01000808000L});
    public static final BitSet FOLLOW_weakstat_in_def_while1041 = new BitSet(new long[]{0x5F80C01000808000L});
    public static final BitSet FOLLOW_END_in_def_while1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_INT_in_type1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_REAL_in_type1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_STRING_in_type1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_BOOL_in_type1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_VOID_in_type1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_CHAIN_in_type1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_term1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funccall_in_term1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_term1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_term1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_unary_op_expr1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_op_expr_in_strong_op_expr1199 = new BitSet(new long[]{0x000C020000000002L});
    public static final BitSet FOLLOW_set_in_strong_op_expr1206 = new BitSet(new long[]{0x0000047802080000L});
    public static final BitSet FOLLOW_unary_op_expr_in_strong_op_expr1222 = new BitSet(new long[]{0x000C020000000002L});
    public static final BitSet FOLLOW_strong_op_expr_in_weak_op_expr1244 = new BitSet(new long[]{0x0000040800000002L});
    public static final BitSet FOLLOW_set_in_weak_op_expr1252 = new BitSet(new long[]{0x0000047802080000L});
    public static final BitSet FOLLOW_strong_op_expr_in_weak_op_expr1264 = new BitSet(new long[]{0x0000040800000002L});
    public static final BitSet FOLLOW_FALSE_in_weak_op_expr1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_weak_op_expr1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_weak_op_expr_in_relational_op_expr1298 = new BitSet(new long[]{0x0000008030610002L});
    public static final BitSet FOLLOW_set_in_relational_op_expr1306 = new BitSet(new long[]{0x00400478020C0000L});
    public static final BitSet FOLLOW_weak_op_expr_in_relational_op_expr1334 = new BitSet(new long[]{0x0000008030610002L});
    public static final BitSet FOLLOW_relational_op_expr_in_logic_op_expr1357 = new BitSet(new long[]{0x0000010000000012L});
    public static final BitSet FOLLOW_set_in_logic_op_expr1365 = new BitSet(new long[]{0x00400478020C0000L});
    public static final BitSet FOLLOW_relational_op_expr_in_logic_op_expr1377 = new BitSet(new long[]{0x0000010000000012L});
    public static final BitSet FOLLOW_type_in_typedarglist1404 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_NAME_in_typedarglist1408 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COMMA_in_typedarglist1413 = new BitSet(new long[]{0x1F80000000000000L});
    public static final BitSet FOLLOW_type_in_typedarglist1417 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_NAME_in_typedarglist1421 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_NAME_in_chestaccess1441 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DOT_in_chestaccess1445 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_NAME_in_chestaccess1447 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_RETURN_in_def_return1466 = new BitSet(new long[]{0x00400478020C0000L});
    public static final BitSet FOLLOW_logic_op_expr_in_def_return1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_arglist1495 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COMMA_in_arglist1500 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_NAME_in_arglist1504 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_NAME_in_variable1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chestaccess_in_variable1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_number1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_number1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORMALSTRING_in_string1578 = new BitSet(new long[]{0x0000000000000002L});

}