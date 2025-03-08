package com.model;

public class Cappucino extends SpecialCoffee {

	public Cappucino(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	public double cost() {
		return coffee.cost()+3.5;
	}

	@Override
	public String description() {
		return coffee.description()+" but Cappucino";
	}
	
}
