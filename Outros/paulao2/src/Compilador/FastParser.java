// $ANTLR 3.2 Sep 23, 2009 12:02:23 ../Compilador/Fast.g 2010-07-09 14:21:03

package Compilador;
import Compilador.Semanticator;
import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class FastParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "COLON", "COMMA", "SEMI", "DOT", "PLUS", "MINUS", "STAR", "SLASH", "POWER", "LESS", "GREATER", "ASSIGN", "PERCENT", "LCURLY", "RCURLY", "EQUAL", "NOTEQUAL", "LESSEQUAL", "GREATEREQUAL", "AND", "OR", "NOT", "FALSE", "TRUE", "TO", "FOR", "REPEAT", "WHILE", "IF", "ELSE", "ELSEIF", "UNTIL", "DO", "WITH", "IN", "END", "RETURN", "CHEST", "THEN", "T_INT", "T_REAL", "T_STRING", "T_CHAIN", "T_VOID", "T_BOOL", "PRINT", "NAME", "INT", "FLOAT", "NORMALSTRING", "LETTER", "DIGIT", "EscapeSequence", "WS", "COMMENT", "LINE_COMMENT", "LETTERL", "LETTERU"
    };
    public static final int STAR=14;
    public static final int LBRACK=6;
    public static final int WHILE=35;
    public static final int LETTER=58;
    public static final int T_STRING=49;
    public static final int T_BOOL=52;
    public static final int GREATEREQUAL=26;
    public static final int FOR=33;
    public static final int DO=40;
    public static final int FLOAT=56;
    public static final int NOT=29;
    public static final int AND=27;
    public static final int EOF=-1;
    public static final int T_VOID=51;
    public static final int T_REAL=48;
    public static final int LPAREN=4;
    public static final int IF=36;
    public static final int NOTEQUAL=24;
    public static final int RPAREN=5;
    public static final int NAME=54;
    public static final int GREATER=18;
    public static final int SLASH=15;
    public static final int THEN=46;
    public static final int IN=42;
    public static final int COMMA=9;
    public static final int T_INT=47;
    public static final int EQUAL=23;
    public static final int RETURN=44;
    public static final int LESS=17;
    public static final int PLUS=12;
    public static final int DIGIT=59;
    public static final int COMMENT=62;
    public static final int DOT=11;
    public static final int WITH=41;
    public static final int RBRACK=7;
    public static final int PERCENT=20;
    public static final int LINE_COMMENT=63;
    public static final int TO=32;
    public static final int ELSE=37;
    public static final int POWER=16;
    public static final int LCURLY=21;
    public static final int INT=55;
    public static final int LETTERU=65;
    public static final int MINUS=13;
    public static final int CHEST=45;
    public static final int SEMI=10;
    public static final int TRUE=31;
    public static final int PRINT=53;
    public static final int LETTERL=64;
    public static final int ELSEIF=38;
    public static final int COLON=8;
    public static final int NORMALSTRING=57;
    public static final int WS=61;
    public static final int T_CHAIN=50;
    public static final int UNTIL=39;
    public static final int RCURLY=22;
    public static final int OR=28;
    public static final int ASSIGN=19;
    public static final int REPEAT=34;
    public static final int END=43;
    public static final int FALSE=30;
    public static final int LESSEQUAL=25;
    public static final int EscapeSequence=60;

    // delegates
    // delegators


        public FastParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public FastParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return FastParser.tokenNames; }
    public String getGrammarFileName() { return "../Compilador/Fast.g"; }


    Semanticator s = new Semanticator(this);
    CodeGenerator g = new CodeGenerator(s);



    // $ANTLR start "fast"
    // ../Compilador/Fast.g:102:1: fast : ( ( vardecl SEMI )* ( stat ) )+ ;
    public final void fast() throws RecognitionException {
        try {
            // ../Compilador/Fast.g:103:2: ( ( ( vardecl SEMI )* ( stat ) )+ )
            // ../Compilador/Fast.g:103:4: ( ( vardecl SEMI )* ( stat ) )+
            {
            // ../Compilador/Fast.g:103:4: ( ( vardecl SEMI )* ( stat ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CHEST||(LA2_0>=T_INT && LA2_0<=NAME)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../Compilador/Fast.g:103:5: ( vardecl SEMI )* ( stat )
            	    {
            	    // ../Compilador/Fast.g:103:5: ( vardecl SEMI )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        alt1 = dfa1.predict(input);
            	        switch (alt1) {
            	    	case 1 :
            	    	    // ../Compilador/Fast.g:103:6: vardecl SEMI
            	    	    {
            	    	    pushFollow(FOLLOW_vardecl_in_fast691);
            	    	    vardecl();

            	    	    state._fsp--;

            	    	    match(input,SEMI,FOLLOW_SEMI_in_fast693); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);

            	    // ../Compilador/Fast.g:103:20: ( stat )
            	    // ../Compilador/Fast.g:103:21: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_fast697);
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
        }
        return ;
    }
    // $ANTLR end "fast"


    // $ANTLR start "stat"
    // ../Compilador/Fast.g:106:1: stat : ( def_func | def_chest | funccall SEMI | def_print SEMI );
    public final void stat() throws RecognitionException {
        try {
            // ../Compilador/Fast.g:107:2: ( def_func | def_chest | funccall SEMI | def_print SEMI )
            int alt3=4;
            switch ( input.LA(1) ) {
            case T_INT:
            case T_REAL:
            case T_STRING:
            case T_CHAIN:
            case T_VOID:
            case T_BOOL:
                {
                alt3=1;
                }
                break;
            case CHEST:
                {
                alt3=2;
                }
                break;
            case NAME:
                {
                alt3=3;
                }
                break;
            case PRINT:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../Compilador/Fast.g:107:4: def_func
                    {
                    pushFollow(FOLLOW_def_func_in_stat712);
                    def_func();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // ../Compilador/Fast.g:108:4: def_chest
                    {
                    pushFollow(FOLLOW_def_chest_in_stat720);
                    def_chest();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // ../Compilador/Fast.g:109:6: funccall SEMI
                    {
                    pushFollow(FOLLOW_funccall_in_stat727);
                    funccall();

                    state._fsp--;

                    match(input,SEMI,FOLLOW_SEMI_in_stat729); 

                    }
                    break;
                case 4 :
                    // ../Compilador/Fast.g:110:4: def_print SEMI
                    {
                    pushFollow(FOLLOW_def_print_in_stat734);
                    def_print();

                    state._fsp--;

                    match(input,SEMI,FOLLOW_SEMI_in_stat736); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "stat"


    // $ANTLR start "weakstat"
    // ../Compilador/Fast.g:113:1: weakstat returns [ String type ] : ( varatrib SEMI | vardecl SEMI | funccall SEMI | def_if | def_while | t= def_return SEMI | chestaccess SEMI | def_repeat | def_print SEMI );
    public final String weakstat() throws RecognitionException {
        String type = null;

        String t = null;


        try {
            // ../Compilador/Fast.g:114:2: ( varatrib SEMI | vardecl SEMI | funccall SEMI | def_if | def_while | t= def_return SEMI | chestaccess SEMI | def_repeat | def_print SEMI )
            int alt4=9;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../Compilador/Fast.g:114:4: varatrib SEMI
                    {
                    pushFollow(FOLLOW_varatrib_in_weakstat751);
                    varatrib();

                    state._fsp--;

                    match(input,SEMI,FOLLOW_SEMI_in_weakstat753); 

                    }
                    break;
                case 2 :
                    // ../Compilador/Fast.g:115:4: vardecl SEMI
                    {
                    pushFollow(FOLLOW_vardecl_in_weakstat759);
                    vardecl();

                    state._fsp--;

                    match(input,SEMI,FOLLOW_SEMI_in_weakstat765); 

                    }
                    break;
                case 3 :
                    // ../Compilador/Fast.g:116:4: funccall SEMI
                    {
                    pushFollow(FOLLOW_funccall_in_weakstat771);
                    funccall();

                    state._fsp--;

                    match(input,SEMI,FOLLOW_SEMI_in_weakstat773); 

                    }
                    break;
                case 4 :
                    // ../Compilador/Fast.g:117:4: def_if
                    {
                    pushFollow(FOLLOW_def_if_in_weakstat779);
                    def_if();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // ../Compilador/Fast.g:118:4: def_while
                    {
                    pushFollow(FOLLOW_def_while_in_weakstat788);
                    def_while();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // ../Compilador/Fast.g:119:4: t= def_return SEMI
                    {
                    pushFollow(FOLLOW_def_return_in_weakstat799);
                    t=def_return();

                    state._fsp--;

                    type =t;
                    match(input,SEMI,FOLLOW_SEMI_in_weakstat803); 

                    }
                    break;
                case 7 :
                    // ../Compilador/Fast.g:120:4: chestaccess SEMI
                    {
                    pushFollow(FOLLOW_chestaccess_in_weakstat809);
                    chestaccess();

                    state._fsp--;

                    match(input,SEMI,FOLLOW_SEMI_in_weakstat811); 

                    }
                    break;
                case 8 :
                    // ../Compilador/Fast.g:121:4: def_repeat
                    {
                    pushFollow(FOLLOW_def_repeat_in_weakstat820);
                    def_repeat();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // ../Compilador/Fast.g:122:4: def_print SEMI
                    {
                    pushFollow(FOLLOW_def_print_in_weakstat825);
                    def_print();

                    state._fsp--;

                    match(input,SEMI,FOLLOW_SEMI_in_weakstat827); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return type;
    }
    // $ANTLR end "weakstat"


    // $ANTLR start "varatrib"
    // ../Compilador/Fast.g:125:1: varatrib : n= NAME ASSIGN le= logic_op_expr ;
    public final void varatrib() throws RecognitionException {
        Token n=null;
        FastParser.logic_op_expr_return le = null;


        try {
            // ../Compilador/Fast.g:126:2: (n= NAME ASSIGN le= logic_op_expr )
            // ../Compilador/Fast.g:126:5: n= NAME ASSIGN le= logic_op_expr
            {
            n=(Token)match(input,NAME,FOLLOW_NAME_in_varatrib842); 
            match(input,ASSIGN,FOLLOW_ASSIGN_in_varatrib844); 
            pushFollow(FOLLOW_logic_op_expr_in_varatrib848);
            le=logic_op_expr();

            state._fsp--;

             s.eval_assign(s.get_type(n.getText()), le.type); g.storeVariable(n.getText(), le.type);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "varatrib"


    // $ANTLR start "vardecl"
    // ../Compilador/Fast.g:129:1: vardecl : t= type v= NAME ( COMMA v= NAME )* ;
    public final void vardecl() throws RecognitionException {
        Token v=null;
        String t = null;


        try {
            // ../Compilador/Fast.g:130:2: (t= type v= NAME ( COMMA v= NAME )* )
            // ../Compilador/Fast.g:130:5: t= type v= NAME ( COMMA v= NAME )*
            {
            pushFollow(FOLLOW_type_in_vardecl865);
            t=type();

            state._fsp--;

            v=(Token)match(input,NAME,FOLLOW_NAME_in_vardecl869); 
             s.add_variable(v.getText(), t); g.addVariable(v.getText(), t); 
            // ../Compilador/Fast.g:131:3: ( COMMA v= NAME )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../Compilador/Fast.g:131:4: COMMA v= NAME
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_vardecl878); 
            	    v=(Token)match(input,NAME,FOLLOW_NAME_in_vardecl882); 
            	     s.add_variable(v.getText(), t); g.addVariable(v.getText(), t); 

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
        }
        return ;
    }
    // $ANTLR end "vardecl"


    // $ANTLR start "funccall"
    // ../Compilador/Fast.g:134:1: funccall returns [ String type ] : n= NAME LPAREN h= arglist RPAREN ;
    public final String funccall() throws RecognitionException {
        String type = null;

        Token n=null;
        HashMap<String,String> h = null;


        try {
            // ../Compilador/Fast.g:135:2: (n= NAME LPAREN h= arglist RPAREN )
            // ../Compilador/Fast.g:135:5: n= NAME LPAREN h= arglist RPAREN
            {
            n=(Token)match(input,NAME,FOLLOW_NAME_in_funccall907); 
            match(input,LPAREN,FOLLOW_LPAREN_in_funccall909); 
            pushFollow(FOLLOW_arglist_in_funccall913);
            h=arglist();

            state._fsp--;

            match(input,RPAREN,FOLLOW_RPAREN_in_funccall915); 
             type =s.eval_funccall(n.getText(), h); g.pushFunctionCall(n.getText(), h, type); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return type;
    }
    // $ANTLR end "funccall"


    // $ANTLR start "def_func"
    // ../Compilador/Fast.g:138:1: def_func : t= type n= NAME LPAREN h= typedarglist RPAREN (tw= weakstat )* END ;
    public final void def_func() throws RecognitionException {
        Token n=null;
        String t = null;

        HashMap<String,String> h = null;

        String tw = null;


        try {
            // ../Compilador/Fast.g:139:2: (t= type n= NAME LPAREN h= typedarglist RPAREN (tw= weakstat )* END )
            // ../Compilador/Fast.g:139:5: t= type n= NAME LPAREN h= typedarglist RPAREN (tw= weakstat )* END
            {
            pushFollow(FOLLOW_type_in_def_func933);
            t=type();

            state._fsp--;

            n=(Token)match(input,NAME,FOLLOW_NAME_in_def_func937); 
            match(input,LPAREN,FOLLOW_LPAREN_in_def_func939); 
            pushFollow(FOLLOW_typedarglist_in_def_func943);
            h=typedarglist();

            state._fsp--;

            match(input,RPAREN,FOLLOW_RPAREN_in_def_func945); 
            s.open_function_decl(t,h,n.getText()); 
            			 g.pushFunction(n.getText(), h, t);    
            			
            // ../Compilador/Fast.g:142:6: (tw= weakstat )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=REPEAT && LA6_0<=IF)||LA6_0==RETURN||(LA6_0>=T_INT && LA6_0<=NAME)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../Compilador/Fast.g:142:7: tw= weakstat
            	    {
            	    pushFollow(FOLLOW_weakstat_in_def_func956);
            	    tw=weakstat();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            s.close_function_decl(tw);
            			 g.pushEnd(t);
            			
            match(input,END,FOLLOW_END_in_def_func965); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "def_func"


    // $ANTLR start "def_if"
    // ../Compilador/Fast.g:148:1: def_if : IF e= logic_op_expr THEN ( weakstat )* ( END | ( ELSE ( weakstat )* END ) ) ;
    public final void def_if() throws RecognitionException {
        FastParser.logic_op_expr_return e = null;


        try {
            // ../Compilador/Fast.g:149:2: ( IF e= logic_op_expr THEN ( weakstat )* ( END | ( ELSE ( weakstat )* END ) ) )
            // ../Compilador/Fast.g:149:5: IF e= logic_op_expr THEN ( weakstat )* ( END | ( ELSE ( weakstat )* END ) )
            {
            match(input,IF,FOLLOW_IF_in_def_if978); 
            pushFollow(FOLLOW_logic_op_expr_in_def_if982);
            e=logic_op_expr();

            state._fsp--;

             g.pushIf(e.type, e.opr, "Else");
            match(input,THEN,FOLLOW_THEN_in_def_if986); 
            // ../Compilador/Fast.g:150:3: ( weakstat )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=REPEAT && LA7_0<=IF)||LA7_0==RETURN||(LA7_0>=T_INT && LA7_0<=NAME)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../Compilador/Fast.g:150:3: weakstat
            	    {
            	    pushFollow(FOLLOW_weakstat_in_def_if991);
            	    weakstat();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             g.pushGotoLabel("Done"+g.popLabel("Done"));
            		  g.pushElseLabel();
            		
            // ../Compilador/Fast.g:154:3: ( END | ( ELSE ( weakstat )* END ) )
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
                    // ../Compilador/Fast.g:154:5: END
                    {
                    match(input,END,FOLLOW_END_in_def_if1003); 

                    }
                    break;
                case 2 :
                    // ../Compilador/Fast.g:154:11: ( ELSE ( weakstat )* END )
                    {
                    // ../Compilador/Fast.g:154:11: ( ELSE ( weakstat )* END )
                    // ../Compilador/Fast.g:154:13: ELSE ( weakstat )* END
                    {
                    match(input,ELSE,FOLLOW_ELSE_in_def_if1009); 
                    // ../Compilador/Fast.g:154:18: ( weakstat )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=REPEAT && LA8_0<=IF)||LA8_0==RETURN||(LA8_0>=T_INT && LA8_0<=NAME)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../Compilador/Fast.g:154:18: weakstat
                    	    {
                    	    pushFollow(FOLLOW_weakstat_in_def_if1011);
                    	    weakstat();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match(input,END,FOLLOW_END_in_def_if1014); 

                    }


                    }
                    break;

            }

             g.pushDoneLabel(); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "def_if"


    // $ANTLR start "def_repeat"
    // ../Compilador/Fast.g:158:1: def_repeat : REPEAT ( weakstat )* UNTIL LPAREN logic_op_expr RPAREN END ;
    public final void def_repeat() throws RecognitionException {
        try {
            // ../Compilador/Fast.g:159:2: ( REPEAT ( weakstat )* UNTIL LPAREN logic_op_expr RPAREN END )
            // ../Compilador/Fast.g:159:5: REPEAT ( weakstat )* UNTIL LPAREN logic_op_expr RPAREN END
            {
            match(input,REPEAT,FOLLOW_REPEAT_in_def_repeat1036); 
            // ../Compilador/Fast.g:159:12: ( weakstat )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=REPEAT && LA10_0<=IF)||LA10_0==RETURN||(LA10_0>=T_INT && LA10_0<=NAME)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../Compilador/Fast.g:159:12: weakstat
            	    {
            	    pushFollow(FOLLOW_weakstat_in_def_repeat1038);
            	    weakstat();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match(input,UNTIL,FOLLOW_UNTIL_in_def_repeat1041); 
            match(input,LPAREN,FOLLOW_LPAREN_in_def_repeat1043); 
            pushFollow(FOLLOW_logic_op_expr_in_def_repeat1045);
            logic_op_expr();

            state._fsp--;

            match(input,RPAREN,FOLLOW_RPAREN_in_def_repeat1047); 
            match(input,END,FOLLOW_END_in_def_repeat1049); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "def_repeat"


    // $ANTLR start "def_chest"
    // ../Compilador/Fast.g:162:1: def_chest : CHEST NAME COLON ( vardecl SEMI | funccall SEMI )* END ;
    public final void def_chest() throws RecognitionException {
        try {
            // ../Compilador/Fast.g:163:2: ( CHEST NAME COLON ( vardecl SEMI | funccall SEMI )* END )
            // ../Compilador/Fast.g:163:4: CHEST NAME COLON ( vardecl SEMI | funccall SEMI )* END
            {
            match(input,CHEST,FOLLOW_CHEST_in_def_chest1061); 
            match(input,NAME,FOLLOW_NAME_in_def_chest1063); 
            match(input,COLON,FOLLOW_COLON_in_def_chest1065); 
            // ../Compilador/Fast.g:163:21: ( vardecl SEMI | funccall SEMI )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=T_INT && LA11_0<=T_BOOL)) ) {
                    alt11=1;
                }
                else if ( (LA11_0==NAME) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // ../Compilador/Fast.g:163:23: vardecl SEMI
            	    {
            	    pushFollow(FOLLOW_vardecl_in_def_chest1069);
            	    vardecl();

            	    state._fsp--;

            	    match(input,SEMI,FOLLOW_SEMI_in_def_chest1071); 

            	    }
            	    break;
            	case 2 :
            	    // ../Compilador/Fast.g:163:38: funccall SEMI
            	    {
            	    pushFollow(FOLLOW_funccall_in_def_chest1075);
            	    funccall();

            	    state._fsp--;

            	    match(input,SEMI,FOLLOW_SEMI_in_def_chest1077); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match(input,END,FOLLOW_END_in_def_chest1082); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "def_chest"


    // $ANTLR start "def_while"
    // ../Compilador/Fast.g:166:1: def_while : WHILE LPAREN le= logic_op_expr RPAREN ( weakstat )* END ;
    public final void def_while() throws RecognitionException {
        FastParser.logic_op_expr_return le = null;


        try {
            // ../Compilador/Fast.g:167:2: ( WHILE LPAREN le= logic_op_expr RPAREN ( weakstat )* END )
            // ../Compilador/Fast.g:167:4: WHILE LPAREN le= logic_op_expr RPAREN ( weakstat )* END
            {
            g.pushWhileLabel();
            match(input,WHILE,FOLLOW_WHILE_in_def_while1097); 
            match(input,LPAREN,FOLLOW_LPAREN_in_def_while1099); 
            pushFollow(FOLLOW_logic_op_expr_in_def_while1103);
            le=logic_op_expr();

            state._fsp--;

             g.pushWhile(le.type, le.opr); 
            match(input,RPAREN,FOLLOW_RPAREN_in_def_while1107); 
            // ../Compilador/Fast.g:169:3: ( weakstat )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=REPEAT && LA12_0<=IF)||LA12_0==RETURN||(LA12_0>=T_INT && LA12_0<=NAME)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../Compilador/Fast.g:169:3: weakstat
            	    {
            	    pushFollow(FOLLOW_weakstat_in_def_while1112);
            	    weakstat();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             g.pushGotoLabel("While"+g.popLabel("While")); 
            match(input,END,FOLLOW_END_in_def_while1122); 
             g.pushDoneLabel(); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "def_while"


    // $ANTLR start "type"
    // ../Compilador/Fast.g:176:1: type returns [ String type ] : ( T_INT | T_REAL | T_STRING | T_BOOL | T_VOID | T_CHAIN );
    public final String type() throws RecognitionException {
        String type = null;

        try {
            // ../Compilador/Fast.g:177:2: ( T_INT | T_REAL | T_STRING | T_BOOL | T_VOID | T_CHAIN )
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
                    // ../Compilador/Fast.g:177:4: T_INT
                    {
                    match(input,T_INT,FOLLOW_T_INT_in_type1143); 
                     type = "Integer"; 

                    }
                    break;
                case 2 :
                    // ../Compilador/Fast.g:178:4: T_REAL
                    {
                    match(input,T_REAL,FOLLOW_T_REAL_in_type1151); 
                     type = "Real"; 

                    }
                    break;
                case 3 :
                    // ../Compilador/Fast.g:179:4: T_STRING
                    {
                    match(input,T_STRING,FOLLOW_T_STRING_in_type1158); 
                     type = "String"; 

                    }
                    break;
                case 4 :
                    // ../Compilador/Fast.g:180:4: T_BOOL
                    {
                    match(input,T_BOOL,FOLLOW_T_BOOL_in_type1165); 
                     type = "Boolean"; 

                    }
                    break;
                case 5 :
                    // ../Compilador/Fast.g:181:4: T_VOID
                    {
                    match(input,T_VOID,FOLLOW_T_VOID_in_type1172); 
                     type = "Void"; 

                    }
                    break;
                case 6 :
                    // ../Compilador/Fast.g:182:4: T_CHAIN
                    {
                    match(input,T_CHAIN,FOLLOW_T_CHAIN_in_type1179); 
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
        }
        return type;
    }
    // $ANTLR end "type"


    // $ANTLR start "term"
    // ../Compilador/Fast.g:185:1: term returns [ String type ] : (v= variable | f= funccall | n= number | str= string );
    public final String term() throws RecognitionException {
        String type = null;

        String v = null;

        String f = null;

        String n = null;

        String str = null;


        try {
            // ../Compilador/Fast.g:186:2: (v= variable | f= funccall | n= number | str= string )
            int alt14=4;
            switch ( input.LA(1) ) {
            case NAME:
                {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==LPAREN) ) {
                    alt14=2;
                }
                else if ( (LA14_1==RPAREN||(LA14_1>=SEMI && LA14_1<=SLASH)||(LA14_1>=LESS && LA14_1<=GREATER)||LA14_1==PERCENT||(LA14_1>=EQUAL && LA14_1<=OR)||LA14_1==THEN) ) {
                    alt14=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
                }
                break;
            case INT:
            case FLOAT:
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
                    // ../Compilador/Fast.g:186:4: v= variable
                    {
                    pushFollow(FOLLOW_variable_in_term1198);
                    v=variable();

                    state._fsp--;

                     type = s.get_type(v); 

                    }
                    break;
                case 2 :
                    // ../Compilador/Fast.g:187:6: f= funccall
                    {
                    pushFollow(FOLLOW_funccall_in_term1209);
                    f=funccall();

                    state._fsp--;

                     type = f; 

                    }
                    break;
                case 3 :
                    // ../Compilador/Fast.g:188:4: n= number
                    {
                    pushFollow(FOLLOW_number_in_term1219);
                    n=number();

                    state._fsp--;

                     type = n; 

                    }
                    break;
                case 4 :
                    // ../Compilador/Fast.g:189:4: str= string
                    {
                    pushFollow(FOLLOW_string_in_term1228);
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
        }
        return type;
    }
    // $ANTLR end "term"


    // $ANTLR start "unary_op_expr"
    // ../Compilador/Fast.g:192:1: unary_op_expr returns [ String type ] : (op= ( MINUS | NOT ) )? t= term ;
    public final String unary_op_expr() throws RecognitionException {
        String type = null;

        Token op=null;
        String t = null;


        try {
            // ../Compilador/Fast.g:193:2: ( (op= ( MINUS | NOT ) )? t= term )
            // ../Compilador/Fast.g:193:4: (op= ( MINUS | NOT ) )? t= term
            {
            // ../Compilador/Fast.g:193:6: (op= ( MINUS | NOT ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==MINUS||LA15_0==NOT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../Compilador/Fast.g:193:6: op= ( MINUS | NOT )
                    {
                    op=(Token)input.LT(1);
                    if ( input.LA(1)==MINUS||input.LA(1)==NOT ) {
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

            pushFollow(FOLLOW_term_in_unary_op_expr1260);
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
        }
        return type;
    }
    // $ANTLR end "unary_op_expr"


    // $ANTLR start "strong_op_expr"
    // ../Compilador/Fast.g:196:1: strong_op_expr returns [ String type ] : t1= unary_op_expr (op= ( STAR | SLASH | PERCENT ) t2= unary_op_expr )* ;
    public final String strong_op_expr() throws RecognitionException {
        String type = null;

        Token op=null;
        String t1 = null;

        String t2 = null;


        try {
            // ../Compilador/Fast.g:197:2: (t1= unary_op_expr (op= ( STAR | SLASH | PERCENT ) t2= unary_op_expr )* )
            // ../Compilador/Fast.g:197:4: t1= unary_op_expr (op= ( STAR | SLASH | PERCENT ) t2= unary_op_expr )*
            {
            pushFollow(FOLLOW_unary_op_expr_in_strong_op_expr1279);
            t1=unary_op_expr();

            state._fsp--;

            type = t1;
            // ../Compilador/Fast.g:198:16: (op= ( STAR | SLASH | PERCENT ) t2= unary_op_expr )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=STAR && LA16_0<=SLASH)||LA16_0==PERCENT) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../Compilador/Fast.g:198:18: op= ( STAR | SLASH | PERCENT ) t2= unary_op_expr
            	    {
            	    op=(Token)input.LT(1);
            	    if ( (input.LA(1)>=STAR && input.LA(1)<=SLASH)||input.LA(1)==PERCENT ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unary_op_expr_in_strong_op_expr1305);
            	    t2=unary_op_expr();

            	    state._fsp--;

            	     type = s.eval_strong_expr(t1,t2,op.getText()); 
            	    		  g.pushOperator(op.getText(), t1); 

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
        }
        return type;
    }
    // $ANTLR end "strong_op_expr"


    // $ANTLR start "weak_op_expr"
    // ../Compilador/Fast.g:203:1: weak_op_expr returns [ String type ] : (t1= strong_op_expr (op= ( PLUS | MINUS ) t2= strong_op_expr )* | f= FALSE | t= TRUE );
    public final String weak_op_expr() throws RecognitionException {
        String type = null;

        Token op=null;
        Token f=null;
        Token t=null;
        String t1 = null;

        String t2 = null;


        try {
            // ../Compilador/Fast.g:204:2: (t1= strong_op_expr (op= ( PLUS | MINUS ) t2= strong_op_expr )* | f= FALSE | t= TRUE )
            int alt18=3;
            switch ( input.LA(1) ) {
            case MINUS:
            case NOT:
            case NAME:
            case INT:
            case FLOAT:
            case NORMALSTRING:
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
                    // ../Compilador/Fast.g:204:4: t1= strong_op_expr (op= ( PLUS | MINUS ) t2= strong_op_expr )*
                    {
                    pushFollow(FOLLOW_strong_op_expr_in_weak_op_expr1330);
                    t1=strong_op_expr();

                    state._fsp--;

                     type =t1;
                    // ../Compilador/Fast.g:204:35: (op= ( PLUS | MINUS ) t2= strong_op_expr )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>=PLUS && LA17_0<=MINUS)) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../Compilador/Fast.g:204:37: op= ( PLUS | MINUS ) t2= strong_op_expr
                    	    {
                    	    op=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                    	        input.consume();
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_strong_op_expr_in_weak_op_expr1350);
                    	    t2=strong_op_expr();

                    	    state._fsp--;

                    	    type =s.eval_weak_expr(t1,t2,op.getText());
                    	    	 g.pushOperator(op.getText(), t1); 

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../Compilador/Fast.g:207:4: f= FALSE
                    {
                    f=(Token)match(input,FALSE,FOLLOW_FALSE_in_weak_op_expr1365); 
                    g.pushBoolean(f.getText()); 

                    }
                    break;
                case 3 :
                    // ../Compilador/Fast.g:208:4: t= TRUE
                    {
                    t=(Token)match(input,TRUE,FOLLOW_TRUE_in_weak_op_expr1374); 
                    g.pushBoolean(t.getText()); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return type;
    }
    // $ANTLR end "weak_op_expr"

    public static class relational_op_expr_return extends ParserRuleReturnScope {
        public String type;
        public String opr;
    };

    // $ANTLR start "relational_op_expr"
    // ../Compilador/Fast.g:211:1: relational_op_expr returns [ String type, String opr ] : t1= weak_op_expr (op= ( LESS | GREATER | EQUAL | NOTEQUAL | GREATEREQUAL | LESSEQUAL ) t2= weak_op_expr )* ;
    public final FastParser.relational_op_expr_return relational_op_expr() throws RecognitionException {
        FastParser.relational_op_expr_return retval = new FastParser.relational_op_expr_return();
        retval.start = input.LT(1);

        Token op=null;
        String t1 = null;

        String t2 = null;


        try {
            // ../Compilador/Fast.g:212:2: (t1= weak_op_expr (op= ( LESS | GREATER | EQUAL | NOTEQUAL | GREATEREQUAL | LESSEQUAL ) t2= weak_op_expr )* )
            // ../Compilador/Fast.g:212:4: t1= weak_op_expr (op= ( LESS | GREATER | EQUAL | NOTEQUAL | GREATEREQUAL | LESSEQUAL ) t2= weak_op_expr )*
            {
            pushFollow(FOLLOW_weak_op_expr_in_relational_op_expr1394);
            t1=weak_op_expr();

            state._fsp--;

             retval.type =t1;
            // ../Compilador/Fast.g:212:33: (op= ( LESS | GREATER | EQUAL | NOTEQUAL | GREATEREQUAL | LESSEQUAL ) t2= weak_op_expr )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=LESS && LA19_0<=GREATER)||(LA19_0>=EQUAL && LA19_0<=GREATEREQUAL)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../Compilador/Fast.g:212:35: op= ( LESS | GREATER | EQUAL | NOTEQUAL | GREATEREQUAL | LESSEQUAL ) t2= weak_op_expr
            	    {
            	    op=(Token)input.LT(1);
            	    if ( (input.LA(1)>=LESS && input.LA(1)<=GREATER)||(input.LA(1)>=EQUAL && input.LA(1)<=GREATEREQUAL) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_weak_op_expr_in_relational_op_expr1430);
            	    t2=weak_op_expr();

            	    state._fsp--;

            	     s.eval_relational_expr(t1,t2,op.getText());
            	    		  retval.opr = op.getText();

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relational_op_expr"

    public static class logic_op_expr_return extends ParserRuleReturnScope {
        public String type;
        public String opr;
    };

    // $ANTLR start "logic_op_expr"
    // ../Compilador/Fast.g:217:1: logic_op_expr returns [ String type, String opr ] : r1= relational_op_expr (op= ( OR | AND ) r2= relational_op_expr )* ;
    public final FastParser.logic_op_expr_return logic_op_expr() throws RecognitionException {
        FastParser.logic_op_expr_return retval = new FastParser.logic_op_expr_return();
        retval.start = input.LT(1);

        Token op=null;
        FastParser.relational_op_expr_return r1 = null;

        FastParser.relational_op_expr_return r2 = null;


        try {
            // ../Compilador/Fast.g:218:2: (r1= relational_op_expr (op= ( OR | AND ) r2= relational_op_expr )* )
            // ../Compilador/Fast.g:218:4: r1= relational_op_expr (op= ( OR | AND ) r2= relational_op_expr )*
            {
            pushFollow(FOLLOW_relational_op_expr_in_logic_op_expr1454);
            r1=relational_op_expr();

            state._fsp--;

            retval.type =r1.type; retval.opr = r1.opr;
            // ../Compilador/Fast.g:218:58: (op= ( OR | AND ) r2= relational_op_expr )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=AND && LA20_0<=OR)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../Compilador/Fast.g:218:60: op= ( OR | AND ) r2= relational_op_expr
            	    {
            	    op=(Token)input.LT(1);
            	    if ( (input.LA(1)>=AND && input.LA(1)<=OR) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relational_op_expr_in_logic_op_expr1474);
            	    r2=relational_op_expr();

            	    state._fsp--;

            	     s.eval_logic_expr(r1.type,r2.type,op.getText());
            	    		  retval.opr = op.getText();

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logic_op_expr"


    // $ANTLR start "typedarglist"
    // ../Compilador/Fast.g:223:1: typedarglist returns [ HashMap<String,String> tamap ] : (t= type n= NAME ( COMMA t= type n= NAME )* )? ;
    public final HashMap<String,String> typedarglist() throws RecognitionException {
        HashMap<String,String> tamap = null;

        Token n=null;
        String t = null;


        try {
            // ../Compilador/Fast.g:224:2: ( (t= type n= NAME ( COMMA t= type n= NAME )* )? )
            // ../Compilador/Fast.g:224:3: (t= type n= NAME ( COMMA t= type n= NAME )* )?
            {
             tamap = new HashMap<String,String>(); 
            // ../Compilador/Fast.g:225:2: (t= type n= NAME ( COMMA t= type n= NAME )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=T_INT && LA22_0<=T_BOOL)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../Compilador/Fast.g:225:4: t= type n= NAME ( COMMA t= type n= NAME )*
                    {
                    pushFollow(FOLLOW_type_in_typedarglist1504);
                    t=type();

                    state._fsp--;

                    n=(Token)match(input,NAME,FOLLOW_NAME_in_typedarglist1508); 
                     tamap.put(n.getText(), t); 
                    // ../Compilador/Fast.g:225:48: ( COMMA t= type n= NAME )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==COMMA) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../Compilador/Fast.g:225:50: COMMA t= type n= NAME
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_typedarglist1513); 
                    	    pushFollow(FOLLOW_type_in_typedarglist1517);
                    	    t=type();

                    	    state._fsp--;

                    	    n=(Token)match(input,NAME,FOLLOW_NAME_in_typedarglist1521); 
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
        }
        return tamap;
    }
    // $ANTLR end "typedarglist"


    // $ANTLR start "chestaccess"
    // ../Compilador/Fast.g:228:1: chestaccess : NAME ( DOT NAME )+ ;
    public final void chestaccess() throws RecognitionException {
        try {
            // ../Compilador/Fast.g:229:2: ( NAME ( DOT NAME )+ )
            // ../Compilador/Fast.g:229:4: NAME ( DOT NAME )+
            {
            match(input,NAME,FOLLOW_NAME_in_chestaccess1541); 
            // ../Compilador/Fast.g:229:9: ( DOT NAME )+
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
            	    // ../Compilador/Fast.g:229:11: DOT NAME
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_chestaccess1545); 
            	    match(input,NAME,FOLLOW_NAME_in_chestaccess1547); 

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
        }
        return ;
    }
    // $ANTLR end "chestaccess"


    // $ANTLR start "def_return"
    // ../Compilador/Fast.g:232:1: def_return returns [ String type ] : RETURN t= logic_op_expr ;
    public final String def_return() throws RecognitionException {
        String type = null;

        FastParser.logic_op_expr_return t = null;


        try {
            // ../Compilador/Fast.g:233:2: ( RETURN t= logic_op_expr )
            // ../Compilador/Fast.g:233:4: RETURN t= logic_op_expr
            {
            match(input,RETURN,FOLLOW_RETURN_in_def_return1566); 
            pushFollow(FOLLOW_logic_op_expr_in_def_return1570);
            t=logic_op_expr();

            state._fsp--;

             type =t.type;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return type;
    }
    // $ANTLR end "def_return"


    // $ANTLR start "arglist"
    // ../Compilador/Fast.g:236:1: arglist returns [ HashMap<String,String> amap ] : (n= variable ( COMMA n1= variable )* )? ;
    public final HashMap<String,String> arglist() throws RecognitionException {
        HashMap<String,String> amap = null;

        String n = null;

        String n1 = null;


        try {
            // ../Compilador/Fast.g:237:2: ( (n= variable ( COMMA n1= variable )* )? )
            // ../Compilador/Fast.g:237:3: (n= variable ( COMMA n1= variable )* )?
            {
             amap = new HashMap<String,String>(); 
            // ../Compilador/Fast.g:238:2: (n= variable ( COMMA n1= variable )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==NAME) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../Compilador/Fast.g:238:4: n= variable ( COMMA n1= variable )*
                    {
                    pushFollow(FOLLOW_variable_in_arglist1593);
                    n=variable();

                    state._fsp--;

                    amap.put(n, s.get_type(n));
                    // ../Compilador/Fast.g:238:44: ( COMMA n1= variable )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==COMMA) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../Compilador/Fast.g:238:46: COMMA n1= variable
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_arglist1598); 
                    	    pushFollow(FOLLOW_variable_in_arglist1602);
                    	    n1=variable();

                    	    state._fsp--;

                    	    amap.put(n1, s.get_type(n1));

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
        }
        return amap;
    }
    // $ANTLR end "arglist"


    // $ANTLR start "variable"
    // ../Compilador/Fast.g:241:1: variable returns [ String name ] : (n= NAME | chestaccess );
    public final String variable() throws RecognitionException {
        String name = null;

        Token n=null;

        try {
            // ../Compilador/Fast.g:242:2: (n= NAME | chestaccess )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==NAME) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==RPAREN||(LA26_1>=COMMA && LA26_1<=SEMI)||(LA26_1>=PLUS && LA26_1<=SLASH)||(LA26_1>=LESS && LA26_1<=GREATER)||LA26_1==PERCENT||(LA26_1>=EQUAL && LA26_1<=OR)||LA26_1==THEN) ) {
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
                    // ../Compilador/Fast.g:242:4: n= NAME
                    {
                    n=(Token)match(input,NAME,FOLLOW_NAME_in_variable1627); 
                     name = n.getText(); g.loadVariable(n.getText(), s.get_type(n.getText())); 

                    }
                    break;
                case 2 :
                    // ../Compilador/Fast.g:243:4: chestaccess
                    {
                    pushFollow(FOLLOW_chestaccess_in_variable1634);
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
        }
        return name;
    }
    // $ANTLR end "variable"


    // $ANTLR start "number"
    // ../Compilador/Fast.g:246:1: number returns [ String type ] : (inteiro= INT | real= FLOAT );
    public final String number() throws RecognitionException {
        String type = null;

        Token inteiro=null;
        Token real=null;

        try {
            // ../Compilador/Fast.g:247:2: (inteiro= INT | real= FLOAT )
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
                    // ../Compilador/Fast.g:247:4: inteiro= INT
                    {
                    inteiro=(Token)match(input,INT,FOLLOW_INT_in_number1652); 
                     type = "Integer"; g.pushConstant(inteiro.getText());

                    }
                    break;
                case 2 :
                    // ../Compilador/Fast.g:248:4: real= FLOAT
                    {
                    real=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_number1661); 
                     type = "Real"; g.pushConstant(real.getText());

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return type;
    }
    // $ANTLR end "number"


    // $ANTLR start "string"
    // ../Compilador/Fast.g:251:1: string returns [ String type ] : strg= NORMALSTRING ;
    public final String string() throws RecognitionException {
        String type = null;

        Token strg=null;

        try {
            // ../Compilador/Fast.g:252:2: (strg= NORMALSTRING )
            // ../Compilador/Fast.g:252:4: strg= NORMALSTRING
            {
            strg=(Token)match(input,NORMALSTRING,FOLLOW_NORMALSTRING_in_string1680); 
             type = "String"; g.pushConstant(strg.getText()); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return type;
    }
    // $ANTLR end "string"


    // $ANTLR start "def_print"
    // ../Compilador/Fast.g:255:1: def_print returns [ String type ] : PRINT LPAREN t= term RPAREN ;
    public final String def_print() throws RecognitionException {
        String type = null;

        String t = null;


        try {
            // ../Compilador/Fast.g:256:2: ( PRINT LPAREN t= term RPAREN )
            // ../Compilador/Fast.g:256:4: PRINT LPAREN t= term RPAREN
            {
            g.pushPrint();
            match(input,PRINT,FOLLOW_PRINT_in_def_print1702); 
            match(input,LPAREN,FOLLOW_LPAREN_in_def_print1704); 
            pushFollow(FOLLOW_term_in_def_print1708);
            t=term();

            state._fsp--;

            match(input,RPAREN,FOLLOW_RPAREN_in_def_print1710); 
            g.pushInvokePrint(t);
            		 type = t;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return type;
    }
    // $ANTLR end "def_print"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA1_eotS =
        "\12\uffff";
    static final String DFA1_eofS =
        "\12\uffff";
    static final String DFA1_minS =
        "\1\55\6\66\1\uffff\1\4\1\uffff";
    static final String DFA1_maxS =
        "\7\66\1\uffff\1\12\1\uffff";
    static final String DFA1_acceptS =
        "\7\uffff\1\2\1\uffff\1\1";
    static final String DFA1_specialS =
        "\12\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\7\1\uffff\1\1\1\2\1\3\1\6\1\5\1\4\2\7",
            "\1\10",
            "\1\10",
            "\1\10",
            "\1\10",
            "\1\10",
            "\1\10",
            "",
            "\1\7\4\uffff\2\11",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
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
            return "()* loopback of 103:5: ( vardecl SEMI )*";
        }
    }
    static final String DFA4_eotS =
        "\13\uffff";
    static final String DFA4_eofS =
        "\13\uffff";
    static final String DFA4_minS =
        "\1\42\1\4\11\uffff";
    static final String DFA4_maxS =
        "\1\66\1\23\11\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\1\4\1\5\1\6\1\10\1\11\1\1\1\3\1\7";
    static final String DFA4_specialS =
        "\13\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\6\1\4\1\3\7\uffff\1\5\2\uffff\6\2\1\7\1\1",
            "\1\11\6\uffff\1\12\7\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
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
            return "113:1: weakstat returns [ String type ] : ( varatrib SEMI | vardecl SEMI | funccall SEMI | def_if | def_while | t= def_return SEMI | chestaccess SEMI | def_repeat | def_print SEMI );";
        }
    }
 

    public static final BitSet FOLLOW_vardecl_in_fast691 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_fast693 = new BitSet(new long[]{0x007FA00000000000L});
    public static final BitSet FOLLOW_stat_in_fast697 = new BitSet(new long[]{0x007FA00000000002L});
    public static final BitSet FOLLOW_def_func_in_stat712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_chest_in_stat720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funccall_in_stat727 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_stat729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_print_in_stat734 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_stat736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varatrib_in_weakstat751 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_weakstat753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vardecl_in_weakstat759 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_weakstat765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funccall_in_weakstat771 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_weakstat773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_if_in_weakstat779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_while_in_weakstat788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_return_in_weakstat799 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_weakstat803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chestaccess_in_weakstat809 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_weakstat811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_repeat_in_weakstat820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_print_in_weakstat825 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_weakstat827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_varatrib842 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ASSIGN_in_varatrib844 = new BitSet(new long[]{0x03C00000E0002000L});
    public static final BitSet FOLLOW_logic_op_expr_in_varatrib848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_vardecl865 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_NAME_in_vardecl869 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_vardecl878 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_NAME_in_vardecl882 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_NAME_in_funccall907 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_funccall909 = new BitSet(new long[]{0x0040000000000020L});
    public static final BitSet FOLLOW_arglist_in_funccall913 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_funccall915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_def_func933 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_NAME_in_def_func937 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_def_func939 = new BitSet(new long[]{0x001F800000000020L});
    public static final BitSet FOLLOW_typedarglist_in_def_func943 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_def_func945 = new BitSet(new long[]{0x007FB81C00000000L});
    public static final BitSet FOLLOW_weakstat_in_def_func956 = new BitSet(new long[]{0x007FB81C00000000L});
    public static final BitSet FOLLOW_END_in_def_func965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_def_if978 = new BitSet(new long[]{0x03C00000E0002000L});
    public static final BitSet FOLLOW_logic_op_expr_in_def_if982 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_THEN_in_def_if986 = new BitSet(new long[]{0x007FB83C00000000L});
    public static final BitSet FOLLOW_weakstat_in_def_if991 = new BitSet(new long[]{0x007FB83C00000000L});
    public static final BitSet FOLLOW_END_in_def_if1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_def_if1009 = new BitSet(new long[]{0x007FB81C00000000L});
    public static final BitSet FOLLOW_weakstat_in_def_if1011 = new BitSet(new long[]{0x007FB81C00000000L});
    public static final BitSet FOLLOW_END_in_def_if1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEAT_in_def_repeat1036 = new BitSet(new long[]{0x007FB09C00000000L});
    public static final BitSet FOLLOW_weakstat_in_def_repeat1038 = new BitSet(new long[]{0x007FB09C00000000L});
    public static final BitSet FOLLOW_UNTIL_in_def_repeat1041 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_def_repeat1043 = new BitSet(new long[]{0x03C00000E0002000L});
    public static final BitSet FOLLOW_logic_op_expr_in_def_repeat1045 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_def_repeat1047 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_END_in_def_repeat1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHEST_in_def_chest1061 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_NAME_in_def_chest1063 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_in_def_chest1065 = new BitSet(new long[]{0x007FA80000000000L});
    public static final BitSet FOLLOW_vardecl_in_def_chest1069 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_def_chest1071 = new BitSet(new long[]{0x007FA80000000000L});
    public static final BitSet FOLLOW_funccall_in_def_chest1075 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_def_chest1077 = new BitSet(new long[]{0x007FA80000000000L});
    public static final BitSet FOLLOW_END_in_def_chest1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_def_while1097 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_def_while1099 = new BitSet(new long[]{0x03C00000E0002000L});
    public static final BitSet FOLLOW_logic_op_expr_in_def_while1103 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_def_while1107 = new BitSet(new long[]{0x007FB81C00000000L});
    public static final BitSet FOLLOW_weakstat_in_def_while1112 = new BitSet(new long[]{0x007FB81C00000000L});
    public static final BitSet FOLLOW_END_in_def_while1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_INT_in_type1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_REAL_in_type1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_STRING_in_type1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_BOOL_in_type1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_VOID_in_type1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_CHAIN_in_type1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_term1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funccall_in_term1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_term1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_term1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unary_op_expr1247 = new BitSet(new long[]{0x03C0000020002000L});
    public static final BitSet FOLLOW_term_in_unary_op_expr1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_op_expr_in_strong_op_expr1279 = new BitSet(new long[]{0x000000000010C002L});
    public static final BitSet FOLLOW_set_in_strong_op_expr1289 = new BitSet(new long[]{0x03C0000020002000L});
    public static final BitSet FOLLOW_unary_op_expr_in_strong_op_expr1305 = new BitSet(new long[]{0x000000000010C002L});
    public static final BitSet FOLLOW_strong_op_expr_in_weak_op_expr1330 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_set_in_weak_op_expr1338 = new BitSet(new long[]{0x03C0000020002000L});
    public static final BitSet FOLLOW_strong_op_expr_in_weak_op_expr1350 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_FALSE_in_weak_op_expr1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_weak_op_expr1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_weak_op_expr_in_relational_op_expr1394 = new BitSet(new long[]{0x0000000007860002L});
    public static final BitSet FOLLOW_set_in_relational_op_expr1402 = new BitSet(new long[]{0x03C00000E0002000L});
    public static final BitSet FOLLOW_weak_op_expr_in_relational_op_expr1430 = new BitSet(new long[]{0x0000000007860002L});
    public static final BitSet FOLLOW_relational_op_expr_in_logic_op_expr1454 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_set_in_logic_op_expr1462 = new BitSet(new long[]{0x03C00000E0002000L});
    public static final BitSet FOLLOW_relational_op_expr_in_logic_op_expr1474 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_type_in_typedarglist1504 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_NAME_in_typedarglist1508 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_typedarglist1513 = new BitSet(new long[]{0x001F800000000000L});
    public static final BitSet FOLLOW_type_in_typedarglist1517 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_NAME_in_typedarglist1521 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_NAME_in_chestaccess1541 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_chestaccess1545 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_NAME_in_chestaccess1547 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_RETURN_in_def_return1566 = new BitSet(new long[]{0x03C00000E0002000L});
    public static final BitSet FOLLOW_logic_op_expr_in_def_return1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_arglist1593 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_arglist1598 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_variable_in_arglist1602 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_NAME_in_variable1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chestaccess_in_variable1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_number1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_number1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORMALSTRING_in_string1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_def_print1702 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_def_print1704 = new BitSet(new long[]{0x03C0000020002000L});
    public static final BitSet FOLLOW_term_in_def_print1708 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_def_print1710 = new BitSet(new long[]{0x0000000000000002L});

}