package com.aurionpromodel;

public class Child extends Parent {
	int i =20;
	public void display(int i) {
		System.out.println("Parent will call:"+super.i); 
		System.out.println(i); 
		System.out.println(this.i); 
	}
	

}
