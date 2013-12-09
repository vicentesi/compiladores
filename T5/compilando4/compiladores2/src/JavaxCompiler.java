
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;

import antlr.collections.List;

public class JavaxCompiler {

	public static void main(String[] args) {
		try {
			System.out.println("Javax Compiler");
			String entry = "/home/vitti/workspace/compiladores2/src/Inputs/InputError.f";
			CharStream input = new ANTLRFileStream(entry);
			JavaxLexer lexer = new JavaxLexer(input);
			CommonTokenStream list = new CommonTokenStream(lexer);
			 list.discardTokenType(JavaxLexer.WS);
	//		 List<Token> tklist = list.getTokens();
	//		 for(int i=0; i< tklist.size(); i++){
	//		 System.out.println(tklist.get(i));
	//		 }

			JavaxParser parser = new JavaxParser(list);
			parser.javax();
			
		} catch (Exception e) {
			System.err.println("Error: " + e);
		}
	}

}
