package org.hexmonad.msc2gen;

import java.io.IOException;
import org.antlr.runtime.RecognitionException;

public class Msc2Gen {
    public static void main( String[] args ) {
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
                       "  <out_file.mscgen> - the file that is the result of translation input MSC format to format of mscgen app";

        if( args.length > 0 && args[0].equals("--help") ) {
            System.out.println( usage );
            return;
        }
        
        MscParser msc = new MscParser();
        try {
            String mscOutput = msc.parse( "msc_example.msc" );
            System.out.println( "Output:\n\n" + mscOutput );
        } catch(IOException e) {
            System.out.println("Error! Reading of input MSC file failed.");
        } catch(RecognitionException e) {
            System.out.println("Error! Parsing of input MSC file failed.");
        }
    }
}
