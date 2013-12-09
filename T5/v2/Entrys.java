import java.util.Collection;
import java.util.HashMap;

public class Entrys {
	HashMap<String, String> variables;

	public Entrys(HashMap<String, String> entrys) {
		this.variables = entrys;
	}


	public String get_type(String name) {
		return variables.get(name);
	}

	public int number_entrys() {
		return this.variables.size();
	}

	public String get_type_from(int index) {
		Collection<String> keys = this.variables.values();
		String[] k = new String[this.variables.values().size()];
		int i = 0;
		for (String key : keys) {
			k[i] = key;
			i++;
		}
		if (index < this.variables.values().size())
			return k[index];
		else
			return null;
	}
}
