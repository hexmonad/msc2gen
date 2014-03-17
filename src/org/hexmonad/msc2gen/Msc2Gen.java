package org.hexmonad.msc2gen;

import java.io.IOException;
import org.antlr.runtime.RecognitionException;

public class Msc2Gen {
    public static void main( String[] args ) {
        String usage = "msc2gen [in_file.msc] [out_file.signalling]\n" +
                " where\n" +
                "  <in_file.msc> - the file that represents input MSC (event-oriented syntax)\n" +
                "  <out_file.signalling> - the file that is the result of translation input MSC format to format of Msc-generator app";

        String inFile = "";
        String outFile = null;
        if (args.length > 0) {
            if (args[0].equals("--help") ) {
                System.out.println( usage );
                return;
            } else {
                inFile = args[0];
                outFile = (args.length > 1) ? args[1] : null;
            }
        }
        
        MscParser msc = new MscParser();
        try {
            msc.parse( inFile.isEmpty() ? "examples/element_kinds.msc" : inFile, outFile );
        } catch(IOException e) {
            System.out.println("Error! Reading of input MSC file failed.");
        } catch(RecognitionException e) {
            System.out.println("Error! Parsing of input MSC file failed.");
        }
    }
}
