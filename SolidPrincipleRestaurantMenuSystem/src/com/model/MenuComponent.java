package com.model;

public abstract class MenuComponent {
	private String name;

	public MenuComponent(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void add(MenuComponent component) {
		throw new UnsupportedOperationException("Cannot add to a MenuItem");
	}

	public void remove(MenuComponent component) {
		throw new UnsupportedOperationException("Cannot remove from a MenuItem");
	}

	public abstract void showDetails(int level);

	protected String getIndentation(int level) {
		StringBuilder indent = new StringBuilder();
		for (int i = 0; i < level; i++) {
			indent.append("  ");
		}
		return indent.toString();
	}

}
