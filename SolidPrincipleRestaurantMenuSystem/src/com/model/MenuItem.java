package com.model;

public class MenuItem extends MenuComponent{
	
	public MenuItem(String name) {
        super(name);
    }

    @Override
    public void showDetails(int level) {
        System.out.println(getIndentation(level) + "- " + getName()); 
    }
}
