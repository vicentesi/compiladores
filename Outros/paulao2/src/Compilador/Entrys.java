package Compilador;

import java.util.HashMap;

public class Entrys {
	HashMap<String, String> variables;

	public Entrys(HashMap<String, String> entrys) 
	{
		this.variables = entrys;
	}

	public String get_type(String name) 
	{
		String type = "";
		if(this.variables.containsKey(name))
			type = this.variables.get(name);
		return type;
	}

	public int number_entrys() 
	{
		return this.variables.size();
	}
	
	public String get_type_from(int index)
	{
		String[] keys = (String[]) this.variables.values().toArray();
		return keys[index];
	}
}
