// $ANTLR 3.1.3 Mar 18, 2009 10:09:25 msc_grammar.g 2014-03-12 23:18:30
package org.hexmonad.msc2gen;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class msc_grammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MSC", "MSCHead", "MSCBody", "Instance", "InstanceList", "INameList", "ParameterList", "Label", "MSGIn", "MSGOut", "FullMsg", "IncompleteMsg", "Action", "Condition", "SetCond", "GuardCond", "ElseCond", "Seq", "Alt", "Par", "Loop", "LoopBoundary", "Opt", "Exc", "Coregion", "Before", "After", "Ref", "Empty", "NodeExpr", "Start", "Create", "Terminate", "StartTimer", "StopTimer", "Timeout", "MsgGate", "ALL", "WHEN", "OTHERWISE", "BEGIN", "END", "NAME", "CHARACTERSTRING", "LEFTBINDSYMBOL", "RIGHTBINDSYMBOL", "LETTER", "DECIMALDIGIT", "UNDERLINE", "FULLSTOP", "APOSTROPHE", "ALPHANUMERIC", "OTHERCHARACTER", "SPECIAL", "WS", "'msc'", "'endmsc'", "':'", "','", "'label'", "'out'", "'to'", "'in'", "'from'", "'lost'", "'found'", "'env'", "'via'", "'action'", "'instance'", "'endinstance'", "'inst'", "'system'", "'block'", "'process'", "'service'", "';'", "'condition'", "'loop'", "'opt'", "'exc'", "'alt'", "'par'", "'<'", "'>'", "'inf'", "'\"'", "'create'", "'('", "')'", "'stop'", "'starttimer'", "'['", "']'", "'stoptimer'", "'timeout'", "'gate'", "'before'", "'after'", "'concurrent'", "'endconcurrent'", "'reference'"
    };
    public static final int Condition=17;
    public static final int MsgGate=40;
    public static final int LETTER=50;
    public static final int Before=29;
    public static final int ElseCond=20;
    public static final int After=30;
    public static final int Empty=32;
    public static final int Coregion=28;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int FullMsg=14;
    public static final int NAME=46;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int MSCHead=5;
    public static final int BEGIN=44;
    public static final int FULLSTOP=53;
    public static final int MSGIn=12;
    public static final int APOSTROPHE=54;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int OTHERWISE=43;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int MSCBody=6;
    public static final int Action=16;
    public static final int Create=35;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int UNDERLINE=52;
    public static final int MSGOut=13;
    public static final int NodeExpr=33;
    public static final int WS=58;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int SPECIAL=57;
    public static final int T__70=70;
    public static final int Par=23;
    public static final int END=45;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int Label=11;
    public static final int T__73=73;
    public static final int Loop=24;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int Timeout=39;
    public static final int T__67=67;
    public static final int Alt=22;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int Opt=26;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int LEFTBINDSYMBOL=48;
    public static final int StopTimer=38;
    public static final int T__61=61;
    public static final int RIGHTBINDSYMBOL=49;
    public static final int T__60=60;
    public static final int ALPHANUMERIC=55;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int MSC=4;
    public static final int ALL=41;
    public static final int T__105=105;
    public static final int InstanceList=8;
    public static final int LoopBoundary=25;
    public static final int Instance=7;
    public static final int Start=34;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int IncompleteMsg=15;
    public static final int T__100=100;
    public static final int Exc=27;
    public static final int INameList=9;
    public static final int Seq=21;
    public static final int Ref=31;
    public static final int Terminate=36;
    public static final int WHEN=42;
    public static final int GuardCond=19;
    public static final int CHARACTERSTRING=47;
    public static final int ParameterList=10;
    public static final int DECIMALDIGIT=51;
    public static final int SetCond=18;
    public static final int StartTimer=37;
    public static final int OTHERCHARACTER=56;

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
    // msc_grammar.g:48:1: msc : messageSequenceChart ;
    public final msc_grammarParser.msc_return msc() throws RecognitionException {
        msc_grammarParser.msc_return retval = new msc_grammarParser.msc_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.messageSequenceChart_return messageSequenceChart1 = null;



        try {
            // msc_grammar.g:48:6: ( messageSequenceChart )
            // msc_grammar.g:48:8: messageSequenceChart
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_messageSequenceChart_in_msc182);
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
    // msc_grammar.g:51:1: messageSequenceChart : 'msc' mscHead body 'endmsc' end -> ^( MSC mscHead body ) ;
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
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_mscHead=new RewriteRuleSubtreeStream(adaptor,"rule mscHead");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:52:2: ( 'msc' mscHead body 'endmsc' end -> ^( MSC mscHead body ) )
            // msc_grammar.g:52:4: 'msc' mscHead body 'endmsc' end
            {
            string_literal2=(Token)match(input,59,FOLLOW_59_in_messageSequenceChart194);  
            stream_59.add(string_literal2);

            pushFollow(FOLLOW_mscHead_in_messageSequenceChart196);
            mscHead3=mscHead();

            state._fsp--;

            stream_mscHead.add(mscHead3.getTree());
            pushFollow(FOLLOW_body_in_messageSequenceChart198);
            body4=body();

            state._fsp--;

            stream_body.add(body4.getTree());
            string_literal5=(Token)match(input,60,FOLLOW_60_in_messageSequenceChart200);  
            stream_60.add(string_literal5);

            pushFollow(FOLLOW_end_in_messageSequenceChart202);
            end6=end();

            state._fsp--;

            stream_end.add(end6.getTree());


            // AST REWRITE
            // elements: mscHead, body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 52:36: -> ^( MSC mscHead body )
            {
                // msc_grammar.g:52:39: ^( MSC mscHead body )
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
    // msc_grammar.g:55:1: mscHead : mscName end ( mscInterface )? -> ^( MSCHead mscName ( mscInterface )? ) ;
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
            // msc_grammar.g:55:9: ( mscName end ( mscInterface )? -> ^( MSCHead mscName ( mscInterface )? ) )
            // msc_grammar.g:55:11: mscName end ( mscInterface )?
            {
            pushFollow(FOLLOW_mscName_in_mscHead225);
            mscName7=mscName();

            state._fsp--;

            stream_mscName.add(mscName7.getTree());
            pushFollow(FOLLOW_end_in_mscHead227);
            end8=end();

            state._fsp--;

            stream_end.add(end8.getTree());
            // msc_grammar.g:55:23: ( mscInterface )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==75||LA1_0==100) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // msc_grammar.g:55:25: mscInterface
                    {
                    pushFollow(FOLLOW_mscInterface_in_mscHead231);
                    mscInterface9=mscInterface();

                    state._fsp--;

                    stream_mscInterface.add(mscInterface9.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: mscInterface, mscName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 55:41: -> ^( MSCHead mscName ( mscInterface )? )
            {
                // msc_grammar.g:55:44: ^( MSCHead mscName ( mscInterface )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MSCHead, "MSCHead"), root_1);

                adaptor.addChild(root_1, stream_mscName.nextTree());
                // msc_grammar.g:55:63: ( mscInterface )?
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
    // msc_grammar.g:58:1: body : ( mscBody ) ;
    public final msc_grammarParser.body_return body() throws RecognitionException {
        msc_grammarParser.body_return retval = new msc_grammarParser.body_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.mscBody_return mscBody10 = null;



        try {
            // msc_grammar.g:58:7: ( ( mscBody ) )
            // msc_grammar.g:58:9: ( mscBody )
            {
            root_0 = (CommonTree)adaptor.nil();

            // msc_grammar.g:58:9: ( mscBody )
            // msc_grammar.g:58:11: mscBody
            {
            pushFollow(FOLLOW_mscBody_in_body261);
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
    // msc_grammar.g:61:1: mscBody : ( mscStatement )* -> ^( MSCBody ( mscStatement )* ) ;
    public final msc_grammarParser.mscBody_return mscBody() throws RecognitionException {
        msc_grammarParser.mscBody_return retval = new msc_grammarParser.mscBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.mscStatement_return mscStatement11 = null;


        RewriteRuleSubtreeStream stream_mscStatement=new RewriteRuleSubtreeStream(adaptor,"rule mscStatement");
        try {
            // msc_grammar.g:61:9: ( ( mscStatement )* -> ^( MSCBody ( mscStatement )* ) )
            // msc_grammar.g:61:11: ( mscStatement )*
            {
            // msc_grammar.g:61:11: ( mscStatement )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ALL||LA2_0==NAME) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // msc_grammar.g:61:11: mscStatement
            	    {
            	    pushFollow(FOLLOW_mscStatement_in_mscBody274);
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
            // 61:25: -> ^( MSCBody ( mscStatement )* )
            {
                // msc_grammar.g:61:28: ^( MSCBody ( mscStatement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MSCBody, "MSCBody"), root_1);

                // msc_grammar.g:61:39: ( mscStatement )*
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
    // msc_grammar.g:64:1: mscStatement : eventDefinition ;
    public final msc_grammarParser.mscStatement_return mscStatement() throws RecognitionException {
        msc_grammarParser.mscStatement_return retval = new msc_grammarParser.mscStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.eventDefinition_return eventDefinition12 = null;



        try {
            // msc_grammar.g:65:2: ( eventDefinition )
            // msc_grammar.g:65:4: eventDefinition
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_eventDefinition_in_mscStatement299);
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
    // msc_grammar.g:68:1: eventDefinition : ( instanceName ':' instanceEventList -> ^( Instance instanceName instanceEventList ) | instanceNameList ':' multiInstanceEventList -> ^( InstanceList instanceNameList multiInstanceEventList ) );
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
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_instanceName=new RewriteRuleSubtreeStream(adaptor,"rule instanceName");
        RewriteRuleSubtreeStream stream_instanceEventList=new RewriteRuleSubtreeStream(adaptor,"rule instanceEventList");
        RewriteRuleSubtreeStream stream_instanceNameList=new RewriteRuleSubtreeStream(adaptor,"rule instanceNameList");
        RewriteRuleSubtreeStream stream_multiInstanceEventList=new RewriteRuleSubtreeStream(adaptor,"rule multiInstanceEventList");
        try {
            // msc_grammar.g:69:2: ( instanceName ':' instanceEventList -> ^( Instance instanceName instanceEventList ) | instanceNameList ':' multiInstanceEventList -> ^( InstanceList instanceNameList multiInstanceEventList ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==NAME) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==62) ) {
                    alt3=2;
                }
                else if ( (LA3_1==61) ) {
                    int LA3_3 = input.LA(3);

                    if ( ((LA3_3>=81 && LA3_3<=86)||LA3_3==105) ) {
                        alt3=2;
                    }
                    else if ( (LA3_3==NAME||(LA3_3>=63 && LA3_3<=64)||LA3_3==66||(LA3_3>=72 && LA3_3<=74)||LA3_3==91||(LA3_3>=94 && LA3_3<=95)||(LA3_3>=98 && LA3_3<=99)||LA3_3==103) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }
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
                    // msc_grammar.g:69:4: instanceName ':' instanceEventList
                    {
                    pushFollow(FOLLOW_instanceName_in_eventDefinition311);
                    instanceName13=instanceName();

                    state._fsp--;

                    stream_instanceName.add(instanceName13.getTree());
                    char_literal14=(Token)match(input,61,FOLLOW_61_in_eventDefinition313);  
                    stream_61.add(char_literal14);

                    pushFollow(FOLLOW_instanceEventList_in_eventDefinition315);
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
                    // 69:39: -> ^( Instance instanceName instanceEventList )
                    {
                        // msc_grammar.g:69:42: ^( Instance instanceName instanceEventList )
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
                    // msc_grammar.g:70:4: instanceNameList ':' multiInstanceEventList
                    {
                    pushFollow(FOLLOW_instanceNameList_in_eventDefinition333);
                    instanceNameList16=instanceNameList();

                    state._fsp--;

                    stream_instanceNameList.add(instanceNameList16.getTree());
                    char_literal17=(Token)match(input,61,FOLLOW_61_in_eventDefinition335);  
                    stream_61.add(char_literal17);

                    pushFollow(FOLLOW_multiInstanceEventList_in_eventDefinition337);
                    multiInstanceEventList18=multiInstanceEventList();

                    state._fsp--;

                    stream_multiInstanceEventList.add(multiInstanceEventList18.getTree());


                    // AST REWRITE
                    // elements: multiInstanceEventList, instanceNameList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 70:48: -> ^( InstanceList instanceNameList multiInstanceEventList )
                    {
                        // msc_grammar.g:70:51: ^( InstanceList instanceNameList multiInstanceEventList )
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
    // msc_grammar.g:73:1: instanceEventList : ( instanceEvent end )+ -> ( instanceEvent )+ ;
    public final msc_grammarParser.instanceEventList_return instanceEventList() throws RecognitionException {
        msc_grammarParser.instanceEventList_return retval = new msc_grammarParser.instanceEventList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.instanceEvent_return instanceEvent19 = null;

        msc_grammarParser.end_return end20 = null;


        RewriteRuleSubtreeStream stream_instanceEvent=new RewriteRuleSubtreeStream(adaptor,"rule instanceEvent");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:74:2: ( ( instanceEvent end )+ -> ( instanceEvent )+ )
            // msc_grammar.g:74:4: ( instanceEvent end )+
            {
            // msc_grammar.g:74:4: ( instanceEvent end )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==NAME) ) {
                    int LA4_2 = input.LA(2);

                    if ( (LA4_2==64||LA4_2==66||LA4_2==72||LA4_2==91||LA4_2==95||(LA4_2>=98 && LA4_2<=99)) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>=63 && LA4_0<=64)||LA4_0==66||(LA4_0>=72 && LA4_0<=74)||LA4_0==91||(LA4_0>=94 && LA4_0<=95)||(LA4_0>=98 && LA4_0<=99)||LA4_0==103) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // msc_grammar.g:74:6: instanceEvent end
            	    {
            	    pushFollow(FOLLOW_instanceEvent_in_instanceEventList364);
            	    instanceEvent19=instanceEvent();

            	    state._fsp--;

            	    stream_instanceEvent.add(instanceEvent19.getTree());
            	    pushFollow(FOLLOW_end_in_instanceEventList366);
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
            // 74:27: -> ( instanceEvent )+
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
    // msc_grammar.g:77:1: instanceEvent : ( orderableEvent | nonOrderableEvent );
    public final msc_grammarParser.instanceEvent_return instanceEvent() throws RecognitionException {
        msc_grammarParser.instanceEvent_return retval = new msc_grammarParser.instanceEvent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.orderableEvent_return orderableEvent21 = null;

        msc_grammarParser.nonOrderableEvent_return nonOrderableEvent22 = null;



        try {
            // msc_grammar.g:78:2: ( orderableEvent | nonOrderableEvent )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==NAME||(LA5_0>=63 && LA5_0<=64)||LA5_0==66||LA5_0==72||LA5_0==91||LA5_0==95||(LA5_0>=98 && LA5_0<=99)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=73 && LA5_0<=74)||LA5_0==94||LA5_0==103) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // msc_grammar.g:78:4: orderableEvent
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_orderableEvent_in_instanceEvent387);
                    orderableEvent21=orderableEvent();

                    state._fsp--;

                    adaptor.addChild(root_0, orderableEvent21.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:78:21: nonOrderableEvent
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_nonOrderableEvent_in_instanceEvent391);
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
    // msc_grammar.g:81:1: orderableEvent : ( label )? ( messageEvent | action | create | timerStatement ) ( generalOrdering )? ;
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
            // msc_grammar.g:82:2: ( ( label )? ( messageEvent | action | create | timerStatement ) ( generalOrdering )? )
            // msc_grammar.g:82:4: ( label )? ( messageEvent | action | create | timerStatement ) ( generalOrdering )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // msc_grammar.g:82:4: ( label )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==NAME||LA6_0==63) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // msc_grammar.g:82:4: label
                    {
                    pushFollow(FOLLOW_label_in_orderableEvent403);
                    label23=label();

                    state._fsp--;

                    adaptor.addChild(root_0, label23.getTree());

                    }
                    break;

            }

            // msc_grammar.g:82:11: ( messageEvent | action | create | timerStatement )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 64:
            case 66:
                {
                alt7=1;
                }
                break;
            case 72:
                {
                alt7=2;
                }
                break;
            case 91:
                {
                alt7=3;
                }
                break;
            case 95:
            case 98:
            case 99:
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
                    // msc_grammar.g:82:13: messageEvent
                    {
                    pushFollow(FOLLOW_messageEvent_in_orderableEvent408);
                    messageEvent24=messageEvent();

                    state._fsp--;

                    adaptor.addChild(root_0, messageEvent24.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:82:28: action
                    {
                    pushFollow(FOLLOW_action_in_orderableEvent412);
                    action25=action();

                    state._fsp--;

                    adaptor.addChild(root_0, action25.getTree());

                    }
                    break;
                case 3 :
                    // msc_grammar.g:82:37: create
                    {
                    pushFollow(FOLLOW_create_in_orderableEvent416);
                    create26=create();

                    state._fsp--;

                    adaptor.addChild(root_0, create26.getTree());

                    }
                    break;
                case 4 :
                    // msc_grammar.g:82:46: timerStatement
                    {
                    pushFollow(FOLLOW_timerStatement_in_orderableEvent420);
                    timerStatement27=timerStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, timerStatement27.getTree());

                    }
                    break;

            }

            // msc_grammar.g:82:63: ( generalOrdering )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=101 && LA8_0<=102)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // msc_grammar.g:82:63: generalOrdering
                    {
                    pushFollow(FOLLOW_generalOrdering_in_orderableEvent424);
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
    // msc_grammar.g:85:1: nonOrderableEvent : ( instanceHeadStatement | instanceEndStatement | stop | coregion );
    public final msc_grammarParser.nonOrderableEvent_return nonOrderableEvent() throws RecognitionException {
        msc_grammarParser.nonOrderableEvent_return retval = new msc_grammarParser.nonOrderableEvent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.instanceHeadStatement_return instanceHeadStatement29 = null;

        msc_grammarParser.instanceEndStatement_return instanceEndStatement30 = null;

        msc_grammarParser.stop_return stop31 = null;

        msc_grammarParser.coregion_return coregion32 = null;



        try {
            // msc_grammar.g:86:2: ( instanceHeadStatement | instanceEndStatement | stop | coregion )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt9=1;
                }
                break;
            case 74:
                {
                alt9=2;
                }
                break;
            case 94:
                {
                alt9=3;
                }
                break;
            case 103:
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
                    // msc_grammar.g:86:4: instanceHeadStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_instanceHeadStatement_in_nonOrderableEvent437);
                    instanceHeadStatement29=instanceHeadStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, instanceHeadStatement29.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:86:28: instanceEndStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_instanceEndStatement_in_nonOrderableEvent441);
                    instanceEndStatement30=instanceEndStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, instanceEndStatement30.getTree());

                    }
                    break;
                case 3 :
                    // msc_grammar.g:86:51: stop
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_stop_in_nonOrderableEvent445);
                    stop31=stop();

                    state._fsp--;

                    adaptor.addChild(root_0, stop31.getTree());

                    }
                    break;
                case 4 :
                    // msc_grammar.g:86:58: coregion
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_coregion_in_nonOrderableEvent449);
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
    // msc_grammar.g:89:1: instanceNameList : ( instanceName ( ',' instanceName )* -> ^( INameList ( instanceName )+ ) | ALL -> ^( INameList ALL ) );
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
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_ALL=new RewriteRuleTokenStream(adaptor,"token ALL");
        RewriteRuleSubtreeStream stream_instanceName=new RewriteRuleSubtreeStream(adaptor,"rule instanceName");
        try {
            // msc_grammar.g:90:2: ( instanceName ( ',' instanceName )* -> ^( INameList ( instanceName )+ ) | ALL -> ^( INameList ALL ) )
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
                    // msc_grammar.g:90:4: instanceName ( ',' instanceName )*
                    {
                    pushFollow(FOLLOW_instanceName_in_instanceNameList462);
                    instanceName33=instanceName();

                    state._fsp--;

                    stream_instanceName.add(instanceName33.getTree());
                    // msc_grammar.g:90:17: ( ',' instanceName )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==62) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // msc_grammar.g:90:19: ',' instanceName
                    	    {
                    	    char_literal34=(Token)match(input,62,FOLLOW_62_in_instanceNameList466);  
                    	    stream_62.add(char_literal34);

                    	    pushFollow(FOLLOW_instanceName_in_instanceNameList468);
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
                    // 90:39: -> ^( INameList ( instanceName )+ )
                    {
                        // msc_grammar.g:90:42: ^( INameList ( instanceName )+ )
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
                    // msc_grammar.g:91:5: ALL
                    {
                    ALL36=(Token)match(input,ALL,FOLLOW_ALL_in_instanceNameList488);  
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
                    // 91:9: -> ^( INameList ALL )
                    {
                        // msc_grammar.g:91:12: ^( INameList ALL )
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
    // msc_grammar.g:94:1: multiInstanceEventList : ( multiInstanceEvent end )+ -> ( multiInstanceEvent )+ ;
    public final msc_grammarParser.multiInstanceEventList_return multiInstanceEventList() throws RecognitionException {
        msc_grammarParser.multiInstanceEventList_return retval = new msc_grammarParser.multiInstanceEventList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.multiInstanceEvent_return multiInstanceEvent37 = null;

        msc_grammarParser.end_return end38 = null;


        RewriteRuleSubtreeStream stream_multiInstanceEvent=new RewriteRuleSubtreeStream(adaptor,"rule multiInstanceEvent");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:95:2: ( ( multiInstanceEvent end )+ -> ( multiInstanceEvent )+ )
            // msc_grammar.g:95:4: ( multiInstanceEvent end )+
            {
            // msc_grammar.g:95:4: ( multiInstanceEvent end )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                switch ( input.LA(1) ) {
                case 82:
                    {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==BEGIN||LA12_2==87) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 83:
                    {
                    int LA12_3 = input.LA(2);

                    if ( (LA12_3==BEGIN) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 84:
                    {
                    int LA12_4 = input.LA(2);

                    if ( (LA12_4==BEGIN) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 85:
                    {
                    int LA12_5 = input.LA(2);

                    if ( (LA12_5==BEGIN) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 86:
                    {
                    int LA12_6 = input.LA(2);

                    if ( (LA12_6==BEGIN) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 81:
                case 105:
                    {
                    alt12=1;
                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // msc_grammar.g:95:6: multiInstanceEvent end
            	    {
            	    pushFollow(FOLLOW_multiInstanceEvent_in_multiInstanceEventList513);
            	    multiInstanceEvent37=multiInstanceEvent();

            	    state._fsp--;

            	    stream_multiInstanceEvent.add(multiInstanceEvent37.getTree());
            	    pushFollow(FOLLOW_end_in_multiInstanceEventList515);
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
            // 95:32: -> ( multiInstanceEvent )+
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
    // msc_grammar.g:98:1: multiInstanceEvent : ( condition | mscReference | inlineExpr );
    public final msc_grammarParser.multiInstanceEvent_return multiInstanceEvent() throws RecognitionException {
        msc_grammarParser.multiInstanceEvent_return retval = new msc_grammarParser.multiInstanceEvent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.condition_return condition39 = null;

        msc_grammarParser.mscReference_return mscReference40 = null;

        msc_grammarParser.inlineExpr_return inlineExpr41 = null;



        try {
            // msc_grammar.g:99:2: ( condition | mscReference | inlineExpr )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt13=1;
                }
                break;
            case 105:
                {
                alt13=2;
                }
                break;
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
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
                    // msc_grammar.g:99:4: condition
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_condition_in_multiInstanceEvent536);
                    condition39=condition();

                    state._fsp--;

                    adaptor.addChild(root_0, condition39.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:99:16: mscReference
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_mscReference_in_multiInstanceEvent540);
                    mscReference40=mscReference();

                    state._fsp--;

                    adaptor.addChild(root_0, mscReference40.getTree());

                    }
                    break;
                case 3 :
                    // msc_grammar.g:99:31: inlineExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_inlineExpr_in_multiInstanceEvent544);
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
    // msc_grammar.g:103:1: label : ( eventName | 'label' eventName end ) -> ^( Label eventName ) ;
    public final msc_grammarParser.label_return label() throws RecognitionException {
        msc_grammarParser.label_return retval = new msc_grammarParser.label_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal43=null;
        msc_grammarParser.eventName_return eventName42 = null;

        msc_grammarParser.eventName_return eventName44 = null;

        msc_grammarParser.end_return end45 = null;


        CommonTree string_literal43_tree=null;
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_eventName=new RewriteRuleSubtreeStream(adaptor,"rule eventName");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:103:8: ( ( eventName | 'label' eventName end ) -> ^( Label eventName ) )
            // msc_grammar.g:103:10: ( eventName | 'label' eventName end )
            {
            // msc_grammar.g:103:10: ( eventName | 'label' eventName end )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==NAME) ) {
                alt14=1;
            }
            else if ( (LA14_0==63) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // msc_grammar.g:103:12: eventName
                    {
                    pushFollow(FOLLOW_eventName_in_label558);
                    eventName42=eventName();

                    state._fsp--;

                    stream_eventName.add(eventName42.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:103:24: 'label' eventName end
                    {
                    string_literal43=(Token)match(input,63,FOLLOW_63_in_label562);  
                    stream_63.add(string_literal43);

                    pushFollow(FOLLOW_eventName_in_label564);
                    eventName44=eventName();

                    state._fsp--;

                    stream_eventName.add(eventName44.getTree());
                    pushFollow(FOLLOW_end_in_label566);
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
            // 103:48: -> ^( Label eventName )
            {
                // msc_grammar.g:103:51: ^( Label eventName )
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
    // msc_grammar.g:107:1: messageEvent : ( 'out' msgIdentification 'to' messageReceiver -> ^( MSGOut msgIdentification messageReceiver ) | 'in' msgIdentification 'from' messageSender -> ^( MSGIn msgIdentification messageSender ) );
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
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_messageReceiver=new RewriteRuleSubtreeStream(adaptor,"rule messageReceiver");
        RewriteRuleSubtreeStream stream_msgIdentification=new RewriteRuleSubtreeStream(adaptor,"rule msgIdentification");
        RewriteRuleSubtreeStream stream_messageSender=new RewriteRuleSubtreeStream(adaptor,"rule messageSender");
        try {
            // msc_grammar.g:108:2: ( 'out' msgIdentification 'to' messageReceiver -> ^( MSGOut msgIdentification messageReceiver ) | 'in' msgIdentification 'from' messageSender -> ^( MSGIn msgIdentification messageSender ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==64) ) {
                alt15=1;
            }
            else if ( (LA15_0==66) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // msc_grammar.g:108:4: 'out' msgIdentification 'to' messageReceiver
                    {
                    string_literal46=(Token)match(input,64,FOLLOW_64_in_messageEvent591);  
                    stream_64.add(string_literal46);

                    pushFollow(FOLLOW_msgIdentification_in_messageEvent593);
                    msgIdentification47=msgIdentification();

                    state._fsp--;

                    stream_msgIdentification.add(msgIdentification47.getTree());
                    string_literal48=(Token)match(input,65,FOLLOW_65_in_messageEvent595);  
                    stream_65.add(string_literal48);

                    pushFollow(FOLLOW_messageReceiver_in_messageEvent597);
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
                    // 108:49: -> ^( MSGOut msgIdentification messageReceiver )
                    {
                        // msc_grammar.g:108:52: ^( MSGOut msgIdentification messageReceiver )
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
                    // msc_grammar.g:109:4: 'in' msgIdentification 'from' messageSender
                    {
                    string_literal50=(Token)match(input,66,FOLLOW_66_in_messageEvent614);  
                    stream_66.add(string_literal50);

                    pushFollow(FOLLOW_msgIdentification_in_messageEvent616);
                    msgIdentification51=msgIdentification();

                    state._fsp--;

                    stream_msgIdentification.add(msgIdentification51.getTree());
                    string_literal52=(Token)match(input,67,FOLLOW_67_in_messageEvent618);  
                    stream_67.add(string_literal52);

                    pushFollow(FOLLOW_messageSender_in_messageEvent620);
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
                    // 109:49: -> ^( MSGIn msgIdentification messageSender )
                    {
                        // msc_grammar.g:109:52: ^( MSGIn msgIdentification messageSender )
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
    // msc_grammar.g:112:1: messageReceiver : ( inputAddress -> inputAddress FullMsg | 'lost' ( inputAddress )? -> ( inputAddress )? IncompleteMsg );
    public final msc_grammarParser.messageReceiver_return messageReceiver() throws RecognitionException {
        msc_grammarParser.messageReceiver_return retval = new msc_grammarParser.messageReceiver_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal55=null;
        msc_grammarParser.inputAddress_return inputAddress54 = null;

        msc_grammarParser.inputAddress_return inputAddress56 = null;


        CommonTree string_literal55_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleSubtreeStream stream_inputAddress=new RewriteRuleSubtreeStream(adaptor,"rule inputAddress");
        try {
            // msc_grammar.g:113:2: ( inputAddress -> inputAddress FullMsg | 'lost' ( inputAddress )? -> ( inputAddress )? IncompleteMsg )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==NAME||LA17_0==70) ) {
                alt17=1;
            }
            else if ( (LA17_0==68) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // msc_grammar.g:113:4: inputAddress
                    {
                    pushFollow(FOLLOW_inputAddress_in_messageReceiver646);
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
                    // 113:17: -> inputAddress FullMsg
                    {
                        adaptor.addChild(root_0, stream_inputAddress.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FullMsg, "FullMsg"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // msc_grammar.g:114:4: 'lost' ( inputAddress )?
                    {
                    string_literal55=(Token)match(input,68,FOLLOW_68_in_messageReceiver657);  
                    stream_68.add(string_literal55);

                    // msc_grammar.g:114:11: ( inputAddress )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==NAME||LA16_0==70) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // msc_grammar.g:114:13: inputAddress
                            {
                            pushFollow(FOLLOW_inputAddress_in_messageReceiver661);
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
                    // 114:29: -> ( inputAddress )? IncompleteMsg
                    {
                        // msc_grammar.g:114:32: ( inputAddress )?
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
    // msc_grammar.g:117:1: messageSender : ( outputAddress -> outputAddress FullMsg | 'found' ( outputAddress )? -> ( outputAddress )? IncompleteMsg );
    public final msc_grammarParser.messageSender_return messageSender() throws RecognitionException {
        msc_grammarParser.messageSender_return retval = new msc_grammarParser.messageSender_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal58=null;
        msc_grammarParser.outputAddress_return outputAddress57 = null;

        msc_grammarParser.outputAddress_return outputAddress59 = null;


        CommonTree string_literal58_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleSubtreeStream stream_outputAddress=new RewriteRuleSubtreeStream(adaptor,"rule outputAddress");
        try {
            // msc_grammar.g:118:2: ( outputAddress -> outputAddress FullMsg | 'found' ( outputAddress )? -> ( outputAddress )? IncompleteMsg )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==NAME||LA19_0==70) ) {
                alt19=1;
            }
            else if ( (LA19_0==69) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // msc_grammar.g:118:4: outputAddress
                    {
                    pushFollow(FOLLOW_outputAddress_in_messageSender683);
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
                    // 118:18: -> outputAddress FullMsg
                    {
                        adaptor.addChild(root_0, stream_outputAddress.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FullMsg, "FullMsg"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // msc_grammar.g:119:4: 'found' ( outputAddress )?
                    {
                    string_literal58=(Token)match(input,69,FOLLOW_69_in_messageSender694);  
                    stream_69.add(string_literal58);

                    // msc_grammar.g:119:12: ( outputAddress )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==NAME||LA18_0==70) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // msc_grammar.g:119:14: outputAddress
                            {
                            pushFollow(FOLLOW_outputAddress_in_messageSender698);
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
                    // 119:31: -> ( outputAddress )? IncompleteMsg
                    {
                        // msc_grammar.g:119:34: ( outputAddress )?
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
    // msc_grammar.g:122:1: msgIdentification : ( messageName | characterString );
    public final msc_grammarParser.msgIdentification_return msgIdentification() throws RecognitionException {
        msc_grammarParser.msgIdentification_return retval = new msc_grammarParser.msgIdentification_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.messageName_return messageName60 = null;

        msc_grammarParser.characterString_return characterString61 = null;



        try {
            // msc_grammar.g:123:2: ( messageName | characterString )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==NAME) ) {
                alt20=1;
            }
            else if ( (LA20_0==CHARACTERSTRING) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // msc_grammar.g:123:4: messageName
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_messageName_in_msgIdentification721);
                    messageName60=messageName();

                    state._fsp--;

                    adaptor.addChild(root_0, messageName60.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:123:18: characterString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_characterString_in_msgIdentification725);
                    characterString61=characterString();

                    state._fsp--;

                    adaptor.addChild(root_0, characterString61.getTree());

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
    // $ANTLR end "msgIdentification"

    public static class outputAddress_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "outputAddress"
    // msc_grammar.g:126:1: outputAddress : ( instanceName | 'env' ( 'via' gateName )? -> ^( MsgGate ( gateName )? ) );
    public final msc_grammarParser.outputAddress_return outputAddress() throws RecognitionException {
        msc_grammarParser.outputAddress_return retval = new msc_grammarParser.outputAddress_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal63=null;
        Token string_literal64=null;
        msc_grammarParser.instanceName_return instanceName62 = null;

        msc_grammarParser.gateName_return gateName65 = null;


        CommonTree string_literal63_tree=null;
        CommonTree string_literal64_tree=null;
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_gateName=new RewriteRuleSubtreeStream(adaptor,"rule gateName");
        try {
            // msc_grammar.g:127:2: ( instanceName | 'env' ( 'via' gateName )? -> ^( MsgGate ( gateName )? ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==NAME) ) {
                alt22=1;
            }
            else if ( (LA22_0==70) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // msc_grammar.g:127:4: instanceName
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_instanceName_in_outputAddress737);
                    instanceName62=instanceName();

                    state._fsp--;

                    adaptor.addChild(root_0, instanceName62.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:128:4: 'env' ( 'via' gateName )?
                    {
                    string_literal63=(Token)match(input,70,FOLLOW_70_in_outputAddress742);  
                    stream_70.add(string_literal63);

                    // msc_grammar.g:128:10: ( 'via' gateName )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==71) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // msc_grammar.g:128:12: 'via' gateName
                            {
                            string_literal64=(Token)match(input,71,FOLLOW_71_in_outputAddress746);  
                            stream_71.add(string_literal64);

                            pushFollow(FOLLOW_gateName_in_outputAddress748);
                            gateName65=gateName();

                            state._fsp--;

                            stream_gateName.add(gateName65.getTree());

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
                    // 128:30: -> ^( MsgGate ( gateName )? )
                    {
                        // msc_grammar.g:128:33: ^( MsgGate ( gateName )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MsgGate, "MsgGate"), root_1);

                        // msc_grammar.g:128:44: ( gateName )?
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
    // msc_grammar.g:131:1: inputAddress : ( instanceName | 'env' ( 'via' gateName )? -> ^( MsgGate ( gateName )? ) );
    public final msc_grammarParser.inputAddress_return inputAddress() throws RecognitionException {
        msc_grammarParser.inputAddress_return retval = new msc_grammarParser.inputAddress_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal67=null;
        Token string_literal68=null;
        msc_grammarParser.instanceName_return instanceName66 = null;

        msc_grammarParser.gateName_return gateName69 = null;


        CommonTree string_literal67_tree=null;
        CommonTree string_literal68_tree=null;
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_gateName=new RewriteRuleSubtreeStream(adaptor,"rule gateName");
        try {
            // msc_grammar.g:132:2: ( instanceName | 'env' ( 'via' gateName )? -> ^( MsgGate ( gateName )? ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==NAME) ) {
                alt24=1;
            }
            else if ( (LA24_0==70) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // msc_grammar.g:132:4: instanceName
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_instanceName_in_inputAddress775);
                    instanceName66=instanceName();

                    state._fsp--;

                    adaptor.addChild(root_0, instanceName66.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:133:4: 'env' ( 'via' gateName )?
                    {
                    string_literal67=(Token)match(input,70,FOLLOW_70_in_inputAddress780);  
                    stream_70.add(string_literal67);

                    // msc_grammar.g:133:10: ( 'via' gateName )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==71) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // msc_grammar.g:133:12: 'via' gateName
                            {
                            string_literal68=(Token)match(input,71,FOLLOW_71_in_inputAddress784);  
                            stream_71.add(string_literal68);

                            pushFollow(FOLLOW_gateName_in_inputAddress786);
                            gateName69=gateName();

                            state._fsp--;

                            stream_gateName.add(gateName69.getTree());

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
                    // 133:30: -> ^( MsgGate ( gateName )? )
                    {
                        // msc_grammar.g:133:33: ^( MsgGate ( gateName )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MsgGate, "MsgGate"), root_1);

                        // msc_grammar.g:133:44: ( gateName )?
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
    // msc_grammar.g:136:1: action : 'action' actionStatement -> actionStatement ;
    public final msc_grammarParser.action_return action() throws RecognitionException {
        msc_grammarParser.action_return retval = new msc_grammarParser.action_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal70=null;
        msc_grammarParser.actionStatement_return actionStatement71 = null;


        CommonTree string_literal70_tree=null;
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_actionStatement=new RewriteRuleSubtreeStream(adaptor,"rule actionStatement");
        try {
            // msc_grammar.g:136:9: ( 'action' actionStatement -> actionStatement )
            // msc_grammar.g:136:11: 'action' actionStatement
            {
            string_literal70=(Token)match(input,72,FOLLOW_72_in_action812);  
            stream_72.add(string_literal70);

            pushFollow(FOLLOW_actionStatement_in_action814);
            actionStatement71=actionStatement();

            state._fsp--;

            stream_actionStatement.add(actionStatement71.getTree());


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
            // 136:36: -> actionStatement
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
    // msc_grammar.g:138:1: actionStatement : informalAction -> ^( Action informalAction ) ;
    public final msc_grammarParser.actionStatement_return actionStatement() throws RecognitionException {
        msc_grammarParser.actionStatement_return retval = new msc_grammarParser.actionStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.informalAction_return informalAction72 = null;


        RewriteRuleSubtreeStream stream_informalAction=new RewriteRuleSubtreeStream(adaptor,"rule informalAction");
        try {
            // msc_grammar.g:139:2: ( informalAction -> ^( Action informalAction ) )
            // msc_grammar.g:139:4: informalAction
            {
            pushFollow(FOLLOW_informalAction_in_actionStatement829);
            informalAction72=informalAction();

            state._fsp--;

            stream_informalAction.add(informalAction72.getTree());


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
            // 139:19: -> ^( Action informalAction )
            {
                // msc_grammar.g:139:22: ^( Action informalAction )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Action, "Action"), root_1);

                adaptor.addChild(root_1, stream_informalAction.nextTree());

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
    // $ANTLR end "actionStatement"

    public static class informalAction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "informalAction"
    // msc_grammar.g:141:1: informalAction : ( name | characterString );
    public final msc_grammarParser.informalAction_return informalAction() throws RecognitionException {
        msc_grammarParser.informalAction_return retval = new msc_grammarParser.informalAction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.name_return name73 = null;

        msc_grammarParser.characterString_return characterString74 = null;



        try {
            // msc_grammar.g:142:2: ( name | characterString )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==NAME) ) {
                alt25=1;
            }
            else if ( (LA25_0==CHARACTERSTRING) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // msc_grammar.g:142:4: name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_name_in_informalAction850);
                    name73=name();

                    state._fsp--;

                    adaptor.addChild(root_0, name73.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:142:11: characterString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_characterString_in_informalAction854);
                    characterString74=characterString();

                    state._fsp--;

                    adaptor.addChild(root_0, characterString74.getTree());

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
    // $ANTLR end "informalAction"

    public static class instanceHeadStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instanceHeadStatement"
    // msc_grammar.g:145:1: instanceHeadStatement : 'instance' ( instanceKind )? ;
    public final msc_grammarParser.instanceHeadStatement_return instanceHeadStatement() throws RecognitionException {
        msc_grammarParser.instanceHeadStatement_return retval = new msc_grammarParser.instanceHeadStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal75=null;
        msc_grammarParser.instanceKind_return instanceKind76 = null;


        CommonTree string_literal75_tree=null;

        try {
            // msc_grammar.g:146:2: ( 'instance' ( instanceKind )? )
            // msc_grammar.g:146:4: 'instance' ( instanceKind )?
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal75=(Token)match(input,73,FOLLOW_73_in_instanceHeadStatement867); 
            string_literal75_tree = (CommonTree)adaptor.create(string_literal75);
            adaptor.addChild(root_0, string_literal75_tree);

            // msc_grammar.g:146:15: ( instanceKind )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==NAME||(LA26_0>=76 && LA26_0<=79)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // msc_grammar.g:146:17: instanceKind
                    {
                    pushFollow(FOLLOW_instanceKind_in_instanceHeadStatement871);
                    instanceKind76=instanceKind();

                    state._fsp--;

                    adaptor.addChild(root_0, instanceKind76.getTree());

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
    // msc_grammar.g:149:1: instanceEndStatement : 'endinstance' ;
    public final msc_grammarParser.instanceEndStatement_return instanceEndStatement() throws RecognitionException {
        msc_grammarParser.instanceEndStatement_return retval = new msc_grammarParser.instanceEndStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal77=null;

        CommonTree string_literal77_tree=null;

        try {
            // msc_grammar.g:150:2: ( 'endinstance' )
            // msc_grammar.g:150:4: 'endinstance'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal77=(Token)match(input,74,FOLLOW_74_in_instanceEndStatement887); 
            string_literal77_tree = (CommonTree)adaptor.create(string_literal77);
            adaptor.addChild(root_0, string_literal77_tree);


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
    // msc_grammar.g:153:1: mscInterface : ( mscInstInterface ( mscGateInterface )? | mscGateInterface );
    public final msc_grammarParser.mscInterface_return mscInterface() throws RecognitionException {
        msc_grammarParser.mscInterface_return retval = new msc_grammarParser.mscInterface_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.mscInstInterface_return mscInstInterface78 = null;

        msc_grammarParser.mscGateInterface_return mscGateInterface79 = null;

        msc_grammarParser.mscGateInterface_return mscGateInterface80 = null;



        try {
            // msc_grammar.g:154:2: ( mscInstInterface ( mscGateInterface )? | mscGateInterface )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==75) ) {
                alt28=1;
            }
            else if ( (LA28_0==100) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // msc_grammar.g:154:4: mscInstInterface ( mscGateInterface )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_mscInstInterface_in_mscInterface899);
                    mscInstInterface78=mscInstInterface();

                    state._fsp--;

                    adaptor.addChild(root_0, mscInstInterface78.getTree());
                    // msc_grammar.g:154:21: ( mscGateInterface )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==100) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // msc_grammar.g:154:23: mscGateInterface
                            {
                            pushFollow(FOLLOW_mscGateInterface_in_mscInterface903);
                            mscGateInterface79=mscGateInterface();

                            state._fsp--;

                            adaptor.addChild(root_0, mscGateInterface79.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // msc_grammar.g:154:45: mscGateInterface
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_mscGateInterface_in_mscInterface910);
                    mscGateInterface80=mscGateInterface();

                    state._fsp--;

                    adaptor.addChild(root_0, mscGateInterface80.getTree());

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
    // msc_grammar.g:157:1: mscInstInterface : 'inst' instanceList end ;
    public final msc_grammarParser.mscInstInterface_return mscInstInterface() throws RecognitionException {
        msc_grammarParser.mscInstInterface_return retval = new msc_grammarParser.mscInstInterface_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal81=null;
        msc_grammarParser.instanceList_return instanceList82 = null;

        msc_grammarParser.end_return end83 = null;


        CommonTree string_literal81_tree=null;

        try {
            // msc_grammar.g:158:2: ( 'inst' instanceList end )
            // msc_grammar.g:158:4: 'inst' instanceList end
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal81=(Token)match(input,75,FOLLOW_75_in_mscInstInterface923); 
            string_literal81_tree = (CommonTree)adaptor.create(string_literal81);
            adaptor.addChild(root_0, string_literal81_tree);

            pushFollow(FOLLOW_instanceList_in_mscInstInterface925);
            instanceList82=instanceList();

            state._fsp--;

            adaptor.addChild(root_0, instanceList82.getTree());
            pushFollow(FOLLOW_end_in_mscInstInterface927);
            end83=end();

            state._fsp--;

            adaptor.addChild(root_0, end83.getTree());

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
    // msc_grammar.g:161:1: instanceList : instanceName ( ':' instanceKind )? ( ',' instanceList )? ;
    public final msc_grammarParser.instanceList_return instanceList() throws RecognitionException {
        msc_grammarParser.instanceList_return retval = new msc_grammarParser.instanceList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal85=null;
        Token char_literal87=null;
        msc_grammarParser.instanceName_return instanceName84 = null;

        msc_grammarParser.instanceKind_return instanceKind86 = null;

        msc_grammarParser.instanceList_return instanceList88 = null;


        CommonTree char_literal85_tree=null;
        CommonTree char_literal87_tree=null;

        try {
            // msc_grammar.g:162:2: ( instanceName ( ':' instanceKind )? ( ',' instanceList )? )
            // msc_grammar.g:162:4: instanceName ( ':' instanceKind )? ( ',' instanceList )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_instanceName_in_instanceList940);
            instanceName84=instanceName();

            state._fsp--;

            adaptor.addChild(root_0, instanceName84.getTree());
            // msc_grammar.g:162:17: ( ':' instanceKind )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==61) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // msc_grammar.g:162:19: ':' instanceKind
                    {
                    char_literal85=(Token)match(input,61,FOLLOW_61_in_instanceList944); 
                    char_literal85_tree = (CommonTree)adaptor.create(char_literal85);
                    adaptor.addChild(root_0, char_literal85_tree);

                    pushFollow(FOLLOW_instanceKind_in_instanceList946);
                    instanceKind86=instanceKind();

                    state._fsp--;

                    adaptor.addChild(root_0, instanceKind86.getTree());

                    }
                    break;

            }

            // msc_grammar.g:162:39: ( ',' instanceList )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==62) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // msc_grammar.g:162:41: ',' instanceList
                    {
                    char_literal87=(Token)match(input,62,FOLLOW_62_in_instanceList953); 
                    char_literal87_tree = (CommonTree)adaptor.create(char_literal87);
                    adaptor.addChild(root_0, char_literal87_tree);

                    pushFollow(FOLLOW_instanceList_in_instanceList955);
                    instanceList88=instanceList();

                    state._fsp--;

                    adaptor.addChild(root_0, instanceList88.getTree());

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
    // msc_grammar.g:165:1: instanceKind : ( kindDenominator )? identifier ;
    public final msc_grammarParser.instanceKind_return instanceKind() throws RecognitionException {
        msc_grammarParser.instanceKind_return retval = new msc_grammarParser.instanceKind_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.kindDenominator_return kindDenominator89 = null;

        msc_grammarParser.identifier_return identifier90 = null;



        try {
            // msc_grammar.g:166:2: ( ( kindDenominator )? identifier )
            // msc_grammar.g:166:4: ( kindDenominator )? identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            // msc_grammar.g:166:4: ( kindDenominator )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=76 && LA31_0<=79)) ) {
                alt31=1;
            }
            else if ( (LA31_0==NAME) ) {
                int LA31_2 = input.LA(2);

                if ( (LA31_2==NAME) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // msc_grammar.g:166:6: kindDenominator
                    {
                    pushFollow(FOLLOW_kindDenominator_in_instanceKind973);
                    kindDenominator89=kindDenominator();

                    state._fsp--;

                    adaptor.addChild(root_0, kindDenominator89.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_identifier_in_instanceKind978);
            identifier90=identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier90.getTree());

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
    // msc_grammar.g:169:1: kindDenominator : ( 'system' | 'block' | 'process' | 'service' | name );
    public final msc_grammarParser.kindDenominator_return kindDenominator() throws RecognitionException {
        msc_grammarParser.kindDenominator_return retval = new msc_grammarParser.kindDenominator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal91=null;
        Token string_literal92=null;
        Token string_literal93=null;
        Token string_literal94=null;
        msc_grammarParser.name_return name95 = null;


        CommonTree string_literal91_tree=null;
        CommonTree string_literal92_tree=null;
        CommonTree string_literal93_tree=null;
        CommonTree string_literal94_tree=null;

        try {
            // msc_grammar.g:170:2: ( 'system' | 'block' | 'process' | 'service' | name )
            int alt32=5;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt32=1;
                }
                break;
            case 77:
                {
                alt32=2;
                }
                break;
            case 78:
                {
                alt32=3;
                }
                break;
            case 79:
                {
                alt32=4;
                }
                break;
            case NAME:
                {
                alt32=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // msc_grammar.g:170:4: 'system'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal91=(Token)match(input,76,FOLLOW_76_in_kindDenominator991); 
                    string_literal91_tree = (CommonTree)adaptor.create(string_literal91);
                    adaptor.addChild(root_0, string_literal91_tree);


                    }
                    break;
                case 2 :
                    // msc_grammar.g:170:15: 'block'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal92=(Token)match(input,77,FOLLOW_77_in_kindDenominator995); 
                    string_literal92_tree = (CommonTree)adaptor.create(string_literal92);
                    adaptor.addChild(root_0, string_literal92_tree);


                    }
                    break;
                case 3 :
                    // msc_grammar.g:170:25: 'process'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal93=(Token)match(input,78,FOLLOW_78_in_kindDenominator999); 
                    string_literal93_tree = (CommonTree)adaptor.create(string_literal93);
                    adaptor.addChild(root_0, string_literal93_tree);


                    }
                    break;
                case 4 :
                    // msc_grammar.g:170:37: 'service'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal94=(Token)match(input,79,FOLLOW_79_in_kindDenominator1003); 
                    string_literal94_tree = (CommonTree)adaptor.create(string_literal94);
                    adaptor.addChild(root_0, string_literal94_tree);


                    }
                    break;
                case 5 :
                    // msc_grammar.g:170:49: name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_name_in_kindDenominator1007);
                    name95=name();

                    state._fsp--;

                    adaptor.addChild(root_0, name95.getTree());

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
    // msc_grammar.g:173:1: end : ';' ;
    public final msc_grammarParser.end_return end() throws RecognitionException {
        msc_grammarParser.end_return retval = new msc_grammarParser.end_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal96=null;

        CommonTree char_literal96_tree=null;

        try {
            // msc_grammar.g:173:6: ( ';' )
            // msc_grammar.g:173:8: ';'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal96=(Token)match(input,80,FOLLOW_80_in_end1018); 
            char_literal96_tree = (CommonTree)adaptor.create(char_literal96);
            adaptor.addChild(root_0, char_literal96_tree);


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
    // msc_grammar.g:177:1: condition : conditionIdentification ;
    public final msc_grammarParser.condition_return condition() throws RecognitionException {
        msc_grammarParser.condition_return retval = new msc_grammarParser.condition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.conditionIdentification_return conditionIdentification97 = null;



        try {
            // msc_grammar.g:178:2: ( conditionIdentification )
            // msc_grammar.g:178:4: conditionIdentification
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_conditionIdentification_in_condition1031);
            conditionIdentification97=conditionIdentification();

            state._fsp--;

            adaptor.addChild(root_0, conditionIdentification97.getTree());

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
    // msc_grammar.g:180:1: conditionIdentification : 'condition' conditionText -> ^( Condition conditionText ) ;
    public final msc_grammarParser.conditionIdentification_return conditionIdentification() throws RecognitionException {
        msc_grammarParser.conditionIdentification_return retval = new msc_grammarParser.conditionIdentification_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal98=null;
        msc_grammarParser.conditionText_return conditionText99 = null;


        CommonTree string_literal98_tree=null;
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleSubtreeStream stream_conditionText=new RewriteRuleSubtreeStream(adaptor,"rule conditionText");
        try {
            // msc_grammar.g:181:2: ( 'condition' conditionText -> ^( Condition conditionText ) )
            // msc_grammar.g:181:4: 'condition' conditionText
            {
            string_literal98=(Token)match(input,81,FOLLOW_81_in_conditionIdentification1042);  
            stream_81.add(string_literal98);

            pushFollow(FOLLOW_conditionText_in_conditionIdentification1044);
            conditionText99=conditionText();

            state._fsp--;

            stream_conditionText.add(conditionText99.getTree());


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
            // 181:30: -> ^( Condition conditionText )
            {
                // msc_grammar.g:181:33: ^( Condition conditionText )
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
    // msc_grammar.g:183:1: conditionText : ( conditionNameList -> SetCond conditionNameList | WHEN conditionNameList -> GuardCond conditionNameList | OTHERWISE -> ElseCond );
    public final msc_grammarParser.conditionText_return conditionText() throws RecognitionException {
        msc_grammarParser.conditionText_return retval = new msc_grammarParser.conditionText_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHEN101=null;
        Token OTHERWISE103=null;
        msc_grammarParser.conditionNameList_return conditionNameList100 = null;

        msc_grammarParser.conditionNameList_return conditionNameList102 = null;


        CommonTree WHEN101_tree=null;
        CommonTree OTHERWISE103_tree=null;
        RewriteRuleTokenStream stream_WHEN=new RewriteRuleTokenStream(adaptor,"token WHEN");
        RewriteRuleTokenStream stream_OTHERWISE=new RewriteRuleTokenStream(adaptor,"token OTHERWISE");
        RewriteRuleSubtreeStream stream_conditionNameList=new RewriteRuleSubtreeStream(adaptor,"rule conditionNameList");
        try {
            // msc_grammar.g:184:2: ( conditionNameList -> SetCond conditionNameList | WHEN conditionNameList -> GuardCond conditionNameList | OTHERWISE -> ElseCond )
            int alt33=3;
            switch ( input.LA(1) ) {
            case NAME:
            case CHARACTERSTRING:
                {
                alt33=1;
                }
                break;
            case WHEN:
                {
                alt33=2;
                }
                break;
            case OTHERWISE:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // msc_grammar.g:184:4: conditionNameList
                    {
                    pushFollow(FOLLOW_conditionNameList_in_conditionText1065);
                    conditionNameList100=conditionNameList();

                    state._fsp--;

                    stream_conditionNameList.add(conditionNameList100.getTree());


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
                    // 184:23: -> SetCond conditionNameList
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SetCond, "SetCond"));
                        adaptor.addChild(root_0, stream_conditionNameList.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // msc_grammar.g:185:4: WHEN conditionNameList
                    {
                    WHEN101=(Token)match(input,WHEN,FOLLOW_WHEN_in_conditionText1077);  
                    stream_WHEN.add(WHEN101);

                    pushFollow(FOLLOW_conditionNameList_in_conditionText1079);
                    conditionNameList102=conditionNameList();

                    state._fsp--;

                    stream_conditionNameList.add(conditionNameList102.getTree());


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
                    // 185:27: -> GuardCond conditionNameList
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(GuardCond, "GuardCond"));
                        adaptor.addChild(root_0, stream_conditionNameList.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // msc_grammar.g:186:5: OTHERWISE
                    {
                    OTHERWISE103=(Token)match(input,OTHERWISE,FOLLOW_OTHERWISE_in_conditionText1091);  
                    stream_OTHERWISE.add(OTHERWISE103);



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
                    // 186:17: -> ElseCond
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(ElseCond, "ElseCond"));

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

    public static class conditionNameList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionNameList"
    // msc_grammar.g:188:1: conditionNameList : ( name | characterString );
    public final msc_grammarParser.conditionNameList_return conditionNameList() throws RecognitionException {
        msc_grammarParser.conditionNameList_return retval = new msc_grammarParser.conditionNameList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.name_return name104 = null;

        msc_grammarParser.characterString_return characterString105 = null;



        try {
            // msc_grammar.g:189:2: ( name | characterString )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==NAME) ) {
                alt34=1;
            }
            else if ( (LA34_0==CHARACTERSTRING) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // msc_grammar.g:189:4: name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_name_in_conditionNameList1108);
                    name104=name();

                    state._fsp--;

                    adaptor.addChild(root_0, name104.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:189:11: characterString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_characterString_in_conditionNameList1112);
                    characterString105=characterString();

                    state._fsp--;

                    adaptor.addChild(root_0, characterString105.getTree());

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
    // $ANTLR end "conditionNameList"

    public static class inlineExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inlineExpr"
    // msc_grammar.g:193:1: inlineExpr : ( loopExpr | optExpr | altExpr | parExpr | excExpr );
    public final msc_grammarParser.inlineExpr_return inlineExpr() throws RecognitionException {
        msc_grammarParser.inlineExpr_return retval = new msc_grammarParser.inlineExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.loopExpr_return loopExpr106 = null;

        msc_grammarParser.optExpr_return optExpr107 = null;

        msc_grammarParser.altExpr_return altExpr108 = null;

        msc_grammarParser.parExpr_return parExpr109 = null;

        msc_grammarParser.excExpr_return excExpr110 = null;



        try {
            // msc_grammar.g:194:2: ( loopExpr | optExpr | altExpr | parExpr | excExpr )
            int alt35=5;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt35=1;
                }
                break;
            case 83:
                {
                alt35=2;
                }
                break;
            case 85:
                {
                alt35=3;
                }
                break;
            case 86:
                {
                alt35=4;
                }
                break;
            case 84:
                {
                alt35=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // msc_grammar.g:194:4: loopExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_loopExpr_in_inlineExpr1125);
                    loopExpr106=loopExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, loopExpr106.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:194:15: optExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_optExpr_in_inlineExpr1129);
                    optExpr107=optExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, optExpr107.getTree());

                    }
                    break;
                case 3 :
                    // msc_grammar.g:194:25: altExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_altExpr_in_inlineExpr1133);
                    altExpr108=altExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, altExpr108.getTree());

                    }
                    break;
                case 4 :
                    // msc_grammar.g:194:35: parExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parExpr_in_inlineExpr1137);
                    parExpr109=parExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, parExpr109.getTree());

                    }
                    break;
                case 5 :
                    // msc_grammar.g:194:45: excExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_excExpr_in_inlineExpr1141);
                    excExpr110=excExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, excExpr110.getTree());

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
    // msc_grammar.g:196:1: loopExpr : 'loop' ( loopBoundary )? BEGIN end mscBody 'loop' END -> ^( Loop mscBody ( loopBoundary )? ) ;
    public final msc_grammarParser.loopExpr_return loopExpr() throws RecognitionException {
        msc_grammarParser.loopExpr_return retval = new msc_grammarParser.loopExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal111=null;
        Token BEGIN113=null;
        Token string_literal116=null;
        Token END117=null;
        msc_grammarParser.loopBoundary_return loopBoundary112 = null;

        msc_grammarParser.end_return end114 = null;

        msc_grammarParser.mscBody_return mscBody115 = null;


        CommonTree string_literal111_tree=null;
        CommonTree BEGIN113_tree=null;
        CommonTree string_literal116_tree=null;
        CommonTree END117_tree=null;
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_loopBoundary=new RewriteRuleSubtreeStream(adaptor,"rule loopBoundary");
        RewriteRuleSubtreeStream stream_mscBody=new RewriteRuleSubtreeStream(adaptor,"rule mscBody");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:197:2: ( 'loop' ( loopBoundary )? BEGIN end mscBody 'loop' END -> ^( Loop mscBody ( loopBoundary )? ) )
            // msc_grammar.g:197:4: 'loop' ( loopBoundary )? BEGIN end mscBody 'loop' END
            {
            string_literal111=(Token)match(input,82,FOLLOW_82_in_loopExpr1152);  
            stream_82.add(string_literal111);

            // msc_grammar.g:197:11: ( loopBoundary )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==87) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // msc_grammar.g:197:13: loopBoundary
                    {
                    pushFollow(FOLLOW_loopBoundary_in_loopExpr1156);
                    loopBoundary112=loopBoundary();

                    state._fsp--;

                    stream_loopBoundary.add(loopBoundary112.getTree());

                    }
                    break;

            }

            BEGIN113=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_loopExpr1161);  
            stream_BEGIN.add(BEGIN113);

            pushFollow(FOLLOW_end_in_loopExpr1163);
            end114=end();

            state._fsp--;

            stream_end.add(end114.getTree());
            pushFollow(FOLLOW_mscBody_in_loopExpr1165);
            mscBody115=mscBody();

            state._fsp--;

            stream_mscBody.add(mscBody115.getTree());
            string_literal116=(Token)match(input,82,FOLLOW_82_in_loopExpr1167);  
            stream_82.add(string_literal116);

            END117=(Token)match(input,END,FOLLOW_END_in_loopExpr1169);  
            stream_END.add(END117);



            // AST REWRITE
            // elements: loopBoundary, mscBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 197:58: -> ^( Loop mscBody ( loopBoundary )? )
            {
                // msc_grammar.g:197:61: ^( Loop mscBody ( loopBoundary )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Loop, "Loop"), root_1);

                adaptor.addChild(root_1, stream_mscBody.nextTree());
                // msc_grammar.g:197:77: ( loopBoundary )?
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
    // msc_grammar.g:199:1: optExpr : 'opt' BEGIN end mscBody 'opt' END -> ^( Opt mscBody ) ;
    public final msc_grammarParser.optExpr_return optExpr() throws RecognitionException {
        msc_grammarParser.optExpr_return retval = new msc_grammarParser.optExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal118=null;
        Token BEGIN119=null;
        Token string_literal122=null;
        Token END123=null;
        msc_grammarParser.end_return end120 = null;

        msc_grammarParser.mscBody_return mscBody121 = null;


        CommonTree string_literal118_tree=null;
        CommonTree BEGIN119_tree=null;
        CommonTree string_literal122_tree=null;
        CommonTree END123_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_mscBody=new RewriteRuleSubtreeStream(adaptor,"rule mscBody");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:199:9: ( 'opt' BEGIN end mscBody 'opt' END -> ^( Opt mscBody ) )
            // msc_grammar.g:199:11: 'opt' BEGIN end mscBody 'opt' END
            {
            string_literal118=(Token)match(input,83,FOLLOW_83_in_optExpr1191);  
            stream_83.add(string_literal118);

            BEGIN119=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_optExpr1193);  
            stream_BEGIN.add(BEGIN119);

            pushFollow(FOLLOW_end_in_optExpr1195);
            end120=end();

            state._fsp--;

            stream_end.add(end120.getTree());
            pushFollow(FOLLOW_mscBody_in_optExpr1197);
            mscBody121=mscBody();

            state._fsp--;

            stream_mscBody.add(mscBody121.getTree());
            string_literal122=(Token)match(input,83,FOLLOW_83_in_optExpr1199);  
            stream_83.add(string_literal122);

            END123=(Token)match(input,END,FOLLOW_END_in_optExpr1201);  
            stream_END.add(END123);



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
            // 199:45: -> ^( Opt mscBody )
            {
                // msc_grammar.g:199:48: ^( Opt mscBody )
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
    // msc_grammar.g:201:1: excExpr : 'exc' BEGIN end mscBody 'exc' END -> ^( Exc mscBody ) ;
    public final msc_grammarParser.excExpr_return excExpr() throws RecognitionException {
        msc_grammarParser.excExpr_return retval = new msc_grammarParser.excExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal124=null;
        Token BEGIN125=null;
        Token string_literal128=null;
        Token END129=null;
        msc_grammarParser.end_return end126 = null;

        msc_grammarParser.mscBody_return mscBody127 = null;


        CommonTree string_literal124_tree=null;
        CommonTree BEGIN125_tree=null;
        CommonTree string_literal128_tree=null;
        CommonTree END129_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleSubtreeStream stream_mscBody=new RewriteRuleSubtreeStream(adaptor,"rule mscBody");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:201:9: ( 'exc' BEGIN end mscBody 'exc' END -> ^( Exc mscBody ) )
            // msc_grammar.g:201:11: 'exc' BEGIN end mscBody 'exc' END
            {
            string_literal124=(Token)match(input,84,FOLLOW_84_in_excExpr1220);  
            stream_84.add(string_literal124);

            BEGIN125=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_excExpr1222);  
            stream_BEGIN.add(BEGIN125);

            pushFollow(FOLLOW_end_in_excExpr1224);
            end126=end();

            state._fsp--;

            stream_end.add(end126.getTree());
            pushFollow(FOLLOW_mscBody_in_excExpr1226);
            mscBody127=mscBody();

            state._fsp--;

            stream_mscBody.add(mscBody127.getTree());
            string_literal128=(Token)match(input,84,FOLLOW_84_in_excExpr1228);  
            stream_84.add(string_literal128);

            END129=(Token)match(input,END,FOLLOW_END_in_excExpr1230);  
            stream_END.add(END129);



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
            // 201:45: -> ^( Exc mscBody )
            {
                // msc_grammar.g:201:48: ^( Exc mscBody )
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
    // msc_grammar.g:203:1: altExpr : 'alt' BEGIN end mscBody ( 'alt' end mscBody )* 'alt' END -> ^( Alt ( mscBody )+ ) ;
    public final msc_grammarParser.altExpr_return altExpr() throws RecognitionException {
        msc_grammarParser.altExpr_return retval = new msc_grammarParser.altExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal130=null;
        Token BEGIN131=null;
        Token string_literal134=null;
        Token string_literal137=null;
        Token END138=null;
        msc_grammarParser.end_return end132 = null;

        msc_grammarParser.mscBody_return mscBody133 = null;

        msc_grammarParser.end_return end135 = null;

        msc_grammarParser.mscBody_return mscBody136 = null;


        CommonTree string_literal130_tree=null;
        CommonTree BEGIN131_tree=null;
        CommonTree string_literal134_tree=null;
        CommonTree string_literal137_tree=null;
        CommonTree END138_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_mscBody=new RewriteRuleSubtreeStream(adaptor,"rule mscBody");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:203:9: ( 'alt' BEGIN end mscBody ( 'alt' end mscBody )* 'alt' END -> ^( Alt ( mscBody )+ ) )
            // msc_grammar.g:203:11: 'alt' BEGIN end mscBody ( 'alt' end mscBody )* 'alt' END
            {
            string_literal130=(Token)match(input,85,FOLLOW_85_in_altExpr1249);  
            stream_85.add(string_literal130);

            BEGIN131=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_altExpr1251);  
            stream_BEGIN.add(BEGIN131);

            pushFollow(FOLLOW_end_in_altExpr1253);
            end132=end();

            state._fsp--;

            stream_end.add(end132.getTree());
            pushFollow(FOLLOW_mscBody_in_altExpr1255);
            mscBody133=mscBody();

            state._fsp--;

            stream_mscBody.add(mscBody133.getTree());
            // msc_grammar.g:203:35: ( 'alt' end mscBody )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==85) ) {
                    int LA37_1 = input.LA(2);

                    if ( (LA37_1==80) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // msc_grammar.g:203:37: 'alt' end mscBody
            	    {
            	    string_literal134=(Token)match(input,85,FOLLOW_85_in_altExpr1259);  
            	    stream_85.add(string_literal134);

            	    pushFollow(FOLLOW_end_in_altExpr1261);
            	    end135=end();

            	    state._fsp--;

            	    stream_end.add(end135.getTree());
            	    pushFollow(FOLLOW_mscBody_in_altExpr1263);
            	    mscBody136=mscBody();

            	    state._fsp--;

            	    stream_mscBody.add(mscBody136.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            string_literal137=(Token)match(input,85,FOLLOW_85_in_altExpr1268);  
            stream_85.add(string_literal137);

            END138=(Token)match(input,END,FOLLOW_END_in_altExpr1270);  
            stream_END.add(END138);



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
            // 203:68: -> ^( Alt ( mscBody )+ )
            {
                // msc_grammar.g:203:71: ^( Alt ( mscBody )+ )
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
    // msc_grammar.g:205:1: parExpr : 'par' BEGIN end mscBody ( 'par' end mscBody )* 'par' END -> ^( Par ( mscBody )+ ) ;
    public final msc_grammarParser.parExpr_return parExpr() throws RecognitionException {
        msc_grammarParser.parExpr_return retval = new msc_grammarParser.parExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal139=null;
        Token BEGIN140=null;
        Token string_literal143=null;
        Token string_literal146=null;
        Token END147=null;
        msc_grammarParser.end_return end141 = null;

        msc_grammarParser.mscBody_return mscBody142 = null;

        msc_grammarParser.end_return end144 = null;

        msc_grammarParser.mscBody_return mscBody145 = null;


        CommonTree string_literal139_tree=null;
        CommonTree BEGIN140_tree=null;
        CommonTree string_literal143_tree=null;
        CommonTree string_literal146_tree=null;
        CommonTree END147_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_mscBody=new RewriteRuleSubtreeStream(adaptor,"rule mscBody");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:205:9: ( 'par' BEGIN end mscBody ( 'par' end mscBody )* 'par' END -> ^( Par ( mscBody )+ ) )
            // msc_grammar.g:205:11: 'par' BEGIN end mscBody ( 'par' end mscBody )* 'par' END
            {
            string_literal139=(Token)match(input,86,FOLLOW_86_in_parExpr1290);  
            stream_86.add(string_literal139);

            BEGIN140=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_parExpr1292);  
            stream_BEGIN.add(BEGIN140);

            pushFollow(FOLLOW_end_in_parExpr1294);
            end141=end();

            state._fsp--;

            stream_end.add(end141.getTree());
            pushFollow(FOLLOW_mscBody_in_parExpr1296);
            mscBody142=mscBody();

            state._fsp--;

            stream_mscBody.add(mscBody142.getTree());
            // msc_grammar.g:205:35: ( 'par' end mscBody )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==86) ) {
                    int LA38_1 = input.LA(2);

                    if ( (LA38_1==80) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // msc_grammar.g:205:37: 'par' end mscBody
            	    {
            	    string_literal143=(Token)match(input,86,FOLLOW_86_in_parExpr1300);  
            	    stream_86.add(string_literal143);

            	    pushFollow(FOLLOW_end_in_parExpr1302);
            	    end144=end();

            	    state._fsp--;

            	    stream_end.add(end144.getTree());
            	    pushFollow(FOLLOW_mscBody_in_parExpr1304);
            	    mscBody145=mscBody();

            	    state._fsp--;

            	    stream_mscBody.add(mscBody145.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            string_literal146=(Token)match(input,86,FOLLOW_86_in_parExpr1309);  
            stream_86.add(string_literal146);

            END147=(Token)match(input,END,FOLLOW_END_in_parExpr1311);  
            stream_END.add(END147);



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
            // 205:68: -> ^( Par ( mscBody )+ )
            {
                // msc_grammar.g:205:71: ^( Par ( mscBody )+ )
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
    // msc_grammar.g:207:1: loopBoundary : '<' infNatural ( ',' infNatural )? '>' -> ^( LoopBoundary ( infNatural )+ ) ;
    public final msc_grammarParser.loopBoundary_return loopBoundary() throws RecognitionException {
        msc_grammarParser.loopBoundary_return retval = new msc_grammarParser.loopBoundary_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal148=null;
        Token char_literal150=null;
        Token char_literal152=null;
        msc_grammarParser.infNatural_return infNatural149 = null;

        msc_grammarParser.infNatural_return infNatural151 = null;


        CommonTree char_literal148_tree=null;
        CommonTree char_literal150_tree=null;
        CommonTree char_literal152_tree=null;
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleSubtreeStream stream_infNatural=new RewriteRuleSubtreeStream(adaptor,"rule infNatural");
        try {
            // msc_grammar.g:208:2: ( '<' infNatural ( ',' infNatural )? '>' -> ^( LoopBoundary ( infNatural )+ ) )
            // msc_grammar.g:208:4: '<' infNatural ( ',' infNatural )? '>'
            {
            char_literal148=(Token)match(input,87,FOLLOW_87_in_loopBoundary1332);  
            stream_87.add(char_literal148);

            pushFollow(FOLLOW_infNatural_in_loopBoundary1334);
            infNatural149=infNatural();

            state._fsp--;

            stream_infNatural.add(infNatural149.getTree());
            // msc_grammar.g:208:19: ( ',' infNatural )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==62) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // msc_grammar.g:208:21: ',' infNatural
                    {
                    char_literal150=(Token)match(input,62,FOLLOW_62_in_loopBoundary1338);  
                    stream_62.add(char_literal150);

                    pushFollow(FOLLOW_infNatural_in_loopBoundary1340);
                    infNatural151=infNatural();

                    state._fsp--;

                    stream_infNatural.add(infNatural151.getTree());

                    }
                    break;

            }

            char_literal152=(Token)match(input,88,FOLLOW_88_in_loopBoundary1345);  
            stream_88.add(char_literal152);



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
            // 208:43: -> ^( LoopBoundary ( infNatural )+ )
            {
                // msc_grammar.g:208:46: ^( LoopBoundary ( infNatural )+ )
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
    // msc_grammar.g:210:1: infNatural : ( 'inf' | '\"' expressionString '\"' );
    public final msc_grammarParser.infNatural_return infNatural() throws RecognitionException {
        msc_grammarParser.infNatural_return retval = new msc_grammarParser.infNatural_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal153=null;
        Token char_literal154=null;
        Token char_literal156=null;
        msc_grammarParser.expressionString_return expressionString155 = null;


        CommonTree string_literal153_tree=null;
        CommonTree char_literal154_tree=null;
        CommonTree char_literal156_tree=null;

        try {
            // msc_grammar.g:211:2: ( 'inf' | '\"' expressionString '\"' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==89) ) {
                alt40=1;
            }
            else if ( (LA40_0==90) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // msc_grammar.g:211:4: 'inf'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal153=(Token)match(input,89,FOLLOW_89_in_infNatural1367); 
                    string_literal153_tree = (CommonTree)adaptor.create(string_literal153);
                    adaptor.addChild(root_0, string_literal153_tree);


                    }
                    break;
                case 2 :
                    // msc_grammar.g:211:12: '\"' expressionString '\"'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal154=(Token)match(input,90,FOLLOW_90_in_infNatural1371); 
                    char_literal154_tree = (CommonTree)adaptor.create(char_literal154);
                    adaptor.addChild(root_0, char_literal154_tree);

                    pushFollow(FOLLOW_expressionString_in_infNatural1373);
                    expressionString155=expressionString();

                    state._fsp--;

                    adaptor.addChild(root_0, expressionString155.getTree());
                    char_literal156=(Token)match(input,90,FOLLOW_90_in_infNatural1375); 
                    char_literal156_tree = (CommonTree)adaptor.create(char_literal156);
                    adaptor.addChild(root_0, char_literal156_tree);


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
    // msc_grammar.g:215:1: create : 'create' instanceName ( '(' msgIdentification ')' )? -> ^( Create instanceName ^( ParameterList ( msgIdentification )? ) ) ;
    public final msc_grammarParser.create_return create() throws RecognitionException {
        msc_grammarParser.create_return retval = new msc_grammarParser.create_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal157=null;
        Token char_literal159=null;
        Token char_literal161=null;
        msc_grammarParser.instanceName_return instanceName158 = null;

        msc_grammarParser.msgIdentification_return msgIdentification160 = null;


        CommonTree string_literal157_tree=null;
        CommonTree char_literal159_tree=null;
        CommonTree char_literal161_tree=null;
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleSubtreeStream stream_instanceName=new RewriteRuleSubtreeStream(adaptor,"rule instanceName");
        RewriteRuleSubtreeStream stream_msgIdentification=new RewriteRuleSubtreeStream(adaptor,"rule msgIdentification");
        try {
            // msc_grammar.g:215:9: ( 'create' instanceName ( '(' msgIdentification ')' )? -> ^( Create instanceName ^( ParameterList ( msgIdentification )? ) ) )
            // msc_grammar.g:215:11: 'create' instanceName ( '(' msgIdentification ')' )?
            {
            string_literal157=(Token)match(input,91,FOLLOW_91_in_create1388);  
            stream_91.add(string_literal157);

            pushFollow(FOLLOW_instanceName_in_create1390);
            instanceName158=instanceName();

            state._fsp--;

            stream_instanceName.add(instanceName158.getTree());
            // msc_grammar.g:215:33: ( '(' msgIdentification ')' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==92) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // msc_grammar.g:215:35: '(' msgIdentification ')'
                    {
                    char_literal159=(Token)match(input,92,FOLLOW_92_in_create1394);  
                    stream_92.add(char_literal159);

                    pushFollow(FOLLOW_msgIdentification_in_create1395);
                    msgIdentification160=msgIdentification();

                    state._fsp--;

                    stream_msgIdentification.add(msgIdentification160.getTree());
                    char_literal161=(Token)match(input,93,FOLLOW_93_in_create1397);  
                    stream_93.add(char_literal161);


                    }
                    break;

            }



            // AST REWRITE
            // elements: msgIdentification, instanceName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 215:63: -> ^( Create instanceName ^( ParameterList ( msgIdentification )? ) )
            {
                // msc_grammar.g:215:66: ^( Create instanceName ^( ParameterList ( msgIdentification )? ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Create, "Create"), root_1);

                adaptor.addChild(root_1, stream_instanceName.nextTree());
                // msc_grammar.g:215:89: ^( ParameterList ( msgIdentification )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ParameterList, "ParameterList"), root_2);

                // msc_grammar.g:215:105: ( msgIdentification )?
                if ( stream_msgIdentification.hasNext() ) {
                    adaptor.addChild(root_2, stream_msgIdentification.nextTree());

                }
                stream_msgIdentification.reset();

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
    // msc_grammar.g:217:1: stop : 'stop' -> Terminate ;
    public final msc_grammarParser.stop_return stop() throws RecognitionException {
        msc_grammarParser.stop_return retval = new msc_grammarParser.stop_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal162=null;

        CommonTree string_literal162_tree=null;
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");

        try {
            // msc_grammar.g:217:7: ( 'stop' -> Terminate )
            // msc_grammar.g:217:9: 'stop'
            {
            string_literal162=(Token)match(input,94,FOLLOW_94_in_stop1427);  
            stream_94.add(string_literal162);



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
            // 217:16: -> Terminate
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
    // msc_grammar.g:220:1: timerStatement : ( setTimer | resetTimer | timeout );
    public final msc_grammarParser.timerStatement_return timerStatement() throws RecognitionException {
        msc_grammarParser.timerStatement_return retval = new msc_grammarParser.timerStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.setTimer_return setTimer163 = null;

        msc_grammarParser.resetTimer_return resetTimer164 = null;

        msc_grammarParser.timeout_return timeout165 = null;



        try {
            // msc_grammar.g:221:2: ( setTimer | resetTimer | timeout )
            int alt42=3;
            switch ( input.LA(1) ) {
            case 95:
                {
                alt42=1;
                }
                break;
            case 98:
                {
                alt42=2;
                }
                break;
            case 99:
                {
                alt42=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // msc_grammar.g:221:4: setTimer
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_setTimer_in_timerStatement1443);
                    setTimer163=setTimer();

                    state._fsp--;

                    adaptor.addChild(root_0, setTimer163.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:221:15: resetTimer
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_resetTimer_in_timerStatement1447);
                    resetTimer164=resetTimer();

                    state._fsp--;

                    adaptor.addChild(root_0, resetTimer164.getTree());

                    }
                    break;
                case 3 :
                    // msc_grammar.g:221:28: timeout
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_timeout_in_timerStatement1451);
                    timeout165=timeout();

                    state._fsp--;

                    adaptor.addChild(root_0, timeout165.getTree());

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
    // msc_grammar.g:223:1: setTimer : 'starttimer' name ( ',' instanceName )? ( duration ) -> ^( StartTimer name ( instanceName )? ( duration )? ) ;
    public final msc_grammarParser.setTimer_return setTimer() throws RecognitionException {
        msc_grammarParser.setTimer_return retval = new msc_grammarParser.setTimer_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal166=null;
        Token char_literal168=null;
        msc_grammarParser.name_return name167 = null;

        msc_grammarParser.instanceName_return instanceName169 = null;

        msc_grammarParser.duration_return duration170 = null;


        CommonTree string_literal166_tree=null;
        CommonTree char_literal168_tree=null;
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleSubtreeStream stream_duration=new RewriteRuleSubtreeStream(adaptor,"rule duration");
        RewriteRuleSubtreeStream stream_instanceName=new RewriteRuleSubtreeStream(adaptor,"rule instanceName");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        try {
            // msc_grammar.g:224:2: ( 'starttimer' name ( ',' instanceName )? ( duration ) -> ^( StartTimer name ( instanceName )? ( duration )? ) )
            // msc_grammar.g:224:4: 'starttimer' name ( ',' instanceName )? ( duration )
            {
            string_literal166=(Token)match(input,95,FOLLOW_95_in_setTimer1462);  
            stream_95.add(string_literal166);

            pushFollow(FOLLOW_name_in_setTimer1464);
            name167=name();

            state._fsp--;

            stream_name.add(name167.getTree());
            // msc_grammar.g:224:22: ( ',' instanceName )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==62) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // msc_grammar.g:224:24: ',' instanceName
                    {
                    char_literal168=(Token)match(input,62,FOLLOW_62_in_setTimer1468);  
                    stream_62.add(char_literal168);

                    pushFollow(FOLLOW_instanceName_in_setTimer1470);
                    instanceName169=instanceName();

                    state._fsp--;

                    stream_instanceName.add(instanceName169.getTree());

                    }
                    break;

            }

            // msc_grammar.g:224:44: ( duration )
            // msc_grammar.g:224:46: duration
            {
            pushFollow(FOLLOW_duration_in_setTimer1477);
            duration170=duration();

            state._fsp--;

            stream_duration.add(duration170.getTree());

            }



            // AST REWRITE
            // elements: duration, instanceName, name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 225:4: -> ^( StartTimer name ( instanceName )? ( duration )? )
            {
                // msc_grammar.g:225:7: ^( StartTimer name ( instanceName )? ( duration )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(StartTimer, "StartTimer"), root_1);

                adaptor.addChild(root_1, stream_name.nextTree());
                // msc_grammar.g:225:26: ( instanceName )?
                if ( stream_instanceName.hasNext() ) {
                    adaptor.addChild(root_1, stream_instanceName.nextTree());

                }
                stream_instanceName.reset();
                // msc_grammar.g:225:40: ( duration )?
                if ( stream_duration.hasNext() ) {
                    adaptor.addChild(root_1, stream_duration.nextTree());

                }
                stream_duration.reset();

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
    // msc_grammar.g:227:1: duration : '[' ( infNatural )? ( ',' infNatural )? ']' ;
    public final msc_grammarParser.duration_return duration() throws RecognitionException {
        msc_grammarParser.duration_return retval = new msc_grammarParser.duration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal171=null;
        Token char_literal173=null;
        Token char_literal175=null;
        msc_grammarParser.infNatural_return infNatural172 = null;

        msc_grammarParser.infNatural_return infNatural174 = null;


        CommonTree char_literal171_tree=null;
        CommonTree char_literal173_tree=null;
        CommonTree char_literal175_tree=null;

        try {
            // msc_grammar.g:228:2: ( '[' ( infNatural )? ( ',' infNatural )? ']' )
            // msc_grammar.g:228:4: '[' ( infNatural )? ( ',' infNatural )? ']'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal171=(Token)match(input,96,FOLLOW_96_in_duration1510); 
            char_literal171_tree = (CommonTree)adaptor.create(char_literal171);
            adaptor.addChild(root_0, char_literal171_tree);

            // msc_grammar.g:228:8: ( infNatural )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=89 && LA44_0<=90)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // msc_grammar.g:228:10: infNatural
                    {
                    pushFollow(FOLLOW_infNatural_in_duration1514);
                    infNatural172=infNatural();

                    state._fsp--;

                    adaptor.addChild(root_0, infNatural172.getTree());

                    }
                    break;

            }

            // msc_grammar.g:228:24: ( ',' infNatural )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==62) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // msc_grammar.g:228:26: ',' infNatural
                    {
                    char_literal173=(Token)match(input,62,FOLLOW_62_in_duration1521); 
                    char_literal173_tree = (CommonTree)adaptor.create(char_literal173);
                    adaptor.addChild(root_0, char_literal173_tree);

                    pushFollow(FOLLOW_infNatural_in_duration1523);
                    infNatural174=infNatural();

                    state._fsp--;

                    adaptor.addChild(root_0, infNatural174.getTree());

                    }
                    break;

            }

            char_literal175=(Token)match(input,97,FOLLOW_97_in_duration1528); 
            char_literal175_tree = (CommonTree)adaptor.create(char_literal175);
            adaptor.addChild(root_0, char_literal175_tree);


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
    // msc_grammar.g:230:1: resetTimer : 'stoptimer' name ( ',' instanceName )? -> ^( StopTimer name ( instanceName )? ) ;
    public final msc_grammarParser.resetTimer_return resetTimer() throws RecognitionException {
        msc_grammarParser.resetTimer_return retval = new msc_grammarParser.resetTimer_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal176=null;
        Token char_literal178=null;
        msc_grammarParser.name_return name177 = null;

        msc_grammarParser.instanceName_return instanceName179 = null;


        CommonTree string_literal176_tree=null;
        CommonTree char_literal178_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleSubtreeStream stream_instanceName=new RewriteRuleSubtreeStream(adaptor,"rule instanceName");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        try {
            // msc_grammar.g:231:2: ( 'stoptimer' name ( ',' instanceName )? -> ^( StopTimer name ( instanceName )? ) )
            // msc_grammar.g:231:4: 'stoptimer' name ( ',' instanceName )?
            {
            string_literal176=(Token)match(input,98,FOLLOW_98_in_resetTimer1539);  
            stream_98.add(string_literal176);

            pushFollow(FOLLOW_name_in_resetTimer1541);
            name177=name();

            state._fsp--;

            stream_name.add(name177.getTree());
            // msc_grammar.g:231:21: ( ',' instanceName )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==62) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // msc_grammar.g:231:23: ',' instanceName
                    {
                    char_literal178=(Token)match(input,62,FOLLOW_62_in_resetTimer1545);  
                    stream_62.add(char_literal178);

                    pushFollow(FOLLOW_instanceName_in_resetTimer1547);
                    instanceName179=instanceName();

                    state._fsp--;

                    stream_instanceName.add(instanceName179.getTree());

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
            // 231:43: -> ^( StopTimer name ( instanceName )? )
            {
                // msc_grammar.g:231:46: ^( StopTimer name ( instanceName )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(StopTimer, "StopTimer"), root_1);

                adaptor.addChild(root_1, stream_name.nextTree());
                // msc_grammar.g:231:64: ( instanceName )?
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
    // msc_grammar.g:233:1: timeout : 'timeout' name ( ',' instanceName )? -> ^( Timeout name ( instanceName )? ) ;
    public final msc_grammarParser.timeout_return timeout() throws RecognitionException {
        msc_grammarParser.timeout_return retval = new msc_grammarParser.timeout_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal180=null;
        Token char_literal182=null;
        msc_grammarParser.name_return name181 = null;

        msc_grammarParser.instanceName_return instanceName183 = null;


        CommonTree string_literal180_tree=null;
        CommonTree char_literal182_tree=null;
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleSubtreeStream stream_instanceName=new RewriteRuleSubtreeStream(adaptor,"rule instanceName");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        try {
            // msc_grammar.g:233:9: ( 'timeout' name ( ',' instanceName )? -> ^( Timeout name ( instanceName )? ) )
            // msc_grammar.g:233:11: 'timeout' name ( ',' instanceName )?
            {
            string_literal180=(Token)match(input,99,FOLLOW_99_in_timeout1572);  
            stream_99.add(string_literal180);

            pushFollow(FOLLOW_name_in_timeout1574);
            name181=name();

            state._fsp--;

            stream_name.add(name181.getTree());
            // msc_grammar.g:233:26: ( ',' instanceName )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==62) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // msc_grammar.g:233:28: ',' instanceName
                    {
                    char_literal182=(Token)match(input,62,FOLLOW_62_in_timeout1578);  
                    stream_62.add(char_literal182);

                    pushFollow(FOLLOW_instanceName_in_timeout1580);
                    instanceName183=instanceName();

                    state._fsp--;

                    stream_instanceName.add(instanceName183.getTree());

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
            // 233:48: -> ^( Timeout name ( instanceName )? )
            {
                // msc_grammar.g:233:51: ^( Timeout name ( instanceName )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Timeout, "Timeout"), root_1);

                adaptor.addChild(root_1, stream_name.nextTree());
                // msc_grammar.g:233:67: ( instanceName )?
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
    // $ANTLR end "timeout"

    public static class mscGateInterface_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mscGateInterface"
    // msc_grammar.g:237:1: mscGateInterface : ( mscGateDef )+ ;
    public final msc_grammarParser.mscGateInterface_return mscGateInterface() throws RecognitionException {
        msc_grammarParser.mscGateInterface_return retval = new msc_grammarParser.mscGateInterface_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.mscGateDef_return mscGateDef184 = null;



        try {
            // msc_grammar.g:238:2: ( ( mscGateDef )+ )
            // msc_grammar.g:238:4: ( mscGateDef )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // msc_grammar.g:238:4: ( mscGateDef )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==100) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // msc_grammar.g:238:4: mscGateDef
            	    {
            	    pushFollow(FOLLOW_mscGateDef_in_mscGateInterface1610);
            	    mscGateDef184=mscGateDef();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mscGateDef184.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
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
    // msc_grammar.g:240:1: mscGateDef : 'gate' ( msgGate | orderGate ) end ;
    public final msc_grammarParser.mscGateDef_return mscGateDef() throws RecognitionException {
        msc_grammarParser.mscGateDef_return retval = new msc_grammarParser.mscGateDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal185=null;
        msc_grammarParser.msgGate_return msgGate186 = null;

        msc_grammarParser.orderGate_return orderGate187 = null;

        msc_grammarParser.end_return end188 = null;


        CommonTree string_literal185_tree=null;

        try {
            // msc_grammar.g:241:2: ( 'gate' ( msgGate | orderGate ) end )
            // msc_grammar.g:241:4: 'gate' ( msgGate | orderGate ) end
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal185=(Token)match(input,100,FOLLOW_100_in_mscGateDef1622); 
            string_literal185_tree = (CommonTree)adaptor.create(string_literal185);
            adaptor.addChild(root_0, string_literal185_tree);

            // msc_grammar.g:241:11: ( msgGate | orderGate )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==NAME) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==80||(LA49_1>=101 && LA49_1<=102)) ) {
                    alt49=2;
                }
                else if ( (LA49_1==64||LA49_1==66) ) {
                    alt49=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA49_0==64||LA49_0==66) ) {
                alt49=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // msc_grammar.g:241:13: msgGate
                    {
                    pushFollow(FOLLOW_msgGate_in_mscGateDef1626);
                    msgGate186=msgGate();

                    state._fsp--;

                    adaptor.addChild(root_0, msgGate186.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:241:23: orderGate
                    {
                    pushFollow(FOLLOW_orderGate_in_mscGateDef1630);
                    orderGate187=orderGate();

                    state._fsp--;

                    adaptor.addChild(root_0, orderGate187.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_end_in_mscGateDef1634);
            end188=end();

            state._fsp--;

            adaptor.addChild(root_0, end188.getTree());

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
    // msc_grammar.g:243:1: msgGate : ( defInGate | defOutGate );
    public final msc_grammarParser.msgGate_return msgGate() throws RecognitionException {
        msc_grammarParser.msgGate_return retval = new msc_grammarParser.msgGate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.defInGate_return defInGate189 = null;

        msc_grammarParser.defOutGate_return defOutGate190 = null;



        try {
            // msc_grammar.g:243:9: ( defInGate | defOutGate )
            int alt50=2;
            switch ( input.LA(1) ) {
            case NAME:
                {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==66) ) {
                    alt50=2;
                }
                else if ( (LA50_1==64) ) {
                    alt50=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }
                }
                break;
            case 64:
                {
                alt50=1;
                }
                break;
            case 66:
                {
                alt50=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // msc_grammar.g:243:11: defInGate
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defInGate_in_msgGate1643);
                    defInGate189=defInGate();

                    state._fsp--;

                    adaptor.addChild(root_0, defInGate189.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:243:23: defOutGate
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defOutGate_in_msgGate1647);
                    defOutGate190=defOutGate();

                    state._fsp--;

                    adaptor.addChild(root_0, defOutGate190.getTree());

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
    // msc_grammar.g:245:1: orderGate : ( defOrderInGate | defOrderOutGate );
    public final msc_grammarParser.orderGate_return orderGate() throws RecognitionException {
        msc_grammarParser.orderGate_return retval = new msc_grammarParser.orderGate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.defOrderInGate_return defOrderInGate191 = null;

        msc_grammarParser.defOrderOutGate_return defOrderOutGate192 = null;



        try {
            // msc_grammar.g:246:2: ( defOrderInGate | defOrderOutGate )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==NAME) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==80||LA51_1==102) ) {
                    alt51=2;
                }
                else if ( (LA51_1==101) ) {
                    alt51=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // msc_grammar.g:246:4: defOrderInGate
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defOrderInGate_in_orderGate1658);
                    defOrderInGate191=defOrderInGate();

                    state._fsp--;

                    adaptor.addChild(root_0, defOrderInGate191.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:246:21: defOrderOutGate
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defOrderOutGate_in_orderGate1662);
                    defOrderOutGate192=defOrderOutGate();

                    state._fsp--;

                    adaptor.addChild(root_0, defOrderOutGate192.getTree());

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
    // msc_grammar.g:248:1: defInGate : ( gateName )? 'out' msgIdentification 'to' inputDest ;
    public final msc_grammarParser.defInGate_return defInGate() throws RecognitionException {
        msc_grammarParser.defInGate_return retval = new msc_grammarParser.defInGate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal194=null;
        Token string_literal196=null;
        msc_grammarParser.gateName_return gateName193 = null;

        msc_grammarParser.msgIdentification_return msgIdentification195 = null;

        msc_grammarParser.inputDest_return inputDest197 = null;


        CommonTree string_literal194_tree=null;
        CommonTree string_literal196_tree=null;

        try {
            // msc_grammar.g:249:2: ( ( gateName )? 'out' msgIdentification 'to' inputDest )
            // msc_grammar.g:249:4: ( gateName )? 'out' msgIdentification 'to' inputDest
            {
            root_0 = (CommonTree)adaptor.nil();

            // msc_grammar.g:249:4: ( gateName )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==NAME) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // msc_grammar.g:249:6: gateName
                    {
                    pushFollow(FOLLOW_gateName_in_defInGate1675);
                    gateName193=gateName();

                    state._fsp--;

                    adaptor.addChild(root_0, gateName193.getTree());

                    }
                    break;

            }

            string_literal194=(Token)match(input,64,FOLLOW_64_in_defInGate1680); 
            string_literal194_tree = (CommonTree)adaptor.create(string_literal194);
            adaptor.addChild(root_0, string_literal194_tree);

            pushFollow(FOLLOW_msgIdentification_in_defInGate1682);
            msgIdentification195=msgIdentification();

            state._fsp--;

            adaptor.addChild(root_0, msgIdentification195.getTree());
            string_literal196=(Token)match(input,65,FOLLOW_65_in_defInGate1684); 
            string_literal196_tree = (CommonTree)adaptor.create(string_literal196);
            adaptor.addChild(root_0, string_literal196_tree);

            pushFollow(FOLLOW_inputDest_in_defInGate1686);
            inputDest197=inputDest();

            state._fsp--;

            adaptor.addChild(root_0, inputDest197.getTree());

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
    // msc_grammar.g:251:1: defOutGate : ( gateName )? 'in' msgIdentification 'from' outputDest ;
    public final msc_grammarParser.defOutGate_return defOutGate() throws RecognitionException {
        msc_grammarParser.defOutGate_return retval = new msc_grammarParser.defOutGate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal199=null;
        Token string_literal201=null;
        msc_grammarParser.gateName_return gateName198 = null;

        msc_grammarParser.msgIdentification_return msgIdentification200 = null;

        msc_grammarParser.outputDest_return outputDest202 = null;


        CommonTree string_literal199_tree=null;
        CommonTree string_literal201_tree=null;

        try {
            // msc_grammar.g:252:2: ( ( gateName )? 'in' msgIdentification 'from' outputDest )
            // msc_grammar.g:252:4: ( gateName )? 'in' msgIdentification 'from' outputDest
            {
            root_0 = (CommonTree)adaptor.nil();

            // msc_grammar.g:252:4: ( gateName )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==NAME) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // msc_grammar.g:252:6: gateName
                    {
                    pushFollow(FOLLOW_gateName_in_defOutGate1699);
                    gateName198=gateName();

                    state._fsp--;

                    adaptor.addChild(root_0, gateName198.getTree());

                    }
                    break;

            }

            string_literal199=(Token)match(input,66,FOLLOW_66_in_defOutGate1704); 
            string_literal199_tree = (CommonTree)adaptor.create(string_literal199);
            adaptor.addChild(root_0, string_literal199_tree);

            pushFollow(FOLLOW_msgIdentification_in_defOutGate1706);
            msgIdentification200=msgIdentification();

            state._fsp--;

            adaptor.addChild(root_0, msgIdentification200.getTree());
            string_literal201=(Token)match(input,67,FOLLOW_67_in_defOutGate1708); 
            string_literal201_tree = (CommonTree)adaptor.create(string_literal201);
            adaptor.addChild(root_0, string_literal201_tree);

            pushFollow(FOLLOW_outputDest_in_defOutGate1710);
            outputDest202=outputDest();

            state._fsp--;

            adaptor.addChild(root_0, outputDest202.getTree());

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
    // msc_grammar.g:254:1: defOrderInGate : gateName 'before' orderDest ;
    public final msc_grammarParser.defOrderInGate_return defOrderInGate() throws RecognitionException {
        msc_grammarParser.defOrderInGate_return retval = new msc_grammarParser.defOrderInGate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal204=null;
        msc_grammarParser.gateName_return gateName203 = null;

        msc_grammarParser.orderDest_return orderDest205 = null;


        CommonTree string_literal204_tree=null;

        try {
            // msc_grammar.g:255:2: ( gateName 'before' orderDest )
            // msc_grammar.g:255:4: gateName 'before' orderDest
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_gateName_in_defOrderInGate1721);
            gateName203=gateName();

            state._fsp--;

            adaptor.addChild(root_0, gateName203.getTree());
            string_literal204=(Token)match(input,101,FOLLOW_101_in_defOrderInGate1723); 
            string_literal204_tree = (CommonTree)adaptor.create(string_literal204);
            adaptor.addChild(root_0, string_literal204_tree);

            pushFollow(FOLLOW_orderDest_in_defOrderInGate1725);
            orderDest205=orderDest();

            state._fsp--;

            adaptor.addChild(root_0, orderDest205.getTree());

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
    // msc_grammar.g:257:1: defOrderOutGate : gateName ( 'after' orderDestList )? ;
    public final msc_grammarParser.defOrderOutGate_return defOrderOutGate() throws RecognitionException {
        msc_grammarParser.defOrderOutGate_return retval = new msc_grammarParser.defOrderOutGate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal207=null;
        msc_grammarParser.gateName_return gateName206 = null;

        msc_grammarParser.orderDestList_return orderDestList208 = null;


        CommonTree string_literal207_tree=null;

        try {
            // msc_grammar.g:258:2: ( gateName ( 'after' orderDestList )? )
            // msc_grammar.g:258:4: gateName ( 'after' orderDestList )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_gateName_in_defOrderOutGate1735);
            gateName206=gateName();

            state._fsp--;

            adaptor.addChild(root_0, gateName206.getTree());
            // msc_grammar.g:258:13: ( 'after' orderDestList )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==102) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // msc_grammar.g:258:15: 'after' orderDestList
                    {
                    string_literal207=(Token)match(input,102,FOLLOW_102_in_defOrderOutGate1739); 
                    string_literal207_tree = (CommonTree)adaptor.create(string_literal207);
                    adaptor.addChild(root_0, string_literal207_tree);

                    pushFollow(FOLLOW_orderDestList_in_defOrderOutGate1741);
                    orderDestList208=orderDestList();

                    state._fsp--;

                    adaptor.addChild(root_0, orderDestList208.getTree());

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
    // msc_grammar.g:260:1: inputDest : ( 'lost' ( inputAddress )? | inputAddress );
    public final msc_grammarParser.inputDest_return inputDest() throws RecognitionException {
        msc_grammarParser.inputDest_return retval = new msc_grammarParser.inputDest_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal209=null;
        msc_grammarParser.inputAddress_return inputAddress210 = null;

        msc_grammarParser.inputAddress_return inputAddress211 = null;


        CommonTree string_literal209_tree=null;

        try {
            // msc_grammar.g:261:2: ( 'lost' ( inputAddress )? | inputAddress )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==68) ) {
                alt56=1;
            }
            else if ( (LA56_0==NAME||LA56_0==70) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // msc_grammar.g:261:4: 'lost' ( inputAddress )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal209=(Token)match(input,68,FOLLOW_68_in_inputDest1756); 
                    string_literal209_tree = (CommonTree)adaptor.create(string_literal209);
                    adaptor.addChild(root_0, string_literal209_tree);

                    // msc_grammar.g:261:11: ( inputAddress )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==NAME||LA55_0==70) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // msc_grammar.g:261:13: inputAddress
                            {
                            pushFollow(FOLLOW_inputAddress_in_inputDest1760);
                            inputAddress210=inputAddress();

                            state._fsp--;

                            adaptor.addChild(root_0, inputAddress210.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // msc_grammar.g:261:31: inputAddress
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_inputAddress_in_inputDest1767);
                    inputAddress211=inputAddress();

                    state._fsp--;

                    adaptor.addChild(root_0, inputAddress211.getTree());

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
    // msc_grammar.g:263:1: outputDest : ( 'found' ( outputAddress )? | outputAddress );
    public final msc_grammarParser.outputDest_return outputDest() throws RecognitionException {
        msc_grammarParser.outputDest_return retval = new msc_grammarParser.outputDest_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal212=null;
        msc_grammarParser.outputAddress_return outputAddress213 = null;

        msc_grammarParser.outputAddress_return outputAddress214 = null;


        CommonTree string_literal212_tree=null;

        try {
            // msc_grammar.g:264:2: ( 'found' ( outputAddress )? | outputAddress )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==69) ) {
                alt58=1;
            }
            else if ( (LA58_0==NAME||LA58_0==70) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // msc_grammar.g:264:4: 'found' ( outputAddress )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal212=(Token)match(input,69,FOLLOW_69_in_outputDest1778); 
                    string_literal212_tree = (CommonTree)adaptor.create(string_literal212);
                    adaptor.addChild(root_0, string_literal212_tree);

                    // msc_grammar.g:264:12: ( outputAddress )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==NAME||LA57_0==70) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // msc_grammar.g:264:14: outputAddress
                            {
                            pushFollow(FOLLOW_outputAddress_in_outputDest1782);
                            outputAddress213=outputAddress();

                            state._fsp--;

                            adaptor.addChild(root_0, outputAddress213.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // msc_grammar.g:264:33: outputAddress
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_outputAddress_in_outputDest1789);
                    outputAddress214=outputAddress();

                    state._fsp--;

                    adaptor.addChild(root_0, outputAddress214.getTree());

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
    // msc_grammar.g:266:1: orderDest : ( eventName | 'env' 'via' gateName -> ^( MsgGate gateName ) );
    public final msc_grammarParser.orderDest_return orderDest() throws RecognitionException {
        msc_grammarParser.orderDest_return retval = new msc_grammarParser.orderDest_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal216=null;
        Token string_literal217=null;
        msc_grammarParser.eventName_return eventName215 = null;

        msc_grammarParser.gateName_return gateName218 = null;


        CommonTree string_literal216_tree=null;
        CommonTree string_literal217_tree=null;
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_gateName=new RewriteRuleSubtreeStream(adaptor,"rule gateName");
        try {
            // msc_grammar.g:267:2: ( eventName | 'env' 'via' gateName -> ^( MsgGate gateName ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==NAME) ) {
                alt59=1;
            }
            else if ( (LA59_0==70) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // msc_grammar.g:267:4: eventName
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_eventName_in_orderDest1800);
                    eventName215=eventName();

                    state._fsp--;

                    adaptor.addChild(root_0, eventName215.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:268:4: 'env' 'via' gateName
                    {
                    string_literal216=(Token)match(input,70,FOLLOW_70_in_orderDest1805);  
                    stream_70.add(string_literal216);

                    string_literal217=(Token)match(input,71,FOLLOW_71_in_orderDest1807);  
                    stream_71.add(string_literal217);

                    pushFollow(FOLLOW_gateName_in_orderDest1809);
                    gateName218=gateName();

                    state._fsp--;

                    stream_gateName.add(gateName218.getTree());


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
                    // 268:25: -> ^( MsgGate gateName )
                    {
                        // msc_grammar.g:268:28: ^( MsgGate gateName )
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
    // msc_grammar.g:270:1: orderDestList : orderDest ( ',' orderDestList )? -> orderDest ( orderDestList )? ;
    public final msc_grammarParser.orderDestList_return orderDestList() throws RecognitionException {
        msc_grammarParser.orderDestList_return retval = new msc_grammarParser.orderDestList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal220=null;
        msc_grammarParser.orderDest_return orderDest219 = null;

        msc_grammarParser.orderDestList_return orderDestList221 = null;


        CommonTree char_literal220_tree=null;
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleSubtreeStream stream_orderDestList=new RewriteRuleSubtreeStream(adaptor,"rule orderDestList");
        RewriteRuleSubtreeStream stream_orderDest=new RewriteRuleSubtreeStream(adaptor,"rule orderDest");
        try {
            // msc_grammar.g:271:2: ( orderDest ( ',' orderDestList )? -> orderDest ( orderDestList )? )
            // msc_grammar.g:271:4: orderDest ( ',' orderDestList )?
            {
            pushFollow(FOLLOW_orderDest_in_orderDestList1830);
            orderDest219=orderDest();

            state._fsp--;

            stream_orderDest.add(orderDest219.getTree());
            // msc_grammar.g:271:14: ( ',' orderDestList )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==62) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // msc_grammar.g:271:16: ',' orderDestList
                    {
                    char_literal220=(Token)match(input,62,FOLLOW_62_in_orderDestList1834);  
                    stream_62.add(char_literal220);

                    pushFollow(FOLLOW_orderDestList_in_orderDestList1836);
                    orderDestList221=orderDestList();

                    state._fsp--;

                    stream_orderDestList.add(orderDestList221.getTree());

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
            // 271:37: -> orderDest ( orderDestList )?
            {
                adaptor.addChild(root_0, stream_orderDest.nextTree());
                // msc_grammar.g:271:50: ( orderDestList )?
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
    // msc_grammar.g:275:1: coregion : 'concurrent' end ( coevent )* 'endconcurrent' -> ^( Coregion ( coevent )* ) ;
    public final msc_grammarParser.coregion_return coregion() throws RecognitionException {
        msc_grammarParser.coregion_return retval = new msc_grammarParser.coregion_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal222=null;
        Token string_literal225=null;
        msc_grammarParser.end_return end223 = null;

        msc_grammarParser.coevent_return coevent224 = null;


        CommonTree string_literal222_tree=null;
        CommonTree string_literal225_tree=null;
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleSubtreeStream stream_coevent=new RewriteRuleSubtreeStream(adaptor,"rule coevent");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:276:2: ( 'concurrent' end ( coevent )* 'endconcurrent' -> ^( Coregion ( coevent )* ) )
            // msc_grammar.g:276:4: 'concurrent' end ( coevent )* 'endconcurrent'
            {
            string_literal222=(Token)match(input,103,FOLLOW_103_in_coregion1859);  
            stream_103.add(string_literal222);

            pushFollow(FOLLOW_end_in_coregion1861);
            end223=end();

            state._fsp--;

            stream_end.add(end223.getTree());
            // msc_grammar.g:276:21: ( coevent )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==NAME||(LA61_0>=63 && LA61_0<=64)||LA61_0==66||LA61_0==72||LA61_0==91||LA61_0==95||(LA61_0>=98 && LA61_0<=99)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // msc_grammar.g:276:21: coevent
            	    {
            	    pushFollow(FOLLOW_coevent_in_coregion1863);
            	    coevent224=coevent();

            	    state._fsp--;

            	    stream_coevent.add(coevent224.getTree());

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            string_literal225=(Token)match(input,104,FOLLOW_104_in_coregion1866);  
            stream_104.add(string_literal225);



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
            // 276:46: -> ^( Coregion ( coevent )* )
            {
                // msc_grammar.g:276:49: ^( Coregion ( coevent )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Coregion, "Coregion"), root_1);

                // msc_grammar.g:276:61: ( coevent )*
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
    // msc_grammar.g:278:1: coevent : orderableEvent end -> orderableEvent ;
    public final msc_grammarParser.coevent_return coevent() throws RecognitionException {
        msc_grammarParser.coevent_return retval = new msc_grammarParser.coevent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.orderableEvent_return orderableEvent226 = null;

        msc_grammarParser.end_return end227 = null;


        RewriteRuleSubtreeStream stream_orderableEvent=new RewriteRuleSubtreeStream(adaptor,"rule orderableEvent");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:278:9: ( orderableEvent end -> orderableEvent )
            // msc_grammar.g:278:11: orderableEvent end
            {
            pushFollow(FOLLOW_orderableEvent_in_coevent1886);
            orderableEvent226=orderableEvent();

            state._fsp--;

            stream_orderableEvent.add(orderableEvent226.getTree());
            pushFollow(FOLLOW_end_in_coevent1888);
            end227=end();

            state._fsp--;

            stream_end.add(end227.getTree());


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
            // 278:30: -> orderableEvent
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
    // msc_grammar.g:282:1: generalOrdering : ( before ( after )? | after );
    public final msc_grammarParser.generalOrdering_return generalOrdering() throws RecognitionException {
        msc_grammarParser.generalOrdering_return retval = new msc_grammarParser.generalOrdering_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.before_return before228 = null;

        msc_grammarParser.after_return after229 = null;

        msc_grammarParser.after_return after230 = null;



        try {
            // msc_grammar.g:283:2: ( before ( after )? | after )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==101) ) {
                alt63=1;
            }
            else if ( (LA63_0==102) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // msc_grammar.g:283:4: before ( after )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_before_in_generalOrdering1904);
                    before228=before();

                    state._fsp--;

                    adaptor.addChild(root_0, before228.getTree());
                    // msc_grammar.g:283:11: ( after )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==102) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // msc_grammar.g:283:11: after
                            {
                            pushFollow(FOLLOW_after_in_generalOrdering1906);
                            after229=after();

                            state._fsp--;

                            adaptor.addChild(root_0, after229.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // msc_grammar.g:284:4: after
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_after_in_generalOrdering1912);
                    after230=after();

                    state._fsp--;

                    adaptor.addChild(root_0, after230.getTree());

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
    // msc_grammar.g:286:1: before : 'before' orderDestList -> ^( Before orderDestList ) ;
    public final msc_grammarParser.before_return before() throws RecognitionException {
        msc_grammarParser.before_return retval = new msc_grammarParser.before_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal231=null;
        msc_grammarParser.orderDestList_return orderDestList232 = null;


        CommonTree string_literal231_tree=null;
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_orderDestList=new RewriteRuleSubtreeStream(adaptor,"rule orderDestList");
        try {
            // msc_grammar.g:286:9: ( 'before' orderDestList -> ^( Before orderDestList ) )
            // msc_grammar.g:286:11: 'before' orderDestList
            {
            string_literal231=(Token)match(input,101,FOLLOW_101_in_before1922);  
            stream_101.add(string_literal231);

            pushFollow(FOLLOW_orderDestList_in_before1924);
            orderDestList232=orderDestList();

            state._fsp--;

            stream_orderDestList.add(orderDestList232.getTree());


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
            // 286:34: -> ^( Before orderDestList )
            {
                // msc_grammar.g:286:37: ^( Before orderDestList )
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
    // msc_grammar.g:288:1: after : 'after' orderDestList -> ^( After orderDestList ) ;
    public final msc_grammarParser.after_return after() throws RecognitionException {
        msc_grammarParser.after_return retval = new msc_grammarParser.after_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal233=null;
        msc_grammarParser.orderDestList_return orderDestList234 = null;


        CommonTree string_literal233_tree=null;
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_orderDestList=new RewriteRuleSubtreeStream(adaptor,"rule orderDestList");
        try {
            // msc_grammar.g:288:8: ( 'after' orderDestList -> ^( After orderDestList ) )
            // msc_grammar.g:288:10: 'after' orderDestList
            {
            string_literal233=(Token)match(input,102,FOLLOW_102_in_after1944);  
            stream_102.add(string_literal233);

            pushFollow(FOLLOW_orderDestList_in_after1946);
            orderDestList234=orderDestList();

            state._fsp--;

            stream_orderDestList.add(orderDestList234.getTree());


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
            // 288:32: -> ^( After orderDestList )
            {
                // msc_grammar.g:288:35: ^( After orderDestList )
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
    // msc_grammar.g:292:1: mscReference : 'reference' mscRefExpr -> ^( Ref mscRefExpr ) ;
    public final msc_grammarParser.mscReference_return mscReference() throws RecognitionException {
        msc_grammarParser.mscReference_return retval = new msc_grammarParser.mscReference_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal235=null;
        msc_grammarParser.mscRefExpr_return mscRefExpr236 = null;


        CommonTree string_literal235_tree=null;
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleSubtreeStream stream_mscRefExpr=new RewriteRuleSubtreeStream(adaptor,"rule mscRefExpr");
        try {
            // msc_grammar.g:293:2: ( 'reference' mscRefExpr -> ^( Ref mscRefExpr ) )
            // msc_grammar.g:293:4: 'reference' mscRefExpr
            {
            string_literal235=(Token)match(input,105,FOLLOW_105_in_mscReference1970);  
            stream_105.add(string_literal235);

            pushFollow(FOLLOW_mscRefExpr_in_mscReference1972);
            mscRefExpr236=mscRefExpr();

            state._fsp--;

            stream_mscRefExpr.add(mscRefExpr236.getTree());


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
            // 293:27: -> ^( Ref mscRefExpr )
            {
                // msc_grammar.g:293:30: ^( Ref mscRefExpr )
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
    // msc_grammar.g:295:1: mscRefExpr : ( name | characterString );
    public final msc_grammarParser.mscRefExpr_return mscRefExpr() throws RecognitionException {
        msc_grammarParser.mscRefExpr_return retval = new msc_grammarParser.mscRefExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.name_return name237 = null;

        msc_grammarParser.characterString_return characterString238 = null;



        try {
            // msc_grammar.g:296:2: ( name | characterString )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==NAME) ) {
                alt64=1;
            }
            else if ( (LA64_0==CHARACTERSTRING) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // msc_grammar.g:296:4: name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_name_in_mscRefExpr1993);
                    name237=name();

                    state._fsp--;

                    adaptor.addChild(root_0, name237.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:296:11: characterString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_characterString_in_mscRefExpr1997);
                    characterString238=characterString();

                    state._fsp--;

                    adaptor.addChild(root_0, characterString238.getTree());

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
    // $ANTLR end "mscRefExpr"

    public static class mscName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mscName"
    // msc_grammar.g:299:1: mscName : NAME ;
    public final msc_grammarParser.mscName_return mscName() throws RecognitionException {
        msc_grammarParser.mscName_return retval = new msc_grammarParser.mscName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME239=null;

        CommonTree NAME239_tree=null;

        try {
            // msc_grammar.g:299:9: ( NAME )
            // msc_grammar.g:299:11: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME239=(Token)match(input,NAME,FOLLOW_NAME_in_mscName2008); 
            NAME239_tree = (CommonTree)adaptor.create(NAME239);
            adaptor.addChild(root_0, NAME239_tree);


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
    // msc_grammar.g:300:1: labelName : NAME ;
    public final msc_grammarParser.labelName_return labelName() throws RecognitionException {
        msc_grammarParser.labelName_return retval = new msc_grammarParser.labelName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME240=null;

        CommonTree NAME240_tree=null;

        try {
            // msc_grammar.g:301:2: ( NAME )
            // msc_grammar.g:301:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME240=(Token)match(input,NAME,FOLLOW_NAME_in_labelName2017); 
            NAME240_tree = (CommonTree)adaptor.create(NAME240);
            adaptor.addChild(root_0, NAME240_tree);


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
    // msc_grammar.g:302:1: name : NAME ;
    public final msc_grammarParser.name_return name() throws RecognitionException {
        msc_grammarParser.name_return retval = new msc_grammarParser.name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME241=null;

        CommonTree NAME241_tree=null;

        try {
            // msc_grammar.g:302:7: ( NAME )
            // msc_grammar.g:302:9: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME241=(Token)match(input,NAME,FOLLOW_NAME_in_name2025); 
            NAME241_tree = (CommonTree)adaptor.create(NAME241);
            adaptor.addChild(root_0, NAME241_tree);


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
    // msc_grammar.g:303:1: instanceName : NAME ;
    public final msc_grammarParser.instanceName_return instanceName() throws RecognitionException {
        msc_grammarParser.instanceName_return retval = new msc_grammarParser.instanceName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME242=null;

        CommonTree NAME242_tree=null;

        try {
            // msc_grammar.g:304:2: ( NAME )
            // msc_grammar.g:304:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME242=(Token)match(input,NAME,FOLLOW_NAME_in_instanceName2034); 
            NAME242_tree = (CommonTree)adaptor.create(NAME242);
            adaptor.addChild(root_0, NAME242_tree);


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
    // msc_grammar.g:305:1: messageName : NAME ;
    public final msc_grammarParser.messageName_return messageName() throws RecognitionException {
        msc_grammarParser.messageName_return retval = new msc_grammarParser.messageName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME243=null;

        CommonTree NAME243_tree=null;

        try {
            // msc_grammar.g:306:2: ( NAME )
            // msc_grammar.g:306:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME243=(Token)match(input,NAME,FOLLOW_NAME_in_messageName2043); 
            NAME243_tree = (CommonTree)adaptor.create(NAME243);
            adaptor.addChild(root_0, NAME243_tree);


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

    public static class gateName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "gateName"
    // msc_grammar.g:307:1: gateName : NAME ;
    public final msc_grammarParser.gateName_return gateName() throws RecognitionException {
        msc_grammarParser.gateName_return retval = new msc_grammarParser.gateName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME244=null;

        CommonTree NAME244_tree=null;

        try {
            // msc_grammar.g:308:2: ( NAME )
            // msc_grammar.g:308:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME244=(Token)match(input,NAME,FOLLOW_NAME_in_gateName2052); 
            NAME244_tree = (CommonTree)adaptor.create(NAME244);
            adaptor.addChild(root_0, NAME244_tree);


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
    // msc_grammar.g:309:1: eventName : NAME ;
    public final msc_grammarParser.eventName_return eventName() throws RecognitionException {
        msc_grammarParser.eventName_return retval = new msc_grammarParser.eventName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME245=null;

        CommonTree NAME245_tree=null;

        try {
            // msc_grammar.g:310:2: ( NAME )
            // msc_grammar.g:310:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME245=(Token)match(input,NAME,FOLLOW_NAME_in_eventName2061); 
            NAME245_tree = (CommonTree)adaptor.create(NAME245);
            adaptor.addChild(root_0, NAME245_tree);


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
    // msc_grammar.g:311:1: characterString : CHARACTERSTRING ;
    public final msc_grammarParser.characterString_return characterString() throws RecognitionException {
        msc_grammarParser.characterString_return retval = new msc_grammarParser.characterString_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CHARACTERSTRING246=null;

        CommonTree CHARACTERSTRING246_tree=null;

        try {
            // msc_grammar.g:312:2: ( CHARACTERSTRING )
            // msc_grammar.g:312:4: CHARACTERSTRING
            {
            root_0 = (CommonTree)adaptor.nil();

            CHARACTERSTRING246=(Token)match(input,CHARACTERSTRING,FOLLOW_CHARACTERSTRING_in_characterString2070); 
            CHARACTERSTRING246_tree = (CommonTree)adaptor.create(CHARACTERSTRING246);
            adaptor.addChild(root_0, CHARACTERSTRING246_tree);


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
    // msc_grammar.g:314:1: identifier : NAME ;
    public final msc_grammarParser.identifier_return identifier() throws RecognitionException {
        msc_grammarParser.identifier_return retval = new msc_grammarParser.identifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME247=null;

        CommonTree NAME247_tree=null;

        try {
            // msc_grammar.g:315:2: ( NAME )
            // msc_grammar.g:315:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME247=(Token)match(input,NAME,FOLLOW_NAME_in_identifier2080); 
            NAME247_tree = (CommonTree)adaptor.create(NAME247);
            adaptor.addChild(root_0, NAME247_tree);


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

    public static class expressionString_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionString"
    // msc_grammar.g:319:1: expressionString : NAME ;
    public final msc_grammarParser.expressionString_return expressionString() throws RecognitionException {
        msc_grammarParser.expressionString_return retval = new msc_grammarParser.expressionString_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME248=null;

        CommonTree NAME248_tree=null;

        try {
            // msc_grammar.g:320:2: ( NAME )
            // msc_grammar.g:320:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME248=(Token)match(input,NAME,FOLLOW_NAME_in_expressionString2094); 
            NAME248_tree = (CommonTree)adaptor.create(NAME248);
            adaptor.addChild(root_0, NAME248_tree);


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

    public static class dataTypeName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dataTypeName"
    // msc_grammar.g:325:1: dataTypeName : NAME ;
    public final msc_grammarParser.dataTypeName_return dataTypeName() throws RecognitionException {
        msc_grammarParser.dataTypeName_return retval = new msc_grammarParser.dataTypeName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME249=null;

        CommonTree NAME249_tree=null;

        try {
            // msc_grammar.g:326:2: ( NAME )
            // msc_grammar.g:326:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME249=(Token)match(input,NAME,FOLLOW_NAME_in_dataTypeName2107); 
            NAME249_tree = (CommonTree)adaptor.create(NAME249);
            adaptor.addChild(root_0, NAME249_tree);


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
    // msc_grammar.g:327:1: datatypeTypeExpression : NAME ;
    public final msc_grammarParser.datatypeTypeExpression_return datatypeTypeExpression() throws RecognitionException {
        msc_grammarParser.datatypeTypeExpression_return retval = new msc_grammarParser.datatypeTypeExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME250=null;

        CommonTree NAME250_tree=null;

        try {
            // msc_grammar.g:328:2: ( NAME )
            // msc_grammar.g:328:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME250=(Token)match(input,NAME,FOLLOW_NAME_in_datatypeTypeExpression2115); 
            NAME250_tree = (CommonTree)adaptor.create(NAME250);
            adaptor.addChild(root_0, NAME250_tree);


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
    // msc_grammar.g:329:1: literalNameOrNumber : NAME ;
    public final msc_grammarParser.literalNameOrNumber_return literalNameOrNumber() throws RecognitionException {
        msc_grammarParser.literalNameOrNumber_return retval = new msc_grammarParser.literalNameOrNumber_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME251=null;

        CommonTree NAME251_tree=null;

        try {
            // msc_grammar.g:330:2: ( NAME )
            // msc_grammar.g:330:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME251=(Token)match(input,NAME,FOLLOW_NAME_in_literalNameOrNumber2123); 
            NAME251_tree = (CommonTree)adaptor.create(NAME251);
            adaptor.addChild(root_0, NAME251_tree);


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
    // msc_grammar.g:331:1: naturalSimpleExpression : NAME ;
    public final msc_grammarParser.naturalSimpleExpression_return naturalSimpleExpression() throws RecognitionException {
        msc_grammarParser.naturalSimpleExpression_return retval = new msc_grammarParser.naturalSimpleExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME252=null;

        CommonTree NAME252_tree=null;

        try {
            // msc_grammar.g:332:2: ( NAME )
            // msc_grammar.g:332:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME252=(Token)match(input,NAME,FOLLOW_NAME_in_naturalSimpleExpression2131); 
            NAME252_tree = (CommonTree)adaptor.create(NAME252);
            adaptor.addChild(root_0, NAME252_tree);


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
    // msc_grammar.g:333:1: fieldName : NAME ;
    public final msc_grammarParser.fieldName_return fieldName() throws RecognitionException {
        msc_grammarParser.fieldName_return retval = new msc_grammarParser.fieldName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME253=null;

        CommonTree NAME253_tree=null;

        try {
            // msc_grammar.g:334:2: ( NAME )
            // msc_grammar.g:334:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME253=(Token)match(input,NAME,FOLLOW_NAME_in_fieldName2139); 
            NAME253_tree = (CommonTree)adaptor.create(NAME253);
            adaptor.addChild(root_0, NAME253_tree);


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
    // msc_grammar.g:336:1: constantExpression : NAME ;
    public final msc_grammarParser.constantExpression_return constantExpression() throws RecognitionException {
        msc_grammarParser.constantExpression_return retval = new msc_grammarParser.constantExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME254=null;

        CommonTree NAME254_tree=null;

        try {
            // msc_grammar.g:337:2: ( NAME )
            // msc_grammar.g:337:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME254=(Token)match(input,NAME,FOLLOW_NAME_in_constantExpression2149); 
            NAME254_tree = (CommonTree)adaptor.create(NAME254);
            adaptor.addChild(root_0, NAME254_tree);


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


 

    public static final BitSet FOLLOW_messageSequenceChart_in_msc182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_messageSequenceChart194 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_mscHead_in_messageSequenceChart196 = new BitSet(new long[]{0x0000420000000000L});
    public static final BitSet FOLLOW_body_in_messageSequenceChart198 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_messageSequenceChart200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_end_in_messageSequenceChart202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscName_in_mscHead225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_end_in_mscHead227 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000800L});
    public static final BitSet FOLLOW_mscInterface_in_mscHead231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscBody_in_body261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscStatement_in_mscBody274 = new BitSet(new long[]{0x0000420000000002L});
    public static final BitSet FOLLOW_eventDefinition_in_mscStatement299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceName_in_eventDefinition311 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_eventDefinition313 = new BitSet(new long[]{0x8000400000000000L,0x0000008CC8000705L});
    public static final BitSet FOLLOW_instanceEventList_in_eventDefinition315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceNameList_in_eventDefinition333 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_eventDefinition335 = new BitSet(new long[]{0x0000000000000000L,0x00000200007E0000L});
    public static final BitSet FOLLOW_multiInstanceEventList_in_eventDefinition337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceEvent_in_instanceEventList364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_end_in_instanceEventList366 = new BitSet(new long[]{0x8000400000000002L,0x0000008CC8000705L});
    public static final BitSet FOLLOW_orderableEvent_in_instanceEvent387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonOrderableEvent_in_instanceEvent391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_label_in_orderableEvent403 = new BitSet(new long[]{0x8000400000000000L,0x0000000C88000105L});
    public static final BitSet FOLLOW_messageEvent_in_orderableEvent408 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000000L});
    public static final BitSet FOLLOW_action_in_orderableEvent412 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000000L});
    public static final BitSet FOLLOW_create_in_orderableEvent416 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000000L});
    public static final BitSet FOLLOW_timerStatement_in_orderableEvent420 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000000L});
    public static final BitSet FOLLOW_generalOrdering_in_orderableEvent424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceHeadStatement_in_nonOrderableEvent437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceEndStatement_in_nonOrderableEvent441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stop_in_nonOrderableEvent445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coregion_in_nonOrderableEvent449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceName_in_instanceNameList462 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_instanceNameList466 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_instanceName_in_instanceNameList468 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ALL_in_instanceNameList488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiInstanceEvent_in_multiInstanceEventList513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_end_in_multiInstanceEventList515 = new BitSet(new long[]{0x0000000000000002L,0x00000200007E0000L});
    public static final BitSet FOLLOW_condition_in_multiInstanceEvent536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscReference_in_multiInstanceEvent540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inlineExpr_in_multiInstanceEvent544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eventName_in_label558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_label562 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_eventName_in_label564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_end_in_label566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_messageEvent591 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_msgIdentification_in_messageEvent593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_messageEvent595 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000050L});
    public static final BitSet FOLLOW_messageReceiver_in_messageEvent597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_messageEvent614 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_msgIdentification_in_messageEvent616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_messageEvent618 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_messageSender_in_messageEvent620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inputAddress_in_messageReceiver646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_messageReceiver657 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_inputAddress_in_messageReceiver661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_outputAddress_in_messageSender683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_messageSender694 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_outputAddress_in_messageSender698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_messageName_in_msgIdentification721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characterString_in_msgIdentification725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceName_in_outputAddress737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_outputAddress742 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_outputAddress746 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_gateName_in_outputAddress748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceName_in_inputAddress775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_inputAddress780 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_inputAddress784 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_gateName_in_inputAddress786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_action812 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_actionStatement_in_action814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_informalAction_in_actionStatement829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_informalAction850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characterString_in_informalAction854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_instanceHeadStatement867 = new BitSet(new long[]{0x0000400000000002L,0x000000000000F000L});
    public static final BitSet FOLLOW_instanceKind_in_instanceHeadStatement871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_instanceEndStatement887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscInstInterface_in_mscInterface899 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000800L});
    public static final BitSet FOLLOW_mscGateInterface_in_mscInterface903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscGateInterface_in_mscInterface910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_mscInstInterface923 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_instanceList_in_mscInstInterface925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_end_in_mscInstInterface927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceName_in_instanceList940 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_61_in_instanceList944 = new BitSet(new long[]{0x0000400000000000L,0x000000000000F000L});
    public static final BitSet FOLLOW_instanceKind_in_instanceList946 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_instanceList953 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_instanceList_in_instanceList955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kindDenominator_in_instanceKind973 = new BitSet(new long[]{0x0000400000000000L,0x000000000000F000L});
    public static final BitSet FOLLOW_identifier_in_instanceKind978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_kindDenominator991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_kindDenominator995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_kindDenominator999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_kindDenominator1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_kindDenominator1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_end1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionIdentification_in_condition1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_conditionIdentification1042 = new BitSet(new long[]{0x0000CC0000000000L});
    public static final BitSet FOLLOW_conditionText_in_conditionIdentification1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionNameList_in_conditionText1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHEN_in_conditionText1077 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_conditionNameList_in_conditionText1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OTHERWISE_in_conditionText1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_conditionNameList1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characterString_in_conditionNameList1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loopExpr_in_inlineExpr1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optExpr_in_inlineExpr1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_altExpr_in_inlineExpr1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpr_in_inlineExpr1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_excExpr_in_inlineExpr1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_loopExpr1152 = new BitSet(new long[]{0x0000100000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_loopBoundary_in_loopExpr1156 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_BEGIN_in_loopExpr1161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_end_in_loopExpr1163 = new BitSet(new long[]{0x0000420000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_mscBody_in_loopExpr1165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_loopExpr1167 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_END_in_loopExpr1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_optExpr1191 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_BEGIN_in_optExpr1193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_end_in_optExpr1195 = new BitSet(new long[]{0x0000420000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_mscBody_in_optExpr1197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_optExpr1199 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_END_in_optExpr1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_excExpr1220 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_BEGIN_in_excExpr1222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_end_in_excExpr1224 = new BitSet(new long[]{0x0000420000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_mscBody_in_excExpr1226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_excExpr1228 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_END_in_excExpr1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_altExpr1249 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_BEGIN_in_altExpr1251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_end_in_altExpr1253 = new BitSet(new long[]{0x0000420000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_mscBody_in_altExpr1255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_altExpr1259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_end_in_altExpr1261 = new BitSet(new long[]{0x0000420000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_mscBody_in_altExpr1263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_altExpr1268 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_END_in_altExpr1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_parExpr1290 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_BEGIN_in_parExpr1292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_end_in_parExpr1294 = new BitSet(new long[]{0x0000420000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_mscBody_in_parExpr1296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_parExpr1300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_end_in_parExpr1302 = new BitSet(new long[]{0x0000420000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_mscBody_in_parExpr1304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_parExpr1309 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_END_in_parExpr1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_loopBoundary1332 = new BitSet(new long[]{0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_infNatural_in_loopBoundary1334 = new BitSet(new long[]{0x4000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_62_in_loopBoundary1338 = new BitSet(new long[]{0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_infNatural_in_loopBoundary1340 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_loopBoundary1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_infNatural1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_infNatural1371 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_expressionString_in_infNatural1373 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_infNatural1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_create1388 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_instanceName_in_create1390 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_create1394 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_msgIdentification_in_create1395 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_create1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_stop1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setTimer_in_timerStatement1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_resetTimer_in_timerStatement1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeout_in_timerStatement1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_setTimer1462 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_name_in_setTimer1464 = new BitSet(new long[]{0x4000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_62_in_setTimer1468 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_instanceName_in_setTimer1470 = new BitSet(new long[]{0x4000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_duration_in_setTimer1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_duration1510 = new BitSet(new long[]{0x4000000000000000L,0x0000000206000000L});
    public static final BitSet FOLLOW_infNatural_in_duration1514 = new BitSet(new long[]{0x4000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_62_in_duration1521 = new BitSet(new long[]{0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_infNatural_in_duration1523 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_duration1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_resetTimer1539 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_name_in_resetTimer1541 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_resetTimer1545 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_instanceName_in_resetTimer1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_timeout1572 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_name_in_timeout1574 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_timeout1578 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_instanceName_in_timeout1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscGateDef_in_mscGateInterface1610 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000800L});
    public static final BitSet FOLLOW_100_in_mscGateDef1622 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_msgGate_in_mscGateDef1626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_orderGate_in_mscGateDef1630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_end_in_mscGateDef1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defInGate_in_msgGate1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defOutGate_in_msgGate1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defOrderInGate_in_orderGate1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defOrderOutGate_in_orderGate1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gateName_in_defInGate1675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_defInGate1680 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_msgIdentification_in_defInGate1682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_defInGate1684 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000050L});
    public static final BitSet FOLLOW_inputDest_in_defInGate1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gateName_in_defOutGate1699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_defOutGate1704 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_msgIdentification_in_defOutGate1706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_defOutGate1708 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_outputDest_in_defOutGate1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gateName_in_defOrderInGate1721 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_defOrderInGate1723 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_orderDest_in_defOrderInGate1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gateName_in_defOrderOutGate1735 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_defOrderOutGate1739 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_orderDestList_in_defOrderOutGate1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_inputDest1756 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_inputAddress_in_inputDest1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inputAddress_in_inputDest1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_outputDest1778 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_outputAddress_in_outputDest1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_outputAddress_in_outputDest1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eventName_in_orderDest1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_orderDest1805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_orderDest1807 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_gateName_in_orderDest1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderDest_in_orderDestList1830 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_orderDestList1834 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_orderDestList_in_orderDestList1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_coregion1859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_end_in_coregion1861 = new BitSet(new long[]{0x8000400000000000L,0x0000010C88000105L});
    public static final BitSet FOLLOW_coevent_in_coregion1863 = new BitSet(new long[]{0x8000400000000000L,0x0000010C88000105L});
    public static final BitSet FOLLOW_104_in_coregion1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderableEvent_in_coevent1886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_end_in_coevent1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_before_in_generalOrdering1904 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000000L});
    public static final BitSet FOLLOW_after_in_generalOrdering1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_after_in_generalOrdering1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_before1922 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_orderDestList_in_before1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_after1944 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_orderDestList_in_after1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_mscReference1970 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_mscRefExpr_in_mscReference1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_mscRefExpr1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characterString_in_mscRefExpr1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_mscName2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_labelName2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_name2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_instanceName2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_messageName2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_gateName2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_eventName2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTERSTRING_in_characterString2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_identifier2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_expressionString2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_dataTypeName2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_datatypeTypeExpression2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_literalNameOrNumber2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_naturalSimpleExpression2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_fieldName2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_constantExpression2149 = new BitSet(new long[]{0x0000000000000002L});

}