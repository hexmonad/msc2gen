import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class msc2gen {
    public static void main( String[] args ) throws Exception {
        String input =  "msc example1; \n" +
                        "i1 : instance; \n" +
                        "i2 : instance; \n" +
                        "i1 : out m1 to i2; \n" +
                        "i2 : in m1 from i1; \n" +
                        "i1 : condition C1; \n" +
                        "i2 : condition C2; \n" +
                        "i1 : action 'a'; \n" +
                        "i2 : out m2 to i1; \n" +
                        "i1 : in m2 from i2; \n" +
                        "i1 : endinstance; \n" +
                        "i2 : endinstance; \n" +
                        "endmsc; \n";
        String usage = "msc2gen <in_file.msc> <out_file.mscgen>\n" +
                       " where\n" +
                       "  <in_file.msc> - the file that represents input MSC (event-oriented syntax)\n" +
                       "  <out_file.msc> - the file that is the result of translation input MSC format to format of mscgen app";

        if( args.length > 0 && args[0].equals("--help") ) {
            System.out.println( usage );
            return;
        }

        System.out.println( "Output:\n\n" + input );

	ANTLRFileStream char_stream = new ANTLRFileStream( "msc_example.msc" );
        msc_grammarLexer lexer = new msc_grammarLexer( char_stream );
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        msc_grammarParser parser = new msc_grammarParser( tokens );
	CommonTree tree = (CommonTree)parser.messageSequenceChart().getTree();	
	System.out.println( tree.toStringTree() );
    }
}