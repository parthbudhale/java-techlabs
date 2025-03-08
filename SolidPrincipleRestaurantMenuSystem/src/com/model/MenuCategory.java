package com.model;

import java.util.ArrayList;
import java.util.List;

public class MenuCategory extends MenuComponent {

	private List<MenuComponent> components = new ArrayList<>();

	public MenuCategory(String name) {
		super(name);
	}

	@Override
	public void add(MenuComponent component) {
		components.add(component);
	}

	@Override
	public void remove(MenuComponent component) {
		components.remove(component);
	}

	@Override
	public void showDetails(int level) {
		System.out.println(getIndentation(level) + "**" + getName());
		for (MenuComponent component : components) {
			component.showDetails(level + 1);
		}
	}

}