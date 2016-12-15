package model;

public class MenuItem {
	private int id;
	private String label;

	public MenuItem(String label, int id) {
		super();
		this.label = label;
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public String getLabel() {
		return this.label;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MenuItem [id=");
		builder.append(this.id);
		builder.append(", label=");
		builder.append(this.label);
		builder.append("]");
		return builder.toString();
	}
}
