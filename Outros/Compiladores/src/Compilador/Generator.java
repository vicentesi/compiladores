package Compilador;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;

public class Generator {
	private String codeString;
	private String globalcode;
	private final HashMap<String, String> operators;
	private final HashMap<String, String> returnOperators;
	private final HashMap<String, String> types;
	private final HashMap<String, String> returnTypes;
	private final HashMap<String, String> valueTypes;
	private String context;
	private final HashMap<String, ArrayList<String>> variables;
	private final Semantico semantic;
	private int elseLCount;
	private int doneLCount;
	private int whileLCount;
	private final Stack<Integer> whileNest;
	private final Stack<Integer> doneNest;

	private static final String M_GLOBAL = "Global";
	private static final String NEWLINE = "\n";
	private static final String TAB = "\t";

	public static final String PROGRAM_ID = "out";

	public Generator(Semantico semantic) {
		codeString = "";
		globalcode = "";
		doneLCount = 0;
		this.semantic = semantic;
		operators = new HashMap<String, String>();
		returnOperators = new HashMap<String, String>();
		whileLCount = 0;
		whileNest = new Stack<Integer>();
		whileNest.push(0);
		doneNest = new Stack<Integer>();
		doneNest.push(0);
		elseLCount = 0;
		returnTypes = new HashMap<String, String>();
		types = new HashMap<String, String>();
		valueTypes = new HashMap<String, String>();
		variables = new HashMap<String, ArrayList<String>>();
		context = M_GLOBAL;
		// this.globalFunctionCalls = "";

		variables.put(M_GLOBAL, new ArrayList<String>());

		operators.put("+", "iadd");
		operators.put("-", "isub");
		operators.put("*", "imul");
		operators.put("/", "idiv");

		returnOperators.put("+", "fadd");
		returnOperators.put("-", "fsub");
		returnOperators.put("*", "fmul");
		returnOperators.put("/", "fdiv");

		returnTypes.put("Integer", "i");
		returnTypes.put("Real", "f");
		returnTypes.put("String", "a");
		returnTypes.put("Boolean", "i");
		returnTypes.put("Void", "");

		types.put("Integer", "I");
		types.put("Real", "F");
		types.put("String", "Ljava/lang/String;");
		types.put("Boolean", "B");
		types.put("Void", "V");

		includeHeader();
	}

	public void includeHeader() {
		String header = "";
		header += "; Jasmin code" + NEWLINE;
		header += ".class public " + PROGRAM_ID + NEWLINE;
		header += ".super java/lang/Object" + NEWLINE;
		header += ".method public <init>()V" + NEWLINE;
		header += TAB + "aload_0" + NEWLINE;
		header += TAB + "invokenonvirtual java/lang/Object/<init>()V" + NEWLINE;
		header += TAB + "return" + NEWLINE;
		header += ".end method" + NEWLINE;

		includeCode(header);
	}

	public void includeCode(String codepart) {
		codeString += codepart;
	}

	public void generateCode(String codepart) {
		if (context.equals(M_GLOBAL)) {
			globalcode += codepart;
		} else {
			includeCode(codepart);
		}
	}

	public void pushConstant(String value) {
		generateCode(TAB + "ldc " + value + NEWLINE);
	}

	public void pushBoolean(String bool) {
		if (bool.equals(semantic.TRUE)) {
			generateCode(TAB + "bipush 1" + NEWLINE);
		} else if (bool.equals(semantic.FALSE)) {
			generateCode(TAB + "bipush 0" + NEWLINE);
		}
	}

	public void pushOperator(String op, String type) {
		if (type.equals("Integer")) {
			generateCode(TAB + operators.get(op) + NEWLINE);
		} else {
			generateCode(TAB + returnOperators.get(op) + NEWLINE);
		}
	}

	public void pushValue(String value) {
		generateCode(valueTypes.get(value));
	}

