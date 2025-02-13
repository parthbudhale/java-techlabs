package com.aurionpro;

import java.lang.reflect.*;

public class PersonReflection  {
	String name;
	int RollNo;
	double weight;

	public PersonReflection() {

	}

	public PersonReflection(String name, int RollNo, double weight) {
		this.name = name;
		this.RollNo = RollNo;
		this.weight = weight;

	}

	public void displayDetails() {

	}

	public void displayNumber() {

	}

	public static void main(String[] args) throws ClassNotFoundException {
		// Method1 --> getClass();
		ConstructorChaining Person = new ConstructorChaining();
		
		

		// Method2 -->Class()
		Class c2 = Person.getClass();
		System.out.println(c2.getClass());
		System.out.println("Super class"+c2.getSuperclass());

		// Method 3 --forName();
//		Class c3 = Class.forName("package com.aurionpro;");
//		System.out.println(c3);

		System.out.println();

		System.out.println("Print method name");

		Method method[] = c2.getDeclaredMethods();
		for (Method m : method) {
			System.out.println("method:" + m.getName());
		}
		System.out.println();

	}

}
