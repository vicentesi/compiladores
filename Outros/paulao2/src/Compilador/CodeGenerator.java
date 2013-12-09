package Compilador;

import java.io.FileOutputStream;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import java.util.Iterator;

public class CodeGenerator {
	private String programID;
	private String code;
	private String globalcode;
	private HashMap<String, String> operators;
	private HashMap<String, String> roperators;
	private HashMap<String, String> types; //tipos das variaveis
	private HashMap<String, String> returnTypes; //tipos dos retornos
	private HashMap<String, String> valueTypes; //tipos das constantes
//	private HashMap<String, String> storeCmd;
//	private HashMap<String, String> loadCmd;
	//private String globalFunctionCalls;
	private String context;
	private HashMap<String, ArrayList<String>> variables;
	private String M_GLOBAL;
	private Semanticator semantic;
	private int elseLCount;
	private int doneLCount;
	private int whileLCount;
	private Stack<Integer> whileNest;
	private Stack<Integer> doneNest;

	public CodeGenerator(Semanticator semantic){
		this.programID = "a_out";
		this.code = "";
		this.globalcode = "";
		this.doneLCount = 0;
		this.M_GLOBAL = "Global";
		this.semantic = semantic;
		this.operators = new HashMap<String, String>();
		this.roperators = new HashMap<String, String>();
		this.whileLCount = 0;
		this.whileNest = new Stack<Integer>();
		this.whileNest.push(0);
		this.doneNest = new Stack<Integer>();
		this.doneNest.push(0);
		this.elseLCount = 0;
		this.returnTypes = new HashMap<String, String>();
		this.types = new HashMap<String, String>();
		this.valueTypes = new HashMap<String, String>();
		this.variables = new HashMap<String, ArrayList<String>>();
		this.context = M_GLOBAL;
		//this.globalFunctionCalls = "";
		
		this.variables.put(this.M_GLOBAL, new ArrayList<String>());
		
//		this.operators.put("!=","" );
//		this.operators.put("==", "\t;Begin ==\n\t\tfcmpl\n\t\tbipush 1\n\t\tiand\n\t\tbipush 1\n\t\tixor\n\t;End ==\n");
//		this.operators.put(">","\t;Begin >\n\t\tfcmpl\n\t\tbipush 1\n\t\tiadd\n\t\tbipush 1\n\t\tishr\n\t;End >\n");
//		this.operators.put("<","\t;Begin <\n\t\tswap\n\t\tfcmpl\n\t\tbipush 1\n\t\tiadd\n\t\tbipush 1\n\t\tishr\n\t;End <\n");
//		this.operators.put(">=","\t;Begin >=\n\t\tfcmpl\n\t\tbipush 2\n\t\tixor\n\t\tbipush 3\n\t\tiadd\n\t\tbipush 2\n\t\tishr\n\t;End >=\n");
//		this.operators.put("<=", "\t;Begin <=\n\t\tfcmpl\n\t\tbipush 1\n\t\tiadd\n\t\tbipush 1\n\t\tishr\n\t\tbipush 1\n\t\tixor\n\t;End <=\n");

		this.operators.put("+", "iadd");
		this.operators.put("-", "isub");
		this.operators.put("*","imul");
		this.operators.put("/", "idiv");
		
//		this.operators.put("!=", "\tif_icmpne\n");
//		this.operators.put("==", "\tif_icmpeq\n");
//		this.operators.put(">","\tif_icmpgt\n");
//		this.operators.put("<", "\tif_icmplt\n");
//		this.operators.put(">=", "\tif_icmpge\n");
//		this.operators.put("<=", "\tif_icmple\n");		
		
		this.roperators.put("+", "fadd");
		this.roperators.put("-", "fsub");
		this.roperators.put("*","fmul");
		this.roperators.put("/", "fdiv");
		
		this.returnTypes.put("Integer","i");
		this.returnTypes.put("Real","f");
		this.returnTypes.put("String","a");
		this.returnTypes.put("Boolean","i");
		this.returnTypes.put("Void","");
		
		this.types.put("Integer","I");
		this.types.put("Real","F");
		this.types.put("String","Ljava/lang/String;");
		this.types.put("Boolean","B");
		this.types.put("Void","V");

//		this.storeCmd.put("Integer", "\tldc 0\n\tistore");
//		this.storeCmd.put("Real","\tldc 0.0\n\tfstore" );
//		this.storeCmd.put("Boolean","\tbipush 1\n\tistore");
//		
//		this.loadCmd.put("Integer", "\tldc 0\n\tistore");
//		this.loadCmd.put("Real","\tldc 0.0\n\tfstore" );
//		this.loadCmd.put("Boolean","\tbipush 1\n\tistore");
		
		this.pushHeader();
	}
	
	public void pushHeader(){
		String header = "";
		header +="; Codigo Monty gerado para Jasmin"+this.newline();
		header +=".class public " + this.programID + this.newline();
		header +=".super java/lang/Object"+this.newline();
		header +=".method public <init>()V"+this.newline();
		header +=this.tab()+"aload_0"+this.newline();
		header +=this.tab()+"invokenonvirtual java/lang/Object/<init>()V"+this.newline();
		header +=this.tab()+"return"+this.newline();
		header +=".end method"+this.newline();
		
		this.pushDirect(header);
	}
	
