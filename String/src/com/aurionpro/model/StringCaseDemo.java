package com.aurionpro.model;

public class StringCaseDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Amit");
		sb.append("parth");
		System.out.println("name:"+sb);
		
		int capacity =sb.capacity();
		System.out.println("capacity:" + capacity);
		
		char ch = sb.charAt(2);
		System.out.println("charAt method:"+ch);
		
		
	}

}

