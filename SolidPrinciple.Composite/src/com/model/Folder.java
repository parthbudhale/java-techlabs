package com.model;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {
	private String name;
	private List<FileSystemComponent> components = new ArrayList<>();
	
	public Folder(String name)
	{
		String name2 = this.name;
	}
	public void addComponent(FileSystemComponent component) {
		components.add(component);
		
	}
	public void removeComponent(FileSystemComponent component) {
		components.remove(component);
	}
	@Override
	public void showdetails() {
		// TODO Auto-generated method stub
		System.out.println("Folder:"+name);
		for(FileSystemComponent component:components) {
		component.showdetails();	
		}
	}
}
