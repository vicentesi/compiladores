// $ANTLR 3.3 Nov 30, 2010 12:45:30 /home/cesar/UFSC/Compiladores/FINAL/javax.g 2011-05-12 20:13:02

	package Tools;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class javaxParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SEMI", "NAME", "ASSIGN", "COMMA", "LPAREN", "RPAREN", "DOSTAT", "ENDSTAT", "IFSTAT", "THENSTAT", "ELSEIFSTAT", "ELSESTAT", "FORSTAT", "INSTAT", "REPEATSTAT", "UNTILSTAT", "CHESTSTAT", "WITHSTAT", "TYPE", "DOT", "RETURNSTAT", "PLUS", "MINUS", "STAR", "SLASH", "PERCENT", "POWER", "LESS", "TO", "LESSEQUAL", "GREATER", "GREATEREQUAL", "EQUAL", "AND", "OR", "NOTEQUAL", "NOT", "INT", "FLOAT", "HEX", "NORMALSTRING", "LBRACK", "RBRACK", "COLON", "LCURLY", "RCURLY", "EscapeSequence", "WS", "COMMENT", "LINE_COMMENT", "'false'", "'true'"
    };
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

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "chunk", "number", "arglist", "defchest", "expr", 
        "defrepeat", "unop", "defreturn", "chestaccess", "typedarglist", 
        "deffunc", "binop", "vardecl", "string", "block", "weakstat", "funccall", 
        "deffor", "type", "stat", "varatrib", "defif"
    };
    public static final boolean[] decisionCanBacktrack = new boolean[] {
        false, // invalid decision
        false, false, false, false, false, false, false, false, false, false, 
            false, false, false, false, false, false, false
    };

     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public javaxParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public javaxParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public javaxParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return javaxParser.tokenNames; }
    public String getGrammarFileName() { return "/home/cesar/UFSC/Compiladores/FINAL/javax.g"; }


    public static class chunk_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "chunk"
    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:22:1: chunk : ( stat ( SEMI )? )+ ;
    public final javaxParser.chunk_return chunk() throws RecognitionException {
        javaxParser.chunk_return retval = new javaxParser.chunk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI2=null;
        javaxParser.stat_return stat1 = null;


        Object SEMI2_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "chunk");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(22, 1);

        try {
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:22:7: ( ( stat ( SEMI )? )+ )
            dbg.enterAlt(1);

            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:22:9: ( stat ( SEMI )? )+
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(22,9);
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:22:9: ( stat ( SEMI )? )+
            int cnt2=0;
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==NAME||LA2_0==IFSTAT||LA2_0==FORSTAT||LA2_0==REPEATSTAT||LA2_0==CHESTSTAT||LA2_0==TYPE||LA2_0==RETURNSTAT) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:22:10: stat ( SEMI )?
            	    {
            	    dbg.location(22,10);
            	    pushFollow(FOLLOW_stat_in_chunk55);
            	    stat1=stat();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stat1.getTree());
            	    dbg.location(22,15);
            	    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:22:15: ( SEMI )?
            	    int alt1=2;
            	    try { dbg.enterSubRule(1);
            	    try { dbg.enterDecision(1, decisionCanBacktrack[1]);

            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==SEMI) ) {
            	        alt1=1;
            	    }
            	    } finally {dbg.exitDecision(1);}

            	    switch (alt1) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:22:16: SEMI
            	            {
            	            dbg.location(22,16);
            	            SEMI2=(Token)match(input,SEMI,FOLLOW_SEMI_in_chunk58); 
            	            SEMI2_tree = (Object)adaptor.create(SEMI2);
            	            adaptor.addChild(root_0, SEMI2_tree);


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(1);}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt2++;
            } while (true);
            } finally {dbg.exitSubRule(2);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(22, 24);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "chunk");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "chunk"

    public static class stat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stat"
    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:24:1: stat : ( weakstat | deffunc | defchest );
    public final javaxParser.stat_return stat() throws RecognitionException {
        javaxParser.stat_return retval = new javaxParser.stat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        javaxParser.weakstat_return weakstat3 = null;

        javaxParser.deffunc_return deffunc4 = null;

        javaxParser.defchest_return defchest5 = null;



        try { dbg.enterRule(getGrammarFileName(), "stat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(24, 1);

        try {
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:24:6: ( weakstat | deffunc | defchest )
            int alt3=3;
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            switch ( input.LA(1) ) {
            case NAME:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==ASSIGN||LA3_1==LPAREN||LA3_1==DOT) ) {
                    alt3=1;
                }
                else if ( (LA3_1==NAME) ) {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==LPAREN) ) {
                        alt3=2;
                    }
                    else if ( (LA3_5==SEMI||LA3_5==COMMA) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case TYPE:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==NAME) ) {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==LPAREN) ) {
                        alt3=2;
                    }
                    else if ( (LA3_5==SEMI||LA3_5==COMMA) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case IFSTAT:
            case FORSTAT:
            case REPEATSTAT:
            case RETURNSTAT:
                {
                alt3=1;
                }
                break;
            case CHESTSTAT:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:24:9: weakstat
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(24,9);
                    pushFollow(FOLLOW_weakstat_in_stat71);
                    weakstat3=weakstat();

                    state._fsp--;

                    adaptor.addChild(root_0, weakstat3.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:25:2: deffunc
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(25,2);
                    pushFollow(FOLLOW_deffunc_in_stat76);
                    deffunc4=deffunc();

                    state._fsp--;

                    adaptor.addChild(root_0, deffunc4.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:26:2: defchest
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(26,2);
                    pushFollow(FOLLOW_defchest_in_stat83);
                    defchest5=defchest();

                    state._fsp--;

                    adaptor.addChild(root_0, defchest5.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(26, 10);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stat");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "stat"

    public static class weakstat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "weakstat"
    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:28:1: weakstat : ( varatrib SEMI | vardecl SEMI | funccall SEMI | defif | deffor | defreturn SEMI | chestaccess SEMI | defrepeat );
    public final javaxParser.weakstat_return weakstat() throws RecognitionException {
        javaxParser.weakstat_return retval = new javaxParser.weakstat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI7=null;
        Token SEMI9=null;
        Token SEMI11=null;
        Token SEMI15=null;
        Token SEMI17=null;
        javaxParser.varatrib_return varatrib6 = null;

        javaxParser.vardecl_return vardecl8 = null;

        javaxParser.funccall_return funccall10 = null;

        javaxParser.defif_return defif12 = null;

        javaxParser.deffor_return deffor13 = null;

        javaxParser.defreturn_return defreturn14 = null;

        javaxParser.chestaccess_return chestaccess16 = null;

        javaxParser.defrepeat_return defrepeat18 = null;


        Object SEMI7_tree=null;
        Object SEMI9_tree=null;
        Object SEMI11_tree=null;
        Object SEMI15_tree=null;
        Object SEMI17_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "weakstat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(28, 1);

        try {
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:28:10: ( varatrib SEMI | vardecl SEMI | funccall SEMI | defif | deffor | defreturn SEMI | chestaccess SEMI | defrepeat )
            int alt4=8;
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            try {
                isCyclicDecision = true;
                alt4 = dfa4.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:29:2: varatrib SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(29,2);
                    pushFollow(FOLLOW_varatrib_in_weakstat93);
                    varatrib6=varatrib();

                    state._fsp--;

                    adaptor.addChild(root_0, varatrib6.getTree());
                    dbg.location(29,11);
                    SEMI7=(Token)match(input,SEMI,FOLLOW_SEMI_in_weakstat95); 
                    SEMI7_tree = (Object)adaptor.create(SEMI7);
                    adaptor.addChild(root_0, SEMI7_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:30:2: vardecl SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(30,2);
                    pushFollow(FOLLOW_vardecl_in_weakstat100);
                    vardecl8=vardecl();

                    state._fsp--;

                    adaptor.addChild(root_0, vardecl8.getTree());
                    dbg.location(30,14);
                    SEMI9=(Token)match(input,SEMI,FOLLOW_SEMI_in_weakstat106); 
                    SEMI9_tree = (Object)adaptor.create(SEMI9);
                    adaptor.addChild(root_0, SEMI9_tree);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:31:2: funccall SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(31,2);
                    pushFollow(FOLLOW_funccall_in_weakstat111);
                    funccall10=funccall();

                    state._fsp--;

                    adaptor.addChild(root_0, funccall10.getTree());
                    dbg.location(31,11);
                    SEMI11=(Token)match(input,SEMI,FOLLOW_SEMI_in_weakstat113); 
                    SEMI11_tree = (Object)adaptor.create(SEMI11);
                    adaptor.addChild(root_0, SEMI11_tree);


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:32:2: defif
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(32,2);
                    pushFollow(FOLLOW_defif_in_weakstat118);
                    defif12=defif();

                    state._fsp--;

                    adaptor.addChild(root_0, defif12.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:33:2: deffor
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(33,2);
                    pushFollow(FOLLOW_deffor_in_weakstat126);
                    deffor13=deffor();

                    state._fsp--;

                    adaptor.addChild(root_0, deffor13.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:34:2: defreturn SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(34,2);
                    pushFollow(FOLLOW_defreturn_in_weakstat134);
                    defreturn14=defreturn();

                    state._fsp--;

                    adaptor.addChild(root_0, defreturn14.getTree());
                    dbg.location(34,12);
                    SEMI15=(Token)match(input,SEMI,FOLLOW_SEMI_in_weakstat136); 
                    SEMI15_tree = (Object)adaptor.create(SEMI15);
                    adaptor.addChild(root_0, SEMI15_tree);


                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:35:2: chestaccess SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(35,2);
                    pushFollow(FOLLOW_chestaccess_in_weakstat141);
                    chestaccess16=chestaccess();

                    state._fsp--;

                    adaptor.addChild(root_0, chestaccess16.getTree());
                    dbg.location(35,14);
                    SEMI17=(Token)match(input,SEMI,FOLLOW_SEMI_in_weakstat143); 
                    SEMI17_tree = (Object)adaptor.create(SEMI17);
                    adaptor.addChild(root_0, SEMI17_tree);


                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:36:2: defrepeat
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(36,2);
                    pushFollow(FOLLOW_defrepeat_in_weakstat151);
                    defrepeat18=defrepeat();

                    state._fsp--;

                    adaptor.addChild(root_0, defrepeat18.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(36, 11);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "weakstat");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "weakstat"

    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:38:1: block : ( weakstat )* ;
    public final javaxParser.block_return block() throws RecognitionException {
        javaxParser.block_return retval = new javaxParser.block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        javaxParser.weakstat_return weakstat19 = null;



        try { dbg.enterRule(getGrammarFileName(), "block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(38, 1);

        try {
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:38:7: ( ( weakstat )* )
            dbg.enterAlt(1);

            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:38:9: ( weakstat )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(38,9);
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:38:9: ( weakstat )*
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5, decisionCanBacktrack[5]);

                int LA5_0 = input.LA(1);

                if ( (LA5_0==NAME||LA5_0==IFSTAT||LA5_0==FORSTAT||LA5_0==REPEATSTAT||LA5_0==TYPE||LA5_0==RETURNSTAT) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:38:10: weakstat
            	    {
            	    dbg.location(38,10);
            	    pushFollow(FOLLOW_weakstat_in_block160);
            	    weakstat19=weakstat();

            	    state._fsp--;

            	    adaptor.addChild(root_0, weakstat19.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);
            } finally {dbg.exitSubRule(5);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(38, 20);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "block"

    public static class varatrib_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varatrib"
    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:40:1: varatrib : ( NAME | chestaccess ) ASSIGN expr ;
    public final javaxParser.varatrib_return varatrib() throws RecognitionException {
        javaxParser.varatrib_return retval = new javaxParser.varatrib_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NAME20=null;
        Token ASSIGN22=null;
        javaxParser.chestaccess_return chestaccess21 = null;

        javaxParser.expr_return expr23 = null;


        Object NAME20_tree=null;
        Object ASSIGN22_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "varatrib");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(40, 1);

        try {
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:40:10: ( ( NAME | chestaccess ) ASSIGN expr )
            dbg.enterAlt(1);

            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:40:12: ( NAME | chestaccess ) ASSIGN expr
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(40,12);
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:40:12: ( NAME | chestaccess )
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==NAME) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==ASSIGN) ) {
                    alt6=1;
                }
                else if ( (LA6_1==DOT) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:40:13: NAME
                    {
                    dbg.location(40,13);
                    NAME20=(Token)match(input,NAME,FOLLOW_NAME_in_varatrib171); 
                    NAME20_tree = (Object)adaptor.create(NAME20);
                    adaptor.addChild(root_0, NAME20_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:40:20: chestaccess
                    {
                    dbg.location(40,20);
                    pushFollow(FOLLOW_chestaccess_in_varatrib175);
                    chestaccess21=chestaccess();

                    state._fsp--;

                    adaptor.addChild(root_0, chestaccess21.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(40,33);
            ASSIGN22=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_varatrib178); 
            ASSIGN22_tree = (Object)adaptor.create(ASSIGN22);
            adaptor.addChild(root_0, ASSIGN22_tree);

            dbg.location(40,40);
            pushFollow(FOLLOW_expr_in_varatrib180);
            expr23=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr23.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(40, 44);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "varatrib");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "varatrib"

    public static class vardecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vardecl"
    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:42:1: vardecl : type NAME ( COMMA NAME )* ;
    public final javaxParser.vardecl_return vardecl() throws RecognitionException {
        javaxParser.vardecl_return retval = new javaxParser.vardecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NAME25=null;
        Token COMMA26=null;
        Token NAME27=null;
        javaxParser.type_return type24 = null;


        Object NAME25_tree=null;
        Object COMMA26_tree=null;
        Object NAME27_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vardecl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(42, 1);

        try {
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:42:9: ( type NAME ( COMMA NAME )* )
            dbg.enterAlt(1);

            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:42:11: type NAME ( COMMA NAME )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(42,11);
            pushFollow(FOLLOW_type_in_vardecl188);
            type24=type();

            state._fsp--;

            adaptor.addChild(root_0, type24.getTree());
            dbg.location(42,16);
            NAME25=(Token)match(input,NAME,FOLLOW_NAME_in_vardecl190); 
            NAME25_tree = (Object)adaptor.create(NAME25);
            adaptor.addChild(root_0, NAME25_tree);

            dbg.location(42,20);
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:42:20: ( COMMA NAME )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==COMMA) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:42:21: COMMA NAME
            	    {
            	    dbg.location(42,21);
            	    COMMA26=(Token)match(input,COMMA,FOLLOW_COMMA_in_vardecl192); 
            	    COMMA26_tree = (Object)adaptor.create(COMMA26);
            	    adaptor.addChild(root_0, COMMA26_tree);

            	    dbg.location(42,27);
            	    NAME27=(Token)match(input,NAME,FOLLOW_NAME_in_vardecl194); 
            	    NAME27_tree = (Object)adaptor.create(NAME27);
            	    adaptor.addChild(root_0, NAME27_tree);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(42, 33);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vardecl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vardecl"

    public static class funccall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funccall"
    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:44:1: funccall : NAME LPAREN arglist RPAREN ;
    public final javaxParser.funccall_return funccall() throws RecognitionException {
        javaxParser.funccall_return retval = new javaxParser.funccall_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NAME28=null;
        Token LPAREN29=null;
        Token RPAREN31=null;
        javaxParser.arglist_return arglist30 = null;


        Object NAME28_tree=null;
        Object LPAREN29_tree=null;
        Object RPAREN31_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "funccall");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(44, 1);

        try {
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:44:10: ( NAME LPAREN arglist RPAREN )
            dbg.enterAlt(1);

            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:44:12: NAME LPAREN arglist RPAREN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(44,12);
            NAME28=(Token)match(input,NAME,FOLLOW_NAME_in_funccall204); 
            NAME28_tree = (Object)adaptor.create(NAME28);
            adaptor.addChild(root_0, NAME28_tree);

            dbg.location(44,17);
            LPAREN29=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funccall206); 
            LPAREN29_tree = (Object)adaptor.create(LPAREN29);
            adaptor.addChild(root_0, LPAREN29_tree);

            dbg.location(44,24);
            pushFollow(FOLLOW_arglist_in_funccall208);
            arglist30=arglist();

            state._fsp--;

            adaptor.addChild(root_0, arglist30.getTree());
            dbg.location(44,32);
            RPAREN31=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funccall210); 
            RPAREN31_tree = (Object)adaptor.create(RPAREN31);
            adaptor.addChild(root_0, RPAREN31_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(44, 38);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "funccall");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "funccall"

    public static class deffunc_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "deffunc"
    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:46:1: deffunc : type NAME LPAREN typedarglist RPAREN DOSTAT block ENDSTAT ;
    public final javaxParser.deffunc_return deffunc() throws RecognitionException {
        javaxParser.deffunc_return retval = new javaxParser.deffunc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NAME33=null;
        Token LPAREN34=null;
        Token RPAREN36=null;
        Token DOSTAT37=null;
        Token ENDSTAT39=null;
        javaxParser.type_return type32 = null;

        javaxParser.typedarglist_return typedarglist35 = null;

        javaxParser.block_return block38 = null;


        Object NAME33_tree=null;
        Object LPAREN34_tree=null;
        Object RPAREN36_tree=null;
        Object DOSTAT37_tree=null;
        Object ENDSTAT39_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "deffunc");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(46, 1);

        try {
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:46:9: ( type NAME LPAREN typedarglist RPAREN DOSTAT block ENDSTAT )
            dbg.enterAlt(1);

            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:46:11: type NAME LPAREN typedarglist RPAREN DOSTAT block ENDSTAT
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(46,11);
            pushFollow(FOLLOW_type_in_deffunc218);
            type32=type();

            state._fsp--;

            adaptor.addChild(root_0, type32.getTree());
            dbg.location(46,16);
            NAME33=(Token)match(input,NAME,FOLLOW_NAME_in_deffunc220); 
            NAME33_tree = (Object)adaptor.create(NAME33);
            adaptor.addChild(root_0, NAME33_tree);

            dbg.location(46,21);
            LPAREN34=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_deffunc222); 
            LPAREN34_tree = (Object)adaptor.create(LPAREN34);
            adaptor.addChild(root_0, LPAREN34_tree);

            dbg.location(46,28);
            pushFollow(FOLLOW_typedarglist_in_deffunc224);
            typedarglist35=typedarglist();

            state._fsp--;

            adaptor.addChild(root_0, typedarglist35.getTree());
            dbg.location(46,41);
            RPAREN36=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_deffunc226); 
            RPAREN36_tree = (Object)adaptor.create(RPAREN36);
            adaptor.addChild(root_0, RPAREN36_tree);

            dbg.location(46,48);
            DOSTAT37=(Token)match(input,DOSTAT,FOLLOW_DOSTAT_in_deffunc228); 
            DOSTAT37_tree = (Object)adaptor.create(DOSTAT37);
            adaptor.addChild(root_0, DOSTAT37_tree);

            dbg.location(46,55);
            pushFollow(FOLLOW_block_in_deffunc230);
            block38=block();

            state._fsp--;

            adaptor.addChild(root_0, block38.getTree());
            dbg.location(46,61);
            ENDSTAT39=(Token)match(input,ENDSTAT,FOLLOW_ENDSTAT_in_deffunc232); 
            ENDSTAT39_tree = (Object)adaptor.create(ENDSTAT39);
            adaptor.addChild(root_0, ENDSTAT39_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(46, 68);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "deffunc");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "deffunc"

    public static class defif_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defif"
    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:48:1: defif : IFSTAT expr THENSTAT block ( ELSEIFSTAT expr THENSTAT block )* ( ELSESTAT block )? ENDSTAT ;
    public final javaxParser.defif_return defif() throws RecognitionException {
        javaxParser.defif_return retval = new javaxParser.defif_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IFSTAT40=null;
        Token THENSTAT42=null;
        Token ELSEIFSTAT44=null;
        Token THENSTAT46=null;
        Token ELSESTAT48=null;
        Token ENDSTAT50=null;
        javaxParser.expr_return expr41 = null;

        javaxParser.block_return block43 = null;

        javaxParser.expr_return expr45 = null;

        javaxParser.block_return block47 = null;

        javaxParser.block_return block49 = null;


        Object IFSTAT40_tree=null;
        Object THENSTAT42_tree=null;
        Object ELSEIFSTAT44_tree=null;
        Object THENSTAT46_tree=null;
        Object ELSESTAT48_tree=null;
        Object ENDSTAT50_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "defif");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(48, 1);

        try {
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:48:7: ( IFSTAT expr THENSTAT block ( ELSEIFSTAT expr THENSTAT block )* ( ELSESTAT block )? ENDSTAT )
            dbg.enterAlt(1);

            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:48:9: IFSTAT expr THENSTAT block ( ELSEIFSTAT expr THENSTAT block )* ( ELSESTAT block )? ENDSTAT
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(48,9);
            IFSTAT40=(Token)match(input,IFSTAT,FOLLOW_IFSTAT_in_defif240); 
            IFSTAT40_tree = (Object)adaptor.create(IFSTAT40);
            adaptor.addChild(root_0, IFSTAT40_tree);

            dbg.location(48,16);
            pushFollow(FOLLOW_expr_in_defif242);
            expr41=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr41.getTree());
            dbg.location(48,21);
            THENSTAT42=(Token)match(input,THENSTAT,FOLLOW_THENSTAT_in_defif244); 
            THENSTAT42_tree = (Object)adaptor.create(THENSTAT42);
            adaptor.addChild(root_0, THENSTAT42_tree);

            dbg.location(48,30);
            pushFollow(FOLLOW_block_in_defif246);
            block43=block();

            state._fsp--;

            adaptor.addChild(root_0, block43.getTree());
            dbg.location(48,36);
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:48:36: ( ELSEIFSTAT expr THENSTAT block )*
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                int LA8_0 = input.LA(1);

                if ( (LA8_0==ELSEIFSTAT) ) {
                    alt8=1;
                }


                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:48:37: ELSEIFSTAT expr THENSTAT block
            	    {
            	    dbg.location(48,37);
            	    ELSEIFSTAT44=(Token)match(input,ELSEIFSTAT,FOLLOW_ELSEIFSTAT_in_defif249); 
            	    ELSEIFSTAT44_tree = (Object)adaptor.create(ELSEIFSTAT44);
            	    adaptor.addChild(root_0, ELSEIFSTAT44_tree);

            	    dbg.location(48,48);
            	    pushFollow(FOLLOW_expr_in_defif251);
            	    expr45=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr45.getTree());
            	    dbg.location(48,53);
            	    THENSTAT46=(Token)match(input,THENSTAT,FOLLOW_THENSTAT_in_defif253); 
            	    THENSTAT46_tree = (Object)adaptor.create(THENSTAT46);
            	    adaptor.addChild(root_0, THENSTAT46_tree);

            	    dbg.location(48,62);
            	    pushFollow(FOLLOW_block_in_defif255);
            	    block47=block();

            	    state._fsp--;

            	    adaptor.addChild(root_0, block47.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);
            } finally {dbg.exitSubRule(8);}

            dbg.location(48,70);
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:48:70: ( ELSESTAT block )?
            int alt9=2;
            try { dbg.enterSubRule(9);
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==ELSESTAT) ) {
                alt9=1;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:48:71: ELSESTAT block
                    {
                    dbg.location(48,71);
                    ELSESTAT48=(Token)match(input,ELSESTAT,FOLLOW_ELSESTAT_in_defif260); 
                    ELSESTAT48_tree = (Object)adaptor.create(ELSESTAT48);
                    adaptor.addChild(root_0, ELSESTAT48_tree);

                    dbg.location(48,80);
                    pushFollow(FOLLOW_block_in_defif262);
                    block49=block();

                    state._fsp--;

                    adaptor.addChild(root_0, block49.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}

            dbg.location(48,88);
            ENDSTAT50=(Token)match(input,ENDSTAT,FOLLOW_ENDSTAT_in_defif266); 
            ENDSTAT50_tree = (Object)adaptor.create(ENDSTAT50);
            adaptor.addChild(root_0, ENDSTAT50_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(48, 95);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "defif");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "defif"

    public static class deffor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "deffor"
    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:50:1: deffor : FORSTAT NAME INSTAT expr DOSTAT block ENDSTAT ;
    public final javaxParser.deffor_return deffor() throws RecognitionException {
        javaxParser.deffor_return retval = new javaxParser.deffor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FORSTAT51=null;
        Token NAME52=null;
        Token INSTAT53=null;
        Token DOSTAT55=null;
        Token ENDSTAT57=null;
        javaxParser.expr_return expr54 = null;

        javaxParser.block_return block56 = null;


        Object FORSTAT51_tree=null;
        Object NAME52_tree=null;
        Object INSTAT53_tree=null;
        Object DOSTAT55_tree=null;
        Object ENDSTAT57_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "deffor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(50, 1);

        try {
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:50:8: ( FORSTAT NAME INSTAT expr DOSTAT block ENDSTAT )
            dbg.enterAlt(1);

            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:50:10: FORSTAT NAME INSTAT expr DOSTAT block ENDSTAT
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(50,10);
            FORSTAT51=(Token)match(input,FORSTAT,FOLLOW_FORSTAT_in_deffor274); 
            FORSTAT51_tree = (Object)adaptor.create(FORSTAT51);
            adaptor.addChild(root_0, FORSTAT51_tree);

            dbg.location(50,18);
            NAME52=(Token)match(input,NAME,FOLLOW_NAME_in_deffor276); 
            NAME52_tree = (Object)adaptor.create(NAME52);
            adaptor.addChild(root_0, NAME52_tree);

            dbg.location(50,23);
            INSTAT53=(Token)match(input,INSTAT,FOLLOW_INSTAT_in_deffor278); 
            INSTAT53_tree = (Object)adaptor.create(INSTAT53);
            adaptor.addChild(root_0, INSTAT53_tree);

            dbg.location(50,30);
            pushFollow(FOLLOW_expr_in_deffor280);
            expr54=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr54.getTree());
            dbg.location(50,35);
            DOSTAT55=(Token)match(input,DOSTAT,FOLLOW_DOSTAT_in_deffor282); 
            DOSTAT55_tree = (Object)adaptor.create(DOSTAT55);
            adaptor.addChild(root_0, DOSTAT55_tree);

            dbg.location(50,42);
            pushFollow(FOLLOW_block_in_deffor284);
            block56=block();

            state._fsp--;

            adaptor.addChild(root_0, block56.getTree());
            dbg.location(50,48);
            ENDSTAT57=(Token)match(input,ENDSTAT,FOLLOW_ENDSTAT_in_deffor286); 
            ENDSTAT57_tree = (Object)adaptor.create(ENDSTAT57);
            adaptor.addChild(root_0, ENDSTAT57_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(50, 55);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "deffor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "deffor"

    public static class defrepeat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defrepeat"
    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:52:1: defrepeat : REPEATSTAT block UNTILSTAT expr ENDSTAT ;
    public final javaxParser.defrepeat_return defrepeat() throws RecognitionException {
        javaxParser.defrepeat_return retval = new javaxParser.defrepeat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REPEATSTAT58=null;
        Token UNTILSTAT60=null;
        Token ENDSTAT62=null;
        javaxParser.block_return block59 = null;

        javaxParser.expr_return expr61 = null;


        Object REPEATSTAT58_tree=null;
        Object UNTILSTAT60_tree=null;
        Object ENDSTAT62_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "defrepeat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(52, 1);

        try {
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:52:11: ( REPEATSTAT block UNTILSTAT expr ENDSTAT )
            dbg.enterAlt(1);

            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:52:13: REPEATSTAT block UNTILSTAT expr ENDSTAT
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(52,13);
            REPEATSTAT58=(Token)match(input,REPEATSTAT,FOLLOW_REPEATSTAT_in_defrepeat294); 
            REPEATSTAT58_tree = (Object)adaptor.create(REPEATSTAT58);
            adaptor.addChild(root_0, REPEATSTAT58_tree);

            dbg.location(52,24);
            pushFollow(FOLLOW_block_in_defrepeat296);
            block59=block();

            state._fsp--;

            adaptor.addChild(root_0, block59.getTree());
            dbg.location(52,30);
            UNTILSTAT60=(Token)match(input,UNTILSTAT,FOLLOW_UNTILSTAT_in_defrepeat298); 
            UNTILSTAT60_tree = (Object)adaptor.create(UNTILSTAT60);
            adaptor.addChild(root_0, UNTILSTAT60_tree);

            dbg.location(52,40);
            pushFollow(FOLLOW_expr_in_defrepeat300);
            expr61=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr61.getTree());
            dbg.location(52,45);
            ENDSTAT62=(Token)match(input,ENDSTAT,FOLLOW_ENDSTAT_in_defrepeat302); 
            ENDSTAT62_tree = (Object)adaptor.create(ENDSTAT62);
            adaptor.addChild(root_0, ENDSTAT62_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(52, 52);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "defrepeat");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "defrepeat"

    public static class defchest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defchest"
    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:54:1: defchest : CHESTSTAT NAME WITHSTAT ( vardecl SEMI )* ENDSTAT ;
    public final javaxParser.defchest_return defchest() throws RecognitionException {
        javaxParser.defchest_return retval = new javaxParser.defchest_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CHESTSTAT63=null;
        Token NAME64=null;
        Token WITHSTAT65=null;
        Token SEMI67=null;
        Token ENDSTAT68=null;
        javaxParser.vardecl_return vardecl66 = null;


        Object CHESTSTAT63_tree=null;
        Object NAME64_tree=null;
        Object WITHSTAT65_tree=null;
        Object SEMI67_tree=null;
        Object ENDSTAT68_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "defchest");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(54, 1);

        try {
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:54:10: ( CHESTSTAT NAME WITHSTAT ( vardecl SEMI )* ENDSTAT )
            dbg.enterAlt(1);

            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:54:12: CHESTSTAT NAME WITHSTAT ( vardecl SEMI )* ENDSTAT
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(54,12);
            CHESTSTAT63=(Token)match(input,CHESTSTAT,FOLLOW_CHESTSTAT_in_defchest310); 
            CHESTSTAT63_tree = (Object)adaptor.create(CHESTSTAT63);
            adaptor.addChild(root_0, CHESTSTAT63_tree);

            dbg.location(54,22);
            NAME64=(Token)match(input,NAME,FOLLOW_NAME_in_defchest312); 
            NAME64_tree = (Object)adaptor.create(NAME64);
            adaptor.addChild(root_0, NAME64_tree);

            dbg.location(54,27);
            WITHSTAT65=(Token)match(input,WITHSTAT,FOLLOW_WITHSTAT_in_defchest314); 
            WITHSTAT65_tree = (Object)adaptor.create(WITHSTAT65);
            adaptor.addChild(root_0, WITHSTAT65_tree);

            dbg.location(54,36);
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:54:36: ( vardecl SEMI )*
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=2;
                try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                int LA10_0 = input.LA(1);

                if ( (LA10_0==NAME||LA10_0==TYPE) ) {
                    alt10=1;
                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:54:37: vardecl SEMI
            	    {
            	    dbg.location(54,37);
            	    pushFollow(FOLLOW_vardecl_in_defchest317);
            	    vardecl66=vardecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, vardecl66.getTree());
            	    dbg.location(54,45);
            	    SEMI67=(Token)match(input,SEMI,FOLLOW_SEMI_in_defchest319); 
            	    SEMI67_tree = (Object)adaptor.create(SEMI67);
            	    adaptor.addChild(root_0, SEMI67_tree);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);
            } finally {dbg.exitSubRule(10);}

            dbg.location(54,52);
            ENDSTAT68=(Token)match(input,ENDSTAT,FOLLOW_ENDSTAT_in_defchest323); 
            ENDSTAT68_tree = (Object)adaptor.create(ENDSTAT68);
            adaptor.addChild(root_0, ENDSTAT68_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(54, 59);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "defchest");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "defchest"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:56:1: type : ( TYPE | NAME );
    public final javaxParser.type_return type() throws RecognitionException {
        javaxParser.type_return retval = new javaxParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set69=null;

        Object set69_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(56, 1);

        try {
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:56:6: ( TYPE | NAME )
            dbg.enterAlt(1);

            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(56,6);
            set69=(Token)input.LT(1);
            if ( input.LA(1)==NAME||input.LA(1)==TYPE ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set69));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(56, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "type"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:58:1: expr : ( 'false' | 'true' | number | string | funccall | unop | chestaccess | NAME ) ( binop expr )* ;
    public final javaxParser.expr_return expr() throws RecognitionException {
        javaxParser.expr_return retval = new javaxParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal70=null;
        Token string_literal71=null;
        Token NAME77=null;
        javaxParser.number_return number72 = null;

        javaxParser.string_return string73 = null;

        javaxParser.funccall_return funccall74 = null;

        javaxParser.unop_return unop75 = null;

        javaxParser.chestaccess_return chestaccess76 = null;

        javaxParser.binop_return binop78 = null;

        javaxParser.expr_return expr79 = null;


        Object string_literal70_tree=null;
        Object string_literal71_tree=null;
        Object NAME77_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(58, 1);

        try {
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:58:6: ( ( 'false' | 'true' | number | string | funccall | unop | chestaccess | NAME ) ( binop expr )* )
            dbg.enterAlt(1);

            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:58:8: ( 'false' | 'true' | number | string | funccall | unop | chestaccess | NAME ) ( binop expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(58,8);
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:58:8: ( 'false' | 'true' | number | string | funccall | unop | chestaccess | NAME )
            int alt11=8;
            try { dbg.enterSubRule(11);
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            try {
                isCyclicDecision = true;
                alt11 = dfa11.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:58:9: 'false'
                    {
                    dbg.location(58,9);
                    string_literal70=(Token)match(input,54,FOLLOW_54_in_expr344); 
                    string_literal70_tree = (Object)adaptor.create(string_literal70);
                    adaptor.addChild(root_0, string_literal70_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:58:19: 'true'
                    {
                    dbg.location(58,19);
                    string_literal71=(Token)match(input,55,FOLLOW_55_in_expr348); 
                    string_literal71_tree = (Object)adaptor.create(string_literal71);
                    adaptor.addChild(root_0, string_literal71_tree);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:58:28: number
                    {
                    dbg.location(58,28);
                    pushFollow(FOLLOW_number_in_expr352);
                    number72=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number72.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:58:37: string
                    {
                    dbg.location(58,37);
                    pushFollow(FOLLOW_string_in_expr356);
                    string73=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string73.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:58:46: funccall
                    {
                    dbg.location(58,46);
                    pushFollow(FOLLOW_funccall_in_expr360);
                    funccall74=funccall();

                    state._fsp--;

                    adaptor.addChild(root_0, funccall74.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:58:57: unop
                    {
                    dbg.location(58,57);
                    pushFollow(FOLLOW_unop_in_expr364);
                    unop75=unop();

                    state._fsp--;

                    adaptor.addChild(root_0, unop75.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:58:64: chestaccess
                    {
                    dbg.location(58,64);
                    pushFollow(FOLLOW_chestaccess_in_expr368);
                    chestaccess76=chestaccess();

                    state._fsp--;

                    adaptor.addChild(root_0, chestaccess76.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:58:78: NAME
                    {
                    dbg.location(58,78);
                    NAME77=(Token)match(input,NAME,FOLLOW_NAME_in_expr372); 
                    NAME77_tree = (Object)adaptor.create(NAME77);
                    adaptor.addChild(root_0, NAME77_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(11);}

            dbg.location(58,84);
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:58:84: ( binop expr )*
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=PLUS && LA12_0<=NOTEQUAL)) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:58:85: binop expr
            	    {
            	    dbg.location(58,85);
            	    pushFollow(FOLLOW_binop_in_expr376);
            	    binop78=binop();

            	    state._fsp--;

            	    adaptor.addChild(root_0, binop78.getTree());
            	    dbg.location(58,91);
            	    pushFollow(FOLLOW_expr_in_expr378);
            	    expr79=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr79.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);
            } finally {dbg.exitSubRule(12);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(58, 97);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expr"

    public static class arglist_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arglist"
    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:60:1: arglist : ( expr ( COMMA expr )* )? ;
    public final javaxParser.arglist_return arglist() throws RecognitionException {
        javaxParser.arglist_return retval = new javaxParser.arglist_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA81=null;
        javaxParser.expr_return expr80 = null;

        javaxParser.expr_return expr82 = null;


        Object COMMA81_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "arglist");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(60, 1);

        try {
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:60:9: ( ( expr ( COMMA expr )* )? )
            dbg.enterAlt(1);

            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:60:11: ( expr ( COMMA expr )* )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(60,11);
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:60:11: ( expr ( COMMA expr )* )?
            int alt14=2;
            try { dbg.enterSubRule(14);
            try { dbg.enterDecision(14, decisionCanBacktrack[14]);

            int LA14_0 = input.LA(1);

            if ( (LA14_0==NAME||LA14_0==MINUS||(LA14_0>=NOT && LA14_0<=NORMALSTRING)||(LA14_0>=54 && LA14_0<=55)) ) {
                alt14=1;
            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:60:12: expr ( COMMA expr )*
                    {
                    dbg.location(60,12);
                    pushFollow(FOLLOW_expr_in_arglist389);
                    expr80=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr80.getTree());
                    dbg.location(60,16);
                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:60:16: ( COMMA expr )*
                    try { dbg.enterSubRule(13);

                    loop13:
                    do {
                        int alt13=2;
                        try { dbg.enterDecision(13, decisionCanBacktrack[13]);

                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==COMMA) ) {
                            alt13=1;
                        }


                        } finally {dbg.exitDecision(13);}

                        switch (alt13) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:60:17: COMMA expr
                    	    {
                    	    dbg.location(60,17);
                    	    COMMA81=(Token)match(input,COMMA,FOLLOW_COMMA_in_arglist391); 
                    	    COMMA81_tree = (Object)adaptor.create(COMMA81);
                    	    adaptor.addChild(root_0, COMMA81_tree);

                    	    dbg.location(60,23);
                    	    pushFollow(FOLLOW_expr_in_arglist393);
                    	    expr82=expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expr82.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(13);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(14);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(60, 31);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arglist");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "arglist"

    public static class typedarglist_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typedarglist"
    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:62:1: typedarglist : ( type NAME ( COMMA type NAME )* )? ;
    public final javaxParser.typedarglist_return typedarglist() throws RecognitionException {
        javaxParser.typedarglist_return retval = new javaxParser.typedarglist_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NAME84=null;
        Token COMMA85=null;
        Token NAME87=null;
        javaxParser.type_return type83 = null;

        javaxParser.type_return type86 = null;


        Object NAME84_tree=null;
        Object COMMA85_tree=null;
        Object NAME87_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "typedarglist");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(62, 1);

        try {
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:62:14: ( ( type NAME ( COMMA type NAME )* )? )
            dbg.enterAlt(1);

            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:62:16: ( type NAME ( COMMA type NAME )* )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(62,16);
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:62:16: ( type NAME ( COMMA type NAME )* )?
            int alt16=2;
            try { dbg.enterSubRule(16);
            try { dbg.enterDecision(16, decisionCanBacktrack[16]);

            int LA16_0 = input.LA(1);

            if ( (LA16_0==NAME||LA16_0==TYPE) ) {
                alt16=1;
            }
            } finally {dbg.exitDecision(16);}

            switch (alt16) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:62:17: type NAME ( COMMA type NAME )*
                    {
                    dbg.location(62,17);
                    pushFollow(FOLLOW_type_in_typedarglist406);
                    type83=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type83.getTree());
                    dbg.location(62,22);
                    NAME84=(Token)match(input,NAME,FOLLOW_NAME_in_typedarglist408); 
                    NAME84_tree = (Object)adaptor.create(NAME84);
                    adaptor.addChild(root_0, NAME84_tree);

                    dbg.location(62,26);
                    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:62:26: ( COMMA type NAME )*
                    try { dbg.enterSubRule(15);

                    loop15:
                    do {
                        int alt15=2;
                        try { dbg.enterDecision(15, decisionCanBacktrack[15]);

                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==COMMA) ) {
                            alt15=1;
                        }


                        } finally {dbg.exitDecision(15);}

                        switch (alt15) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:62:27: COMMA type NAME
                    	    {
                    	    dbg.location(62,27);
                    	    COMMA85=(Token)match(input,COMMA,FOLLOW_COMMA_in_typedarglist410); 
                    	    COMMA85_tree = (Object)adaptor.create(COMMA85);
                    	    adaptor.addChild(root_0, COMMA85_tree);

                    	    dbg.location(62,33);
                    	    pushFollow(FOLLOW_type_in_typedarglist412);
                    	    type86=type();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, type86.getTree());
                    	    dbg.location(62,38);
                    	    NAME87=(Token)match(input,NAME,FOLLOW_NAME_in_typedarglist414); 
                    	    NAME87_tree = (Object)adaptor.create(NAME87);
                    	    adaptor.addChild(root_0, NAME87_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(15);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(16);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(62, 46);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typedarglist");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "typedarglist"

    public static class chestaccess_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "chestaccess"
    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:64:1: chestaccess : NAME ( DOT NAME )+ ;
    public final javaxParser.chestaccess_return chestaccess() throws RecognitionException {
        javaxParser.chestaccess_return retval = new javaxParser.chestaccess_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NAME88=null;
        Token DOT89=null;
        Token NAME90=null;

        Object NAME88_tree=null;
        Object DOT89_tree=null;
        Object NAME90_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "chestaccess");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(64, 1);

        try {
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:64:13: ( NAME ( DOT NAME )+ )
            dbg.enterAlt(1);

            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:64:15: NAME ( DOT NAME )+
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(64,15);
            NAME88=(Token)match(input,NAME,FOLLOW_NAME_in_chestaccess426); 
            NAME88_tree = (Object)adaptor.create(NAME88);
            adaptor.addChild(root_0, NAME88_tree);

            dbg.location(64,19);
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:64:19: ( DOT NAME )+
            int cnt17=0;
            try { dbg.enterSubRule(17);

            loop17:
            do {
                int alt17=2;
                try { dbg.enterDecision(17, decisionCanBacktrack[17]);

                int LA17_0 = input.LA(1);

                if ( (LA17_0==DOT) ) {
                    alt17=1;
                }


                } finally {dbg.exitDecision(17);}

                switch (alt17) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:64:20: DOT NAME
            	    {
            	    dbg.location(64,20);
            	    DOT89=(Token)match(input,DOT,FOLLOW_DOT_in_chestaccess428); 
            	    DOT89_tree = (Object)adaptor.create(DOT89);
            	    adaptor.addChild(root_0, DOT89_tree);

            	    dbg.location(64,24);
            	    NAME90=(Token)match(input,NAME,FOLLOW_NAME_in_chestaccess430); 
            	    NAME90_tree = (Object)adaptor.create(NAME90);
            	    adaptor.addChild(root_0, NAME90_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt17++;
            } while (true);
            } finally {dbg.exitSubRule(17);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(64, 30);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "chestaccess");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "chestaccess"

    public static class defreturn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defreturn"
    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:66:1: defreturn : RETURNSTAT expr ;
    public final javaxParser.defreturn_return defreturn() throws RecognitionException {
        javaxParser.defreturn_return retval = new javaxParser.defreturn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RETURNSTAT91=null;
        javaxParser.expr_return expr92 = null;


        Object RETURNSTAT91_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "defreturn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(66, 1);

        try {
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:66:11: ( RETURNSTAT expr )
            dbg.enterAlt(1);

            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:66:13: RETURNSTAT expr
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(66,13);
            RETURNSTAT91=(Token)match(input,RETURNSTAT,FOLLOW_RETURNSTAT_in_defreturn440); 
            RETURNSTAT91_tree = (Object)adaptor.create(RETURNSTAT91);
            adaptor.addChild(root_0, RETURNSTAT91_tree);

            dbg.location(66,24);
            pushFollow(FOLLOW_expr_in_defreturn442);
            expr92=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr92.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(66, 28);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "defreturn");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "defreturn"

    public static class binop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "binop"
    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:68:1: binop : ( PLUS | MINUS | STAR | SLASH | PERCENT | POWER | LESS | TO | LESSEQUAL | GREATER | GREATEREQUAL | EQUAL | AND | OR | NOTEQUAL );
    public final javaxParser.binop_return binop() throws RecognitionException {
        javaxParser.binop_return retval = new javaxParser.binop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set93=null;

        Object set93_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "binop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(68, 1);

        try {
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:68:7: ( PLUS | MINUS | STAR | SLASH | PERCENT | POWER | LESS | TO | LESSEQUAL | GREATER | GREATEREQUAL | EQUAL | AND | OR | NOTEQUAL )
            dbg.enterAlt(1);

            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(68,7);
            set93=(Token)input.LT(1);
            if ( (input.LA(1)>=PLUS && input.LA(1)<=NOTEQUAL) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set93));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(69, 44);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "binop");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "binop"

    public static class unop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unop"
    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:71:1: unop : ( MINUS | NOT );
    public final javaxParser.unop_return unop() throws RecognitionException {
        javaxParser.unop_return retval = new javaxParser.unop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set94=null;

        Object set94_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "unop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(71, 1);

        try {
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:71:6: ( MINUS | NOT )
            dbg.enterAlt(1);

            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(71,6);
            set94=(Token)input.LT(1);
            if ( input.LA(1)==MINUS||input.LA(1)==NOT ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set94));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(71, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "unop");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "unop"

    public static class number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "number"
    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:73:1: number : ( INT | FLOAT | HEX );
    public final javaxParser.number_return number() throws RecognitionException {
        javaxParser.number_return retval = new javaxParser.number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set95=null;

        Object set95_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "number");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(73, 1);

        try {
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:73:8: ( INT | FLOAT | HEX )
            dbg.enterAlt(1);

            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(73,8);
            set95=(Token)input.LT(1);
            if ( (input.LA(1)>=INT && input.LA(1)<=HEX) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set95));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(73, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "number");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "number"

    public static class string_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "string"
    // /home/cesar/UFSC/Compiladores/FINAL/javax.g:75:1: string : NORMALSTRING ;
    public final javaxParser.string_return string() throws RecognitionException {
        javaxParser.string_return retval = new javaxParser.string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NORMALSTRING96=null;

        Object NORMALSTRING96_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "string");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(75, 1);

        try {
            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:75:8: ( NORMALSTRING )
            dbg.enterAlt(1);

            // /home/cesar/UFSC/Compiladores/FINAL/javax.g:75:10: NORMALSTRING
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(75,10);
            NORMALSTRING96=(Token)match(input,NORMALSTRING,FOLLOW_NORMALSTRING_in_string544); 
            NORMALSTRING96_tree = (Object)adaptor.create(NORMALSTRING96);
            adaptor.addChild(root_0, NORMALSTRING96_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(75, 22);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "string");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "string"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA4_eotS =
        "\14\uffff";
    static final String DFA4_eofS =
        "\14\uffff";
    static final String DFA4_minS =
        "\2\5\7\uffff\1\5\1\4\1\uffff";
    static final String DFA4_maxS =
        "\1\30\1\27\7\uffff\1\5\1\27\1\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\1\4\1\5\1\6\1\10\1\3\1\1\2\uffff\1\7";
    static final String DFA4_specialS =
        "\14\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\6\uffff\1\3\3\uffff\1\4\1\uffff\1\6\3\uffff\1\2\1\uffff"+
            "\1\5",
            "\1\2\1\10\1\uffff\1\7\16\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12",
            "\1\13\1\uffff\1\10\20\uffff\1\11",
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
            return "28:1: weakstat : ( varatrib SEMI | vardecl SEMI | funccall SEMI | defif | deffor | defreturn SEMI | chestaccess SEMI | defrepeat );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA11_eotS =
        "\12\uffff";
    static final String DFA11_eofS =
        "\12\uffff";
    static final String DFA11_minS =
        "\1\5\4\uffff\1\4\4\uffff";
    static final String DFA11_maxS =
        "\1\67\4\uffff\1\47\4\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\5\1\7\1\10";
    static final String DFA11_specialS =
        "\12\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\5\24\uffff\1\6\15\uffff\1\6\3\3\1\4\11\uffff\1\1\1\2",
            "",
            "",
            "",
            "",
            "\1\11\2\uffff\1\11\1\7\3\11\1\uffff\1\11\11\uffff\1\10\1\uffff"+
            "\17\11",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "58:8: ( 'false' | 'true' | number | string | funccall | unop | chestaccess | NAME )";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_stat_in_chunk55 = new BitSet(new long[]{0x0000000001551032L});
    public static final BitSet FOLLOW_SEMI_in_chunk58 = new BitSet(new long[]{0x0000000001551032L});
    public static final BitSet FOLLOW_weakstat_in_stat71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deffunc_in_stat76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defchest_in_stat83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varatrib_in_weakstat93 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_weakstat95 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vardecl_in_weakstat100 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_weakstat106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funccall_in_weakstat111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_weakstat113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defif_in_weakstat118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deffor_in_weakstat126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defreturn_in_weakstat134 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_weakstat136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chestaccess_in_weakstat141 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_weakstat143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defrepeat_in_weakstat151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_weakstat_in_block160 = new BitSet(new long[]{0x0000000001451022L});
    public static final BitSet FOLLOW_NAME_in_varatrib171 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_chestaccess_in_varatrib175 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ASSIGN_in_varatrib178 = new BitSet(new long[]{0x00C01F0004000020L});
    public static final BitSet FOLLOW_expr_in_varatrib180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_vardecl188 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NAME_in_vardecl190 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_COMMA_in_vardecl192 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NAME_in_vardecl194 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_NAME_in_funccall204 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_funccall206 = new BitSet(new long[]{0x00C01F0004000220L});
    public static final BitSet FOLLOW_arglist_in_funccall208 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_funccall210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_deffunc218 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NAME_in_deffunc220 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_deffunc222 = new BitSet(new long[]{0x0000000000400220L});
    public static final BitSet FOLLOW_typedarglist_in_deffunc224 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_deffunc226 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DOSTAT_in_deffunc228 = new BitSet(new long[]{0x0000000001451820L});
    public static final BitSet FOLLOW_block_in_deffunc230 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ENDSTAT_in_deffunc232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IFSTAT_in_defif240 = new BitSet(new long[]{0x00C01F0004000020L});
    public static final BitSet FOLLOW_expr_in_defif242 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_THENSTAT_in_defif244 = new BitSet(new long[]{0x000000000145D820L});
    public static final BitSet FOLLOW_block_in_defif246 = new BitSet(new long[]{0x000000000000C800L});
    public static final BitSet FOLLOW_ELSEIFSTAT_in_defif249 = new BitSet(new long[]{0x00C01F0004000020L});
    public static final BitSet FOLLOW_expr_in_defif251 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_THENSTAT_in_defif253 = new BitSet(new long[]{0x000000000145D820L});
    public static final BitSet FOLLOW_block_in_defif255 = new BitSet(new long[]{0x000000000000C800L});
    public static final BitSet FOLLOW_ELSESTAT_in_defif260 = new BitSet(new long[]{0x0000000001451820L});
    public static final BitSet FOLLOW_block_in_defif262 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ENDSTAT_in_defif266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORSTAT_in_deffor274 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NAME_in_deffor276 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_INSTAT_in_deffor278 = new BitSet(new long[]{0x00C01F0004000020L});
    public static final BitSet FOLLOW_expr_in_deffor280 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DOSTAT_in_deffor282 = new BitSet(new long[]{0x0000000001451820L});
    public static final BitSet FOLLOW_block_in_deffor284 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ENDSTAT_in_deffor286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEATSTAT_in_defrepeat294 = new BitSet(new long[]{0x00000000014D1020L});
    public static final BitSet FOLLOW_block_in_defrepeat296 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_UNTILSTAT_in_defrepeat298 = new BitSet(new long[]{0x00C01F0004000020L});
    public static final BitSet FOLLOW_expr_in_defrepeat300 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ENDSTAT_in_defrepeat302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHESTSTAT_in_defchest310 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NAME_in_defchest312 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WITHSTAT_in_defchest314 = new BitSet(new long[]{0x0000000000400820L});
    public static final BitSet FOLLOW_vardecl_in_defchest317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_defchest319 = new BitSet(new long[]{0x0000000000400820L});
    public static final BitSet FOLLOW_ENDSTAT_in_defchest323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_expr344 = new BitSet(new long[]{0x000000FFFE000002L});
    public static final BitSet FOLLOW_55_in_expr348 = new BitSet(new long[]{0x000000FFFE000002L});
    public static final BitSet FOLLOW_number_in_expr352 = new BitSet(new long[]{0x000000FFFE000002L});
    public static final BitSet FOLLOW_string_in_expr356 = new BitSet(new long[]{0x000000FFFE000002L});
    public static final BitSet FOLLOW_funccall_in_expr360 = new BitSet(new long[]{0x000000FFFE000002L});
    public static final BitSet FOLLOW_unop_in_expr364 = new BitSet(new long[]{0x000000FFFE000002L});
    public static final BitSet FOLLOW_chestaccess_in_expr368 = new BitSet(new long[]{0x000000FFFE000002L});
    public static final BitSet FOLLOW_NAME_in_expr372 = new BitSet(new long[]{0x000000FFFE000002L});
    public static final BitSet FOLLOW_binop_in_expr376 = new BitSet(new long[]{0x00C01F0004000020L});
    public static final BitSet FOLLOW_expr_in_expr378 = new BitSet(new long[]{0x000000FFFE000002L});
    public static final BitSet FOLLOW_expr_in_arglist389 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_COMMA_in_arglist391 = new BitSet(new long[]{0x00C01F0004000020L});
    public static final BitSet FOLLOW_expr_in_arglist393 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_type_in_typedarglist406 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NAME_in_typedarglist408 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_COMMA_in_typedarglist410 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_type_in_typedarglist412 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NAME_in_typedarglist414 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_NAME_in_chestaccess426 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_DOT_in_chestaccess428 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NAME_in_chestaccess430 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_RETURNSTAT_in_defreturn440 = new BitSet(new long[]{0x00C01F0004000020L});
    public static final BitSet FOLLOW_expr_in_defreturn442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_binop0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unop0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_number0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORMALSTRING_in_string544 = new BitSet(new long[]{0x0000000000000002L});

}