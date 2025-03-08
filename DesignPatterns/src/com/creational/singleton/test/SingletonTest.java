package com.creational.singleton.test;

import com.creational.singleton.model.Singleton;

public class SingletonTest {
	public static void main(String[] args) {
//		Singleton singleton1 =new Singleton();
//		singleton1.show();
//		
//		Singleton singleton2 =new Singleton();
//		singleton2.show();

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		System.out.println(obj1 == obj2);
	}

}
