package com.aurionpro;

public class ConstructorChaining extends Parent {
	private String name="null";
	private int roll = 0;
	private double percentage=0.0;
	
	public ConstructorChaining() {
		this("Parth",0);
		System.out.println("Default constructor called");
	}
	public ConstructorChaining(String name,int roll) {
		this(name,roll,0.0);
		System.out.println("Constructor with 2 parameters called");
		System.out.println("name:" +name+" "+"roll:"+roll);
	}
	public ConstructorChaining(String name,int roll,double percentage) {
		System.out.println("Constructor with 3 parameters called");
		System.out.println("name:" +name+" "+"roll:"+roll+" "+"percentage:"+percentage);
	}
	
	
	

}