	public void pushUnary(String operador, String tipo) {
		if (tipo == semantic.INTEGER) {
			generateCode(TAB + "ldc -1" + NEWLINE);
			generateCode(TAB + "imul" + NEWLINE);
		} else if (tipo == semantic.REAL) {
			generateCode(TAB + "ldc -1.0" + NEWLINE);
			generateCode(TAB + "fmul" + NEWLINE);
		} else if (tipo == semantic.BOOLEAN) {
			generateCode(TAB + "" + NEWLINE);
			generateCode(TAB + "fmul" + NEWLINE);
		}
	}

	public void addVarDec(String name, String tipo) {
		String varName = name;
		ArrayList<String> temp = variables.get(context);
		int varId = temp.size();
		temp.add(varId, varName);

		if (tipo.equals(semantic.BOOLEAN)) {
			generateCode(TAB + "bipush 1" + NEWLINE);
			generateCode(TAB + "istore " + varId + TAB + "; " + varName + NEWLINE);
		} else if (tipo.equals(semantic.INTEGER)) {
			generateCode(TAB + "ldc 0" + NEWLINE);
			generateCode(TAB + "istore " + varId + TAB + "; " + varName + NEWLINE);
		} else if (tipo.equals(semantic.REAL)) {
			generateCode(TAB + "ldc 0.0" + NEWLINE);
			generateCode(TAB + "fstore " + varId + TAB + "; " + varName + NEWLINE);
		} else if (tipo.equals(semantic.STRING)) {
			generateCode(TAB + "ldc \"\"" + NEWLINE);
			generateCode(TAB + "astore " + varId + TAB + "; " + varName + NEWLINE);
		}
	}

	public void loadVariable(String name, String tipo) {
		ArrayList<String> temp = variables.get(context);
		int varId = temp.indexOf(name);
		if (varId == -1) {
			System.err.println("Erro!!");
			System.exit(0);
		}
		if (tipo.equals(semantic.BOOLEAN)) {
			generateCode(TAB + "iload " + varId + TAB + "; " + name + NEWLINE);
		} else if (tipo.equals(semantic.INTEGER)) {
			generateCode(TAB + "iload " + varId + TAB + "; " + name + NEWLINE);
		} else if (tipo.equals(semantic.REAL)) {
			generateCode(TAB + "fload " + varId + TAB + "; " + name + NEWLINE);
		} else if (tipo.equals(semantic.STRING)) {
			generateCode(TAB + "aload " + varId + TAB + "; " + name + NEWLINE);
		}
	}

	public void addVarAtrib(String name, String tipo) {
		ArrayList<String> temp = variables.get(context);
		int varId = temp.indexOf(name);
		if (varId == -1) {
			System.err.println("Erro!!");
			System.exit(0);
		}
		if (tipo.equals(semantic.BOOLEAN)) {
			generateCode(TAB + "istore " + varId + TAB + "; " + name + NEWLINE);
		} else if (tipo.equals(semantic.INTEGER)) {
			generateCode(TAB + "istore " + varId + TAB + "; " + name + NEWLINE);
		} else if (tipo.equals(semantic.REAL)) {
			generateCode(TAB + "fstore " + varId + TAB + "; " + name + NEWLINE);
		} else if (tipo.equals(semantic.STRING)) {
			generateCode(TAB + "astore " + varId + TAB + "; " + name + NEWLINE);
		}
	}

	public void pushWhile(String type, String op) {
		addIf(type, op, "Done");
	}

	public void addWhileL() {
		generateCode("While" + whileLCount + ":" + NEWLINE);
		whileNest.push(whileLCount);
		whileLCount++;
	}

	public int addLabel(String label) {
		int result = 0;
		if (label.equals("While")) {
			result = whileNest.pop();
		} else if (label.equals("Done")) {
			result = doneNest.pop();
		}
		return result;
	}