	public void pushDirect(String codepart){
		this.code += codepart;
	}
	
	public void pushCode(String codepart){
		if(this.context.equals(this.M_GLOBAL))
			this.globalcode += codepart;
		else
			this.code += codepart;
	}
	
	public void pushConstant(String value){
		this.pushCode(this.tab() + "ldc " + value + this.newline());
	}
	
	public void pushBoolean(String bool)
	{
		if (bool.equals(semantic.TRUE)){
			this.pushCode(this.tab() + "bipush 1" + this.newline());
		}else if (bool.equals(semantic.FALSE)){
			this.pushCode(this.tab() + "bipush 0" + this.newline());
		}
	}
	
	public void pushOperator(String op, String type){
		if(type.equals("Integer"))
			this.pushCode(this.tab() + this.operators.get(op) + this.newline());
		else
			this.pushCode(this.tab() + this.roperators.get(op) + this.newline());
	}

	public void pushValue(String value){
		this.pushCode(this.valueTypes.get(value));
	}
	
	public void pushUnary(String operador, String tipo)
	{
		if (tipo == semantic.INTEGER){
			//if (operador.equals(semantic.MINUS)){
				this.pushCode(this.tab() + "ldc -1" + this.newline());
				this.pushCode(this.tab() + "imul" + this.newline());
			//}
		}else if (tipo == semantic.REAL){
			//if (operador.equals(semantic.MINUS)){
				this.pushCode(this.tab() + "ldc -1.0" + this.newline());
				this.pushCode(this.tab() + "fmul" + this.newline());
			//}
		}else if (tipo == semantic.BOOLEAN){
			this.pushCode(this.tab() + "" + this.newline());
			this.pushCode(this.tab() + "fmul" + this.newline());
		}
	}
	
	public void addVariable(String name, String tipo)
	{
		String varName = name;
		ArrayList<String> temp = this.variables.get(this.context);
		int varId = temp.size();
		temp.add(varId, varName);
	
		if (tipo.equals(semantic.BOOLEAN)){
			this.pushCode(this.tab() + "bipush 1" + this.newline());
			this.pushCode(this.tab() + "istore " + varId + this.tab() + "; " + varName + this.newline());
		}else if (tipo.equals(semantic.INTEGER)){
			this.pushCode(this.tab() + "ldc 0" + this.newline());
			this.pushCode(this.tab() + "istore " + varId + this.tab() + "; " + varName + this.newline());
		}else if (tipo.equals(semantic.REAL)){
			this.pushCode(this.tab() + "ldc 0.0" + this.newline());
			this.pushCode(this.tab() + "fstore " + varId + this.tab() + "; " + varName + this.newline());
		}else if (tipo.equals(semantic.STRING)){
			this.pushCode(this.tab() + "ldc \"\"" + this.newline());
			this.pushCode(this.tab() + "astore " + varId + this.tab() + "; " + varName + this.newline());
		}
	}
	
	public void loadVariable(String name, String tipo)
	{
		ArrayList<String> temp = this.variables.get(this.context);
		int varId = temp.indexOf(name);
		if (varId == -1){
			System.err.println("Erro!!");
			System.exit(0);
		}
		if (tipo.equals(semantic.BOOLEAN)){
			this.pushCode(this.tab() + "iload " + varId + this.tab() + "; " + name + this.newline());
		}else if (tipo.equals(semantic.INTEGER)){
			this.pushCode(this.tab() + "iload " + varId + this.tab() + "; " + name + this.newline());
		}else if (tipo.equals(semantic.REAL)){
			this.pushCode(this.tab() + "fload " + varId + this.tab() + "; " + name + this.newline());
		}else if (tipo.equals(semantic.STRING)){
			this.pushCode(this.tab() + "aload " + varId + this.tab() + "; " + name + this.newline());
		}
	}
	
	public void storeVariable(String name, String tipo)
	{
		ArrayList<String> temp = this.variables.get(this.context);
		int varId = temp.indexOf(name);
		if (varId == -1){
			System.err.println("Erro!!");
			System.exit(0);
		}
		if (tipo.equals(semantic.BOOLEAN)){
			this.pushCode(this.tab() + "istore " + varId + this.tab() + "; " + name + this.newline());
		}else if (tipo.equals(semantic.INTEGER)){
			this.pushCode(this.tab() + "istore " + varId + this.tab() + "; " + name + this.newline());
		}else if (tipo.equals(semantic.REAL)){
			this.pushCode(this.tab() + "fstore " + varId + this.tab() + "; " + name + this.newline());
		}else if (tipo.equals(semantic.STRING)){
			this.pushCode(this.tab() + "astore " + varId + this.tab() + "; " + name + this.newline());
		}
	}
	
	public void pushWhile(String type, String op)
	{
		this.pushIf(type, op, "Done");
	}	
	
	public void pushWhileLabel()
	{
		this.pushCode("While" + this.whileLCount + ":" + this.newline());
		this.whileNest.push(this.whileLCount);		
		this.whileLCount++;
	}
	
