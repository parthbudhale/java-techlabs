package com.test;

import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		Supplier<String> greet =() -> "Good night";
		System.out.println(greet.get());
	}

}
