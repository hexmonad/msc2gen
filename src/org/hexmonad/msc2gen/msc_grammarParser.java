// $ANTLR 3.1.3 Mar 18, 2009 10:09:25 msc_grammar.g 2014-03-16 14:12:26
package org.hexmonad.msc2gen;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class msc_grammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MSC", "MSCHead", "MSCBody", "Instance", "InstanceList", "INameList", "ParameterList", "Label", "MSGIn", "MSGOut", "FullMsg", "IncompleteMsg", "Action", "Condition", "SetCond", "GuardCond", "ElseCond", "Seq", "Alt", "Par", "Loop", "Bounds", "Opt", "Exc", "Coregion", "Before", "After", "Ref", "Empty", "NodeExpr", "Start", "Create", "Terminate", "Timer", "MsgGate", "ALL", "WHEN", "OTHERWISE", "BEGIN", "END", "NAME", "CHARACTERSTRING", "LEFTBINDSYMBOL", "RIGHTBINDSYMBOL", "LETTER", "DECIMALDIGIT", "UNDERLINE", "FULLSTOP", "APOSTROPHE", "ALPHANUMERIC", "OTHERCHARACTER", "SPECIAL", "WS", "'msc'", "'endmsc'", "':'", "','", "'label'", "'out'", "'to'", "'in'", "'from'", "'lost'", "'found'", "'env'", "'via'", "'action'", "'instance'", "'endinstance'", "'inst'", "'system'", "'block'", "'process'", "'service'", "';'", "'condition'", "'loop'", "'opt'", "'exc'", "'alt'", "'par'", "'<'", "'>'", "'create'", "'('", "')'", "'stop'", "'starttimer'", "'stoptimer'", "'timeout'", "'['", "']'", "'gate'", "'before'", "'after'", "'concurrent'", "'endconcurrent'", "'reference'"
    };
    public static final int Condition=17;
    public static final int MsgGate=38;
    public static final int LETTER=48;
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
    public static final int T__92=92;
    public static final int NAME=44;
    public static final int T__90=90;
    public static final int MSCHead=5;
    public static final int Bounds=25;
    public static final int BEGIN=42;
    public static final int FULLSTOP=51;
    public static final int MSGIn=12;
    public static final int APOSTROPHE=52;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int OTHERWISE=41;
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
    public static final int UNDERLINE=50;
    public static final int MSGOut=13;
    public static final int NodeExpr=33;
    public static final int WS=56;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int SPECIAL=55;
    public static final int T__70=70;
    public static final int Par=23;
    public static final int Timer=37;
    public static final int T__76=76;
    public static final int END=43;
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
    public static final int T__67=67;
    public static final int Alt=22;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int Opt=26;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int LEFTBINDSYMBOL=46;
    public static final int T__61=61;
    public static final int RIGHTBINDSYMBOL=47;
    public static final int T__60=60;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int ALPHANUMERIC=53;
    public static final int T__59=59;
    public static final int MSC=4;
    public static final int ALL=39;
    public static final int InstanceList=8;
    public static final int Instance=7;
    public static final int Start=34;
    public static final int T__101=101;
    public static final int IncompleteMsg=15;
    public static final int T__100=100;
    public static final int Exc=27;
    public static final int INameList=9;
    public static final int Seq=21;
    public static final int Ref=31;
    public static final int Terminate=36;
    public static final int WHEN=40;
    public static final int GuardCond=19;
    public static final int ParameterList=10;
    public static final int CHARACTERSTRING=45;
    public static final int DECIMALDIGIT=49;
    public static final int SetCond=18;
    public static final int OTHERCHARACTER=54;

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
    // msc_grammar.g:46:1: msc : messageSequenceChart ;
    public final msc_grammarParser.msc_return msc() throws RecognitionException {
        msc_grammarParser.msc_return retval = new msc_grammarParser.msc_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.messageSequenceChart_return messageSequenceChart1 = null;



        try {
            // msc_grammar.g:46:6: ( messageSequenceChart )
            // msc_grammar.g:46:8: messageSequenceChart
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_messageSequenceChart_in_msc174);
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
    // msc_grammar.g:49:1: messageSequenceChart : 'msc' mscHead body 'endmsc' end -> ^( MSC mscHead body ) ;
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
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_mscHead=new RewriteRuleSubtreeStream(adaptor,"rule mscHead");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:50:2: ( 'msc' mscHead body 'endmsc' end -> ^( MSC mscHead body ) )
            // msc_grammar.g:50:4: 'msc' mscHead body 'endmsc' end
            {
            string_literal2=(Token)match(input,57,FOLLOW_57_in_messageSequenceChart186);  
            stream_57.add(string_literal2);

            pushFollow(FOLLOW_mscHead_in_messageSequenceChart188);
            mscHead3=mscHead();

            state._fsp--;

            stream_mscHead.add(mscHead3.getTree());
            pushFollow(FOLLOW_body_in_messageSequenceChart190);
            body4=body();

            state._fsp--;

            stream_body.add(body4.getTree());
            string_literal5=(Token)match(input,58,FOLLOW_58_in_messageSequenceChart192);  
            stream_58.add(string_literal5);

            pushFollow(FOLLOW_end_in_messageSequenceChart194);
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
            // 50:36: -> ^( MSC mscHead body )
            {
                // msc_grammar.g:50:39: ^( MSC mscHead body )
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
    // msc_grammar.g:53:1: mscHead : mscName end ( mscInterface )? -> ^( MSCHead mscName ( mscInterface )? ) ;
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
            // msc_grammar.g:53:9: ( mscName end ( mscInterface )? -> ^( MSCHead mscName ( mscInterface )? ) )
            // msc_grammar.g:53:11: mscName end ( mscInterface )?
            {
            pushFollow(FOLLOW_mscName_in_mscHead217);
            mscName7=mscName();

            state._fsp--;

            stream_mscName.add(mscName7.getTree());
            pushFollow(FOLLOW_end_in_mscHead219);
            end8=end();

            state._fsp--;

            stream_end.add(end8.getTree());
            // msc_grammar.g:53:23: ( mscInterface )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==73||LA1_0==96) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // msc_grammar.g:53:25: mscInterface
                    {
                    pushFollow(FOLLOW_mscInterface_in_mscHead223);
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
            // 53:41: -> ^( MSCHead mscName ( mscInterface )? )
            {
                // msc_grammar.g:53:44: ^( MSCHead mscName ( mscInterface )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MSCHead, "MSCHead"), root_1);

                adaptor.addChild(root_1, stream_mscName.nextTree());
                // msc_grammar.g:53:63: ( mscInterface )?
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
    // msc_grammar.g:56:1: body : ( mscBody ) ;
    public final msc_grammarParser.body_return body() throws RecognitionException {
        msc_grammarParser.body_return retval = new msc_grammarParser.body_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.mscBody_return mscBody10 = null;



        try {
            // msc_grammar.g:56:7: ( ( mscBody ) )
            // msc_grammar.g:56:9: ( mscBody )
            {
            root_0 = (CommonTree)adaptor.nil();

            // msc_grammar.g:56:9: ( mscBody )
            // msc_grammar.g:56:11: mscBody
            {
            pushFollow(FOLLOW_mscBody_in_body253);
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
    // msc_grammar.g:59:1: mscBody : ( mscStatement )* -> ^( MSCBody ( mscStatement )* ) ;
    public final msc_grammarParser.mscBody_return mscBody() throws RecognitionException {
        msc_grammarParser.mscBody_return retval = new msc_grammarParser.mscBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.mscStatement_return mscStatement11 = null;


        RewriteRuleSubtreeStream stream_mscStatement=new RewriteRuleSubtreeStream(adaptor,"rule mscStatement");
        try {
            // msc_grammar.g:59:9: ( ( mscStatement )* -> ^( MSCBody ( mscStatement )* ) )
            // msc_grammar.g:59:11: ( mscStatement )*
            {
            // msc_grammar.g:59:11: ( mscStatement )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ALL||LA2_0==NAME) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // msc_grammar.g:59:11: mscStatement
            	    {
            	    pushFollow(FOLLOW_mscStatement_in_mscBody266);
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
            // 59:25: -> ^( MSCBody ( mscStatement )* )
            {
                // msc_grammar.g:59:28: ^( MSCBody ( mscStatement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MSCBody, "MSCBody"), root_1);

                // msc_grammar.g:59:39: ( mscStatement )*
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
    // msc_grammar.g:62:1: mscStatement : eventDefinition ;
    public final msc_grammarParser.mscStatement_return mscStatement() throws RecognitionException {
        msc_grammarParser.mscStatement_return retval = new msc_grammarParser.mscStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.eventDefinition_return eventDefinition12 = null;



        try {
            // msc_grammar.g:63:2: ( eventDefinition )
            // msc_grammar.g:63:4: eventDefinition
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_eventDefinition_in_mscStatement291);
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
    // msc_grammar.g:66:1: eventDefinition : ( instanceName ':' instanceEventList -> ^( Instance instanceName instanceEventList ) | instanceNameList ':' multiInstanceEventList -> ^( InstanceList instanceNameList multiInstanceEventList ) );
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
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleSubtreeStream stream_instanceName=new RewriteRuleSubtreeStream(adaptor,"rule instanceName");
        RewriteRuleSubtreeStream stream_instanceEventList=new RewriteRuleSubtreeStream(adaptor,"rule instanceEventList");
        RewriteRuleSubtreeStream stream_instanceNameList=new RewriteRuleSubtreeStream(adaptor,"rule instanceNameList");
        RewriteRuleSubtreeStream stream_multiInstanceEventList=new RewriteRuleSubtreeStream(adaptor,"rule multiInstanceEventList");
        try {
            // msc_grammar.g:67:2: ( instanceName ':' instanceEventList -> ^( Instance instanceName instanceEventList ) | instanceNameList ':' multiInstanceEventList -> ^( InstanceList instanceNameList multiInstanceEventList ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==NAME) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==59) ) {
                    int LA3_3 = input.LA(3);

                    if ( ((LA3_3>=79 && LA3_3<=84)||LA3_3==101) ) {
                        alt3=2;
                    }
                    else if ( (LA3_3==NAME||(LA3_3>=61 && LA3_3<=62)||LA3_3==64||(LA3_3>=70 && LA3_3<=72)||LA3_3==87||(LA3_3>=90 && LA3_3<=93)||LA3_3==99) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA3_1==60) ) {
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
                    // msc_grammar.g:67:4: instanceName ':' instanceEventList
                    {
                    pushFollow(FOLLOW_instanceName_in_eventDefinition303);
                    instanceName13=instanceName();

                    state._fsp--;

                    stream_instanceName.add(instanceName13.getTree());
                    char_literal14=(Token)match(input,59,FOLLOW_59_in_eventDefinition305);  
                    stream_59.add(char_literal14);

                    pushFollow(FOLLOW_instanceEventList_in_eventDefinition307);
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
                    // 67:39: -> ^( Instance instanceName instanceEventList )
                    {
                        // msc_grammar.g:67:42: ^( Instance instanceName instanceEventList )
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
                    // msc_grammar.g:68:4: instanceNameList ':' multiInstanceEventList
                    {
                    pushFollow(FOLLOW_instanceNameList_in_eventDefinition325);
                    instanceNameList16=instanceNameList();

                    state._fsp--;

                    stream_instanceNameList.add(instanceNameList16.getTree());
                    char_literal17=(Token)match(input,59,FOLLOW_59_in_eventDefinition327);  
                    stream_59.add(char_literal17);

                    pushFollow(FOLLOW_multiInstanceEventList_in_eventDefinition329);
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
                    // 68:48: -> ^( InstanceList instanceNameList multiInstanceEventList )
                    {
                        // msc_grammar.g:68:51: ^( InstanceList instanceNameList multiInstanceEventList )
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
    // msc_grammar.g:71:1: instanceEventList : ( instanceEvent end )+ -> ( instanceEvent )+ ;
    public final msc_grammarParser.instanceEventList_return instanceEventList() throws RecognitionException {
        msc_grammarParser.instanceEventList_return retval = new msc_grammarParser.instanceEventList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.instanceEvent_return instanceEvent19 = null;

        msc_grammarParser.end_return end20 = null;


        RewriteRuleSubtreeStream stream_instanceEvent=new RewriteRuleSubtreeStream(adaptor,"rule instanceEvent");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:72:2: ( ( instanceEvent end )+ -> ( instanceEvent )+ )
            // msc_grammar.g:72:4: ( instanceEvent end )+
            {
            // msc_grammar.g:72:4: ( instanceEvent end )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==NAME) ) {
                    int LA4_2 = input.LA(2);

                    if ( (LA4_2==62||LA4_2==64||LA4_2==70||LA4_2==87||(LA4_2>=91 && LA4_2<=93)) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>=61 && LA4_0<=62)||LA4_0==64||(LA4_0>=70 && LA4_0<=72)||LA4_0==87||(LA4_0>=90 && LA4_0<=93)||LA4_0==99) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // msc_grammar.g:72:6: instanceEvent end
            	    {
            	    pushFollow(FOLLOW_instanceEvent_in_instanceEventList356);
            	    instanceEvent19=instanceEvent();

            	    state._fsp--;

            	    stream_instanceEvent.add(instanceEvent19.getTree());
            	    pushFollow(FOLLOW_end_in_instanceEventList358);
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
            // 72:27: -> ( instanceEvent )+
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
    // msc_grammar.g:75:1: instanceEvent : ( orderableEvent | nonOrderableEvent );
    public final msc_grammarParser.instanceEvent_return instanceEvent() throws RecognitionException {
        msc_grammarParser.instanceEvent_return retval = new msc_grammarParser.instanceEvent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.orderableEvent_return orderableEvent21 = null;

        msc_grammarParser.nonOrderableEvent_return nonOrderableEvent22 = null;



        try {
            // msc_grammar.g:76:2: ( orderableEvent | nonOrderableEvent )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==NAME||(LA5_0>=61 && LA5_0<=62)||LA5_0==64||LA5_0==70||LA5_0==87||(LA5_0>=91 && LA5_0<=93)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=71 && LA5_0<=72)||LA5_0==90||LA5_0==99) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // msc_grammar.g:76:4: orderableEvent
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_orderableEvent_in_instanceEvent379);
                    orderableEvent21=orderableEvent();

                    state._fsp--;

                    adaptor.addChild(root_0, orderableEvent21.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:76:21: nonOrderableEvent
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_nonOrderableEvent_in_instanceEvent383);
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
    // msc_grammar.g:79:1: orderableEvent : ( label )? ( messageEvent | action | create | timerStatement ) ( generalOrdering )? ;
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
            // msc_grammar.g:80:2: ( ( label )? ( messageEvent | action | create | timerStatement ) ( generalOrdering )? )
            // msc_grammar.g:80:4: ( label )? ( messageEvent | action | create | timerStatement ) ( generalOrdering )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // msc_grammar.g:80:4: ( label )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==NAME||LA6_0==61) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // msc_grammar.g:80:4: label
                    {
                    pushFollow(FOLLOW_label_in_orderableEvent395);
                    label23=label();

                    state._fsp--;

                    adaptor.addChild(root_0, label23.getTree());

                    }
                    break;

            }

            // msc_grammar.g:80:11: ( messageEvent | action | create | timerStatement )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 62:
            case 64:
                {
                alt7=1;
                }
                break;
            case 70:
                {
                alt7=2;
                }
                break;
            case 87:
                {
                alt7=3;
                }
                break;
            case 91:
            case 92:
            case 93:
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
                    // msc_grammar.g:80:13: messageEvent
                    {
                    pushFollow(FOLLOW_messageEvent_in_orderableEvent400);
                    messageEvent24=messageEvent();

                    state._fsp--;

                    adaptor.addChild(root_0, messageEvent24.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:80:28: action
                    {
                    pushFollow(FOLLOW_action_in_orderableEvent404);
                    action25=action();

                    state._fsp--;

                    adaptor.addChild(root_0, action25.getTree());

                    }
                    break;
                case 3 :
                    // msc_grammar.g:80:37: create
                    {
                    pushFollow(FOLLOW_create_in_orderableEvent408);
                    create26=create();

                    state._fsp--;

                    adaptor.addChild(root_0, create26.getTree());

                    }
                    break;
                case 4 :
                    // msc_grammar.g:80:46: timerStatement
                    {
                    pushFollow(FOLLOW_timerStatement_in_orderableEvent412);
                    timerStatement27=timerStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, timerStatement27.getTree());

                    }
                    break;

            }

            // msc_grammar.g:80:63: ( generalOrdering )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=97 && LA8_0<=98)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // msc_grammar.g:80:63: generalOrdering
                    {
                    pushFollow(FOLLOW_generalOrdering_in_orderableEvent416);
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
    // msc_grammar.g:83:1: nonOrderableEvent : ( instanceHeadStatement | instanceEndStatement | stop | coregion );
    public final msc_grammarParser.nonOrderableEvent_return nonOrderableEvent() throws RecognitionException {
        msc_grammarParser.nonOrderableEvent_return retval = new msc_grammarParser.nonOrderableEvent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.instanceHeadStatement_return instanceHeadStatement29 = null;

        msc_grammarParser.instanceEndStatement_return instanceEndStatement30 = null;

        msc_grammarParser.stop_return stop31 = null;

        msc_grammarParser.coregion_return coregion32 = null;



        try {
            // msc_grammar.g:84:2: ( instanceHeadStatement | instanceEndStatement | stop | coregion )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt9=1;
                }
                break;
            case 72:
                {
                alt9=2;
                }
                break;
            case 90:
                {
                alt9=3;
                }
                break;
            case 99:
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
                    // msc_grammar.g:84:4: instanceHeadStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_instanceHeadStatement_in_nonOrderableEvent429);
                    instanceHeadStatement29=instanceHeadStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, instanceHeadStatement29.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:84:28: instanceEndStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_instanceEndStatement_in_nonOrderableEvent433);
                    instanceEndStatement30=instanceEndStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, instanceEndStatement30.getTree());

                    }
                    break;
                case 3 :
                    // msc_grammar.g:84:51: stop
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_stop_in_nonOrderableEvent437);
                    stop31=stop();

                    state._fsp--;

                    adaptor.addChild(root_0, stop31.getTree());

                    }
                    break;
                case 4 :
                    // msc_grammar.g:84:58: coregion
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_coregion_in_nonOrderableEvent441);
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
    // msc_grammar.g:87:1: instanceNameList : ( instanceName ( ',' instanceName )* -> ^( INameList ( instanceName )+ ) | ALL -> ^( INameList ALL ) );
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
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_ALL=new RewriteRuleTokenStream(adaptor,"token ALL");
        RewriteRuleSubtreeStream stream_instanceName=new RewriteRuleSubtreeStream(adaptor,"rule instanceName");
        try {
            // msc_grammar.g:88:2: ( instanceName ( ',' instanceName )* -> ^( INameList ( instanceName )+ ) | ALL -> ^( INameList ALL ) )
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
                    // msc_grammar.g:88:4: instanceName ( ',' instanceName )*
                    {
                    pushFollow(FOLLOW_instanceName_in_instanceNameList454);
                    instanceName33=instanceName();

                    state._fsp--;

                    stream_instanceName.add(instanceName33.getTree());
                    // msc_grammar.g:88:17: ( ',' instanceName )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==60) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // msc_grammar.g:88:19: ',' instanceName
                    	    {
                    	    char_literal34=(Token)match(input,60,FOLLOW_60_in_instanceNameList458);  
                    	    stream_60.add(char_literal34);

                    	    pushFollow(FOLLOW_instanceName_in_instanceNameList460);
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
                    // 88:39: -> ^( INameList ( instanceName )+ )
                    {
                        // msc_grammar.g:88:42: ^( INameList ( instanceName )+ )
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
                    // msc_grammar.g:89:5: ALL
                    {
                    ALL36=(Token)match(input,ALL,FOLLOW_ALL_in_instanceNameList480);  
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
                    // 89:9: -> ^( INameList ALL )
                    {
                        // msc_grammar.g:89:12: ^( INameList ALL )
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
    // msc_grammar.g:92:1: multiInstanceEventList : ( multiInstanceEvent end )+ -> ( multiInstanceEvent )+ ;
    public final msc_grammarParser.multiInstanceEventList_return multiInstanceEventList() throws RecognitionException {
        msc_grammarParser.multiInstanceEventList_return retval = new msc_grammarParser.multiInstanceEventList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.multiInstanceEvent_return multiInstanceEvent37 = null;

        msc_grammarParser.end_return end38 = null;


        RewriteRuleSubtreeStream stream_multiInstanceEvent=new RewriteRuleSubtreeStream(adaptor,"rule multiInstanceEvent");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:93:2: ( ( multiInstanceEvent end )+ -> ( multiInstanceEvent )+ )
            // msc_grammar.g:93:4: ( multiInstanceEvent end )+
            {
            // msc_grammar.g:93:4: ( multiInstanceEvent end )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                switch ( input.LA(1) ) {
                case 80:
                    {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==BEGIN||LA12_2==85) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 81:
                    {
                    int LA12_3 = input.LA(2);

                    if ( (LA12_3==BEGIN) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 82:
                    {
                    int LA12_4 = input.LA(2);

                    if ( (LA12_4==BEGIN) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 83:
                    {
                    int LA12_5 = input.LA(2);

                    if ( (LA12_5==BEGIN) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 84:
                    {
                    int LA12_6 = input.LA(2);

                    if ( (LA12_6==BEGIN) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 79:
                case 101:
                    {
                    alt12=1;
                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // msc_grammar.g:93:6: multiInstanceEvent end
            	    {
            	    pushFollow(FOLLOW_multiInstanceEvent_in_multiInstanceEventList505);
            	    multiInstanceEvent37=multiInstanceEvent();

            	    state._fsp--;

            	    stream_multiInstanceEvent.add(multiInstanceEvent37.getTree());
            	    pushFollow(FOLLOW_end_in_multiInstanceEventList507);
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
            // 93:32: -> ( multiInstanceEvent )+
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
    // msc_grammar.g:96:1: multiInstanceEvent : ( condition | mscReference | inlineExpr );
    public final msc_grammarParser.multiInstanceEvent_return multiInstanceEvent() throws RecognitionException {
        msc_grammarParser.multiInstanceEvent_return retval = new msc_grammarParser.multiInstanceEvent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.condition_return condition39 = null;

        msc_grammarParser.mscReference_return mscReference40 = null;

        msc_grammarParser.inlineExpr_return inlineExpr41 = null;



        try {
            // msc_grammar.g:97:2: ( condition | mscReference | inlineExpr )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt13=1;
                }
                break;
            case 101:
                {
                alt13=2;
                }
                break;
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
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
                    // msc_grammar.g:97:4: condition
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_condition_in_multiInstanceEvent528);
                    condition39=condition();

                    state._fsp--;

                    adaptor.addChild(root_0, condition39.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:97:16: mscReference
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_mscReference_in_multiInstanceEvent532);
                    mscReference40=mscReference();

                    state._fsp--;

                    adaptor.addChild(root_0, mscReference40.getTree());

                    }
                    break;
                case 3 :
                    // msc_grammar.g:97:31: inlineExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_inlineExpr_in_multiInstanceEvent536);
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
    // msc_grammar.g:101:1: label : ( eventName | 'label' eventName end ) -> ^( Label eventName ) ;
    public final msc_grammarParser.label_return label() throws RecognitionException {
        msc_grammarParser.label_return retval = new msc_grammarParser.label_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal43=null;
        msc_grammarParser.eventName_return eventName42 = null;

        msc_grammarParser.eventName_return eventName44 = null;

        msc_grammarParser.end_return end45 = null;


        CommonTree string_literal43_tree=null;
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_eventName=new RewriteRuleSubtreeStream(adaptor,"rule eventName");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:101:8: ( ( eventName | 'label' eventName end ) -> ^( Label eventName ) )
            // msc_grammar.g:101:10: ( eventName | 'label' eventName end )
            {
            // msc_grammar.g:101:10: ( eventName | 'label' eventName end )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==NAME) ) {
                alt14=1;
            }
            else if ( (LA14_0==61) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // msc_grammar.g:101:12: eventName
                    {
                    pushFollow(FOLLOW_eventName_in_label550);
                    eventName42=eventName();

                    state._fsp--;

                    stream_eventName.add(eventName42.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:101:24: 'label' eventName end
                    {
                    string_literal43=(Token)match(input,61,FOLLOW_61_in_label554);  
                    stream_61.add(string_literal43);

                    pushFollow(FOLLOW_eventName_in_label556);
                    eventName44=eventName();

                    state._fsp--;

                    stream_eventName.add(eventName44.getTree());
                    pushFollow(FOLLOW_end_in_label558);
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
            // 101:48: -> ^( Label eventName )
            {
                // msc_grammar.g:101:51: ^( Label eventName )
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
    // msc_grammar.g:105:1: messageEvent : ( 'out' msgIdentification 'to' messageReceiver -> ^( MSGOut msgIdentification messageReceiver ) | 'in' msgIdentification 'from' messageSender -> ^( MSGIn msgIdentification messageSender ) );
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
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_messageReceiver=new RewriteRuleSubtreeStream(adaptor,"rule messageReceiver");
        RewriteRuleSubtreeStream stream_msgIdentification=new RewriteRuleSubtreeStream(adaptor,"rule msgIdentification");
        RewriteRuleSubtreeStream stream_messageSender=new RewriteRuleSubtreeStream(adaptor,"rule messageSender");
        try {
            // msc_grammar.g:106:2: ( 'out' msgIdentification 'to' messageReceiver -> ^( MSGOut msgIdentification messageReceiver ) | 'in' msgIdentification 'from' messageSender -> ^( MSGIn msgIdentification messageSender ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==62) ) {
                alt15=1;
            }
            else if ( (LA15_0==64) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // msc_grammar.g:106:4: 'out' msgIdentification 'to' messageReceiver
                    {
                    string_literal46=(Token)match(input,62,FOLLOW_62_in_messageEvent583);  
                    stream_62.add(string_literal46);

                    pushFollow(FOLLOW_msgIdentification_in_messageEvent585);
                    msgIdentification47=msgIdentification();

                    state._fsp--;

                    stream_msgIdentification.add(msgIdentification47.getTree());
                    string_literal48=(Token)match(input,63,FOLLOW_63_in_messageEvent587);  
                    stream_63.add(string_literal48);

                    pushFollow(FOLLOW_messageReceiver_in_messageEvent589);
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
                    // 106:49: -> ^( MSGOut msgIdentification messageReceiver )
                    {
                        // msc_grammar.g:106:52: ^( MSGOut msgIdentification messageReceiver )
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
                    // msc_grammar.g:107:4: 'in' msgIdentification 'from' messageSender
                    {
                    string_literal50=(Token)match(input,64,FOLLOW_64_in_messageEvent606);  
                    stream_64.add(string_literal50);

                    pushFollow(FOLLOW_msgIdentification_in_messageEvent608);
                    msgIdentification51=msgIdentification();

                    state._fsp--;

                    stream_msgIdentification.add(msgIdentification51.getTree());
                    string_literal52=(Token)match(input,65,FOLLOW_65_in_messageEvent610);  
                    stream_65.add(string_literal52);

                    pushFollow(FOLLOW_messageSender_in_messageEvent612);
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
                    // 107:49: -> ^( MSGIn msgIdentification messageSender )
                    {
                        // msc_grammar.g:107:52: ^( MSGIn msgIdentification messageSender )
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
    // msc_grammar.g:110:1: messageReceiver : ( inputAddress -> inputAddress FullMsg | 'lost' ( inputAddress )? -> ( inputAddress )? IncompleteMsg );
    public final msc_grammarParser.messageReceiver_return messageReceiver() throws RecognitionException {
        msc_grammarParser.messageReceiver_return retval = new msc_grammarParser.messageReceiver_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal55=null;
        msc_grammarParser.inputAddress_return inputAddress54 = null;

        msc_grammarParser.inputAddress_return inputAddress56 = null;


        CommonTree string_literal55_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleSubtreeStream stream_inputAddress=new RewriteRuleSubtreeStream(adaptor,"rule inputAddress");
        try {
            // msc_grammar.g:111:2: ( inputAddress -> inputAddress FullMsg | 'lost' ( inputAddress )? -> ( inputAddress )? IncompleteMsg )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==NAME||LA17_0==68) ) {
                alt17=1;
            }
            else if ( (LA17_0==66) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // msc_grammar.g:111:4: inputAddress
                    {
                    pushFollow(FOLLOW_inputAddress_in_messageReceiver638);
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
                    // 111:17: -> inputAddress FullMsg
                    {
                        adaptor.addChild(root_0, stream_inputAddress.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FullMsg, "FullMsg"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // msc_grammar.g:112:4: 'lost' ( inputAddress )?
                    {
                    string_literal55=(Token)match(input,66,FOLLOW_66_in_messageReceiver649);  
                    stream_66.add(string_literal55);

                    // msc_grammar.g:112:11: ( inputAddress )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==NAME||LA16_0==68) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // msc_grammar.g:112:13: inputAddress
                            {
                            pushFollow(FOLLOW_inputAddress_in_messageReceiver653);
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
                    // 112:29: -> ( inputAddress )? IncompleteMsg
                    {
                        // msc_grammar.g:112:32: ( inputAddress )?
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
    // msc_grammar.g:115:1: messageSender : ( outputAddress -> outputAddress FullMsg | 'found' ( outputAddress )? -> ( outputAddress )? IncompleteMsg );
    public final msc_grammarParser.messageSender_return messageSender() throws RecognitionException {
        msc_grammarParser.messageSender_return retval = new msc_grammarParser.messageSender_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal58=null;
        msc_grammarParser.outputAddress_return outputAddress57 = null;

        msc_grammarParser.outputAddress_return outputAddress59 = null;


        CommonTree string_literal58_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleSubtreeStream stream_outputAddress=new RewriteRuleSubtreeStream(adaptor,"rule outputAddress");
        try {
            // msc_grammar.g:116:2: ( outputAddress -> outputAddress FullMsg | 'found' ( outputAddress )? -> ( outputAddress )? IncompleteMsg )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==NAME||LA19_0==68) ) {
                alt19=1;
            }
            else if ( (LA19_0==67) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // msc_grammar.g:116:4: outputAddress
                    {
                    pushFollow(FOLLOW_outputAddress_in_messageSender675);
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
                    // 116:18: -> outputAddress FullMsg
                    {
                        adaptor.addChild(root_0, stream_outputAddress.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FullMsg, "FullMsg"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // msc_grammar.g:117:4: 'found' ( outputAddress )?
                    {
                    string_literal58=(Token)match(input,67,FOLLOW_67_in_messageSender686);  
                    stream_67.add(string_literal58);

                    // msc_grammar.g:117:12: ( outputAddress )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==NAME||LA18_0==68) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // msc_grammar.g:117:14: outputAddress
                            {
                            pushFollow(FOLLOW_outputAddress_in_messageSender690);
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
                    // 117:31: -> ( outputAddress )? IncompleteMsg
                    {
                        // msc_grammar.g:117:34: ( outputAddress )?
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
    // msc_grammar.g:120:1: msgIdentification : ( messageName | characterString );
    public final msc_grammarParser.msgIdentification_return msgIdentification() throws RecognitionException {
        msc_grammarParser.msgIdentification_return retval = new msc_grammarParser.msgIdentification_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.messageName_return messageName60 = null;

        msc_grammarParser.characterString_return characterString61 = null;



        try {
            // msc_grammar.g:121:2: ( messageName | characterString )
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
                    // msc_grammar.g:121:4: messageName
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_messageName_in_msgIdentification713);
                    messageName60=messageName();

                    state._fsp--;

                    adaptor.addChild(root_0, messageName60.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:121:18: characterString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_characterString_in_msgIdentification717);
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
    // msc_grammar.g:124:1: outputAddress : ( instanceName | 'env' ( 'via' gateName )? -> ^( MsgGate ( gateName )? ) );
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
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleSubtreeStream stream_gateName=new RewriteRuleSubtreeStream(adaptor,"rule gateName");
        try {
            // msc_grammar.g:125:2: ( instanceName | 'env' ( 'via' gateName )? -> ^( MsgGate ( gateName )? ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==NAME) ) {
                alt22=1;
            }
            else if ( (LA22_0==68) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // msc_grammar.g:125:4: instanceName
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_instanceName_in_outputAddress729);
                    instanceName62=instanceName();

                    state._fsp--;

                    adaptor.addChild(root_0, instanceName62.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:126:4: 'env' ( 'via' gateName )?
                    {
                    string_literal63=(Token)match(input,68,FOLLOW_68_in_outputAddress734);  
                    stream_68.add(string_literal63);

                    // msc_grammar.g:126:10: ( 'via' gateName )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==69) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // msc_grammar.g:126:12: 'via' gateName
                            {
                            string_literal64=(Token)match(input,69,FOLLOW_69_in_outputAddress738);  
                            stream_69.add(string_literal64);

                            pushFollow(FOLLOW_gateName_in_outputAddress740);
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
                    // 126:30: -> ^( MsgGate ( gateName )? )
                    {
                        // msc_grammar.g:126:33: ^( MsgGate ( gateName )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MsgGate, "MsgGate"), root_1);

                        // msc_grammar.g:126:44: ( gateName )?
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
    // msc_grammar.g:129:1: inputAddress : ( instanceName | 'env' ( 'via' gateName )? -> ^( MsgGate ( gateName )? ) );
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
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleSubtreeStream stream_gateName=new RewriteRuleSubtreeStream(adaptor,"rule gateName");
        try {
            // msc_grammar.g:130:2: ( instanceName | 'env' ( 'via' gateName )? -> ^( MsgGate ( gateName )? ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==NAME) ) {
                alt24=1;
            }
            else if ( (LA24_0==68) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // msc_grammar.g:130:4: instanceName
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_instanceName_in_inputAddress767);
                    instanceName66=instanceName();

                    state._fsp--;

                    adaptor.addChild(root_0, instanceName66.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:131:4: 'env' ( 'via' gateName )?
                    {
                    string_literal67=(Token)match(input,68,FOLLOW_68_in_inputAddress772);  
                    stream_68.add(string_literal67);

                    // msc_grammar.g:131:10: ( 'via' gateName )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==69) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // msc_grammar.g:131:12: 'via' gateName
                            {
                            string_literal68=(Token)match(input,69,FOLLOW_69_in_inputAddress776);  
                            stream_69.add(string_literal68);

                            pushFollow(FOLLOW_gateName_in_inputAddress778);
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
    // $ANTLR end "inputAddress"

    public static class action_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "action"
    // msc_grammar.g:134:1: action : 'action' actionStatement -> actionStatement ;
    public final msc_grammarParser.action_return action() throws RecognitionException {
        msc_grammarParser.action_return retval = new msc_grammarParser.action_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal70=null;
        msc_grammarParser.actionStatement_return actionStatement71 = null;


        CommonTree string_literal70_tree=null;
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_actionStatement=new RewriteRuleSubtreeStream(adaptor,"rule actionStatement");
        try {
            // msc_grammar.g:134:9: ( 'action' actionStatement -> actionStatement )
            // msc_grammar.g:134:11: 'action' actionStatement
            {
            string_literal70=(Token)match(input,70,FOLLOW_70_in_action804);  
            stream_70.add(string_literal70);

            pushFollow(FOLLOW_actionStatement_in_action806);
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
            // 134:36: -> actionStatement
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
    // msc_grammar.g:136:1: actionStatement : informalAction -> ^( Action informalAction ) ;
    public final msc_grammarParser.actionStatement_return actionStatement() throws RecognitionException {
        msc_grammarParser.actionStatement_return retval = new msc_grammarParser.actionStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.informalAction_return informalAction72 = null;


        RewriteRuleSubtreeStream stream_informalAction=new RewriteRuleSubtreeStream(adaptor,"rule informalAction");
        try {
            // msc_grammar.g:137:2: ( informalAction -> ^( Action informalAction ) )
            // msc_grammar.g:137:4: informalAction
            {
            pushFollow(FOLLOW_informalAction_in_actionStatement821);
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
            // 137:19: -> ^( Action informalAction )
            {
                // msc_grammar.g:137:22: ^( Action informalAction )
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
    // msc_grammar.g:139:1: informalAction : ( name | characterString );
    public final msc_grammarParser.informalAction_return informalAction() throws RecognitionException {
        msc_grammarParser.informalAction_return retval = new msc_grammarParser.informalAction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.name_return name73 = null;

        msc_grammarParser.characterString_return characterString74 = null;



        try {
            // msc_grammar.g:140:2: ( name | characterString )
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
                    // msc_grammar.g:140:4: name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_name_in_informalAction842);
                    name73=name();

                    state._fsp--;

                    adaptor.addChild(root_0, name73.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:140:11: characterString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_characterString_in_informalAction846);
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
    // msc_grammar.g:143:1: instanceHeadStatement : 'instance' ( instanceKind )? ;
    public final msc_grammarParser.instanceHeadStatement_return instanceHeadStatement() throws RecognitionException {
        msc_grammarParser.instanceHeadStatement_return retval = new msc_grammarParser.instanceHeadStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal75=null;
        msc_grammarParser.instanceKind_return instanceKind76 = null;


        CommonTree string_literal75_tree=null;

        try {
            // msc_grammar.g:144:2: ( 'instance' ( instanceKind )? )
            // msc_grammar.g:144:4: 'instance' ( instanceKind )?
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal75=(Token)match(input,71,FOLLOW_71_in_instanceHeadStatement859); 
            string_literal75_tree = (CommonTree)adaptor.create(string_literal75);
            adaptor.addChild(root_0, string_literal75_tree);

            // msc_grammar.g:144:15: ( instanceKind )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==NAME||(LA26_0>=74 && LA26_0<=77)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // msc_grammar.g:144:17: instanceKind
                    {
                    pushFollow(FOLLOW_instanceKind_in_instanceHeadStatement863);
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
    // msc_grammar.g:147:1: instanceEndStatement : 'endinstance' ;
    public final msc_grammarParser.instanceEndStatement_return instanceEndStatement() throws RecognitionException {
        msc_grammarParser.instanceEndStatement_return retval = new msc_grammarParser.instanceEndStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal77=null;

        CommonTree string_literal77_tree=null;

        try {
            // msc_grammar.g:148:2: ( 'endinstance' )
            // msc_grammar.g:148:4: 'endinstance'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal77=(Token)match(input,72,FOLLOW_72_in_instanceEndStatement879); 
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
    // msc_grammar.g:151:1: mscInterface : ( mscInstInterface ( mscGateInterface )? | mscGateInterface );
    public final msc_grammarParser.mscInterface_return mscInterface() throws RecognitionException {
        msc_grammarParser.mscInterface_return retval = new msc_grammarParser.mscInterface_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.mscInstInterface_return mscInstInterface78 = null;

        msc_grammarParser.mscGateInterface_return mscGateInterface79 = null;

        msc_grammarParser.mscGateInterface_return mscGateInterface80 = null;



        try {
            // msc_grammar.g:152:2: ( mscInstInterface ( mscGateInterface )? | mscGateInterface )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==73) ) {
                alt28=1;
            }
            else if ( (LA28_0==96) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // msc_grammar.g:152:4: mscInstInterface ( mscGateInterface )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_mscInstInterface_in_mscInterface891);
                    mscInstInterface78=mscInstInterface();

                    state._fsp--;

                    adaptor.addChild(root_0, mscInstInterface78.getTree());
                    // msc_grammar.g:152:21: ( mscGateInterface )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==96) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // msc_grammar.g:152:23: mscGateInterface
                            {
                            pushFollow(FOLLOW_mscGateInterface_in_mscInterface895);
                            mscGateInterface79=mscGateInterface();

                            state._fsp--;

                            adaptor.addChild(root_0, mscGateInterface79.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // msc_grammar.g:152:45: mscGateInterface
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_mscGateInterface_in_mscInterface902);
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
    // msc_grammar.g:155:1: mscInstInterface : 'inst' instanceList end ;
    public final msc_grammarParser.mscInstInterface_return mscInstInterface() throws RecognitionException {
        msc_grammarParser.mscInstInterface_return retval = new msc_grammarParser.mscInstInterface_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal81=null;
        msc_grammarParser.instanceList_return instanceList82 = null;

        msc_grammarParser.end_return end83 = null;


        CommonTree string_literal81_tree=null;

        try {
            // msc_grammar.g:156:2: ( 'inst' instanceList end )
            // msc_grammar.g:156:4: 'inst' instanceList end
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal81=(Token)match(input,73,FOLLOW_73_in_mscInstInterface915); 
            string_literal81_tree = (CommonTree)adaptor.create(string_literal81);
            adaptor.addChild(root_0, string_literal81_tree);

            pushFollow(FOLLOW_instanceList_in_mscInstInterface917);
            instanceList82=instanceList();

            state._fsp--;

            adaptor.addChild(root_0, instanceList82.getTree());
            pushFollow(FOLLOW_end_in_mscInstInterface919);
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
    // msc_grammar.g:159:1: instanceList : instanceName ( ':' instanceKind )? ( ',' instanceList )? ;
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
            // msc_grammar.g:160:2: ( instanceName ( ':' instanceKind )? ( ',' instanceList )? )
            // msc_grammar.g:160:4: instanceName ( ':' instanceKind )? ( ',' instanceList )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_instanceName_in_instanceList932);
            instanceName84=instanceName();

            state._fsp--;

            adaptor.addChild(root_0, instanceName84.getTree());
            // msc_grammar.g:160:17: ( ':' instanceKind )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==59) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // msc_grammar.g:160:19: ':' instanceKind
                    {
                    char_literal85=(Token)match(input,59,FOLLOW_59_in_instanceList936); 
                    char_literal85_tree = (CommonTree)adaptor.create(char_literal85);
                    adaptor.addChild(root_0, char_literal85_tree);

                    pushFollow(FOLLOW_instanceKind_in_instanceList938);
                    instanceKind86=instanceKind();

                    state._fsp--;

                    adaptor.addChild(root_0, instanceKind86.getTree());

                    }
                    break;

            }

            // msc_grammar.g:160:39: ( ',' instanceList )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==60) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // msc_grammar.g:160:41: ',' instanceList
                    {
                    char_literal87=(Token)match(input,60,FOLLOW_60_in_instanceList945); 
                    char_literal87_tree = (CommonTree)adaptor.create(char_literal87);
                    adaptor.addChild(root_0, char_literal87_tree);

                    pushFollow(FOLLOW_instanceList_in_instanceList947);
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
    // msc_grammar.g:163:1: instanceKind : ( kindDenominator )? identifier ;
    public final msc_grammarParser.instanceKind_return instanceKind() throws RecognitionException {
        msc_grammarParser.instanceKind_return retval = new msc_grammarParser.instanceKind_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.kindDenominator_return kindDenominator89 = null;

        msc_grammarParser.identifier_return identifier90 = null;



        try {
            // msc_grammar.g:164:2: ( ( kindDenominator )? identifier )
            // msc_grammar.g:164:4: ( kindDenominator )? identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            // msc_grammar.g:164:4: ( kindDenominator )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=74 && LA31_0<=77)) ) {
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
                    // msc_grammar.g:164:6: kindDenominator
                    {
                    pushFollow(FOLLOW_kindDenominator_in_instanceKind965);
                    kindDenominator89=kindDenominator();

                    state._fsp--;

                    adaptor.addChild(root_0, kindDenominator89.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_identifier_in_instanceKind970);
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
    // msc_grammar.g:167:1: kindDenominator : ( 'system' | 'block' | 'process' | 'service' | name );
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
            // msc_grammar.g:168:2: ( 'system' | 'block' | 'process' | 'service' | name )
            int alt32=5;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt32=1;
                }
                break;
            case 75:
                {
                alt32=2;
                }
                break;
            case 76:
                {
                alt32=3;
                }
                break;
            case 77:
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
                    // msc_grammar.g:168:4: 'system'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal91=(Token)match(input,74,FOLLOW_74_in_kindDenominator983); 
                    string_literal91_tree = (CommonTree)adaptor.create(string_literal91);
                    adaptor.addChild(root_0, string_literal91_tree);


                    }
                    break;
                case 2 :
                    // msc_grammar.g:168:15: 'block'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal92=(Token)match(input,75,FOLLOW_75_in_kindDenominator987); 
                    string_literal92_tree = (CommonTree)adaptor.create(string_literal92);
                    adaptor.addChild(root_0, string_literal92_tree);


                    }
                    break;
                case 3 :
                    // msc_grammar.g:168:25: 'process'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal93=(Token)match(input,76,FOLLOW_76_in_kindDenominator991); 
                    string_literal93_tree = (CommonTree)adaptor.create(string_literal93);
                    adaptor.addChild(root_0, string_literal93_tree);


                    }
                    break;
                case 4 :
                    // msc_grammar.g:168:37: 'service'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal94=(Token)match(input,77,FOLLOW_77_in_kindDenominator995); 
                    string_literal94_tree = (CommonTree)adaptor.create(string_literal94);
                    adaptor.addChild(root_0, string_literal94_tree);


                    }
                    break;
                case 5 :
                    // msc_grammar.g:168:49: name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_name_in_kindDenominator999);
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
    // msc_grammar.g:171:1: end : ';' ;
    public final msc_grammarParser.end_return end() throws RecognitionException {
        msc_grammarParser.end_return retval = new msc_grammarParser.end_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal96=null;

        CommonTree char_literal96_tree=null;

        try {
            // msc_grammar.g:171:6: ( ';' )
            // msc_grammar.g:171:8: ';'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal96=(Token)match(input,78,FOLLOW_78_in_end1010); 
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
    // msc_grammar.g:175:1: condition : conditionIdentification ;
    public final msc_grammarParser.condition_return condition() throws RecognitionException {
        msc_grammarParser.condition_return retval = new msc_grammarParser.condition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.conditionIdentification_return conditionIdentification97 = null;



        try {
            // msc_grammar.g:176:2: ( conditionIdentification )
            // msc_grammar.g:176:4: conditionIdentification
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_conditionIdentification_in_condition1023);
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
    // msc_grammar.g:178:1: conditionIdentification : 'condition' conditionText -> ^( Condition conditionText ) ;
    public final msc_grammarParser.conditionIdentification_return conditionIdentification() throws RecognitionException {
        msc_grammarParser.conditionIdentification_return retval = new msc_grammarParser.conditionIdentification_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal98=null;
        msc_grammarParser.conditionText_return conditionText99 = null;


        CommonTree string_literal98_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleSubtreeStream stream_conditionText=new RewriteRuleSubtreeStream(adaptor,"rule conditionText");
        try {
            // msc_grammar.g:179:2: ( 'condition' conditionText -> ^( Condition conditionText ) )
            // msc_grammar.g:179:4: 'condition' conditionText
            {
            string_literal98=(Token)match(input,79,FOLLOW_79_in_conditionIdentification1034);  
            stream_79.add(string_literal98);

            pushFollow(FOLLOW_conditionText_in_conditionIdentification1036);
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
            // 179:30: -> ^( Condition conditionText )
            {
                // msc_grammar.g:179:33: ^( Condition conditionText )
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
    // msc_grammar.g:181:1: conditionText : ( conditionNameList -> SetCond conditionNameList | WHEN conditionNameList -> GuardCond conditionNameList | OTHERWISE -> ElseCond );
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
            // msc_grammar.g:182:2: ( conditionNameList -> SetCond conditionNameList | WHEN conditionNameList -> GuardCond conditionNameList | OTHERWISE -> ElseCond )
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
                    // msc_grammar.g:182:4: conditionNameList
                    {
                    pushFollow(FOLLOW_conditionNameList_in_conditionText1057);
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
                    // 182:23: -> SetCond conditionNameList
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SetCond, "SetCond"));
                        adaptor.addChild(root_0, stream_conditionNameList.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // msc_grammar.g:183:4: WHEN conditionNameList
                    {
                    WHEN101=(Token)match(input,WHEN,FOLLOW_WHEN_in_conditionText1069);  
                    stream_WHEN.add(WHEN101);

                    pushFollow(FOLLOW_conditionNameList_in_conditionText1071);
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
                    // 183:27: -> GuardCond conditionNameList
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(GuardCond, "GuardCond"));
                        adaptor.addChild(root_0, stream_conditionNameList.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // msc_grammar.g:184:5: OTHERWISE
                    {
                    OTHERWISE103=(Token)match(input,OTHERWISE,FOLLOW_OTHERWISE_in_conditionText1083);  
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
                    // 184:17: -> ElseCond
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
    // msc_grammar.g:186:1: conditionNameList : ( name | characterString );
    public final msc_grammarParser.conditionNameList_return conditionNameList() throws RecognitionException {
        msc_grammarParser.conditionNameList_return retval = new msc_grammarParser.conditionNameList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.name_return name104 = null;

        msc_grammarParser.characterString_return characterString105 = null;



        try {
            // msc_grammar.g:187:2: ( name | characterString )
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
                    // msc_grammar.g:187:4: name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_name_in_conditionNameList1100);
                    name104=name();

                    state._fsp--;

                    adaptor.addChild(root_0, name104.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:187:11: characterString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_characterString_in_conditionNameList1104);
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
    // msc_grammar.g:191:1: inlineExpr : ( loopExpr | optExpr | altExpr | parExpr | excExpr );
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
            // msc_grammar.g:192:2: ( loopExpr | optExpr | altExpr | parExpr | excExpr )
            int alt35=5;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt35=1;
                }
                break;
            case 81:
                {
                alt35=2;
                }
                break;
            case 83:
                {
                alt35=3;
                }
                break;
            case 84:
                {
                alt35=4;
                }
                break;
            case 82:
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
                    // msc_grammar.g:192:4: loopExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_loopExpr_in_inlineExpr1117);
                    loopExpr106=loopExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, loopExpr106.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:192:15: optExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_optExpr_in_inlineExpr1121);
                    optExpr107=optExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, optExpr107.getTree());

                    }
                    break;
                case 3 :
                    // msc_grammar.g:192:25: altExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_altExpr_in_inlineExpr1125);
                    altExpr108=altExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, altExpr108.getTree());

                    }
                    break;
                case 4 :
                    // msc_grammar.g:192:35: parExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parExpr_in_inlineExpr1129);
                    parExpr109=parExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, parExpr109.getTree());

                    }
                    break;
                case 5 :
                    // msc_grammar.g:192:45: excExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_excExpr_in_inlineExpr1133);
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
    // msc_grammar.g:194:1: loopExpr : 'loop' ( loopBoundary )? BEGIN end mscBody 'loop' END -> ^( Loop mscBody ( loopBoundary )? ) ;
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
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_loopBoundary=new RewriteRuleSubtreeStream(adaptor,"rule loopBoundary");
        RewriteRuleSubtreeStream stream_mscBody=new RewriteRuleSubtreeStream(adaptor,"rule mscBody");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:195:2: ( 'loop' ( loopBoundary )? BEGIN end mscBody 'loop' END -> ^( Loop mscBody ( loopBoundary )? ) )
            // msc_grammar.g:195:4: 'loop' ( loopBoundary )? BEGIN end mscBody 'loop' END
            {
            string_literal111=(Token)match(input,80,FOLLOW_80_in_loopExpr1144);  
            stream_80.add(string_literal111);

            // msc_grammar.g:195:11: ( loopBoundary )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==85) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // msc_grammar.g:195:13: loopBoundary
                    {
                    pushFollow(FOLLOW_loopBoundary_in_loopExpr1148);
                    loopBoundary112=loopBoundary();

                    state._fsp--;

                    stream_loopBoundary.add(loopBoundary112.getTree());

                    }
                    break;

            }

            BEGIN113=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_loopExpr1153);  
            stream_BEGIN.add(BEGIN113);

            pushFollow(FOLLOW_end_in_loopExpr1155);
            end114=end();

            state._fsp--;

            stream_end.add(end114.getTree());
            pushFollow(FOLLOW_mscBody_in_loopExpr1157);
            mscBody115=mscBody();

            state._fsp--;

            stream_mscBody.add(mscBody115.getTree());
            string_literal116=(Token)match(input,80,FOLLOW_80_in_loopExpr1159);  
            stream_80.add(string_literal116);

            END117=(Token)match(input,END,FOLLOW_END_in_loopExpr1161);  
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
            // 195:58: -> ^( Loop mscBody ( loopBoundary )? )
            {
                // msc_grammar.g:195:61: ^( Loop mscBody ( loopBoundary )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Loop, "Loop"), root_1);

                adaptor.addChild(root_1, stream_mscBody.nextTree());
                // msc_grammar.g:195:77: ( loopBoundary )?
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
    // msc_grammar.g:197:1: optExpr : 'opt' BEGIN end mscBody 'opt' END -> ^( Opt mscBody ) ;
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
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_mscBody=new RewriteRuleSubtreeStream(adaptor,"rule mscBody");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:197:9: ( 'opt' BEGIN end mscBody 'opt' END -> ^( Opt mscBody ) )
            // msc_grammar.g:197:11: 'opt' BEGIN end mscBody 'opt' END
            {
            string_literal118=(Token)match(input,81,FOLLOW_81_in_optExpr1183);  
            stream_81.add(string_literal118);

            BEGIN119=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_optExpr1185);  
            stream_BEGIN.add(BEGIN119);

            pushFollow(FOLLOW_end_in_optExpr1187);
            end120=end();

            state._fsp--;

            stream_end.add(end120.getTree());
            pushFollow(FOLLOW_mscBody_in_optExpr1189);
            mscBody121=mscBody();

            state._fsp--;

            stream_mscBody.add(mscBody121.getTree());
            string_literal122=(Token)match(input,81,FOLLOW_81_in_optExpr1191);  
            stream_81.add(string_literal122);

            END123=(Token)match(input,END,FOLLOW_END_in_optExpr1193);  
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
            // 197:45: -> ^( Opt mscBody )
            {
                // msc_grammar.g:197:48: ^( Opt mscBody )
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
    // msc_grammar.g:199:1: excExpr : 'exc' BEGIN end mscBody 'exc' END -> ^( Exc mscBody ) ;
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
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_mscBody=new RewriteRuleSubtreeStream(adaptor,"rule mscBody");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:199:9: ( 'exc' BEGIN end mscBody 'exc' END -> ^( Exc mscBody ) )
            // msc_grammar.g:199:11: 'exc' BEGIN end mscBody 'exc' END
            {
            string_literal124=(Token)match(input,82,FOLLOW_82_in_excExpr1212);  
            stream_82.add(string_literal124);

            BEGIN125=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_excExpr1214);  
            stream_BEGIN.add(BEGIN125);

            pushFollow(FOLLOW_end_in_excExpr1216);
            end126=end();

            state._fsp--;

            stream_end.add(end126.getTree());
            pushFollow(FOLLOW_mscBody_in_excExpr1218);
            mscBody127=mscBody();

            state._fsp--;

            stream_mscBody.add(mscBody127.getTree());
            string_literal128=(Token)match(input,82,FOLLOW_82_in_excExpr1220);  
            stream_82.add(string_literal128);

            END129=(Token)match(input,END,FOLLOW_END_in_excExpr1222);  
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
            // 199:45: -> ^( Exc mscBody )
            {
                // msc_grammar.g:199:48: ^( Exc mscBody )
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
    // msc_grammar.g:201:1: altExpr : 'alt' BEGIN end mscBody ( 'alt' end mscBody )* 'alt' END -> ^( Alt ( mscBody )+ ) ;
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
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_mscBody=new RewriteRuleSubtreeStream(adaptor,"rule mscBody");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:201:9: ( 'alt' BEGIN end mscBody ( 'alt' end mscBody )* 'alt' END -> ^( Alt ( mscBody )+ ) )
            // msc_grammar.g:201:11: 'alt' BEGIN end mscBody ( 'alt' end mscBody )* 'alt' END
            {
            string_literal130=(Token)match(input,83,FOLLOW_83_in_altExpr1241);  
            stream_83.add(string_literal130);

            BEGIN131=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_altExpr1243);  
            stream_BEGIN.add(BEGIN131);

            pushFollow(FOLLOW_end_in_altExpr1245);
            end132=end();

            state._fsp--;

            stream_end.add(end132.getTree());
            pushFollow(FOLLOW_mscBody_in_altExpr1247);
            mscBody133=mscBody();

            state._fsp--;

            stream_mscBody.add(mscBody133.getTree());
            // msc_grammar.g:201:35: ( 'alt' end mscBody )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==83) ) {
                    int LA37_1 = input.LA(2);

                    if ( (LA37_1==78) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // msc_grammar.g:201:37: 'alt' end mscBody
            	    {
            	    string_literal134=(Token)match(input,83,FOLLOW_83_in_altExpr1251);  
            	    stream_83.add(string_literal134);

            	    pushFollow(FOLLOW_end_in_altExpr1253);
            	    end135=end();

            	    state._fsp--;

            	    stream_end.add(end135.getTree());
            	    pushFollow(FOLLOW_mscBody_in_altExpr1255);
            	    mscBody136=mscBody();

            	    state._fsp--;

            	    stream_mscBody.add(mscBody136.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            string_literal137=(Token)match(input,83,FOLLOW_83_in_altExpr1260);  
            stream_83.add(string_literal137);

            END138=(Token)match(input,END,FOLLOW_END_in_altExpr1262);  
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
            // 201:68: -> ^( Alt ( mscBody )+ )
            {
                // msc_grammar.g:201:71: ^( Alt ( mscBody )+ )
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
    // msc_grammar.g:203:1: parExpr : 'par' BEGIN end mscBody ( 'par' end mscBody )* 'par' END -> ^( Par ( mscBody )+ ) ;
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
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleSubtreeStream stream_mscBody=new RewriteRuleSubtreeStream(adaptor,"rule mscBody");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:203:9: ( 'par' BEGIN end mscBody ( 'par' end mscBody )* 'par' END -> ^( Par ( mscBody )+ ) )
            // msc_grammar.g:203:11: 'par' BEGIN end mscBody ( 'par' end mscBody )* 'par' END
            {
            string_literal139=(Token)match(input,84,FOLLOW_84_in_parExpr1282);  
            stream_84.add(string_literal139);

            BEGIN140=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_parExpr1284);  
            stream_BEGIN.add(BEGIN140);

            pushFollow(FOLLOW_end_in_parExpr1286);
            end141=end();

            state._fsp--;

            stream_end.add(end141.getTree());
            pushFollow(FOLLOW_mscBody_in_parExpr1288);
            mscBody142=mscBody();

            state._fsp--;

            stream_mscBody.add(mscBody142.getTree());
            // msc_grammar.g:203:35: ( 'par' end mscBody )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==84) ) {
                    int LA38_1 = input.LA(2);

                    if ( (LA38_1==78) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // msc_grammar.g:203:37: 'par' end mscBody
            	    {
            	    string_literal143=(Token)match(input,84,FOLLOW_84_in_parExpr1292);  
            	    stream_84.add(string_literal143);

            	    pushFollow(FOLLOW_end_in_parExpr1294);
            	    end144=end();

            	    state._fsp--;

            	    stream_end.add(end144.getTree());
            	    pushFollow(FOLLOW_mscBody_in_parExpr1296);
            	    mscBody145=mscBody();

            	    state._fsp--;

            	    stream_mscBody.add(mscBody145.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            string_literal146=(Token)match(input,84,FOLLOW_84_in_parExpr1301);  
            stream_84.add(string_literal146);

            END147=(Token)match(input,END,FOLLOW_END_in_parExpr1303);  
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
            // 203:68: -> ^( Par ( mscBody )+ )
            {
                // msc_grammar.g:203:71: ^( Par ( mscBody )+ )
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
    // msc_grammar.g:205:1: loopBoundary : '<' infNatural ( ',' infNatural )? '>' -> ^( Bounds ( infNatural )+ ) ;
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
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_infNatural=new RewriteRuleSubtreeStream(adaptor,"rule infNatural");
        try {
            // msc_grammar.g:206:2: ( '<' infNatural ( ',' infNatural )? '>' -> ^( Bounds ( infNatural )+ ) )
            // msc_grammar.g:206:4: '<' infNatural ( ',' infNatural )? '>'
            {
            char_literal148=(Token)match(input,85,FOLLOW_85_in_loopBoundary1324);  
            stream_85.add(char_literal148);

            pushFollow(FOLLOW_infNatural_in_loopBoundary1326);
            infNatural149=infNatural();

            state._fsp--;

            stream_infNatural.add(infNatural149.getTree());
            // msc_grammar.g:206:19: ( ',' infNatural )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==60) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // msc_grammar.g:206:21: ',' infNatural
                    {
                    char_literal150=(Token)match(input,60,FOLLOW_60_in_loopBoundary1330);  
                    stream_60.add(char_literal150);

                    pushFollow(FOLLOW_infNatural_in_loopBoundary1332);
                    infNatural151=infNatural();

                    state._fsp--;

                    stream_infNatural.add(infNatural151.getTree());

                    }
                    break;

            }

            char_literal152=(Token)match(input,86,FOLLOW_86_in_loopBoundary1337);  
            stream_86.add(char_literal152);



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
            // 206:43: -> ^( Bounds ( infNatural )+ )
            {
                // msc_grammar.g:206:46: ^( Bounds ( infNatural )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Bounds, "Bounds"), root_1);

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
    // msc_grammar.g:208:1: infNatural : ( name | characterString );
    public final msc_grammarParser.infNatural_return infNatural() throws RecognitionException {
        msc_grammarParser.infNatural_return retval = new msc_grammarParser.infNatural_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.name_return name153 = null;

        msc_grammarParser.characterString_return characterString154 = null;



        try {
            // msc_grammar.g:209:2: ( name | characterString )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==NAME) ) {
                alt40=1;
            }
            else if ( (LA40_0==CHARACTERSTRING) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // msc_grammar.g:209:4: name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_name_in_infNatural1359);
                    name153=name();

                    state._fsp--;

                    adaptor.addChild(root_0, name153.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:209:11: characterString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_characterString_in_infNatural1363);
                    characterString154=characterString();

                    state._fsp--;

                    adaptor.addChild(root_0, characterString154.getTree());

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
    // msc_grammar.g:213:1: create : 'create' instanceName ( '(' msgIdentification ')' )? -> ^( Create instanceName ^( ParameterList ( msgIdentification )? ) ) ;
    public final msc_grammarParser.create_return create() throws RecognitionException {
        msc_grammarParser.create_return retval = new msc_grammarParser.create_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal155=null;
        Token char_literal157=null;
        Token char_literal159=null;
        msc_grammarParser.instanceName_return instanceName156 = null;

        msc_grammarParser.msgIdentification_return msgIdentification158 = null;


        CommonTree string_literal155_tree=null;
        CommonTree char_literal157_tree=null;
        CommonTree char_literal159_tree=null;
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_instanceName=new RewriteRuleSubtreeStream(adaptor,"rule instanceName");
        RewriteRuleSubtreeStream stream_msgIdentification=new RewriteRuleSubtreeStream(adaptor,"rule msgIdentification");
        try {
            // msc_grammar.g:213:9: ( 'create' instanceName ( '(' msgIdentification ')' )? -> ^( Create instanceName ^( ParameterList ( msgIdentification )? ) ) )
            // msc_grammar.g:213:11: 'create' instanceName ( '(' msgIdentification ')' )?
            {
            string_literal155=(Token)match(input,87,FOLLOW_87_in_create1376);  
            stream_87.add(string_literal155);

            pushFollow(FOLLOW_instanceName_in_create1378);
            instanceName156=instanceName();

            state._fsp--;

            stream_instanceName.add(instanceName156.getTree());
            // msc_grammar.g:213:33: ( '(' msgIdentification ')' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==88) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // msc_grammar.g:213:35: '(' msgIdentification ')'
                    {
                    char_literal157=(Token)match(input,88,FOLLOW_88_in_create1382);  
                    stream_88.add(char_literal157);

                    pushFollow(FOLLOW_msgIdentification_in_create1383);
                    msgIdentification158=msgIdentification();

                    state._fsp--;

                    stream_msgIdentification.add(msgIdentification158.getTree());
                    char_literal159=(Token)match(input,89,FOLLOW_89_in_create1385);  
                    stream_89.add(char_literal159);


                    }
                    break;

            }



            // AST REWRITE
            // elements: instanceName, msgIdentification
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 213:63: -> ^( Create instanceName ^( ParameterList ( msgIdentification )? ) )
            {
                // msc_grammar.g:213:66: ^( Create instanceName ^( ParameterList ( msgIdentification )? ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Create, "Create"), root_1);

                adaptor.addChild(root_1, stream_instanceName.nextTree());
                // msc_grammar.g:213:89: ^( ParameterList ( msgIdentification )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ParameterList, "ParameterList"), root_2);

                // msc_grammar.g:213:105: ( msgIdentification )?
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
    // msc_grammar.g:215:1: stop : 'stop' -> Terminate ;
    public final msc_grammarParser.stop_return stop() throws RecognitionException {
        msc_grammarParser.stop_return retval = new msc_grammarParser.stop_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal160=null;

        CommonTree string_literal160_tree=null;
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");

        try {
            // msc_grammar.g:215:7: ( 'stop' -> Terminate )
            // msc_grammar.g:215:9: 'stop'
            {
            string_literal160=(Token)match(input,90,FOLLOW_90_in_stop1415);  
            stream_90.add(string_literal160);



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
            // 215:16: -> Terminate
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
    // msc_grammar.g:218:1: timerStatement : timerType name ( duration )? -> ^( Timer timerType name ( duration )? ) ;
    public final msc_grammarParser.timerStatement_return timerStatement() throws RecognitionException {
        msc_grammarParser.timerStatement_return retval = new msc_grammarParser.timerStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.timerType_return timerType161 = null;

        msc_grammarParser.name_return name162 = null;

        msc_grammarParser.duration_return duration163 = null;


        RewriteRuleSubtreeStream stream_duration=new RewriteRuleSubtreeStream(adaptor,"rule duration");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        RewriteRuleSubtreeStream stream_timerType=new RewriteRuleSubtreeStream(adaptor,"rule timerType");
        try {
            // msc_grammar.g:219:2: ( timerType name ( duration )? -> ^( Timer timerType name ( duration )? ) )
            // msc_grammar.g:219:4: timerType name ( duration )?
            {
            pushFollow(FOLLOW_timerType_in_timerStatement1431);
            timerType161=timerType();

            state._fsp--;

            stream_timerType.add(timerType161.getTree());
            pushFollow(FOLLOW_name_in_timerStatement1433);
            name162=name();

            state._fsp--;

            stream_name.add(name162.getTree());
            // msc_grammar.g:219:19: ( duration )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==94) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // msc_grammar.g:219:21: duration
                    {
                    pushFollow(FOLLOW_duration_in_timerStatement1437);
                    duration163=duration();

                    state._fsp--;

                    stream_duration.add(duration163.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: timerType, duration, name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 219:33: -> ^( Timer timerType name ( duration )? )
            {
                // msc_grammar.g:219:36: ^( Timer timerType name ( duration )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Timer, "Timer"), root_1);

                adaptor.addChild(root_1, stream_timerType.nextTree());
                adaptor.addChild(root_1, stream_name.nextTree());
                // msc_grammar.g:219:60: ( duration )?
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
    // $ANTLR end "timerStatement"

    public static class timerType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timerType"
    // msc_grammar.g:221:1: timerType : ( 'starttimer' | 'stoptimer' | 'timeout' );
    public final msc_grammarParser.timerType_return timerType() throws RecognitionException {
        msc_grammarParser.timerType_return retval = new msc_grammarParser.timerType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set164=null;

        CommonTree set164_tree=null;

        try {
            // msc_grammar.g:222:2: ( 'starttimer' | 'stoptimer' | 'timeout' )
            // msc_grammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set164=(Token)input.LT(1);
            if ( (input.LA(1)>=91 && input.LA(1)<=93) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set164));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "timerType"

    public static class duration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "duration"
    // msc_grammar.g:224:1: duration : '[' ( infNatural )? ( ',' infNatural )? ']' -> ^( Bounds ( infNatural )+ ) ;
    public final msc_grammarParser.duration_return duration() throws RecognitionException {
        msc_grammarParser.duration_return retval = new msc_grammarParser.duration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal165=null;
        Token char_literal167=null;
        Token char_literal169=null;
        msc_grammarParser.infNatural_return infNatural166 = null;

        msc_grammarParser.infNatural_return infNatural168 = null;


        CommonTree char_literal165_tree=null;
        CommonTree char_literal167_tree=null;
        CommonTree char_literal169_tree=null;
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_infNatural=new RewriteRuleSubtreeStream(adaptor,"rule infNatural");
        try {
            // msc_grammar.g:225:2: ( '[' ( infNatural )? ( ',' infNatural )? ']' -> ^( Bounds ( infNatural )+ ) )
            // msc_grammar.g:225:4: '[' ( infNatural )? ( ',' infNatural )? ']'
            {
            char_literal165=(Token)match(input,94,FOLLOW_94_in_duration1485);  
            stream_94.add(char_literal165);

            // msc_grammar.g:225:8: ( infNatural )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=NAME && LA43_0<=CHARACTERSTRING)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // msc_grammar.g:225:10: infNatural
                    {
                    pushFollow(FOLLOW_infNatural_in_duration1489);
                    infNatural166=infNatural();

                    state._fsp--;

                    stream_infNatural.add(infNatural166.getTree());

                    }
                    break;

            }

            // msc_grammar.g:225:24: ( ',' infNatural )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==60) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // msc_grammar.g:225:26: ',' infNatural
                    {
                    char_literal167=(Token)match(input,60,FOLLOW_60_in_duration1496);  
                    stream_60.add(char_literal167);

                    pushFollow(FOLLOW_infNatural_in_duration1498);
                    infNatural168=infNatural();

                    state._fsp--;

                    stream_infNatural.add(infNatural168.getTree());

                    }
                    break;

            }

            char_literal169=(Token)match(input,95,FOLLOW_95_in_duration1503);  
            stream_95.add(char_literal169);



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
            // 225:48: -> ^( Bounds ( infNatural )+ )
            {
                // msc_grammar.g:225:51: ^( Bounds ( infNatural )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Bounds, "Bounds"), root_1);

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
    // $ANTLR end "duration"

    public static class mscGateInterface_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mscGateInterface"
    // msc_grammar.g:229:1: mscGateInterface : ( mscGateDef )+ ;
    public final msc_grammarParser.mscGateInterface_return mscGateInterface() throws RecognitionException {
        msc_grammarParser.mscGateInterface_return retval = new msc_grammarParser.mscGateInterface_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.mscGateDef_return mscGateDef170 = null;



        try {
            // msc_grammar.g:230:2: ( ( mscGateDef )+ )
            // msc_grammar.g:230:4: ( mscGateDef )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // msc_grammar.g:230:4: ( mscGateDef )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==96) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // msc_grammar.g:230:4: mscGateDef
            	    {
            	    pushFollow(FOLLOW_mscGateDef_in_mscGateInterface1528);
            	    mscGateDef170=mscGateDef();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mscGateDef170.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
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
    // msc_grammar.g:232:1: mscGateDef : 'gate' ( msgGate | orderGate ) end ;
    public final msc_grammarParser.mscGateDef_return mscGateDef() throws RecognitionException {
        msc_grammarParser.mscGateDef_return retval = new msc_grammarParser.mscGateDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal171=null;
        msc_grammarParser.msgGate_return msgGate172 = null;

        msc_grammarParser.orderGate_return orderGate173 = null;

        msc_grammarParser.end_return end174 = null;


        CommonTree string_literal171_tree=null;

        try {
            // msc_grammar.g:233:2: ( 'gate' ( msgGate | orderGate ) end )
            // msc_grammar.g:233:4: 'gate' ( msgGate | orderGate ) end
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal171=(Token)match(input,96,FOLLOW_96_in_mscGateDef1540); 
            string_literal171_tree = (CommonTree)adaptor.create(string_literal171);
            adaptor.addChild(root_0, string_literal171_tree);

            // msc_grammar.g:233:11: ( msgGate | orderGate )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==NAME) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==78||(LA46_1>=97 && LA46_1<=98)) ) {
                    alt46=2;
                }
                else if ( (LA46_1==62||LA46_1==64) ) {
                    alt46=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA46_0==62||LA46_0==64) ) {
                alt46=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // msc_grammar.g:233:13: msgGate
                    {
                    pushFollow(FOLLOW_msgGate_in_mscGateDef1544);
                    msgGate172=msgGate();

                    state._fsp--;

                    adaptor.addChild(root_0, msgGate172.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:233:23: orderGate
                    {
                    pushFollow(FOLLOW_orderGate_in_mscGateDef1548);
                    orderGate173=orderGate();

                    state._fsp--;

                    adaptor.addChild(root_0, orderGate173.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_end_in_mscGateDef1552);
            end174=end();

            state._fsp--;

            adaptor.addChild(root_0, end174.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // msc_grammar.g:235:1: msgGate : ( defInGate | defOutGate );
    public final msc_grammarParser.msgGate_return msgGate() throws RecognitionException {
        msc_grammarParser.msgGate_return retval = new msc_grammarParser.msgGate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.defInGate_return defInGate175 = null;

        msc_grammarParser.defOutGate_return defOutGate176 = null;



        try {
            // msc_grammar.g:235:9: ( defInGate | defOutGate )
            int alt47=2;
            switch ( input.LA(1) ) {
            case NAME:
                {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==62) ) {
                    alt47=1;
                }
                else if ( (LA47_1==64) ) {
                    alt47=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
                }
                break;
            case 62:
                {
                alt47=1;
                }
                break;
            case 64:
                {
                alt47=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // msc_grammar.g:235:11: defInGate
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defInGate_in_msgGate1561);
                    defInGate175=defInGate();

                    state._fsp--;

                    adaptor.addChild(root_0, defInGate175.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:235:23: defOutGate
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defOutGate_in_msgGate1565);
                    defOutGate176=defOutGate();

                    state._fsp--;

                    adaptor.addChild(root_0, defOutGate176.getTree());

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
    // msc_grammar.g:237:1: orderGate : ( defOrderInGate | defOrderOutGate );
    public final msc_grammarParser.orderGate_return orderGate() throws RecognitionException {
        msc_grammarParser.orderGate_return retval = new msc_grammarParser.orderGate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.defOrderInGate_return defOrderInGate177 = null;

        msc_grammarParser.defOrderOutGate_return defOrderOutGate178 = null;



        try {
            // msc_grammar.g:238:2: ( defOrderInGate | defOrderOutGate )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==NAME) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==78||LA48_1==98) ) {
                    alt48=2;
                }
                else if ( (LA48_1==97) ) {
                    alt48=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // msc_grammar.g:238:4: defOrderInGate
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defOrderInGate_in_orderGate1576);
                    defOrderInGate177=defOrderInGate();

                    state._fsp--;

                    adaptor.addChild(root_0, defOrderInGate177.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:238:21: defOrderOutGate
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defOrderOutGate_in_orderGate1580);
                    defOrderOutGate178=defOrderOutGate();

                    state._fsp--;

                    adaptor.addChild(root_0, defOrderOutGate178.getTree());

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
    // msc_grammar.g:240:1: defInGate : ( gateName )? 'out' msgIdentification 'to' inputDest ;
    public final msc_grammarParser.defInGate_return defInGate() throws RecognitionException {
        msc_grammarParser.defInGate_return retval = new msc_grammarParser.defInGate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal180=null;
        Token string_literal182=null;
        msc_grammarParser.gateName_return gateName179 = null;

        msc_grammarParser.msgIdentification_return msgIdentification181 = null;

        msc_grammarParser.inputDest_return inputDest183 = null;


        CommonTree string_literal180_tree=null;
        CommonTree string_literal182_tree=null;

        try {
            // msc_grammar.g:241:2: ( ( gateName )? 'out' msgIdentification 'to' inputDest )
            // msc_grammar.g:241:4: ( gateName )? 'out' msgIdentification 'to' inputDest
            {
            root_0 = (CommonTree)adaptor.nil();

            // msc_grammar.g:241:4: ( gateName )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==NAME) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // msc_grammar.g:241:6: gateName
                    {
                    pushFollow(FOLLOW_gateName_in_defInGate1593);
                    gateName179=gateName();

                    state._fsp--;

                    adaptor.addChild(root_0, gateName179.getTree());

                    }
                    break;

            }

            string_literal180=(Token)match(input,62,FOLLOW_62_in_defInGate1598); 
            string_literal180_tree = (CommonTree)adaptor.create(string_literal180);
            adaptor.addChild(root_0, string_literal180_tree);

            pushFollow(FOLLOW_msgIdentification_in_defInGate1600);
            msgIdentification181=msgIdentification();

            state._fsp--;

            adaptor.addChild(root_0, msgIdentification181.getTree());
            string_literal182=(Token)match(input,63,FOLLOW_63_in_defInGate1602); 
            string_literal182_tree = (CommonTree)adaptor.create(string_literal182);
            adaptor.addChild(root_0, string_literal182_tree);

            pushFollow(FOLLOW_inputDest_in_defInGate1604);
            inputDest183=inputDest();

            state._fsp--;

            adaptor.addChild(root_0, inputDest183.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // msc_grammar.g:243:1: defOutGate : ( gateName )? 'in' msgIdentification 'from' outputDest ;
    public final msc_grammarParser.defOutGate_return defOutGate() throws RecognitionException {
        msc_grammarParser.defOutGate_return retval = new msc_grammarParser.defOutGate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal185=null;
        Token string_literal187=null;
        msc_grammarParser.gateName_return gateName184 = null;

        msc_grammarParser.msgIdentification_return msgIdentification186 = null;

        msc_grammarParser.outputDest_return outputDest188 = null;


        CommonTree string_literal185_tree=null;
        CommonTree string_literal187_tree=null;

        try {
            // msc_grammar.g:244:2: ( ( gateName )? 'in' msgIdentification 'from' outputDest )
            // msc_grammar.g:244:4: ( gateName )? 'in' msgIdentification 'from' outputDest
            {
            root_0 = (CommonTree)adaptor.nil();

            // msc_grammar.g:244:4: ( gateName )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==NAME) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // msc_grammar.g:244:6: gateName
                    {
                    pushFollow(FOLLOW_gateName_in_defOutGate1617);
                    gateName184=gateName();

                    state._fsp--;

                    adaptor.addChild(root_0, gateName184.getTree());

                    }
                    break;

            }

            string_literal185=(Token)match(input,64,FOLLOW_64_in_defOutGate1622); 
            string_literal185_tree = (CommonTree)adaptor.create(string_literal185);
            adaptor.addChild(root_0, string_literal185_tree);

            pushFollow(FOLLOW_msgIdentification_in_defOutGate1624);
            msgIdentification186=msgIdentification();

            state._fsp--;

            adaptor.addChild(root_0, msgIdentification186.getTree());
            string_literal187=(Token)match(input,65,FOLLOW_65_in_defOutGate1626); 
            string_literal187_tree = (CommonTree)adaptor.create(string_literal187);
            adaptor.addChild(root_0, string_literal187_tree);

            pushFollow(FOLLOW_outputDest_in_defOutGate1628);
            outputDest188=outputDest();

            state._fsp--;

            adaptor.addChild(root_0, outputDest188.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // msc_grammar.g:246:1: defOrderInGate : gateName 'before' orderDest ;
    public final msc_grammarParser.defOrderInGate_return defOrderInGate() throws RecognitionException {
        msc_grammarParser.defOrderInGate_return retval = new msc_grammarParser.defOrderInGate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal190=null;
        msc_grammarParser.gateName_return gateName189 = null;

        msc_grammarParser.orderDest_return orderDest191 = null;


        CommonTree string_literal190_tree=null;

        try {
            // msc_grammar.g:247:2: ( gateName 'before' orderDest )
            // msc_grammar.g:247:4: gateName 'before' orderDest
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_gateName_in_defOrderInGate1639);
            gateName189=gateName();

            state._fsp--;

            adaptor.addChild(root_0, gateName189.getTree());
            string_literal190=(Token)match(input,97,FOLLOW_97_in_defOrderInGate1641); 
            string_literal190_tree = (CommonTree)adaptor.create(string_literal190);
            adaptor.addChild(root_0, string_literal190_tree);

            pushFollow(FOLLOW_orderDest_in_defOrderInGate1643);
            orderDest191=orderDest();

            state._fsp--;

            adaptor.addChild(root_0, orderDest191.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // msc_grammar.g:249:1: defOrderOutGate : gateName ( 'after' orderDestList )? ;
    public final msc_grammarParser.defOrderOutGate_return defOrderOutGate() throws RecognitionException {
        msc_grammarParser.defOrderOutGate_return retval = new msc_grammarParser.defOrderOutGate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal193=null;
        msc_grammarParser.gateName_return gateName192 = null;

        msc_grammarParser.orderDestList_return orderDestList194 = null;


        CommonTree string_literal193_tree=null;

        try {
            // msc_grammar.g:250:2: ( gateName ( 'after' orderDestList )? )
            // msc_grammar.g:250:4: gateName ( 'after' orderDestList )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_gateName_in_defOrderOutGate1653);
            gateName192=gateName();

            state._fsp--;

            adaptor.addChild(root_0, gateName192.getTree());
            // msc_grammar.g:250:13: ( 'after' orderDestList )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==98) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // msc_grammar.g:250:15: 'after' orderDestList
                    {
                    string_literal193=(Token)match(input,98,FOLLOW_98_in_defOrderOutGate1657); 
                    string_literal193_tree = (CommonTree)adaptor.create(string_literal193);
                    adaptor.addChild(root_0, string_literal193_tree);

                    pushFollow(FOLLOW_orderDestList_in_defOrderOutGate1659);
                    orderDestList194=orderDestList();

                    state._fsp--;

                    adaptor.addChild(root_0, orderDestList194.getTree());

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
    // msc_grammar.g:252:1: inputDest : ( 'lost' ( inputAddress )? | inputAddress );
    public final msc_grammarParser.inputDest_return inputDest() throws RecognitionException {
        msc_grammarParser.inputDest_return retval = new msc_grammarParser.inputDest_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal195=null;
        msc_grammarParser.inputAddress_return inputAddress196 = null;

        msc_grammarParser.inputAddress_return inputAddress197 = null;


        CommonTree string_literal195_tree=null;

        try {
            // msc_grammar.g:253:2: ( 'lost' ( inputAddress )? | inputAddress )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==66) ) {
                alt53=1;
            }
            else if ( (LA53_0==NAME||LA53_0==68) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // msc_grammar.g:253:4: 'lost' ( inputAddress )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal195=(Token)match(input,66,FOLLOW_66_in_inputDest1674); 
                    string_literal195_tree = (CommonTree)adaptor.create(string_literal195);
                    adaptor.addChild(root_0, string_literal195_tree);

                    // msc_grammar.g:253:11: ( inputAddress )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==NAME||LA52_0==68) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // msc_grammar.g:253:13: inputAddress
                            {
                            pushFollow(FOLLOW_inputAddress_in_inputDest1678);
                            inputAddress196=inputAddress();

                            state._fsp--;

                            adaptor.addChild(root_0, inputAddress196.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // msc_grammar.g:253:31: inputAddress
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_inputAddress_in_inputDest1685);
                    inputAddress197=inputAddress();

                    state._fsp--;

                    adaptor.addChild(root_0, inputAddress197.getTree());

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
    // msc_grammar.g:255:1: outputDest : ( 'found' ( outputAddress )? | outputAddress );
    public final msc_grammarParser.outputDest_return outputDest() throws RecognitionException {
        msc_grammarParser.outputDest_return retval = new msc_grammarParser.outputDest_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal198=null;
        msc_grammarParser.outputAddress_return outputAddress199 = null;

        msc_grammarParser.outputAddress_return outputAddress200 = null;


        CommonTree string_literal198_tree=null;

        try {
            // msc_grammar.g:256:2: ( 'found' ( outputAddress )? | outputAddress )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==67) ) {
                alt55=1;
            }
            else if ( (LA55_0==NAME||LA55_0==68) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // msc_grammar.g:256:4: 'found' ( outputAddress )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal198=(Token)match(input,67,FOLLOW_67_in_outputDest1696); 
                    string_literal198_tree = (CommonTree)adaptor.create(string_literal198);
                    adaptor.addChild(root_0, string_literal198_tree);

                    // msc_grammar.g:256:12: ( outputAddress )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==NAME||LA54_0==68) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // msc_grammar.g:256:14: outputAddress
                            {
                            pushFollow(FOLLOW_outputAddress_in_outputDest1700);
                            outputAddress199=outputAddress();

                            state._fsp--;

                            adaptor.addChild(root_0, outputAddress199.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // msc_grammar.g:256:33: outputAddress
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_outputAddress_in_outputDest1707);
                    outputAddress200=outputAddress();

                    state._fsp--;

                    adaptor.addChild(root_0, outputAddress200.getTree());

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
    // msc_grammar.g:258:1: orderDest : ( eventName | 'env' 'via' gateName -> ^( MsgGate gateName ) );
    public final msc_grammarParser.orderDest_return orderDest() throws RecognitionException {
        msc_grammarParser.orderDest_return retval = new msc_grammarParser.orderDest_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal202=null;
        Token string_literal203=null;
        msc_grammarParser.eventName_return eventName201 = null;

        msc_grammarParser.gateName_return gateName204 = null;


        CommonTree string_literal202_tree=null;
        CommonTree string_literal203_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleSubtreeStream stream_gateName=new RewriteRuleSubtreeStream(adaptor,"rule gateName");
        try {
            // msc_grammar.g:259:2: ( eventName | 'env' 'via' gateName -> ^( MsgGate gateName ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==NAME) ) {
                alt56=1;
            }
            else if ( (LA56_0==68) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // msc_grammar.g:259:4: eventName
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_eventName_in_orderDest1718);
                    eventName201=eventName();

                    state._fsp--;

                    adaptor.addChild(root_0, eventName201.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:260:4: 'env' 'via' gateName
                    {
                    string_literal202=(Token)match(input,68,FOLLOW_68_in_orderDest1723);  
                    stream_68.add(string_literal202);

                    string_literal203=(Token)match(input,69,FOLLOW_69_in_orderDest1725);  
                    stream_69.add(string_literal203);

                    pushFollow(FOLLOW_gateName_in_orderDest1727);
                    gateName204=gateName();

                    state._fsp--;

                    stream_gateName.add(gateName204.getTree());


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
                    // 260:25: -> ^( MsgGate gateName )
                    {
                        // msc_grammar.g:260:28: ^( MsgGate gateName )
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
    // msc_grammar.g:262:1: orderDestList : orderDest ( ',' orderDestList )? -> orderDest ( orderDestList )? ;
    public final msc_grammarParser.orderDestList_return orderDestList() throws RecognitionException {
        msc_grammarParser.orderDestList_return retval = new msc_grammarParser.orderDestList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal206=null;
        msc_grammarParser.orderDest_return orderDest205 = null;

        msc_grammarParser.orderDestList_return orderDestList207 = null;


        CommonTree char_literal206_tree=null;
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_orderDestList=new RewriteRuleSubtreeStream(adaptor,"rule orderDestList");
        RewriteRuleSubtreeStream stream_orderDest=new RewriteRuleSubtreeStream(adaptor,"rule orderDest");
        try {
            // msc_grammar.g:263:2: ( orderDest ( ',' orderDestList )? -> orderDest ( orderDestList )? )
            // msc_grammar.g:263:4: orderDest ( ',' orderDestList )?
            {
            pushFollow(FOLLOW_orderDest_in_orderDestList1748);
            orderDest205=orderDest();

            state._fsp--;

            stream_orderDest.add(orderDest205.getTree());
            // msc_grammar.g:263:14: ( ',' orderDestList )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==60) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // msc_grammar.g:263:16: ',' orderDestList
                    {
                    char_literal206=(Token)match(input,60,FOLLOW_60_in_orderDestList1752);  
                    stream_60.add(char_literal206);

                    pushFollow(FOLLOW_orderDestList_in_orderDestList1754);
                    orderDestList207=orderDestList();

                    state._fsp--;

                    stream_orderDestList.add(orderDestList207.getTree());

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
            // 263:37: -> orderDest ( orderDestList )?
            {
                adaptor.addChild(root_0, stream_orderDest.nextTree());
                // msc_grammar.g:263:50: ( orderDestList )?
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
    // msc_grammar.g:267:1: coregion : 'concurrent' end ( coevent )* 'endconcurrent' -> ^( Coregion ( coevent )* ) ;
    public final msc_grammarParser.coregion_return coregion() throws RecognitionException {
        msc_grammarParser.coregion_return retval = new msc_grammarParser.coregion_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal208=null;
        Token string_literal211=null;
        msc_grammarParser.end_return end209 = null;

        msc_grammarParser.coevent_return coevent210 = null;


        CommonTree string_literal208_tree=null;
        CommonTree string_literal211_tree=null;
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_coevent=new RewriteRuleSubtreeStream(adaptor,"rule coevent");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:268:2: ( 'concurrent' end ( coevent )* 'endconcurrent' -> ^( Coregion ( coevent )* ) )
            // msc_grammar.g:268:4: 'concurrent' end ( coevent )* 'endconcurrent'
            {
            string_literal208=(Token)match(input,99,FOLLOW_99_in_coregion1777);  
            stream_99.add(string_literal208);

            pushFollow(FOLLOW_end_in_coregion1779);
            end209=end();

            state._fsp--;

            stream_end.add(end209.getTree());
            // msc_grammar.g:268:21: ( coevent )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==NAME||(LA58_0>=61 && LA58_0<=62)||LA58_0==64||LA58_0==70||LA58_0==87||(LA58_0>=91 && LA58_0<=93)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // msc_grammar.g:268:21: coevent
            	    {
            	    pushFollow(FOLLOW_coevent_in_coregion1781);
            	    coevent210=coevent();

            	    state._fsp--;

            	    stream_coevent.add(coevent210.getTree());

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            string_literal211=(Token)match(input,100,FOLLOW_100_in_coregion1784);  
            stream_100.add(string_literal211);



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
            // 268:46: -> ^( Coregion ( coevent )* )
            {
                // msc_grammar.g:268:49: ^( Coregion ( coevent )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Coregion, "Coregion"), root_1);

                // msc_grammar.g:268:61: ( coevent )*
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
    // msc_grammar.g:270:1: coevent : orderableEvent end -> orderableEvent ;
    public final msc_grammarParser.coevent_return coevent() throws RecognitionException {
        msc_grammarParser.coevent_return retval = new msc_grammarParser.coevent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.orderableEvent_return orderableEvent212 = null;

        msc_grammarParser.end_return end213 = null;


        RewriteRuleSubtreeStream stream_orderableEvent=new RewriteRuleSubtreeStream(adaptor,"rule orderableEvent");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            // msc_grammar.g:270:9: ( orderableEvent end -> orderableEvent )
            // msc_grammar.g:270:11: orderableEvent end
            {
            pushFollow(FOLLOW_orderableEvent_in_coevent1804);
            orderableEvent212=orderableEvent();

            state._fsp--;

            stream_orderableEvent.add(orderableEvent212.getTree());
            pushFollow(FOLLOW_end_in_coevent1806);
            end213=end();

            state._fsp--;

            stream_end.add(end213.getTree());


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
            // 270:30: -> orderableEvent
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
    // msc_grammar.g:274:1: generalOrdering : ( before ( after )? | after );
    public final msc_grammarParser.generalOrdering_return generalOrdering() throws RecognitionException {
        msc_grammarParser.generalOrdering_return retval = new msc_grammarParser.generalOrdering_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.before_return before214 = null;

        msc_grammarParser.after_return after215 = null;

        msc_grammarParser.after_return after216 = null;



        try {
            // msc_grammar.g:275:2: ( before ( after )? | after )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==97) ) {
                alt60=1;
            }
            else if ( (LA60_0==98) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // msc_grammar.g:275:4: before ( after )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_before_in_generalOrdering1822);
                    before214=before();

                    state._fsp--;

                    adaptor.addChild(root_0, before214.getTree());
                    // msc_grammar.g:275:11: ( after )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==98) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // msc_grammar.g:275:11: after
                            {
                            pushFollow(FOLLOW_after_in_generalOrdering1824);
                            after215=after();

                            state._fsp--;

                            adaptor.addChild(root_0, after215.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // msc_grammar.g:276:4: after
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_after_in_generalOrdering1830);
                    after216=after();

                    state._fsp--;

                    adaptor.addChild(root_0, after216.getTree());

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
    // msc_grammar.g:278:1: before : 'before' orderDestList -> ^( Before orderDestList ) ;
    public final msc_grammarParser.before_return before() throws RecognitionException {
        msc_grammarParser.before_return retval = new msc_grammarParser.before_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal217=null;
        msc_grammarParser.orderDestList_return orderDestList218 = null;


        CommonTree string_literal217_tree=null;
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleSubtreeStream stream_orderDestList=new RewriteRuleSubtreeStream(adaptor,"rule orderDestList");
        try {
            // msc_grammar.g:278:9: ( 'before' orderDestList -> ^( Before orderDestList ) )
            // msc_grammar.g:278:11: 'before' orderDestList
            {
            string_literal217=(Token)match(input,97,FOLLOW_97_in_before1840);  
            stream_97.add(string_literal217);

            pushFollow(FOLLOW_orderDestList_in_before1842);
            orderDestList218=orderDestList();

            state._fsp--;

            stream_orderDestList.add(orderDestList218.getTree());


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
            // 278:34: -> ^( Before orderDestList )
            {
                // msc_grammar.g:278:37: ^( Before orderDestList )
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
    // msc_grammar.g:280:1: after : 'after' orderDestList -> ^( After orderDestList ) ;
    public final msc_grammarParser.after_return after() throws RecognitionException {
        msc_grammarParser.after_return retval = new msc_grammarParser.after_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal219=null;
        msc_grammarParser.orderDestList_return orderDestList220 = null;


        CommonTree string_literal219_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleSubtreeStream stream_orderDestList=new RewriteRuleSubtreeStream(adaptor,"rule orderDestList");
        try {
            // msc_grammar.g:280:8: ( 'after' orderDestList -> ^( After orderDestList ) )
            // msc_grammar.g:280:10: 'after' orderDestList
            {
            string_literal219=(Token)match(input,98,FOLLOW_98_in_after1862);  
            stream_98.add(string_literal219);

            pushFollow(FOLLOW_orderDestList_in_after1864);
            orderDestList220=orderDestList();

            state._fsp--;

            stream_orderDestList.add(orderDestList220.getTree());


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
            // 280:32: -> ^( After orderDestList )
            {
                // msc_grammar.g:280:35: ^( After orderDestList )
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
    // msc_grammar.g:284:1: mscReference : 'reference' mscRefExpr -> ^( Ref mscRefExpr ) ;
    public final msc_grammarParser.mscReference_return mscReference() throws RecognitionException {
        msc_grammarParser.mscReference_return retval = new msc_grammarParser.mscReference_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal221=null;
        msc_grammarParser.mscRefExpr_return mscRefExpr222 = null;


        CommonTree string_literal221_tree=null;
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_mscRefExpr=new RewriteRuleSubtreeStream(adaptor,"rule mscRefExpr");
        try {
            // msc_grammar.g:285:2: ( 'reference' mscRefExpr -> ^( Ref mscRefExpr ) )
            // msc_grammar.g:285:4: 'reference' mscRefExpr
            {
            string_literal221=(Token)match(input,101,FOLLOW_101_in_mscReference1888);  
            stream_101.add(string_literal221);

            pushFollow(FOLLOW_mscRefExpr_in_mscReference1890);
            mscRefExpr222=mscRefExpr();

            state._fsp--;

            stream_mscRefExpr.add(mscRefExpr222.getTree());


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
            // 285:27: -> ^( Ref mscRefExpr )
            {
                // msc_grammar.g:285:30: ^( Ref mscRefExpr )
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
    // msc_grammar.g:287:1: mscRefExpr : ( name | characterString );
    public final msc_grammarParser.mscRefExpr_return mscRefExpr() throws RecognitionException {
        msc_grammarParser.mscRefExpr_return retval = new msc_grammarParser.mscRefExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        msc_grammarParser.name_return name223 = null;

        msc_grammarParser.characterString_return characterString224 = null;



        try {
            // msc_grammar.g:288:2: ( name | characterString )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==NAME) ) {
                alt61=1;
            }
            else if ( (LA61_0==CHARACTERSTRING) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // msc_grammar.g:288:4: name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_name_in_mscRefExpr1911);
                    name223=name();

                    state._fsp--;

                    adaptor.addChild(root_0, name223.getTree());

                    }
                    break;
                case 2 :
                    // msc_grammar.g:288:11: characterString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_characterString_in_mscRefExpr1915);
                    characterString224=characterString();

                    state._fsp--;

                    adaptor.addChild(root_0, characterString224.getTree());

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
    // msc_grammar.g:291:1: mscName : NAME ;
    public final msc_grammarParser.mscName_return mscName() throws RecognitionException {
        msc_grammarParser.mscName_return retval = new msc_grammarParser.mscName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME225=null;

        CommonTree NAME225_tree=null;

        try {
            // msc_grammar.g:291:9: ( NAME )
            // msc_grammar.g:291:11: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME225=(Token)match(input,NAME,FOLLOW_NAME_in_mscName1926); 
            NAME225_tree = (CommonTree)adaptor.create(NAME225);
            adaptor.addChild(root_0, NAME225_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // msc_grammar.g:292:1: labelName : NAME ;
    public final msc_grammarParser.labelName_return labelName() throws RecognitionException {
        msc_grammarParser.labelName_return retval = new msc_grammarParser.labelName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME226=null;

        CommonTree NAME226_tree=null;

        try {
            // msc_grammar.g:293:2: ( NAME )
            // msc_grammar.g:293:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME226=(Token)match(input,NAME,FOLLOW_NAME_in_labelName1935); 
            NAME226_tree = (CommonTree)adaptor.create(NAME226);
            adaptor.addChild(root_0, NAME226_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // msc_grammar.g:294:1: name : NAME ;
    public final msc_grammarParser.name_return name() throws RecognitionException {
        msc_grammarParser.name_return retval = new msc_grammarParser.name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME227=null;

        CommonTree NAME227_tree=null;

        try {
            // msc_grammar.g:294:7: ( NAME )
            // msc_grammar.g:294:9: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME227=(Token)match(input,NAME,FOLLOW_NAME_in_name1943); 
            NAME227_tree = (CommonTree)adaptor.create(NAME227);
            adaptor.addChild(root_0, NAME227_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // msc_grammar.g:295:1: instanceName : NAME ;
    public final msc_grammarParser.instanceName_return instanceName() throws RecognitionException {
        msc_grammarParser.instanceName_return retval = new msc_grammarParser.instanceName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME228=null;

        CommonTree NAME228_tree=null;

        try {
            // msc_grammar.g:296:2: ( NAME )
            // msc_grammar.g:296:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME228=(Token)match(input,NAME,FOLLOW_NAME_in_instanceName1952); 
            NAME228_tree = (CommonTree)adaptor.create(NAME228);
            adaptor.addChild(root_0, NAME228_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // msc_grammar.g:297:1: messageName : NAME ;
    public final msc_grammarParser.messageName_return messageName() throws RecognitionException {
        msc_grammarParser.messageName_return retval = new msc_grammarParser.messageName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME229=null;

        CommonTree NAME229_tree=null;

        try {
            // msc_grammar.g:298:2: ( NAME )
            // msc_grammar.g:298:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME229=(Token)match(input,NAME,FOLLOW_NAME_in_messageName1961); 
            NAME229_tree = (CommonTree)adaptor.create(NAME229);
            adaptor.addChild(root_0, NAME229_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // msc_grammar.g:299:1: gateName : NAME ;
    public final msc_grammarParser.gateName_return gateName() throws RecognitionException {
        msc_grammarParser.gateName_return retval = new msc_grammarParser.gateName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME230=null;

        CommonTree NAME230_tree=null;

        try {
            // msc_grammar.g:300:2: ( NAME )
            // msc_grammar.g:300:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME230=(Token)match(input,NAME,FOLLOW_NAME_in_gateName1970); 
            NAME230_tree = (CommonTree)adaptor.create(NAME230);
            adaptor.addChild(root_0, NAME230_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // msc_grammar.g:301:1: eventName : NAME ;
    public final msc_grammarParser.eventName_return eventName() throws RecognitionException {
        msc_grammarParser.eventName_return retval = new msc_grammarParser.eventName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME231=null;

        CommonTree NAME231_tree=null;

        try {
            // msc_grammar.g:302:2: ( NAME )
            // msc_grammar.g:302:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME231=(Token)match(input,NAME,FOLLOW_NAME_in_eventName1979); 
            NAME231_tree = (CommonTree)adaptor.create(NAME231);
            adaptor.addChild(root_0, NAME231_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // msc_grammar.g:303:1: characterString : CHARACTERSTRING ;
    public final msc_grammarParser.characterString_return characterString() throws RecognitionException {
        msc_grammarParser.characterString_return retval = new msc_grammarParser.characterString_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CHARACTERSTRING232=null;

        CommonTree CHARACTERSTRING232_tree=null;

        try {
            // msc_grammar.g:304:2: ( CHARACTERSTRING )
            // msc_grammar.g:304:4: CHARACTERSTRING
            {
            root_0 = (CommonTree)adaptor.nil();

            CHARACTERSTRING232=(Token)match(input,CHARACTERSTRING,FOLLOW_CHARACTERSTRING_in_characterString1988); 
            CHARACTERSTRING232_tree = (CommonTree)adaptor.create(CHARACTERSTRING232);
            adaptor.addChild(root_0, CHARACTERSTRING232_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // msc_grammar.g:306:1: identifier : NAME ;
    public final msc_grammarParser.identifier_return identifier() throws RecognitionException {
        msc_grammarParser.identifier_return retval = new msc_grammarParser.identifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME233=null;

        CommonTree NAME233_tree=null;

        try {
            // msc_grammar.g:307:2: ( NAME )
            // msc_grammar.g:307:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME233=(Token)match(input,NAME,FOLLOW_NAME_in_identifier1998); 
            NAME233_tree = (CommonTree)adaptor.create(NAME233);
            adaptor.addChild(root_0, NAME233_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // msc_grammar.g:311:1: expressionString : NAME ;
    public final msc_grammarParser.expressionString_return expressionString() throws RecognitionException {
        msc_grammarParser.expressionString_return retval = new msc_grammarParser.expressionString_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME234=null;

        CommonTree NAME234_tree=null;

        try {
            // msc_grammar.g:312:2: ( NAME )
            // msc_grammar.g:312:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME234=(Token)match(input,NAME,FOLLOW_NAME_in_expressionString2012); 
            NAME234_tree = (CommonTree)adaptor.create(NAME234);
            adaptor.addChild(root_0, NAME234_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // msc_grammar.g:317:1: dataTypeName : NAME ;
    public final msc_grammarParser.dataTypeName_return dataTypeName() throws RecognitionException {
        msc_grammarParser.dataTypeName_return retval = new msc_grammarParser.dataTypeName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME235=null;

        CommonTree NAME235_tree=null;

        try {
            // msc_grammar.g:318:2: ( NAME )
            // msc_grammar.g:318:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME235=(Token)match(input,NAME,FOLLOW_NAME_in_dataTypeName2025); 
            NAME235_tree = (CommonTree)adaptor.create(NAME235);
            adaptor.addChild(root_0, NAME235_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // msc_grammar.g:319:1: datatypeTypeExpression : NAME ;
    public final msc_grammarParser.datatypeTypeExpression_return datatypeTypeExpression() throws RecognitionException {
        msc_grammarParser.datatypeTypeExpression_return retval = new msc_grammarParser.datatypeTypeExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME236=null;

        CommonTree NAME236_tree=null;

        try {
            // msc_grammar.g:320:2: ( NAME )
            // msc_grammar.g:320:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME236=(Token)match(input,NAME,FOLLOW_NAME_in_datatypeTypeExpression2033); 
            NAME236_tree = (CommonTree)adaptor.create(NAME236);
            adaptor.addChild(root_0, NAME236_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // msc_grammar.g:321:1: literalNameOrNumber : NAME ;
    public final msc_grammarParser.literalNameOrNumber_return literalNameOrNumber() throws RecognitionException {
        msc_grammarParser.literalNameOrNumber_return retval = new msc_grammarParser.literalNameOrNumber_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME237=null;

        CommonTree NAME237_tree=null;

        try {
            // msc_grammar.g:322:2: ( NAME )
            // msc_grammar.g:322:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME237=(Token)match(input,NAME,FOLLOW_NAME_in_literalNameOrNumber2041); 
            NAME237_tree = (CommonTree)adaptor.create(NAME237);
            adaptor.addChild(root_0, NAME237_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // msc_grammar.g:323:1: naturalSimpleExpression : NAME ;
    public final msc_grammarParser.naturalSimpleExpression_return naturalSimpleExpression() throws RecognitionException {
        msc_grammarParser.naturalSimpleExpression_return retval = new msc_grammarParser.naturalSimpleExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME238=null;

        CommonTree NAME238_tree=null;

        try {
            // msc_grammar.g:324:2: ( NAME )
            // msc_grammar.g:324:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME238=(Token)match(input,NAME,FOLLOW_NAME_in_naturalSimpleExpression2049); 
            NAME238_tree = (CommonTree)adaptor.create(NAME238);
            adaptor.addChild(root_0, NAME238_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // msc_grammar.g:325:1: fieldName : NAME ;
    public final msc_grammarParser.fieldName_return fieldName() throws RecognitionException {
        msc_grammarParser.fieldName_return retval = new msc_grammarParser.fieldName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME239=null;

        CommonTree NAME239_tree=null;

        try {
            // msc_grammar.g:326:2: ( NAME )
            // msc_grammar.g:326:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME239=(Token)match(input,NAME,FOLLOW_NAME_in_fieldName2057); 
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
    // $ANTLR end "fieldName"

    public static class constantExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constantExpression"
    // msc_grammar.g:328:1: constantExpression : NAME ;
    public final msc_grammarParser.constantExpression_return constantExpression() throws RecognitionException {
        msc_grammarParser.constantExpression_return retval = new msc_grammarParser.constantExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME240=null;

        CommonTree NAME240_tree=null;

        try {
            // msc_grammar.g:329:2: ( NAME )
            // msc_grammar.g:329:4: NAME
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME240=(Token)match(input,NAME,FOLLOW_NAME_in_constantExpression2067); 
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
    // $ANTLR end "constantExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_messageSequenceChart_in_msc174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_messageSequenceChart186 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_mscHead_in_messageSequenceChart188 = new BitSet(new long[]{0x0000108000000000L});
    public static final BitSet FOLLOW_body_in_messageSequenceChart190 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_messageSequenceChart192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_end_in_messageSequenceChart194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscName_in_mscHead217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_end_in_mscHead219 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000200L});
    public static final BitSet FOLLOW_mscInterface_in_mscHead223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscBody_in_body253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscStatement_in_mscBody266 = new BitSet(new long[]{0x0000108000000002L});
    public static final BitSet FOLLOW_eventDefinition_in_mscStatement291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceName_in_eventDefinition303 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_eventDefinition305 = new BitSet(new long[]{0x6000100000000000L,0x000000083C8001C1L});
    public static final BitSet FOLLOW_instanceEventList_in_eventDefinition307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceNameList_in_eventDefinition325 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_eventDefinition327 = new BitSet(new long[]{0x0000000000000000L,0x00000020001F8000L});
    public static final BitSet FOLLOW_multiInstanceEventList_in_eventDefinition329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceEvent_in_instanceEventList356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_end_in_instanceEventList358 = new BitSet(new long[]{0x6000100000000002L,0x000000083C8001C1L});
    public static final BitSet FOLLOW_orderableEvent_in_instanceEvent379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonOrderableEvent_in_instanceEvent383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_label_in_orderableEvent395 = new BitSet(new long[]{0x6000100000000000L,0x0000000038800041L});
    public static final BitSet FOLLOW_messageEvent_in_orderableEvent400 = new BitSet(new long[]{0x0000000000000002L,0x0000000600000000L});
    public static final BitSet FOLLOW_action_in_orderableEvent404 = new BitSet(new long[]{0x0000000000000002L,0x0000000600000000L});
    public static final BitSet FOLLOW_create_in_orderableEvent408 = new BitSet(new long[]{0x0000000000000002L,0x0000000600000000L});
    public static final BitSet FOLLOW_timerStatement_in_orderableEvent412 = new BitSet(new long[]{0x0000000000000002L,0x0000000600000000L});
    public static final BitSet FOLLOW_generalOrdering_in_orderableEvent416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceHeadStatement_in_nonOrderableEvent429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceEndStatement_in_nonOrderableEvent433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stop_in_nonOrderableEvent437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coregion_in_nonOrderableEvent441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceName_in_instanceNameList454 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_instanceNameList458 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_instanceName_in_instanceNameList460 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ALL_in_instanceNameList480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiInstanceEvent_in_multiInstanceEventList505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_end_in_multiInstanceEventList507 = new BitSet(new long[]{0x0000000000000002L,0x00000020001F8000L});
    public static final BitSet FOLLOW_condition_in_multiInstanceEvent528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscReference_in_multiInstanceEvent532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inlineExpr_in_multiInstanceEvent536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eventName_in_label550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_label554 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_eventName_in_label556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_end_in_label558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_messageEvent583 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_msgIdentification_in_messageEvent585 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_messageEvent587 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_messageReceiver_in_messageEvent589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_messageEvent606 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_msgIdentification_in_messageEvent608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_messageEvent610 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_messageSender_in_messageEvent612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inputAddress_in_messageReceiver638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_messageReceiver649 = new BitSet(new long[]{0x0000100000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_inputAddress_in_messageReceiver653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_outputAddress_in_messageSender675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_messageSender686 = new BitSet(new long[]{0x0000100000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_outputAddress_in_messageSender690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_messageName_in_msgIdentification713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characterString_in_msgIdentification717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceName_in_outputAddress729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_outputAddress734 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_outputAddress738 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_gateName_in_outputAddress740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceName_in_inputAddress767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_inputAddress772 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_inputAddress776 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_gateName_in_inputAddress778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_action804 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_actionStatement_in_action806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_informalAction_in_actionStatement821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_informalAction842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characterString_in_informalAction846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_instanceHeadStatement859 = new BitSet(new long[]{0x0000100000000002L,0x0000000000003C00L});
    public static final BitSet FOLLOW_instanceKind_in_instanceHeadStatement863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_instanceEndStatement879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscInstInterface_in_mscInterface891 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000200L});
    public static final BitSet FOLLOW_mscGateInterface_in_mscInterface895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscGateInterface_in_mscInterface902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_mscInstInterface915 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_instanceList_in_mscInstInterface917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_end_in_mscInstInterface919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceName_in_instanceList932 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_59_in_instanceList936 = new BitSet(new long[]{0x0000100000000000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_instanceKind_in_instanceList938 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_instanceList945 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_instanceList_in_instanceList947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kindDenominator_in_instanceKind965 = new BitSet(new long[]{0x0000100000000000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_identifier_in_instanceKind970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_kindDenominator983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_kindDenominator987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_kindDenominator991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_kindDenominator995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_kindDenominator999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_end1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionIdentification_in_condition1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_conditionIdentification1034 = new BitSet(new long[]{0x0000330000000000L});
    public static final BitSet FOLLOW_conditionText_in_conditionIdentification1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionNameList_in_conditionText1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHEN_in_conditionText1069 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_conditionNameList_in_conditionText1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OTHERWISE_in_conditionText1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_conditionNameList1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characterString_in_conditionNameList1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loopExpr_in_inlineExpr1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optExpr_in_inlineExpr1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_altExpr_in_inlineExpr1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpr_in_inlineExpr1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_excExpr_in_inlineExpr1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_loopExpr1144 = new BitSet(new long[]{0x0000040000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_loopBoundary_in_loopExpr1148 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_BEGIN_in_loopExpr1153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_end_in_loopExpr1155 = new BitSet(new long[]{0x0000108000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_mscBody_in_loopExpr1157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_loopExpr1159 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_END_in_loopExpr1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_optExpr1183 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_BEGIN_in_optExpr1185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_end_in_optExpr1187 = new BitSet(new long[]{0x0000108000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_mscBody_in_optExpr1189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_optExpr1191 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_END_in_optExpr1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_excExpr1212 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_BEGIN_in_excExpr1214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_end_in_excExpr1216 = new BitSet(new long[]{0x0000108000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_mscBody_in_excExpr1218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_excExpr1220 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_END_in_excExpr1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_altExpr1241 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_BEGIN_in_altExpr1243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_end_in_altExpr1245 = new BitSet(new long[]{0x0000108000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_mscBody_in_altExpr1247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_altExpr1251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_end_in_altExpr1253 = new BitSet(new long[]{0x0000108000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_mscBody_in_altExpr1255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_altExpr1260 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_END_in_altExpr1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_parExpr1282 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_BEGIN_in_parExpr1284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_end_in_parExpr1286 = new BitSet(new long[]{0x0000108000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_mscBody_in_parExpr1288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_parExpr1292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_end_in_parExpr1294 = new BitSet(new long[]{0x0000108000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_mscBody_in_parExpr1296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_parExpr1301 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_END_in_parExpr1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_loopBoundary1324 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_infNatural_in_loopBoundary1326 = new BitSet(new long[]{0x1000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_60_in_loopBoundary1330 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_infNatural_in_loopBoundary1332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_loopBoundary1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_infNatural1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characterString_in_infNatural1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_create1376 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_instanceName_in_create1378 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_create1382 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_msgIdentification_in_create1383 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_create1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_stop1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timerType_in_timerStatement1431 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_name_in_timerStatement1433 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_duration_in_timerStatement1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_timerType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_duration1485 = new BitSet(new long[]{0x1000300000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_infNatural_in_duration1489 = new BitSet(new long[]{0x1000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_60_in_duration1496 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_infNatural_in_duration1498 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_duration1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mscGateDef_in_mscGateInterface1528 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000200L});
    public static final BitSet FOLLOW_96_in_mscGateDef1540 = new BitSet(new long[]{0x4000100000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_msgGate_in_mscGateDef1544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_orderGate_in_mscGateDef1548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_end_in_mscGateDef1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defInGate_in_msgGate1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defOutGate_in_msgGate1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defOrderInGate_in_orderGate1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defOrderOutGate_in_orderGate1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gateName_in_defInGate1593 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_defInGate1598 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_msgIdentification_in_defInGate1600 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_defInGate1602 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_inputDest_in_defInGate1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gateName_in_defOutGate1617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_defOutGate1622 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_msgIdentification_in_defOutGate1624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_defOutGate1626 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_outputDest_in_defOutGate1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gateName_in_defOrderInGate1639 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_defOrderInGate1641 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_orderDest_in_defOrderInGate1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gateName_in_defOrderOutGate1653 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_defOrderOutGate1657 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_orderDestList_in_defOrderOutGate1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_inputDest1674 = new BitSet(new long[]{0x0000100000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_inputAddress_in_inputDest1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inputAddress_in_inputDest1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_outputDest1696 = new BitSet(new long[]{0x0000100000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_outputAddress_in_outputDest1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_outputAddress_in_outputDest1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eventName_in_orderDest1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_orderDest1723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_orderDest1725 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_gateName_in_orderDest1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderDest_in_orderDestList1748 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_orderDestList1752 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_orderDestList_in_orderDestList1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_coregion1777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_end_in_coregion1779 = new BitSet(new long[]{0x6000100000000000L,0x0000001038800041L});
    public static final BitSet FOLLOW_coevent_in_coregion1781 = new BitSet(new long[]{0x6000100000000000L,0x0000001038800041L});
    public static final BitSet FOLLOW_100_in_coregion1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderableEvent_in_coevent1804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_end_in_coevent1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_before_in_generalOrdering1822 = new BitSet(new long[]{0x0000000000000002L,0x0000000600000000L});
    public static final BitSet FOLLOW_after_in_generalOrdering1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_after_in_generalOrdering1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_before1840 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_orderDestList_in_before1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_after1862 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_orderDestList_in_after1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_mscReference1888 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_mscRefExpr_in_mscReference1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_mscRefExpr1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characterString_in_mscRefExpr1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_mscName1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_labelName1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_name1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_instanceName1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_messageName1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_gateName1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_eventName1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTERSTRING_in_characterString1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_identifier1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_expressionString2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_dataTypeName2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_datatypeTypeExpression2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_literalNameOrNumber2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_naturalSimpleExpression2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_fieldName2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_constantExpression2067 = new BitSet(new long[]{0x0000000000000002L});

}