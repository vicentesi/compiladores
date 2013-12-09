import java.util.HashMap;
import java.util.Set;

public class Function {

	// private HashMap<String, String> variables;

	private Entrys header;

	private String returnType;


	public Function(String type, HashMap<String, String> args) {
		// this.variables = new HashMap<String, String>();
		this.returnType = type;
		this.header = new Entrys(args);
	}

	// public String get_type(String name){
	// String type = " ";
	// if(this.variables.containsKey(name))
	// type = this.variables.get(name);
	// else
	// System.err.println("Variavel " + name + " n�o foi declarada");
	//
	// return type;
	// }

	public String get_returnType() {
		return this.returnType;
	}

	public boolean eval_entrys(HashMap<String, String> callentrys) {
		if (this.header.number_entrys() == callentrys.size()) {
			Set<String> keys = callentrys.keySet();
			int i = 0;
			for (String key : keys) {
				// System.out.println(key);
				if (key != null) {
					String declaredType = this.header.get_type_from(i);
					// System.out.println(this.header.get_type_from(i));
					if (declaredType == null) {
						System.err
								.println("Chamada da fun�ao difere da sua declara��o");
						return false;
					} else if (declaredType != callentrys.get(key)) {
						System.err
								.println("Chamada da fun�ao difere da sua declara��o");
						return false;
					}
				}
				i++;
			}
			return true;
		} else {
			System.err.println("Chamada da fun�ao difere da sua declara��o");
			return false;
		}
	}

}
