import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class AnaliseSemanticaSymbolTable {

	final String GLOBAL = "global";

	HashMap<String, HashSet<Var>> variables = new HashMap<>();
	HashSet<String> types = new HashSet<>();
	HashMap<String, HashSet<Function>> functions = new HashMap<>();
	HashSet<String> classes = new HashSet<>();

	public AnaliseSemanticaSymbolTable() {
		this.variables = new HashMap<>();
		this.classes = new HashSet<>();
		this.functions = new HashMap<>();
		this.types = new HashSet<>();
		this.variables.put(GLOBAL, new HashSet<Var>());
		this.types.addAll(Arrays.asList("int", "string", "void"));
	}

	public void addFunction(String className, Function function) {
		if (classes.contains(className))
			functions.get(className).add(function);
		else {
			HashSet<Function> aux = new HashSet<>();
			aux.add(function);
			functions.put(className, aux);
		}
	}

	public boolean addVariable(Var variable) {
		if (variables.containsKey(GLOBAL)) {
			return variables.get(GLOBAL).add(variable);
		}
		HashSet<Var> aux = new HashSet<>();
		aux.add(variable);
		variables.put(GLOBAL, aux);
		return true;
	}

	public boolean addVariable(Function function, Var variable) {
		String functionName = function.getName();
		if (variables.containsKey(functionName)) {
			return variables.get(functionName).add(variable);
		}
		HashSet<Var> aux = new HashSet<>();
		aux.add(variable);
		variables.put(functionName, aux);
		return true;
	}

	public boolean addClass(String className) {
		// TODO: pensar em tratar escopo de classe, posso estar muito enganado,
		// mas creio que java possua isso.
		return classes.add(className);
	}

	public void removeVariable(Function function, Var variable) {
		variables.get(function.getName()).remove(variable);
	}

	public void removeVariable(Var variable) {
		variables.get(GLOBAL).remove(variable);
	}

	public void removeFunction(Function function) {
		functions.remove(function.getName());
	}

}
