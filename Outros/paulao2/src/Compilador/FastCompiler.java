package Compilador;

import java.text.CharacterIterator;
import java.util.List;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Token;


public class FastCompiler {
	
	public static void main(String[] args) {
		try{
			System.out.println("Compilador Fast");
			String entry ="/home/weckwar/workspace/CompiladorFast/src/Inputs/InputSimple.f";
			CharStream input = new ANTLRFileStream(entry);
			FastLexer lexer =  new FastLexer(input);
			CommonTokenStream list = new CommonTokenStream(lexer);
//			list.discardTokenType(FastLexer.WS);
//			List<Token> tklist = list.getTokens();
//			for(int i=0; i< tklist.size(); i++){
//				System.out.println(tklist.get(i));
//			}
			
			FastParser parser = new FastParser(list);
			parser.fast();
			String name = parser.g.getProgramID();
			if(parser.getNumberOfSyntaxErrors() == 0){
				System.out.println("passou sem parar");
				parser.g.virtualizeMain();
				parser.g.saveCode();
				Process proc = Runtime.getRuntime().exec("java -jar jasmin.jar " + name + ".j");
			}
		}
		catch(Exception e){
			System.err.println("Error: "+e);
		}
	}

}
