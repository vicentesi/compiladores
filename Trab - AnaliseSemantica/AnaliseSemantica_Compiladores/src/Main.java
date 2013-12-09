import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {

	public static void main(String[] args) {
		ANTLRInputStream antlrInputStream = null;
		try {
			antlrInputStream = new ANTLRInputStream(new FileInputStream(new File("testes/test2.txt")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		AnaliseSemanticaLexer lexer = new AnaliseSemanticaLexer(antlrInputStream);
		CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
		AnaliseSemanticaParser parser = new AnaliseSemanticaParser(commonTokenStream);

		ParseTree parseTree = parser.program();
		ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
		parseTreeWalker.walk(new AnaliseSemanticaListenerImpl(), parseTree);

	}

}
