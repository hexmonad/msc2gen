package org.hexmonad.msc2gen;

import java.io.IOException;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class MscParser {

    public String parse(String mscFileName) throws IOException, RecognitionException {
        ANTLRFileStream char_stream = new ANTLRFileStream( mscFileName );
        
        msc_grammarLexer lexer = new msc_grammarLexer( char_stream );
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        
        msc_grammarParser parser = new msc_grammarParser( tokens );
        CommonTree tree = (CommonTree) parser.messageSequenceChart().getTree();        
        
        return tree.toStringTree();
    }
}
