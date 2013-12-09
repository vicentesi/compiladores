package Compilador;

import java.util.HashMap;
import java.util.Set;
import java.util.Stack;

public class Semantico {

	public final String INTEGER = "Integer";
	public final String REAL = "Real";
	public final String STRING = "String";
	public final String BOOLEAN = "Boolean";
	public final String VOID = "Void";
	public final String TRUE = "True";
	public final String FALSE = "False";

	public final String PLUS = "+";
	public final String MINUS = "-";
	public final String MULT = "*";
	public final String DIVIDE = "/";
	public final String MOD = "%";

	public final String EQUALS = "==";
	public final String DIFF = "<>";
	public final String GREATER = ">";
	public final String LESS = "<";
	public final String GREATEREQUALS = ">=";
	public final String LESSEQUALS = "<=";

	public final String GLOBAL = "Global";

	private final gramaParser parser;

	private final HashMap<String, String> variables;
	private final HashMap<String, Function> functions;
	private final Stack<String> escope;
	private boolean function_impl;
	private String currentFunction;

	public class Entrys {
		HashMap<String, String> variables;

		public Entrys(HashMap<String, String> entrys) {
			variables = entrys;
		}

		public String get_type(String name) {
			String type = "";
			if (variables.containsKey(name)) {
				type = variables.get(name);
			}
			return type;
		}

		public int number_entrys() {
			return variables.size();
		}

		public String get_type_from(int index) {
			String[] keys = (String[]) variables.values().toArray();
			return keys[index];
		}
	}

	public class Function {

		private final Entrys header;

		private final String returnType;

		public Function(String type, HashMap<String, String> args) {
			// this.variables = new HashMap<String, String>();
			returnType = type;
			header = new Entrys(args);
		}

		public String get_type(String name) {
			String type = "";
			type = header.get_type(name);
			return type;
		}

		public String get_returnType() {
			return returnType;
		}

		public boolean eval_entrys(HashMap<String, String> callentrys) {
			boolean result = false;
			if (header.number_entrys() == callentrys.size()) {
				result = true;
				Set<String> keys = callentrys.keySet();
				for (String key : keys) {
					String type = callentrys.get(key);
					result = header.variables.containsValue(type);
					if (!result) {
						break;
					}
				}
			}
			return result;
		}

	}

	public Semantico(gramaParser parser) {
		variables = new HashMap<String, String>();
		this.parser = parser;
		function_impl = false;
		escope = new Stack<String>();
		functions = new HashMap<String, Function>();
	}

	public void add_variable(String name, String type, int line) {
		if (variables.containsKey(name)) {
			System.err.println("LINHA: " + line + " - " + "Variável " + name + " declarada mais de um vez.");
		} else {
			variables.put(name, type);
			if (function_impl) {
				escope.push(name);
			}
		}
	}

	public String get_type(String name) {
		return this.get_type(name, 0);
	}

	public String get_type(String name, int line) {
		String type = " ";
		if (variables.containsKey(name)) {
			type = variables.get(name);
		} else {

			System.err.println("LINHA: " + line + " - " + "Variável " + name + " não foi declarada");
		}
		return type;
	}

	public boolean has_variable(String name) {
		if (variables.containsKey(name)) {
			return true;
		}
		return false;
	}

	public boolean is_number(String type) {
		return (type == INTEGER) || (type == REAL);
	}

	public String eval_weak_expr(String type1, String type2, String op, int line) {
		String rtype = " ";

		if (is_number(type1) && is_number(type2)) {
			if (type1 == type2) {
				rtype = type1;
			} else {
				rtype = REAL;
			}
		} else {
			System.err.println("LINHA: " + line + " - " + "Operador " + op + " não suporta valores não numéricos");
		}
		return rtype;
	}

	public String eval_strong_expr(String type1, String type2, String op) {
		String rtype = " ";

		if (is_number(type1) && is_number(type2)) {
			if (op == MOD) {
				if ((type1 != REAL) && (type2 != REAL)) {
					rtype = INTEGER;
				} else {
					System.err.println("Operador " + op + " não suporta valores reais");
				}
			} else if ((type1 == INTEGER) && (type2 == INTEGER)) {
				rtype = INTEGER;
			} else {
				rtype = REAL;
			}
		} else {
			System.err.println("Operador " + op + " não suporta valores não numéricos");
		}

		return rtype;
	}

	public String eval_relational_expr(String type1, String type2, String op, int line) {
		String rtype = " ";
		if ((op == EQUALS) && (op == DIFF)) {
			if ((is_number(type1) && is_number(type2)) || ((type1 == BOOLEAN) && (type2 == BOOLEAN))) {
				rtype = BOOLEAN;
			} else {
				System.err.println("LINHA: " + line + " - " + "Operador " + op + " não suporta esses tipos");
			}
		} else if (is_number(type1) && is_number(type2)) {
			rtype = BOOLEAN;
		} else {
			System.err.println("LINHA: " + line + " - " + "Operador " + op + " não suporta tipos diferentes");
		}

		return rtype;
	}

	public String eval_logic_expr(String type1, String type2, String op, int line) {
		String rtype = " ";

		if ((type1 == BOOLEAN) && (type2 == BOOLEAN)) {
			rtype = BOOLEAN;
		} else {
			System.err.println("LINHA: " + line + " - " + "Operador " + op + " suporta somente valores booleanos");
		}

		return rtype;
	}

	public void eval_assign(String typeTo, String typeFrom, int line) {
		String rtype = " ";

		if (typeTo != typeFrom) {
			System.err.println("LINHA: " + line + " - " + "Atribuição incorreta de " + typeFrom + " para " + typeTo);
		}
	}

	public void open_function_decl(String type, HashMap<String, String> params, String name, int line) {
		function_impl = true;
		Function f = new Function(type, params);
		functions.put(name, f);
		currentFunction = name;
	}

	public void close_function_decl(String type) {
		function_impl = false;
		String out;
		int size = escope.size();
		int i = 0;
		while (i < size) {
			out = escope.pop();
			variables.remove(out);
			i++;
		}
		escope.clear();
		Function f = functions.get(currentFunction);
		if (type != null) {
			if (type != f.get_returnType()) {
				System.err.println("Tipo do retorno não bate com a declaraçãoo da função");
			}
		}
	}

	public String eval_funccall(String name, HashMap<String, String> args, int line) {
		String returnType = " ";
		Function f = functions.get(name);
		if (f != null) {
			if (f.eval_entrys(args)) {
				returnType = f.get_returnType();
			}
		}
		return returnType;
	}

	public void eval_return(String type, String name) {
		Function f = functions.get(name);
		if (f != null) {
			if (f.get_returnType() != type) {
				System.err.println("Tipo de retorno<" + type + "> incompatível com declaração da função <"
						+ f.get_returnType() + ">");
			}
		}
	}
}
