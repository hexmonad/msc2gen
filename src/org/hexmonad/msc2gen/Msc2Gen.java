package org.hexmonad.msc2gen;

import java.io.IOException;
import org.antlr.runtime.RecognitionException;

public class Msc2Gen {
    public static void main( String[] args ) {
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
            msc.parse( "examples/element_kinds.msc", null );
        } catch(IOException e) {
            System.out.println("Error! Reading of input MSC file failed.");
        } catch(RecognitionException e) {
            System.out.println("Error! Parsing of input MSC file failed.");
        }
    }
}
