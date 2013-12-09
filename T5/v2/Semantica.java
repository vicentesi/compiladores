import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Semanticator {

	public final String INTEGER = "Integer";
	public final String REAL = "Real";
	public final String STRING = "String";
	public final String BOOLEAN = "Boolean";
	public final String VOID = "Void";

	public final String PLUS = "+";
	public final String MINUS = "-";
	public final String MULT = "*";
	public final String DIVIDE = "/";
	public final String MOD = "%";

	public final String EQUALS = "=";
	public final String DIFF = "<>";
	public final String GREATER = ">";
	public final String LESS = "<";
	public final String GREATEREQUALS = ">=";
	public final String LESSEQUALS = "<=";

	private AnalisesemanticaParser parser;

	/*
	 * Armazena as variaveis globais as variaveis globais.
	 */
	private HashMap<String, String> variables;
	private HashMap<String, Function> functions;
	private ArrayList<String> varatrib;
	private Stack<String> escope;
	private boolean function_impl;
	private String currentFunction;

	public Semanticator(AnalisesemanticaParser parser) {
		this.variables = new HashMap<String, String>();
		this.parser = parser;
		this.function_impl = false;
		this.escope = new Stack<String>();
		this.functions = new HashMap<String, Function>();
		this.varatrib = new ArrayList<String>();

	}

	public void add_variable(String name, String type) {
		if (this.variables.containsKey(name)) {
			System.err.println("Variavel " + name
					+ " declarada mais de uma vez.");
		} else {
			this.variables.put(name, type);
			if (function_impl)
				this.escope.push(name);
		}
	}

	// public void add_function(String name, String type, HashMap<String,
	// String> args){
	// if(variables.containsKey(name) || functions.containsKey(name)){
	// System.err.println("Variavel " + name + " declarada mais de um vez.");
	// }
	// else{
	// Function f = new Function(type, args, this);
	// // functions.put(name, f);
	// }
	// }

	public String get_type(String name) {
		String type = " ";
		if (variables.containsKey(name))
			type = variables.get(name);
		// else if(functions.containsKey(name))
		// type = functions.get(name).get_returnType();
		else
			System.err.println("Variavel " + name + " nao foi declarada");

		return type;
	}

	public boolean has_variable(String name) {
		if (variables.containsKey(name))
			return true;
		return false;
	}

	public boolean is_number(String type) {
		return type == this.INTEGER || type == this.REAL;
	}

	public String eval_weak_expr(String type1, String type2, String op) {
		String rtype = " ";

		if (is_number(type1) && is_number(type2)) {
			if (type1 == type2)
				rtype = type1;
			else
				rtype = this.REAL;
		} else {
			System.err.println("Operador " + op
					+ " nao suporta valores nao numericos");
		}
		return rtype;
	}

	public String eval_strong_expr(String type1, String type2, String op) {
		String rtype = " ";

		if (is_number(type1) && is_number(type2)) {
			if (op == this.MOD)
				if (type1 != this.REAL && type2 != this.REAL)
					rtype = this.INTEGER;
				else
					System.err.println("Operador " + op
							+ " nao suporta valores reais");
			else if (type1 == this.INTEGER && type2 == this.INTEGER)
				rtype = this.INTEGER;
			else
				rtype = this.REAL;
		} else {
			System.err.println("Operador " + op
					+ " nao suporta valores nao numericos");
		}

		return rtype;
	}

	public String eval_relational_expr(String type1, String type2, String op) {
		String rtype = " ";
		if (op == this.EQUALS && op == this.DIFF) {
			if (is_number(type1) && is_number(type2) || type1 == this.BOOLEAN
					&& type2 == this.BOOLEAN) {
				rtype = this.BOOLEAN;
			} else
				System.err.println("Operador " + op
						+ " nao suporta esses tipos");
		} else if (is_number(type1) && is_number(type2)) {
			rtype = this.BOOLEAN;
		} else
			System.err.println("Operador " + op
					+ " nao suporta tipos diferentes");
		return rtype;
	}

	public String eval_logic_expr(String type1, String type2, String op) {
		String rtype = " ";

		if (type1 == this.BOOLEAN && type2 == this.BOOLEAN)
			rtype = this.BOOLEAN;
		else
			System.err.println("Operador " + op
					+ " suporta somente valores booleanos");

		return rtype;
	}

	public void eval_assign(String typeTo, String typeFrom, String name) {
		String rtype = " ";

		if (typeTo != typeFrom)
			System.err.println("Atribuicao incorreta de " + typeFrom + " para "
					+ typeTo);
		else {
			this.varatrib.add(name);
		}
	}

	public boolean eval_atrib(String name) {
		boolean r = true;
		if (!varatrib.contains(name)) {
			r = false;
			System.err.println("Variavel nao possui valor atribuido. " + name
					+ " = null.");
		}
		return r;
	}

	public void open_function_decl(String type, HashMap<String, String> params,
			String name) {
		this.function_impl = true;
		Function f = new Function(type, params);
		this.functions.put(name, f);
		this.currentFunction = name;
	}

	public void close_function_decl(String type) {
		this.function_impl = false;
		String out;
		int size = this.escope.size();
		int i = 0;
		while (i < size) {
			out = this.escope.pop();
			this.variables.remove(out);
			i++;
		}
		this.escope.clear();
		/*
		 * Function f = this.functions.get(currentFunction); if(type != null)
		 * if(type != f.get_returnType())
		 * System.err.println("Tipo do retorno nao bate com a declaracao da funcao"
		 * );
		 */
		// eval_return(type);
	}

	public String eval_funccall(String name, HashMap<String, String> args) {
		String returnType = " ";
		Function f = this.functions.get(name);
		if (f != null) {
			if (f.eval_entrys(args))
				returnType = f.get_returnType();
		}
		return returnType;
	}

	public void eval_return(String type) {
		Function f = this.functions.get(currentFunction);
		if (f != null) {
			if (f.get_returnType() != null) {
				if (f.get_returnType() != type)
					System.err.println("Tipo de retorno <" + type
							+ "> incompativel com declaracao da funcao <"
							+ f.get_returnType() + ">");
			}
		}
	}
}
