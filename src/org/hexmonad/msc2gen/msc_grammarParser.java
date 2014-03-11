// $ANTLR 3.1.3 Mar 18, 2009 10:09:25 msc_grammar.g 2014-03-11 21:31:42
package org.hexmonad.msc2gen;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class msc_grammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MSC", "MSCHead", "MSCBody", "HMSCBody", "Instance", "InstanceList", "INameList", "ParameterList", "Label", "MSGIn", "MSGOut", "FullMsg", "IncompleteMsg", "Action", "DataAction", "Condition", "SetCond", "GuardCond", "DataGuardCond", "ElseCond", "Seq", "Alt", "Par", "Loop", "LoopBoundary", "Opt", "Exc", "Coregion", "Before", "After", "Ref", "Empty", "NodeExpr", "Start", "Create", "Terminate", "StartTimer", "StopTimer", "Timeout", "MsgGate", "ALL", "WHEN", "OTHERWISE", "NAME", "BEGIN", "END", "CHARACTERSTRING", "LEFTBINDSYMBOL", "RIGHTBINDSYMBOL", "LETTER", "DECIMALDIGIT", "UNDERLINE", "FULLSTOP", "APOSTROPHE", "ALPHANUMERIC", "OTHERCHARACTER", "SPECIAL", "WS", "'msc'", "'endmsc'", "':'", "','", "'label'", "'out'", "'to'", "'in'", "'from'", "'lost'", "'found'", "'env'", "'via'", "'action'", "'instance'", "'endinstance'", "'inst'", "'system'", "'block'", "'process'", "'service'", "';'", "'condition'", "'('", "')'", "'loop'", "'opt'", "'exc'", "'alt'", "'par'", "'<'", "'>'", "'inf'", "'\"'", "'create'", "'stop'", "'starttimer'", "'['", "']'", "'stoptimer'", "'timeout'", "'gate'", "'before'", "'after'", "'concurrent'", "'endconcurrent'", "'reference'", "'seq'", "'empty'"
    };
    public static final int Condition=19;
    public static final int MsgGate=43;
    public static final int LETTER=53;
    public static final int Before=32;
    public static final int ElseCond=23;
    public static final int After=33;
    public static final int Empty=35;
    public static final int Coregion=31;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int FullMsg=15;
    public static final int NAME=47;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int MSCHead=5;
    public static final int BEGIN=48;
    public static final int FULLSTOP=56;
    public static final int MSGIn=13;
    public static final int APOSTROPHE=57;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int OTHERWISE=46;
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
    public static final int UNDERLINE=55;
    public static final int MSGOut=14;
    public static final int NodeExpr=36;
    public static final int WS=61;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int SPECIAL=60;
    public static final int T__70=70;
    public static final int Par=26;
    public static final int DataGuardCond=22;
    public static final int END=49;
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
    public static final int T__66=66;
    public static final int Timeout=42;
    public static final int T__67=67;
    public static final int Alt=25;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int Opt=29;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int LEFTBINDSYMBOL=51;
    public static final int StopTimer=41;
    public static final int RIGHTBINDSYMBOL=52;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int ALPHANUMERIC=58;
    public static final int T__103=103;
    public static final int ALL=44;
    public static final int T__104=104;
    public static final int MSC=4;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__110=110;
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
    public static final int WHEN=45;
    public static final int HMSCBody=7;
    public static final int GuardCond=21;
    public static final int CHARACTERSTRING=50;
    public static final int ParameterList=11;
    public static final int DECIMALDIGIT=54;
    public static final int SetCond=20;
    public static final int StartTimer=40;
    public static final int OTHERCHARACTER=59;

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
    // msc_grammar.g:51:1: msc : messageSequenceChart ;
    public final msc_grammarParser.msc_return msc() throws RecognitionException {
        msc_grammarParser.msc_return retval = new msc_grammarParser.msc_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.messageSequenceChart_return messageSequenceChart1 = null;



        try {
            // msc_grammar.g:51:6: ( messageSequenceChart )
            // msc_grammar.g:51:8: messageSequenceChart
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_messageSequenceChart_in_msc194);
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
    // msc_grammar.g:54:1: messageSequenceChart : 'msc' mscHead body 'endmsc' end -> ^( MSC mscHead body ) ;
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
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_mscHead=new RewriteRuleSubtreeStream(adaptor,"rule mscHead");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:55:2: ( 'msc' mscHead body 'endmsc' end -> ^( MSC mscHead body ) )
            // msc_grammar.g:55:4: 'msc' mscHead body 'endmsc' end
            {
            string_literal2=(Token)match(input,62,FOLLOW_62_in_messageSequenceChart206);  
            stream_62.add(string_literal2);

            pushFollow(FOLLOW_mscHead_in_messageSequenceChart208);
            mscHead3=mscHead();

            state._fsp--;

            stream_mscHead.add(mscHead3.getTree());
            pushFollow(FOLLOW_body_in_messageSequenceChart210);
            body4=body();

            state._fsp--;

            stream_body.add(body4.getTree());
            string_literal5=(Token)match(input,63,FOLLOW_63_in_messageSequenceChart212);  
            stream_63.add(string_literal5);

            pushFollow(FOLLOW_end_in_messageSequenceChart214);
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
            // 55:36: -> ^( MSC mscHead body )
            {
                // msc_grammar.g:55:39: ^( MSC mscHead body )
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
    // msc_grammar.g:58:1: mscHead : mscName end ( mscInterface )? -> ^( MSCHead mscName ( mscInterface )? ) ;
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
            // msc_grammar.g:58:9: ( mscName end ( mscInterface )? -> ^( MSCHead mscName ( mscInterface )? ) )
            // msc_grammar.g:58:11: mscName end ( mscInterface )?
            {
            pushFollow(FOLLOW_mscName_in_mscHead237);
            mscName7=mscName();

            state._fsp--;

            stream_mscName.add(mscName7.getTree());
            pushFollow(FOLLOW_end_in_mscHead239);
            end8=end();

            state._fsp--;

            stream_end.add(end8.getTree());
            // msc_grammar.g:58:23: ( mscInterface )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==78||LA1_0==103) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // msc_grammar.g:58:25: mscInterface
                    {
                    pushFollow(FOLLOW_mscInterface_in_mscHead243);
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
            // 58:41: -> ^( MSCHead mscName ( mscInterface )? )
            {
                // msc_grammar.g:58:44: ^( MSCHead mscName ( mscInterface )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MSCHead, "MSCHead"), root_1);

                adaptor.addChild(root_1, stream_mscName.nextTree());
                // msc_grammar.g:58:63: ( mscInterface )?
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
    // msc_grammar.g:61:1: body : ( mscBody ) ;
    public final msc_grammarParser.body_return body() throws RecognitionException {
        msc_grammarParser.body_return retval = new msc_grammarParser.body_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.mscBody_return mscBody10 = null;



        try {
            // msc_grammar.g:61:7: ( ( mscBody ) )
            // msc_grammar.g:61:9: ( mscBody )
            {
            root_0 = (CommonTree)adaptor.nil();

            // msc_grammar.g:61:9: ( mscBody )
            // msc_grammar.g:61:11: mscBody
            {
            pushFollow(FOLLOW_mscBody_in_body273);
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
    // msc_grammar.g:64:1: mscBody : ( mscStatement )* -> ^( MSCBody ( mscStatement )* ) ;
    public final msc_grammarParser.mscBody_return mscBody() throws RecognitionException {
        msc_grammarParser.mscBody_return retval = new msc_grammarParser.mscBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.mscStatement_return mscStatement11 = null;


        RewriteRuleSubtreeStream stream_mscStatement=new RewriteRuleSubtreeStream(adaptor,"rule mscStatement");
        try {
            // msc_grammar.g:64:9: ( ( mscStatement )* -> ^( MSCBody ( mscStatement )* ) )
            // msc_grammar.g:64:11: ( mscStatement )*
            {
            // msc_grammar.g:64:11: ( mscStatement )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ALL||LA2_0==NAME) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // msc_grammar.g:64:11: mscStatement
            	    {
            	    pushFollow(FOLLOW_mscStatement_in_mscBody286);
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
            // 64:25: -> ^( MSCBody ( mscStatement )* )
            {
                // msc_grammar.g:64:28: ^( MSCBody ( mscStatement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MSCBody, "MSCBody"), root_1);

                // msc_grammar.g:64:39: ( mscStatement )*
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
    // msc_grammar.g:67:1: mscStatement : eventDefinition ;
    public final msc_grammarParser.mscStatement_return mscStatement() throws RecognitionException {
        msc_grammarParser.mscStatement_return retval = new msc_grammarParser.mscStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.eventDefinition_return eventDefinition12 = null;



        try {
            // msc_grammar.g:68:2: ( eventDefinition )
            // msc_grammar.g:68:4: eventDefinition
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_eventDefinition_in_mscStatement311);
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
    // msc_grammar.g:71:1: eventDefinition : ( instanceName ':' instanceEventList -> ^( Instance instanceName instanceEventList ) | instanceNameList ':' multiInstanceEventList -> ^( InstanceList instanceNameList multiInstanceEventList ) );
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
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleSubtreeStream stream_instanceName=new RewriteRuleSubtreeStream(adaptor,"rule instanceName");
        RewriteRuleSubtreeStream stream_instanceEventList=new RewriteRuleSubtreeStream(adaptor,"rule instanceEventList");
        RewriteRuleSubtreeStream stream_instanceNameList=new RewriteRuleSubtreeStream(adaptor,"rule instanceNameList");
        RewriteRuleSubtreeStream stream_multiInstanceEventList=new RewriteRuleSubtreeStream(adaptor,"rule multiInstanceEventList");
        try {
            // msc_grammar.g:72:2: ( instanceName ':' instanceEventList -> ^( Instance instanceName instanceEventList ) | instanceNameList ':' multiInstanceEventList -> ^( InstanceList instanceNameList multiInstanceEventList ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==NAME) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==64) ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==NAME||(LA3_3>=66 && LA3_3<=67)||LA3_3==69||(LA3_3>=75 && LA3_3<=77)||(LA3_3>=96 && LA3_3<=98)||(LA3_3>=101 && LA3_3<=102)||LA3_3==106) ) {
                        alt3=1;
                    }
                    else if ( (LA3_3==84||(LA3_3>=87 && LA3_3<=91)||LA3_3==108) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA3_1==65) ) {
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
                    // msc_grammar.g:72:4: instanceName ':' instanceEventList
                    {
                    pushFollow(FOLLOW_instanceName_in_eventDefinition323);
                    instanceName13=instanceName();

                    state._fsp--;

                    stream_instanceName.add(instanceName13.getTree());
                    char_literal14=(Token)match(input,64,FOLLOW_64_in_eventDefinition325);  
                    stream_64.add(char_literal14);

                    pushFollow(FOLLOW_instanceEventList_in_eventDefinition327);
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
                    // 72:39: -> ^( Instance instanceName instanceEventList )
                    {
                        // msc_grammar.g:72:42: ^( Instance instanceName instanceEventList )
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
                    // msc_grammar.g:73:4: instanceNameList ':' multiInstanceEventList
                    {
                    pushFollow(FOLLOW_instanceNameList_in_eventDefinition345);
                    instanceNameList16=instanceNameList();

                    state._fsp--;

                    stream_instanceNameList.add(instanceNameList16.getTree());
                    char_literal17=(Token)match(input,64,FOLLOW_64_in_eventDefinition347);  
                    stream_64.add(char_literal17);

                    pushFollow(FOLLOW_multiInstanceEventList_in_eventDefinition349);
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
                    // 73:48: -> ^( InstanceList instanceNameList multiInstanceEventList )
                    {
                        // msc_grammar.g:73:51: ^( InstanceList instanceNameList multiInstanceEventList )
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
    // msc_grammar.g:76:1: instanceEventList : ( instanceEvent end )+ -> ( instanceEvent )+ ;
    public final msc_grammarParser.instanceEventList_return instanceEventList() throws RecognitionException {
        msc_grammarParser.instanceEventList_return retval = new msc_grammarParser.instanceEventList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.instanceEvent_return instanceEvent19 = null;

        msc_grammarParser.end_return end20 = null;


        RewriteRuleSubtreeStream stream_instanceEvent=new RewriteRuleSubtreeStream(adaptor,"rule instanceEvent");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:77:2: ( ( instanceEvent end )+ -> ( instanceEvent )+ )
            // msc_grammar.g:77:4: ( instanceEvent end )+
            {
            // msc_grammar.g:77:4: ( instanceEvent end )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==NAME) ) {
                    int LA4_2 = input.LA(2);

                    if ( (LA4_2==67||LA4_2==69||LA4_2==75||LA4_2==96||LA4_2==98||(LA4_2>=101 && LA4_2<=102)) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>=66 && LA4_0<=67)||LA4_0==69||(LA4_0>=75 && LA4_0<=77)||(LA4_0>=96 && LA4_0<=98)||(LA4_0>=101 && LA4_0<=102)||LA4_0==106) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // msc_grammar.g:77:6: instanceEvent end
            	    {
            	    pushFollow(FOLLOW_instanceEvent_in_instanceEventList376);
            	    instanceEvent19=instanceEvent();

            	    state._fsp--;

            	    stream_instanceEvent.add(instanceEvent19.getTree());
            	    pushFollow(FOLLOW_end_in_instanceEventList378);
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
            // 77:27: -> ( instanceEvent )+
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
    // msc_grammar.g:80:1: instanceEvent : ( orderableEvent | nonOrderableEvent );
    public final msc_grammarParser.instanceEvent_return instanceEvent() throws RecognitionException {
        msc_grammarParser.instanceEvent_return retval = new msc_grammarParser.instanceEvent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.orderableEvent_return orderableEvent21 = null;

        msc_grammarParser.nonOrderableEvent_return nonOrderableEvent22 = null;



        try {
            // msc_grammar.g:81:2: ( orderableEvent | nonOrderableEvent )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==NAME||(LA5_0>=66 && LA5_0<=67)||LA5_0==69||LA5_0==75||LA5_0==96||LA5_0==98||(LA5_0>=101 && LA5_0<=102)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=76 && LA5_0<=77)||LA5_0==97||LA5_0==106) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // msc_grammar.g:81:4: orderableEvent
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_orderableEvent_in_instanceEvent399);
                    orderableEvent21=orderableEvent();

                    state._fsp--;

                    adaptor.addChild(root_0, orderableEvent21.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:81:21: nonOrderableEvent
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_nonOrderableEvent_in_instanceEvent403);
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
    // msc_grammar.g:84:1: orderableEvent : ( label )? ( messageEvent | action | create | timerStatement ) ( generalOrdering )? ;
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
            // msc_grammar.g:85:2: ( ( label )? ( messageEvent | action | create | timerStatement ) ( generalOrdering )? )
            // msc_grammar.g:85:4: ( label )? ( messageEvent | action | create | timerStatement ) ( generalOrdering )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // msc_grammar.g:85:4: ( label )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==NAME||LA6_0==66) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // msc_grammar.g:85:4: label
                    {
                    pushFollow(FOLLOW_label_in_orderableEvent415);
                    label23=label();

                    state._fsp--;

                    adaptor.addChild(root_0, label23.getTree());

                    }
                    break;

            }

            // msc_grammar.g:85:11: ( messageEvent | action | create | timerStatement )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 67:
            case 69:
                {
                alt7=1;
                }
                break;
            case 75:
                {
                alt7=2;
                }
                break;
            case 96:
                {
                alt7=3;
                }
                break;
            case 98:
            case 101:
            case 102:
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
                    // msc_grammar.g:85:13: messageEvent
                    {
                    pushFollow(FOLLOW_messageEvent_in_orderableEvent420);
                    messageEvent24=messageEvent();

                    state._fsp--;

                    adaptor.addChild(root_0, messageEvent24.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:85:28: action
                    {
                    pushFollow(FOLLOW_action_in_orderableEvent424);
                    action25=action();

                    state._fsp--;

                    adaptor.addChild(root_0, action25.getTree());

                    }
                    break;
                case 3 :
                    // msc_grammar.g:85:37: create
                    {
                    pushFollow(FOLLOW_create_in_orderableEvent428);
                    create26=create();

                    state._fsp--;

                    adaptor.addChild(root_0, create26.getTree());

                    }
                    break;
                case 4 :
                    // msc_grammar.g:85:46: timerStatement
                    {
                    pushFollow(FOLLOW_timerStatement_in_orderableEvent432);
                    timerStatement27=timerStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, timerStatement27.getTree());

                    }
                    break;

            }

            // msc_grammar.g:85:63: ( generalOrdering )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=104 && LA8_0<=105)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // msc_grammar.g:85:63: generalOrdering
                    {
                    pushFollow(FOLLOW_generalOrdering_in_orderableEvent436);
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
    // msc_grammar.g:88:1: nonOrderableEvent : ( instanceHeadStatement | instanceEndStatement | stop | coregion );
    public final msc_grammarParser.nonOrderableEvent_return nonOrderableEvent() throws RecognitionException {
        msc_grammarParser.nonOrderableEvent_return retval = new msc_grammarParser.nonOrderableEvent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.instanceHeadStatement_return instanceHeadStatement29 = null;

        msc_grammarParser.instanceEndStatement_return instanceEndStatement30 = null;

        msc_grammarParser.stop_return stop31 = null;

        msc_grammarParser.coregion_return coregion32 = null;



        try {
            // msc_grammar.g:89:2: ( instanceHeadStatement | instanceEndStatement | stop | coregion )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt9=1;
                }
                break;
            case 77:
                {
                alt9=2;
                }
                break;
            case 97:
                {
                alt9=3;
                }
                break;
            case 106:
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
                    // msc_grammar.g:89:4: instanceHeadStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_instanceHeadStatement_in_nonOrderableEvent449);
                    instanceHeadStatement29=instanceHeadStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, instanceHeadStatement29.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:89:28: instanceEndStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_instanceEndStatement_in_nonOrderableEvent453);
                    instanceEndStatement30=instanceEndStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, instanceEndStatement30.getTree());

                    }
                    break;
                case 3 :
                    // msc_grammar.g:89:51: stop
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_stop_in_nonOrderableEvent457);
                    stop31=stop();

                    state._fsp--;

                    adaptor.addChild(root_0, stop31.getTree());

                    }
                    break;
                case 4 :
                    // msc_grammar.g:89:58: coregion
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_coregion_in_nonOrderableEvent461);
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
    // msc_grammar.g:92:1: instanceNameList : ( instanceName ( ',' instanceName )* -> ^( INameList ( instanceName )+ ) | ALL -> ^( INameList ALL ) );
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
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_ALL=new RewriteRuleTokenStream(adaptor,"token ALL");
        RewriteRuleSubtreeStream stream_instanceName=new RewriteRuleSubtreeStream(adaptor,"rule instanceName");
        try {
            // msc_grammar.g:93:2: ( instanceName ( ',' instanceName )* -> ^( INameList ( instanceName )+ ) | ALL -> ^( INameList ALL ) )
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
                    // msc_grammar.g:93:4: instanceName ( ',' instanceName )*
                    {
                    pushFollow(FOLLOW_instanceName_in_instanceNameList474);
                    instanceName33=instanceName();

                    state._fsp--;

                    stream_instanceName.add(instanceName33.getTree());
                    // msc_grammar.g:93:17: ( ',' instanceName )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==65) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // msc_grammar.g:93:19: ',' instanceName
                    	    {
                    	    char_literal34=(Token)match(input,65,FOLLOW_65_in_instanceNameList478);  
                    	    stream_65.add(char_literal34);

                    	    pushFollow(FOLLOW_instanceName_in_instanceNameList480);
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
                    // 93:39: -> ^( INameList ( instanceName )+ )
                    {
                        // msc_grammar.g:93:42: ^( INameList ( instanceName )+ )
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
                    // msc_grammar.g:94:5: ALL
                    {
                    ALL36=(Token)match(input,ALL,FOLLOW_ALL_in_instanceNameList500);  
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
                    // 94:9: -> ^( INameList ALL )
                    {
                        // msc_grammar.g:94:12: ^( INameList ALL )
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
    // msc_grammar.g:97:1: multiInstanceEventList : ( multiInstanceEvent end )+ -> ( multiInstanceEvent )+ ;
    public final msc_grammarParser.multiInstanceEventList_return multiInstanceEventList() throws RecognitionException {
        msc_grammarParser.multiInstanceEventList_return retval = new msc_grammarParser.multiInstanceEventList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.multiInstanceEvent_return multiInstanceEvent37 = null;

        msc_grammarParser.end_return end38 = null;


        RewriteRuleSubtreeStream stream_multiInstanceEvent=new RewriteRuleSubtreeStream(adaptor,"rule multiInstanceEvent");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:98:2: ( ( multiInstanceEvent end )+ -> ( multiInstanceEvent )+ )
            // msc_grammar.g:98:4: ( multiInstanceEvent end )+
            {
            // msc_grammar.g:98:4: ( multiInstanceEvent end )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                switch ( input.LA(1) ) {
                case 87:
                    {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==BEGIN||LA12_2==92) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 88:
                    {
                    int LA12_3 = input.LA(2);

                    if ( (LA12_3==BEGIN) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 89:
                    {
                    int LA12_4 = input.LA(2);

                    if ( (LA12_4==BEGIN) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 90:
                    {
                    int LA12_5 = input.LA(2);

                    if ( (LA12_5==BEGIN) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 91:
                    {
                    int LA12_6 = input.LA(2);

                    if ( (LA12_6==BEGIN) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 84:
                case 108:
                    {
                    alt12=1;
                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // msc_grammar.g:98:6: multiInstanceEvent end
            	    {
            	    pushFollow(FOLLOW_multiInstanceEvent_in_multiInstanceEventList525);
            	    multiInstanceEvent37=multiInstanceEvent();

            	    state._fsp--;

            	    stream_multiInstanceEvent.add(multiInstanceEvent37.getTree());
            	    pushFollow(FOLLOW_end_in_multiInstanceEventList527);
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
            // 98:32: -> ( multiInstanceEvent )+
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
    // msc_grammar.g:101:1: multiInstanceEvent : ( condition | mscReference | inlineExpr );
    public final msc_grammarParser.multiInstanceEvent_return multiInstanceEvent() throws RecognitionException {
        msc_grammarParser.multiInstanceEvent_return retval = new msc_grammarParser.multiInstanceEvent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.condition_return condition39 = null;

        msc_grammarParser.mscReference_return mscReference40 = null;

        msc_grammarParser.inlineExpr_return inlineExpr41 = null;



        try {
            // msc_grammar.g:102:2: ( condition | mscReference | inlineExpr )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt13=1;
                }
                break;
            case 108:
                {
                alt13=2;
                }
                break;
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
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
                    // msc_grammar.g:102:4: condition
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_condition_in_multiInstanceEvent548);
                    condition39=condition();

                    state._fsp--;

                    adaptor.addChild(root_0, condition39.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:102:16: mscReference
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_mscReference_in_multiInstanceEvent552);
                    mscReference40=mscReference();

                    state._fsp--;

                    adaptor.addChild(root_0, mscReference40.getTree());

                    }
                    break;
                case 3 :
                    // msc_grammar.g:102:31: inlineExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_inlineExpr_in_multiInstanceEvent556);
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
    // msc_grammar.g:106:1: label : ( eventName | 'label' eventName end ) -> ^( Label eventName ) ;
    public final msc_grammarParser.label_return label() throws RecognitionException {
        msc_grammarParser.label_return retval = new msc_grammarParser.label_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal43=null;
        msc_grammarParser.eventName_return eventName42 = null;

        msc_grammarParser.eventName_return eventName44 = null;

        msc_grammarParser.end_return end45 = null;


        CommonTree string_literal43_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleSubtreeStream stream_eventName=new RewriteRuleSubtreeStream(adaptor,"rule eventName");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:106:8: ( ( eventName | 'label' eventName end ) -> ^( Label eventName ) )
            // msc_grammar.g:106:10: ( eventName | 'label' eventName end )
            {
            // msc_grammar.g:106:10: ( eventName | 'label' eventName end )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==NAME) ) {
                alt14=1;
            }
            else if ( (LA14_0==66) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // msc_grammar.g:106:12: eventName
                    {
                    pushFollow(FOLLOW_eventName_in_label570);
                    eventName42=eventName();

                    state._fsp--;

                    stream_eventName.add(eventName42.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:106:24: 'label' eventName end
                    {
                    string_literal43=(Token)match(input,66,FOLLOW_66_in_label574);  
                    stream_66.add(string_literal43);

                    pushFollow(FOLLOW_eventName_in_label576);
                    eventName44=eventName();

                    state._fsp--;

                    stream_eventName.add(eventName44.getTree());
                    pushFollow(FOLLOW_end_in_label578);
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
            // 106:48: -> ^( Label eventName )
            {
                // msc_grammar.g:106:51: ^( Label eventName )
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
    // msc_grammar.g:110:1: messageEvent : ( 'out' msgIdentification 'to' messageReceiver -> ^( MSGOut msgIdentification messageReceiver ) | 'in' msgIdentification 'from' messageSender -> ^( MSGIn msgIdentification messageSender ) );
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
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_messageReceiver=new RewriteRuleSubtreeStream(adaptor,"rule messageReceiver");
        RewriteRuleSubtreeStream stream_msgIdentification=new RewriteRuleSubtreeStream(adaptor,"rule msgIdentification");
        RewriteRuleSubtreeStream stream_messageSender=new RewriteRuleSubtreeStream(adaptor,"rule messageSender");
        try {
            // msc_grammar.g:111:2: ( 'out' msgIdentification 'to' messageReceiver -> ^( MSGOut msgIdentification messageReceiver ) | 'in' msgIdentification 'from' messageSender -> ^( MSGIn msgIdentification messageSender ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==67) ) {
                alt15=1;
            }
            else if ( (LA15_0==69) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // msc_grammar.g:111:4: 'out' msgIdentification 'to' messageReceiver
                    {
                    string_literal46=(Token)match(input,67,FOLLOW_67_in_messageEvent603);  
                    stream_67.add(string_literal46);

                    pushFollow(FOLLOW_msgIdentification_in_messageEvent605);
                    msgIdentification47=msgIdentification();

                    state._fsp--;

                    stream_msgIdentification.add(msgIdentification47.getTree());
                    string_literal48=(Token)match(input,68,FOLLOW_68_in_messageEvent607);  
                    stream_68.add(string_literal48);

                    pushFollow(FOLLOW_messageReceiver_in_messageEvent609);
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
                    // 111:49: -> ^( MSGOut msgIdentification messageReceiver )
                    {
                        // msc_grammar.g:111:52: ^( MSGOut msgIdentification messageReceiver )
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
                    // msc_grammar.g:112:4: 'in' msgIdentification 'from' messageSender
                    {
                    string_literal50=(Token)match(input,69,FOLLOW_69_in_messageEvent626);  
                    stream_69.add(string_literal50);

                    pushFollow(FOLLOW_msgIdentification_in_messageEvent628);
                    msgIdentification51=msgIdentification();

                    state._fsp--;

                    stream_msgIdentification.add(msgIdentification51.getTree());
                    string_literal52=(Token)match(input,70,FOLLOW_70_in_messageEvent630);  
                    stream_70.add(string_literal52);

                    pushFollow(FOLLOW_messageSender_in_messageEvent632);
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
                    // 112:49: -> ^( MSGIn msgIdentification messageSender )
                    {
                        // msc_grammar.g:112:52: ^( MSGIn msgIdentification messageSender )
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
    // msc_grammar.g:115:1: messageReceiver : ( inputAddress -> inputAddress FullMsg | 'lost' ( inputAddress )? -> ( inputAddress )? IncompleteMsg );
    public final msc_grammarParser.messageReceiver_return messageReceiver() throws RecognitionException {
        msc_grammarParser.messageReceiver_return retval = new msc_grammarParser.messageReceiver_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal55=null;
        msc_grammarParser.inputAddress_return inputAddress54 = null;

        msc_grammarParser.inputAddress_return inputAddress56 = null;


        CommonTree string_literal55_tree=null;
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_inputAddress=new RewriteRuleSubtreeStream(adaptor,"rule inputAddress");
        try {
            // msc_grammar.g:116:2: ( inputAddress -> inputAddress FullMsg | 'lost' ( inputAddress )? -> ( inputAddress )? IncompleteMsg )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==NAME||LA17_0==73) ) {
                alt17=1;
            }
            else if ( (LA17_0==71) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // msc_grammar.g:116:4: inputAddress
                    {
                    pushFollow(FOLLOW_inputAddress_in_messageReceiver658);
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
                    // 116:17: -> inputAddress FullMsg
                    {
                        adaptor.addChild(root_0, stream_inputAddress.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FullMsg, "FullMsg"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // msc_grammar.g:117:4: 'lost' ( inputAddress )?
                    {
                    string_literal55=(Token)match(input,71,FOLLOW_71_in_messageReceiver669);  
                    stream_71.add(string_literal55);

                    // msc_grammar.g:117:11: ( inputAddress )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==NAME||LA16_0==73) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // msc_grammar.g:117:13: inputAddress
                            {
                            pushFollow(FOLLOW_inputAddress_in_messageReceiver673);
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
                    // 117:29: -> ( inputAddress )? IncompleteMsg
                    {
                        // msc_grammar.g:117:32: ( inputAddress )?
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
    // msc_grammar.g:120:1: messageSender : ( outputAddress -> outputAddress FullMsg | 'found' ( outputAddress )? -> ( outputAddress )? IncompleteMsg );
    public final msc_grammarParser.messageSender_return messageSender() throws RecognitionException {
        msc_grammarParser.messageSender_return retval = new msc_grammarParser.messageSender_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal58=null;
        msc_grammarParser.outputAddress_return outputAddress57 = null;

        msc_grammarParser.outputAddress_return outputAddress59 = null;


        CommonTree string_literal58_tree=null;
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_outputAddress=new RewriteRuleSubtreeStream(adaptor,"rule outputAddress");
        try {
            // msc_grammar.g:121:2: ( outputAddress -> outputAddress FullMsg | 'found' ( outputAddress )? -> ( outputAddress )? IncompleteMsg )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==NAME||LA19_0==73) ) {
                alt19=1;
            }
            else if ( (LA19_0==72) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // msc_grammar.g:121:4: outputAddress
                    {
                    pushFollow(FOLLOW_outputAddress_in_messageSender695);
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
                    // 121:18: -> outputAddress FullMsg
                    {
                        adaptor.addChild(root_0, stream_outputAddress.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FullMsg, "FullMsg"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // msc_grammar.g:122:4: 'found' ( outputAddress )?
                    {
                    string_literal58=(Token)match(input,72,FOLLOW_72_in_messageSender706);  
                    stream_72.add(string_literal58);

                    // msc_grammar.g:122:12: ( outputAddress )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==NAME||LA18_0==73) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // msc_grammar.g:122:14: outputAddress
                            {
                            pushFollow(FOLLOW_outputAddress_in_messageSender710);
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
                    // 122:31: -> ( outputAddress )? IncompleteMsg
                    {
                        // msc_grammar.g:122:34: ( outputAddress )?
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
    // msc_grammar.g:125:1: msgIdentification : ( messageName | characterString );
    public final msc_grammarParser.msgIdentification_return msgIdentification() throws RecognitionException {
        msc_grammarParser.msgIdentification_return retval = new msc_grammarParser.msgIdentification_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.messageName_return messageName60 = null;

        msc_grammarParser.characterString_return characterString61 = null;



        try {
            // msc_grammar.g:126:2: ( messageName | characterString )
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
                    // msc_grammar.g:126:4: messageName
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_messageName_in_msgIdentification733);
                    messageName60=messageName();

                    state._fsp--;

                    adaptor.addChild(root_0, messageName60.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:126:18: characterString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_characterString_in_msgIdentification737);
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
    // msc_grammar.g:129:1: outputAddress : ( instanceName | 'env' ( 'via' gateName )? -> ^( MsgGate ( gateName )? ) );
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
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_gateName=new RewriteRuleSubtreeStream(adaptor,"rule gateName");
        try {
            // msc_grammar.g:130:2: ( instanceName | 'env' ( 'via' gateName )? -> ^( MsgGate ( gateName )? ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==NAME) ) {
                alt22=1;
            }
            else if ( (LA22_0==73) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // msc_grammar.g:130:4: instanceName
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_instanceName_in_outputAddress749);
                    instanceName62=instanceName();

                    state._fsp--;

                    adaptor.addChild(root_0, instanceName62.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:131:4: 'env' ( 'via' gateName )?
                    {
                    string_literal63=(Token)match(input,73,FOLLOW_73_in_outputAddress754);  
                    stream_73.add(string_literal63);

                    // msc_grammar.g:131:10: ( 'via' gateName )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==74) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // msc_grammar.g:131:12: 'via' gateName
                            {
                            string_literal64=(Token)match(input,74,FOLLOW_74_in_outputAddress758);  
                            stream_74.add(string_literal64);

                            pushFollow(FOLLOW_gateName_in_outputAddress760);
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
                    // 131:30: -> ^( MsgGate ( gateName )? )
                    {
                        // msc_grammar.g:131:33: ^( MsgGate ( gateName )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MsgGate, "MsgGate"), root_1);

                        // msc_grammar.g:131:44: ( gateName )?
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
    // msc_grammar.g:134:1: inputAddress : ( instanceName | 'env' ( 'via' gateName )? -> ^( MsgGate ( gateName )? ) );
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
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_gateName=new RewriteRuleSubtreeStream(adaptor,"rule gateName");
        try {
            // msc_grammar.g:135:2: ( instanceName | 'env' ( 'via' gateName )? -> ^( MsgGate ( gateName )? ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==NAME) ) {
                alt24=1;
            }
            else if ( (LA24_0==73) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // msc_grammar.g:135:4: instanceName
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_instanceName_in_inputAddress787);
                    instanceName66=instanceName();

                    state._fsp--;

                    adaptor.addChild(root_0, instanceName66.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:136:4: 'env' ( 'via' gateName )?
                    {
                    string_literal67=(Token)match(input,73,FOLLOW_73_in_inputAddress792);  
                    stream_73.add(string_literal67);

                    // msc_grammar.g:136:10: ( 'via' gateName )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==74) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // msc_grammar.g:136:12: 'via' gateName
                            {
                            string_literal68=(Token)match(input,74,FOLLOW_74_in_inputAddress796);  
                            stream_74.add(string_literal68);

                            pushFollow(FOLLOW_gateName_in_inputAddress798);
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
                    // 136:30: -> ^( MsgGate ( gateName )? )
                    {
                        // msc_grammar.g:136:33: ^( MsgGate ( gateName )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MsgGate, "MsgGate"), root_1);

                        // msc_grammar.g:136:44: ( gateName )?
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
    // msc_grammar.g:139:1: action : 'action' actionStatement -> actionStatement ;
    public final msc_grammarParser.action_return action() throws RecognitionException {
        msc_grammarParser.action_return retval = new msc_grammarParser.action_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal70=null;
        msc_grammarParser.actionStatement_return actionStatement71 = null;


        CommonTree string_literal70_tree=null;
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_actionStatement=new RewriteRuleSubtreeStream(adaptor,"rule actionStatement");
        try {
            // msc_grammar.g:139:9: ( 'action' actionStatement -> actionStatement )
            // msc_grammar.g:139:11: 'action' actionStatement
            {
            string_literal70=(Token)match(input,75,FOLLOW_75_in_action824);  
            stream_75.add(string_literal70);

            pushFollow(FOLLOW_actionStatement_in_action826);
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
            // 139:36: -> actionStatement
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
    // msc_grammar.g:141:1: actionStatement : informalAction -> ^( Action informalAction ) ;
    public final msc_grammarParser.actionStatement_return actionStatement() throws RecognitionException {
        msc_grammarParser.actionStatement_return retval = new msc_grammarParser.actionStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.informalAction_return informalAction72 = null;


        RewriteRuleSubtreeStream stream_informalAction=new RewriteRuleSubtreeStream(adaptor,"rule informalAction");
        try {
            // msc_grammar.g:142:2: ( informalAction -> ^( Action informalAction ) )
            // msc_grammar.g:142:4: informalAction
            {
            pushFollow(FOLLOW_informalAction_in_actionStatement841);
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
            // 142:19: -> ^( Action informalAction )
            {
                // msc_grammar.g:142:22: ^( Action informalAction )
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
    // msc_grammar.g:144:1: informalAction : ( messageName | characterString );
    public final msc_grammarParser.informalAction_return informalAction() throws RecognitionException {
        msc_grammarParser.informalAction_return retval = new msc_grammarParser.informalAction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.messageName_return messageName73 = null;

        msc_grammarParser.characterString_return characterString74 = null;



        try {
            // msc_grammar.g:145:2: ( messageName | characterString )
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
                    // msc_grammar.g:145:4: messageName
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_messageName_in_informalAction862);
                    messageName73=messageName();

                    state._fsp--;

                    adaptor.addChild(root_0, messageName73.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:145:18: characterString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_characterString_in_informalAction866);
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
    // msc_grammar.g:148:1: instanceHeadStatement : 'instance' ( instanceKind )? ;
    public final msc_grammarParser.instanceHeadStatement_return instanceHeadStatement() throws RecognitionException {
        msc_grammarParser.instanceHeadStatement_return retval = new msc_grammarParser.instanceHeadStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal75=null;
        msc_grammarParser.instanceKind_return instanceKind76 = null;


        CommonTree string_literal75_tree=null;

        try {
            // msc_grammar.g:149:2: ( 'instance' ( instanceKind )? )
            // msc_grammar.g:149:4: 'instance' ( instanceKind )?
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal75=(Token)match(input,76,FOLLOW_76_in_instanceHeadStatement879); 
            string_literal75_tree = (CommonTree)adaptor.create(string_literal75);
            adaptor.addChild(root_0, string_literal75_tree);

            // msc_grammar.g:149:15: ( instanceKind )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==NAME||(LA26_0>=79 && LA26_0<=82)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // msc_grammar.g:149:17: instanceKind
                    {
                    pushFollow(FOLLOW_instanceKind_in_instanceHeadStatement883);
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
    // msc_grammar.g:152:1: instanceEndStatement : 'endinstance' ;
    public final msc_grammarParser.instanceEndStatement_return instanceEndStatement() throws RecognitionException {
        msc_grammarParser.instanceEndStatement_return retval = new msc_grammarParser.instanceEndStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal77=null;

        CommonTree string_literal77_tree=null;

        try {
            // msc_grammar.g:153:2: ( 'endinstance' )
            // msc_grammar.g:153:4: 'endinstance'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal77=(Token)match(input,77,FOLLOW_77_in_instanceEndStatement899); 
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
    // msc_grammar.g:156:1: mscInterface : ( mscInstInterface ( mscGateInterface )? | mscGateInterface );
    public final msc_grammarParser.mscInterface_return mscInterface() throws RecognitionException {
        msc_grammarParser.mscInterface_return retval = new msc_grammarParser.mscInterface_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.mscInstInterface_return mscInstInterface78 = null;

        msc_grammarParser.mscGateInterface_return mscGateInterface79 = null;

        msc_grammarParser.mscGateInterface_return mscGateInterface80 = null;



        try {
            // msc_grammar.g:157:2: ( mscInstInterface ( mscGateInterface )? | mscGateInterface )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==78) ) {
                alt28=1;
            }
            else if ( (LA28_0==103) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // msc_grammar.g:157:4: mscInstInterface ( mscGateInterface )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_mscInstInterface_in_mscInterface911);
                    mscInstInterface78=mscInstInterface();

                    state._fsp--;

                    adaptor.addChild(root_0, mscInstInterface78.getTree());
                    // msc_grammar.g:157:21: ( mscGateInterface )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==103) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // msc_grammar.g:157:23: mscGateInterface
                            {
                            pushFollow(FOLLOW_mscGateInterface_in_mscInterface915);
                            mscGateInterface79=mscGateInterface();

                            state._fsp--;

                            adaptor.addChild(root_0, mscGateInterface79.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // msc_grammar.g:157:45: mscGateInterface
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_mscGateInterface_in_mscInterface922);
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
    // msc_grammar.g:160:1: mscInstInterface : 'inst' instanceList end ;
    public final msc_grammarParser.mscInstInterface_return mscInstInterface() throws RecognitionException {
        msc_grammarParser.mscInstInterface_return retval = new msc_grammarParser.mscInstInterface_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal81=null;
        msc_grammarParser.instanceList_return instanceList82 = null;

        msc_grammarParser.end_return end83 = null;


        CommonTree string_literal81_tree=null;

        try {
            // msc_grammar.g:161:2: ( 'inst' instanceList end )
            // msc_grammar.g:161:4: 'inst' instanceList end
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal81=(Token)match(input,78,FOLLOW_78_in_mscInstInterface935); 
            string_literal81_tree = (CommonTree)adaptor.create(string_literal81);
            adaptor.addChild(root_0, string_literal81_tree);

            pushFollow(FOLLOW_instanceList_in_mscInstInterface937);
            instanceList82=instanceList();

            state._fsp--;

            adaptor.addChild(root_0, instanceList82.getTree());
            pushFollow(FOLLOW_end_in_mscInstInterface939);
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
    // msc_grammar.g:164:1: instanceList : instanceName ( ':' instanceKind )? ( ',' instanceList )? ;
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
            // msc_grammar.g:165:2: ( instanceName ( ':' instanceKind )? ( ',' instanceList )? )
            // msc_grammar.g:165:4: instanceName ( ':' instanceKind )? ( ',' instanceList )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_instanceName_in_instanceList952);
            instanceName84=instanceName();

            state._fsp--;

            adaptor.addChild(root_0, instanceName84.getTree());
            // msc_grammar.g:165:17: ( ':' instanceKind )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==64) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // msc_grammar.g:165:19: ':' instanceKind
                    {
                    char_literal85=(Token)match(input,64,FOLLOW_64_in_instanceList956); 
                    char_literal85_tree = (CommonTree)adaptor.create(char_literal85);
                    adaptor.addChild(root_0, char_literal85_tree);

                    pushFollow(FOLLOW_instanceKind_in_instanceList958);
                    instanceKind86=instanceKind();

                    state._fsp--;

                    adaptor.addChild(root_0, instanceKind86.getTree());

                    }
                    break;

            }

            // msc_grammar.g:165:39: ( ',' instanceList )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==65) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // msc_grammar.g:165:41: ',' instanceList
                    {
                    char_literal87=(Token)match(input,65,FOLLOW_65_in_instanceList965); 
                    char_literal87_tree = (CommonTree)adaptor.create(char_literal87);
                    adaptor.addChild(root_0, char_literal87_tree);

                    pushFollow(FOLLOW_instanceList_in_instanceList967);
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
    // msc_grammar.g:168:1: instanceKind : ( kindDenominator )? identifier ;
    public final msc_grammarParser.instanceKind_return instanceKind() throws RecognitionException {
        msc_grammarParser.instanceKind_return retval = new msc_grammarParser.instanceKind_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.kindDenominator_return kindDenominator89 = null;

        msc_grammarParser.identifier_return identifier90 = null;



        try {
            // msc_grammar.g:169:2: ( ( kindDenominator )? identifier )
            // msc_grammar.g:169:4: ( kindDenominator )? identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            // msc_grammar.g:169:4: ( kindDenominator )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=79 && LA31_0<=82)) ) {
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
                    // msc_grammar.g:169:6: kindDenominator
                    {
                    pushFollow(FOLLOW_kindDenominator_in_instanceKind985);
                    kindDenominator89=kindDenominator();

                    state._fsp--;

                    adaptor.addChild(root_0, kindDenominator89.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_identifier_in_instanceKind990);
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
    // msc_grammar.g:172:1: kindDenominator : ( 'system' | 'block' | 'process' | 'service' | name );
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
            // msc_grammar.g:173:2: ( 'system' | 'block' | 'process' | 'service' | name )
            int alt32=5;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt32=1;
                }
                break;
            case 80:
                {
                alt32=2;
                }
                break;
            case 81:
                {
                alt32=3;
                }
                break;
            case 82:
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
                    // msc_grammar.g:173:4: 'system'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal91=(Token)match(input,79,FOLLOW_79_in_kindDenominator1003); 
                    string_literal91_tree = (CommonTree)adaptor.create(string_literal91);
                    adaptor.addChild(root_0, string_literal91_tree);


                    }
                    break;
                case 2 :
                    // msc_grammar.g:173:15: 'block'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal92=(Token)match(input,80,FOLLOW_80_in_kindDenominator1007); 
                    string_literal92_tree = (CommonTree)adaptor.create(string_literal92);
                    adaptor.addChild(root_0, string_literal92_tree);


                    }
                    break;
                case 3 :
                    // msc_grammar.g:173:25: 'process'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal93=(Token)match(input,81,FOLLOW_81_in_kindDenominator1011); 
                    string_literal93_tree = (CommonTree)adaptor.create(string_literal93);
                    adaptor.addChild(root_0, string_literal93_tree);


                    }
                    break;
                case 4 :
                    // msc_grammar.g:173:37: 'service'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal94=(Token)match(input,82,FOLLOW_82_in_kindDenominator1015); 
                    string_literal94_tree = (CommonTree)adaptor.create(string_literal94);
                    adaptor.addChild(root_0, string_literal94_tree);


                    }
                    break;
                case 5 :
                    // msc_grammar.g:173:49: name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_name_in_kindDenominator1019);
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
    // msc_grammar.g:176:1: end : ';' ;
    public final msc_grammarParser.end_return end() throws RecognitionException {
        msc_grammarParser.end_return retval = new msc_grammarParser.end_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal96=null;

        CommonTree char_literal96_tree=null;

        try {
            // msc_grammar.g:176:6: ( ';' )
            // msc_grammar.g:176:8: ';'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal96=(Token)match(input,83,FOLLOW_83_in_end1030); 
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
    // msc_grammar.g:180:1: condition : conditionIdentification ;
    public final msc_grammarParser.condition_return condition() throws RecognitionException {
        msc_grammarParser.condition_return retval = new msc_grammarParser.condition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.conditionIdentification_return conditionIdentification97 = null;



        try {
            // msc_grammar.g:181:2: ( conditionIdentification )
            // msc_grammar.g:181:4: conditionIdentification
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_conditionIdentification_in_condition1043);
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
    // msc_grammar.g:183:1: conditionIdentification : 'condition' conditionText -> ^( Condition conditionText ) ;
    public final msc_grammarParser.conditionIdentification_return conditionIdentification() throws RecognitionException {
        msc_grammarParser.conditionIdentification_return retval = new msc_grammarParser.conditionIdentification_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal98=null;
        msc_grammarParser.conditionText_return conditionText99 = null;


        CommonTree string_literal98_tree=null;
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleSubtreeStream stream_conditionText=new RewriteRuleSubtreeStream(adaptor,"rule conditionText");
        try {
            // msc_grammar.g:184:2: ( 'condition' conditionText -> ^( Condition conditionText ) )
            // msc_grammar.g:184:4: 'condition' conditionText
            {
            string_literal98=(Token)match(input,84,FOLLOW_84_in_conditionIdentification1054);  
            stream_84.add(string_literal98);

            pushFollow(FOLLOW_conditionText_in_conditionIdentification1056);
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
            // 184:30: -> ^( Condition conditionText )
            {
                // msc_grammar.g:184:33: ^( Condition conditionText )
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
    // msc_grammar.g:186:1: conditionText : ( conditionNameList -> ^( SetCond conditionNameList ) | WHEN conditionGuard -> conditionGuard | OTHERWISE -> ^( ElseCond ) );
    public final msc_grammarParser.conditionText_return conditionText() throws RecognitionException {
        msc_grammarParser.conditionText_return retval = new msc_grammarParser.conditionText_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHEN101=null;
        Token OTHERWISE103=null;
        msc_grammarParser.conditionNameList_return conditionNameList100 = null;

        msc_grammarParser.conditionGuard_return conditionGuard102 = null;


        CommonTree WHEN101_tree=null;
        CommonTree OTHERWISE103_tree=null;
        RewriteRuleTokenStream stream_WHEN=new RewriteRuleTokenStream(adaptor,"token WHEN");
        RewriteRuleTokenStream stream_OTHERWISE=new RewriteRuleTokenStream(adaptor,"token OTHERWISE");
        RewriteRuleSubtreeStream stream_conditionGuard=new RewriteRuleSubtreeStream(adaptor,"rule conditionGuard");
        RewriteRuleSubtreeStream stream_conditionNameList=new RewriteRuleSubtreeStream(adaptor,"rule conditionNameList");
        try {
            // msc_grammar.g:187:2: ( conditionNameList -> ^( SetCond conditionNameList ) | WHEN conditionGuard -> conditionGuard | OTHERWISE -> ^( ElseCond ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case NAME:
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
                    // msc_grammar.g:187:4: conditionNameList
                    {
                    pushFollow(FOLLOW_conditionNameList_in_conditionText1077);
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
                    // 187:23: -> ^( SetCond conditionNameList )
                    {
                        // msc_grammar.g:187:26: ^( SetCond conditionNameList )
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
                    // msc_grammar.g:188:4: WHEN conditionGuard
                    {
                    WHEN101=(Token)match(input,WHEN,FOLLOW_WHEN_in_conditionText1093);  
                    stream_WHEN.add(WHEN101);

                    pushFollow(FOLLOW_conditionGuard_in_conditionText1095);
                    conditionGuard102=conditionGuard();

                    state._fsp--;

                    stream_conditionGuard.add(conditionGuard102.getTree());


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
                    // 188:24: -> conditionGuard
                    {
                        adaptor.addChild(root_0, stream_conditionGuard.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // msc_grammar.g:189:5: OTHERWISE
                    {
                    OTHERWISE103=(Token)match(input,OTHERWISE,FOLLOW_OTHERWISE_in_conditionText1105);  
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
                    // 189:17: -> ^( ElseCond )
                    {
                        // msc_grammar.g:189:20: ^( ElseCond )
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
    // msc_grammar.g:191:1: conditionGuard : ( conditionNameList -> ^( GuardCond conditionNameList ) | '(' expressionString ')' -> ^( DataGuardCond expressionString ) );
    public final msc_grammarParser.conditionGuard_return conditionGuard() throws RecognitionException {
        msc_grammarParser.conditionGuard_return retval = new msc_grammarParser.conditionGuard_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal105=null;
        Token char_literal107=null;
        msc_grammarParser.conditionNameList_return conditionNameList104 = null;

        msc_grammarParser.expressionString_return expressionString106 = null;


        CommonTree char_literal105_tree=null;
        CommonTree char_literal107_tree=null;
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_expressionString=new RewriteRuleSubtreeStream(adaptor,"rule expressionString");
        RewriteRuleSubtreeStream stream_conditionNameList=new RewriteRuleSubtreeStream(adaptor,"rule conditionNameList");
        try {
            // msc_grammar.g:192:2: ( conditionNameList -> ^( GuardCond conditionNameList ) | '(' expressionString ')' -> ^( DataGuardCond expressionString ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==NAME) ) {
                alt34=1;
            }
            else if ( (LA34_0==85) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // msc_grammar.g:192:4: conditionNameList
                    {
                    pushFollow(FOLLOW_conditionNameList_in_conditionGuard1126);
                    conditionNameList104=conditionNameList();

                    state._fsp--;

                    stream_conditionNameList.add(conditionNameList104.getTree());


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
                    // 192:23: -> ^( GuardCond conditionNameList )
                    {
                        // msc_grammar.g:192:26: ^( GuardCond conditionNameList )
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
                    // msc_grammar.g:193:5: '(' expressionString ')'
                    {
                    char_literal105=(Token)match(input,85,FOLLOW_85_in_conditionGuard1143);  
                    stream_85.add(char_literal105);

                    pushFollow(FOLLOW_expressionString_in_conditionGuard1145);
                    expressionString106=expressionString();

                    state._fsp--;

                    stream_expressionString.add(expressionString106.getTree());
                    char_literal107=(Token)match(input,86,FOLLOW_86_in_conditionGuard1147);  
                    stream_86.add(char_literal107);



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
                    // 193:31: -> ^( DataGuardCond expressionString )
                    {
                        // msc_grammar.g:193:34: ^( DataGuardCond expressionString )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DataGuardCond, "DataGuardCond"), root_1);

                        adaptor.addChild(root_1, stream_expressionString.nextTree());

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
    // msc_grammar.g:195:1: conditionNameList : NAME ( ',' NAME )* -> ( NAME )+ ;
    public final msc_grammarParser.conditionNameList_return conditionNameList() throws RecognitionException {
        msc_grammarParser.conditionNameList_return retval = new msc_grammarParser.conditionNameList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME108=null;
        Token char_literal109=null;
        Token NAME110=null;

        CommonTree NAME108_tree=null;
        CommonTree char_literal109_tree=null;
        CommonTree NAME110_tree=null;
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");

        try {
            // msc_grammar.g:196:2: ( NAME ( ',' NAME )* -> ( NAME )+ )
            // msc_grammar.g:196:4: NAME ( ',' NAME )*
            {
            NAME108=(Token)match(input,NAME,FOLLOW_NAME_in_conditionNameList1169);  
            stream_NAME.add(NAME108);

            // msc_grammar.g:196:9: ( ',' NAME )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==65) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // msc_grammar.g:196:11: ',' NAME
            	    {
            	    char_literal109=(Token)match(input,65,FOLLOW_65_in_conditionNameList1173);  
            	    stream_65.add(char_literal109);

            	    NAME110=(Token)match(input,NAME,FOLLOW_NAME_in_conditionNameList1175);  
            	    stream_NAME.add(NAME110);


            	    }
            	    break;

            	default :
            	    break loop35;
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
            // 196:23: -> ( NAME )+
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
    // msc_grammar.g:200:1: inlineExpr : ( loopExpr | optExpr | altExpr | parExpr | excExpr );
    public final msc_grammarParser.inlineExpr_return inlineExpr() throws RecognitionException {
        msc_grammarParser.inlineExpr_return retval = new msc_grammarParser.inlineExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.loopExpr_return loopExpr111 = null;

        msc_grammarParser.optExpr_return optExpr112 = null;

        msc_grammarParser.altExpr_return altExpr113 = null;

        msc_grammarParser.parExpr_return parExpr114 = null;

        msc_grammarParser.excExpr_return excExpr115 = null;



        try {
            // msc_grammar.g:201:2: ( loopExpr | optExpr | altExpr | parExpr | excExpr )
            int alt36=5;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt36=1;
                }
                break;
            case 88:
                {
                alt36=2;
                }
                break;
            case 90:
                {
                alt36=3;
                }
                break;
            case 91:
                {
                alt36=4;
                }
                break;
            case 89:
                {
                alt36=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // msc_grammar.g:201:4: loopExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_loopExpr_in_inlineExpr1196);
                    loopExpr111=loopExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, loopExpr111.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:201:15: optExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_optExpr_in_inlineExpr1200);
                    optExpr112=optExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, optExpr112.getTree());

                    }
                    break;
                case 3 :
                    // msc_grammar.g:201:25: altExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_altExpr_in_inlineExpr1204);
                    altExpr113=altExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, altExpr113.getTree());

                    }
                    break;
                case 4 :
                    // msc_grammar.g:201:35: parExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parExpr_in_inlineExpr1208);
                    parExpr114=parExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, parExpr114.getTree());

                    }
                    break;
                case 5 :
                    // msc_grammar.g:201:45: excExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_excExpr_in_inlineExpr1212);
                    excExpr115=excExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, excExpr115.getTree());

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
    // msc_grammar.g:203:1: loopExpr : 'loop' ( loopBoundary )? BEGIN end mscBody 'loop' END -> ^( Loop mscBody ( loopBoundary )? ) ;
    public final msc_grammarParser.loopExpr_return loopExpr() throws RecognitionException {
        msc_grammarParser.loopExpr_return retval = new msc_grammarParser.loopExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal116=null;
        Token BEGIN118=null;
        Token string_literal121=null;
        Token END122=null;
        msc_grammarParser.loopBoundary_return loopBoundary117 = null;

        msc_grammarParser.end_return end119 = null;

        msc_grammarParser.mscBody_return mscBody120 = null;


        CommonTree string_literal116_tree=null;
        CommonTree BEGIN118_tree=null;
        CommonTree string_literal121_tree=null;
        CommonTree END122_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleSubtreeStream stream_loopBoundary=new RewriteRuleSubtreeStream(adaptor,"rule loopBoundary");
        RewriteRuleSubtreeStream stream_mscBody=new RewriteRuleSubtreeStream(adaptor,"rule mscBody");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:204:2: ( 'loop' ( loopBoundary )? BEGIN end mscBody 'loop' END -> ^( Loop mscBody ( loopBoundary )? ) )
            // msc_grammar.g:204:4: 'loop' ( loopBoundary )? BEGIN end mscBody 'loop' END
            {
            string_literal116=(Token)match(input,87,FOLLOW_87_in_loopExpr1223);  
            stream_87.add(string_literal116);

            // msc_grammar.g:204:11: ( loopBoundary )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==92) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // msc_grammar.g:204:13: loopBoundary
                    {
                    pushFollow(FOLLOW_loopBoundary_in_loopExpr1227);
                    loopBoundary117=loopBoundary();

                    state._fsp--;

                    stream_loopBoundary.add(loopBoundary117.getTree());

                    }
                    break;

            }

            BEGIN118=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_loopExpr1232);  
            stream_BEGIN.add(BEGIN118);

            pushFollow(FOLLOW_end_in_loopExpr1234);
            end119=end();

            state._fsp--;

            stream_end.add(end119.getTree());
            pushFollow(FOLLOW_mscBody_in_loopExpr1236);
            mscBody120=mscBody();

            state._fsp--;

            stream_mscBody.add(mscBody120.getTree());
            string_literal121=(Token)match(input,87,FOLLOW_87_in_loopExpr1238);  
            stream_87.add(string_literal121);

            END122=(Token)match(input,END,FOLLOW_END_in_loopExpr1240);  
            stream_END.add(END122);



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
            // 204:58: -> ^( Loop mscBody ( loopBoundary )? )
            {
                // msc_grammar.g:204:61: ^( Loop mscBody ( loopBoundary )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Loop, "Loop"), root_1);

                adaptor.addChild(root_1, stream_mscBody.nextTree());
                // msc_grammar.g:204:77: ( loopBoundary )?
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
    // msc_grammar.g:206:1: optExpr : 'opt' BEGIN end mscBody 'opt' END -> ^( Opt mscBody ) ;
    public final msc_grammarParser.optExpr_return optExpr() throws RecognitionException {
        msc_grammarParser.optExpr_return retval = new msc_grammarParser.optExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal123=null;
        Token BEGIN124=null;
        Token string_literal127=null;
        Token END128=null;
        msc_grammarParser.end_return end125 = null;

        msc_grammarParser.mscBody_return mscBody126 = null;


        CommonTree string_literal123_tree=null;
        CommonTree BEGIN124_tree=null;
        CommonTree string_literal127_tree=null;
        CommonTree END128_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleSubtreeStream stream_mscBody=new RewriteRuleSubtreeStream(adaptor,"rule mscBody");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:206:9: ( 'opt' BEGIN end mscBody 'opt' END -> ^( Opt mscBody ) )
            // msc_grammar.g:206:11: 'opt' BEGIN end mscBody 'opt' END
            {
            string_literal123=(Token)match(input,88,FOLLOW_88_in_optExpr1262);  
            stream_88.add(string_literal123);

            BEGIN124=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_optExpr1264);  
            stream_BEGIN.add(BEGIN124);

            pushFollow(FOLLOW_end_in_optExpr1266);
            end125=end();

            state._fsp--;

            stream_end.add(end125.getTree());
            pushFollow(FOLLOW_mscBody_in_optExpr1268);
            mscBody126=mscBody();

            state._fsp--;

            stream_mscBody.add(mscBody126.getTree());
            string_literal127=(Token)match(input,88,FOLLOW_88_in_optExpr1270);  
            stream_88.add(string_literal127);

            END128=(Token)match(input,END,FOLLOW_END_in_optExpr1272);  
            stream_END.add(END128);



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
            // 206:45: -> ^( Opt mscBody )
            {
                // msc_grammar.g:206:48: ^( Opt mscBody )
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
    // msc_grammar.g:208:1: excExpr : 'exc' BEGIN end mscBody 'exc' END -> ^( Exc mscBody ) ;
    public final msc_grammarParser.excExpr_return excExpr() throws RecognitionException {
        msc_grammarParser.excExpr_return retval = new msc_grammarParser.excExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal129=null;
        Token BEGIN130=null;
        Token string_literal133=null;
        Token END134=null;
        msc_grammarParser.end_return end131 = null;

        msc_grammarParser.mscBody_return mscBody132 = null;


        CommonTree string_literal129_tree=null;
        CommonTree BEGIN130_tree=null;
        CommonTree string_literal133_tree=null;
        CommonTree END134_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_mscBody=new RewriteRuleSubtreeStream(adaptor,"rule mscBody");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:208:9: ( 'exc' BEGIN end mscBody 'exc' END -> ^( Exc mscBody ) )
            // msc_grammar.g:208:11: 'exc' BEGIN end mscBody 'exc' END
            {
            string_literal129=(Token)match(input,89,FOLLOW_89_in_excExpr1291);  
            stream_89.add(string_literal129);

            BEGIN130=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_excExpr1293);  
            stream_BEGIN.add(BEGIN130);

            pushFollow(FOLLOW_end_in_excExpr1295);
            end131=end();

            state._fsp--;

            stream_end.add(end131.getTree());
            pushFollow(FOLLOW_mscBody_in_excExpr1297);
            mscBody132=mscBody();

            state._fsp--;

            stream_mscBody.add(mscBody132.getTree());
            string_literal133=(Token)match(input,89,FOLLOW_89_in_excExpr1299);  
            stream_89.add(string_literal133);

            END134=(Token)match(input,END,FOLLOW_END_in_excExpr1301);  
            stream_END.add(END134);



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
            // 208:45: -> ^( Exc mscBody )
            {
                // msc_grammar.g:208:48: ^( Exc mscBody )
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
    // msc_grammar.g:210:1: altExpr : 'alt' BEGIN end mscBody ( 'alt' end mscBody )* 'alt' END -> ^( Alt ( mscBody )+ ) ;
    public final msc_grammarParser.altExpr_return altExpr() throws RecognitionException {
        msc_grammarParser.altExpr_return retval = new msc_grammarParser.altExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal135=null;
        Token BEGIN136=null;
        Token string_literal139=null;
        Token string_literal142=null;
        Token END143=null;
        msc_grammarParser.end_return end137 = null;

        msc_grammarParser.mscBody_return mscBody138 = null;

        msc_grammarParser.end_return end140 = null;

        msc_grammarParser.mscBody_return mscBody141 = null;


        CommonTree string_literal135_tree=null;
        CommonTree BEGIN136_tree=null;
        CommonTree string_literal139_tree=null;
        CommonTree string_literal142_tree=null;
        CommonTree END143_tree=null;
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_mscBody=new RewriteRuleSubtreeStream(adaptor,"rule mscBody");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:210:9: ( 'alt' BEGIN end mscBody ( 'alt' end mscBody )* 'alt' END -> ^( Alt ( mscBody )+ ) )
            // msc_grammar.g:210:11: 'alt' BEGIN end mscBody ( 'alt' end mscBody )* 'alt' END
            {
            string_literal135=(Token)match(input,90,FOLLOW_90_in_altExpr1320);  
            stream_90.add(string_literal135);

            BEGIN136=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_altExpr1322);  
            stream_BEGIN.add(BEGIN136);

            pushFollow(FOLLOW_end_in_altExpr1324);
            end137=end();

            state._fsp--;

            stream_end.add(end137.getTree());
            pushFollow(FOLLOW_mscBody_in_altExpr1326);
            mscBody138=mscBody();

            state._fsp--;

            stream_mscBody.add(mscBody138.getTree());
            // msc_grammar.g:210:35: ( 'alt' end mscBody )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==90) ) {
                    int LA38_1 = input.LA(2);

                    if ( (LA38_1==83) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // msc_grammar.g:210:37: 'alt' end mscBody
            	    {
            	    string_literal139=(Token)match(input,90,FOLLOW_90_in_altExpr1330);  
            	    stream_90.add(string_literal139);

            	    pushFollow(FOLLOW_end_in_altExpr1332);
            	    end140=end();

            	    state._fsp--;

            	    stream_end.add(end140.getTree());
            	    pushFollow(FOLLOW_mscBody_in_altExpr1334);
            	    mscBody141=mscBody();

            	    state._fsp--;

            	    stream_mscBody.add(mscBody141.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            string_literal142=(Token)match(input,90,FOLLOW_90_in_altExpr1339);  
            stream_90.add(string_literal142);

            END143=(Token)match(input,END,FOLLOW_END_in_altExpr1341);  
            stream_END.add(END143);



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
            // 210:68: -> ^( Alt ( mscBody )+ )
            {
                // msc_grammar.g:210:71: ^( Alt ( mscBody )+ )
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
    // msc_grammar.g:212:1: parExpr : 'par' BEGIN end mscBody ( 'par' end mscBody )* 'par' END -> ^( Par ( mscBody )+ ) ;
    public final msc_grammarParser.parExpr_return parExpr() throws RecognitionException {
        msc_grammarParser.parExpr_return retval = new msc_grammarParser.parExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal144=null;
        Token BEGIN145=null;
        Token string_literal148=null;
        Token string_literal151=null;
        Token END152=null;
        msc_grammarParser.end_return end146 = null;

        msc_grammarParser.mscBody_return mscBody147 = null;

        msc_grammarParser.end_return end149 = null;

        msc_grammarParser.mscBody_return mscBody150 = null;


        CommonTree string_literal144_tree=null;
        CommonTree BEGIN145_tree=null;
        CommonTree string_literal148_tree=null;
        CommonTree string_literal151_tree=null;
        CommonTree END152_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_mscBody=new RewriteRuleSubtreeStream(adaptor,"rule mscBody");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:212:9: ( 'par' BEGIN end mscBody ( 'par' end mscBody )* 'par' END -> ^( Par ( mscBody )+ ) )
            // msc_grammar.g:212:11: 'par' BEGIN end mscBody ( 'par' end mscBody )* 'par' END
            {
            string_literal144=(Token)match(input,91,FOLLOW_91_in_parExpr1361);  
            stream_91.add(string_literal144);

            BEGIN145=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_parExpr1363);  
            stream_BEGIN.add(BEGIN145);

            pushFollow(FOLLOW_end_in_parExpr1365);
            end146=end();

            state._fsp--;

            stream_end.add(end146.getTree());
            pushFollow(FOLLOW_mscBody_in_parExpr1367);
            mscBody147=mscBody();

            state._fsp--;

            stream_mscBody.add(mscBody147.getTree());
            // msc_grammar.g:212:35: ( 'par' end mscBody )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==91) ) {
                    int LA39_1 = input.LA(2);

                    if ( (LA39_1==83) ) {
                        alt39=1;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // msc_grammar.g:212:37: 'par' end mscBody
            	    {
            	    string_literal148=(Token)match(input,91,FOLLOW_91_in_parExpr1371);  
            	    stream_91.add(string_literal148);

            	    pushFollow(FOLLOW_end_in_parExpr1373);
            	    end149=end();

            	    state._fsp--;

            	    stream_end.add(end149.getTree());
            	    pushFollow(FOLLOW_mscBody_in_parExpr1375);
            	    mscBody150=mscBody();

            	    state._fsp--;

            	    stream_mscBody.add(mscBody150.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            string_literal151=(Token)match(input,91,FOLLOW_91_in_parExpr1380);  
            stream_91.add(string_literal151);

            END152=(Token)match(input,END,FOLLOW_END_in_parExpr1382);  
            stream_END.add(END152);



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
            // 212:68: -> ^( Par ( mscBody )+ )
            {
                // msc_grammar.g:212:71: ^( Par ( mscBody )+ )
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
    // msc_grammar.g:214:1: loopBoundary : '<' infNatural ( ',' infNatural )? '>' -> ^( LoopBoundary ( infNatural )+ ) ;
    public final msc_grammarParser.loopBoundary_return loopBoundary() throws RecognitionException {
        msc_grammarParser.loopBoundary_return retval = new msc_grammarParser.loopBoundary_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal153=null;
        Token char_literal155=null;
        Token char_literal157=null;
        msc_grammarParser.infNatural_return infNatural154 = null;

        msc_grammarParser.infNatural_return infNatural156 = null;


        CommonTree char_literal153_tree=null;
        CommonTree char_literal155_tree=null;
        CommonTree char_literal157_tree=null;
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_infNatural=new RewriteRuleSubtreeStream(adaptor,"rule infNatural");
        try {
            // msc_grammar.g:215:2: ( '<' infNatural ( ',' infNatural )? '>' -> ^( LoopBoundary ( infNatural )+ ) )
            // msc_grammar.g:215:4: '<' infNatural ( ',' infNatural )? '>'
            {
            char_literal153=(Token)match(input,92,FOLLOW_92_in_loopBoundary1403);  
            stream_92.add(char_literal153);

            pushFollow(FOLLOW_infNatural_in_loopBoundary1405);
            infNatural154=infNatural();

            state._fsp--;

            stream_infNatural.add(infNatural154.getTree());
            // msc_grammar.g:215:19: ( ',' infNatural )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==65) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // msc_grammar.g:215:21: ',' infNatural
                    {
                    char_literal155=(Token)match(input,65,FOLLOW_65_in_loopBoundary1409);  
                    stream_65.add(char_literal155);

                    pushFollow(FOLLOW_infNatural_in_loopBoundary1411);
                    infNatural156=infNatural();

                    state._fsp--;

                    stream_infNatural.add(infNatural156.getTree());

                    }
                    break;

            }

            char_literal157=(Token)match(input,93,FOLLOW_93_in_loopBoundary1416);  
            stream_93.add(char_literal157);



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
            // 215:43: -> ^( LoopBoundary ( infNatural )+ )
            {
                // msc_grammar.g:215:46: ^( LoopBoundary ( infNatural )+ )
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
    // msc_grammar.g:217:1: infNatural : ( 'inf' | '\"' expressionString '\"' );
    public final msc_grammarParser.infNatural_return infNatural() throws RecognitionException {
        msc_grammarParser.infNatural_return retval = new msc_grammarParser.infNatural_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal158=null;
        Token char_literal159=null;
        Token char_literal161=null;
        msc_grammarParser.expressionString_return expressionString160 = null;


        CommonTree string_literal158_tree=null;
        CommonTree char_literal159_tree=null;
        CommonTree char_literal161_tree=null;

        try {
            // msc_grammar.g:218:2: ( 'inf' | '\"' expressionString '\"' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==94) ) {
                alt41=1;
            }
            else if ( (LA41_0==95) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // msc_grammar.g:218:4: 'inf'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal158=(Token)match(input,94,FOLLOW_94_in_infNatural1438); 
                    string_literal158_tree = (CommonTree)adaptor.create(string_literal158);
                    adaptor.addChild(root_0, string_literal158_tree);


                    }
                    break;
                case 2 :
                    // msc_grammar.g:218:12: '\"' expressionString '\"'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal159=(Token)match(input,95,FOLLOW_95_in_infNatural1442); 
                    char_literal159_tree = (CommonTree)adaptor.create(char_literal159);
                    adaptor.addChild(root_0, char_literal159_tree);

                    pushFollow(FOLLOW_expressionString_in_infNatural1444);
                    expressionString160=expressionString();

                    state._fsp--;

                    adaptor.addChild(root_0, expressionString160.getTree());
                    char_literal161=(Token)match(input,95,FOLLOW_95_in_infNatural1446); 
                    char_literal161_tree = (CommonTree)adaptor.create(char_literal161);
                    adaptor.addChild(root_0, char_literal161_tree);


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
    // msc_grammar.g:222:1: create : 'create' instanceName ( '(' msgIdentification ')' )? -> ^( Create instanceName ^( ParameterList ( msgIdentification )? ) ) ;
    public final msc_grammarParser.create_return create() throws RecognitionException {
        msc_grammarParser.create_return retval = new msc_grammarParser.create_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal162=null;
        Token char_literal164=null;
        Token char_literal166=null;
        msc_grammarParser.instanceName_return instanceName163 = null;

        msc_grammarParser.msgIdentification_return msgIdentification165 = null;


        CommonTree string_literal162_tree=null;
        CommonTree char_literal164_tree=null;
        CommonTree char_literal166_tree=null;
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_instanceName=new RewriteRuleSubtreeStream(adaptor,"rule instanceName");
        RewriteRuleSubtreeStream stream_msgIdentification=new RewriteRuleSubtreeStream(adaptor,"rule msgIdentification");
        try {
            // msc_grammar.g:222:9: ( 'create' instanceName ( '(' msgIdentification ')' )? -> ^( Create instanceName ^( ParameterList ( msgIdentification )? ) ) )
            // msc_grammar.g:222:11: 'create' instanceName ( '(' msgIdentification ')' )?
            {
            string_literal162=(Token)match(input,96,FOLLOW_96_in_create1459);  
            stream_96.add(string_literal162);

            pushFollow(FOLLOW_instanceName_in_create1461);
            instanceName163=instanceName();

            state._fsp--;

            stream_instanceName.add(instanceName163.getTree());
            // msc_grammar.g:222:33: ( '(' msgIdentification ')' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==85) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // msc_grammar.g:222:35: '(' msgIdentification ')'
                    {
                    char_literal164=(Token)match(input,85,FOLLOW_85_in_create1465);  
                    stream_85.add(char_literal164);

                    pushFollow(FOLLOW_msgIdentification_in_create1466);
                    msgIdentification165=msgIdentification();

                    state._fsp--;

                    stream_msgIdentification.add(msgIdentification165.getTree());
                    char_literal166=(Token)match(input,86,FOLLOW_86_in_create1468);  
                    stream_86.add(char_literal166);


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
            // 222:63: -> ^( Create instanceName ^( ParameterList ( msgIdentification )? ) )
            {
                // msc_grammar.g:222:66: ^( Create instanceName ^( ParameterList ( msgIdentification )? ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Create, "Create"), root_1);

                adaptor.addChild(root_1, stream_instanceName.nextTree());
                // msc_grammar.g:222:89: ^( ParameterList ( msgIdentification )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ParameterList, "ParameterList"), root_2);

                // msc_grammar.g:222:105: ( msgIdentification )?
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
    // msc_grammar.g:224:1: stop : 'stop' -> Terminate ;
    public final msc_grammarParser.stop_return stop() throws RecognitionException {
        msc_grammarParser.stop_return retval = new msc_grammarParser.stop_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal167=null;

        CommonTree string_literal167_tree=null;
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");

        try {
            // msc_grammar.g:224:7: ( 'stop' -> Terminate )
            // msc_grammar.g:224:9: 'stop'
            {
            string_literal167=(Token)match(input,97,FOLLOW_97_in_stop1498);  
            stream_97.add(string_literal167);



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
            // 224:16: -> Terminate
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
    // msc_grammar.g:227:1: timerStatement : ( setTimer | resetTimer | timeout );
    public final msc_grammarParser.timerStatement_return timerStatement() throws RecognitionException {
        msc_grammarParser.timerStatement_return retval = new msc_grammarParser.timerStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.setTimer_return setTimer168 = null;

        msc_grammarParser.resetTimer_return resetTimer169 = null;

        msc_grammarParser.timeout_return timeout170 = null;



        try {
            // msc_grammar.g:228:2: ( setTimer | resetTimer | timeout )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt43=1;
                }
                break;
            case 101:
                {
                alt43=2;
                }
                break;
            case 102:
                {
                alt43=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // msc_grammar.g:228:4: setTimer
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_setTimer_in_timerStatement1514);
                    setTimer168=setTimer();

                    state._fsp--;

                    adaptor.addChild(root_0, setTimer168.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:228:15: resetTimer
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_resetTimer_in_timerStatement1518);
                    resetTimer169=resetTimer();

                    state._fsp--;

                    adaptor.addChild(root_0, resetTimer169.getTree());

                    }
                    break;
                case 3 :
                    // msc_grammar.g:228:28: timeout
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_timeout_in_timerStatement1522);
                    timeout170=timeout();

                    state._fsp--;

                    adaptor.addChild(root_0, timeout170.getTree());

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
    // msc_grammar.g:230:1: setTimer : 'starttimer' name ( ',' instanceName )? ( duration ) -> ^( StartTimer name ( instanceName )? ( duration )? ) ;
    public final msc_grammarParser.setTimer_return setTimer() throws RecognitionException {
        msc_grammarParser.setTimer_return retval = new msc_grammarParser.setTimer_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal171=null;
        Token char_literal173=null;
        msc_grammarParser.name_return name172 = null;

        msc_grammarParser.instanceName_return instanceName174 = null;

        msc_grammarParser.duration_return duration175 = null;


        CommonTree string_literal171_tree=null;
        CommonTree char_literal173_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_duration=new RewriteRuleSubtreeStream(adaptor,"rule duration");
        RewriteRuleSubtreeStream stream_instanceName=new RewriteRuleSubtreeStream(adaptor,"rule instanceName");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        try {
            // msc_grammar.g:231:2: ( 'starttimer' name ( ',' instanceName )? ( duration ) -> ^( StartTimer name ( instanceName )? ( duration )? ) )
            // msc_grammar.g:231:4: 'starttimer' name ( ',' instanceName )? ( duration )
            {
            string_literal171=(Token)match(input,98,FOLLOW_98_in_setTimer1533);  
            stream_98.add(string_literal171);

            pushFollow(FOLLOW_name_in_setTimer1535);
            name172=name();

            state._fsp--;

            stream_name.add(name172.getTree());
            // msc_grammar.g:231:22: ( ',' instanceName )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==65) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // msc_grammar.g:231:24: ',' instanceName
                    {
                    char_literal173=(Token)match(input,65,FOLLOW_65_in_setTimer1539);  
                    stream_65.add(char_literal173);

                    pushFollow(FOLLOW_instanceName_in_setTimer1541);
                    instanceName174=instanceName();

                    state._fsp--;

                    stream_instanceName.add(instanceName174.getTree());

                    }
                    break;

            }

            // msc_grammar.g:231:44: ( duration )
            // msc_grammar.g:231:46: duration
            {
            pushFollow(FOLLOW_duration_in_setTimer1548);
            duration175=duration();

            state._fsp--;

            stream_duration.add(duration175.getTree());

            }



            // AST REWRITE
            // elements: name, duration, instanceName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 232:4: -> ^( StartTimer name ( instanceName )? ( duration )? )
            {
                // msc_grammar.g:232:7: ^( StartTimer name ( instanceName )? ( duration )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(StartTimer, "StartTimer"), root_1);

                adaptor.addChild(root_1, stream_name.nextTree());
                // msc_grammar.g:232:26: ( instanceName )?
                if ( stream_instanceName.hasNext() ) {
                    adaptor.addChild(root_1, stream_instanceName.nextTree());

                }
                stream_instanceName.reset();
                // msc_grammar.g:232:40: ( duration )?
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
    // msc_grammar.g:234:1: duration : '[' ( infNatural )? ( ',' infNatural )? ']' ;
    public final msc_grammarParser.duration_return duration() throws RecognitionException {
        msc_grammarParser.duration_return retval = new msc_grammarParser.duration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal176=null;
        Token char_literal178=null;
        Token char_literal180=null;
        msc_grammarParser.infNatural_return infNatural177 = null;

        msc_grammarParser.infNatural_return infNatural179 = null;


        CommonTree char_literal176_tree=null;
        CommonTree char_literal178_tree=null;
        CommonTree char_literal180_tree=null;

        try {
            // msc_grammar.g:235:2: ( '[' ( infNatural )? ( ',' infNatural )? ']' )
            // msc_grammar.g:235:4: '[' ( infNatural )? ( ',' infNatural )? ']'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal176=(Token)match(input,99,FOLLOW_99_in_duration1581); 
            char_literal176_tree = (CommonTree)adaptor.create(char_literal176);
            adaptor.addChild(root_0, char_literal176_tree);

            // msc_grammar.g:235:8: ( infNatural )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=94 && LA45_0<=95)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // msc_grammar.g:235:10: infNatural
                    {
                    pushFollow(FOLLOW_infNatural_in_duration1585);
                    infNatural177=infNatural();

                    state._fsp--;

                    adaptor.addChild(root_0, infNatural177.getTree());

                    }
                    break;

            }

            // msc_grammar.g:235:24: ( ',' infNatural )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==65) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // msc_grammar.g:235:26: ',' infNatural
                    {
                    char_literal178=(Token)match(input,65,FOLLOW_65_in_duration1592); 
                    char_literal178_tree = (CommonTree)adaptor.create(char_literal178);
                    adaptor.addChild(root_0, char_literal178_tree);

                    pushFollow(FOLLOW_infNatural_in_duration1594);
                    infNatural179=infNatural();

                    state._fsp--;

                    adaptor.addChild(root_0, infNatural179.getTree());

                    }
                    break;

            }

            char_literal180=(Token)match(input,100,FOLLOW_100_in_duration1599); 
            char_literal180_tree = (CommonTree)adaptor.create(char_literal180);
            adaptor.addChild(root_0, char_literal180_tree);


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
    // msc_grammar.g:237:1: resetTimer : 'stoptimer' name ( ',' instanceName )? -> ^( StopTimer name ( instanceName )? ) ;
    public final msc_grammarParser.resetTimer_return resetTimer() throws RecognitionException {
        msc_grammarParser.resetTimer_return retval = new msc_grammarParser.resetTimer_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal181=null;
        Token char_literal183=null;
        msc_grammarParser.name_return name182 = null;

        msc_grammarParser.instanceName_return instanceName184 = null;


        CommonTree string_literal181_tree=null;
        CommonTree char_literal183_tree=null;
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_instanceName=new RewriteRuleSubtreeStream(adaptor,"rule instanceName");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        try {
            // msc_grammar.g:238:2: ( 'stoptimer' name ( ',' instanceName )? -> ^( StopTimer name ( instanceName )? ) )
            // msc_grammar.g:238:4: 'stoptimer' name ( ',' instanceName )?
            {
            string_literal181=(Token)match(input,101,FOLLOW_101_in_resetTimer1610);  
            stream_101.add(string_literal181);

            pushFollow(FOLLOW_name_in_resetTimer1612);
            name182=name();

            state._fsp--;

            stream_name.add(name182.getTree());
            // msc_grammar.g:238:21: ( ',' instanceName )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==65) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // msc_grammar.g:238:23: ',' instanceName
                    {
                    char_literal183=(Token)match(input,65,FOLLOW_65_in_resetTimer1616);  
                    stream_65.add(char_literal183);

                    pushFollow(FOLLOW_instanceName_in_resetTimer1618);
                    instanceName184=instanceName();

                    state._fsp--;

                    stream_instanceName.add(instanceName184.getTree());

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
            // 238:43: -> ^( StopTimer name ( instanceName )? )
            {
                // msc_grammar.g:238:46: ^( StopTimer name ( instanceName )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(StopTimer, "StopTimer"), root_1);

                adaptor.addChild(root_1, stream_name.nextTree());
                // msc_grammar.g:238:64: ( instanceName )?
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
    // msc_grammar.g:240:1: timeout : 'timeout' name ( ',' instanceName )? -> ^( Timeout name ( instanceName )? ) ;
    public final msc_grammarParser.timeout_return timeout() throws RecognitionException {
        msc_grammarParser.timeout_return retval = new msc_grammarParser.timeout_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal185=null;
        Token char_literal187=null;
        msc_grammarParser.name_return name186 = null;

        msc_grammarParser.instanceName_return instanceName188 = null;


        CommonTree string_literal185_tree=null;
        CommonTree char_literal187_tree=null;
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_instanceName=new RewriteRuleSubtreeStream(adaptor,"rule instanceName");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        try {
            // msc_grammar.g:240:9: ( 'timeout' name ( ',' instanceName )? -> ^( Timeout name ( instanceName )? ) )
            // msc_grammar.g:240:11: 'timeout' name ( ',' instanceName )?
            {
            string_literal185=(Token)match(input,102,FOLLOW_102_in_timeout1643);  
            stream_102.add(string_literal185);

            pushFollow(FOLLOW_name_in_timeout1645);
            name186=name();

            state._fsp--;

            stream_name.add(name186.getTree());
            // msc_grammar.g:240:26: ( ',' instanceName )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==65) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // msc_grammar.g:240:28: ',' instanceName
                    {
                    char_literal187=(Token)match(input,65,FOLLOW_65_in_timeout1649);  
                    stream_65.add(char_literal187);

                    pushFollow(FOLLOW_instanceName_in_timeout1651);
                    instanceName188=instanceName();

                    state._fsp--;

                    stream_instanceName.add(instanceName188.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: instanceName, name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 240:48: -> ^( Timeout name ( instanceName )? )
            {
                // msc_grammar.g:240:51: ^( Timeout name ( instanceName )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Timeout, "Timeout"), root_1);

                adaptor.addChild(root_1, stream_name.nextTree());
                // msc_grammar.g:240:67: ( instanceName )?
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
    // msc_grammar.g:244:1: mscGateInterface : ( mscGateDef )+ ;
    public final msc_grammarParser.mscGateInterface_return mscGateInterface() throws RecognitionException {
        msc_grammarParser.mscGateInterface_return retval = new msc_grammarParser.mscGateInterface_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.mscGateDef_return mscGateDef189 = null;



        try {
            // msc_grammar.g:245:2: ( ( mscGateDef )+ )
            // msc_grammar.g:245:4: ( mscGateDef )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // msc_grammar.g:245:4: ( mscGateDef )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==103) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // msc_grammar.g:245:4: mscGateDef
            	    {
            	    pushFollow(FOLLOW_mscGateDef_in_mscGateInterface1681);
            	    mscGateDef189=mscGateDef();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mscGateDef189.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
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
    // msc_grammar.g:247:1: mscGateDef : 'gate' ( msgGate | orderGate ) end ;
    public final msc_grammarParser.mscGateDef_return mscGateDef() throws RecognitionException {
        msc_grammarParser.mscGateDef_return retval = new msc_grammarParser.mscGateDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal190=null;
        msc_grammarParser.msgGate_return msgGate191 = null;

        msc_grammarParser.orderGate_return orderGate192 = null;

        msc_grammarParser.end_return end193 = null;


        CommonTree string_literal190_tree=null;

        try {
            // msc_grammar.g:248:2: ( 'gate' ( msgGate | orderGate ) end )
            // msc_grammar.g:248:4: 'gate' ( msgGate | orderGate ) end
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal190=(Token)match(input,103,FOLLOW_103_in_mscGateDef1693); 
            string_literal190_tree = (CommonTree)adaptor.create(string_literal190);
            adaptor.addChild(root_0, string_literal190_tree);

            // msc_grammar.g:248:11: ( msgGate | orderGate )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==NAME) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==67||LA50_1==69) ) {
                    alt50=1;
                }
                else if ( (LA50_1==83||(LA50_1>=104 && LA50_1<=105)) ) {
                    alt50=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA50_0==67||LA50_0==69) ) {
                alt50=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // msc_grammar.g:248:13: msgGate
                    {
                    pushFollow(FOLLOW_msgGate_in_mscGateDef1697);
                    msgGate191=msgGate();

                    state._fsp--;

                    adaptor.addChild(root_0, msgGate191.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:248:23: orderGate
                    {
                    pushFollow(FOLLOW_orderGate_in_mscGateDef1701);
                    orderGate192=orderGate();

                    state._fsp--;

                    adaptor.addChild(root_0, orderGate192.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_end_in_mscGateDef1705);
            end193=end();

            state._fsp--;

            adaptor.addChild(root_0, end193.getTree());

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
    // msc_grammar.g:250:1: msgGate : ( defInGate | defOutGate );
    public final msc_grammarParser.msgGate_return msgGate() throws RecognitionException {
        msc_grammarParser.msgGate_return retval = new msc_grammarParser.msgGate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.defInGate_return defInGate194 = null;

        msc_grammarParser.defOutGate_return defOutGate195 = null;



        try {
            // msc_grammar.g:250:9: ( defInGate | defOutGate )
            int alt51=2;
            switch ( input.LA(1) ) {
            case NAME:
                {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==67) ) {
                    alt51=1;
                }
                else if ( (LA51_1==69) ) {
                    alt51=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
                }
                break;
            case 67:
                {
                alt51=1;
                }
                break;
            case 69:
                {
                alt51=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // msc_grammar.g:250:11: defInGate
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defInGate_in_msgGate1714);
                    defInGate194=defInGate();

                    state._fsp--;

                    adaptor.addChild(root_0, defInGate194.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:250:23: defOutGate
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defOutGate_in_msgGate1718);
                    defOutGate195=defOutGate();

                    state._fsp--;

                    adaptor.addChild(root_0, defOutGate195.getTree());

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
    // msc_grammar.g:252:1: orderGate : ( defOrderInGate | defOrderOutGate );
    public final msc_grammarParser.orderGate_return orderGate() throws RecognitionException {
        msc_grammarParser.orderGate_return retval = new msc_grammarParser.orderGate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.defOrderInGate_return defOrderInGate196 = null;

        msc_grammarParser.defOrderOutGate_return defOrderOutGate197 = null;



        try {
            // msc_grammar.g:253:2: ( defOrderInGate | defOrderOutGate )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==NAME) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==83||LA52_1==105) ) {
                    alt52=2;
                }
                else if ( (LA52_1==104) ) {
                    alt52=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // msc_grammar.g:253:4: defOrderInGate
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defOrderInGate_in_orderGate1729);
                    defOrderInGate196=defOrderInGate();

                    state._fsp--;

                    adaptor.addChild(root_0, defOrderInGate196.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:253:21: defOrderOutGate
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defOrderOutGate_in_orderGate1733);
                    defOrderOutGate197=defOrderOutGate();

                    state._fsp--;

                    adaptor.addChild(root_0, defOrderOutGate197.getTree());

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
    // msc_grammar.g:255:1: defInGate : ( gateName )? 'out' msgIdentification 'to' inputDest ;
    public final msc_grammarParser.defInGate_return defInGate() throws RecognitionException {
        msc_grammarParser.defInGate_return retval = new msc_grammarParser.defInGate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal199=null;
        Token string_literal201=null;
        msc_grammarParser.gateName_return gateName198 = null;

        msc_grammarParser.msgIdentification_return msgIdentification200 = null;

        msc_grammarParser.inputDest_return inputDest202 = null;


        CommonTree string_literal199_tree=null;
        CommonTree string_literal201_tree=null;

        try {
            // msc_grammar.g:256:2: ( ( gateName )? 'out' msgIdentification 'to' inputDest )
            // msc_grammar.g:256:4: ( gateName )? 'out' msgIdentification 'to' inputDest
            {
            root_0 = (CommonTree)adaptor.nil();

            // msc_grammar.g:256:4: ( gateName )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==NAME) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // msc_grammar.g:256:6: gateName
                    {
                    pushFollow(FOLLOW_gateName_in_defInGate1746);
                    gateName198=gateName();

                    state._fsp--;

                    adaptor.addChild(root_0, gateName198.getTree());

                    }
                    break;

            }

            string_literal199=(Token)match(input,67,FOLLOW_67_in_defInGate1751); 
            string_literal199_tree = (CommonTree)adaptor.create(string_literal199);
            adaptor.addChild(root_0, string_literal199_tree);

            pushFollow(FOLLOW_msgIdentification_in_defInGate1753);
            msgIdentification200=msgIdentification();

            state._fsp--;

            adaptor.addChild(root_0, msgIdentification200.getTree());
            string_literal201=(Token)match(input,68,FOLLOW_68_in_defInGate1755); 
            string_literal201_tree = (CommonTree)adaptor.create(string_literal201);
            adaptor.addChild(root_0, string_literal201_tree);

            pushFollow(FOLLOW_inputDest_in_defInGate1757);
            inputDest202=inputDest();

            state._fsp--;

            adaptor.addChild(root_0, inputDest202.getTree());

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
    // msc_grammar.g:258:1: defOutGate : ( gateName )? 'in' msgIdentification 'from' outputDest ;
    public final msc_grammarParser.defOutGate_return defOutGate() throws RecognitionException {
        msc_grammarParser.defOutGate_return retval = new msc_grammarParser.defOutGate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal204=null;
        Token string_literal206=null;
        msc_grammarParser.gateName_return gateName203 = null;

        msc_grammarParser.msgIdentification_return msgIdentification205 = null;

        msc_grammarParser.outputDest_return outputDest207 = null;


        CommonTree string_literal204_tree=null;
        CommonTree string_literal206_tree=null;

        try {
            // msc_grammar.g:259:2: ( ( gateName )? 'in' msgIdentification 'from' outputDest )
            // msc_grammar.g:259:4: ( gateName )? 'in' msgIdentification 'from' outputDest
            {
            root_0 = (CommonTree)adaptor.nil();

            // msc_grammar.g:259:4: ( gateName )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==NAME) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // msc_grammar.g:259:6: gateName
                    {
                    pushFollow(FOLLOW_gateName_in_defOutGate1770);
                    gateName203=gateName();

                    state._fsp--;

                    adaptor.addChild(root_0, gateName203.getTree());

                    }
                    break;

            }

            string_literal204=(Token)match(input,69,FOLLOW_69_in_defOutGate1775); 
            string_literal204_tree = (CommonTree)adaptor.create(string_literal204);
            adaptor.addChild(root_0, string_literal204_tree);

            pushFollow(FOLLOW_msgIdentification_in_defOutGate1777);
            msgIdentification205=msgIdentification();

            state._fsp--;

            adaptor.addChild(root_0, msgIdentification205.getTree());
            string_literal206=(Token)match(input,70,FOLLOW_70_in_defOutGate1779); 
            string_literal206_tree = (CommonTree)adaptor.create(string_literal206);
            adaptor.addChild(root_0, string_literal206_tree);

            pushFollow(FOLLOW_outputDest_in_defOutGate1781);
            outputDest207=outputDest();

            state._fsp--;

            adaptor.addChild(root_0, outputDest207.getTree());

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
    // msc_grammar.g:261:1: defOrderInGate : gateName 'before' orderDest ;
    public final msc_grammarParser.defOrderInGate_return defOrderInGate() throws RecognitionException {
        msc_grammarParser.defOrderInGate_return retval = new msc_grammarParser.defOrderInGate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal209=null;
        msc_grammarParser.gateName_return gateName208 = null;

        msc_grammarParser.orderDest_return orderDest210 = null;


        CommonTree string_literal209_tree=null;

        try {
            // msc_grammar.g:262:2: ( gateName 'before' orderDest )
            // msc_grammar.g:262:4: gateName 'before' orderDest
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_gateName_in_defOrderInGate1792);
            gateName208=gateName();

            state._fsp--;

            adaptor.addChild(root_0, gateName208.getTree());
            string_literal209=(Token)match(input,104,FOLLOW_104_in_defOrderInGate1794); 
            string_literal209_tree = (CommonTree)adaptor.create(string_literal209);
            adaptor.addChild(root_0, string_literal209_tree);

            pushFollow(FOLLOW_orderDest_in_defOrderInGate1796);
            orderDest210=orderDest();

            state._fsp--;

            adaptor.addChild(root_0, orderDest210.getTree());

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
    // msc_grammar.g:264:1: defOrderOutGate : gateName ( 'after' orderDestList )? ;
    public final msc_grammarParser.defOrderOutGate_return defOrderOutGate() throws RecognitionException {
        msc_grammarParser.defOrderOutGate_return retval = new msc_grammarParser.defOrderOutGate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal212=null;
        msc_grammarParser.gateName_return gateName211 = null;

        msc_grammarParser.orderDestList_return orderDestList213 = null;


        CommonTree string_literal212_tree=null;

        try {
            // msc_grammar.g:265:2: ( gateName ( 'after' orderDestList )? )
            // msc_grammar.g:265:4: gateName ( 'after' orderDestList )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_gateName_in_defOrderOutGate1806);
            gateName211=gateName();

            state._fsp--;

            adaptor.addChild(root_0, gateName211.getTree());
            // msc_grammar.g:265:13: ( 'after' orderDestList )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==105) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // msc_grammar.g:265:15: 'after' orderDestList
                    {
                    string_literal212=(Token)match(input,105,FOLLOW_105_in_defOrderOutGate1810); 
                    string_literal212_tree = (CommonTree)adaptor.create(string_literal212);
                    adaptor.addChild(root_0, string_literal212_tree);

                    pushFollow(FOLLOW_orderDestList_in_defOrderOutGate1812);
                    orderDestList213=orderDestList();

                    state._fsp--;

                    adaptor.addChild(root_0, orderDestList213.getTree());

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
    // msc_grammar.g:267:1: inputDest : ( 'lost' ( inputAddress )? | inputAddress );
    public final msc_grammarParser.inputDest_return inputDest() throws RecognitionException {
        msc_grammarParser.inputDest_return retval = new msc_grammarParser.inputDest_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal214=null;
        msc_grammarParser.inputAddress_return inputAddress215 = null;

        msc_grammarParser.inputAddress_return inputAddress216 = null;


        CommonTree string_literal214_tree=null;

        try {
            // msc_grammar.g:268:2: ( 'lost' ( inputAddress )? | inputAddress )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==71) ) {
                alt57=1;
            }
            else if ( (LA57_0==NAME||LA57_0==73) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // msc_grammar.g:268:4: 'lost' ( inputAddress )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal214=(Token)match(input,71,FOLLOW_71_in_inputDest1827); 
                    string_literal214_tree = (CommonTree)adaptor.create(string_literal214);
                    adaptor.addChild(root_0, string_literal214_tree);

                    // msc_grammar.g:268:11: ( inputAddress )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==NAME||LA56_0==73) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // msc_grammar.g:268:13: inputAddress
                            {
                            pushFollow(FOLLOW_inputAddress_in_inputDest1831);
                            inputAddress215=inputAddress();

                            state._fsp--;

                            adaptor.addChild(root_0, inputAddress215.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // msc_grammar.g:268:31: inputAddress
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_inputAddress_in_inputDest1838);
                    inputAddress216=inputAddress();

                    state._fsp--;

                    adaptor.addChild(root_0, inputAddress216.getTree());

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
    // msc_grammar.g:270:1: outputDest : ( 'found' ( outputAddress )? | outputAddress );
    public final msc_grammarParser.outputDest_return outputDest() throws RecognitionException {
        msc_grammarParser.outputDest_return retval = new msc_grammarParser.outputDest_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal217=null;
        msc_grammarParser.outputAddress_return outputAddress218 = null;

        msc_grammarParser.outputAddress_return outputAddress219 = null;


        CommonTree string_literal217_tree=null;

        try {
            // msc_grammar.g:271:2: ( 'found' ( outputAddress )? | outputAddress )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==72) ) {
                alt59=1;
            }
            else if ( (LA59_0==NAME||LA59_0==73) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // msc_grammar.g:271:4: 'found' ( outputAddress )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal217=(Token)match(input,72,FOLLOW_72_in_outputDest1849); 
                    string_literal217_tree = (CommonTree)adaptor.create(string_literal217);
                    adaptor.addChild(root_0, string_literal217_tree);

                    // msc_grammar.g:271:12: ( outputAddress )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==NAME||LA58_0==73) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // msc_grammar.g:271:14: outputAddress
                            {
                            pushFollow(FOLLOW_outputAddress_in_outputDest1853);
                            outputAddress218=outputAddress();

                            state._fsp--;

                            adaptor.addChild(root_0, outputAddress218.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // msc_grammar.g:271:33: outputAddress
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_outputAddress_in_outputDest1860);
                    outputAddress219=outputAddress();

                    state._fsp--;

                    adaptor.addChild(root_0, outputAddress219.getTree());

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
    // msc_grammar.g:273:1: orderDest : ( eventName | 'env' 'via' gateName -> ^( MsgGate gateName ) );
    public final msc_grammarParser.orderDest_return orderDest() throws RecognitionException {
        msc_grammarParser.orderDest_return retval = new msc_grammarParser.orderDest_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal221=null;
        Token string_literal222=null;
        msc_grammarParser.eventName_return eventName220 = null;

        msc_grammarParser.gateName_return gateName223 = null;


        CommonTree string_literal221_tree=null;
        CommonTree string_literal222_tree=null;
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_gateName=new RewriteRuleSubtreeStream(adaptor,"rule gateName");
        try {
            // msc_grammar.g:274:2: ( eventName | 'env' 'via' gateName -> ^( MsgGate gateName ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==NAME) ) {
                alt60=1;
            }
            else if ( (LA60_0==73) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // msc_grammar.g:274:4: eventName
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_eventName_in_orderDest1871);
                    eventName220=eventName();

                    state._fsp--;

                    adaptor.addChild(root_0, eventName220.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:275:4: 'env' 'via' gateName
                    {
                    string_literal221=(Token)match(input,73,FOLLOW_73_in_orderDest1876);  
                    stream_73.add(string_literal221);

                    string_literal222=(Token)match(input,74,FOLLOW_74_in_orderDest1878);  
                    stream_74.add(string_literal222);

                    pushFollow(FOLLOW_gateName_in_orderDest1880);
                    gateName223=gateName();

                    state._fsp--;

                    stream_gateName.add(gateName223.getTree());


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
                    // 275:25: -> ^( MsgGate gateName )
                    {
                        // msc_grammar.g:275:28: ^( MsgGate gateName )
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
    // msc_grammar.g:277:1: orderDestList : orderDest ( ',' orderDestList )? -> orderDest ( orderDestList )? ;
    public final msc_grammarParser.orderDestList_return orderDestList() throws RecognitionException {
        msc_grammarParser.orderDestList_return retval = new msc_grammarParser.orderDestList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal225=null;
        msc_grammarParser.orderDest_return orderDest224 = null;

        msc_grammarParser.orderDestList_return orderDestList226 = null;


        CommonTree char_literal225_tree=null;
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_orderDestList=new RewriteRuleSubtreeStream(adaptor,"rule orderDestList");
        RewriteRuleSubtreeStream stream_orderDest=new RewriteRuleSubtreeStream(adaptor,"rule orderDest");
        try {
            // msc_grammar.g:278:2: ( orderDest ( ',' orderDestList )? -> orderDest ( orderDestList )? )
            // msc_grammar.g:278:4: orderDest ( ',' orderDestList )?
            {
            pushFollow(FOLLOW_orderDest_in_orderDestList1901);
            orderDest224=orderDest();

            state._fsp--;

            stream_orderDest.add(orderDest224.getTree());
            // msc_grammar.g:278:14: ( ',' orderDestList )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==65) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // msc_grammar.g:278:16: ',' orderDestList
                    {
                    char_literal225=(Token)match(input,65,FOLLOW_65_in_orderDestList1905);  
                    stream_65.add(char_literal225);

                    pushFollow(FOLLOW_orderDestList_in_orderDestList1907);
                    orderDestList226=orderDestList();

                    state._fsp--;

                    stream_orderDestList.add(orderDestList226.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: orderDestList, orderDest
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 278:37: -> orderDest ( orderDestList )?
            {
                adaptor.addChild(root_0, stream_orderDest.nextTree());
                // msc_grammar.g:278:50: ( orderDestList )?
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
    // msc_grammar.g:282:1: coregion : 'concurrent' end ( coevent )* 'endconcurrent' -> ^( Coregion ( coevent )* ) ;
    public final msc_grammarParser.coregion_return coregion() throws RecognitionException {
        msc_grammarParser.coregion_return retval = new msc_grammarParser.coregion_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal227=null;
        Token string_literal230=null;
        msc_grammarParser.end_return end228 = null;

        msc_grammarParser.coevent_return coevent229 = null;


        CommonTree string_literal227_tree=null;
        CommonTree string_literal230_tree=null;
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleSubtreeStream stream_coevent=new RewriteRuleSubtreeStream(adaptor,"rule coevent");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:283:2: ( 'concurrent' end ( coevent )* 'endconcurrent' -> ^( Coregion ( coevent )* ) )
            // msc_grammar.g:283:4: 'concurrent' end ( coevent )* 'endconcurrent'
            {
            string_literal227=(Token)match(input,106,FOLLOW_106_in_coregion1930);  
            stream_106.add(string_literal227);

            pushFollow(FOLLOW_end_in_coregion1932);
            end228=end();

            state._fsp--;

            stream_end.add(end228.getTree());
            // msc_grammar.g:283:21: ( coevent )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==NAME||(LA62_0>=66 && LA62_0<=67)||LA62_0==69||LA62_0==75||LA62_0==96||LA62_0==98||(LA62_0>=101 && LA62_0<=102)) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // msc_grammar.g:283:21: coevent
            	    {
            	    pushFollow(FOLLOW_coevent_in_coregion1934);
            	    coevent229=coevent();

            	    state._fsp--;

            	    stream_coevent.add(coevent229.getTree());

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            string_literal230=(Token)match(input,107,FOLLOW_107_in_coregion1937);  
            stream_107.add(string_literal230);



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
            // 283:46: -> ^( Coregion ( coevent )* )
            {
                // msc_grammar.g:283:49: ^( Coregion ( coevent )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Coregion, "Coregion"), root_1);

                // msc_grammar.g:283:61: ( coevent )*
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
    // msc_grammar.g:285:1: coevent : orderableEvent end -> orderableEvent ;
    public final msc_grammarParser.coevent_return coevent() throws RecognitionException {
        msc_grammarParser.coevent_return retval = new msc_grammarParser.coevent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.orderableEvent_return orderableEvent231 = null;

        msc_grammarParser.end_return end232 = null;


        RewriteRuleSubtreeStream stream_orderableEvent=new RewriteRuleSubtreeStream(adaptor,"rule orderableEvent");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:285:9: ( orderableEvent end -> orderableEvent )
            // msc_grammar.g:285:11: orderableEvent end
            {
            pushFollow(FOLLOW_orderableEvent_in_coevent1957);
            orderableEvent231=orderableEvent();

            state._fsp--;

            stream_orderableEvent.add(orderableEvent231.getTree());
            pushFollow(FOLLOW_end_in_coevent1959);
            end232=end();

            state._fsp--;

            stream_end.add(end232.getTree());


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
            // 285:30: -> orderableEvent
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
    // msc_grammar.g:289:1: generalOrdering : ( before ( after )? | after );
    public final msc_grammarParser.generalOrdering_return generalOrdering() throws RecognitionException {
        msc_grammarParser.generalOrdering_return retval = new msc_grammarParser.generalOrdering_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.before_return before233 = null;

        msc_grammarParser.after_return after234 = null;

        msc_grammarParser.after_return after235 = null;



        try {
            // msc_grammar.g:290:2: ( before ( after )? | after )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==104) ) {
                alt64=1;
            }
            else if ( (LA64_0==105) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // msc_grammar.g:290:4: before ( after )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_before_in_generalOrdering1975);
                    before233=before();

                    state._fsp--;

                    adaptor.addChild(root_0, before233.getTree());
                    // msc_grammar.g:290:11: ( after )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==105) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // msc_grammar.g:290:11: after
                            {
                            pushFollow(FOLLOW_after_in_generalOrdering1977);
                            after234=after();

                            state._fsp--;

                            adaptor.addChild(root_0, after234.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // msc_grammar.g:291:4: after
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_after_in_generalOrdering1983);
                    after235=after();

                    state._fsp--;

                    adaptor.addChild(root_0, after235.getTree());

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
    // msc_grammar.g:293:1: before : 'before' orderDestList -> ^( Before orderDestList ) ;
    public final msc_grammarParser.before_return before() throws RecognitionException {
        msc_grammarParser.before_return retval = new msc_grammarParser.before_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal236=null;
        msc_grammarParser.orderDestList_return orderDestList237 = null;


        CommonTree string_literal236_tree=null;
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleSubtreeStream stream_orderDestList=new RewriteRuleSubtreeStream(adaptor,"rule orderDestList");
        try {
            // msc_grammar.g:293:9: ( 'before' orderDestList -> ^( Before orderDestList ) )
            // msc_grammar.g:293:11: 'before' orderDestList
            {
            string_literal236=(Token)match(input,104,FOLLOW_104_in_before1993);  
            stream_104.add(string_literal236);

            pushFollow(FOLLOW_orderDestList_in_before1995);
            orderDestList237=orderDestList();

            state._fsp--;

            stream_orderDestList.add(orderDestList237.getTree());


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
            // 293:34: -> ^( Before orderDestList )
            {
                // msc_grammar.g:293:37: ^( Before orderDestList )
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
    // msc_grammar.g:295:1: after : 'after' orderDestList -> ^( After orderDestList ) ;
    public final msc_grammarParser.after_return after() throws RecognitionException {
        msc_grammarParser.after_return retval = new msc_grammarParser.after_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal238=null;
        msc_grammarParser.orderDestList_return orderDestList239 = null;


        CommonTree string_literal238_tree=null;
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleSubtreeStream stream_orderDestList=new RewriteRuleSubtreeStream(adaptor,"rule orderDestList");
        try {
            // msc_grammar.g:295:8: ( 'after' orderDestList -> ^( After orderDestList ) )
            // msc_grammar.g:295:10: 'after' orderDestList
            {
            string_literal238=(Token)match(input,105,FOLLOW_105_in_after2015);  
            stream_105.add(string_literal238);

            pushFollow(FOLLOW_orderDestList_in_after2017);
            orderDestList239=orderDestList();

            state._fsp--;

            stream_orderDestList.add(orderDestList239.getTree());


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
            // 295:32: -> ^( After orderDestList )
            {
                // msc_grammar.g:295:35: ^( After orderDestList )
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
    // msc_grammar.g:299:1: mscReference : 'reference' mscRefExpr -> ^( Ref mscRefExpr ) ;
    public final msc_grammarParser.mscReference_return mscReference() throws RecognitionException {
        msc_grammarParser.mscReference_return retval = new msc_grammarParser.mscReference_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal240=null;
        msc_grammarParser.mscRefExpr_return mscRefExpr241 = null;


        CommonTree string_literal240_tree=null;
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleSubtreeStream stream_mscRefExpr=new RewriteRuleSubtreeStream(adaptor,"rule mscRefExpr");
        try {
            // msc_grammar.g:300:2: ( 'reference' mscRefExpr -> ^( Ref mscRefExpr ) )
            // msc_grammar.g:300:4: 'reference' mscRefExpr
            {
            string_literal240=(Token)match(input,108,FOLLOW_108_in_mscReference2041);  
            stream_108.add(string_literal240);

            pushFollow(FOLLOW_mscRefExpr_in_mscReference2043);
            mscRefExpr241=mscRefExpr();

            state._fsp--;

            stream_mscRefExpr.add(mscRefExpr241.getTree());


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
            // 300:27: -> ^( Ref mscRefExpr )
            {
                // msc_grammar.g:300:30: ^( Ref mscRefExpr )
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
    // msc_grammar.g:302:1: mscRefExpr : mscRefParExpr ( 'alt' mscRefParExpr )* -> ^( Alt ( mscRefParExpr )+ ) ;
    public final msc_grammarParser.mscRefExpr_return mscRefExpr() throws RecognitionException {
        msc_grammarParser.mscRefExpr_return retval = new msc_grammarParser.mscRefExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal243=null;
        msc_grammarParser.mscRefParExpr_return mscRefParExpr242 = null;

        msc_grammarParser.mscRefParExpr_return mscRefParExpr244 = null;


        CommonTree string_literal243_tree=null;
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleSubtreeStream stream_mscRefParExpr=new RewriteRuleSubtreeStream(adaptor,"rule mscRefParExpr");
        try {
            // msc_grammar.g:303:2: ( mscRefParExpr ( 'alt' mscRefParExpr )* -> ^( Alt ( mscRefParExpr )+ ) )
            // msc_grammar.g:303:4: mscRefParExpr ( 'alt' mscRefParExpr )*
            {
            pushFollow(FOLLOW_mscRefParExpr_in_mscRefExpr2064);
            mscRefParExpr242=mscRefParExpr();

            state._fsp--;

            stream_mscRefParExpr.add(mscRefParExpr242.getTree());
            // msc_grammar.g:303:18: ( 'alt' mscRefParExpr )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==90) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // msc_grammar.g:303:20: 'alt' mscRefParExpr
            	    {
            	    string_literal243=(Token)match(input,90,FOLLOW_90_in_mscRefExpr2068);  
            	    stream_90.add(string_literal243);

            	    pushFollow(FOLLOW_mscRefParExpr_in_mscRefExpr2070);
            	    mscRefParExpr244=mscRefParExpr();

            	    state._fsp--;

            	    stream_mscRefParExpr.add(mscRefParExpr244.getTree());

            	    }
            	    break;

            	default :
            	    break loop65;
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
            // 303:43: -> ^( Alt ( mscRefParExpr )+ )
            {
                // msc_grammar.g:303:46: ^( Alt ( mscRefParExpr )+ )
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
    // msc_grammar.g:305:1: mscRefParExpr : mscRefSeqExpr ( 'par' mscRefSeqExpr )* -> ^( Par ( mscRefSeqExpr )+ ) ;
    public final msc_grammarParser.mscRefParExpr_return mscRefParExpr() throws RecognitionException {
        msc_grammarParser.mscRefParExpr_return retval = new msc_grammarParser.mscRefParExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal246=null;
        msc_grammarParser.mscRefSeqExpr_return mscRefSeqExpr245 = null;

        msc_grammarParser.mscRefSeqExpr_return mscRefSeqExpr247 = null;


        CommonTree string_literal246_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleSubtreeStream stream_mscRefSeqExpr=new RewriteRuleSubtreeStream(adaptor,"rule mscRefSeqExpr");
        try {
            // msc_grammar.g:306:2: ( mscRefSeqExpr ( 'par' mscRefSeqExpr )* -> ^( Par ( mscRefSeqExpr )+ ) )
            // msc_grammar.g:306:4: mscRefSeqExpr ( 'par' mscRefSeqExpr )*
            {
            pushFollow(FOLLOW_mscRefSeqExpr_in_mscRefParExpr2095);
            mscRefSeqExpr245=mscRefSeqExpr();

            state._fsp--;

            stream_mscRefSeqExpr.add(mscRefSeqExpr245.getTree());
            // msc_grammar.g:306:18: ( 'par' mscRefSeqExpr )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==91) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // msc_grammar.g:306:20: 'par' mscRefSeqExpr
            	    {
            	    string_literal246=(Token)match(input,91,FOLLOW_91_in_mscRefParExpr2099);  
            	    stream_91.add(string_literal246);

            	    pushFollow(FOLLOW_mscRefSeqExpr_in_mscRefParExpr2101);
            	    mscRefSeqExpr247=mscRefSeqExpr();

            	    state._fsp--;

            	    stream_mscRefSeqExpr.add(mscRefSeqExpr247.getTree());

            	    }
            	    break;

            	default :
            	    break loop66;
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
            // 306:43: -> ^( Par ( mscRefSeqExpr )+ )
            {
                // msc_grammar.g:306:46: ^( Par ( mscRefSeqExpr )+ )
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
    // msc_grammar.g:308:1: mscRefSeqExpr : mscRefIdentExpr ( 'seq' mscRefIdentExpr )* -> ^( Seq ( mscRefIdentExpr )+ ) ;
    public final msc_grammarParser.mscRefSeqExpr_return mscRefSeqExpr() throws RecognitionException {
        msc_grammarParser.mscRefSeqExpr_return retval = new msc_grammarParser.mscRefSeqExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal249=null;
        msc_grammarParser.mscRefIdentExpr_return mscRefIdentExpr248 = null;

        msc_grammarParser.mscRefIdentExpr_return mscRefIdentExpr250 = null;


        CommonTree string_literal249_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleSubtreeStream stream_mscRefIdentExpr=new RewriteRuleSubtreeStream(adaptor,"rule mscRefIdentExpr");
        try {
            // msc_grammar.g:309:2: ( mscRefIdentExpr ( 'seq' mscRefIdentExpr )* -> ^( Seq ( mscRefIdentExpr )+ ) )
            // msc_grammar.g:309:4: mscRefIdentExpr ( 'seq' mscRefIdentExpr )*
            {
            pushFollow(FOLLOW_mscRefIdentExpr_in_mscRefSeqExpr2126);
            mscRefIdentExpr248=mscRefIdentExpr();

            state._fsp--;

            stream_mscRefIdentExpr.add(mscRefIdentExpr248.getTree());
            // msc_grammar.g:309:20: ( 'seq' mscRefIdentExpr )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==109) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // msc_grammar.g:309:22: 'seq' mscRefIdentExpr
            	    {
            	    string_literal249=(Token)match(input,109,FOLLOW_109_in_mscRefSeqExpr2130);  
            	    stream_109.add(string_literal249);

            	    pushFollow(FOLLOW_mscRefIdentExpr_in_mscRefSeqExpr2132);
            	    mscRefIdentExpr250=mscRefIdentExpr();

            	    state._fsp--;

            	    stream_mscRefIdentExpr.add(mscRefIdentExpr250.getTree());

            	    }
            	    break;

            	default :
            	    break loop67;
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
            // 309:47: -> ^( Seq ( mscRefIdentExpr )+ )
            {
                // msc_grammar.g:309:50: ^( Seq ( mscRefIdentExpr )+ )
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
    // msc_grammar.g:311:1: mscRefIdentExpr : ( 'loop' ( loopBoundary )? mscRefIdentExpr -> ^( Loop ( loopBoundary )? mscRefIdentExpr ) | 'exc' mscRefIdentExpr -> ^( Exc mscRefIdentExpr ) | 'opt' mscRefIdentExpr -> ^( Opt mscRefIdentExpr ) | 'empty' -> ^( Empty ) | mscName -> ^( MSC mscName ) | '(' mscRefExpr ')' -> ^( Ref mscRefExpr ) );
    public final msc_grammarParser.mscRefIdentExpr_return mscRefIdentExpr() throws RecognitionException {
        msc_grammarParser.mscRefIdentExpr_return retval = new msc_grammarParser.mscRefIdentExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal251=null;
        Token string_literal254=null;
        Token string_literal256=null;
        Token string_literal258=null;
        Token char_literal260=null;
        Token char_literal262=null;
        msc_grammarParser.loopBoundary_return loopBoundary252 = null;

        msc_grammarParser.mscRefIdentExpr_return mscRefIdentExpr253 = null;

        msc_grammarParser.mscRefIdentExpr_return mscRefIdentExpr255 = null;

        msc_grammarParser.mscRefIdentExpr_return mscRefIdentExpr257 = null;

        msc_grammarParser.mscName_return mscName259 = null;

        msc_grammarParser.mscRefExpr_return mscRefExpr261 = null;


        CommonTree string_literal251_tree=null;
        CommonTree string_literal254_tree=null;
        CommonTree string_literal256_tree=null;
        CommonTree string_literal258_tree=null;
        CommonTree char_literal260_tree=null;
        CommonTree char_literal262_tree=null;
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_mscRefExpr=new RewriteRuleSubtreeStream(adaptor,"rule mscRefExpr");
        RewriteRuleSubtreeStream stream_loopBoundary=new RewriteRuleSubtreeStream(adaptor,"rule loopBoundary");
        RewriteRuleSubtreeStream stream_mscRefIdentExpr=new RewriteRuleSubtreeStream(adaptor,"rule mscRefIdentExpr");
        RewriteRuleSubtreeStream stream_mscName=new RewriteRuleSubtreeStream(adaptor,"rule mscName");
        try {
            // msc_grammar.g:312:2: ( 'loop' ( loopBoundary )? mscRefIdentExpr -> ^( Loop ( loopBoundary )? mscRefIdentExpr ) | 'exc' mscRefIdentExpr -> ^( Exc mscRefIdentExpr ) | 'opt' mscRefIdentExpr -> ^( Opt mscRefIdentExpr ) | 'empty' -> ^( Empty ) | mscName -> ^( MSC mscName ) | '(' mscRefExpr ')' -> ^( Ref mscRefExpr ) )
            int alt69=6;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt69=1;
                }
                break;
            case 89:
                {
                alt69=2;
                }
                break;
            case 88:
                {
                alt69=3;
                }
                break;
            case 110:
                {
                alt69=4;
                }
                break;
            case NAME:
                {
                alt69=5;
                }
                break;
            case 85:
                {
                alt69=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // msc_grammar.g:312:4: 'loop' ( loopBoundary )? mscRefIdentExpr
                    {
                    string_literal251=(Token)match(input,87,FOLLOW_87_in_mscRefIdentExpr2157);  
                    stream_87.add(string_literal251);

                    // msc_grammar.g:312:11: ( loopBoundary )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==92) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // msc_grammar.g:312:13: loopBoundary
                            {
                            pushFollow(FOLLOW_loopBoundary_in_mscRefIdentExpr2161);
                            loopBoundary252=loopBoundary();

                            state._fsp--;

                            stream_loopBoundary.add(loopBoundary252.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_mscRefIdentExpr_in_mscRefIdentExpr2166);
                    mscRefIdentExpr253=mscRefIdentExpr();

                    state._fsp--;

                    stream_mscRefIdentExpr.add(mscRefIdentExpr253.getTree());


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
                    // 312:46: -> ^( Loop ( loopBoundary )? mscRefIdentExpr )
                    {
                        // msc_grammar.g:312:49: ^( Loop ( loopBoundary )? mscRefIdentExpr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Loop, "Loop"), root_1);

                        // msc_grammar.g:312:57: ( loopBoundary )?
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
                    // msc_grammar.g:313:4: 'exc' mscRefIdentExpr
                    {
                    string_literal254=(Token)match(input,89,FOLLOW_89_in_mscRefIdentExpr2185);  
                    stream_89.add(string_literal254);

                    pushFollow(FOLLOW_mscRefIdentExpr_in_mscRefIdentExpr2187);
                    mscRefIdentExpr255=mscRefIdentExpr();

                    state._fsp--;

                    stream_mscRefIdentExpr.add(mscRefIdentExpr255.getTree());


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
                    // 313:30: -> ^( Exc mscRefIdentExpr )
                    {
                        // msc_grammar.g:313:33: ^( Exc mscRefIdentExpr )
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
                    // msc_grammar.g:314:4: 'opt' mscRefIdentExpr
                    {
                    string_literal256=(Token)match(input,88,FOLLOW_88_in_mscRefIdentExpr2206);  
                    stream_88.add(string_literal256);

                    pushFollow(FOLLOW_mscRefIdentExpr_in_mscRefIdentExpr2208);
                    mscRefIdentExpr257=mscRefIdentExpr();

                    state._fsp--;

                    stream_mscRefIdentExpr.add(mscRefIdentExpr257.getTree());


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
                    // 314:30: -> ^( Opt mscRefIdentExpr )
                    {
                        // msc_grammar.g:314:33: ^( Opt mscRefIdentExpr )
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
                    // msc_grammar.g:315:4: 'empty'
                    {
                    string_literal258=(Token)match(input,110,FOLLOW_110_in_mscRefIdentExpr2227);  
                    stream_110.add(string_literal258);



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
                    // 315:17: -> ^( Empty )
                    {
                        // msc_grammar.g:315:20: ^( Empty )
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
                    // msc_grammar.g:316:4: mscName
                    {
                    pushFollow(FOLLOW_mscName_in_mscRefIdentExpr2245);
                    mscName259=mscName();

                    state._fsp--;

                    stream_mscName.add(mscName259.getTree());


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
                    // 316:17: -> ^( MSC mscName )
                    {
                        // msc_grammar.g:316:20: ^( MSC mscName )
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
                    // msc_grammar.g:317:5: '(' mscRefExpr ')'
                    {
                    char_literal260=(Token)match(input,85,FOLLOW_85_in_mscRefIdentExpr2266);  
                    stream_85.add(char_literal260);

                    pushFollow(FOLLOW_mscRefExpr_in_mscRefIdentExpr2268);
                    mscRefExpr261=mscRefExpr();

                    state._fsp--;

                    stream_mscRefExpr.add(mscRefExpr261.getTree());
                    char_literal262=(Token)match(input,86,FOLLOW_86_in_mscRefIdentExpr2270);  
                    stream_86.add(char_literal262);



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
                    // 317:27: -> ^( Ref mscRefExpr )
                    {
                        // msc_grammar.g:317:30: ^( Ref mscRefExpr )
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

    public static class mscName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mscName"
    // msc_grammar.g:320:1: mscName : NAME ;
    public final msc_grammarParser.mscName_return mscName() throws RecognitionException {
        msc_grammarParser.mscName_return retval = new msc_grammarParser.mscName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME263=null;

        CommonTree NAME263_tree=null;

        try {
            // msc_grammar.g:320:9: ( NAME )
            // msc_grammar.g:320:11: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME263=(Token)match(input,NAME,FOLLOW_NAME_in_mscName2294); 
            NAME263_tree = (CommonTree)adaptor.create(NAME263);
            adaptor.addChild(root_0, NAME263_tree);


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
    // msc_grammar.g:321:1: labelName : NAME ;
    public final msc_grammarParser.labelName_return labelName() throws RecognitionException {
        msc_grammarParser.labelName_return retval = new msc_grammarParser.labelName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME264=null;

        CommonTree NAME264_tree=null;

        try {
            // msc_grammar.g:322:2: ( NAME )
            // msc_grammar.g:322:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME264=(Token)match(input,NAME,FOLLOW_NAME_in_labelName2303); 
            NAME264_tree = (CommonTree)adaptor.create(NAME264);
            adaptor.addChild(root_0, NAME264_tree);


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
    // msc_grammar.g:323:1: name : NAME ;
    public final msc_grammarParser.name_return name() throws RecognitionException {
        msc_grammarParser.name_return retval = new msc_grammarParser.name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME265=null;

        CommonTree NAME265_tree=null;

        try {
            // msc_grammar.g:323:7: ( NAME )
            // msc_grammar.g:323:9: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME265=(Token)match(input,NAME,FOLLOW_NAME_in_name2311); 
            NAME265_tree = (CommonTree)adaptor.create(NAME265);
            adaptor.addChild(root_0, NAME265_tree);


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
    // msc_grammar.g:324:1: instanceName : NAME ;
    public final msc_grammarParser.instanceName_return instanceName() throws RecognitionException {
        msc_grammarParser.instanceName_return retval = new msc_grammarParser.instanceName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME266=null;

        CommonTree NAME266_tree=null;

        try {
            // msc_grammar.g:325:2: ( NAME )
            // msc_grammar.g:325:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME266=(Token)match(input,NAME,FOLLOW_NAME_in_instanceName2320); 
            NAME266_tree = (CommonTree)adaptor.create(NAME266);
            adaptor.addChild(root_0, NAME266_tree);


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
    // msc_grammar.g:326:1: messageName : NAME ;
    public final msc_grammarParser.messageName_return messageName() throws RecognitionException {
        msc_grammarParser.messageName_return retval = new msc_grammarParser.messageName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME267=null;

        CommonTree NAME267_tree=null;

        try {
            // msc_grammar.g:327:2: ( NAME )
            // msc_grammar.g:327:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME267=(Token)match(input,NAME,FOLLOW_NAME_in_messageName2329); 
            NAME267_tree = (CommonTree)adaptor.create(NAME267);
            adaptor.addChild(root_0, NAME267_tree);


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
    // msc_grammar.g:328:1: gateName : NAME ;
    public final msc_grammarParser.gateName_return gateName() throws RecognitionException {
        msc_grammarParser.gateName_return retval = new msc_grammarParser.gateName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME268=null;

        CommonTree NAME268_tree=null;

        try {
            // msc_grammar.g:329:2: ( NAME )
            // msc_grammar.g:329:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME268=(Token)match(input,NAME,FOLLOW_NAME_in_gateName2338); 
            NAME268_tree = (CommonTree)adaptor.create(NAME268);
            adaptor.addChild(root_0, NAME268_tree);


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
    // msc_grammar.g:330:1: eventName : NAME ;
    public final msc_grammarParser.eventName_return eventName() throws RecognitionException {
        msc_grammarParser.eventName_return retval = new msc_grammarParser.eventName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME269=null;

        CommonTree NAME269_tree=null;

        try {
            // msc_grammar.g:331:2: ( NAME )
            // msc_grammar.g:331:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME269=(Token)match(input,NAME,FOLLOW_NAME_in_eventName2347); 
            NAME269_tree = (CommonTree)adaptor.create(NAME269);
            adaptor.addChild(root_0, NAME269_tree);


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
    // msc_grammar.g:332:1: characterString : CHARACTERSTRING ;
    public final msc_grammarParser.characterString_return characterString() throws RecognitionException {
        msc_grammarParser.characterString_return retval = new msc_grammarParser.characterString_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CHARACTERSTRING270=null;

        CommonTree CHARACTERSTRING270_tree=null;

        try {
            // msc_grammar.g:333:2: ( CHARACTERSTRING )
            // msc_grammar.g:333:4: CHARACTERSTRING
            {
            root_0 = (CommonTree)adaptor.nil();

            CHARACTERSTRING270=(Token)match(input,CHARACTERSTRING,FOLLOW_CHARACTERSTRING_in_characterString2356); 
            CHARACTERSTRING270_tree = (CommonTree)adaptor.create(CHARACTERSTRING270);
            adaptor.addChild(root_0, CHARACTERSTRING270_tree);


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
    // msc_grammar.g:335:1: identifier : NAME ;
    public final msc_grammarParser.identifier_return identifier() throws RecognitionException {
        msc_grammarParser.identifier_return retval = new msc_grammarParser.identifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME271=null;

        CommonTree NAME271_tree=null;

        try {
            // msc_grammar.g:336:2: ( NAME )
            // msc_grammar.g:336:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME271=(Token)match(input,NAME,FOLLOW_NAME_in_identifier2366); 
            NAME271_tree = (CommonTree)adaptor.create(NAME271);
            adaptor.addChild(root_0, NAME271_tree);


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
    // msc_grammar.g:340:1: expressionString : NAME ;
    public final msc_grammarParser.expressionString_return expressionString() throws RecognitionException {
        msc_grammarParser.expressionString_return retval = new msc_grammarParser.expressionString_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME272=null;

        CommonTree NAME272_tree=null;

        try {
            // msc_grammar.g:341:2: ( NAME )
            // msc_grammar.g:341:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME272=(Token)match(input,NAME,FOLLOW_NAME_in_expressionString2380); 
            NAME272_tree = (CommonTree)adaptor.create(NAME272);
            adaptor.addChild(root_0, NAME272_tree);


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
    // msc_grammar.g:346:1: dataTypeName : NAME ;
    public final msc_grammarParser.dataTypeName_return dataTypeName() throws RecognitionException {
        msc_grammarParser.dataTypeName_return retval = new msc_grammarParser.dataTypeName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME273=null;

        CommonTree NAME273_tree=null;

        try {
            // msc_grammar.g:347:2: ( NAME )
            // msc_grammar.g:347:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME273=(Token)match(input,NAME,FOLLOW_NAME_in_dataTypeName2393); 
            NAME273_tree = (CommonTree)adaptor.create(NAME273);
            adaptor.addChild(root_0, NAME273_tree);


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
    // msc_grammar.g:348:1: datatypeTypeExpression : NAME ;
    public final msc_grammarParser.datatypeTypeExpression_return datatypeTypeExpression() throws RecognitionException {
        msc_grammarParser.datatypeTypeExpression_return retval = new msc_grammarParser.datatypeTypeExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME274=null;

        CommonTree NAME274_tree=null;

        try {
            // msc_grammar.g:349:2: ( NAME )
            // msc_grammar.g:349:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME274=(Token)match(input,NAME,FOLLOW_NAME_in_datatypeTypeExpression2401); 
            NAME274_tree = (CommonTree)adaptor.create(NAME274);
            adaptor.addChild(root_0, NAME274_tree);


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
    // msc_grammar.g:350:1: literalNameOrNumber : NAME ;
    public final msc_grammarParser.literalNameOrNumber_return literalNameOrNumber() throws RecognitionException {
        msc_grammarParser.literalNameOrNumber_return retval = new msc_grammarParser.literalNameOrNumber_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME275=null;

        CommonTree NAME275_tree=null;

        try {
            // msc_grammar.g:351:2: ( NAME )
            // msc_grammar.g:351:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME275=(Token)match(input,NAME,FOLLOW_NAME_in_literalNameOrNumber2409); 
            NAME275_tree = (CommonTree)adaptor.create(NAME275);
            adaptor.addChild(root_0, NAME275_tree);


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
    // msc_grammar.g:352:1: naturalSimpleExpression : NAME ;
    public final msc_grammarParser.naturalSimpleExpression_return naturalSimpleExpression() throws RecognitionException {
        msc_grammarParser.naturalSimpleExpression_return retval = new msc_grammarParser.naturalSimpleExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME276=null;

        CommonTree NAME276_tree=null;

        try {
            // msc_grammar.g:353:2: ( NAME )
            // msc_grammar.g:353:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME276=(Token)match(input,NAME,FOLLOW_NAME_in_naturalSimpleExpression2417); 
            NAME276_tree = (CommonTree)adaptor.create(NAME276);
            adaptor.addChild(root_0, NAME276_tree);


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
    // msc_grammar.g:354:1: fieldName : NAME ;
    public final msc_grammarParser.fieldName_return fieldName() throws RecognitionException {
        msc_grammarParser.fieldName_return retval = new msc_grammarParser.fieldName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME277=null;

        CommonTree NAME277_tree=null;

        try {
            // msc_grammar.g:355:2: ( NAME )
            // msc_grammar.g:355:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME277=(Token)match(input,NAME,FOLLOW_NAME_in_fieldName2425); 
            NAME277_tree = (CommonTree)adaptor.create(NAME277);
            adaptor.addChild(root_0, NAME277_tree);


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
    // msc_grammar.g:357:1: constantExpression : NAME ;
    public final msc_grammarParser.constantExpression_return constantExpression() throws RecognitionException {
        msc_grammarParser.constantExpression_return retval = new msc_grammarParser.constantExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME278=null;

        CommonTree NAME278_tree=null;

        try {
            // msc_grammar.g:358:2: ( NAME )
            // msc_grammar.g:358:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME278=(Token)match(input,NAME,FOLLOW_NAME_in_constantExpression2435); 
            NAME278_tree = (CommonTree)adaptor.create(NAME278);
            adaptor.addChild(root_0, NAME278_tree);


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


 

    public static final BitSet FOLLOW_messageSequenceChart_in_msc194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_messageSequenceChart206 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_mscHead_in_messageSequenceChart208 = new BitSet(new long[]{0x0000900000000000L});
    public static final BitSet FOLLOW_body_in_messageSequenceChart210 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_messageSequenceChart212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_end_in_messageSequenceChart214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscName_in_mscHead237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_end_in_mscHead239 = new BitSet(new long[]{0x0000000000000002L,0x0000008000004000L});
    public static final BitSet FOLLOW_mscInterface_in_mscHead243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscBody_in_body273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscStatement_in_mscBody286 = new BitSet(new long[]{0x0000900000000002L});
    public static final BitSet FOLLOW_eventDefinition_in_mscStatement311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceName_in_eventDefinition323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_eventDefinition325 = new BitSet(new long[]{0x0000800000000000L,0x000004670000382CL});
    public static final BitSet FOLLOW_instanceEventList_in_eventDefinition327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceNameList_in_eventDefinition345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_eventDefinition347 = new BitSet(new long[]{0x0000000000000000L,0x000010000F900000L});
    public static final BitSet FOLLOW_multiInstanceEventList_in_eventDefinition349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceEvent_in_instanceEventList376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_end_in_instanceEventList378 = new BitSet(new long[]{0x0000800000000002L,0x000004670000382CL});
    public static final BitSet FOLLOW_orderableEvent_in_instanceEvent399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonOrderableEvent_in_instanceEvent403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_label_in_orderableEvent415 = new BitSet(new long[]{0x0000800000000000L,0x000000650000082CL});
    public static final BitSet FOLLOW_messageEvent_in_orderableEvent420 = new BitSet(new long[]{0x0000000000000002L,0x0000030000000000L});
    public static final BitSet FOLLOW_action_in_orderableEvent424 = new BitSet(new long[]{0x0000000000000002L,0x0000030000000000L});
    public static final BitSet FOLLOW_create_in_orderableEvent428 = new BitSet(new long[]{0x0000000000000002L,0x0000030000000000L});
    public static final BitSet FOLLOW_timerStatement_in_orderableEvent432 = new BitSet(new long[]{0x0000000000000002L,0x0000030000000000L});
    public static final BitSet FOLLOW_generalOrdering_in_orderableEvent436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceHeadStatement_in_nonOrderableEvent449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceEndStatement_in_nonOrderableEvent453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stop_in_nonOrderableEvent457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coregion_in_nonOrderableEvent461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceName_in_instanceNameList474 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_instanceNameList478 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_instanceName_in_instanceNameList480 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ALL_in_instanceNameList500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiInstanceEvent_in_multiInstanceEventList525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_end_in_multiInstanceEventList527 = new BitSet(new long[]{0x0000000000000002L,0x000010000F900000L});
    public static final BitSet FOLLOW_condition_in_multiInstanceEvent548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscReference_in_multiInstanceEvent552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inlineExpr_in_multiInstanceEvent556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eventName_in_label570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_label574 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_eventName_in_label576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_end_in_label578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_messageEvent603 = new BitSet(new long[]{0x0004800000000000L});
    public static final BitSet FOLLOW_msgIdentification_in_messageEvent605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_messageEvent607 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000280L});
    public static final BitSet FOLLOW_messageReceiver_in_messageEvent609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_messageEvent626 = new BitSet(new long[]{0x0004800000000000L});
    public static final BitSet FOLLOW_msgIdentification_in_messageEvent628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_messageEvent630 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_messageSender_in_messageEvent632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inputAddress_in_messageReceiver658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_messageReceiver669 = new BitSet(new long[]{0x0000800000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_inputAddress_in_messageReceiver673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_outputAddress_in_messageSender695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_messageSender706 = new BitSet(new long[]{0x0000800000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_outputAddress_in_messageSender710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_messageName_in_msgIdentification733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characterString_in_msgIdentification737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceName_in_outputAddress749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_outputAddress754 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_outputAddress758 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_gateName_in_outputAddress760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceName_in_inputAddress787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_inputAddress792 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_inputAddress796 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_gateName_in_inputAddress798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_action824 = new BitSet(new long[]{0x0004800000000000L});
    public static final BitSet FOLLOW_actionStatement_in_action826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_informalAction_in_actionStatement841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_messageName_in_informalAction862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characterString_in_informalAction866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_instanceHeadStatement879 = new BitSet(new long[]{0x0000800000000002L,0x0000000000078000L});
    public static final BitSet FOLLOW_instanceKind_in_instanceHeadStatement883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_instanceEndStatement899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscInstInterface_in_mscInterface911 = new BitSet(new long[]{0x0000000000000002L,0x0000008000004000L});
    public static final BitSet FOLLOW_mscGateInterface_in_mscInterface915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscGateInterface_in_mscInterface922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_mscInstInterface935 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_instanceList_in_mscInstInterface937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_end_in_mscInstInterface939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceName_in_instanceList952 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_64_in_instanceList956 = new BitSet(new long[]{0x0000800000000000L,0x0000000000078000L});
    public static final BitSet FOLLOW_instanceKind_in_instanceList958 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_instanceList965 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_instanceList_in_instanceList967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kindDenominator_in_instanceKind985 = new BitSet(new long[]{0x0000800000000000L,0x0000000000078000L});
    public static final BitSet FOLLOW_identifier_in_instanceKind990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_kindDenominator1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_kindDenominator1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_kindDenominator1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_kindDenominator1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_kindDenominator1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_end1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionIdentification_in_condition1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_conditionIdentification1054 = new BitSet(new long[]{0x0000E00000000000L});
    public static final BitSet FOLLOW_conditionText_in_conditionIdentification1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionNameList_in_conditionText1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHEN_in_conditionText1093 = new BitSet(new long[]{0x0000800000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_conditionGuard_in_conditionText1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OTHERWISE_in_conditionText1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionNameList_in_conditionGuard1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_conditionGuard1143 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_expressionString_in_conditionGuard1145 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_conditionGuard1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_conditionNameList1169 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_conditionNameList1173 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NAME_in_conditionNameList1175 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_loopExpr_in_inlineExpr1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optExpr_in_inlineExpr1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_altExpr_in_inlineExpr1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpr_in_inlineExpr1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_excExpr_in_inlineExpr1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_loopExpr1223 = new BitSet(new long[]{0x0001000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_loopBoundary_in_loopExpr1227 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_BEGIN_in_loopExpr1232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_end_in_loopExpr1234 = new BitSet(new long[]{0x0000900000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_mscBody_in_loopExpr1236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_loopExpr1238 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_END_in_loopExpr1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_optExpr1262 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_BEGIN_in_optExpr1264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_end_in_optExpr1266 = new BitSet(new long[]{0x0000900000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_mscBody_in_optExpr1268 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_optExpr1270 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_END_in_optExpr1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_excExpr1291 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_BEGIN_in_excExpr1293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_end_in_excExpr1295 = new BitSet(new long[]{0x0000900000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_mscBody_in_excExpr1297 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_excExpr1299 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_END_in_excExpr1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_altExpr1320 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_BEGIN_in_altExpr1322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_end_in_altExpr1324 = new BitSet(new long[]{0x0000900000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_mscBody_in_altExpr1326 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_altExpr1330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_end_in_altExpr1332 = new BitSet(new long[]{0x0000900000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_mscBody_in_altExpr1334 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_altExpr1339 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_END_in_altExpr1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_parExpr1361 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_BEGIN_in_parExpr1363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_end_in_parExpr1365 = new BitSet(new long[]{0x0000900000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_mscBody_in_parExpr1367 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_parExpr1371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_end_in_parExpr1373 = new BitSet(new long[]{0x0000900000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_mscBody_in_parExpr1375 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_parExpr1380 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_END_in_parExpr1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_loopBoundary1403 = new BitSet(new long[]{0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_infNatural_in_loopBoundary1405 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000002L});
    public static final BitSet FOLLOW_65_in_loopBoundary1409 = new BitSet(new long[]{0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_infNatural_in_loopBoundary1411 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_loopBoundary1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_infNatural1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_infNatural1442 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_expressionString_in_infNatural1444 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_infNatural1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_create1459 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_instanceName_in_create1461 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_create1465 = new BitSet(new long[]{0x0004800000000000L});
    public static final BitSet FOLLOW_msgIdentification_in_create1466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_create1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_stop1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setTimer_in_timerStatement1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_resetTimer_in_timerStatement1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeout_in_timerStatement1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_setTimer1533 = new BitSet(new long[]{0x0000800000000000L,0x0000000000078000L});
    public static final BitSet FOLLOW_name_in_setTimer1535 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000002L});
    public static final BitSet FOLLOW_65_in_setTimer1539 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_instanceName_in_setTimer1541 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000002L});
    public static final BitSet FOLLOW_duration_in_setTimer1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_duration1581 = new BitSet(new long[]{0x0000000000000000L,0x00000010C0000002L});
    public static final BitSet FOLLOW_infNatural_in_duration1585 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000002L});
    public static final BitSet FOLLOW_65_in_duration1592 = new BitSet(new long[]{0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_infNatural_in_duration1594 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_duration1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_resetTimer1610 = new BitSet(new long[]{0x0000800000000000L,0x0000000000078000L});
    public static final BitSet FOLLOW_name_in_resetTimer1612 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_resetTimer1616 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_instanceName_in_resetTimer1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_timeout1643 = new BitSet(new long[]{0x0000800000000000L,0x0000000000078000L});
    public static final BitSet FOLLOW_name_in_timeout1645 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_timeout1649 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_instanceName_in_timeout1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscGateDef_in_mscGateInterface1681 = new BitSet(new long[]{0x0000000000000002L,0x0000008000004000L});
    public static final BitSet FOLLOW_103_in_mscGateDef1693 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_msgGate_in_mscGateDef1697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_orderGate_in_mscGateDef1701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_end_in_mscGateDef1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defInGate_in_msgGate1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defOutGate_in_msgGate1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defOrderInGate_in_orderGate1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defOrderOutGate_in_orderGate1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gateName_in_defInGate1746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_defInGate1751 = new BitSet(new long[]{0x0004800000000000L});
    public static final BitSet FOLLOW_msgIdentification_in_defInGate1753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_defInGate1755 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000280L});
    public static final BitSet FOLLOW_inputDest_in_defInGate1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gateName_in_defOutGate1770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_defOutGate1775 = new BitSet(new long[]{0x0004800000000000L});
    public static final BitSet FOLLOW_msgIdentification_in_defOutGate1777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_defOutGate1779 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_outputDest_in_defOutGate1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gateName_in_defOrderInGate1792 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_defOrderInGate1794 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_orderDest_in_defOrderInGate1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gateName_in_defOrderOutGate1806 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_defOrderOutGate1810 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_orderDestList_in_defOrderOutGate1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_inputDest1827 = new BitSet(new long[]{0x0000800000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_inputAddress_in_inputDest1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inputAddress_in_inputDest1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_outputDest1849 = new BitSet(new long[]{0x0000800000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_outputAddress_in_outputDest1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_outputAddress_in_outputDest1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eventName_in_orderDest1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_orderDest1876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_orderDest1878 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_gateName_in_orderDest1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderDest_in_orderDestList1901 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_orderDestList1905 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_orderDestList_in_orderDestList1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_coregion1930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_end_in_coregion1932 = new BitSet(new long[]{0x0000800000000000L,0x000008650000082CL});
    public static final BitSet FOLLOW_coevent_in_coregion1934 = new BitSet(new long[]{0x0000800000000000L,0x000008650000082CL});
    public static final BitSet FOLLOW_107_in_coregion1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderableEvent_in_coevent1957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_end_in_coevent1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_before_in_generalOrdering1975 = new BitSet(new long[]{0x0000000000000002L,0x0000030000000000L});
    public static final BitSet FOLLOW_after_in_generalOrdering1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_after_in_generalOrdering1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_before1993 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_orderDestList_in_before1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_after2015 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_orderDestList_in_after2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_mscReference2041 = new BitSet(new long[]{0x0000800000000000L,0x0000400003A00000L});
    public static final BitSet FOLLOW_mscRefExpr_in_mscReference2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscRefParExpr_in_mscRefExpr2064 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_mscRefExpr2068 = new BitSet(new long[]{0x0000800000000000L,0x0000400003A00000L});
    public static final BitSet FOLLOW_mscRefParExpr_in_mscRefExpr2070 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_mscRefSeqExpr_in_mscRefParExpr2095 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_mscRefParExpr2099 = new BitSet(new long[]{0x0000800000000000L,0x0000400003A00000L});
    public static final BitSet FOLLOW_mscRefSeqExpr_in_mscRefParExpr2101 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_mscRefIdentExpr_in_mscRefSeqExpr2126 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_mscRefSeqExpr2130 = new BitSet(new long[]{0x0000800000000000L,0x0000400003A00000L});
    public static final BitSet FOLLOW_mscRefIdentExpr_in_mscRefSeqExpr2132 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_87_in_mscRefIdentExpr2157 = new BitSet(new long[]{0x0000800000000000L,0x0000400013A00000L});
    public static final BitSet FOLLOW_loopBoundary_in_mscRefIdentExpr2161 = new BitSet(new long[]{0x0000800000000000L,0x0000400003A00000L});
    public static final BitSet FOLLOW_mscRefIdentExpr_in_mscRefIdentExpr2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_mscRefIdentExpr2185 = new BitSet(new long[]{0x0000800000000000L,0x0000400003A00000L});
    public static final BitSet FOLLOW_mscRefIdentExpr_in_mscRefIdentExpr2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_mscRefIdentExpr2206 = new BitSet(new long[]{0x0000800000000000L,0x0000400003A00000L});
    public static final BitSet FOLLOW_mscRefIdentExpr_in_mscRefIdentExpr2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_mscRefIdentExpr2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscName_in_mscRefIdentExpr2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_mscRefIdentExpr2266 = new BitSet(new long[]{0x0000800000000000L,0x0000400003A00000L});
    public static final BitSet FOLLOW_mscRefExpr_in_mscRefIdentExpr2268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_mscRefIdentExpr2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_mscName2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_labelName2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_name2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_instanceName2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_messageName2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_gateName2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_eventName2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTERSTRING_in_characterString2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_identifier2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_expressionString2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_dataTypeName2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_datatypeTypeExpression2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_literalNameOrNumber2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_naturalSimpleExpression2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_fieldName2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_constantExpression2435 = new BitSet(new long[]{0x0000000000000002L});

}