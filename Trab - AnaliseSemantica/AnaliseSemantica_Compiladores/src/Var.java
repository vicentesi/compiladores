public class Var {
	private String id;
	private String type;

	public Var(String id, String type) {
		this.id = id;
		this.type = type;
	}

	public String getId() {
		return this.id;
	}

	public String getType() {
		return this.type;
	}

	@Override
	public boolean equals(Object object) {
		if (object == null)
			return false;
		Var var = (Var) object;
		if (!var.getId().equals(this.id))
			return false;
		if (!var.getType().equals(this.type))
			return false;
		return true;
	}
}
