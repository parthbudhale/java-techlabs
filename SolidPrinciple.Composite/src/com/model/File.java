package com.model;

public class File implements FileSystemComponent {
	private String name;
	public File(String name) {
	this.name = name;

	}
	@Override
	public void showdetails() {
		// TODO Auto-generated method stub
		System.out.println("File:"+name);
		
	}
}

