import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import Tools.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        javaxLexer lex = new javaxLexer(new ANTLRFileStream("/home/cesar/UFSC/Compiladores/FINAL/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        javaxParser g = new javaxParser(tokens, 49100, null);
        try {
            g.chunk();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}