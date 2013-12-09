import java.util.ArrayList;

public class Function {

	private ArrayList<String> parameters = new ArrayList<>();
	private String name;

	public Function(String name, ArrayList<String> parameters) {
		this.name = name;
		this.parameters = parameters;
	}

	public String getName() {
		return this.name;
	}

	public ArrayList<String> getParameters() {
		return this.parameters;
	}

	public void addParameter(String paramater) {
		this.parameters.add(paramater);
	}

	public boolean validateParameters(ArrayList<String> parameters) {
		return this.parameters.equals(parameters);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		Function f = (Function) obj;
		if (!f.getName().equals(this.name) || !f.getParameters().equals(this.parameters))
			return false;
		return true;
	}

}