	public void addIf(String type, String op, String lb) {
		String label = "";
		if (type.equals(semantic.INTEGER)) {
			if (lb.equals("Else")) {
				label = " " + lb + elseLCount;
			} else if (lb.equals("Done")) {
				label = " " + lb + doneLCount;
			}
			generateCode(TAB + "isub" + NEWLINE);
			if (op.equals(semantic.DIFF)) {
				generateCode(TAB + "ifeq" + label + NEWLINE);
			} else if (op.equals(semantic.EQUALS)) {
				generateCode(TAB + "ifne" + label + NEWLINE);
			} else if (op.equals(semantic.GREATER)) {
				generateCode(TAB + "ifle" + label + NEWLINE);
			} else if (op.equals(semantic.LESS)) {
				generateCode(TAB + "ifge" + label + NEWLINE);
			} else if (op.equals(semantic.GREATEREQUALS)) {
				generateCode(TAB + "iflt" + label + NEWLINE);
			} else if (op.equals(semantic.LESSEQUALS)) {
				generateCode(TAB + "ifgt" + label + NEWLINE);
			}
		}
	}

	public void addElse() {
		generateCode("Else" + elseLCount + ":" + NEWLINE);
		elseLCount++;
	}

	public void addGoTo(String typeL) {
		generateCode(TAB + "goto " + typeL + NEWLINE);
	}

	public void addDone() {
		generateCode("Done" + doneLCount + ":" + NEWLINE);
		doneNest.push(doneLCount);
		doneLCount++;
	}

	public void addFunction(String def, HashMap<String, String> params, String type) {
		context = def;
		String returnType;
		String parameters = "";
		returnType = types.get(type);
		Iterator<String> it = params.keySet().iterator();
		ArrayList<String> vars = new ArrayList<String>();
		while (it.hasNext()) {
			String nameVar = it.next();
			vars.add(nameVar);
			String typeVar = params.get(nameVar);
			parameters += types.get(typeVar);
		}
		variables.put(def, vars);
		generateCode(".method public static " + def + "(" + parameters + ")" + returnType + NEWLINE);
		generateCode(".limit locals 40" + NEWLINE);
		generateCode(".limit stack 20" + NEWLINE);
	}

	public void addEnd(String type) {
		String returnType = returnTypes.get(type);
		generateCode(TAB + returnType + "return" + NEWLINE);
		generateCode(".end method" + NEWLINE + NEWLINE);
		context = "Global";
	}

	public void addFunctionCall(String def, HashMap<String, String> args, String type) {
		String returnType;
		String arguments = "";
		returnType = types.get(type);
		Iterator<String> it = args.keySet().iterator();
		String functionCall = "";

		while (it.hasNext()) {
			String nameVar = it.next();
			String typeVar = args.get(nameVar);
			arguments += types.get(typeVar);
		}

		functionCall = (TAB + "invokestatic " + PROGRAM_ID + "/" + def + "(" + arguments + ")" + returnType + NEWLINE);

		generateCode(functionCall);

	}

	public void createMain() {
		includeCode(".method public static main([Ljava/lang/String;)V" + NEWLINE);
		includeCode(".limit locals 40" + NEWLINE);
		includeCode(".limit stack 20" + NEWLINE);

		includeCode(globalcode);

		includeCode(TAB + "return" + NEWLINE);
		includeCode(".end method" + NEWLINE);
		includeCode(NEWLINE);
	}

	public void pushPrint() {
		generateCode(TAB + "getstatic java/lang/System/out Ljava/io/PrintStream;" + NEWLINE);
	}

	public void pushInvokePrint(String tipo) {
		if (tipo == semantic.INTEGER) {
			generateCode(TAB + "invokevirtual java/io/PrintStream/print(I)V" + NEWLINE);
		} else if (tipo == semantic.REAL) {
			generateCode(TAB + "invokevirtual java/io/PrintStream/print(F)V" + NEWLINE);
		} else if (tipo == semantic.BOOLEAN) {
			generateCode(TAB + "invokevirtual java/io/PrintStream/print(Z)V" + NEWLINE);
		} else if (tipo == semantic.STRING) {
			generateCode(TAB + "invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V" + NEWLINE);
		}
	}

	public void saveCode(String path) {
		FileOutputStream out;
		PrintStream prt;
		try {
			out = new FileOutputStream(path);
			prt = new PrintStream(out);
			prt.println(codeString);
			prt.close();
		} catch (Exception e) {
			System.out.println("Write error");
		}
	}

}
