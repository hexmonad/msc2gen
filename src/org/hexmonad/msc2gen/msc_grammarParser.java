// $ANTLR 3.1.3 Mar 18, 2009 10:09:25 msc_grammar.g 2014-03-06 19:53:54
package org.hexmonad.msc2gen;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class msc_grammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MSC", "MSCHead", "MSCBody", "HMSCBody", "Instance", "InstanceList", "INameList", "ParameterList", "Label", "MSGIn", "MSGOut", "FullMsg", "IncompleteMsg", "Action", "DataAction", "Condition", "SetCond", "GuardCond", "DataGuardCond", "ElseCond", "Seq", "Alt", "Par", "Loop", "LoopBoundary", "Opt", "Exc", "Coregion", "Before", "After", "Ref", "Empty", "NodeExpr", "Start", "Create", "Terminate", "StartTimer", "StopTimer", "Timeout", "MsgGate", "Data", "Expr", "Bind", "ALL", "WHEN", "OTHERWISE", "NAME", "BEGIN", "END", "LEFTBINDSYMBOL", "RIGHTBINDSYMBOL", "CHARACTERSTRING", "LETTER", "DECIMALDIGIT", "UNDERLINE", "FULLSTOP", "APOSTROPHE", "ALPHANUMERIC", "OTHERCHARACTER", "SPECIAL", "WS", "'msc'", "'endmsc'", "':'", "','", "'label'", "'out'", "'to'", "'in'", "'from'", "'lost'", "'found'", "'('", "')'", "'env'", "'via'", "'action'", "'instance'", "'endinstance'", "'inst'", "'system'", "'block'", "'process'", "'service'", "';'", "'condition'", "'loop'", "'opt'", "'exc'", "'alt'", "'par'", "'<'", "'>'", "'inf'", "'\"'", "'create'", "'stop'", "'starttimer'", "'['", "']'", "'stoptimer'", "'timeout'", "'gate'", "'before'", "'after'", "'concurrent'", "'endconcurrent'", "'reference'", "'seq'", "'empty'", "'def'", "'undef'"
    };
    public static final int Condition=19;
    public static final int MsgGate=43;
    public static final int LETTER=56;
    public static final int Before=32;
    public static final int Bind=46;
    public static final int ElseCond=23;
    public static final int After=33;
    public static final int Empty=35;
    public static final int Data=44;
    public static final int Coregion=31;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int FullMsg=15;
    public static final int NAME=50;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int MSCHead=5;
    public static final int BEGIN=51;
    public static final int FULLSTOP=59;
    public static final int MSGIn=13;
    public static final int APOSTROPHE=60;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int OTHERWISE=49;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int MSCBody=6;
    public static final int Action=17;
    public static final int Create=38;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int UNDERLINE=58;
    public static final int MSGOut=14;
    public static final int NodeExpr=36;
    public static final int WS=64;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int SPECIAL=63;
    public static final int T__70=70;
    public static final int Par=26;
    public static final int DataGuardCond=22;
    public static final int END=52;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int Label=12;
    public static final int T__73=73;
    public static final int Loop=27;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int Timeout=42;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int Alt=25;
    public static final int T__65=65;
    public static final int Opt=29;
    public static final int T__114=114;
    public static final int LEFTBINDSYMBOL=53;
    public static final int StopTimer=41;
    public static final int T__115=115;
    public static final int RIGHTBINDSYMBOL=54;
    public static final int Expr=45;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int ALPHANUMERIC=61;
    public static final int T__103=103;
    public static final int ALL=47;
    public static final int T__104=104;
    public static final int MSC=4;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int InstanceList=9;
    public static final int LoopBoundary=28;
    public static final int Instance=8;
    public static final int Start=37;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int IncompleteMsg=16;
    public static final int T__100=100;
    public static final int Exc=30;
    public static final int INameList=10;
    public static final int DataAction=18;
    public static final int Seq=24;
    public static final int Ref=34;
    public static final int Terminate=39;
    public static final int WHEN=48;
    public static final int HMSCBody=7;
    public static final int GuardCond=21;
    public static final int CHARACTERSTRING=55;
    public static final int ParameterList=11;
    public static final int DECIMALDIGIT=57;
    public static final int SetCond=20;
    public static final int StartTimer=40;
    public static final int OTHERCHARACTER=62;

    // delegates
    // delegators


        public msc_grammarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public msc_grammarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return msc_grammarParser.tokenNames; }
    public String getGrammarFileName() { return "msc_grammar.g"; }


    public static class msc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "msc"
    // msc_grammar.g:54:1: msc : messageSequenceChart ;
    public final msc_grammarParser.msc_return msc() throws RecognitionException {
        msc_grammarParser.msc_return retval = new msc_grammarParser.msc_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.messageSequenceChart_return messageSequenceChart1 = null;



        try {
            // msc_grammar.g:54:6: ( messageSequenceChart )
            // msc_grammar.g:54:8: messageSequenceChart
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_messageSequenceChart_in_msc206);
            messageSequenceChart1=messageSequenceChart();

            state._fsp--;

            adaptor.addChild(root_0, messageSequenceChart1.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "msc"

    public static class messageSequenceChart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "messageSequenceChart"
    // msc_grammar.g:57:1: messageSequenceChart : 'msc' mscHead body 'endmsc' end -> ^( MSC mscHead body ) ;
    public final msc_grammarParser.messageSequenceChart_return messageSequenceChart() throws RecognitionException {
        msc_grammarParser.messageSequenceChart_return retval = new msc_grammarParser.messageSequenceChart_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal2=null;
        Token string_literal5=null;
        msc_grammarParser.mscHead_return mscHead3 = null;

        msc_grammarParser.body_return body4 = null;

        msc_grammarParser.end_return end6 = null;


        CommonTree string_literal2_tree=null;
        CommonTree string_literal5_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_mscHead=new RewriteRuleSubtreeStream(adaptor,"rule mscHead");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:58:2: ( 'msc' mscHead body 'endmsc' end -> ^( MSC mscHead body ) )
            // msc_grammar.g:58:4: 'msc' mscHead body 'endmsc' end
            {
            string_literal2=(Token)match(input,65,FOLLOW_65_in_messageSequenceChart218);  
            stream_65.add(string_literal2);

            pushFollow(FOLLOW_mscHead_in_messageSequenceChart220);
            mscHead3=mscHead();

            state._fsp--;

            stream_mscHead.add(mscHead3.getTree());
            pushFollow(FOLLOW_body_in_messageSequenceChart222);
            body4=body();

            state._fsp--;

            stream_body.add(body4.getTree());
            string_literal5=(Token)match(input,66,FOLLOW_66_in_messageSequenceChart224);  
            stream_66.add(string_literal5);

            pushFollow(FOLLOW_end_in_messageSequenceChart226);
            end6=end();

            state._fsp--;

            stream_end.add(end6.getTree());


            // AST REWRITE
            // elements: body, mscHead
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 58:36: -> ^( MSC mscHead body )
            {
                // msc_grammar.g:58:39: ^( MSC mscHead body )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MSC, "MSC"), root_1);

                adaptor.addChild(root_1, stream_mscHead.nextTree());
                adaptor.addChild(root_1, stream_body.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "messageSequenceChart"

    public static class mscHead_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mscHead"
    // msc_grammar.g:61:1: mscHead : mscName end ( mscInterface )? -> ^( MSCHead mscName ( mscInterface )? ) ;
    public final msc_grammarParser.mscHead_return mscHead() throws RecognitionException {
        msc_grammarParser.mscHead_return retval = new msc_grammarParser.mscHead_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.mscName_return mscName7 = null;

        msc_grammarParser.end_return end8 = null;

        msc_grammarParser.mscInterface_return mscInterface9 = null;


        RewriteRuleSubtreeStream stream_mscInterface=new RewriteRuleSubtreeStream(adaptor,"rule mscInterface");
        RewriteRuleSubtreeStream stream_mscName=new RewriteRuleSubtreeStream(adaptor,"rule mscName");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:61:9: ( mscName end ( mscInterface )? -> ^( MSCHead mscName ( mscInterface )? ) )
            // msc_grammar.g:61:11: mscName end ( mscInterface )?
            {
            pushFollow(FOLLOW_mscName_in_mscHead249);
            mscName7=mscName();

            state._fsp--;

            stream_mscName.add(mscName7.getTree());
            pushFollow(FOLLOW_end_in_mscHead251);
            end8=end();

            state._fsp--;

            stream_end.add(end8.getTree());
            // msc_grammar.g:61:23: ( mscInterface )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==83||LA1_0==106) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // msc_grammar.g:61:25: mscInterface
                    {
                    pushFollow(FOLLOW_mscInterface_in_mscHead255);
                    mscInterface9=mscInterface();

                    state._fsp--;

                    stream_mscInterface.add(mscInterface9.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: mscName, mscInterface
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 61:41: -> ^( MSCHead mscName ( mscInterface )? )
            {
                // msc_grammar.g:61:44: ^( MSCHead mscName ( mscInterface )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MSCHead, "MSCHead"), root_1);

                adaptor.addChild(root_1, stream_mscName.nextTree());
                // msc_grammar.g:61:63: ( mscInterface )?
                if ( stream_mscInterface.hasNext() ) {
                    adaptor.addChild(root_1, stream_mscInterface.nextTree());

                }
                stream_mscInterface.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mscHead"

    public static class body_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "body"
    // msc_grammar.g:64:1: body : ( mscBody ) ;
    public final msc_grammarParser.body_return body() throws RecognitionException {
        msc_grammarParser.body_return retval = new msc_grammarParser.body_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.mscBody_return mscBody10 = null;



        try {
            // msc_grammar.g:64:7: ( ( mscBody ) )
            // msc_grammar.g:64:9: ( mscBody )
            {
            root_0 = (CommonTree)adaptor.nil();

            // msc_grammar.g:64:9: ( mscBody )
            // msc_grammar.g:64:11: mscBody
            {
            pushFollow(FOLLOW_mscBody_in_body285);
            mscBody10=mscBody();

            state._fsp--;

            adaptor.addChild(root_0, mscBody10.getTree());

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "body"

    public static class mscBody_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mscBody"
    // msc_grammar.g:67:1: mscBody : ( mscStatement )* -> ^( MSCBody ( mscStatement )* ) ;
    public final msc_grammarParser.mscBody_return mscBody() throws RecognitionException {
        msc_grammarParser.mscBody_return retval = new msc_grammarParser.mscBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.mscStatement_return mscStatement11 = null;


        RewriteRuleSubtreeStream stream_mscStatement=new RewriteRuleSubtreeStream(adaptor,"rule mscStatement");
        try {
            // msc_grammar.g:67:9: ( ( mscStatement )* -> ^( MSCBody ( mscStatement )* ) )
            // msc_grammar.g:67:11: ( mscStatement )*
            {
            // msc_grammar.g:67:11: ( mscStatement )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ALL||LA2_0==NAME) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // msc_grammar.g:67:11: mscStatement
            	    {
            	    pushFollow(FOLLOW_mscStatement_in_mscBody298);
            	    mscStatement11=mscStatement();

            	    state._fsp--;

            	    stream_mscStatement.add(mscStatement11.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);



            // AST REWRITE
            // elements: mscStatement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 67:25: -> ^( MSCBody ( mscStatement )* )
            {
                // msc_grammar.g:67:28: ^( MSCBody ( mscStatement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MSCBody, "MSCBody"), root_1);

                // msc_grammar.g:67:39: ( mscStatement )*
                while ( stream_mscStatement.hasNext() ) {
                    adaptor.addChild(root_1, stream_mscStatement.nextTree());

                }
                stream_mscStatement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mscBody"

    public static class mscStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mscStatement"
    // msc_grammar.g:70:1: mscStatement : eventDefinition ;
    public final msc_grammarParser.mscStatement_return mscStatement() throws RecognitionException {
        msc_grammarParser.mscStatement_return retval = new msc_grammarParser.mscStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.eventDefinition_return eventDefinition12 = null;



        try {
            // msc_grammar.g:71:2: ( eventDefinition )
            // msc_grammar.g:71:4: eventDefinition
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_eventDefinition_in_mscStatement323);
            eventDefinition12=eventDefinition();

            state._fsp--;

            adaptor.addChild(root_0, eventDefinition12.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mscStatement"

    public static class eventDefinition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eventDefinition"
    // msc_grammar.g:74:1: eventDefinition : ( instanceName ':' instanceEventList -> ^( Instance instanceName instanceEventList ) | instanceNameList ':' multiInstanceEventList -> ^( InstanceList instanceNameList multiInstanceEventList ) );
    public final msc_grammarParser.eventDefinition_return eventDefinition() throws RecognitionException {
        msc_grammarParser.eventDefinition_return retval = new msc_grammarParser.eventDefinition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal14=null;
        Token char_literal17=null;
        msc_grammarParser.instanceName_return instanceName13 = null;

        msc_grammarParser.instanceEventList_return instanceEventList15 = null;

        msc_grammarParser.instanceNameList_return instanceNameList16 = null;

        msc_grammarParser.multiInstanceEventList_return multiInstanceEventList18 = null;


        CommonTree char_literal14_tree=null;
        CommonTree char_literal17_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleSubtreeStream stream_instanceName=new RewriteRuleSubtreeStream(adaptor,"rule instanceName");
        RewriteRuleSubtreeStream stream_instanceEventList=new RewriteRuleSubtreeStream(adaptor,"rule instanceEventList");
        RewriteRuleSubtreeStream stream_instanceNameList=new RewriteRuleSubtreeStream(adaptor,"rule instanceNameList");
        RewriteRuleSubtreeStream stream_multiInstanceEventList=new RewriteRuleSubtreeStream(adaptor,"rule multiInstanceEventList");
        try {
            // msc_grammar.g:75:2: ( instanceName ':' instanceEventList -> ^( Instance instanceName instanceEventList ) | instanceNameList ':' multiInstanceEventList -> ^( InstanceList instanceNameList multiInstanceEventList ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==NAME) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==67) ) {
                    int LA3_3 = input.LA(3);

                    if ( ((LA3_3>=89 && LA3_3<=94)||LA3_3==111) ) {
                        alt3=2;
                    }
                    else if ( (LA3_3==NAME||(LA3_3>=69 && LA3_3<=70)||LA3_3==72||(LA3_3>=80 && LA3_3<=82)||(LA3_3>=99 && LA3_3<=101)||(LA3_3>=104 && LA3_3<=105)||LA3_3==109) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA3_1==68) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==ALL) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // msc_grammar.g:75:4: instanceName ':' instanceEventList
                    {
                    pushFollow(FOLLOW_instanceName_in_eventDefinition335);
                    instanceName13=instanceName();

                    state._fsp--;

                    stream_instanceName.add(instanceName13.getTree());
                    char_literal14=(Token)match(input,67,FOLLOW_67_in_eventDefinition337);  
                    stream_67.add(char_literal14);

                    pushFollow(FOLLOW_instanceEventList_in_eventDefinition339);
                    instanceEventList15=instanceEventList();

                    state._fsp--;

                    stream_instanceEventList.add(instanceEventList15.getTree());


                    // AST REWRITE
                    // elements: instanceEventList, instanceName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 75:39: -> ^( Instance instanceName instanceEventList )
                    {
                        // msc_grammar.g:75:42: ^( Instance instanceName instanceEventList )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Instance, "Instance"), root_1);

                        adaptor.addChild(root_1, stream_instanceName.nextTree());
                        adaptor.addChild(root_1, stream_instanceEventList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // msc_grammar.g:76:4: instanceNameList ':' multiInstanceEventList
                    {
                    pushFollow(FOLLOW_instanceNameList_in_eventDefinition357);
                    instanceNameList16=instanceNameList();

                    state._fsp--;

                    stream_instanceNameList.add(instanceNameList16.getTree());
                    char_literal17=(Token)match(input,67,FOLLOW_67_in_eventDefinition359);  
                    stream_67.add(char_literal17);

                    pushFollow(FOLLOW_multiInstanceEventList_in_eventDefinition361);
                    multiInstanceEventList18=multiInstanceEventList();

                    state._fsp--;

                    stream_multiInstanceEventList.add(multiInstanceEventList18.getTree());


                    // AST REWRITE
                    // elements: instanceNameList, multiInstanceEventList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 76:48: -> ^( InstanceList instanceNameList multiInstanceEventList )
                    {
                        // msc_grammar.g:76:51: ^( InstanceList instanceNameList multiInstanceEventList )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(InstanceList, "InstanceList"), root_1);

                        adaptor.addChild(root_1, stream_instanceNameList.nextTree());
                        adaptor.addChild(root_1, stream_multiInstanceEventList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "eventDefinition"

    public static class instanceEventList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instanceEventList"
    // msc_grammar.g:79:1: instanceEventList : ( instanceEvent end )+ -> ( instanceEvent )+ ;
    public final msc_grammarParser.instanceEventList_return instanceEventList() throws RecognitionException {
        msc_grammarParser.instanceEventList_return retval = new msc_grammarParser.instanceEventList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.instanceEvent_return instanceEvent19 = null;

        msc_grammarParser.end_return end20 = null;


        RewriteRuleSubtreeStream stream_instanceEvent=new RewriteRuleSubtreeStream(adaptor,"rule instanceEvent");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:80:2: ( ( instanceEvent end )+ -> ( instanceEvent )+ )
            // msc_grammar.g:80:4: ( instanceEvent end )+
            {
            // msc_grammar.g:80:4: ( instanceEvent end )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==NAME) ) {
                    int LA4_2 = input.LA(2);

                    if ( (LA4_2==70||LA4_2==72||LA4_2==80||LA4_2==99||LA4_2==101||(LA4_2>=104 && LA4_2<=105)) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>=69 && LA4_0<=70)||LA4_0==72||(LA4_0>=80 && LA4_0<=82)||(LA4_0>=99 && LA4_0<=101)||(LA4_0>=104 && LA4_0<=105)||LA4_0==109) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // msc_grammar.g:80:6: instanceEvent end
            	    {
            	    pushFollow(FOLLOW_instanceEvent_in_instanceEventList388);
            	    instanceEvent19=instanceEvent();

            	    state._fsp--;

            	    stream_instanceEvent.add(instanceEvent19.getTree());
            	    pushFollow(FOLLOW_end_in_instanceEventList390);
            	    end20=end();

            	    state._fsp--;

            	    stream_end.add(end20.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);



            // AST REWRITE
            // elements: instanceEvent
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 80:27: -> ( instanceEvent )+
            {
                if ( !(stream_instanceEvent.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instanceEvent.hasNext() ) {
                    adaptor.addChild(root_0, stream_instanceEvent.nextTree());

                }
                stream_instanceEvent.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instanceEventList"

    public static class instanceEvent_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instanceEvent"
    // msc_grammar.g:83:1: instanceEvent : ( orderableEvent | nonOrderableEvent );
    public final msc_grammarParser.instanceEvent_return instanceEvent() throws RecognitionException {
        msc_grammarParser.instanceEvent_return retval = new msc_grammarParser.instanceEvent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.orderableEvent_return orderableEvent21 = null;

        msc_grammarParser.nonOrderableEvent_return nonOrderableEvent22 = null;



        try {
            // msc_grammar.g:84:2: ( orderableEvent | nonOrderableEvent )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==NAME||(LA5_0>=69 && LA5_0<=70)||LA5_0==72||LA5_0==80||LA5_0==99||LA5_0==101||(LA5_0>=104 && LA5_0<=105)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=81 && LA5_0<=82)||LA5_0==100||LA5_0==109) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // msc_grammar.g:84:4: orderableEvent
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_orderableEvent_in_instanceEvent411);
                    orderableEvent21=orderableEvent();

                    state._fsp--;

                    adaptor.addChild(root_0, orderableEvent21.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:84:21: nonOrderableEvent
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_nonOrderableEvent_in_instanceEvent415);
                    nonOrderableEvent22=nonOrderableEvent();

                    state._fsp--;

                    adaptor.addChild(root_0, nonOrderableEvent22.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instanceEvent"

    public static class orderableEvent_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orderableEvent"
    // msc_grammar.g:87:1: orderableEvent : ( label )? ( messageEvent | action | create | timerStatement ) ( generalOrdering )? ;
    public final msc_grammarParser.orderableEvent_return orderableEvent() throws RecognitionException {
        msc_grammarParser.orderableEvent_return retval = new msc_grammarParser.orderableEvent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.label_return label23 = null;

        msc_grammarParser.messageEvent_return messageEvent24 = null;

        msc_grammarParser.action_return action25 = null;

        msc_grammarParser.create_return create26 = null;

        msc_grammarParser.timerStatement_return timerStatement27 = null;

        msc_grammarParser.generalOrdering_return generalOrdering28 = null;



        try {
            // msc_grammar.g:88:2: ( ( label )? ( messageEvent | action | create | timerStatement ) ( generalOrdering )? )
            // msc_grammar.g:88:4: ( label )? ( messageEvent | action | create | timerStatement ) ( generalOrdering )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // msc_grammar.g:88:4: ( label )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==NAME||LA6_0==69) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // msc_grammar.g:88:4: label
                    {
                    pushFollow(FOLLOW_label_in_orderableEvent427);
                    label23=label();

                    state._fsp--;

                    adaptor.addChild(root_0, label23.getTree());

                    }
                    break;

            }

            // msc_grammar.g:88:11: ( messageEvent | action | create | timerStatement )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 70:
            case 72:
                {
                alt7=1;
                }
                break;
            case 80:
                {
                alt7=2;
                }
                break;
            case 99:
                {
                alt7=3;
                }
                break;
            case 101:
            case 104:
            case 105:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // msc_grammar.g:88:13: messageEvent
                    {
                    pushFollow(FOLLOW_messageEvent_in_orderableEvent432);
                    messageEvent24=messageEvent();

                    state._fsp--;

                    adaptor.addChild(root_0, messageEvent24.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:88:28: action
                    {
                    pushFollow(FOLLOW_action_in_orderableEvent436);
                    action25=action();

                    state._fsp--;

                    adaptor.addChild(root_0, action25.getTree());

                    }
                    break;
                case 3 :
                    // msc_grammar.g:88:37: create
                    {
                    pushFollow(FOLLOW_create_in_orderableEvent440);
                    create26=create();

                    state._fsp--;

                    adaptor.addChild(root_0, create26.getTree());

                    }
                    break;
                case 4 :
                    // msc_grammar.g:88:46: timerStatement
                    {
                    pushFollow(FOLLOW_timerStatement_in_orderableEvent444);
                    timerStatement27=timerStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, timerStatement27.getTree());

                    }
                    break;

            }

            // msc_grammar.g:88:63: ( generalOrdering )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=107 && LA8_0<=108)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // msc_grammar.g:88:63: generalOrdering
                    {
                    pushFollow(FOLLOW_generalOrdering_in_orderableEvent448);
                    generalOrdering28=generalOrdering();

                    state._fsp--;

                    adaptor.addChild(root_0, generalOrdering28.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "orderableEvent"

    public static class nonOrderableEvent_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nonOrderableEvent"
    // msc_grammar.g:91:1: nonOrderableEvent : ( instanceHeadStatement | instanceEndStatement | stop | coregion );
    public final msc_grammarParser.nonOrderableEvent_return nonOrderableEvent() throws RecognitionException {
        msc_grammarParser.nonOrderableEvent_return retval = new msc_grammarParser.nonOrderableEvent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.instanceHeadStatement_return instanceHeadStatement29 = null;

        msc_grammarParser.instanceEndStatement_return instanceEndStatement30 = null;

        msc_grammarParser.stop_return stop31 = null;

        msc_grammarParser.coregion_return coregion32 = null;



        try {
            // msc_grammar.g:92:2: ( instanceHeadStatement | instanceEndStatement | stop | coregion )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt9=1;
                }
                break;
            case 82:
                {
                alt9=2;
                }
                break;
            case 100:
                {
                alt9=3;
                }
                break;
            case 109:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // msc_grammar.g:92:4: instanceHeadStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_instanceHeadStatement_in_nonOrderableEvent461);
                    instanceHeadStatement29=instanceHeadStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, instanceHeadStatement29.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:92:28: instanceEndStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_instanceEndStatement_in_nonOrderableEvent465);
                    instanceEndStatement30=instanceEndStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, instanceEndStatement30.getTree());

                    }
                    break;
                case 3 :
                    // msc_grammar.g:92:51: stop
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_stop_in_nonOrderableEvent469);
                    stop31=stop();

                    state._fsp--;

                    adaptor.addChild(root_0, stop31.getTree());

                    }
                    break;
                case 4 :
                    // msc_grammar.g:92:58: coregion
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_coregion_in_nonOrderableEvent473);
                    coregion32=coregion();

                    state._fsp--;

                    adaptor.addChild(root_0, coregion32.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nonOrderableEvent"

    public static class instanceNameList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instanceNameList"
    // msc_grammar.g:95:1: instanceNameList : ( instanceName ( ',' instanceName )* -> ^( INameList ( instanceName )+ ) | ALL -> ^( INameList ALL ) );
    public final msc_grammarParser.instanceNameList_return instanceNameList() throws RecognitionException {
        msc_grammarParser.instanceNameList_return retval = new msc_grammarParser.instanceNameList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal34=null;
        Token ALL36=null;
        msc_grammarParser.instanceName_return instanceName33 = null;

        msc_grammarParser.instanceName_return instanceName35 = null;


        CommonTree char_literal34_tree=null;
        CommonTree ALL36_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_ALL=new RewriteRuleTokenStream(adaptor,"token ALL");
        RewriteRuleSubtreeStream stream_instanceName=new RewriteRuleSubtreeStream(adaptor,"rule instanceName");
        try {
            // msc_grammar.g:96:2: ( instanceName ( ',' instanceName )* -> ^( INameList ( instanceName )+ ) | ALL -> ^( INameList ALL ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==NAME) ) {
                alt11=1;
            }
            else if ( (LA11_0==ALL) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // msc_grammar.g:96:4: instanceName ( ',' instanceName )*
                    {
                    pushFollow(FOLLOW_instanceName_in_instanceNameList486);
                    instanceName33=instanceName();

                    state._fsp--;

                    stream_instanceName.add(instanceName33.getTree());
                    // msc_grammar.g:96:17: ( ',' instanceName )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==68) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // msc_grammar.g:96:19: ',' instanceName
                    	    {
                    	    char_literal34=(Token)match(input,68,FOLLOW_68_in_instanceNameList490);  
                    	    stream_68.add(char_literal34);

                    	    pushFollow(FOLLOW_instanceName_in_instanceNameList492);
                    	    instanceName35=instanceName();

                    	    state._fsp--;

                    	    stream_instanceName.add(instanceName35.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: instanceName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 96:39: -> ^( INameList ( instanceName )+ )
                    {
                        // msc_grammar.g:96:42: ^( INameList ( instanceName )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INameList, "INameList"), root_1);

                        if ( !(stream_instanceName.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instanceName.hasNext() ) {
                            adaptor.addChild(root_1, stream_instanceName.nextTree());

                        }
                        stream_instanceName.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // msc_grammar.g:97:5: ALL
                    {
                    ALL36=(Token)match(input,ALL,FOLLOW_ALL_in_instanceNameList512);  
                    stream_ALL.add(ALL36);



                    // AST REWRITE
                    // elements: ALL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 97:9: -> ^( INameList ALL )
                    {
                        // msc_grammar.g:97:12: ^( INameList ALL )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INameList, "INameList"), root_1);

                        adaptor.addChild(root_1, stream_ALL.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instanceNameList"

    public static class multiInstanceEventList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiInstanceEventList"
    // msc_grammar.g:100:1: multiInstanceEventList : ( multiInstanceEvent end )+ -> ( multiInstanceEvent )+ ;
    public final msc_grammarParser.multiInstanceEventList_return multiInstanceEventList() throws RecognitionException {
        msc_grammarParser.multiInstanceEventList_return retval = new msc_grammarParser.multiInstanceEventList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.multiInstanceEvent_return multiInstanceEvent37 = null;

        msc_grammarParser.end_return end38 = null;


        RewriteRuleSubtreeStream stream_multiInstanceEvent=new RewriteRuleSubtreeStream(adaptor,"rule multiInstanceEvent");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:101:2: ( ( multiInstanceEvent end )+ -> ( multiInstanceEvent )+ )
            // msc_grammar.g:101:4: ( multiInstanceEvent end )+
            {
            // msc_grammar.g:101:4: ( multiInstanceEvent end )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                switch ( input.LA(1) ) {
                case 90:
                    {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==BEGIN||LA12_2==95) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 91:
                    {
                    int LA12_3 = input.LA(2);

                    if ( (LA12_3==BEGIN) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 92:
                    {
                    int LA12_4 = input.LA(2);

                    if ( (LA12_4==BEGIN) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 93:
                    {
                    int LA12_5 = input.LA(2);

                    if ( (LA12_5==BEGIN) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 94:
                    {
                    int LA12_6 = input.LA(2);

                    if ( (LA12_6==BEGIN) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 89:
                case 111:
                    {
                    alt12=1;
                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // msc_grammar.g:101:6: multiInstanceEvent end
            	    {
            	    pushFollow(FOLLOW_multiInstanceEvent_in_multiInstanceEventList537);
            	    multiInstanceEvent37=multiInstanceEvent();

            	    state._fsp--;

            	    stream_multiInstanceEvent.add(multiInstanceEvent37.getTree());
            	    pushFollow(FOLLOW_end_in_multiInstanceEventList539);
            	    end38=end();

            	    state._fsp--;

            	    stream_end.add(end38.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);



            // AST REWRITE
            // elements: multiInstanceEvent
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 101:32: -> ( multiInstanceEvent )+
            {
                if ( !(stream_multiInstanceEvent.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_multiInstanceEvent.hasNext() ) {
                    adaptor.addChild(root_0, stream_multiInstanceEvent.nextTree());

                }
                stream_multiInstanceEvent.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiInstanceEventList"

    public static class multiInstanceEvent_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiInstanceEvent"
    // msc_grammar.g:104:1: multiInstanceEvent : ( condition | mscReference | inlineExpr );
    public final msc_grammarParser.multiInstanceEvent_return multiInstanceEvent() throws RecognitionException {
        msc_grammarParser.multiInstanceEvent_return retval = new msc_grammarParser.multiInstanceEvent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.condition_return condition39 = null;

        msc_grammarParser.mscReference_return mscReference40 = null;

        msc_grammarParser.inlineExpr_return inlineExpr41 = null;



        try {
            // msc_grammar.g:105:2: ( condition | mscReference | inlineExpr )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt13=1;
                }
                break;
            case 111:
                {
                alt13=2;
                }
                break;
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // msc_grammar.g:105:4: condition
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_condition_in_multiInstanceEvent560);
                    condition39=condition();

                    state._fsp--;

                    adaptor.addChild(root_0, condition39.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:105:16: mscReference
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_mscReference_in_multiInstanceEvent564);
                    mscReference40=mscReference();

                    state._fsp--;

                    adaptor.addChild(root_0, mscReference40.getTree());

                    }
                    break;
                case 3 :
                    // msc_grammar.g:105:31: inlineExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_inlineExpr_in_multiInstanceEvent568);
                    inlineExpr41=inlineExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, inlineExpr41.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiInstanceEvent"

    public static class label_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "label"
    // msc_grammar.g:109:1: label : ( eventName | 'label' eventName end ) -> ^( Label eventName ) ;
    public final msc_grammarParser.label_return label() throws RecognitionException {
        msc_grammarParser.label_return retval = new msc_grammarParser.label_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal43=null;
        msc_grammarParser.eventName_return eventName42 = null;

        msc_grammarParser.eventName_return eventName44 = null;

        msc_grammarParser.end_return end45 = null;


        CommonTree string_literal43_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleSubtreeStream stream_eventName=new RewriteRuleSubtreeStream(adaptor,"rule eventName");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:109:8: ( ( eventName | 'label' eventName end ) -> ^( Label eventName ) )
            // msc_grammar.g:109:10: ( eventName | 'label' eventName end )
            {
            // msc_grammar.g:109:10: ( eventName | 'label' eventName end )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==NAME) ) {
                alt14=1;
            }
            else if ( (LA14_0==69) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // msc_grammar.g:109:12: eventName
                    {
                    pushFollow(FOLLOW_eventName_in_label582);
                    eventName42=eventName();

                    state._fsp--;

                    stream_eventName.add(eventName42.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:109:24: 'label' eventName end
                    {
                    string_literal43=(Token)match(input,69,FOLLOW_69_in_label586);  
                    stream_69.add(string_literal43);

                    pushFollow(FOLLOW_eventName_in_label588);
                    eventName44=eventName();

                    state._fsp--;

                    stream_eventName.add(eventName44.getTree());
                    pushFollow(FOLLOW_end_in_label590);
                    end45=end();

                    state._fsp--;

                    stream_end.add(end45.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: eventName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 109:48: -> ^( Label eventName )
            {
                // msc_grammar.g:109:51: ^( Label eventName )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Label, "Label"), root_1);

                adaptor.addChild(root_1, stream_eventName.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "label"

    public static class messageEvent_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "messageEvent"
    // msc_grammar.g:113:1: messageEvent : ( 'out' msgIdentification 'to' messageReceiver -> ^( MSGOut msgIdentification messageReceiver ) | 'in' msgIdentification 'from' messageSender -> ^( MSGIn msgIdentification messageSender ) );
    public final msc_grammarParser.messageEvent_return messageEvent() throws RecognitionException {
        msc_grammarParser.messageEvent_return retval = new msc_grammarParser.messageEvent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal46=null;
        Token string_literal48=null;
        Token string_literal50=null;
        Token string_literal52=null;
        msc_grammarParser.msgIdentification_return msgIdentification47 = null;

        msc_grammarParser.messageReceiver_return messageReceiver49 = null;

        msc_grammarParser.msgIdentification_return msgIdentification51 = null;

        msc_grammarParser.messageSender_return messageSender53 = null;


        CommonTree string_literal46_tree=null;
        CommonTree string_literal48_tree=null;
        CommonTree string_literal50_tree=null;
        CommonTree string_literal52_tree=null;
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleSubtreeStream stream_messageReceiver=new RewriteRuleSubtreeStream(adaptor,"rule messageReceiver");
        RewriteRuleSubtreeStream stream_msgIdentification=new RewriteRuleSubtreeStream(adaptor,"rule msgIdentification");
        RewriteRuleSubtreeStream stream_messageSender=new RewriteRuleSubtreeStream(adaptor,"rule messageSender");
        try {
            // msc_grammar.g:114:2: ( 'out' msgIdentification 'to' messageReceiver -> ^( MSGOut msgIdentification messageReceiver ) | 'in' msgIdentification 'from' messageSender -> ^( MSGIn msgIdentification messageSender ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==70) ) {
                alt15=1;
            }
            else if ( (LA15_0==72) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // msc_grammar.g:114:4: 'out' msgIdentification 'to' messageReceiver
                    {
                    string_literal46=(Token)match(input,70,FOLLOW_70_in_messageEvent615);  
                    stream_70.add(string_literal46);

                    pushFollow(FOLLOW_msgIdentification_in_messageEvent617);
                    msgIdentification47=msgIdentification();

                    state._fsp--;

                    stream_msgIdentification.add(msgIdentification47.getTree());
                    string_literal48=(Token)match(input,71,FOLLOW_71_in_messageEvent619);  
                    stream_71.add(string_literal48);

                    pushFollow(FOLLOW_messageReceiver_in_messageEvent621);
                    messageReceiver49=messageReceiver();

                    state._fsp--;

                    stream_messageReceiver.add(messageReceiver49.getTree());


                    // AST REWRITE
                    // elements: messageReceiver, msgIdentification
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 114:49: -> ^( MSGOut msgIdentification messageReceiver )
                    {
                        // msc_grammar.g:114:52: ^( MSGOut msgIdentification messageReceiver )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MSGOut, "MSGOut"), root_1);

                        adaptor.addChild(root_1, stream_msgIdentification.nextTree());
                        adaptor.addChild(root_1, stream_messageReceiver.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // msc_grammar.g:115:4: 'in' msgIdentification 'from' messageSender
                    {
                    string_literal50=(Token)match(input,72,FOLLOW_72_in_messageEvent638);  
                    stream_72.add(string_literal50);

                    pushFollow(FOLLOW_msgIdentification_in_messageEvent640);
                    msgIdentification51=msgIdentification();

                    state._fsp--;

                    stream_msgIdentification.add(msgIdentification51.getTree());
                    string_literal52=(Token)match(input,73,FOLLOW_73_in_messageEvent642);  
                    stream_73.add(string_literal52);

                    pushFollow(FOLLOW_messageSender_in_messageEvent644);
                    messageSender53=messageSender();

                    state._fsp--;

                    stream_messageSender.add(messageSender53.getTree());


                    // AST REWRITE
                    // elements: messageSender, msgIdentification
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 115:49: -> ^( MSGIn msgIdentification messageSender )
                    {
                        // msc_grammar.g:115:52: ^( MSGIn msgIdentification messageSender )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MSGIn, "MSGIn"), root_1);

                        adaptor.addChild(root_1, stream_msgIdentification.nextTree());
                        adaptor.addChild(root_1, stream_messageSender.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "messageEvent"

    public static class messageReceiver_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "messageReceiver"
    // msc_grammar.g:118:1: messageReceiver : ( inputAddress -> inputAddress FullMsg | 'lost' ( inputAddress )? -> ( inputAddress )? IncompleteMsg );
    public final msc_grammarParser.messageReceiver_return messageReceiver() throws RecognitionException {
        msc_grammarParser.messageReceiver_return retval = new msc_grammarParser.messageReceiver_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal55=null;
        msc_grammarParser.inputAddress_return inputAddress54 = null;

        msc_grammarParser.inputAddress_return inputAddress56 = null;


        CommonTree string_literal55_tree=null;
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_inputAddress=new RewriteRuleSubtreeStream(adaptor,"rule inputAddress");
        try {
            // msc_grammar.g:119:2: ( inputAddress -> inputAddress FullMsg | 'lost' ( inputAddress )? -> ( inputAddress )? IncompleteMsg )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==NAME||LA17_0==78) ) {
                alt17=1;
            }
            else if ( (LA17_0==74) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // msc_grammar.g:119:4: inputAddress
                    {
                    pushFollow(FOLLOW_inputAddress_in_messageReceiver670);
                    inputAddress54=inputAddress();

                    state._fsp--;

                    stream_inputAddress.add(inputAddress54.getTree());


                    // AST REWRITE
                    // elements: inputAddress
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 119:17: -> inputAddress FullMsg
                    {
                        adaptor.addChild(root_0, stream_inputAddress.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FullMsg, "FullMsg"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // msc_grammar.g:120:4: 'lost' ( inputAddress )?
                    {
                    string_literal55=(Token)match(input,74,FOLLOW_74_in_messageReceiver681);  
                    stream_74.add(string_literal55);

                    // msc_grammar.g:120:11: ( inputAddress )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==NAME||LA16_0==78) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // msc_grammar.g:120:13: inputAddress
                            {
                            pushFollow(FOLLOW_inputAddress_in_messageReceiver685);
                            inputAddress56=inputAddress();

                            state._fsp--;

                            stream_inputAddress.add(inputAddress56.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: inputAddress
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 120:29: -> ( inputAddress )? IncompleteMsg
                    {
                        // msc_grammar.g:120:32: ( inputAddress )?
                        if ( stream_inputAddress.hasNext() ) {
                            adaptor.addChild(root_0, stream_inputAddress.nextTree());

                        }
                        stream_inputAddress.reset();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IncompleteMsg, "IncompleteMsg"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "messageReceiver"

    public static class messageSender_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "messageSender"
    // msc_grammar.g:123:1: messageSender : ( outputAddress -> outputAddress FullMsg | 'found' ( outputAddress )? -> ( outputAddress )? IncompleteMsg );
    public final msc_grammarParser.messageSender_return messageSender() throws RecognitionException {
        msc_grammarParser.messageSender_return retval = new msc_grammarParser.messageSender_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal58=null;
        msc_grammarParser.outputAddress_return outputAddress57 = null;

        msc_grammarParser.outputAddress_return outputAddress59 = null;


        CommonTree string_literal58_tree=null;
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_outputAddress=new RewriteRuleSubtreeStream(adaptor,"rule outputAddress");
        try {
            // msc_grammar.g:124:2: ( outputAddress -> outputAddress FullMsg | 'found' ( outputAddress )? -> ( outputAddress )? IncompleteMsg )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==NAME||LA19_0==78) ) {
                alt19=1;
            }
            else if ( (LA19_0==75) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // msc_grammar.g:124:4: outputAddress
                    {
                    pushFollow(FOLLOW_outputAddress_in_messageSender707);
                    outputAddress57=outputAddress();

                    state._fsp--;

                    stream_outputAddress.add(outputAddress57.getTree());


                    // AST REWRITE
                    // elements: outputAddress
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 124:18: -> outputAddress FullMsg
                    {
                        adaptor.addChild(root_0, stream_outputAddress.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FullMsg, "FullMsg"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // msc_grammar.g:125:4: 'found' ( outputAddress )?
                    {
                    string_literal58=(Token)match(input,75,FOLLOW_75_in_messageSender718);  
                    stream_75.add(string_literal58);

                    // msc_grammar.g:125:12: ( outputAddress )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==NAME||LA18_0==78) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // msc_grammar.g:125:14: outputAddress
                            {
                            pushFollow(FOLLOW_outputAddress_in_messageSender722);
                            outputAddress59=outputAddress();

                            state._fsp--;

                            stream_outputAddress.add(outputAddress59.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: outputAddress
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 125:31: -> ( outputAddress )? IncompleteMsg
                    {
                        // msc_grammar.g:125:34: ( outputAddress )?
                        if ( stream_outputAddress.hasNext() ) {
                            adaptor.addChild(root_0, stream_outputAddress.nextTree());

                        }
                        stream_outputAddress.reset();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IncompleteMsg, "IncompleteMsg"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "messageSender"

    public static class msgIdentification_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "msgIdentification"
    // msc_grammar.g:128:1: msgIdentification : messageName ( ',' messageInstanceName )? ( '(' parameterList ')' )? -> messageName ^( Data ( parameterList )? ) ;
    public final msc_grammarParser.msgIdentification_return msgIdentification() throws RecognitionException {
        msc_grammarParser.msgIdentification_return retval = new msc_grammarParser.msgIdentification_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal61=null;
        Token char_literal63=null;
        Token char_literal65=null;
        msc_grammarParser.messageName_return messageName60 = null;

        msc_grammarParser.messageInstanceName_return messageInstanceName62 = null;

        msc_grammarParser.parameterList_return parameterList64 = null;


        CommonTree char_literal61_tree=null;
        CommonTree char_literal63_tree=null;
        CommonTree char_literal65_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_parameterList=new RewriteRuleSubtreeStream(adaptor,"rule parameterList");
        RewriteRuleSubtreeStream stream_messageInstanceName=new RewriteRuleSubtreeStream(adaptor,"rule messageInstanceName");
        RewriteRuleSubtreeStream stream_messageName=new RewriteRuleSubtreeStream(adaptor,"rule messageName");
        try {
            // msc_grammar.g:129:2: ( messageName ( ',' messageInstanceName )? ( '(' parameterList ')' )? -> messageName ^( Data ( parameterList )? ) )
            // msc_grammar.g:129:4: messageName ( ',' messageInstanceName )? ( '(' parameterList ')' )?
            {
            pushFollow(FOLLOW_messageName_in_msgIdentification745);
            messageName60=messageName();

            state._fsp--;

            stream_messageName.add(messageName60.getTree());
            // msc_grammar.g:129:16: ( ',' messageInstanceName )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==68) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // msc_grammar.g:129:18: ',' messageInstanceName
                    {
                    char_literal61=(Token)match(input,68,FOLLOW_68_in_msgIdentification749);  
                    stream_68.add(char_literal61);

                    pushFollow(FOLLOW_messageInstanceName_in_msgIdentification751);
                    messageInstanceName62=messageInstanceName();

                    state._fsp--;

                    stream_messageInstanceName.add(messageInstanceName62.getTree());

                    }
                    break;

            }

            // msc_grammar.g:129:45: ( '(' parameterList ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==76) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // msc_grammar.g:129:47: '(' parameterList ')'
                    {
                    char_literal63=(Token)match(input,76,FOLLOW_76_in_msgIdentification758);  
                    stream_76.add(char_literal63);

                    pushFollow(FOLLOW_parameterList_in_msgIdentification760);
                    parameterList64=parameterList();

                    state._fsp--;

                    stream_parameterList.add(parameterList64.getTree());
                    char_literal65=(Token)match(input,77,FOLLOW_77_in_msgIdentification762);  
                    stream_77.add(char_literal65);


                    }
                    break;

            }



            // AST REWRITE
            // elements: messageName, parameterList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 129:72: -> messageName ^( Data ( parameterList )? )
            {
                adaptor.addChild(root_0, stream_messageName.nextTree());
                // msc_grammar.g:129:87: ^( Data ( parameterList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Data, "Data"), root_1);

                // msc_grammar.g:129:95: ( parameterList )?
                if ( stream_parameterList.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameterList.nextTree());

                }
                stream_parameterList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "msgIdentification"

    public static class parameterList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameterList"
    // msc_grammar.g:132:1: parameterList : parameterDefn ( ',' parameterList )? -> parameterDefn ( parameterList )? ;
    public final msc_grammarParser.parameterList_return parameterList() throws RecognitionException {
        msc_grammarParser.parameterList_return retval = new msc_grammarParser.parameterList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal67=null;
        msc_grammarParser.parameterDefn_return parameterDefn66 = null;

        msc_grammarParser.parameterList_return parameterList68 = null;


        CommonTree char_literal67_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleSubtreeStream stream_parameterDefn=new RewriteRuleSubtreeStream(adaptor,"rule parameterDefn");
        RewriteRuleSubtreeStream stream_parameterList=new RewriteRuleSubtreeStream(adaptor,"rule parameterList");
        try {
            // msc_grammar.g:133:2: ( parameterDefn ( ',' parameterList )? -> parameterDefn ( parameterList )? )
            // msc_grammar.g:133:4: parameterDefn ( ',' parameterList )?
            {
            pushFollow(FOLLOW_parameterDefn_in_parameterList791);
            parameterDefn66=parameterDefn();

            state._fsp--;

            stream_parameterDefn.add(parameterDefn66.getTree());
            // msc_grammar.g:133:18: ( ',' parameterList )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==68) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // msc_grammar.g:133:20: ',' parameterList
                    {
                    char_literal67=(Token)match(input,68,FOLLOW_68_in_parameterList795);  
                    stream_68.add(char_literal67);

                    pushFollow(FOLLOW_parameterList_in_parameterList797);
                    parameterList68=parameterList();

                    state._fsp--;

                    stream_parameterList.add(parameterList68.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: parameterDefn, parameterList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 133:41: -> parameterDefn ( parameterList )?
            {
                adaptor.addChild(root_0, stream_parameterDefn.nextTree());
                // msc_grammar.g:133:58: ( parameterList )?
                if ( stream_parameterList.hasNext() ) {
                    adaptor.addChild(root_0, stream_parameterList.nextTree());

                }
                stream_parameterList.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parameterList"

    public static class parameterDefn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameterDefn"
    // msc_grammar.g:135:1: parameterDefn : binding ;
    public final msc_grammarParser.parameterDefn_return parameterDefn() throws RecognitionException {
        msc_grammarParser.parameterDefn_return retval = new msc_grammarParser.parameterDefn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.binding_return binding69 = null;



        try {
            // msc_grammar.g:136:2: ( binding )
            // msc_grammar.g:136:4: binding
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_binding_in_parameterDefn818);
            binding69=binding();

            state._fsp--;

            adaptor.addChild(root_0, binding69.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parameterDefn"

    public static class outputAddress_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "outputAddress"
    // msc_grammar.g:140:1: outputAddress : ( instanceName | 'env' ( 'via' gateName )? -> ^( MsgGate ( gateName )? ) );
    public final msc_grammarParser.outputAddress_return outputAddress() throws RecognitionException {
        msc_grammarParser.outputAddress_return retval = new msc_grammarParser.outputAddress_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal71=null;
        Token string_literal72=null;
        msc_grammarParser.instanceName_return instanceName70 = null;

        msc_grammarParser.gateName_return gateName73 = null;


        CommonTree string_literal71_tree=null;
        CommonTree string_literal72_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleSubtreeStream stream_gateName=new RewriteRuleSubtreeStream(adaptor,"rule gateName");
        try {
            // msc_grammar.g:141:2: ( instanceName | 'env' ( 'via' gateName )? -> ^( MsgGate ( gateName )? ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==NAME) ) {
                alt24=1;
            }
            else if ( (LA24_0==78) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // msc_grammar.g:141:4: instanceName
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_instanceName_in_outputAddress832);
                    instanceName70=instanceName();

                    state._fsp--;

                    adaptor.addChild(root_0, instanceName70.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:142:4: 'env' ( 'via' gateName )?
                    {
                    string_literal71=(Token)match(input,78,FOLLOW_78_in_outputAddress837);  
                    stream_78.add(string_literal71);

                    // msc_grammar.g:142:10: ( 'via' gateName )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==79) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // msc_grammar.g:142:12: 'via' gateName
                            {
                            string_literal72=(Token)match(input,79,FOLLOW_79_in_outputAddress841);  
                            stream_79.add(string_literal72);

                            pushFollow(FOLLOW_gateName_in_outputAddress843);
                            gateName73=gateName();

                            state._fsp--;

                            stream_gateName.add(gateName73.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: gateName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 142:30: -> ^( MsgGate ( gateName )? )
                    {
                        // msc_grammar.g:142:33: ^( MsgGate ( gateName )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MsgGate, "MsgGate"), root_1);

                        // msc_grammar.g:142:44: ( gateName )?
                        if ( stream_gateName.hasNext() ) {
                            adaptor.addChild(root_1, stream_gateName.nextTree());

                        }
                        stream_gateName.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "outputAddress"

    public static class inputAddress_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inputAddress"
    // msc_grammar.g:145:1: inputAddress : ( instanceName | 'env' ( 'via' gateName )? -> ^( MsgGate ( gateName )? ) );
    public final msc_grammarParser.inputAddress_return inputAddress() throws RecognitionException {
        msc_grammarParser.inputAddress_return retval = new msc_grammarParser.inputAddress_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal75=null;
        Token string_literal76=null;
        msc_grammarParser.instanceName_return instanceName74 = null;

        msc_grammarParser.gateName_return gateName77 = null;


        CommonTree string_literal75_tree=null;
        CommonTree string_literal76_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleSubtreeStream stream_gateName=new RewriteRuleSubtreeStream(adaptor,"rule gateName");
        try {
            // msc_grammar.g:146:2: ( instanceName | 'env' ( 'via' gateName )? -> ^( MsgGate ( gateName )? ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==NAME) ) {
                alt26=1;
            }
            else if ( (LA26_0==78) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // msc_grammar.g:146:4: instanceName
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_instanceName_in_inputAddress870);
                    instanceName74=instanceName();

                    state._fsp--;

                    adaptor.addChild(root_0, instanceName74.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:147:4: 'env' ( 'via' gateName )?
                    {
                    string_literal75=(Token)match(input,78,FOLLOW_78_in_inputAddress875);  
                    stream_78.add(string_literal75);

                    // msc_grammar.g:147:10: ( 'via' gateName )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==79) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // msc_grammar.g:147:12: 'via' gateName
                            {
                            string_literal76=(Token)match(input,79,FOLLOW_79_in_inputAddress879);  
                            stream_79.add(string_literal76);

                            pushFollow(FOLLOW_gateName_in_inputAddress881);
                            gateName77=gateName();

                            state._fsp--;

                            stream_gateName.add(gateName77.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: gateName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 147:30: -> ^( MsgGate ( gateName )? )
                    {
                        // msc_grammar.g:147:33: ^( MsgGate ( gateName )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MsgGate, "MsgGate"), root_1);

                        // msc_grammar.g:147:44: ( gateName )?
                        if ( stream_gateName.hasNext() ) {
                            adaptor.addChild(root_1, stream_gateName.nextTree());

                        }
                        stream_gateName.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "inputAddress"

    public static class action_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "action"
    // msc_grammar.g:150:1: action : 'action' actionStatement -> actionStatement ;
    public final msc_grammarParser.action_return action() throws RecognitionException {
        msc_grammarParser.action_return retval = new msc_grammarParser.action_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal78=null;
        msc_grammarParser.actionStatement_return actionStatement79 = null;


        CommonTree string_literal78_tree=null;
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleSubtreeStream stream_actionStatement=new RewriteRuleSubtreeStream(adaptor,"rule actionStatement");
        try {
            // msc_grammar.g:150:9: ( 'action' actionStatement -> actionStatement )
            // msc_grammar.g:150:11: 'action' actionStatement
            {
            string_literal78=(Token)match(input,80,FOLLOW_80_in_action907);  
            stream_80.add(string_literal78);

            pushFollow(FOLLOW_actionStatement_in_action909);
            actionStatement79=actionStatement();

            state._fsp--;

            stream_actionStatement.add(actionStatement79.getTree());


            // AST REWRITE
            // elements: actionStatement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 150:36: -> actionStatement
            {
                adaptor.addChild(root_0, stream_actionStatement.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "action"

    public static class actionStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actionStatement"
    // msc_grammar.g:152:1: actionStatement : ( informalAction -> ^( Action informalAction ) | dataStatementList -> ^( Action ^( Data dataStatementList ) ) );
    public final msc_grammarParser.actionStatement_return actionStatement() throws RecognitionException {
        msc_grammarParser.actionStatement_return retval = new msc_grammarParser.actionStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.informalAction_return informalAction80 = null;

        msc_grammarParser.dataStatementList_return dataStatementList81 = null;


        RewriteRuleSubtreeStream stream_dataStatementList=new RewriteRuleSubtreeStream(adaptor,"rule dataStatementList");
        RewriteRuleSubtreeStream stream_informalAction=new RewriteRuleSubtreeStream(adaptor,"rule informalAction");
        try {
            // msc_grammar.g:153:2: ( informalAction -> ^( Action informalAction ) | dataStatementList -> ^( Action ^( Data dataStatementList ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==CHARACTERSTRING) ) {
                alt27=1;
            }
            else if ( (LA27_0==NAME||(LA27_0>=114 && LA27_0<=115)) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // msc_grammar.g:153:4: informalAction
                    {
                    pushFollow(FOLLOW_informalAction_in_actionStatement924);
                    informalAction80=informalAction();

                    state._fsp--;

                    stream_informalAction.add(informalAction80.getTree());


                    // AST REWRITE
                    // elements: informalAction
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 153:19: -> ^( Action informalAction )
                    {
                        // msc_grammar.g:153:22: ^( Action informalAction )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Action, "Action"), root_1);

                        adaptor.addChild(root_1, stream_informalAction.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // msc_grammar.g:154:5: dataStatementList
                    {
                    pushFollow(FOLLOW_dataStatementList_in_actionStatement940);
                    dataStatementList81=dataStatementList();

                    state._fsp--;

                    stream_dataStatementList.add(dataStatementList81.getTree());


                    // AST REWRITE
                    // elements: dataStatementList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 154:23: -> ^( Action ^( Data dataStatementList ) )
                    {
                        // msc_grammar.g:154:26: ^( Action ^( Data dataStatementList ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Action, "Action"), root_1);

                        // msc_grammar.g:154:36: ^( Data dataStatementList )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Data, "Data"), root_2);

                        adaptor.addChild(root_2, stream_dataStatementList.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "actionStatement"

    public static class informalAction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "informalAction"
    // msc_grammar.g:156:1: informalAction : characterString ;
    public final msc_grammarParser.informalAction_return informalAction() throws RecognitionException {
        msc_grammarParser.informalAction_return retval = new msc_grammarParser.informalAction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.characterString_return characterString82 = null;



        try {
            // msc_grammar.g:157:2: ( characterString )
            // msc_grammar.g:157:4: characterString
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_characterString_in_informalAction967);
            characterString82=characterString();

            state._fsp--;

            adaptor.addChild(root_0, characterString82.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "informalAction"

    public static class instanceHeadStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instanceHeadStatement"
    // msc_grammar.g:160:1: instanceHeadStatement : 'instance' ( instanceKind )? ;
    public final msc_grammarParser.instanceHeadStatement_return instanceHeadStatement() throws RecognitionException {
        msc_grammarParser.instanceHeadStatement_return retval = new msc_grammarParser.instanceHeadStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal83=null;
        msc_grammarParser.instanceKind_return instanceKind84 = null;


        CommonTree string_literal83_tree=null;

        try {
            // msc_grammar.g:161:2: ( 'instance' ( instanceKind )? )
            // msc_grammar.g:161:4: 'instance' ( instanceKind )?
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal83=(Token)match(input,81,FOLLOW_81_in_instanceHeadStatement980); 
            string_literal83_tree = (CommonTree)adaptor.create(string_literal83);
            adaptor.addChild(root_0, string_literal83_tree);

            // msc_grammar.g:161:15: ( instanceKind )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==NAME||(LA28_0>=84 && LA28_0<=87)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // msc_grammar.g:161:17: instanceKind
                    {
                    pushFollow(FOLLOW_instanceKind_in_instanceHeadStatement984);
                    instanceKind84=instanceKind();

                    state._fsp--;

                    adaptor.addChild(root_0, instanceKind84.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instanceHeadStatement"

    public static class instanceEndStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instanceEndStatement"
    // msc_grammar.g:164:1: instanceEndStatement : 'endinstance' ;
    public final msc_grammarParser.instanceEndStatement_return instanceEndStatement() throws RecognitionException {
        msc_grammarParser.instanceEndStatement_return retval = new msc_grammarParser.instanceEndStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal85=null;

        CommonTree string_literal85_tree=null;

        try {
            // msc_grammar.g:165:2: ( 'endinstance' )
            // msc_grammar.g:165:4: 'endinstance'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal85=(Token)match(input,82,FOLLOW_82_in_instanceEndStatement1000); 
            string_literal85_tree = (CommonTree)adaptor.create(string_literal85);
            adaptor.addChild(root_0, string_literal85_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instanceEndStatement"

    public static class mscInterface_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mscInterface"
    // msc_grammar.g:168:1: mscInterface : ( mscInstInterface ( mscGateInterface )? | mscGateInterface );
    public final msc_grammarParser.mscInterface_return mscInterface() throws RecognitionException {
        msc_grammarParser.mscInterface_return retval = new msc_grammarParser.mscInterface_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.mscInstInterface_return mscInstInterface86 = null;

        msc_grammarParser.mscGateInterface_return mscGateInterface87 = null;

        msc_grammarParser.mscGateInterface_return mscGateInterface88 = null;



        try {
            // msc_grammar.g:169:2: ( mscInstInterface ( mscGateInterface )? | mscGateInterface )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==83) ) {
                alt30=1;
            }
            else if ( (LA30_0==106) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // msc_grammar.g:169:4: mscInstInterface ( mscGateInterface )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_mscInstInterface_in_mscInterface1012);
                    mscInstInterface86=mscInstInterface();

                    state._fsp--;

                    adaptor.addChild(root_0, mscInstInterface86.getTree());
                    // msc_grammar.g:169:21: ( mscGateInterface )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==106) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // msc_grammar.g:169:23: mscGateInterface
                            {
                            pushFollow(FOLLOW_mscGateInterface_in_mscInterface1016);
                            mscGateInterface87=mscGateInterface();

                            state._fsp--;

                            adaptor.addChild(root_0, mscGateInterface87.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // msc_grammar.g:169:45: mscGateInterface
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_mscGateInterface_in_mscInterface1023);
                    mscGateInterface88=mscGateInterface();

                    state._fsp--;

                    adaptor.addChild(root_0, mscGateInterface88.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mscInterface"

    public static class mscInstInterface_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mscInstInterface"
    // msc_grammar.g:172:1: mscInstInterface : 'inst' instanceList end ;
    public final msc_grammarParser.mscInstInterface_return mscInstInterface() throws RecognitionException {
        msc_grammarParser.mscInstInterface_return retval = new msc_grammarParser.mscInstInterface_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal89=null;
        msc_grammarParser.instanceList_return instanceList90 = null;

        msc_grammarParser.end_return end91 = null;


        CommonTree string_literal89_tree=null;

        try {
            // msc_grammar.g:173:2: ( 'inst' instanceList end )
            // msc_grammar.g:173:4: 'inst' instanceList end
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal89=(Token)match(input,83,FOLLOW_83_in_mscInstInterface1036); 
            string_literal89_tree = (CommonTree)adaptor.create(string_literal89);
            adaptor.addChild(root_0, string_literal89_tree);

            pushFollow(FOLLOW_instanceList_in_mscInstInterface1038);
            instanceList90=instanceList();

            state._fsp--;

            adaptor.addChild(root_0, instanceList90.getTree());
            pushFollow(FOLLOW_end_in_mscInstInterface1040);
            end91=end();

            state._fsp--;

            adaptor.addChild(root_0, end91.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mscInstInterface"

    public static class instanceList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instanceList"
    // msc_grammar.g:176:1: instanceList : instanceName ( ':' instanceKind )? ( ',' instanceList )? ;
    public final msc_grammarParser.instanceList_return instanceList() throws RecognitionException {
        msc_grammarParser.instanceList_return retval = new msc_grammarParser.instanceList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal93=null;
        Token char_literal95=null;
        msc_grammarParser.instanceName_return instanceName92 = null;

        msc_grammarParser.instanceKind_return instanceKind94 = null;

        msc_grammarParser.instanceList_return instanceList96 = null;


        CommonTree char_literal93_tree=null;
        CommonTree char_literal95_tree=null;

        try {
            // msc_grammar.g:177:2: ( instanceName ( ':' instanceKind )? ( ',' instanceList )? )
            // msc_grammar.g:177:4: instanceName ( ':' instanceKind )? ( ',' instanceList )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_instanceName_in_instanceList1053);
            instanceName92=instanceName();

            state._fsp--;

            adaptor.addChild(root_0, instanceName92.getTree());
            // msc_grammar.g:177:17: ( ':' instanceKind )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==67) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // msc_grammar.g:177:19: ':' instanceKind
                    {
                    char_literal93=(Token)match(input,67,FOLLOW_67_in_instanceList1057); 
                    char_literal93_tree = (CommonTree)adaptor.create(char_literal93);
                    adaptor.addChild(root_0, char_literal93_tree);

                    pushFollow(FOLLOW_instanceKind_in_instanceList1059);
                    instanceKind94=instanceKind();

                    state._fsp--;

                    adaptor.addChild(root_0, instanceKind94.getTree());

                    }
                    break;

            }

            // msc_grammar.g:177:39: ( ',' instanceList )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==68) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // msc_grammar.g:177:41: ',' instanceList
                    {
                    char_literal95=(Token)match(input,68,FOLLOW_68_in_instanceList1066); 
                    char_literal95_tree = (CommonTree)adaptor.create(char_literal95);
                    adaptor.addChild(root_0, char_literal95_tree);

                    pushFollow(FOLLOW_instanceList_in_instanceList1068);
                    instanceList96=instanceList();

                    state._fsp--;

                    adaptor.addChild(root_0, instanceList96.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instanceList"

    public static class instanceKind_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instanceKind"
    // msc_grammar.g:180:1: instanceKind : ( kindDenominator )? identifier ;
    public final msc_grammarParser.instanceKind_return instanceKind() throws RecognitionException {
        msc_grammarParser.instanceKind_return retval = new msc_grammarParser.instanceKind_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.kindDenominator_return kindDenominator97 = null;

        msc_grammarParser.identifier_return identifier98 = null;



        try {
            // msc_grammar.g:181:2: ( ( kindDenominator )? identifier )
            // msc_grammar.g:181:4: ( kindDenominator )? identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            // msc_grammar.g:181:4: ( kindDenominator )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=84 && LA33_0<=87)) ) {
                alt33=1;
            }
            else if ( (LA33_0==NAME) ) {
                int LA33_2 = input.LA(2);

                if ( (LA33_2==NAME) ) {
                    alt33=1;
                }
            }
            switch (alt33) {
                case 1 :
                    // msc_grammar.g:181:6: kindDenominator
                    {
                    pushFollow(FOLLOW_kindDenominator_in_instanceKind1086);
                    kindDenominator97=kindDenominator();

                    state._fsp--;

                    adaptor.addChild(root_0, kindDenominator97.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_identifier_in_instanceKind1091);
            identifier98=identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier98.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instanceKind"

    public static class kindDenominator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kindDenominator"
    // msc_grammar.g:184:1: kindDenominator : ( 'system' | 'block' | 'process' | 'service' | name );
    public final msc_grammarParser.kindDenominator_return kindDenominator() throws RecognitionException {
        msc_grammarParser.kindDenominator_return retval = new msc_grammarParser.kindDenominator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal99=null;
        Token string_literal100=null;
        Token string_literal101=null;
        Token string_literal102=null;
        msc_grammarParser.name_return name103 = null;


        CommonTree string_literal99_tree=null;
        CommonTree string_literal100_tree=null;
        CommonTree string_literal101_tree=null;
        CommonTree string_literal102_tree=null;

        try {
            // msc_grammar.g:185:2: ( 'system' | 'block' | 'process' | 'service' | name )
            int alt34=5;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt34=1;
                }
                break;
            case 85:
                {
                alt34=2;
                }
                break;
            case 86:
                {
                alt34=3;
                }
                break;
            case 87:
                {
                alt34=4;
                }
                break;
            case NAME:
                {
                alt34=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // msc_grammar.g:185:4: 'system'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal99=(Token)match(input,84,FOLLOW_84_in_kindDenominator1104); 
                    string_literal99_tree = (CommonTree)adaptor.create(string_literal99);
                    adaptor.addChild(root_0, string_literal99_tree);


                    }
                    break;
                case 2 :
                    // msc_grammar.g:185:15: 'block'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal100=(Token)match(input,85,FOLLOW_85_in_kindDenominator1108); 
                    string_literal100_tree = (CommonTree)adaptor.create(string_literal100);
                    adaptor.addChild(root_0, string_literal100_tree);


                    }
                    break;
                case 3 :
                    // msc_grammar.g:185:25: 'process'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal101=(Token)match(input,86,FOLLOW_86_in_kindDenominator1112); 
                    string_literal101_tree = (CommonTree)adaptor.create(string_literal101);
                    adaptor.addChild(root_0, string_literal101_tree);


                    }
                    break;
                case 4 :
                    // msc_grammar.g:185:37: 'service'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal102=(Token)match(input,87,FOLLOW_87_in_kindDenominator1116); 
                    string_literal102_tree = (CommonTree)adaptor.create(string_literal102);
                    adaptor.addChild(root_0, string_literal102_tree);


                    }
                    break;
                case 5 :
                    // msc_grammar.g:185:49: name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_name_in_kindDenominator1120);
                    name103=name();

                    state._fsp--;

                    adaptor.addChild(root_0, name103.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "kindDenominator"

    public static class end_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "end"
    // msc_grammar.g:188:1: end : ';' ;
    public final msc_grammarParser.end_return end() throws RecognitionException {
        msc_grammarParser.end_return retval = new msc_grammarParser.end_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal104=null;

        CommonTree char_literal104_tree=null;

        try {
            // msc_grammar.g:188:6: ( ';' )
            // msc_grammar.g:188:8: ';'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal104=(Token)match(input,88,FOLLOW_88_in_end1131); 
            char_literal104_tree = (CommonTree)adaptor.create(char_literal104);
            adaptor.addChild(root_0, char_literal104_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "end"

    public static class condition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condition"
    // msc_grammar.g:192:1: condition : conditionIdentification ;
    public final msc_grammarParser.condition_return condition() throws RecognitionException {
        msc_grammarParser.condition_return retval = new msc_grammarParser.condition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.conditionIdentification_return conditionIdentification105 = null;



        try {
            // msc_grammar.g:193:2: ( conditionIdentification )
            // msc_grammar.g:193:4: conditionIdentification
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_conditionIdentification_in_condition1144);
            conditionIdentification105=conditionIdentification();

            state._fsp--;

            adaptor.addChild(root_0, conditionIdentification105.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condition"

    public static class conditionIdentification_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionIdentification"
    // msc_grammar.g:195:1: conditionIdentification : 'condition' conditionText -> ^( Condition conditionText ) ;
    public final msc_grammarParser.conditionIdentification_return conditionIdentification() throws RecognitionException {
        msc_grammarParser.conditionIdentification_return retval = new msc_grammarParser.conditionIdentification_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal106=null;
        msc_grammarParser.conditionText_return conditionText107 = null;


        CommonTree string_literal106_tree=null;
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_conditionText=new RewriteRuleSubtreeStream(adaptor,"rule conditionText");
        try {
            // msc_grammar.g:196:2: ( 'condition' conditionText -> ^( Condition conditionText ) )
            // msc_grammar.g:196:4: 'condition' conditionText
            {
            string_literal106=(Token)match(input,89,FOLLOW_89_in_conditionIdentification1155);  
            stream_89.add(string_literal106);

            pushFollow(FOLLOW_conditionText_in_conditionIdentification1157);
            conditionText107=conditionText();

            state._fsp--;

            stream_conditionText.add(conditionText107.getTree());


            // AST REWRITE
            // elements: conditionText
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 196:30: -> ^( Condition conditionText )
            {
                // msc_grammar.g:196:33: ^( Condition conditionText )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Condition, "Condition"), root_1);

                adaptor.addChild(root_1, stream_conditionText.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditionIdentification"

    public static class conditionText_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionText"
    // msc_grammar.g:198:1: conditionText : ( conditionNameList -> ^( SetCond conditionNameList ) | WHEN conditionGuard -> conditionGuard | OTHERWISE -> ^( ElseCond ) );
    public final msc_grammarParser.conditionText_return conditionText() throws RecognitionException {
        msc_grammarParser.conditionText_return retval = new msc_grammarParser.conditionText_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHEN109=null;
        Token OTHERWISE111=null;
        msc_grammarParser.conditionNameList_return conditionNameList108 = null;

        msc_grammarParser.conditionGuard_return conditionGuard110 = null;


        CommonTree WHEN109_tree=null;
        CommonTree OTHERWISE111_tree=null;
        RewriteRuleTokenStream stream_WHEN=new RewriteRuleTokenStream(adaptor,"token WHEN");
        RewriteRuleTokenStream stream_OTHERWISE=new RewriteRuleTokenStream(adaptor,"token OTHERWISE");
        RewriteRuleSubtreeStream stream_conditionGuard=new RewriteRuleSubtreeStream(adaptor,"rule conditionGuard");
        RewriteRuleSubtreeStream stream_conditionNameList=new RewriteRuleSubtreeStream(adaptor,"rule conditionNameList");
        try {
            // msc_grammar.g:199:2: ( conditionNameList -> ^( SetCond conditionNameList ) | WHEN conditionGuard -> conditionGuard | OTHERWISE -> ^( ElseCond ) )
            int alt35=3;
            switch ( input.LA(1) ) {
            case NAME:
                {
                alt35=1;
                }
                break;
            case WHEN:
                {
                alt35=2;
                }
                break;
            case OTHERWISE:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // msc_grammar.g:199:4: conditionNameList
                    {
                    pushFollow(FOLLOW_conditionNameList_in_conditionText1178);
                    conditionNameList108=conditionNameList();

                    state._fsp--;

                    stream_conditionNameList.add(conditionNameList108.getTree());


                    // AST REWRITE
                    // elements: conditionNameList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 199:23: -> ^( SetCond conditionNameList )
                    {
                        // msc_grammar.g:199:26: ^( SetCond conditionNameList )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SetCond, "SetCond"), root_1);

                        adaptor.addChild(root_1, stream_conditionNameList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // msc_grammar.g:200:4: WHEN conditionGuard
                    {
                    WHEN109=(Token)match(input,WHEN,FOLLOW_WHEN_in_conditionText1194);  
                    stream_WHEN.add(WHEN109);

                    pushFollow(FOLLOW_conditionGuard_in_conditionText1196);
                    conditionGuard110=conditionGuard();

                    state._fsp--;

                    stream_conditionGuard.add(conditionGuard110.getTree());


                    // AST REWRITE
                    // elements: conditionGuard
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 200:24: -> conditionGuard
                    {
                        adaptor.addChild(root_0, stream_conditionGuard.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // msc_grammar.g:201:5: OTHERWISE
                    {
                    OTHERWISE111=(Token)match(input,OTHERWISE,FOLLOW_OTHERWISE_in_conditionText1206);  
                    stream_OTHERWISE.add(OTHERWISE111);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 201:17: -> ^( ElseCond )
                    {
                        // msc_grammar.g:201:20: ^( ElseCond )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ElseCond, "ElseCond"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditionText"

    public static class conditionGuard_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionGuard"
    // msc_grammar.g:203:1: conditionGuard : ( conditionNameList -> ^( GuardCond conditionNameList ) | '(' expressionString ')' -> ^( DataGuardCond ^( Data expressionString ) ) );
    public final msc_grammarParser.conditionGuard_return conditionGuard() throws RecognitionException {
        msc_grammarParser.conditionGuard_return retval = new msc_grammarParser.conditionGuard_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal113=null;
        Token char_literal115=null;
        msc_grammarParser.conditionNameList_return conditionNameList112 = null;

        msc_grammarParser.expressionString_return expressionString114 = null;


        CommonTree char_literal113_tree=null;
        CommonTree char_literal115_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_expressionString=new RewriteRuleSubtreeStream(adaptor,"rule expressionString");
        RewriteRuleSubtreeStream stream_conditionNameList=new RewriteRuleSubtreeStream(adaptor,"rule conditionNameList");
        try {
            // msc_grammar.g:204:2: ( conditionNameList -> ^( GuardCond conditionNameList ) | '(' expressionString ')' -> ^( DataGuardCond ^( Data expressionString ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==NAME) ) {
                alt36=1;
            }
            else if ( (LA36_0==76) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // msc_grammar.g:204:4: conditionNameList
                    {
                    pushFollow(FOLLOW_conditionNameList_in_conditionGuard1227);
                    conditionNameList112=conditionNameList();

                    state._fsp--;

                    stream_conditionNameList.add(conditionNameList112.getTree());


                    // AST REWRITE
                    // elements: conditionNameList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 204:23: -> ^( GuardCond conditionNameList )
                    {
                        // msc_grammar.g:204:26: ^( GuardCond conditionNameList )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GuardCond, "GuardCond"), root_1);

                        adaptor.addChild(root_1, stream_conditionNameList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // msc_grammar.g:205:5: '(' expressionString ')'
                    {
                    char_literal113=(Token)match(input,76,FOLLOW_76_in_conditionGuard1244);  
                    stream_76.add(char_literal113);

                    pushFollow(FOLLOW_expressionString_in_conditionGuard1246);
                    expressionString114=expressionString();

                    state._fsp--;

                    stream_expressionString.add(expressionString114.getTree());
                    char_literal115=(Token)match(input,77,FOLLOW_77_in_conditionGuard1248);  
                    stream_77.add(char_literal115);



                    // AST REWRITE
                    // elements: expressionString
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 205:31: -> ^( DataGuardCond ^( Data expressionString ) )
                    {
                        // msc_grammar.g:205:34: ^( DataGuardCond ^( Data expressionString ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DataGuardCond, "DataGuardCond"), root_1);

                        // msc_grammar.g:205:51: ^( Data expressionString )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Data, "Data"), root_2);

                        adaptor.addChild(root_2, stream_expressionString.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditionGuard"

    public static class conditionNameList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionNameList"
    // msc_grammar.g:207:1: conditionNameList : NAME ( ',' NAME )* -> ( NAME )+ ;
    public final msc_grammarParser.conditionNameList_return conditionNameList() throws RecognitionException {
        msc_grammarParser.conditionNameList_return retval = new msc_grammarParser.conditionNameList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME116=null;
        Token char_literal117=null;
        Token NAME118=null;

        CommonTree NAME116_tree=null;
        CommonTree char_literal117_tree=null;
        CommonTree NAME118_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");

        try {
            // msc_grammar.g:208:2: ( NAME ( ',' NAME )* -> ( NAME )+ )
            // msc_grammar.g:208:4: NAME ( ',' NAME )*
            {
            NAME116=(Token)match(input,NAME,FOLLOW_NAME_in_conditionNameList1276);  
            stream_NAME.add(NAME116);

            // msc_grammar.g:208:9: ( ',' NAME )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==68) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // msc_grammar.g:208:11: ',' NAME
            	    {
            	    char_literal117=(Token)match(input,68,FOLLOW_68_in_conditionNameList1280);  
            	    stream_68.add(char_literal117);

            	    NAME118=(Token)match(input,NAME,FOLLOW_NAME_in_conditionNameList1282);  
            	    stream_NAME.add(NAME118);


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);



            // AST REWRITE
            // elements: NAME
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 208:23: -> ( NAME )+
            {
                if ( !(stream_NAME.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_NAME.hasNext() ) {
                    adaptor.addChild(root_0, stream_NAME.nextNode());

                }
                stream_NAME.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditionNameList"

    public static class inlineExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inlineExpr"
    // msc_grammar.g:212:1: inlineExpr : ( loopExpr | optExpr | altExpr | parExpr | excExpr );
    public final msc_grammarParser.inlineExpr_return inlineExpr() throws RecognitionException {
        msc_grammarParser.inlineExpr_return retval = new msc_grammarParser.inlineExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.loopExpr_return loopExpr119 = null;

        msc_grammarParser.optExpr_return optExpr120 = null;

        msc_grammarParser.altExpr_return altExpr121 = null;

        msc_grammarParser.parExpr_return parExpr122 = null;

        msc_grammarParser.excExpr_return excExpr123 = null;



        try {
            // msc_grammar.g:213:2: ( loopExpr | optExpr | altExpr | parExpr | excExpr )
            int alt38=5;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt38=1;
                }
                break;
            case 91:
                {
                alt38=2;
                }
                break;
            case 93:
                {
                alt38=3;
                }
                break;
            case 94:
                {
                alt38=4;
                }
                break;
            case 92:
                {
                alt38=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // msc_grammar.g:213:4: loopExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_loopExpr_in_inlineExpr1303);
                    loopExpr119=loopExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, loopExpr119.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:213:15: optExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_optExpr_in_inlineExpr1307);
                    optExpr120=optExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, optExpr120.getTree());

                    }
                    break;
                case 3 :
                    // msc_grammar.g:213:25: altExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_altExpr_in_inlineExpr1311);
                    altExpr121=altExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, altExpr121.getTree());

                    }
                    break;
                case 4 :
                    // msc_grammar.g:213:35: parExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parExpr_in_inlineExpr1315);
                    parExpr122=parExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, parExpr122.getTree());

                    }
                    break;
                case 5 :
                    // msc_grammar.g:213:45: excExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_excExpr_in_inlineExpr1319);
                    excExpr123=excExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, excExpr123.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "inlineExpr"

    public static class loopExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "loopExpr"
    // msc_grammar.g:215:1: loopExpr : 'loop' ( loopBoundary )? BEGIN end mscBody 'loop' END -> ^( Loop mscBody ( loopBoundary )? ) ;
    public final msc_grammarParser.loopExpr_return loopExpr() throws RecognitionException {
        msc_grammarParser.loopExpr_return retval = new msc_grammarParser.loopExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal124=null;
        Token BEGIN126=null;
        Token string_literal129=null;
        Token END130=null;
        msc_grammarParser.loopBoundary_return loopBoundary125 = null;

        msc_grammarParser.end_return end127 = null;

        msc_grammarParser.mscBody_return mscBody128 = null;


        CommonTree string_literal124_tree=null;
        CommonTree BEGIN126_tree=null;
        CommonTree string_literal129_tree=null;
        CommonTree END130_tree=null;
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_loopBoundary=new RewriteRuleSubtreeStream(adaptor,"rule loopBoundary");
        RewriteRuleSubtreeStream stream_mscBody=new RewriteRuleSubtreeStream(adaptor,"rule mscBody");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:216:2: ( 'loop' ( loopBoundary )? BEGIN end mscBody 'loop' END -> ^( Loop mscBody ( loopBoundary )? ) )
            // msc_grammar.g:216:4: 'loop' ( loopBoundary )? BEGIN end mscBody 'loop' END
            {
            string_literal124=(Token)match(input,90,FOLLOW_90_in_loopExpr1330);  
            stream_90.add(string_literal124);

            // msc_grammar.g:216:11: ( loopBoundary )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==95) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // msc_grammar.g:216:13: loopBoundary
                    {
                    pushFollow(FOLLOW_loopBoundary_in_loopExpr1334);
                    loopBoundary125=loopBoundary();

                    state._fsp--;

                    stream_loopBoundary.add(loopBoundary125.getTree());

                    }
                    break;

            }

            BEGIN126=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_loopExpr1339);  
            stream_BEGIN.add(BEGIN126);

            pushFollow(FOLLOW_end_in_loopExpr1341);
            end127=end();

            state._fsp--;

            stream_end.add(end127.getTree());
            pushFollow(FOLLOW_mscBody_in_loopExpr1343);
            mscBody128=mscBody();

            state._fsp--;

            stream_mscBody.add(mscBody128.getTree());
            string_literal129=(Token)match(input,90,FOLLOW_90_in_loopExpr1345);  
            stream_90.add(string_literal129);

            END130=(Token)match(input,END,FOLLOW_END_in_loopExpr1347);  
            stream_END.add(END130);



            // AST REWRITE
            // elements: mscBody, loopBoundary
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 216:58: -> ^( Loop mscBody ( loopBoundary )? )
            {
                // msc_grammar.g:216:61: ^( Loop mscBody ( loopBoundary )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Loop, "Loop"), root_1);

                adaptor.addChild(root_1, stream_mscBody.nextTree());
                // msc_grammar.g:216:77: ( loopBoundary )?
                if ( stream_loopBoundary.hasNext() ) {
                    adaptor.addChild(root_1, stream_loopBoundary.nextTree());

                }
                stream_loopBoundary.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "loopExpr"

    public static class optExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "optExpr"
    // msc_grammar.g:218:1: optExpr : 'opt' BEGIN end mscBody 'opt' END -> ^( Opt mscBody ) ;
    public final msc_grammarParser.optExpr_return optExpr() throws RecognitionException {
        msc_grammarParser.optExpr_return retval = new msc_grammarParser.optExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal131=null;
        Token BEGIN132=null;
        Token string_literal135=null;
        Token END136=null;
        msc_grammarParser.end_return end133 = null;

        msc_grammarParser.mscBody_return mscBody134 = null;


        CommonTree string_literal131_tree=null;
        CommonTree BEGIN132_tree=null;
        CommonTree string_literal135_tree=null;
        CommonTree END136_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_mscBody=new RewriteRuleSubtreeStream(adaptor,"rule mscBody");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:218:9: ( 'opt' BEGIN end mscBody 'opt' END -> ^( Opt mscBody ) )
            // msc_grammar.g:218:11: 'opt' BEGIN end mscBody 'opt' END
            {
            string_literal131=(Token)match(input,91,FOLLOW_91_in_optExpr1369);  
            stream_91.add(string_literal131);

            BEGIN132=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_optExpr1371);  
            stream_BEGIN.add(BEGIN132);

            pushFollow(FOLLOW_end_in_optExpr1373);
            end133=end();

            state._fsp--;

            stream_end.add(end133.getTree());
            pushFollow(FOLLOW_mscBody_in_optExpr1375);
            mscBody134=mscBody();

            state._fsp--;

            stream_mscBody.add(mscBody134.getTree());
            string_literal135=(Token)match(input,91,FOLLOW_91_in_optExpr1377);  
            stream_91.add(string_literal135);

            END136=(Token)match(input,END,FOLLOW_END_in_optExpr1379);  
            stream_END.add(END136);



            // AST REWRITE
            // elements: mscBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 218:45: -> ^( Opt mscBody )
            {
                // msc_grammar.g:218:48: ^( Opt mscBody )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Opt, "Opt"), root_1);

                adaptor.addChild(root_1, stream_mscBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "optExpr"

    public static class excExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "excExpr"
    // msc_grammar.g:220:1: excExpr : 'exc' BEGIN end mscBody 'exc' END -> ^( Exc mscBody ) ;
    public final msc_grammarParser.excExpr_return excExpr() throws RecognitionException {
        msc_grammarParser.excExpr_return retval = new msc_grammarParser.excExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal137=null;
        Token BEGIN138=null;
        Token string_literal141=null;
        Token END142=null;
        msc_grammarParser.end_return end139 = null;

        msc_grammarParser.mscBody_return mscBody140 = null;


        CommonTree string_literal137_tree=null;
        CommonTree BEGIN138_tree=null;
        CommonTree string_literal141_tree=null;
        CommonTree END142_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_mscBody=new RewriteRuleSubtreeStream(adaptor,"rule mscBody");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:220:9: ( 'exc' BEGIN end mscBody 'exc' END -> ^( Exc mscBody ) )
            // msc_grammar.g:220:11: 'exc' BEGIN end mscBody 'exc' END
            {
            string_literal137=(Token)match(input,92,FOLLOW_92_in_excExpr1398);  
            stream_92.add(string_literal137);

            BEGIN138=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_excExpr1400);  
            stream_BEGIN.add(BEGIN138);

            pushFollow(FOLLOW_end_in_excExpr1402);
            end139=end();

            state._fsp--;

            stream_end.add(end139.getTree());
            pushFollow(FOLLOW_mscBody_in_excExpr1404);
            mscBody140=mscBody();

            state._fsp--;

            stream_mscBody.add(mscBody140.getTree());
            string_literal141=(Token)match(input,92,FOLLOW_92_in_excExpr1406);  
            stream_92.add(string_literal141);

            END142=(Token)match(input,END,FOLLOW_END_in_excExpr1408);  
            stream_END.add(END142);



            // AST REWRITE
            // elements: mscBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 220:45: -> ^( Exc mscBody )
            {
                // msc_grammar.g:220:48: ^( Exc mscBody )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Exc, "Exc"), root_1);

                adaptor.addChild(root_1, stream_mscBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "excExpr"

    public static class altExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "altExpr"
    // msc_grammar.g:222:1: altExpr : 'alt' BEGIN end mscBody ( 'alt' end mscBody )* 'alt' END -> ^( Alt ( mscBody )+ ) ;
    public final msc_grammarParser.altExpr_return altExpr() throws RecognitionException {
        msc_grammarParser.altExpr_return retval = new msc_grammarParser.altExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal143=null;
        Token BEGIN144=null;
        Token string_literal147=null;
        Token string_literal150=null;
        Token END151=null;
        msc_grammarParser.end_return end145 = null;

        msc_grammarParser.mscBody_return mscBody146 = null;

        msc_grammarParser.end_return end148 = null;

        msc_grammarParser.mscBody_return mscBody149 = null;


        CommonTree string_literal143_tree=null;
        CommonTree BEGIN144_tree=null;
        CommonTree string_literal147_tree=null;
        CommonTree string_literal150_tree=null;
        CommonTree END151_tree=null;
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_mscBody=new RewriteRuleSubtreeStream(adaptor,"rule mscBody");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:222:9: ( 'alt' BEGIN end mscBody ( 'alt' end mscBody )* 'alt' END -> ^( Alt ( mscBody )+ ) )
            // msc_grammar.g:222:11: 'alt' BEGIN end mscBody ( 'alt' end mscBody )* 'alt' END
            {
            string_literal143=(Token)match(input,93,FOLLOW_93_in_altExpr1427);  
            stream_93.add(string_literal143);

            BEGIN144=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_altExpr1429);  
            stream_BEGIN.add(BEGIN144);

            pushFollow(FOLLOW_end_in_altExpr1431);
            end145=end();

            state._fsp--;

            stream_end.add(end145.getTree());
            pushFollow(FOLLOW_mscBody_in_altExpr1433);
            mscBody146=mscBody();

            state._fsp--;

            stream_mscBody.add(mscBody146.getTree());
            // msc_grammar.g:222:35: ( 'alt' end mscBody )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==93) ) {
                    int LA40_1 = input.LA(2);

                    if ( (LA40_1==88) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // msc_grammar.g:222:37: 'alt' end mscBody
            	    {
            	    string_literal147=(Token)match(input,93,FOLLOW_93_in_altExpr1437);  
            	    stream_93.add(string_literal147);

            	    pushFollow(FOLLOW_end_in_altExpr1439);
            	    end148=end();

            	    state._fsp--;

            	    stream_end.add(end148.getTree());
            	    pushFollow(FOLLOW_mscBody_in_altExpr1441);
            	    mscBody149=mscBody();

            	    state._fsp--;

            	    stream_mscBody.add(mscBody149.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            string_literal150=(Token)match(input,93,FOLLOW_93_in_altExpr1446);  
            stream_93.add(string_literal150);

            END151=(Token)match(input,END,FOLLOW_END_in_altExpr1448);  
            stream_END.add(END151);



            // AST REWRITE
            // elements: mscBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 222:68: -> ^( Alt ( mscBody )+ )
            {
                // msc_grammar.g:222:71: ^( Alt ( mscBody )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Alt, "Alt"), root_1);

                if ( !(stream_mscBody.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_mscBody.hasNext() ) {
                    adaptor.addChild(root_1, stream_mscBody.nextTree());

                }
                stream_mscBody.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "altExpr"

    public static class parExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parExpr"
    // msc_grammar.g:224:1: parExpr : 'par' BEGIN end mscBody ( 'par' end mscBody )* 'par' END -> ^( Par ( mscBody )+ ) ;
    public final msc_grammarParser.parExpr_return parExpr() throws RecognitionException {
        msc_grammarParser.parExpr_return retval = new msc_grammarParser.parExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal152=null;
        Token BEGIN153=null;
        Token string_literal156=null;
        Token string_literal159=null;
        Token END160=null;
        msc_grammarParser.end_return end154 = null;

        msc_grammarParser.mscBody_return mscBody155 = null;

        msc_grammarParser.end_return end157 = null;

        msc_grammarParser.mscBody_return mscBody158 = null;


        CommonTree string_literal152_tree=null;
        CommonTree BEGIN153_tree=null;
        CommonTree string_literal156_tree=null;
        CommonTree string_literal159_tree=null;
        CommonTree END160_tree=null;
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_mscBody=new RewriteRuleSubtreeStream(adaptor,"rule mscBody");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:224:9: ( 'par' BEGIN end mscBody ( 'par' end mscBody )* 'par' END -> ^( Par ( mscBody )+ ) )
            // msc_grammar.g:224:11: 'par' BEGIN end mscBody ( 'par' end mscBody )* 'par' END
            {
            string_literal152=(Token)match(input,94,FOLLOW_94_in_parExpr1468);  
            stream_94.add(string_literal152);

            BEGIN153=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_parExpr1470);  
            stream_BEGIN.add(BEGIN153);

            pushFollow(FOLLOW_end_in_parExpr1472);
            end154=end();

            state._fsp--;

            stream_end.add(end154.getTree());
            pushFollow(FOLLOW_mscBody_in_parExpr1474);
            mscBody155=mscBody();

            state._fsp--;

            stream_mscBody.add(mscBody155.getTree());
            // msc_grammar.g:224:35: ( 'par' end mscBody )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==94) ) {
                    int LA41_1 = input.LA(2);

                    if ( (LA41_1==88) ) {
                        alt41=1;
                    }


                }


                switch (alt41) {
            	case 1 :
            	    // msc_grammar.g:224:37: 'par' end mscBody
            	    {
            	    string_literal156=(Token)match(input,94,FOLLOW_94_in_parExpr1478);  
            	    stream_94.add(string_literal156);

            	    pushFollow(FOLLOW_end_in_parExpr1480);
            	    end157=end();

            	    state._fsp--;

            	    stream_end.add(end157.getTree());
            	    pushFollow(FOLLOW_mscBody_in_parExpr1482);
            	    mscBody158=mscBody();

            	    state._fsp--;

            	    stream_mscBody.add(mscBody158.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            string_literal159=(Token)match(input,94,FOLLOW_94_in_parExpr1487);  
            stream_94.add(string_literal159);

            END160=(Token)match(input,END,FOLLOW_END_in_parExpr1489);  
            stream_END.add(END160);



            // AST REWRITE
            // elements: mscBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 224:68: -> ^( Par ( mscBody )+ )
            {
                // msc_grammar.g:224:71: ^( Par ( mscBody )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Par, "Par"), root_1);

                if ( !(stream_mscBody.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_mscBody.hasNext() ) {
                    adaptor.addChild(root_1, stream_mscBody.nextTree());

                }
                stream_mscBody.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parExpr"

    public static class loopBoundary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "loopBoundary"
    // msc_grammar.g:226:1: loopBoundary : '<' infNatural ( ',' infNatural )? '>' -> ^( LoopBoundary ( infNatural )+ ) ;
    public final msc_grammarParser.loopBoundary_return loopBoundary() throws RecognitionException {
        msc_grammarParser.loopBoundary_return retval = new msc_grammarParser.loopBoundary_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal161=null;
        Token char_literal163=null;
        Token char_literal165=null;
        msc_grammarParser.infNatural_return infNatural162 = null;

        msc_grammarParser.infNatural_return infNatural164 = null;


        CommonTree char_literal161_tree=null;
        CommonTree char_literal163_tree=null;
        CommonTree char_literal165_tree=null;
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleSubtreeStream stream_infNatural=new RewriteRuleSubtreeStream(adaptor,"rule infNatural");
        try {
            // msc_grammar.g:227:2: ( '<' infNatural ( ',' infNatural )? '>' -> ^( LoopBoundary ( infNatural )+ ) )
            // msc_grammar.g:227:4: '<' infNatural ( ',' infNatural )? '>'
            {
            char_literal161=(Token)match(input,95,FOLLOW_95_in_loopBoundary1510);  
            stream_95.add(char_literal161);

            pushFollow(FOLLOW_infNatural_in_loopBoundary1512);
            infNatural162=infNatural();

            state._fsp--;

            stream_infNatural.add(infNatural162.getTree());
            // msc_grammar.g:227:19: ( ',' infNatural )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==68) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // msc_grammar.g:227:21: ',' infNatural
                    {
                    char_literal163=(Token)match(input,68,FOLLOW_68_in_loopBoundary1516);  
                    stream_68.add(char_literal163);

                    pushFollow(FOLLOW_infNatural_in_loopBoundary1518);
                    infNatural164=infNatural();

                    state._fsp--;

                    stream_infNatural.add(infNatural164.getTree());

                    }
                    break;

            }

            char_literal165=(Token)match(input,96,FOLLOW_96_in_loopBoundary1523);  
            stream_96.add(char_literal165);



            // AST REWRITE
            // elements: infNatural
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 227:43: -> ^( LoopBoundary ( infNatural )+ )
            {
                // msc_grammar.g:227:46: ^( LoopBoundary ( infNatural )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LoopBoundary, "LoopBoundary"), root_1);

                if ( !(stream_infNatural.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_infNatural.hasNext() ) {
                    adaptor.addChild(root_1, stream_infNatural.nextTree());

                }
                stream_infNatural.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "loopBoundary"

    public static class infNatural_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "infNatural"
    // msc_grammar.g:229:1: infNatural : ( 'inf' | '\"' expressionString '\"' );
    public final msc_grammarParser.infNatural_return infNatural() throws RecognitionException {
        msc_grammarParser.infNatural_return retval = new msc_grammarParser.infNatural_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal166=null;
        Token char_literal167=null;
        Token char_literal169=null;
        msc_grammarParser.expressionString_return expressionString168 = null;


        CommonTree string_literal166_tree=null;
        CommonTree char_literal167_tree=null;
        CommonTree char_literal169_tree=null;

        try {
            // msc_grammar.g:230:2: ( 'inf' | '\"' expressionString '\"' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==97) ) {
                alt43=1;
            }
            else if ( (LA43_0==98) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // msc_grammar.g:230:4: 'inf'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal166=(Token)match(input,97,FOLLOW_97_in_infNatural1545); 
                    string_literal166_tree = (CommonTree)adaptor.create(string_literal166);
                    adaptor.addChild(root_0, string_literal166_tree);


                    }
                    break;
                case 2 :
                    // msc_grammar.g:230:12: '\"' expressionString '\"'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal167=(Token)match(input,98,FOLLOW_98_in_infNatural1549); 
                    char_literal167_tree = (CommonTree)adaptor.create(char_literal167);
                    adaptor.addChild(root_0, char_literal167_tree);

                    pushFollow(FOLLOW_expressionString_in_infNatural1551);
                    expressionString168=expressionString();

                    state._fsp--;

                    adaptor.addChild(root_0, expressionString168.getTree());
                    char_literal169=(Token)match(input,98,FOLLOW_98_in_infNatural1553); 
                    char_literal169_tree = (CommonTree)adaptor.create(char_literal169);
                    adaptor.addChild(root_0, char_literal169_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "infNatural"

    public static class create_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create"
    // msc_grammar.g:234:1: create : 'create' instanceName ( '(' parameterList ')' )? -> ^( Create instanceName ^( ParameterList ( parameterList )? ) ) ;
    public final msc_grammarParser.create_return create() throws RecognitionException {
        msc_grammarParser.create_return retval = new msc_grammarParser.create_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal170=null;
        Token char_literal172=null;
        Token char_literal174=null;
        msc_grammarParser.instanceName_return instanceName171 = null;

        msc_grammarParser.parameterList_return parameterList173 = null;


        CommonTree string_literal170_tree=null;
        CommonTree char_literal172_tree=null;
        CommonTree char_literal174_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_instanceName=new RewriteRuleSubtreeStream(adaptor,"rule instanceName");
        RewriteRuleSubtreeStream stream_parameterList=new RewriteRuleSubtreeStream(adaptor,"rule parameterList");
        try {
            // msc_grammar.g:234:9: ( 'create' instanceName ( '(' parameterList ')' )? -> ^( Create instanceName ^( ParameterList ( parameterList )? ) ) )
            // msc_grammar.g:234:11: 'create' instanceName ( '(' parameterList ')' )?
            {
            string_literal170=(Token)match(input,99,FOLLOW_99_in_create1566);  
            stream_99.add(string_literal170);

            pushFollow(FOLLOW_instanceName_in_create1568);
            instanceName171=instanceName();

            state._fsp--;

            stream_instanceName.add(instanceName171.getTree());
            // msc_grammar.g:234:33: ( '(' parameterList ')' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==76) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // msc_grammar.g:234:35: '(' parameterList ')'
                    {
                    char_literal172=(Token)match(input,76,FOLLOW_76_in_create1572);  
                    stream_76.add(char_literal172);

                    pushFollow(FOLLOW_parameterList_in_create1574);
                    parameterList173=parameterList();

                    state._fsp--;

                    stream_parameterList.add(parameterList173.getTree());
                    char_literal174=(Token)match(input,77,FOLLOW_77_in_create1576);  
                    stream_77.add(char_literal174);


                    }
                    break;

            }



            // AST REWRITE
            // elements: parameterList, instanceName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 234:60: -> ^( Create instanceName ^( ParameterList ( parameterList )? ) )
            {
                // msc_grammar.g:234:63: ^( Create instanceName ^( ParameterList ( parameterList )? ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Create, "Create"), root_1);

                adaptor.addChild(root_1, stream_instanceName.nextTree());
                // msc_grammar.g:234:86: ^( ParameterList ( parameterList )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ParameterList, "ParameterList"), root_2);

                // msc_grammar.g:234:102: ( parameterList )?
                if ( stream_parameterList.hasNext() ) {
                    adaptor.addChild(root_2, stream_parameterList.nextTree());

                }
                stream_parameterList.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "create"

    public static class stop_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stop"
    // msc_grammar.g:236:1: stop : 'stop' -> Terminate ;
    public final msc_grammarParser.stop_return stop() throws RecognitionException {
        msc_grammarParser.stop_return retval = new msc_grammarParser.stop_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal175=null;

        CommonTree string_literal175_tree=null;
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");

        try {
            // msc_grammar.g:236:7: ( 'stop' -> Terminate )
            // msc_grammar.g:236:9: 'stop'
            {
            string_literal175=(Token)match(input,100,FOLLOW_100_in_stop1606);  
            stream_100.add(string_literal175);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 236:16: -> Terminate
            {
                adaptor.addChild(root_0, (CommonTree)adaptor.create(Terminate, "Terminate"));

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "stop"

    public static class timerStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timerStatement"
    // msc_grammar.g:239:1: timerStatement : ( setTimer | resetTimer | timeout );
    public final msc_grammarParser.timerStatement_return timerStatement() throws RecognitionException {
        msc_grammarParser.timerStatement_return retval = new msc_grammarParser.timerStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.setTimer_return setTimer176 = null;

        msc_grammarParser.resetTimer_return resetTimer177 = null;

        msc_grammarParser.timeout_return timeout178 = null;



        try {
            // msc_grammar.g:240:2: ( setTimer | resetTimer | timeout )
            int alt45=3;
            switch ( input.LA(1) ) {
            case 101:
                {
                alt45=1;
                }
                break;
            case 104:
                {
                alt45=2;
                }
                break;
            case 105:
                {
                alt45=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // msc_grammar.g:240:4: setTimer
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_setTimer_in_timerStatement1622);
                    setTimer176=setTimer();

                    state._fsp--;

                    adaptor.addChild(root_0, setTimer176.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:240:15: resetTimer
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_resetTimer_in_timerStatement1626);
                    resetTimer177=resetTimer();

                    state._fsp--;

                    adaptor.addChild(root_0, resetTimer177.getTree());

                    }
                    break;
                case 3 :
                    // msc_grammar.g:240:28: timeout
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_timeout_in_timerStatement1630);
                    timeout178=timeout();

                    state._fsp--;

                    adaptor.addChild(root_0, timeout178.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "timerStatement"

    public static class setTimer_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "setTimer"
    // msc_grammar.g:242:1: setTimer : 'starttimer' name ( ',' instanceName )? ( duration )? ( '(' parameterList ')' )? -> ^( StartTimer name ( instanceName )? ( duration )? ( parameterList )? ) ;
    public final msc_grammarParser.setTimer_return setTimer() throws RecognitionException {
        msc_grammarParser.setTimer_return retval = new msc_grammarParser.setTimer_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal179=null;
        Token char_literal181=null;
        Token char_literal184=null;
        Token char_literal186=null;
        msc_grammarParser.name_return name180 = null;

        msc_grammarParser.instanceName_return instanceName182 = null;

        msc_grammarParser.duration_return duration183 = null;

        msc_grammarParser.parameterList_return parameterList185 = null;


        CommonTree string_literal179_tree=null;
        CommonTree char_literal181_tree=null;
        CommonTree char_literal184_tree=null;
        CommonTree char_literal186_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_duration=new RewriteRuleSubtreeStream(adaptor,"rule duration");
        RewriteRuleSubtreeStream stream_instanceName=new RewriteRuleSubtreeStream(adaptor,"rule instanceName");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        RewriteRuleSubtreeStream stream_parameterList=new RewriteRuleSubtreeStream(adaptor,"rule parameterList");
        try {
            // msc_grammar.g:243:2: ( 'starttimer' name ( ',' instanceName )? ( duration )? ( '(' parameterList ')' )? -> ^( StartTimer name ( instanceName )? ( duration )? ( parameterList )? ) )
            // msc_grammar.g:243:4: 'starttimer' name ( ',' instanceName )? ( duration )? ( '(' parameterList ')' )?
            {
            string_literal179=(Token)match(input,101,FOLLOW_101_in_setTimer1641);  
            stream_101.add(string_literal179);

            pushFollow(FOLLOW_name_in_setTimer1643);
            name180=name();

            state._fsp--;

            stream_name.add(name180.getTree());
            // msc_grammar.g:243:22: ( ',' instanceName )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==68) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // msc_grammar.g:243:24: ',' instanceName
                    {
                    char_literal181=(Token)match(input,68,FOLLOW_68_in_setTimer1647);  
                    stream_68.add(char_literal181);

                    pushFollow(FOLLOW_instanceName_in_setTimer1649);
                    instanceName182=instanceName();

                    state._fsp--;

                    stream_instanceName.add(instanceName182.getTree());

                    }
                    break;

            }

            // msc_grammar.g:243:44: ( duration )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==102) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // msc_grammar.g:243:46: duration
                    {
                    pushFollow(FOLLOW_duration_in_setTimer1656);
                    duration183=duration();

                    state._fsp--;

                    stream_duration.add(duration183.getTree());

                    }
                    break;

            }

            // msc_grammar.g:243:58: ( '(' parameterList ')' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==76) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // msc_grammar.g:243:60: '(' parameterList ')'
                    {
                    char_literal184=(Token)match(input,76,FOLLOW_76_in_setTimer1663);  
                    stream_76.add(char_literal184);

                    pushFollow(FOLLOW_parameterList_in_setTimer1665);
                    parameterList185=parameterList();

                    state._fsp--;

                    stream_parameterList.add(parameterList185.getTree());
                    char_literal186=(Token)match(input,77,FOLLOW_77_in_setTimer1667);  
                    stream_77.add(char_literal186);


                    }
                    break;

            }



            // AST REWRITE
            // elements: name, duration, instanceName, parameterList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 244:4: -> ^( StartTimer name ( instanceName )? ( duration )? ( parameterList )? )
            {
                // msc_grammar.g:244:7: ^( StartTimer name ( instanceName )? ( duration )? ( parameterList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(StartTimer, "StartTimer"), root_1);

                adaptor.addChild(root_1, stream_name.nextTree());
                // msc_grammar.g:244:26: ( instanceName )?
                if ( stream_instanceName.hasNext() ) {
                    adaptor.addChild(root_1, stream_instanceName.nextTree());

                }
                stream_instanceName.reset();
                // msc_grammar.g:244:40: ( duration )?
                if ( stream_duration.hasNext() ) {
                    adaptor.addChild(root_1, stream_duration.nextTree());

                }
                stream_duration.reset();
                // msc_grammar.g:244:50: ( parameterList )?
                if ( stream_parameterList.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameterList.nextTree());

                }
                stream_parameterList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "setTimer"

    public static class duration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "duration"
    // msc_grammar.g:246:1: duration : '[' ( infNatural )? ( ',' infNatural )? ']' ;
    public final msc_grammarParser.duration_return duration() throws RecognitionException {
        msc_grammarParser.duration_return retval = new msc_grammarParser.duration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal187=null;
        Token char_literal189=null;
        Token char_literal191=null;
        msc_grammarParser.infNatural_return infNatural188 = null;

        msc_grammarParser.infNatural_return infNatural190 = null;


        CommonTree char_literal187_tree=null;
        CommonTree char_literal189_tree=null;
        CommonTree char_literal191_tree=null;

        try {
            // msc_grammar.g:247:2: ( '[' ( infNatural )? ( ',' infNatural )? ']' )
            // msc_grammar.g:247:4: '[' ( infNatural )? ( ',' infNatural )? ']'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal187=(Token)match(input,102,FOLLOW_102_in_duration1704); 
            char_literal187_tree = (CommonTree)adaptor.create(char_literal187);
            adaptor.addChild(root_0, char_literal187_tree);

            // msc_grammar.g:247:8: ( infNatural )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=97 && LA49_0<=98)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // msc_grammar.g:247:10: infNatural
                    {
                    pushFollow(FOLLOW_infNatural_in_duration1708);
                    infNatural188=infNatural();

                    state._fsp--;

                    adaptor.addChild(root_0, infNatural188.getTree());

                    }
                    break;

            }

            // msc_grammar.g:247:24: ( ',' infNatural )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==68) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // msc_grammar.g:247:26: ',' infNatural
                    {
                    char_literal189=(Token)match(input,68,FOLLOW_68_in_duration1715); 
                    char_literal189_tree = (CommonTree)adaptor.create(char_literal189);
                    adaptor.addChild(root_0, char_literal189_tree);

                    pushFollow(FOLLOW_infNatural_in_duration1717);
                    infNatural190=infNatural();

                    state._fsp--;

                    adaptor.addChild(root_0, infNatural190.getTree());

                    }
                    break;

            }

            char_literal191=(Token)match(input,103,FOLLOW_103_in_duration1722); 
            char_literal191_tree = (CommonTree)adaptor.create(char_literal191);
            adaptor.addChild(root_0, char_literal191_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "duration"

    public static class resetTimer_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "resetTimer"
    // msc_grammar.g:249:1: resetTimer : 'stoptimer' name ( ',' instanceName )? -> ^( StopTimer name ( instanceName )? ) ;
    public final msc_grammarParser.resetTimer_return resetTimer() throws RecognitionException {
        msc_grammarParser.resetTimer_return retval = new msc_grammarParser.resetTimer_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal192=null;
        Token char_literal194=null;
        msc_grammarParser.name_return name193 = null;

        msc_grammarParser.instanceName_return instanceName195 = null;


        CommonTree string_literal192_tree=null;
        CommonTree char_literal194_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleSubtreeStream stream_instanceName=new RewriteRuleSubtreeStream(adaptor,"rule instanceName");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        try {
            // msc_grammar.g:250:2: ( 'stoptimer' name ( ',' instanceName )? -> ^( StopTimer name ( instanceName )? ) )
            // msc_grammar.g:250:4: 'stoptimer' name ( ',' instanceName )?
            {
            string_literal192=(Token)match(input,104,FOLLOW_104_in_resetTimer1733);  
            stream_104.add(string_literal192);

            pushFollow(FOLLOW_name_in_resetTimer1735);
            name193=name();

            state._fsp--;

            stream_name.add(name193.getTree());
            // msc_grammar.g:250:21: ( ',' instanceName )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==68) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // msc_grammar.g:250:23: ',' instanceName
                    {
                    char_literal194=(Token)match(input,68,FOLLOW_68_in_resetTimer1739);  
                    stream_68.add(char_literal194);

                    pushFollow(FOLLOW_instanceName_in_resetTimer1741);
                    instanceName195=instanceName();

                    state._fsp--;

                    stream_instanceName.add(instanceName195.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: name, instanceName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 250:43: -> ^( StopTimer name ( instanceName )? )
            {
                // msc_grammar.g:250:46: ^( StopTimer name ( instanceName )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(StopTimer, "StopTimer"), root_1);

                adaptor.addChild(root_1, stream_name.nextTree());
                // msc_grammar.g:250:64: ( instanceName )?
                if ( stream_instanceName.hasNext() ) {
                    adaptor.addChild(root_1, stream_instanceName.nextTree());

                }
                stream_instanceName.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "resetTimer"

    public static class timeout_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timeout"
    // msc_grammar.g:252:1: timeout : 'timeout' name ( ',' instanceName )? ( '(' parameterList ')' )? -> ^( Timeout name ( instanceName )? ( parameterList )? ) ;
    public final msc_grammarParser.timeout_return timeout() throws RecognitionException {
        msc_grammarParser.timeout_return retval = new msc_grammarParser.timeout_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal196=null;
        Token char_literal198=null;
        Token char_literal200=null;
        Token char_literal202=null;
        msc_grammarParser.name_return name197 = null;

        msc_grammarParser.instanceName_return instanceName199 = null;

        msc_grammarParser.parameterList_return parameterList201 = null;


        CommonTree string_literal196_tree=null;
        CommonTree char_literal198_tree=null;
        CommonTree char_literal200_tree=null;
        CommonTree char_literal202_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_instanceName=new RewriteRuleSubtreeStream(adaptor,"rule instanceName");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        RewriteRuleSubtreeStream stream_parameterList=new RewriteRuleSubtreeStream(adaptor,"rule parameterList");
        try {
            // msc_grammar.g:252:9: ( 'timeout' name ( ',' instanceName )? ( '(' parameterList ')' )? -> ^( Timeout name ( instanceName )? ( parameterList )? ) )
            // msc_grammar.g:252:11: 'timeout' name ( ',' instanceName )? ( '(' parameterList ')' )?
            {
            string_literal196=(Token)match(input,105,FOLLOW_105_in_timeout1766);  
            stream_105.add(string_literal196);

            pushFollow(FOLLOW_name_in_timeout1768);
            name197=name();

            state._fsp--;

            stream_name.add(name197.getTree());
            // msc_grammar.g:252:26: ( ',' instanceName )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==68) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // msc_grammar.g:252:28: ',' instanceName
                    {
                    char_literal198=(Token)match(input,68,FOLLOW_68_in_timeout1772);  
                    stream_68.add(char_literal198);

                    pushFollow(FOLLOW_instanceName_in_timeout1774);
                    instanceName199=instanceName();

                    state._fsp--;

                    stream_instanceName.add(instanceName199.getTree());

                    }
                    break;

            }

            // msc_grammar.g:252:48: ( '(' parameterList ')' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==76) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // msc_grammar.g:252:50: '(' parameterList ')'
                    {
                    char_literal200=(Token)match(input,76,FOLLOW_76_in_timeout1781);  
                    stream_76.add(char_literal200);

                    pushFollow(FOLLOW_parameterList_in_timeout1783);
                    parameterList201=parameterList();

                    state._fsp--;

                    stream_parameterList.add(parameterList201.getTree());
                    char_literal202=(Token)match(input,77,FOLLOW_77_in_timeout1785);  
                    stream_77.add(char_literal202);


                    }
                    break;

            }



            // AST REWRITE
            // elements: parameterList, name, instanceName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 252:75: -> ^( Timeout name ( instanceName )? ( parameterList )? )
            {
                // msc_grammar.g:252:78: ^( Timeout name ( instanceName )? ( parameterList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Timeout, "Timeout"), root_1);

                adaptor.addChild(root_1, stream_name.nextTree());
                // msc_grammar.g:252:94: ( instanceName )?
                if ( stream_instanceName.hasNext() ) {
                    adaptor.addChild(root_1, stream_instanceName.nextTree());

                }
                stream_instanceName.reset();
                // msc_grammar.g:252:108: ( parameterList )?
                if ( stream_parameterList.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameterList.nextTree());

                }
                stream_parameterList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "timeout"

    public static class mscGateInterface_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mscGateInterface"
    // msc_grammar.g:256:1: mscGateInterface : ( mscGateDef )+ ;
    public final msc_grammarParser.mscGateInterface_return mscGateInterface() throws RecognitionException {
        msc_grammarParser.mscGateInterface_return retval = new msc_grammarParser.mscGateInterface_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.mscGateDef_return mscGateDef203 = null;



        try {
            // msc_grammar.g:257:2: ( ( mscGateDef )+ )
            // msc_grammar.g:257:4: ( mscGateDef )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // msc_grammar.g:257:4: ( mscGateDef )+
            int cnt54=0;
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==106) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // msc_grammar.g:257:4: mscGateDef
            	    {
            	    pushFollow(FOLLOW_mscGateDef_in_mscGateInterface1818);
            	    mscGateDef203=mscGateDef();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mscGateDef203.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt54 >= 1 ) break loop54;
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mscGateInterface"

    public static class mscGateDef_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mscGateDef"
    // msc_grammar.g:259:1: mscGateDef : 'gate' ( msgGate | orderGate ) end ;
    public final msc_grammarParser.mscGateDef_return mscGateDef() throws RecognitionException {
        msc_grammarParser.mscGateDef_return retval = new msc_grammarParser.mscGateDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal204=null;
        msc_grammarParser.msgGate_return msgGate205 = null;

        msc_grammarParser.orderGate_return orderGate206 = null;

        msc_grammarParser.end_return end207 = null;


        CommonTree string_literal204_tree=null;

        try {
            // msc_grammar.g:260:2: ( 'gate' ( msgGate | orderGate ) end )
            // msc_grammar.g:260:4: 'gate' ( msgGate | orderGate ) end
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal204=(Token)match(input,106,FOLLOW_106_in_mscGateDef1830); 
            string_literal204_tree = (CommonTree)adaptor.create(string_literal204);
            adaptor.addChild(root_0, string_literal204_tree);

            // msc_grammar.g:260:11: ( msgGate | orderGate )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==NAME) ) {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==88||(LA55_1>=107 && LA55_1<=108)) ) {
                    alt55=2;
                }
                else if ( (LA55_1==70||LA55_1==72) ) {
                    alt55=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA55_0==70||LA55_0==72) ) {
                alt55=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // msc_grammar.g:260:13: msgGate
                    {
                    pushFollow(FOLLOW_msgGate_in_mscGateDef1834);
                    msgGate205=msgGate();

                    state._fsp--;

                    adaptor.addChild(root_0, msgGate205.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:260:23: orderGate
                    {
                    pushFollow(FOLLOW_orderGate_in_mscGateDef1838);
                    orderGate206=orderGate();

                    state._fsp--;

                    adaptor.addChild(root_0, orderGate206.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_end_in_mscGateDef1842);
            end207=end();

            state._fsp--;

            adaptor.addChild(root_0, end207.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mscGateDef"

    public static class msgGate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "msgGate"
    // msc_grammar.g:262:1: msgGate : ( defInGate | defOutGate );
    public final msc_grammarParser.msgGate_return msgGate() throws RecognitionException {
        msc_grammarParser.msgGate_return retval = new msc_grammarParser.msgGate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.defInGate_return defInGate208 = null;

        msc_grammarParser.defOutGate_return defOutGate209 = null;



        try {
            // msc_grammar.g:262:9: ( defInGate | defOutGate )
            int alt56=2;
            switch ( input.LA(1) ) {
            case NAME:
                {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==72) ) {
                    alt56=2;
                }
                else if ( (LA56_1==70) ) {
                    alt56=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }
                }
                break;
            case 70:
                {
                alt56=1;
                }
                break;
            case 72:
                {
                alt56=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // msc_grammar.g:262:11: defInGate
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defInGate_in_msgGate1851);
                    defInGate208=defInGate();

                    state._fsp--;

                    adaptor.addChild(root_0, defInGate208.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:262:23: defOutGate
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defOutGate_in_msgGate1855);
                    defOutGate209=defOutGate();

                    state._fsp--;

                    adaptor.addChild(root_0, defOutGate209.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "msgGate"

    public static class orderGate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orderGate"
    // msc_grammar.g:264:1: orderGate : ( defOrderInGate | defOrderOutGate );
    public final msc_grammarParser.orderGate_return orderGate() throws RecognitionException {
        msc_grammarParser.orderGate_return retval = new msc_grammarParser.orderGate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.defOrderInGate_return defOrderInGate210 = null;

        msc_grammarParser.defOrderOutGate_return defOrderOutGate211 = null;



        try {
            // msc_grammar.g:265:2: ( defOrderInGate | defOrderOutGate )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==NAME) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==107) ) {
                    alt57=1;
                }
                else if ( (LA57_1==88||LA57_1==108) ) {
                    alt57=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // msc_grammar.g:265:4: defOrderInGate
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defOrderInGate_in_orderGate1866);
                    defOrderInGate210=defOrderInGate();

                    state._fsp--;

                    adaptor.addChild(root_0, defOrderInGate210.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:265:21: defOrderOutGate
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defOrderOutGate_in_orderGate1870);
                    defOrderOutGate211=defOrderOutGate();

                    state._fsp--;

                    adaptor.addChild(root_0, defOrderOutGate211.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "orderGate"

    public static class defInGate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defInGate"
    // msc_grammar.g:267:1: defInGate : ( gateName )? 'out' msgIdentification 'to' inputDest ;
    public final msc_grammarParser.defInGate_return defInGate() throws RecognitionException {
        msc_grammarParser.defInGate_return retval = new msc_grammarParser.defInGate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal213=null;
        Token string_literal215=null;
        msc_grammarParser.gateName_return gateName212 = null;

        msc_grammarParser.msgIdentification_return msgIdentification214 = null;

        msc_grammarParser.inputDest_return inputDest216 = null;


        CommonTree string_literal213_tree=null;
        CommonTree string_literal215_tree=null;

        try {
            // msc_grammar.g:268:2: ( ( gateName )? 'out' msgIdentification 'to' inputDest )
            // msc_grammar.g:268:4: ( gateName )? 'out' msgIdentification 'to' inputDest
            {
            root_0 = (CommonTree)adaptor.nil();

            // msc_grammar.g:268:4: ( gateName )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==NAME) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // msc_grammar.g:268:6: gateName
                    {
                    pushFollow(FOLLOW_gateName_in_defInGate1883);
                    gateName212=gateName();

                    state._fsp--;

                    adaptor.addChild(root_0, gateName212.getTree());

                    }
                    break;

            }

            string_literal213=(Token)match(input,70,FOLLOW_70_in_defInGate1888); 
            string_literal213_tree = (CommonTree)adaptor.create(string_literal213);
            adaptor.addChild(root_0, string_literal213_tree);

            pushFollow(FOLLOW_msgIdentification_in_defInGate1890);
            msgIdentification214=msgIdentification();

            state._fsp--;

            adaptor.addChild(root_0, msgIdentification214.getTree());
            string_literal215=(Token)match(input,71,FOLLOW_71_in_defInGate1892); 
            string_literal215_tree = (CommonTree)adaptor.create(string_literal215);
            adaptor.addChild(root_0, string_literal215_tree);

            pushFollow(FOLLOW_inputDest_in_defInGate1894);
            inputDest216=inputDest();

            state._fsp--;

            adaptor.addChild(root_0, inputDest216.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "defInGate"

    public static class defOutGate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defOutGate"
    // msc_grammar.g:270:1: defOutGate : ( gateName )? 'in' msgIdentification 'from' outputDest ;
    public final msc_grammarParser.defOutGate_return defOutGate() throws RecognitionException {
        msc_grammarParser.defOutGate_return retval = new msc_grammarParser.defOutGate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal218=null;
        Token string_literal220=null;
        msc_grammarParser.gateName_return gateName217 = null;

        msc_grammarParser.msgIdentification_return msgIdentification219 = null;

        msc_grammarParser.outputDest_return outputDest221 = null;


        CommonTree string_literal218_tree=null;
        CommonTree string_literal220_tree=null;

        try {
            // msc_grammar.g:271:2: ( ( gateName )? 'in' msgIdentification 'from' outputDest )
            // msc_grammar.g:271:4: ( gateName )? 'in' msgIdentification 'from' outputDest
            {
            root_0 = (CommonTree)adaptor.nil();

            // msc_grammar.g:271:4: ( gateName )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==NAME) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // msc_grammar.g:271:6: gateName
                    {
                    pushFollow(FOLLOW_gateName_in_defOutGate1907);
                    gateName217=gateName();

                    state._fsp--;

                    adaptor.addChild(root_0, gateName217.getTree());

                    }
                    break;

            }

            string_literal218=(Token)match(input,72,FOLLOW_72_in_defOutGate1912); 
            string_literal218_tree = (CommonTree)adaptor.create(string_literal218);
            adaptor.addChild(root_0, string_literal218_tree);

            pushFollow(FOLLOW_msgIdentification_in_defOutGate1914);
            msgIdentification219=msgIdentification();

            state._fsp--;

            adaptor.addChild(root_0, msgIdentification219.getTree());
            string_literal220=(Token)match(input,73,FOLLOW_73_in_defOutGate1916); 
            string_literal220_tree = (CommonTree)adaptor.create(string_literal220);
            adaptor.addChild(root_0, string_literal220_tree);

            pushFollow(FOLLOW_outputDest_in_defOutGate1918);
            outputDest221=outputDest();

            state._fsp--;

            adaptor.addChild(root_0, outputDest221.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "defOutGate"

    public static class defOrderInGate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defOrderInGate"
    // msc_grammar.g:273:1: defOrderInGate : gateName 'before' orderDest ;
    public final msc_grammarParser.defOrderInGate_return defOrderInGate() throws RecognitionException {
        msc_grammarParser.defOrderInGate_return retval = new msc_grammarParser.defOrderInGate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal223=null;
        msc_grammarParser.gateName_return gateName222 = null;

        msc_grammarParser.orderDest_return orderDest224 = null;


        CommonTree string_literal223_tree=null;

        try {
            // msc_grammar.g:274:2: ( gateName 'before' orderDest )
            // msc_grammar.g:274:4: gateName 'before' orderDest
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_gateName_in_defOrderInGate1929);
            gateName222=gateName();

            state._fsp--;

            adaptor.addChild(root_0, gateName222.getTree());
            string_literal223=(Token)match(input,107,FOLLOW_107_in_defOrderInGate1931); 
            string_literal223_tree = (CommonTree)adaptor.create(string_literal223);
            adaptor.addChild(root_0, string_literal223_tree);

            pushFollow(FOLLOW_orderDest_in_defOrderInGate1933);
            orderDest224=orderDest();

            state._fsp--;

            adaptor.addChild(root_0, orderDest224.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "defOrderInGate"

    public static class defOrderOutGate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defOrderOutGate"
    // msc_grammar.g:276:1: defOrderOutGate : gateName ( 'after' orderDestList )? ;
    public final msc_grammarParser.defOrderOutGate_return defOrderOutGate() throws RecognitionException {
        msc_grammarParser.defOrderOutGate_return retval = new msc_grammarParser.defOrderOutGate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal226=null;
        msc_grammarParser.gateName_return gateName225 = null;

        msc_grammarParser.orderDestList_return orderDestList227 = null;


        CommonTree string_literal226_tree=null;

        try {
            // msc_grammar.g:277:2: ( gateName ( 'after' orderDestList )? )
            // msc_grammar.g:277:4: gateName ( 'after' orderDestList )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_gateName_in_defOrderOutGate1943);
            gateName225=gateName();

            state._fsp--;

            adaptor.addChild(root_0, gateName225.getTree());
            // msc_grammar.g:277:13: ( 'after' orderDestList )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==108) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // msc_grammar.g:277:15: 'after' orderDestList
                    {
                    string_literal226=(Token)match(input,108,FOLLOW_108_in_defOrderOutGate1947); 
                    string_literal226_tree = (CommonTree)adaptor.create(string_literal226);
                    adaptor.addChild(root_0, string_literal226_tree);

                    pushFollow(FOLLOW_orderDestList_in_defOrderOutGate1949);
                    orderDestList227=orderDestList();

                    state._fsp--;

                    adaptor.addChild(root_0, orderDestList227.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "defOrderOutGate"

    public static class inputDest_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inputDest"
    // msc_grammar.g:279:1: inputDest : ( 'lost' ( inputAddress )? | inputAddress );
    public final msc_grammarParser.inputDest_return inputDest() throws RecognitionException {
        msc_grammarParser.inputDest_return retval = new msc_grammarParser.inputDest_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal228=null;
        msc_grammarParser.inputAddress_return inputAddress229 = null;

        msc_grammarParser.inputAddress_return inputAddress230 = null;


        CommonTree string_literal228_tree=null;

        try {
            // msc_grammar.g:280:2: ( 'lost' ( inputAddress )? | inputAddress )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==74) ) {
                alt62=1;
            }
            else if ( (LA62_0==NAME||LA62_0==78) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // msc_grammar.g:280:4: 'lost' ( inputAddress )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal228=(Token)match(input,74,FOLLOW_74_in_inputDest1964); 
                    string_literal228_tree = (CommonTree)adaptor.create(string_literal228);
                    adaptor.addChild(root_0, string_literal228_tree);

                    // msc_grammar.g:280:11: ( inputAddress )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==NAME||LA61_0==78) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // msc_grammar.g:280:13: inputAddress
                            {
                            pushFollow(FOLLOW_inputAddress_in_inputDest1968);
                            inputAddress229=inputAddress();

                            state._fsp--;

                            adaptor.addChild(root_0, inputAddress229.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // msc_grammar.g:280:31: inputAddress
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_inputAddress_in_inputDest1975);
                    inputAddress230=inputAddress();

                    state._fsp--;

                    adaptor.addChild(root_0, inputAddress230.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "inputDest"

    public static class outputDest_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "outputDest"
    // msc_grammar.g:282:1: outputDest : ( 'found' ( outputAddress )? | outputAddress );
    public final msc_grammarParser.outputDest_return outputDest() throws RecognitionException {
        msc_grammarParser.outputDest_return retval = new msc_grammarParser.outputDest_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal231=null;
        msc_grammarParser.outputAddress_return outputAddress232 = null;

        msc_grammarParser.outputAddress_return outputAddress233 = null;


        CommonTree string_literal231_tree=null;

        try {
            // msc_grammar.g:283:2: ( 'found' ( outputAddress )? | outputAddress )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==75) ) {
                alt64=1;
            }
            else if ( (LA64_0==NAME||LA64_0==78) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // msc_grammar.g:283:4: 'found' ( outputAddress )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal231=(Token)match(input,75,FOLLOW_75_in_outputDest1986); 
                    string_literal231_tree = (CommonTree)adaptor.create(string_literal231);
                    adaptor.addChild(root_0, string_literal231_tree);

                    // msc_grammar.g:283:12: ( outputAddress )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==NAME||LA63_0==78) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // msc_grammar.g:283:14: outputAddress
                            {
                            pushFollow(FOLLOW_outputAddress_in_outputDest1990);
                            outputAddress232=outputAddress();

                            state._fsp--;

                            adaptor.addChild(root_0, outputAddress232.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // msc_grammar.g:283:33: outputAddress
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_outputAddress_in_outputDest1997);
                    outputAddress233=outputAddress();

                    state._fsp--;

                    adaptor.addChild(root_0, outputAddress233.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "outputDest"

    public static class orderDest_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orderDest"
    // msc_grammar.g:285:1: orderDest : ( eventName | 'env' 'via' gateName -> ^( MsgGate gateName ) );
    public final msc_grammarParser.orderDest_return orderDest() throws RecognitionException {
        msc_grammarParser.orderDest_return retval = new msc_grammarParser.orderDest_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal235=null;
        Token string_literal236=null;
        msc_grammarParser.eventName_return eventName234 = null;

        msc_grammarParser.gateName_return gateName237 = null;


        CommonTree string_literal235_tree=null;
        CommonTree string_literal236_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleSubtreeStream stream_gateName=new RewriteRuleSubtreeStream(adaptor,"rule gateName");
        try {
            // msc_grammar.g:286:2: ( eventName | 'env' 'via' gateName -> ^( MsgGate gateName ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==NAME) ) {
                alt65=1;
            }
            else if ( (LA65_0==78) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // msc_grammar.g:286:4: eventName
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_eventName_in_orderDest2008);
                    eventName234=eventName();

                    state._fsp--;

                    adaptor.addChild(root_0, eventName234.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:287:4: 'env' 'via' gateName
                    {
                    string_literal235=(Token)match(input,78,FOLLOW_78_in_orderDest2013);  
                    stream_78.add(string_literal235);

                    string_literal236=(Token)match(input,79,FOLLOW_79_in_orderDest2015);  
                    stream_79.add(string_literal236);

                    pushFollow(FOLLOW_gateName_in_orderDest2017);
                    gateName237=gateName();

                    state._fsp--;

                    stream_gateName.add(gateName237.getTree());


                    // AST REWRITE
                    // elements: gateName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 287:25: -> ^( MsgGate gateName )
                    {
                        // msc_grammar.g:287:28: ^( MsgGate gateName )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MsgGate, "MsgGate"), root_1);

                        adaptor.addChild(root_1, stream_gateName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "orderDest"

    public static class orderDestList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orderDestList"
    // msc_grammar.g:289:1: orderDestList : orderDest ( ',' orderDestList )? -> orderDest ( orderDestList )? ;
    public final msc_grammarParser.orderDestList_return orderDestList() throws RecognitionException {
        msc_grammarParser.orderDestList_return retval = new msc_grammarParser.orderDestList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal239=null;
        msc_grammarParser.orderDest_return orderDest238 = null;

        msc_grammarParser.orderDestList_return orderDestList240 = null;


        CommonTree char_literal239_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleSubtreeStream stream_orderDestList=new RewriteRuleSubtreeStream(adaptor,"rule orderDestList");
        RewriteRuleSubtreeStream stream_orderDest=new RewriteRuleSubtreeStream(adaptor,"rule orderDest");
        try {
            // msc_grammar.g:290:2: ( orderDest ( ',' orderDestList )? -> orderDest ( orderDestList )? )
            // msc_grammar.g:290:4: orderDest ( ',' orderDestList )?
            {
            pushFollow(FOLLOW_orderDest_in_orderDestList2038);
            orderDest238=orderDest();

            state._fsp--;

            stream_orderDest.add(orderDest238.getTree());
            // msc_grammar.g:290:14: ( ',' orderDestList )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==68) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // msc_grammar.g:290:16: ',' orderDestList
                    {
                    char_literal239=(Token)match(input,68,FOLLOW_68_in_orderDestList2042);  
                    stream_68.add(char_literal239);

                    pushFollow(FOLLOW_orderDestList_in_orderDestList2044);
                    orderDestList240=orderDestList();

                    state._fsp--;

                    stream_orderDestList.add(orderDestList240.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: orderDest, orderDestList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 290:37: -> orderDest ( orderDestList )?
            {
                adaptor.addChild(root_0, stream_orderDest.nextTree());
                // msc_grammar.g:290:50: ( orderDestList )?
                if ( stream_orderDestList.hasNext() ) {
                    adaptor.addChild(root_0, stream_orderDestList.nextTree());

                }
                stream_orderDestList.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "orderDestList"

    public static class coregion_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "coregion"
    // msc_grammar.g:294:1: coregion : 'concurrent' end ( coevent )* 'endconcurrent' -> ^( Coregion ( coevent )* ) ;
    public final msc_grammarParser.coregion_return coregion() throws RecognitionException {
        msc_grammarParser.coregion_return retval = new msc_grammarParser.coregion_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal241=null;
        Token string_literal244=null;
        msc_grammarParser.end_return end242 = null;

        msc_grammarParser.coevent_return coevent243 = null;


        CommonTree string_literal241_tree=null;
        CommonTree string_literal244_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleSubtreeStream stream_coevent=new RewriteRuleSubtreeStream(adaptor,"rule coevent");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:295:2: ( 'concurrent' end ( coevent )* 'endconcurrent' -> ^( Coregion ( coevent )* ) )
            // msc_grammar.g:295:4: 'concurrent' end ( coevent )* 'endconcurrent'
            {
            string_literal241=(Token)match(input,109,FOLLOW_109_in_coregion2067);  
            stream_109.add(string_literal241);

            pushFollow(FOLLOW_end_in_coregion2069);
            end242=end();

            state._fsp--;

            stream_end.add(end242.getTree());
            // msc_grammar.g:295:21: ( coevent )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==NAME||(LA67_0>=69 && LA67_0<=70)||LA67_0==72||LA67_0==80||LA67_0==99||LA67_0==101||(LA67_0>=104 && LA67_0<=105)) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // msc_grammar.g:295:21: coevent
            	    {
            	    pushFollow(FOLLOW_coevent_in_coregion2071);
            	    coevent243=coevent();

            	    state._fsp--;

            	    stream_coevent.add(coevent243.getTree());

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            string_literal244=(Token)match(input,110,FOLLOW_110_in_coregion2074);  
            stream_110.add(string_literal244);



            // AST REWRITE
            // elements: coevent
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 295:46: -> ^( Coregion ( coevent )* )
            {
                // msc_grammar.g:295:49: ^( Coregion ( coevent )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Coregion, "Coregion"), root_1);

                // msc_grammar.g:295:61: ( coevent )*
                while ( stream_coevent.hasNext() ) {
                    adaptor.addChild(root_1, stream_coevent.nextTree());

                }
                stream_coevent.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "coregion"

    public static class coevent_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "coevent"
    // msc_grammar.g:297:1: coevent : orderableEvent end -> orderableEvent ;
    public final msc_grammarParser.coevent_return coevent() throws RecognitionException {
        msc_grammarParser.coevent_return retval = new msc_grammarParser.coevent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.orderableEvent_return orderableEvent245 = null;

        msc_grammarParser.end_return end246 = null;


        RewriteRuleSubtreeStream stream_orderableEvent=new RewriteRuleSubtreeStream(adaptor,"rule orderableEvent");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:297:9: ( orderableEvent end -> orderableEvent )
            // msc_grammar.g:297:11: orderableEvent end
            {
            pushFollow(FOLLOW_orderableEvent_in_coevent2094);
            orderableEvent245=orderableEvent();

            state._fsp--;

            stream_orderableEvent.add(orderableEvent245.getTree());
            pushFollow(FOLLOW_end_in_coevent2096);
            end246=end();

            state._fsp--;

            stream_end.add(end246.getTree());


            // AST REWRITE
            // elements: orderableEvent
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 297:30: -> orderableEvent
            {
                adaptor.addChild(root_0, stream_orderableEvent.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "coevent"

    public static class generalOrdering_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "generalOrdering"
    // msc_grammar.g:301:1: generalOrdering : ( before ( after )? | after );
    public final msc_grammarParser.generalOrdering_return generalOrdering() throws RecognitionException {
        msc_grammarParser.generalOrdering_return retval = new msc_grammarParser.generalOrdering_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.before_return before247 = null;

        msc_grammarParser.after_return after248 = null;

        msc_grammarParser.after_return after249 = null;



        try {
            // msc_grammar.g:302:2: ( before ( after )? | after )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==107) ) {
                alt69=1;
            }
            else if ( (LA69_0==108) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // msc_grammar.g:302:4: before ( after )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_before_in_generalOrdering2112);
                    before247=before();

                    state._fsp--;

                    adaptor.addChild(root_0, before247.getTree());
                    // msc_grammar.g:302:11: ( after )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==108) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // msc_grammar.g:302:11: after
                            {
                            pushFollow(FOLLOW_after_in_generalOrdering2114);
                            after248=after();

                            state._fsp--;

                            adaptor.addChild(root_0, after248.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // msc_grammar.g:303:4: after
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_after_in_generalOrdering2120);
                    after249=after();

                    state._fsp--;

                    adaptor.addChild(root_0, after249.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "generalOrdering"

    public static class before_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "before"
    // msc_grammar.g:305:1: before : 'before' orderDestList -> ^( Before orderDestList ) ;
    public final msc_grammarParser.before_return before() throws RecognitionException {
        msc_grammarParser.before_return retval = new msc_grammarParser.before_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal250=null;
        msc_grammarParser.orderDestList_return orderDestList251 = null;


        CommonTree string_literal250_tree=null;
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleSubtreeStream stream_orderDestList=new RewriteRuleSubtreeStream(adaptor,"rule orderDestList");
        try {
            // msc_grammar.g:305:9: ( 'before' orderDestList -> ^( Before orderDestList ) )
            // msc_grammar.g:305:11: 'before' orderDestList
            {
            string_literal250=(Token)match(input,107,FOLLOW_107_in_before2130);  
            stream_107.add(string_literal250);

            pushFollow(FOLLOW_orderDestList_in_before2132);
            orderDestList251=orderDestList();

            state._fsp--;

            stream_orderDestList.add(orderDestList251.getTree());


            // AST REWRITE
            // elements: orderDestList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 305:34: -> ^( Before orderDestList )
            {
                // msc_grammar.g:305:37: ^( Before orderDestList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Before, "Before"), root_1);

                adaptor.addChild(root_1, stream_orderDestList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "before"

    public static class after_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "after"
    // msc_grammar.g:307:1: after : 'after' orderDestList -> ^( After orderDestList ) ;
    public final msc_grammarParser.after_return after() throws RecognitionException {
        msc_grammarParser.after_return retval = new msc_grammarParser.after_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal252=null;
        msc_grammarParser.orderDestList_return orderDestList253 = null;


        CommonTree string_literal252_tree=null;
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleSubtreeStream stream_orderDestList=new RewriteRuleSubtreeStream(adaptor,"rule orderDestList");
        try {
            // msc_grammar.g:307:8: ( 'after' orderDestList -> ^( After orderDestList ) )
            // msc_grammar.g:307:10: 'after' orderDestList
            {
            string_literal252=(Token)match(input,108,FOLLOW_108_in_after2152);  
            stream_108.add(string_literal252);

            pushFollow(FOLLOW_orderDestList_in_after2154);
            orderDestList253=orderDestList();

            state._fsp--;

            stream_orderDestList.add(orderDestList253.getTree());


            // AST REWRITE
            // elements: orderDestList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 307:32: -> ^( After orderDestList )
            {
                // msc_grammar.g:307:35: ^( After orderDestList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(After, "After"), root_1);

                adaptor.addChild(root_1, stream_orderDestList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "after"

    public static class mscReference_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mscReference"
    // msc_grammar.g:311:1: mscReference : 'reference' mscRefExpr -> ^( Ref mscRefExpr ) ;
    public final msc_grammarParser.mscReference_return mscReference() throws RecognitionException {
        msc_grammarParser.mscReference_return retval = new msc_grammarParser.mscReference_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal254=null;
        msc_grammarParser.mscRefExpr_return mscRefExpr255 = null;


        CommonTree string_literal254_tree=null;
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_mscRefExpr=new RewriteRuleSubtreeStream(adaptor,"rule mscRefExpr");
        try {
            // msc_grammar.g:312:2: ( 'reference' mscRefExpr -> ^( Ref mscRefExpr ) )
            // msc_grammar.g:312:4: 'reference' mscRefExpr
            {
            string_literal254=(Token)match(input,111,FOLLOW_111_in_mscReference2178);  
            stream_111.add(string_literal254);

            pushFollow(FOLLOW_mscRefExpr_in_mscReference2180);
            mscRefExpr255=mscRefExpr();

            state._fsp--;

            stream_mscRefExpr.add(mscRefExpr255.getTree());


            // AST REWRITE
            // elements: mscRefExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 312:27: -> ^( Ref mscRefExpr )
            {
                // msc_grammar.g:312:30: ^( Ref mscRefExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Ref, "Ref"), root_1);

                adaptor.addChild(root_1, stream_mscRefExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mscReference"

    public static class mscRefExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mscRefExpr"
    // msc_grammar.g:314:1: mscRefExpr : mscRefParExpr ( 'alt' mscRefParExpr )* -> ^( Alt ( mscRefParExpr )+ ) ;
    public final msc_grammarParser.mscRefExpr_return mscRefExpr() throws RecognitionException {
        msc_grammarParser.mscRefExpr_return retval = new msc_grammarParser.mscRefExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal257=null;
        msc_grammarParser.mscRefParExpr_return mscRefParExpr256 = null;

        msc_grammarParser.mscRefParExpr_return mscRefParExpr258 = null;


        CommonTree string_literal257_tree=null;
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_mscRefParExpr=new RewriteRuleSubtreeStream(adaptor,"rule mscRefParExpr");
        try {
            // msc_grammar.g:315:2: ( mscRefParExpr ( 'alt' mscRefParExpr )* -> ^( Alt ( mscRefParExpr )+ ) )
            // msc_grammar.g:315:4: mscRefParExpr ( 'alt' mscRefParExpr )*
            {
            pushFollow(FOLLOW_mscRefParExpr_in_mscRefExpr2201);
            mscRefParExpr256=mscRefParExpr();

            state._fsp--;

            stream_mscRefParExpr.add(mscRefParExpr256.getTree());
            // msc_grammar.g:315:18: ( 'alt' mscRefParExpr )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==93) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // msc_grammar.g:315:20: 'alt' mscRefParExpr
            	    {
            	    string_literal257=(Token)match(input,93,FOLLOW_93_in_mscRefExpr2205);  
            	    stream_93.add(string_literal257);

            	    pushFollow(FOLLOW_mscRefParExpr_in_mscRefExpr2207);
            	    mscRefParExpr258=mscRefParExpr();

            	    state._fsp--;

            	    stream_mscRefParExpr.add(mscRefParExpr258.getTree());

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);



            // AST REWRITE
            // elements: mscRefParExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 315:43: -> ^( Alt ( mscRefParExpr )+ )
            {
                // msc_grammar.g:315:46: ^( Alt ( mscRefParExpr )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Alt, "Alt"), root_1);

                if ( !(stream_mscRefParExpr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_mscRefParExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_mscRefParExpr.nextTree());

                }
                stream_mscRefParExpr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mscRefExpr"

    public static class mscRefParExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mscRefParExpr"
    // msc_grammar.g:317:1: mscRefParExpr : mscRefSeqExpr ( 'par' mscRefSeqExpr )* -> ^( Par ( mscRefSeqExpr )+ ) ;
    public final msc_grammarParser.mscRefParExpr_return mscRefParExpr() throws RecognitionException {
        msc_grammarParser.mscRefParExpr_return retval = new msc_grammarParser.mscRefParExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal260=null;
        msc_grammarParser.mscRefSeqExpr_return mscRefSeqExpr259 = null;

        msc_grammarParser.mscRefSeqExpr_return mscRefSeqExpr261 = null;


        CommonTree string_literal260_tree=null;
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleSubtreeStream stream_mscRefSeqExpr=new RewriteRuleSubtreeStream(adaptor,"rule mscRefSeqExpr");
        try {
            // msc_grammar.g:318:2: ( mscRefSeqExpr ( 'par' mscRefSeqExpr )* -> ^( Par ( mscRefSeqExpr )+ ) )
            // msc_grammar.g:318:4: mscRefSeqExpr ( 'par' mscRefSeqExpr )*
            {
            pushFollow(FOLLOW_mscRefSeqExpr_in_mscRefParExpr2232);
            mscRefSeqExpr259=mscRefSeqExpr();

            state._fsp--;

            stream_mscRefSeqExpr.add(mscRefSeqExpr259.getTree());
            // msc_grammar.g:318:18: ( 'par' mscRefSeqExpr )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==94) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // msc_grammar.g:318:20: 'par' mscRefSeqExpr
            	    {
            	    string_literal260=(Token)match(input,94,FOLLOW_94_in_mscRefParExpr2236);  
            	    stream_94.add(string_literal260);

            	    pushFollow(FOLLOW_mscRefSeqExpr_in_mscRefParExpr2238);
            	    mscRefSeqExpr261=mscRefSeqExpr();

            	    state._fsp--;

            	    stream_mscRefSeqExpr.add(mscRefSeqExpr261.getTree());

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);



            // AST REWRITE
            // elements: mscRefSeqExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 318:43: -> ^( Par ( mscRefSeqExpr )+ )
            {
                // msc_grammar.g:318:46: ^( Par ( mscRefSeqExpr )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Par, "Par"), root_1);

                if ( !(stream_mscRefSeqExpr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_mscRefSeqExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_mscRefSeqExpr.nextTree());

                }
                stream_mscRefSeqExpr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mscRefParExpr"

    public static class mscRefSeqExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mscRefSeqExpr"
    // msc_grammar.g:320:1: mscRefSeqExpr : mscRefIdentExpr ( 'seq' mscRefIdentExpr )* -> ^( Seq ( mscRefIdentExpr )+ ) ;
    public final msc_grammarParser.mscRefSeqExpr_return mscRefSeqExpr() throws RecognitionException {
        msc_grammarParser.mscRefSeqExpr_return retval = new msc_grammarParser.mscRefSeqExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal263=null;
        msc_grammarParser.mscRefIdentExpr_return mscRefIdentExpr262 = null;

        msc_grammarParser.mscRefIdentExpr_return mscRefIdentExpr264 = null;


        CommonTree string_literal263_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleSubtreeStream stream_mscRefIdentExpr=new RewriteRuleSubtreeStream(adaptor,"rule mscRefIdentExpr");
        try {
            // msc_grammar.g:321:2: ( mscRefIdentExpr ( 'seq' mscRefIdentExpr )* -> ^( Seq ( mscRefIdentExpr )+ ) )
            // msc_grammar.g:321:4: mscRefIdentExpr ( 'seq' mscRefIdentExpr )*
            {
            pushFollow(FOLLOW_mscRefIdentExpr_in_mscRefSeqExpr2263);
            mscRefIdentExpr262=mscRefIdentExpr();

            state._fsp--;

            stream_mscRefIdentExpr.add(mscRefIdentExpr262.getTree());
            // msc_grammar.g:321:20: ( 'seq' mscRefIdentExpr )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==112) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // msc_grammar.g:321:22: 'seq' mscRefIdentExpr
            	    {
            	    string_literal263=(Token)match(input,112,FOLLOW_112_in_mscRefSeqExpr2267);  
            	    stream_112.add(string_literal263);

            	    pushFollow(FOLLOW_mscRefIdentExpr_in_mscRefSeqExpr2269);
            	    mscRefIdentExpr264=mscRefIdentExpr();

            	    state._fsp--;

            	    stream_mscRefIdentExpr.add(mscRefIdentExpr264.getTree());

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);



            // AST REWRITE
            // elements: mscRefIdentExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 321:47: -> ^( Seq ( mscRefIdentExpr )+ )
            {
                // msc_grammar.g:321:50: ^( Seq ( mscRefIdentExpr )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Seq, "Seq"), root_1);

                if ( !(stream_mscRefIdentExpr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_mscRefIdentExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_mscRefIdentExpr.nextTree());

                }
                stream_mscRefIdentExpr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mscRefSeqExpr"

    public static class mscRefIdentExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mscRefIdentExpr"
    // msc_grammar.g:323:1: mscRefIdentExpr : ( 'loop' ( loopBoundary )? mscRefIdentExpr -> ^( Loop ( loopBoundary )? mscRefIdentExpr ) | 'exc' mscRefIdentExpr -> ^( Exc mscRefIdentExpr ) | 'opt' mscRefIdentExpr -> ^( Opt mscRefIdentExpr ) | 'empty' -> ^( Empty ) | mscName -> ^( MSC mscName ) | '(' mscRefExpr ')' -> ^( Ref mscRefExpr ) );
    public final msc_grammarParser.mscRefIdentExpr_return mscRefIdentExpr() throws RecognitionException {
        msc_grammarParser.mscRefIdentExpr_return retval = new msc_grammarParser.mscRefIdentExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal265=null;
        Token string_literal268=null;
        Token string_literal270=null;
        Token string_literal272=null;
        Token char_literal274=null;
        Token char_literal276=null;
        msc_grammarParser.loopBoundary_return loopBoundary266 = null;

        msc_grammarParser.mscRefIdentExpr_return mscRefIdentExpr267 = null;

        msc_grammarParser.mscRefIdentExpr_return mscRefIdentExpr269 = null;

        msc_grammarParser.mscRefIdentExpr_return mscRefIdentExpr271 = null;

        msc_grammarParser.mscName_return mscName273 = null;

        msc_grammarParser.mscRefExpr_return mscRefExpr275 = null;


        CommonTree string_literal265_tree=null;
        CommonTree string_literal268_tree=null;
        CommonTree string_literal270_tree=null;
        CommonTree string_literal272_tree=null;
        CommonTree char_literal274_tree=null;
        CommonTree char_literal276_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_mscRefExpr=new RewriteRuleSubtreeStream(adaptor,"rule mscRefExpr");
        RewriteRuleSubtreeStream stream_loopBoundary=new RewriteRuleSubtreeStream(adaptor,"rule loopBoundary");
        RewriteRuleSubtreeStream stream_mscRefIdentExpr=new RewriteRuleSubtreeStream(adaptor,"rule mscRefIdentExpr");
        RewriteRuleSubtreeStream stream_mscName=new RewriteRuleSubtreeStream(adaptor,"rule mscName");
        try {
            // msc_grammar.g:324:2: ( 'loop' ( loopBoundary )? mscRefIdentExpr -> ^( Loop ( loopBoundary )? mscRefIdentExpr ) | 'exc' mscRefIdentExpr -> ^( Exc mscRefIdentExpr ) | 'opt' mscRefIdentExpr -> ^( Opt mscRefIdentExpr ) | 'empty' -> ^( Empty ) | mscName -> ^( MSC mscName ) | '(' mscRefExpr ')' -> ^( Ref mscRefExpr ) )
            int alt74=6;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt74=1;
                }
                break;
            case 92:
                {
                alt74=2;
                }
                break;
            case 91:
                {
                alt74=3;
                }
                break;
            case 113:
                {
                alt74=4;
                }
                break;
            case NAME:
                {
                alt74=5;
                }
                break;
            case 76:
                {
                alt74=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // msc_grammar.g:324:4: 'loop' ( loopBoundary )? mscRefIdentExpr
                    {
                    string_literal265=(Token)match(input,90,FOLLOW_90_in_mscRefIdentExpr2294);  
                    stream_90.add(string_literal265);

                    // msc_grammar.g:324:11: ( loopBoundary )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==95) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // msc_grammar.g:324:13: loopBoundary
                            {
                            pushFollow(FOLLOW_loopBoundary_in_mscRefIdentExpr2298);
                            loopBoundary266=loopBoundary();

                            state._fsp--;

                            stream_loopBoundary.add(loopBoundary266.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_mscRefIdentExpr_in_mscRefIdentExpr2303);
                    mscRefIdentExpr267=mscRefIdentExpr();

                    state._fsp--;

                    stream_mscRefIdentExpr.add(mscRefIdentExpr267.getTree());


                    // AST REWRITE
                    // elements: mscRefIdentExpr, loopBoundary
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 324:46: -> ^( Loop ( loopBoundary )? mscRefIdentExpr )
                    {
                        // msc_grammar.g:324:49: ^( Loop ( loopBoundary )? mscRefIdentExpr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Loop, "Loop"), root_1);

                        // msc_grammar.g:324:57: ( loopBoundary )?
                        if ( stream_loopBoundary.hasNext() ) {
                            adaptor.addChild(root_1, stream_loopBoundary.nextTree());

                        }
                        stream_loopBoundary.reset();
                        adaptor.addChild(root_1, stream_mscRefIdentExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // msc_grammar.g:325:4: 'exc' mscRefIdentExpr
                    {
                    string_literal268=(Token)match(input,92,FOLLOW_92_in_mscRefIdentExpr2322);  
                    stream_92.add(string_literal268);

                    pushFollow(FOLLOW_mscRefIdentExpr_in_mscRefIdentExpr2324);
                    mscRefIdentExpr269=mscRefIdentExpr();

                    state._fsp--;

                    stream_mscRefIdentExpr.add(mscRefIdentExpr269.getTree());


                    // AST REWRITE
                    // elements: mscRefIdentExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 325:30: -> ^( Exc mscRefIdentExpr )
                    {
                        // msc_grammar.g:325:33: ^( Exc mscRefIdentExpr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Exc, "Exc"), root_1);

                        adaptor.addChild(root_1, stream_mscRefIdentExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // msc_grammar.g:326:4: 'opt' mscRefIdentExpr
                    {
                    string_literal270=(Token)match(input,91,FOLLOW_91_in_mscRefIdentExpr2343);  
                    stream_91.add(string_literal270);

                    pushFollow(FOLLOW_mscRefIdentExpr_in_mscRefIdentExpr2345);
                    mscRefIdentExpr271=mscRefIdentExpr();

                    state._fsp--;

                    stream_mscRefIdentExpr.add(mscRefIdentExpr271.getTree());


                    // AST REWRITE
                    // elements: mscRefIdentExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 326:30: -> ^( Opt mscRefIdentExpr )
                    {
                        // msc_grammar.g:326:33: ^( Opt mscRefIdentExpr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Opt, "Opt"), root_1);

                        adaptor.addChild(root_1, stream_mscRefIdentExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // msc_grammar.g:327:4: 'empty'
                    {
                    string_literal272=(Token)match(input,113,FOLLOW_113_in_mscRefIdentExpr2364);  
                    stream_113.add(string_literal272);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 327:17: -> ^( Empty )
                    {
                        // msc_grammar.g:327:20: ^( Empty )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Empty, "Empty"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // msc_grammar.g:328:4: mscName
                    {
                    pushFollow(FOLLOW_mscName_in_mscRefIdentExpr2382);
                    mscName273=mscName();

                    state._fsp--;

                    stream_mscName.add(mscName273.getTree());


                    // AST REWRITE
                    // elements: mscName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 328:17: -> ^( MSC mscName )
                    {
                        // msc_grammar.g:328:20: ^( MSC mscName )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MSC, "MSC"), root_1);

                        adaptor.addChild(root_1, stream_mscName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // msc_grammar.g:329:5: '(' mscRefExpr ')'
                    {
                    char_literal274=(Token)match(input,76,FOLLOW_76_in_mscRefIdentExpr2403);  
                    stream_76.add(char_literal274);

                    pushFollow(FOLLOW_mscRefExpr_in_mscRefIdentExpr2405);
                    mscRefExpr275=mscRefExpr();

                    state._fsp--;

                    stream_mscRefExpr.add(mscRefExpr275.getTree());
                    char_literal276=(Token)match(input,77,FOLLOW_77_in_mscRefIdentExpr2407);  
                    stream_77.add(char_literal276);



                    // AST REWRITE
                    // elements: mscRefExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 329:27: -> ^( Ref mscRefExpr )
                    {
                        // msc_grammar.g:329:30: ^( Ref mscRefExpr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Ref, "Ref"), root_1);

                        adaptor.addChild(root_1, stream_mscRefExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mscRefIdentExpr"

    public static class binding_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "binding"
    // msc_grammar.g:333:1: binding : ( leftBinding | rightBinding );
    public final msc_grammarParser.binding_return binding() throws RecognitionException {
        msc_grammarParser.binding_return retval = new msc_grammarParser.binding_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.leftBinding_return leftBinding277 = null;

        msc_grammarParser.rightBinding_return rightBinding278 = null;



        try {
            // msc_grammar.g:333:9: ( leftBinding | rightBinding )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==NAME) ) {
                int LA75_1 = input.LA(2);

                if ( (LA75_1==LEFTBINDSYMBOL) ) {
                    alt75=1;
                }
                else if ( (LA75_1==RIGHTBINDSYMBOL) ) {
                    alt75=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 75, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // msc_grammar.g:333:11: leftBinding
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_leftBinding_in_binding2432);
                    leftBinding277=leftBinding();

                    state._fsp--;

                    adaptor.addChild(root_0, leftBinding277.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:334:5: rightBinding
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rightBinding_in_binding2438);
                    rightBinding278=rightBinding();

                    state._fsp--;

                    adaptor.addChild(root_0, rightBinding278.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "binding"

    public static class leftBinding_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "leftBinding"
    // msc_grammar.g:336:1: leftBinding : pattern LEFTBINDSYMBOL expressionString -> ^( Bind pattern expressionString ) ;
    public final msc_grammarParser.leftBinding_return leftBinding() throws RecognitionException {
        msc_grammarParser.leftBinding_return retval = new msc_grammarParser.leftBinding_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LEFTBINDSYMBOL280=null;
        msc_grammarParser.pattern_return pattern279 = null;

        msc_grammarParser.expressionString_return expressionString281 = null;


        CommonTree LEFTBINDSYMBOL280_tree=null;
        RewriteRuleTokenStream stream_LEFTBINDSYMBOL=new RewriteRuleTokenStream(adaptor,"token LEFTBINDSYMBOL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_expressionString=new RewriteRuleSubtreeStream(adaptor,"rule expressionString");
        try {
            // msc_grammar.g:337:2: ( pattern LEFTBINDSYMBOL expressionString -> ^( Bind pattern expressionString ) )
            // msc_grammar.g:337:4: pattern LEFTBINDSYMBOL expressionString
            {
            pushFollow(FOLLOW_pattern_in_leftBinding2449);
            pattern279=pattern();

            state._fsp--;

            stream_pattern.add(pattern279.getTree());
            LEFTBINDSYMBOL280=(Token)match(input,LEFTBINDSYMBOL,FOLLOW_LEFTBINDSYMBOL_in_leftBinding2451);  
            stream_LEFTBINDSYMBOL.add(LEFTBINDSYMBOL280);

            pushFollow(FOLLOW_expressionString_in_leftBinding2453);
            expressionString281=expressionString();

            state._fsp--;

            stream_expressionString.add(expressionString281.getTree());


            // AST REWRITE
            // elements: expressionString, pattern
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 337:44: -> ^( Bind pattern expressionString )
            {
                // msc_grammar.g:337:47: ^( Bind pattern expressionString )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Bind, "Bind"), root_1);

                adaptor.addChild(root_1, stream_pattern.nextTree());
                adaptor.addChild(root_1, stream_expressionString.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "leftBinding"

    public static class rightBinding_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rightBinding"
    // msc_grammar.g:339:1: rightBinding : expressionString RIGHTBINDSYMBOL pattern -> ^( Bind pattern expressionString ) ;
    public final msc_grammarParser.rightBinding_return rightBinding() throws RecognitionException {
        msc_grammarParser.rightBinding_return retval = new msc_grammarParser.rightBinding_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RIGHTBINDSYMBOL283=null;
        msc_grammarParser.expressionString_return expressionString282 = null;

        msc_grammarParser.pattern_return pattern284 = null;


        CommonTree RIGHTBINDSYMBOL283_tree=null;
        RewriteRuleTokenStream stream_RIGHTBINDSYMBOL=new RewriteRuleTokenStream(adaptor,"token RIGHTBINDSYMBOL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_expressionString=new RewriteRuleSubtreeStream(adaptor,"rule expressionString");
        try {
            // msc_grammar.g:340:2: ( expressionString RIGHTBINDSYMBOL pattern -> ^( Bind pattern expressionString ) )
            // msc_grammar.g:340:4: expressionString RIGHTBINDSYMBOL pattern
            {
            pushFollow(FOLLOW_expressionString_in_rightBinding2476);
            expressionString282=expressionString();

            state._fsp--;

            stream_expressionString.add(expressionString282.getTree());
            RIGHTBINDSYMBOL283=(Token)match(input,RIGHTBINDSYMBOL,FOLLOW_RIGHTBINDSYMBOL_in_rightBinding2478);  
            stream_RIGHTBINDSYMBOL.add(RIGHTBINDSYMBOL283);

            pushFollow(FOLLOW_pattern_in_rightBinding2480);
            pattern284=pattern();

            state._fsp--;

            stream_pattern.add(pattern284.getTree());


            // AST REWRITE
            // elements: pattern, expressionString
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 340:45: -> ^( Bind pattern expressionString )
            {
                // msc_grammar.g:340:48: ^( Bind pattern expressionString )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Bind, "Bind"), root_1);

                adaptor.addChild(root_1, stream_pattern.nextTree());
                adaptor.addChild(root_1, stream_expressionString.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rightBinding"

    public static class pattern_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pattern"
    // msc_grammar.g:342:1: pattern : variableString ;
    public final msc_grammarParser.pattern_return pattern() throws RecognitionException {
        msc_grammarParser.pattern_return retval = new msc_grammarParser.pattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.variableString_return variableString285 = null;



        try {
            // msc_grammar.g:343:2: ( variableString )
            // msc_grammar.g:343:4: variableString
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_variableString_in_pattern2502);
            variableString285=variableString();

            state._fsp--;

            adaptor.addChild(root_0, variableString285.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pattern"

    public static class dataStatementList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dataStatementList"
    // msc_grammar.g:345:1: dataStatementList : dataStatement ( ',' dataStatementList )? -> dataStatement ( dataStatementList )? ;
    public final msc_grammarParser.dataStatementList_return dataStatementList() throws RecognitionException {
        msc_grammarParser.dataStatementList_return retval = new msc_grammarParser.dataStatementList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal287=null;
        msc_grammarParser.dataStatement_return dataStatement286 = null;

        msc_grammarParser.dataStatementList_return dataStatementList288 = null;


        CommonTree char_literal287_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleSubtreeStream stream_dataStatement=new RewriteRuleSubtreeStream(adaptor,"rule dataStatement");
        RewriteRuleSubtreeStream stream_dataStatementList=new RewriteRuleSubtreeStream(adaptor,"rule dataStatementList");
        try {
            // msc_grammar.g:346:2: ( dataStatement ( ',' dataStatementList )? -> dataStatement ( dataStatementList )? )
            // msc_grammar.g:346:4: dataStatement ( ',' dataStatementList )?
            {
            pushFollow(FOLLOW_dataStatement_in_dataStatementList2512);
            dataStatement286=dataStatement();

            state._fsp--;

            stream_dataStatement.add(dataStatement286.getTree());
            // msc_grammar.g:346:18: ( ',' dataStatementList )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==68) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // msc_grammar.g:346:20: ',' dataStatementList
                    {
                    char_literal287=(Token)match(input,68,FOLLOW_68_in_dataStatementList2516);  
                    stream_68.add(char_literal287);

                    pushFollow(FOLLOW_dataStatementList_in_dataStatementList2518);
                    dataStatementList288=dataStatementList();

                    state._fsp--;

                    stream_dataStatementList.add(dataStatementList288.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: dataStatement, dataStatementList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 346:45: -> dataStatement ( dataStatementList )?
            {
                adaptor.addChild(root_0, stream_dataStatement.nextTree());
                // msc_grammar.g:346:62: ( dataStatementList )?
                if ( stream_dataStatementList.hasNext() ) {
                    adaptor.addChild(root_0, stream_dataStatementList.nextTree());

                }
                stream_dataStatementList.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "dataStatementList"

    public static class dataStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dataStatement"
    // msc_grammar.g:348:1: dataStatement : ( defineStatement | undefineStatement | binding );
    public final msc_grammarParser.dataStatement_return dataStatement() throws RecognitionException {
        msc_grammarParser.dataStatement_return retval = new msc_grammarParser.dataStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.defineStatement_return defineStatement289 = null;

        msc_grammarParser.undefineStatement_return undefineStatement290 = null;

        msc_grammarParser.binding_return binding291 = null;



        try {
            // msc_grammar.g:349:2: ( defineStatement | undefineStatement | binding )
            int alt77=3;
            switch ( input.LA(1) ) {
            case 114:
                {
                alt77=1;
                }
                break;
            case 115:
                {
                alt77=2;
                }
                break;
            case NAME:
                {
                alt77=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // msc_grammar.g:349:4: defineStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defineStatement_in_dataStatement2538);
                    defineStatement289=defineStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, defineStatement289.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:349:22: undefineStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_undefineStatement_in_dataStatement2542);
                    undefineStatement290=undefineStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, undefineStatement290.getTree());

                    }
                    break;
                case 3 :
                    // msc_grammar.g:349:42: binding
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_binding_in_dataStatement2546);
                    binding291=binding();

                    state._fsp--;

                    adaptor.addChild(root_0, binding291.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "dataStatement"

    public static class defineStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defineStatement"
    // msc_grammar.g:351:1: defineStatement : 'def' variableString ;
    public final msc_grammarParser.defineStatement_return defineStatement() throws RecognitionException {
        msc_grammarParser.defineStatement_return retval = new msc_grammarParser.defineStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal292=null;
        msc_grammarParser.variableString_return variableString293 = null;


        CommonTree string_literal292_tree=null;

        try {
            // msc_grammar.g:352:2: ( 'def' variableString )
            // msc_grammar.g:352:4: 'def' variableString
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal292=(Token)match(input,114,FOLLOW_114_in_defineStatement2556); 
            string_literal292_tree = (CommonTree)adaptor.create(string_literal292);
            adaptor.addChild(root_0, string_literal292_tree);

            pushFollow(FOLLOW_variableString_in_defineStatement2558);
            variableString293=variableString();

            state._fsp--;

            adaptor.addChild(root_0, variableString293.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "defineStatement"

    public static class undefineStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "undefineStatement"
    // msc_grammar.g:354:1: undefineStatement : 'undef' variableString ;
    public final msc_grammarParser.undefineStatement_return undefineStatement() throws RecognitionException {
        msc_grammarParser.undefineStatement_return retval = new msc_grammarParser.undefineStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal294=null;
        msc_grammarParser.variableString_return variableString295 = null;


        CommonTree string_literal294_tree=null;

        try {
            // msc_grammar.g:355:2: ( 'undef' variableString )
            // msc_grammar.g:355:4: 'undef' variableString
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal294=(Token)match(input,115,FOLLOW_115_in_undefineStatement2568); 
            string_literal294_tree = (CommonTree)adaptor.create(string_literal294);
            adaptor.addChild(root_0, string_literal294_tree);

            pushFollow(FOLLOW_variableString_in_undefineStatement2570);
            variableString295=variableString();

            state._fsp--;

            adaptor.addChild(root_0, variableString295.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "undefineStatement"

    public static class mscName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mscName"
    // msc_grammar.g:359:1: mscName : NAME ;
    public final msc_grammarParser.mscName_return mscName() throws RecognitionException {
        msc_grammarParser.mscName_return retval = new msc_grammarParser.mscName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME296=null;

        CommonTree NAME296_tree=null;

        try {
            // msc_grammar.g:359:9: ( NAME )
            // msc_grammar.g:359:11: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME296=(Token)match(input,NAME,FOLLOW_NAME_in_mscName2581); 
            NAME296_tree = (CommonTree)adaptor.create(NAME296);
            adaptor.addChild(root_0, NAME296_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mscName"

    public static class labelName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "labelName"
    // msc_grammar.g:360:1: labelName : NAME ;
    public final msc_grammarParser.labelName_return labelName() throws RecognitionException {
        msc_grammarParser.labelName_return retval = new msc_grammarParser.labelName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME297=null;

        CommonTree NAME297_tree=null;

        try {
            // msc_grammar.g:361:2: ( NAME )
            // msc_grammar.g:361:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME297=(Token)match(input,NAME,FOLLOW_NAME_in_labelName2590); 
            NAME297_tree = (CommonTree)adaptor.create(NAME297);
            adaptor.addChild(root_0, NAME297_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "labelName"

    public static class name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "name"
    // msc_grammar.g:362:1: name : NAME ;
    public final msc_grammarParser.name_return name() throws RecognitionException {
        msc_grammarParser.name_return retval = new msc_grammarParser.name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME298=null;

        CommonTree NAME298_tree=null;

        try {
            // msc_grammar.g:362:7: ( NAME )
            // msc_grammar.g:362:9: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME298=(Token)match(input,NAME,FOLLOW_NAME_in_name2598); 
            NAME298_tree = (CommonTree)adaptor.create(NAME298);
            adaptor.addChild(root_0, NAME298_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "name"

    public static class instanceName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instanceName"
    // msc_grammar.g:363:1: instanceName : NAME ;
    public final msc_grammarParser.instanceName_return instanceName() throws RecognitionException {
        msc_grammarParser.instanceName_return retval = new msc_grammarParser.instanceName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME299=null;

        CommonTree NAME299_tree=null;

        try {
            // msc_grammar.g:364:2: ( NAME )
            // msc_grammar.g:364:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME299=(Token)match(input,NAME,FOLLOW_NAME_in_instanceName2607); 
            NAME299_tree = (CommonTree)adaptor.create(NAME299);
            adaptor.addChild(root_0, NAME299_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instanceName"

    public static class messageName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "messageName"
    // msc_grammar.g:365:1: messageName : NAME ;
    public final msc_grammarParser.messageName_return messageName() throws RecognitionException {
        msc_grammarParser.messageName_return retval = new msc_grammarParser.messageName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME300=null;

        CommonTree NAME300_tree=null;

        try {
            // msc_grammar.g:366:2: ( NAME )
            // msc_grammar.g:366:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME300=(Token)match(input,NAME,FOLLOW_NAME_in_messageName2616); 
            NAME300_tree = (CommonTree)adaptor.create(NAME300);
            adaptor.addChild(root_0, NAME300_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "messageName"

    public static class messageInstanceName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "messageInstanceName"
    // msc_grammar.g:367:1: messageInstanceName : NAME ;
    public final msc_grammarParser.messageInstanceName_return messageInstanceName() throws RecognitionException {
        msc_grammarParser.messageInstanceName_return retval = new msc_grammarParser.messageInstanceName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME301=null;

        CommonTree NAME301_tree=null;

        try {
            // msc_grammar.g:368:2: ( NAME )
            // msc_grammar.g:368:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME301=(Token)match(input,NAME,FOLLOW_NAME_in_messageInstanceName2625); 
            NAME301_tree = (CommonTree)adaptor.create(NAME301);
            adaptor.addChild(root_0, NAME301_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "messageInstanceName"

    public static class gateName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "gateName"
    // msc_grammar.g:369:1: gateName : NAME ;
    public final msc_grammarParser.gateName_return gateName() throws RecognitionException {
        msc_grammarParser.gateName_return retval = new msc_grammarParser.gateName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME302=null;

        CommonTree NAME302_tree=null;

        try {
            // msc_grammar.g:370:2: ( NAME )
            // msc_grammar.g:370:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME302=(Token)match(input,NAME,FOLLOW_NAME_in_gateName2634); 
            NAME302_tree = (CommonTree)adaptor.create(NAME302);
            adaptor.addChild(root_0, NAME302_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "gateName"

    public static class eventName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eventName"
    // msc_grammar.g:371:1: eventName : NAME ;
    public final msc_grammarParser.eventName_return eventName() throws RecognitionException {
        msc_grammarParser.eventName_return retval = new msc_grammarParser.eventName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME303=null;

        CommonTree NAME303_tree=null;

        try {
            // msc_grammar.g:372:2: ( NAME )
            // msc_grammar.g:372:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME303=(Token)match(input,NAME,FOLLOW_NAME_in_eventName2643); 
            NAME303_tree = (CommonTree)adaptor.create(NAME303);
            adaptor.addChild(root_0, NAME303_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "eventName"

    public static class characterString_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "characterString"
    // msc_grammar.g:373:1: characterString : CHARACTERSTRING ;
    public final msc_grammarParser.characterString_return characterString() throws RecognitionException {
        msc_grammarParser.characterString_return retval = new msc_grammarParser.characterString_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CHARACTERSTRING304=null;

        CommonTree CHARACTERSTRING304_tree=null;

        try {
            // msc_grammar.g:374:2: ( CHARACTERSTRING )
            // msc_grammar.g:374:4: CHARACTERSTRING
            {
            root_0 = (CommonTree)adaptor.nil();

            CHARACTERSTRING304=(Token)match(input,CHARACTERSTRING,FOLLOW_CHARACTERSTRING_in_characterString2652); 
            CHARACTERSTRING304_tree = (CommonTree)adaptor.create(CHARACTERSTRING304);
            adaptor.addChild(root_0, CHARACTERSTRING304_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "characterString"

    public static class identifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identifier"
    // msc_grammar.g:376:1: identifier : NAME ;
    public final msc_grammarParser.identifier_return identifier() throws RecognitionException {
        msc_grammarParser.identifier_return retval = new msc_grammarParser.identifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME305=null;

        CommonTree NAME305_tree=null;

        try {
            // msc_grammar.g:377:2: ( NAME )
            // msc_grammar.g:377:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME305=(Token)match(input,NAME,FOLLOW_NAME_in_identifier2662); 
            NAME305_tree = (CommonTree)adaptor.create(NAME305);
            adaptor.addChild(root_0, NAME305_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "identifier"

    public static class variableString_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableString"
    // msc_grammar.g:387:1: variableString : NAME ;
    public final msc_grammarParser.variableString_return variableString() throws RecognitionException {
        msc_grammarParser.variableString_return retval = new msc_grammarParser.variableString_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME306=null;

        CommonTree NAME306_tree=null;

        try {
            // msc_grammar.g:388:2: ( NAME )
            // msc_grammar.g:388:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME306=(Token)match(input,NAME,FOLLOW_NAME_in_variableString2682); 
            NAME306_tree = (CommonTree)adaptor.create(NAME306);
            adaptor.addChild(root_0, NAME306_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variableString"

    public static class expressionString_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionString"
    // msc_grammar.g:392:1: expressionString : expression -> ^( Expr expression ) ;
    public final msc_grammarParser.expressionString_return expressionString() throws RecognitionException {
        msc_grammarParser.expressionString_return retval = new msc_grammarParser.expressionString_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.expression_return expression307 = null;


        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // msc_grammar.g:393:2: ( expression -> ^( Expr expression ) )
            // msc_grammar.g:393:4: expression
            {
            pushFollow(FOLLOW_expression_in_expressionString2693);
            expression307=expression();

            state._fsp--;

            stream_expression.add(expression307.getTree());


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 393:15: -> ^( Expr expression )
            {
                // msc_grammar.g:393:18: ^( Expr expression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Expr, "Expr"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressionString"

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // msc_grammar.g:396:1: expression : NAME ;
    public final msc_grammarParser.expression_return expression() throws RecognitionException {
        msc_grammarParser.expression_return retval = new msc_grammarParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME308=null;

        CommonTree NAME308_tree=null;

        try {
            // msc_grammar.g:397:2: ( NAME )
            // msc_grammar.g:397:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME308=(Token)match(input,NAME,FOLLOW_NAME_in_expression2714); 
            NAME308_tree = (CommonTree)adaptor.create(NAME308);
            adaptor.addChild(root_0, NAME308_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class dataTypeName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dataTypeName"
    // msc_grammar.g:401:1: dataTypeName : NAME ;
    public final msc_grammarParser.dataTypeName_return dataTypeName() throws RecognitionException {
        msc_grammarParser.dataTypeName_return retval = new msc_grammarParser.dataTypeName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME309=null;

        CommonTree NAME309_tree=null;

        try {
            // msc_grammar.g:402:2: ( NAME )
            // msc_grammar.g:402:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME309=(Token)match(input,NAME,FOLLOW_NAME_in_dataTypeName2726); 
            NAME309_tree = (CommonTree)adaptor.create(NAME309);
            adaptor.addChild(root_0, NAME309_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "dataTypeName"

    public static class datatypeTypeExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "datatypeTypeExpression"
    // msc_grammar.g:403:1: datatypeTypeExpression : NAME ;
    public final msc_grammarParser.datatypeTypeExpression_return datatypeTypeExpression() throws RecognitionException {
        msc_grammarParser.datatypeTypeExpression_return retval = new msc_grammarParser.datatypeTypeExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME310=null;

        CommonTree NAME310_tree=null;

        try {
            // msc_grammar.g:404:2: ( NAME )
            // msc_grammar.g:404:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME310=(Token)match(input,NAME,FOLLOW_NAME_in_datatypeTypeExpression2734); 
            NAME310_tree = (CommonTree)adaptor.create(NAME310);
            adaptor.addChild(root_0, NAME310_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "datatypeTypeExpression"

    public static class literalNameOrNumber_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literalNameOrNumber"
    // msc_grammar.g:405:1: literalNameOrNumber : NAME ;
    public final msc_grammarParser.literalNameOrNumber_return literalNameOrNumber() throws RecognitionException {
        msc_grammarParser.literalNameOrNumber_return retval = new msc_grammarParser.literalNameOrNumber_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME311=null;

        CommonTree NAME311_tree=null;

        try {
            // msc_grammar.g:406:2: ( NAME )
            // msc_grammar.g:406:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME311=(Token)match(input,NAME,FOLLOW_NAME_in_literalNameOrNumber2742); 
            NAME311_tree = (CommonTree)adaptor.create(NAME311);
            adaptor.addChild(root_0, NAME311_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "literalNameOrNumber"

    public static class naturalSimpleExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "naturalSimpleExpression"
    // msc_grammar.g:407:1: naturalSimpleExpression : NAME ;
    public final msc_grammarParser.naturalSimpleExpression_return naturalSimpleExpression() throws RecognitionException {
        msc_grammarParser.naturalSimpleExpression_return retval = new msc_grammarParser.naturalSimpleExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME312=null;

        CommonTree NAME312_tree=null;

        try {
            // msc_grammar.g:408:2: ( NAME )
            // msc_grammar.g:408:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME312=(Token)match(input,NAME,FOLLOW_NAME_in_naturalSimpleExpression2750); 
            NAME312_tree = (CommonTree)adaptor.create(NAME312);
            adaptor.addChild(root_0, NAME312_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "naturalSimpleExpression"

    public static class fieldName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldName"
    // msc_grammar.g:409:1: fieldName : NAME ;
    public final msc_grammarParser.fieldName_return fieldName() throws RecognitionException {
        msc_grammarParser.fieldName_return retval = new msc_grammarParser.fieldName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME313=null;

        CommonTree NAME313_tree=null;

        try {
            // msc_grammar.g:410:2: ( NAME )
            // msc_grammar.g:410:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME313=(Token)match(input,NAME,FOLLOW_NAME_in_fieldName2758); 
            NAME313_tree = (CommonTree)adaptor.create(NAME313);
            adaptor.addChild(root_0, NAME313_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fieldName"

    public static class constantExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constantExpression"
    // msc_grammar.g:412:1: constantExpression : NAME ;
    public final msc_grammarParser.constantExpression_return constantExpression() throws RecognitionException {
        msc_grammarParser.constantExpression_return retval = new msc_grammarParser.constantExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME314=null;

        CommonTree NAME314_tree=null;

        try {
            // msc_grammar.g:413:2: ( NAME )
            // msc_grammar.g:413:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME314=(Token)match(input,NAME,FOLLOW_NAME_in_constantExpression2768); 
            NAME314_tree = (CommonTree)adaptor.create(NAME314);
            adaptor.addChild(root_0, NAME314_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constantExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_messageSequenceChart_in_msc206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_messageSequenceChart218 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_mscHead_in_messageSequenceChart220 = new BitSet(new long[]{0x0004800000000000L});
    public static final BitSet FOLLOW_body_in_messageSequenceChart222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_messageSequenceChart224 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_end_in_messageSequenceChart226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscName_in_mscHead249 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_end_in_mscHead251 = new BitSet(new long[]{0x0000000000000002L,0x0000040000080000L});
    public static final BitSet FOLLOW_mscInterface_in_mscHead255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscBody_in_body285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscStatement_in_mscBody298 = new BitSet(new long[]{0x0004800000000002L});
    public static final BitSet FOLLOW_eventDefinition_in_mscStatement323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceName_in_eventDefinition335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_eventDefinition337 = new BitSet(new long[]{0x0004000000000000L,0x0000233800070160L});
    public static final BitSet FOLLOW_instanceEventList_in_eventDefinition339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceNameList_in_eventDefinition357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_eventDefinition359 = new BitSet(new long[]{0x0000000000000000L,0x000080007E000000L});
    public static final BitSet FOLLOW_multiInstanceEventList_in_eventDefinition361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceEvent_in_instanceEventList388 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_end_in_instanceEventList390 = new BitSet(new long[]{0x0004000000000002L,0x0000233800070160L});
    public static final BitSet FOLLOW_orderableEvent_in_instanceEvent411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonOrderableEvent_in_instanceEvent415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_label_in_orderableEvent427 = new BitSet(new long[]{0x0004000000000000L,0x0000032800010160L});
    public static final BitSet FOLLOW_messageEvent_in_orderableEvent432 = new BitSet(new long[]{0x0000000000000002L,0x0000180000000000L});
    public static final BitSet FOLLOW_action_in_orderableEvent436 = new BitSet(new long[]{0x0000000000000002L,0x0000180000000000L});
    public static final BitSet FOLLOW_create_in_orderableEvent440 = new BitSet(new long[]{0x0000000000000002L,0x0000180000000000L});
    public static final BitSet FOLLOW_timerStatement_in_orderableEvent444 = new BitSet(new long[]{0x0000000000000002L,0x0000180000000000L});
    public static final BitSet FOLLOW_generalOrdering_in_orderableEvent448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceHeadStatement_in_nonOrderableEvent461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceEndStatement_in_nonOrderableEvent465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stop_in_nonOrderableEvent469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coregion_in_nonOrderableEvent473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceName_in_instanceNameList486 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_instanceNameList490 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_instanceName_in_instanceNameList492 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_ALL_in_instanceNameList512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiInstanceEvent_in_multiInstanceEventList537 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_end_in_multiInstanceEventList539 = new BitSet(new long[]{0x0000000000000002L,0x000080007E000000L});
    public static final BitSet FOLLOW_condition_in_multiInstanceEvent560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscReference_in_multiInstanceEvent564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inlineExpr_in_multiInstanceEvent568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eventName_in_label582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_label586 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_eventName_in_label588 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_end_in_label590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_messageEvent615 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_msgIdentification_in_messageEvent617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_messageEvent619 = new BitSet(new long[]{0x0004000000000000L,0x0000000000004400L});
    public static final BitSet FOLLOW_messageReceiver_in_messageEvent621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_messageEvent638 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_msgIdentification_in_messageEvent640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_messageEvent642 = new BitSet(new long[]{0x0004000000000000L,0x0000000000004800L});
    public static final BitSet FOLLOW_messageSender_in_messageEvent644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inputAddress_in_messageReceiver670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_messageReceiver681 = new BitSet(new long[]{0x0004000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_inputAddress_in_messageReceiver685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_outputAddress_in_messageSender707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_messageSender718 = new BitSet(new long[]{0x0004000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_outputAddress_in_messageSender722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_messageName_in_msgIdentification745 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001010L});
    public static final BitSet FOLLOW_68_in_msgIdentification749 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_messageInstanceName_in_msgIdentification751 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_msgIdentification758 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_parameterList_in_msgIdentification760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_msgIdentification762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameterDefn_in_parameterList791 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_parameterList795 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_parameterList_in_parameterList797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binding_in_parameterDefn818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceName_in_outputAddress832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_outputAddress837 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_outputAddress841 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_gateName_in_outputAddress843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceName_in_inputAddress870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_inputAddress875 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_inputAddress879 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_gateName_in_inputAddress881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_action907 = new BitSet(new long[]{0x0084000000000000L,0x000C000000000000L});
    public static final BitSet FOLLOW_actionStatement_in_action909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_informalAction_in_actionStatement924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dataStatementList_in_actionStatement940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characterString_in_informalAction967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_instanceHeadStatement980 = new BitSet(new long[]{0x0004000000000002L,0x0000000000F00000L});
    public static final BitSet FOLLOW_instanceKind_in_instanceHeadStatement984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_instanceEndStatement1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscInstInterface_in_mscInterface1012 = new BitSet(new long[]{0x0000000000000002L,0x0000040000080000L});
    public static final BitSet FOLLOW_mscGateInterface_in_mscInterface1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscGateInterface_in_mscInterface1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_mscInstInterface1036 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_instanceList_in_mscInstInterface1038 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_end_in_mscInstInterface1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceName_in_instanceList1053 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_instanceList1057 = new BitSet(new long[]{0x0004000000000000L,0x0000000000F00000L});
    public static final BitSet FOLLOW_instanceKind_in_instanceList1059 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_instanceList1066 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_instanceList_in_instanceList1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kindDenominator_in_instanceKind1086 = new BitSet(new long[]{0x0004000000000000L,0x0000000000F00000L});
    public static final BitSet FOLLOW_identifier_in_instanceKind1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_kindDenominator1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_kindDenominator1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_kindDenominator1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_kindDenominator1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_kindDenominator1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_end1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionIdentification_in_condition1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_conditionIdentification1155 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_conditionText_in_conditionIdentification1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionNameList_in_conditionText1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHEN_in_conditionText1194 = new BitSet(new long[]{0x0004000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_conditionGuard_in_conditionText1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OTHERWISE_in_conditionText1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionNameList_in_conditionGuard1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_conditionGuard1244 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_expressionString_in_conditionGuard1246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_conditionGuard1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_conditionNameList1276 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_conditionNameList1280 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_NAME_in_conditionNameList1282 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_loopExpr_in_inlineExpr1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optExpr_in_inlineExpr1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_altExpr_in_inlineExpr1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpr_in_inlineExpr1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_excExpr_in_inlineExpr1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_loopExpr1330 = new BitSet(new long[]{0x0008000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_loopBoundary_in_loopExpr1334 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_BEGIN_in_loopExpr1339 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_end_in_loopExpr1341 = new BitSet(new long[]{0x0004800000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_mscBody_in_loopExpr1343 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_loopExpr1345 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_END_in_loopExpr1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_optExpr1369 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_BEGIN_in_optExpr1371 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_end_in_optExpr1373 = new BitSet(new long[]{0x0004800000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_mscBody_in_optExpr1375 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_optExpr1377 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_END_in_optExpr1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_excExpr1398 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_BEGIN_in_excExpr1400 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_end_in_excExpr1402 = new BitSet(new long[]{0x0004800000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_mscBody_in_excExpr1404 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_excExpr1406 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_END_in_excExpr1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_altExpr1427 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_BEGIN_in_altExpr1429 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_end_in_altExpr1431 = new BitSet(new long[]{0x0004800000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_mscBody_in_altExpr1433 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_altExpr1437 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_end_in_altExpr1439 = new BitSet(new long[]{0x0004800000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_mscBody_in_altExpr1441 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_altExpr1446 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_END_in_altExpr1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_parExpr1468 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_BEGIN_in_parExpr1470 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_end_in_parExpr1472 = new BitSet(new long[]{0x0004800000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_mscBody_in_parExpr1474 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_parExpr1478 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_end_in_parExpr1480 = new BitSet(new long[]{0x0004800000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_mscBody_in_parExpr1482 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_parExpr1487 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_END_in_parExpr1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_loopBoundary1510 = new BitSet(new long[]{0x0000000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_infNatural_in_loopBoundary1512 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000010L});
    public static final BitSet FOLLOW_68_in_loopBoundary1516 = new BitSet(new long[]{0x0000000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_infNatural_in_loopBoundary1518 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_loopBoundary1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_infNatural1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_infNatural1549 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_expressionString_in_infNatural1551 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_infNatural1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_create1566 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_instanceName_in_create1568 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_create1572 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_parameterList_in_create1574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_create1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_stop1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setTimer_in_timerStatement1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_resetTimer_in_timerStatement1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeout_in_timerStatement1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_setTimer1641 = new BitSet(new long[]{0x0004000000000000L,0x0000000000F00000L});
    public static final BitSet FOLLOW_name_in_setTimer1643 = new BitSet(new long[]{0x0000000000000002L,0x0000004000001010L});
    public static final BitSet FOLLOW_68_in_setTimer1647 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_instanceName_in_setTimer1649 = new BitSet(new long[]{0x0000000000000002L,0x0000004000001000L});
    public static final BitSet FOLLOW_duration_in_setTimer1656 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_setTimer1663 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_parameterList_in_setTimer1665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_setTimer1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_duration1704 = new BitSet(new long[]{0x0000000000000000L,0x0000008600000010L});
    public static final BitSet FOLLOW_infNatural_in_duration1708 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000010L});
    public static final BitSet FOLLOW_68_in_duration1715 = new BitSet(new long[]{0x0000000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_infNatural_in_duration1717 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_duration1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_resetTimer1733 = new BitSet(new long[]{0x0004000000000000L,0x0000000000F00000L});
    public static final BitSet FOLLOW_name_in_resetTimer1735 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_resetTimer1739 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_instanceName_in_resetTimer1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_timeout1766 = new BitSet(new long[]{0x0004000000000000L,0x0000000000F00000L});
    public static final BitSet FOLLOW_name_in_timeout1768 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001010L});
    public static final BitSet FOLLOW_68_in_timeout1772 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_instanceName_in_timeout1774 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_timeout1781 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_parameterList_in_timeout1783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_timeout1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscGateDef_in_mscGateInterface1818 = new BitSet(new long[]{0x0000000000000002L,0x0000040000080000L});
    public static final BitSet FOLLOW_106_in_mscGateDef1830 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000140L});
    public static final BitSet FOLLOW_msgGate_in_mscGateDef1834 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_orderGate_in_mscGateDef1838 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_end_in_mscGateDef1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defInGate_in_msgGate1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defOutGate_in_msgGate1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defOrderInGate_in_orderGate1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defOrderOutGate_in_orderGate1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gateName_in_defInGate1883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_defInGate1888 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_msgIdentification_in_defInGate1890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_defInGate1892 = new BitSet(new long[]{0x0004000000000000L,0x0000000000004400L});
    public static final BitSet FOLLOW_inputDest_in_defInGate1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gateName_in_defOutGate1907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_defOutGate1912 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_msgIdentification_in_defOutGate1914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_defOutGate1916 = new BitSet(new long[]{0x0004000000000000L,0x0000000000004800L});
    public static final BitSet FOLLOW_outputDest_in_defOutGate1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gateName_in_defOrderInGate1929 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_defOrderInGate1931 = new BitSet(new long[]{0x0004000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_orderDest_in_defOrderInGate1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gateName_in_defOrderOutGate1943 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_defOrderOutGate1947 = new BitSet(new long[]{0x0004000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_orderDestList_in_defOrderOutGate1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_inputDest1964 = new BitSet(new long[]{0x0004000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_inputAddress_in_inputDest1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inputAddress_in_inputDest1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_outputDest1986 = new BitSet(new long[]{0x0004000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_outputAddress_in_outputDest1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_outputAddress_in_outputDest1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eventName_in_orderDest2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_orderDest2013 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_orderDest2015 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_gateName_in_orderDest2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderDest_in_orderDestList2038 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_orderDestList2042 = new BitSet(new long[]{0x0004000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_orderDestList_in_orderDestList2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_coregion2067 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_end_in_coregion2069 = new BitSet(new long[]{0x0004000000000000L,0x0000432800010160L});
    public static final BitSet FOLLOW_coevent_in_coregion2071 = new BitSet(new long[]{0x0004000000000000L,0x0000432800010160L});
    public static final BitSet FOLLOW_110_in_coregion2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderableEvent_in_coevent2094 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_end_in_coevent2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_before_in_generalOrdering2112 = new BitSet(new long[]{0x0000000000000002L,0x0000180000000000L});
    public static final BitSet FOLLOW_after_in_generalOrdering2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_after_in_generalOrdering2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_before2130 = new BitSet(new long[]{0x0004000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_orderDestList_in_before2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_after2152 = new BitSet(new long[]{0x0004000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_orderDestList_in_after2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_mscReference2178 = new BitSet(new long[]{0x0004000000000000L,0x000200001C001000L});
    public static final BitSet FOLLOW_mscRefExpr_in_mscReference2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscRefParExpr_in_mscRefExpr2201 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_mscRefExpr2205 = new BitSet(new long[]{0x0004000000000000L,0x000200001C001000L});
    public static final BitSet FOLLOW_mscRefParExpr_in_mscRefExpr2207 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_mscRefSeqExpr_in_mscRefParExpr2232 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_mscRefParExpr2236 = new BitSet(new long[]{0x0004000000000000L,0x000200001C001000L});
    public static final BitSet FOLLOW_mscRefSeqExpr_in_mscRefParExpr2238 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_mscRefIdentExpr_in_mscRefSeqExpr2263 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_mscRefSeqExpr2267 = new BitSet(new long[]{0x0004000000000000L,0x000200001C001000L});
    public static final BitSet FOLLOW_mscRefIdentExpr_in_mscRefSeqExpr2269 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_90_in_mscRefIdentExpr2294 = new BitSet(new long[]{0x0004000000000000L,0x000200009C001000L});
    public static final BitSet FOLLOW_loopBoundary_in_mscRefIdentExpr2298 = new BitSet(new long[]{0x0004000000000000L,0x000200001C001000L});
    public static final BitSet FOLLOW_mscRefIdentExpr_in_mscRefIdentExpr2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_mscRefIdentExpr2322 = new BitSet(new long[]{0x0004000000000000L,0x000200001C001000L});
    public static final BitSet FOLLOW_mscRefIdentExpr_in_mscRefIdentExpr2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_mscRefIdentExpr2343 = new BitSet(new long[]{0x0004000000000000L,0x000200001C001000L});
    public static final BitSet FOLLOW_mscRefIdentExpr_in_mscRefIdentExpr2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_mscRefIdentExpr2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscName_in_mscRefIdentExpr2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_mscRefIdentExpr2403 = new BitSet(new long[]{0x0004000000000000L,0x000200001C001000L});
    public static final BitSet FOLLOW_mscRefExpr_in_mscRefIdentExpr2405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_mscRefIdentExpr2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftBinding_in_binding2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rightBinding_in_binding2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_leftBinding2449 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFTBINDSYMBOL_in_leftBinding2451 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_expressionString_in_leftBinding2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionString_in_rightBinding2476 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RIGHTBINDSYMBOL_in_rightBinding2478 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_pattern_in_rightBinding2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableString_in_pattern2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dataStatement_in_dataStatementList2512 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_dataStatementList2516 = new BitSet(new long[]{0x0084000000000000L,0x000C000000000000L});
    public static final BitSet FOLLOW_dataStatementList_in_dataStatementList2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defineStatement_in_dataStatement2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefineStatement_in_dataStatement2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binding_in_dataStatement2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_defineStatement2556 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_variableString_in_defineStatement2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_undefineStatement2568 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_variableString_in_undefineStatement2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_mscName2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_labelName2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_name2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_instanceName2607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_messageName2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_messageInstanceName2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_gateName2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_eventName2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTERSTRING_in_characterString2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_identifier2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_variableString2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionString2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_expression2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_dataTypeName2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_datatypeTypeExpression2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_literalNameOrNumber2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_naturalSimpleExpression2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_fieldName2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_constantExpression2768 = new BitSet(new long[]{0x0000000000000002L});

}