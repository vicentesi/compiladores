package Compilador;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;

public class GramaCompiler {

	public static void main(String[] args) {
		try {
			System.out.println("~~~ GRAMA ~~~");
			String entry = "data" + File.separator + "InputSimple.f";
			CharStream input = new ANTLRFileStream(entry);
			gramaLexer lexer = new gramaLexer(input);
			CommonTokenStream list = new CommonTokenStream(lexer);
			gramaParser parser = new gramaParser(list);
			parser.grama();
			if (parser.getNumberOfSyntaxErrors() == 0) {
				System.out.println("\nAnálise OK\n");
				parser.generator.createMain();
				parser.generator.saveCode("data" + File.separator + "" + Generator.PROGRAM_ID + ".j");
				Process proc = Runtime.getRuntime().exec(
						"java -jar util" + File.separator + "jasmin.jar data" + File.separator + ""
								+ Generator.PROGRAM_ID + ".j -d data");
				System.out.println("Saída do Jasmin: ");
				printProcOutput(proc);

				System.out.println("\nSaída do programa criado: ");
				proc = Runtime.getRuntime().exec("java -classpath ." + File.separator + "data " + Generator.PROGRAM_ID);
				printProcOutput(proc);
			}
		} catch (Exception e) {
			System.err.println("Error: " + e);
		}
	}

	public static void printProcOutput(Process proc) {
		BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
		String line;
		try {
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
