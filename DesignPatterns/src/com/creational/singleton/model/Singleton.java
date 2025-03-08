package com.creational.singleton.model;

public class Singleton {

	private static Singleton instance; // make instance static

	private Singleton() { // do private
//		System.out.println("in singleton");
	}

	public static Singleton getInstance() // get instance
	{
		if (instance == null) {
			instance = new Singleton(); // apply validation
		}

		return instance;
	}

	public void show() {
		System.out.println("in singleton show");
	}

}