	public int popLabel(String label){
		int result = 0;
		if(label.equals("While"))
			result = this.whileNest.pop();
		else if(label.equals("Done"))
			result = this.doneNest.pop();
		return result;
	}

	
	public void pushIf(String type, String op, String lb){
		String label="";
		if(type.equals(semantic.INTEGER)){
			if(lb.equals("Else"))
				label = " " + lb + this.elseLCount;
			else if(lb.equals("Done"))
				label = " " + lb + this.doneLCount;
			this.pushCode(this.tab() + "isub" + this.newline());
			if(op.equals(semantic.DIFF))
				this.pushCode(this.tab() + "ifeq" + label + this.newline());
			else if (op.equals(semantic.EQUALS))
				this.pushCode(this.tab() + "ifne" + label + this.newline());
			else if (op.equals(semantic.GREATER))
				this.pushCode(this.tab() + "ifle" + label + this.newline());
			else if (op.equals(semantic.LESS))
				this.pushCode(this.tab() + "ifge" + label + this.newline());
			else if (op.equals(semantic.GREATEREQUALS))
				this.pushCode(this.tab() + "iflt" + label + this.newline());
			else if (op.equals(semantic.LESSEQUALS))
				this.pushCode(this.tab() + "ifgt" + label + this.newline());
		}		
	}
	
	public void pushElseLabel(){
		this.pushCode("Else" + this.elseLCount + ":" + this.newline());
		this.elseLCount++;	
	}
	
	public void pushGotoLabel(String typeL)
	{
		this.pushCode(this.tab() + "goto " + typeL + this.newline());
	}
		
	public void pushDoneLabel()
	{
		this.pushCode("Done" + this.doneLCount + ":" + this.newline());
		this.doneNest.push(this.doneLCount);
		this.doneLCount++;
	}
		
	public void pushFunction(String def, HashMap<String, String> params, String type){
		this.context=def;
		String returnType;
		String parameters="";
		returnType = this.types.get(type);
		Iterator<String> it = params.keySet().iterator();
		ArrayList<String> vars = new ArrayList<String>();
		while(it.hasNext()){
			String nameVar = it.next();
			vars.add(nameVar);
			String typeVar = params.get(nameVar);
			parameters += this.types.get(typeVar);
		}
		this.variables.put(def, vars);
		this.pushCode(".method public static " + def + "(" + parameters + ")"+returnType + this.newline());
		this.pushCode(".limit locals 40" + this.newline());
		this.pushCode(".limit stack 20" + this.newline());
	}
	
	public void pushEnd(String type){
		String returnType = this.returnTypes.get(type);
		this.pushCode(this.tab() + returnType + "return" + this.newline());
		this.pushCode(".end method" + this.newline() + this.newline());
		this.context = "Global";
	}

	public void pushFunctionCall(String def, HashMap<String, String> args, String type){
		String returnType;
		String arguments="";
		returnType = this.types.get(type);
		Iterator<String> it = args.keySet().iterator();
		String functionCall = "";
		
		while(it.hasNext()){
			String nameVar = it.next();
			String typeVar = args.get(nameVar);
			arguments += this.types.get(typeVar);
		}
		
		functionCall = (this.tab() + "invokestatic " + this.programID + "/" + def + 
				"(" + arguments + ")" + returnType + this.newline());
		
		this.pushCode(functionCall);
			
	}

	public void virtualizeMain(){
		this.pushDirect(".method public static main([Ljava/lang/String;)V" + this.newline());
		this.pushDirect(".limit locals 40" + this.newline());
		this.pushDirect(".limit stack 20" + this.newline());
		
		this.pushDirect(this.globalcode);
		
		this.pushDirect(this.tab() + "return" + this.newline());
		this.pushDirect(".end method" + this.newline());
		this.pushDirect(this.newline());
	}
	
	public void pushPrint()
	{
		this.pushCode(this.tab() + "getstatic java/lang/System/out Ljava/io/PrintStream;" + this.newline());
	}

	public void pushInvokePrint(String tipo)
	{
		if (tipo == semantic.INTEGER){
			this.pushCode(this.tab() + "invokevirtual java/io/PrintStream/println(I)V" + this.newline());
		}else if (tipo == semantic.REAL){
			this.pushCode(this.tab() + "invokevirtual java/io/PrintStream/println(F)V" + this.newline());
		}else if (tipo == semantic.BOOLEAN){
			this.pushCode(this.tab() + "invokevirtual java/io/PrintStream/println(Z)V" + this.newline());
		}else if (tipo == semantic.STRING){
			this.pushCode(this.tab() + "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V" + this.newline());
		}
	}
	
	private String tab() {
		return "\t";
	}
	
	public String newline(){
		return "\n";
	}

	public void saveCode()
	{
		FileOutputStream out;
        PrintStream prt;
        try {
            out = new FileOutputStream(this.programID + ".j");
            prt = new PrintStream(out);
            prt.println(this.code);
            prt.close();
        } catch(Exception e) {
            System.out.println("Write error");
        }
	}
	
	public String getProgramID(){
		return this.programID;
	}

}
