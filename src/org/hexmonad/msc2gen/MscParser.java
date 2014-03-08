package org.hexmonad.msc2gen;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class MscParser {
    private PrintStream outStream;
    private ArrayList<String> lifelines = new ArrayList<String>();
    private boolean instFlag = true;    // true while parsing of instance declarations

    public void parse(String mscFileName, String outFileName) throws IOException, RecognitionException {
        ANTLRFileStream char_stream = new ANTLRFileStream( mscFileName );
        msc_grammarLexer lexer = new msc_grammarLexer( char_stream );
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        
        msc_grammarParser parser = new msc_grammarParser( tokens );
        CommonTree tree = (CommonTree) parser.messageSequenceChart().getTree();
        System.out.println(tree.toStringTree());
        
        // get MSC name
        String mscName = tree.getChild(0).getChild(0).toString();
        outFileName = ( outFileName == null ? mscName + ".txt" : outFileName );
        
        outStream = new PrintStream(outFileName);
        outStream.println("msc {");
        
        //parse MSC Body only
        parseTree( tree.getChild(1), "    " );
        
        outStream.print("}");
        outStream.close();
    }
    
    private void parseTree(Tree tree, String indentLevel) {
        String token = tree.getText();
        
        if (token.equals("MSCBody")) {
            parseChildTree(tree, indentLevel);
            
        } else if (token.equals("Instance")) {
            String instName = tree.getChild(0).getText();
            
            if (tree.getChild(1).getText().equals("instance")) {
                String commaSign = ( lifelines.isEmpty() ? "" : ", " );
                outStream.print(commaSign + instName);
                lifelines.add(instName);
            } else if (instFlag) {
                // end of instance declarations
                outStream.println(";");
                instFlag = false;
            }
        
        } else if (token.equals("MSGIn")) {
            
            
        } else if (token.equals("MSGOut")) {
            
        }
    }
    
    private void parseChildTree(Tree tree, String indentLevel) {
        int num = tree.getChildCount();
        for(int i = 0; i < num; i++) {
            parseTree(tree.getChild(i), indentLevel);
        }
    }
}
