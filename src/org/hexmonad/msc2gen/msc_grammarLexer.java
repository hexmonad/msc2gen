// $ANTLR 3.1.3 Mar 18, 2009 10:09:25 msc_grammar.g 2014-03-12 23:18:31
package org.hexmonad.msc2gen;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class msc_grammarLexer extends Lexer {
    public static final int Condition=17;
    public static final int MsgGate=40;
    public static final int Before=29;
    public static final int LETTER=50;
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
    public static final int OTHERWISE=43;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int Action=16;
    public static final int MSCBody=6;
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
    public static final int Ref=31;
    public static final int Seq=21;
    public static final int Terminate=36;
    public static final int WHEN=42;
    public static final int GuardCond=19;
    public static final int ParameterList=10;
    public static final int CHARACTERSTRING=47;
    public static final int DECIMALDIGIT=51;
    public static final int StartTimer=37;
    public static final int SetCond=18;
    public static final int OTHERCHARACTER=56;

    // delegates
    // delegators

    public msc_grammarLexer() {;} 
    public msc_grammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public msc_grammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "msc_grammar.g"; }

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:3:7: ( 'msc' )
            // msc_grammar.g:3:9: 'msc'
            {
            match("msc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:4:7: ( 'endmsc' )
            // msc_grammar.g:4:9: 'endmsc'
            {
            match("endmsc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:5:7: ( ':' )
            // msc_grammar.g:5:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:6:7: ( ',' )
            // msc_grammar.g:6:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:7:7: ( 'label' )
            // msc_grammar.g:7:9: 'label'
            {
            match("label"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:8:7: ( 'out' )
            // msc_grammar.g:8:9: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:9:7: ( 'to' )
            // msc_grammar.g:9:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:10:7: ( 'in' )
            // msc_grammar.g:10:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:11:7: ( 'from' )
            // msc_grammar.g:11:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:12:7: ( 'lost' )
            // msc_grammar.g:12:9: 'lost'
            {
            match("lost"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:13:7: ( 'found' )
            // msc_grammar.g:13:9: 'found'
            {
            match("found"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:14:7: ( 'env' )
            // msc_grammar.g:14:9: 'env'
            {
            match("env"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:15:7: ( 'via' )
            // msc_grammar.g:15:9: 'via'
            {
            match("via"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:16:7: ( 'action' )
            // msc_grammar.g:16:9: 'action'
            {
            match("action"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:17:7: ( 'instance' )
            // msc_grammar.g:17:9: 'instance'
            {
            match("instance"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:18:7: ( 'endinstance' )
            // msc_grammar.g:18:9: 'endinstance'
            {
            match("endinstance"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:19:7: ( 'inst' )
            // msc_grammar.g:19:9: 'inst'
            {
            match("inst"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:20:7: ( 'system' )
            // msc_grammar.g:20:9: 'system'
            {
            match("system"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:21:7: ( 'block' )
            // msc_grammar.g:21:9: 'block'
            {
            match("block"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:22:7: ( 'process' )
            // msc_grammar.g:22:9: 'process'
            {
            match("process"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:23:7: ( 'service' )
            // msc_grammar.g:23:9: 'service'
            {
            match("service"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:24:7: ( ';' )
            // msc_grammar.g:24:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:25:7: ( 'condition' )
            // msc_grammar.g:25:9: 'condition'
            {
            match("condition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:26:7: ( 'loop' )
            // msc_grammar.g:26:9: 'loop'
            {
            match("loop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:27:7: ( 'opt' )
            // msc_grammar.g:27:9: 'opt'
            {
            match("opt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:28:7: ( 'exc' )
            // msc_grammar.g:28:9: 'exc'
            {
            match("exc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:29:7: ( 'alt' )
            // msc_grammar.g:29:9: 'alt'
            {
            match("alt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:30:7: ( 'par' )
            // msc_grammar.g:30:9: 'par'
            {
            match("par"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:31:7: ( '<' )
            // msc_grammar.g:31:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:32:7: ( '>' )
            // msc_grammar.g:32:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:33:7: ( 'inf' )
            // msc_grammar.g:33:9: 'inf'
            {
            match("inf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:34:7: ( '\"' )
            // msc_grammar.g:34:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:35:7: ( 'create' )
            // msc_grammar.g:35:9: 'create'
            {
            match("create"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:36:7: ( '(' )
            // msc_grammar.g:36:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:37:7: ( ')' )
            // msc_grammar.g:37:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:38:7: ( 'stop' )
            // msc_grammar.g:38:9: 'stop'
            {
            match("stop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:39:7: ( 'starttimer' )
            // msc_grammar.g:39:9: 'starttimer'
            {
            match("starttimer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:40:7: ( '[' )
            // msc_grammar.g:40:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:41:7: ( ']' )
            // msc_grammar.g:41:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:42:7: ( 'stoptimer' )
            // msc_grammar.g:42:9: 'stoptimer'
            {
            match("stoptimer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:43:7: ( 'timeout' )
            // msc_grammar.g:43:9: 'timeout'
            {
            match("timeout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:44:8: ( 'gate' )
            // msc_grammar.g:44:10: 'gate'
            {
            match("gate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:45:8: ( 'before' )
            // msc_grammar.g:45:10: 'before'
            {
            match("before"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:46:8: ( 'after' )
            // msc_grammar.g:46:10: 'after'
            {
            match("after"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:47:8: ( 'concurrent' )
            // msc_grammar.g:47:10: 'concurrent'
            {
            match("concurrent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:48:8: ( 'endconcurrent' )
            // msc_grammar.g:48:10: 'endconcurrent'
            {
            match("endconcurrent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:49:8: ( 'reference' )
            // msc_grammar.g:49:10: 'reference'
            {
            match("reference"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:341:7: ( 'begin' | 'BEGIN' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='b') ) {
                alt1=1;
            }
            else if ( (LA1_0=='B') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // msc_grammar.g:341:9: 'begin'
                    {
                    match("begin"); 


                    }
                    break;
                case 2 :
                    // msc_grammar.g:341:19: 'BEGIN'
                    {
                    match("BEGIN"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BEGIN"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:343:5: ( 'end' | 'END' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='e') ) {
                alt2=1;
            }
            else if ( (LA2_0=='E') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // msc_grammar.g:343:7: 'end'
                    {
                    match("end"); 


                    }
                    break;
                case 2 :
                    // msc_grammar.g:343:15: 'END'
                    {
                    match("END"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "ALL"
    public final void mALL() throws RecognitionException {
        try {
            int _type = ALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:345:5: ( 'all' | 'ALL' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='a') ) {
                alt3=1;
            }
            else if ( (LA3_0=='A') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // msc_grammar.g:345:7: 'all'
                    {
                    match("all"); 


                    }
                    break;
                case 2 :
                    // msc_grammar.g:345:15: 'ALL'
                    {
                    match("ALL"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ALL"

    // $ANTLR start "WHEN"
    public final void mWHEN() throws RecognitionException {
        try {
            int _type = WHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:347:7: ( 'when' | 'WHEN' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='w') ) {
                alt4=1;
            }
            else if ( (LA4_0=='W') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // msc_grammar.g:347:9: 'when'
                    {
                    match("when"); 


                    }
                    break;
                case 2 :
                    // msc_grammar.g:347:18: 'WHEN'
                    {
                    match("WHEN"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHEN"

    // $ANTLR start "OTHERWISE"
    public final void mOTHERWISE() throws RecognitionException {
        try {
            int _type = OTHERWISE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:350:2: ( 'otherwise' | 'OTHERWISE' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='o') ) {
                alt5=1;
            }
            else if ( (LA5_0=='O') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // msc_grammar.g:350:4: 'otherwise'
                    {
                    match("otherwise"); 


                    }
                    break;
                case 2 :
                    // msc_grammar.g:350:18: 'OTHERWISE'
                    {
                    match("OTHERWISE"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OTHERWISE"

    // $ANTLR start "LEFTBINDSYMBOL"
    public final void mLEFTBINDSYMBOL() throws RecognitionException {
        try {
            int _type = LEFTBINDSYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:353:2: ( ':=' )
            // msc_grammar.g:353:4: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFTBINDSYMBOL"

    // $ANTLR start "RIGHTBINDSYMBOL"
    public final void mRIGHTBINDSYMBOL() throws RecognitionException {
        try {
            int _type = RIGHTBINDSYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:356:2: ( '=:' )
            // msc_grammar.g:356:4: '=:'
            {
            match("=:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHTBINDSYMBOL"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // msc_grammar.g:360:9: ( 'A' .. 'Z' | 'a' .. 'z' )
            // msc_grammar.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DECIMALDIGIT"
    public final void mDECIMALDIGIT() throws RecognitionException {
        try {
            // msc_grammar.g:363:2: ( '0' .. '9' )
            // msc_grammar.g:363:4: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DECIMALDIGIT"

    // $ANTLR start "UNDERLINE"
    public final void mUNDERLINE() throws RecognitionException {
        try {
            // msc_grammar.g:366:2: ( '_' )
            // msc_grammar.g:366:4: '_'
            {
            match('_'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNDERLINE"

    // $ANTLR start "FULLSTOP"
    public final void mFULLSTOP() throws RecognitionException {
        try {
            // msc_grammar.g:369:2: ( '.' )
            // msc_grammar.g:369:4: '.'
            {
            match('.'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "FULLSTOP"

    // $ANTLR start "APOSTROPHE"
    public final void mAPOSTROPHE() throws RecognitionException {
        try {
            // msc_grammar.g:372:2: ( '\\'' )
            // msc_grammar.g:372:4: '\\''
            {
            match('\''); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "APOSTROPHE"

    // $ANTLR start "ALPHANUMERIC"
    public final void mALPHANUMERIC() throws RecognitionException {
        try {
            // msc_grammar.g:375:2: ( LETTER | DECIMALDIGIT )
            // msc_grammar.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "ALPHANUMERIC"

    // $ANTLR start "OTHERCHARACTER"
    public final void mOTHERCHARACTER() throws RecognitionException {
        try {
            // msc_grammar.g:378:2: ( '?' | '&' | '%' | '+' | '-' | '!' | '/' | '*' | '\"' | '=' )
            // msc_grammar.g:
            {
            if ( (input.LA(1)>='!' && input.LA(1)<='\"')||(input.LA(1)>='%' && input.LA(1)<='&')||(input.LA(1)>='*' && input.LA(1)<='+')||input.LA(1)=='-'||input.LA(1)=='/'||input.LA(1)=='='||input.LA(1)=='?' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "OTHERCHARACTER"

    // $ANTLR start "SPECIAL"
    public final void mSPECIAL() throws RecognitionException {
        try {
            // msc_grammar.g:380:9: ( '(' | ')' | '<' | '>' | ',' | ';' | ':' )
            // msc_grammar.g:
            {
            if ( (input.LA(1)>='(' && input.LA(1)<=')')||input.LA(1)==','||(input.LA(1)>=':' && input.LA(1)<='<')||input.LA(1)=='>' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "SPECIAL"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:382:7: ( ( LETTER | DECIMALDIGIT | UNDERLINE | FULLSTOP )+ )
            // msc_grammar.g:382:9: ( LETTER | DECIMALDIGIT | UNDERLINE | FULLSTOP )+
            {
            // msc_grammar.g:382:9: ( LETTER | DECIMALDIGIT | UNDERLINE | FULLSTOP )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='.'||(LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // msc_grammar.g:
            	    {
            	    if ( input.LA(1)=='.'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "CHARACTERSTRING"
    public final void mCHARACTERSTRING() throws RecognitionException {
        try {
            int _type = CHARACTERSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:385:2: ( APOSTROPHE ( ALPHANUMERIC | OTHERCHARACTER | SPECIAL | FULLSTOP | UNDERLINE | ' ' | ( APOSTROPHE APOSTROPHE ) )* APOSTROPHE )
            // msc_grammar.g:385:4: APOSTROPHE ( ALPHANUMERIC | OTHERCHARACTER | SPECIAL | FULLSTOP | UNDERLINE | ' ' | ( APOSTROPHE APOSTROPHE ) )* APOSTROPHE
            {
            mAPOSTROPHE(); 
            // msc_grammar.g:385:15: ( ALPHANUMERIC | OTHERCHARACTER | SPECIAL | FULLSTOP | UNDERLINE | ' ' | ( APOSTROPHE APOSTROPHE ) )*
            loop7:
            do {
                int alt7=8;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // msc_grammar.g:385:17: ALPHANUMERIC
            	    {
            	    mALPHANUMERIC(); 

            	    }
            	    break;
            	case 2 :
            	    // msc_grammar.g:385:32: OTHERCHARACTER
            	    {
            	    mOTHERCHARACTER(); 

            	    }
            	    break;
            	case 3 :
            	    // msc_grammar.g:385:49: SPECIAL
            	    {
            	    mSPECIAL(); 

            	    }
            	    break;
            	case 4 :
            	    // msc_grammar.g:385:59: FULLSTOP
            	    {
            	    mFULLSTOP(); 

            	    }
            	    break;
            	case 5 :
            	    // msc_grammar.g:385:70: UNDERLINE
            	    {
            	    mUNDERLINE(); 

            	    }
            	    break;
            	case 6 :
            	    // msc_grammar.g:385:82: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 7 :
            	    // msc_grammar.g:385:88: ( APOSTROPHE APOSTROPHE )
            	    {
            	    // msc_grammar.g:385:88: ( APOSTROPHE APOSTROPHE )
            	    // msc_grammar.g:385:89: APOSTROPHE APOSTROPHE
            	    {
            	    mAPOSTROPHE(); 
            	    mAPOSTROPHE(); 

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            mAPOSTROPHE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHARACTERSTRING"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // msc_grammar.g:389:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // msc_grammar.g:389:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // msc_grammar.g:389:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // msc_grammar.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // msc_grammar.g:1:8: ( T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | BEGIN | END | ALL | WHEN | OTHERWISE | LEFTBINDSYMBOL | RIGHTBINDSYMBOL | NAME | CHARACTERSTRING | WS )
        int alt9=57;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // msc_grammar.g:1:10: T__59
                {
                mT__59(); 

                }
                break;
            case 2 :
                // msc_grammar.g:1:16: T__60
                {
                mT__60(); 

                }
                break;
            case 3 :
                // msc_grammar.g:1:22: T__61
                {
                mT__61(); 

                }
                break;
            case 4 :
                // msc_grammar.g:1:28: T__62
                {
                mT__62(); 

                }
                break;
            case 5 :
                // msc_grammar.g:1:34: T__63
                {
                mT__63(); 

                }
                break;
            case 6 :
                // msc_grammar.g:1:40: T__64
                {
                mT__64(); 

                }
                break;
            case 7 :
                // msc_grammar.g:1:46: T__65
                {
                mT__65(); 

                }
                break;
            case 8 :
                // msc_grammar.g:1:52: T__66
                {
                mT__66(); 

                }
                break;
            case 9 :
                // msc_grammar.g:1:58: T__67
                {
                mT__67(); 

                }
                break;
            case 10 :
                // msc_grammar.g:1:64: T__68
                {
                mT__68(); 

                }
                break;
            case 11 :
                // msc_grammar.g:1:70: T__69
                {
                mT__69(); 

                }
                break;
            case 12 :
                // msc_grammar.g:1:76: T__70
                {
                mT__70(); 

                }
                break;
            case 13 :
                // msc_grammar.g:1:82: T__71
                {
                mT__71(); 

                }
                break;
            case 14 :
                // msc_grammar.g:1:88: T__72
                {
                mT__72(); 

                }
                break;
            case 15 :
                // msc_grammar.g:1:94: T__73
                {
                mT__73(); 

                }
                break;
            case 16 :
                // msc_grammar.g:1:100: T__74
                {
                mT__74(); 

                }
                break;
            case 17 :
                // msc_grammar.g:1:106: T__75
                {
                mT__75(); 

                }
                break;
            case 18 :
                // msc_grammar.g:1:112: T__76
                {
                mT__76(); 

                }
                break;
            case 19 :
                // msc_grammar.g:1:118: T__77
                {
                mT__77(); 

                }
                break;
            case 20 :
                // msc_grammar.g:1:124: T__78
                {
                mT__78(); 

                }
                break;
            case 21 :
                // msc_grammar.g:1:130: T__79
                {
                mT__79(); 

                }
                break;
            case 22 :
                // msc_grammar.g:1:136: T__80
                {
                mT__80(); 

                }
                break;
            case 23 :
                // msc_grammar.g:1:142: T__81
                {
                mT__81(); 

                }
                break;
            case 24 :
                // msc_grammar.g:1:148: T__82
                {
                mT__82(); 

                }
                break;
            case 25 :
                // msc_grammar.g:1:154: T__83
                {
                mT__83(); 

                }
                break;
            case 26 :
                // msc_grammar.g:1:160: T__84
                {
                mT__84(); 

                }
                break;
            case 27 :
                // msc_grammar.g:1:166: T__85
                {
                mT__85(); 

                }
                break;
            case 28 :
                // msc_grammar.g:1:172: T__86
                {
                mT__86(); 

                }
                break;
            case 29 :
                // msc_grammar.g:1:178: T__87
                {
                mT__87(); 

                }
                break;
            case 30 :
                // msc_grammar.g:1:184: T__88
                {
                mT__88(); 

                }
                break;
            case 31 :
                // msc_grammar.g:1:190: T__89
                {
                mT__89(); 

                }
                break;
            case 32 :
                // msc_grammar.g:1:196: T__90
                {
                mT__90(); 

                }
                break;
            case 33 :
                // msc_grammar.g:1:202: T__91
                {
                mT__91(); 

                }
                break;
            case 34 :
                // msc_grammar.g:1:208: T__92
                {
                mT__92(); 

                }
                break;
            case 35 :
                // msc_grammar.g:1:214: T__93
                {
                mT__93(); 

                }
                break;
            case 36 :
                // msc_grammar.g:1:220: T__94
                {
                mT__94(); 

                }
                break;
            case 37 :
                // msc_grammar.g:1:226: T__95
                {
                mT__95(); 

                }
                break;
            case 38 :
                // msc_grammar.g:1:232: T__96
                {
                mT__96(); 

                }
                break;
            case 39 :
                // msc_grammar.g:1:238: T__97
                {
                mT__97(); 

                }
                break;
            case 40 :
                // msc_grammar.g:1:244: T__98
                {
                mT__98(); 

                }
                break;
            case 41 :
                // msc_grammar.g:1:250: T__99
                {
                mT__99(); 

                }
                break;
            case 42 :
                // msc_grammar.g:1:256: T__100
                {
                mT__100(); 

                }
                break;
            case 43 :
                // msc_grammar.g:1:263: T__101
                {
                mT__101(); 

                }
                break;
            case 44 :
                // msc_grammar.g:1:270: T__102
                {
                mT__102(); 

                }
                break;
            case 45 :
                // msc_grammar.g:1:277: T__103
                {
                mT__103(); 

                }
                break;
            case 46 :
                // msc_grammar.g:1:284: T__104
                {
                mT__104(); 

                }
                break;
            case 47 :
                // msc_grammar.g:1:291: T__105
                {
                mT__105(); 

                }
                break;
            case 48 :
                // msc_grammar.g:1:298: BEGIN
                {
                mBEGIN(); 

                }
                break;
            case 49 :
                // msc_grammar.g:1:304: END
                {
                mEND(); 

                }
                break;
            case 50 :
                // msc_grammar.g:1:308: ALL
                {
                mALL(); 

                }
                break;
            case 51 :
                // msc_grammar.g:1:312: WHEN
                {
                mWHEN(); 

                }
                break;
            case 52 :
                // msc_grammar.g:1:317: OTHERWISE
                {
                mOTHERWISE(); 

                }
                break;
            case 53 :
                // msc_grammar.g:1:327: LEFTBINDSYMBOL
                {
                mLEFTBINDSYMBOL(); 

                }
                break;
            case 54 :
                // msc_grammar.g:1:342: RIGHTBINDSYMBOL
                {
                mRIGHTBINDSYMBOL(); 

                }
                break;
            case 55 :
                // msc_grammar.g:1:358: NAME
                {
                mNAME(); 

                }
                break;
            case 56 :
                // msc_grammar.g:1:363: CHARACTERSTRING
                {
                mCHARACTERSTRING(); 

                }
                break;
            case 57 :
                // msc_grammar.g:1:379: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA7_eotS =
        "\1\uffff\1\10\10\uffff";
    static final String DFA7_eofS =
        "\12\uffff";
    static final String DFA7_minS =
        "\1\40\1\47\10\uffff";
    static final String DFA7_maxS =
        "\1\172\1\47\10\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\10\1\7";
    static final String DFA7_specialS =
        "\12\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\7\2\3\2\uffff\2\3\1\1\2\4\2\3\1\4\1\3\1\5\1\3\12\2\3\4\1"+
            "\3\1\4\1\3\1\uffff\32\2\4\uffff\1\6\1\uffff\32\2",
            "\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "()* loopback of 385:15: ( ALPHANUMERIC | OTHERCHARACTER | SPECIAL | FULLSTOP | UNDERLINE | ' ' | ( APOSTROPHE APOSTROPHE ) )*";
        }
    }
    static final String DFA9_eotS =
        "\1\uffff\2\41\1\50\1\uffff\12\41\1\uffff\1\41\7\uffff\10\41\4\uffff"+
        "\3\41\2\uffff\5\41\1\122\1\41\1\126\27\41\1\161\1\165\1\166\1\167"+
        "\3\41\1\173\1\174\1\41\1\uffff\2\41\1\u0080\1\uffff\2\41\1\u0083"+
        "\1\41\1\u0085\1\u0086\11\41\1\u0090\5\41\1\165\1\u0086\3\41\1\uffff"+
        "\3\41\3\uffff\1\41\1\u009e\1\u009f\2\uffff\2\41\1\u00a3\1\uffff"+
        "\1\u00a4\1\41\1\uffff\1\41\2\uffff\3\41\1\u00ab\5\41\1\uffff\3\41"+
        "\1\u00b4\2\41\2\u00b7\4\41\1\u00bc\2\uffff\3\41\2\uffff\1\u00c0"+
        "\1\41\1\u00c2\3\41\1\uffff\1\41\1\u00c7\1\41\1\u00c9\4\41\1\uffff"+
        "\1\41\1\u00c9\1\uffff\1\41\1\u00d0\2\41\1\uffff\3\41\1\uffff\1\u00d6"+
        "\1\uffff\1\u00d7\3\41\1\uffff\1\u00db\1\uffff\3\41\1\u00df\2\41"+
        "\1\uffff\3\41\1\u00e5\1\41\2\uffff\1\u00e7\2\41\1\uffff\1\u00ea"+
        "\2\41\1\uffff\5\41\1\uffff\1\u00f2\1\uffff\2\41\1\uffff\6\41\1\u00fb"+
        "\1\uffff\1\u00fc\1\41\1\u00fe\1\41\1\u0100\1\u00fb\2\41\2\uffff"+
        "\1\u0103\1\uffff\1\u0104\1\uffff\1\u0105\1\41\3\uffff\1\41\1\u0108"+
        "\1\uffff";
    static final String DFA9_eofS =
        "\u0109\uffff";
    static final String DFA9_minS =
        "\1\11\1\163\1\156\1\75\1\uffff\1\141\1\160\1\151\1\156\1\157\1\151"+
        "\1\143\2\145\1\141\1\uffff\1\157\7\uffff\1\141\1\145\1\105\1\116"+
        "\1\114\1\150\1\110\1\124\4\uffff\1\143\1\144\1\143\2\uffff\1\142"+
        "\1\157\2\164\1\150\1\56\1\155\1\56\1\157\1\165\1\141\1\164\1\154"+
        "\1\164\1\163\1\162\1\141\1\157\1\146\1\157\1\162\1\156\1\145\1\164"+
        "\1\146\1\107\1\104\1\114\1\145\1\105\1\110\4\56\1\145\1\164\1\160"+
        "\2\56\1\145\1\uffff\1\145\1\164\1\56\1\uffff\1\155\1\156\1\56\1"+
        "\151\2\56\1\145\1\164\1\166\1\160\1\162\1\143\1\157\1\151\1\143"+
        "\1\56\1\143\1\141\2\145\1\111\2\56\1\156\1\116\1\105\1\uffff\1\163"+
        "\1\156\1\157\3\uffff\1\154\2\56\2\uffff\1\162\1\157\1\56\1\uffff"+
        "\1\56\1\144\1\uffff\1\157\2\uffff\1\162\1\145\1\151\1\56\1\164\1"+
        "\153\1\162\1\156\1\145\1\uffff\1\151\1\165\1\164\1\56\1\162\1\116"+
        "\2\56\1\122\1\143\1\163\1\156\1\56\2\uffff\1\167\1\165\1\156\2\uffff"+
        "\1\56\1\156\1\56\1\155\1\143\1\151\1\uffff\1\164\1\56\1\145\1\56"+
        "\1\163\1\164\1\162\1\145\1\uffff\1\145\1\56\1\uffff\1\127\1\56\1"+
        "\164\1\143\1\uffff\1\151\1\164\1\143\1\uffff\1\56\1\uffff\1\56\1"+
        "\145\1\155\1\151\1\uffff\1\56\1\uffff\1\163\1\151\1\162\1\56\1\156"+
        "\1\111\1\uffff\1\141\1\165\1\163\1\56\1\145\2\uffff\1\56\1\145\1"+
        "\155\1\uffff\1\56\1\157\1\145\1\uffff\1\143\1\123\1\156\1\162\1"+
        "\145\1\uffff\1\56\1\uffff\1\162\1\145\1\uffff\2\156\1\145\1\105"+
        "\1\143\1\162\1\56\1\uffff\1\56\1\162\1\56\1\164\2\56\2\145\2\uffff"+
        "\1\56\1\uffff\1\56\1\uffff\1\56\1\156\3\uffff\1\164\1\56\1\uffff";
    static final String DFA9_maxS =
        "\1\172\1\163\1\170\1\75\1\uffff\1\157\1\165\1\157\1\156\1\162\1"+
        "\151\1\154\1\171\1\154\1\162\1\uffff\1\162\7\uffff\1\141\1\145\1"+
        "\105\1\116\1\114\1\150\1\110\1\124\4\uffff\1\143\1\166\1\143\2\uffff"+
        "\1\142\1\163\2\164\1\150\1\172\1\155\1\172\1\157\1\165\1\141\3\164"+
        "\1\163\1\162\2\157\1\147\1\157\1\162\1\156\1\145\1\164\1\146\1\107"+
        "\1\104\1\114\1\145\1\105\1\110\4\172\1\145\1\164\1\160\2\172\1\145"+
        "\1\uffff\1\145\1\164\1\172\1\uffff\1\155\1\156\1\172\1\151\2\172"+
        "\1\145\1\164\1\166\1\160\1\162\1\143\1\157\1\151\1\143\1\172\1\144"+
        "\1\141\2\145\1\111\2\172\1\156\1\116\1\105\1\uffff\1\163\1\156\1"+
        "\157\3\uffff\1\154\2\172\2\uffff\1\162\1\157\1\172\1\uffff\1\172"+
        "\1\144\1\uffff\1\157\2\uffff\1\162\1\145\1\151\1\172\1\164\1\153"+
        "\1\162\1\156\1\145\1\uffff\1\151\1\165\1\164\1\172\1\162\1\116\2"+
        "\172\1\122\1\143\1\163\1\156\1\172\2\uffff\1\167\1\165\1\156\2\uffff"+
        "\1\172\1\156\1\172\1\155\1\143\1\151\1\uffff\1\164\1\172\1\145\1"+
        "\172\1\163\1\164\1\162\1\145\1\uffff\1\145\1\172\1\uffff\1\127\1"+
        "\172\1\164\1\143\1\uffff\1\151\1\164\1\143\1\uffff\1\172\1\uffff"+
        "\1\172\1\145\1\155\1\151\1\uffff\1\172\1\uffff\1\163\1\151\1\162"+
        "\1\172\1\156\1\111\1\uffff\1\141\1\165\1\163\1\172\1\145\2\uffff"+
        "\1\172\1\145\1\155\1\uffff\1\172\1\157\1\145\1\uffff\1\143\1\123"+
        "\1\156\1\162\1\145\1\uffff\1\172\1\uffff\1\162\1\145\1\uffff\2\156"+
        "\1\145\1\105\1\143\1\162\1\172\1\uffff\1\172\1\162\1\172\1\164\2"+
        "\172\2\145\2\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\156\3\uffff"+
        "\1\164\1\172\1\uffff";
    static final String DFA9_acceptS =
        "\4\uffff\1\4\12\uffff\1\26\1\uffff\1\35\1\36\1\40\1\42\1\43\1\46"+
        "\1\47\10\uffff\1\66\1\67\1\70\1\71\3\uffff\1\65\1\3\51\uffff\1\7"+
        "\3\uffff\1\10\32\uffff\1\1\3\uffff\1\61\1\14\1\32\3\uffff\1\6\1"+
        "\31\3\uffff\1\37\2\uffff\1\15\1\uffff\1\33\1\62\11\uffff\1\34\15"+
        "\uffff\1\12\1\30\3\uffff\1\21\1\11\6\uffff\1\44\10\uffff\1\52\2"+
        "\uffff\1\63\4\uffff\1\5\3\uffff\1\13\1\uffff\1\54\4\uffff\1\23\1"+
        "\uffff\1\60\6\uffff\1\2\5\uffff\1\16\1\22\3\uffff\1\53\3\uffff\1"+
        "\41\5\uffff\1\51\1\uffff\1\25\2\uffff\1\24\7\uffff\1\17\10\uffff"+
        "\1\64\1\50\1\uffff\1\27\1\uffff\1\57\2\uffff\1\45\1\55\1\20\2\uffff"+
        "\1\56";
    static final String DFA9_specialS =
        "\u0109\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\43\2\uffff\1\43\22\uffff\1\43\1\uffff\1\23\4\uffff\1\42\1"+
            "\24\1\25\2\uffff\1\4\1\uffff\1\41\1\uffff\12\41\1\3\1\17\1\21"+
            "\1\40\1\22\2\uffff\1\34\1\32\2\41\1\33\11\41\1\37\7\41\1\36"+
            "\3\41\1\26\1\uffff\1\27\1\uffff\1\41\1\uffff\1\13\1\15\1\20"+
            "\1\41\1\2\1\11\1\30\1\41\1\10\2\41\1\5\1\1\1\41\1\6\1\16\1\41"+
            "\1\31\1\14\1\7\1\41\1\12\1\35\3\41",
            "\1\44",
            "\1\45\11\uffff\1\46",
            "\1\47",
            "",
            "\1\51\15\uffff\1\52",
            "\1\54\3\uffff\1\55\1\53",
            "\1\57\5\uffff\1\56",
            "\1\60",
            "\1\62\2\uffff\1\61",
            "\1\63",
            "\1\64\2\uffff\1\66\5\uffff\1\65",
            "\1\70\16\uffff\1\71\4\uffff\1\67",
            "\1\73\6\uffff\1\72",
            "\1\75\20\uffff\1\74",
            "",
            "\1\76\2\uffff\1\77",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "",
            "",
            "",
            "",
            "\1\110",
            "\1\111\21\uffff\1\112",
            "\1\113",
            "",
            "",
            "\1\114",
            "\1\116\3\uffff\1\115",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\123",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\5\41"+
            "\1\125\14\41\1\124\7\41",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\134\7\uffff\1\133",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\141\15\uffff\1\140",
            "\1\142",
            "\1\143\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\2\41"+
            "\1\164\5\41\1\163\3\41\1\162\15\41",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\175",
            "",
            "\1\176",
            "\1\177",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u0081",
            "\1\u0082",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0084",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0092\1\u0091",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "",
            "",
            "",
            "\1\u009d",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\u00a0",
            "\1\u00a1",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\1\u00a2"+
            "\31\41",
            "",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00a5",
            "",
            "\1\u00a6",
            "",
            "",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\23\41"+
            "\1\u00aa\6\41",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00b5",
            "\1\u00b6",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "",
            "",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00c1",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "",
            "\1\u00c6",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00c8",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00cf",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00d1",
            "\1\u00d2",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00e0",
            "\1\u00e1",
            "",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00e6",
            "",
            "",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00e8",
            "\1\u00e9",
            "",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00f3",
            "\1\u00f4",
            "",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00fd",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00ff",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0101",
            "\1\u0102",
            "",
            "",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0106",
            "",
            "",
            "",
            "\1\u0107",
            "\1\41\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | BEGIN | END | ALL | WHEN | OTHERWISE | LEFTBINDSYMBOL | RIGHTBINDSYMBOL | NAME | CHARACTERSTRING | WS );";
        }
    }
 

}