package com.model;

public class SimpleCoffee implements Coffee{

	@Override
	public double cost() {
		return 5.00;
	}

	@Override
	public String description() {
		return "Simple Coffee";
	}

}