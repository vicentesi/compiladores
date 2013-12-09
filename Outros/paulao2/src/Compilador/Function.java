package Compilador;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Function {

	//private HashMap<String, String> variables;
	
	private Entrys header;
	
	private String returnType;
	
	public Function(String type, HashMap<String, String> args){
		//this.variables = new HashMap<String, String>();
		this.returnType = type;
		this.header = new Entrys(args);
	}
	
//	public String get_type(String name){
//		String type = " ";
//		if(this.variables.containsKey(name))
//			type = this.variables.get(name);
//		else
//			System.err.println("Variavel " + name + " não foi declarada");
//		
//		return type;
//	}
	public String get_type(String name){
		String type = "";
		type = this.header.get_type(name);
		return type;
	}
	
	public String get_returnType(){
		return this.returnType;
	}
	
//	public boolean eval_entrys(HashMap<String,String> callentrys){
//		if(this.header.number_entrys() == callentrys.size()){
//			Set<String> keys = callentrys.keySet();
//			for (String key : keys){
//				if(key != null){
//					String declaredType = this.header.get_type(key);
//					if(declaredType == null){
//						System.err.println("Chamada da funçao difere da sua declaração<1>");
//						return false;
//					}
//					else
//						if(declaredType != callentrys.get(key)){
//							System.err.println("Chamada da funçao difere da sua declaração<2>");
//							return false;						
//						}
//				}
//			}
//			return true;
//		}else{
//			System.err.println("Chamada da funçao difere da sua declaração<3>");
//			return false;
//		}
//	}
	
	public boolean eval_entrys(HashMap<String, String> callentrys){
		boolean result = false;
		if(this.header.number_entrys() == callentrys.size()){
			result = true;
			Set<String> keys = callentrys.keySet();
			for (String key : keys){
				String type = callentrys.get(key);
				result = this.header.variables.containsValue(type);
				if(!result)
					break;
			}
		}
		return result;
	}
	
}
