package com.model;

public class Espresso extends SpecialCoffee{

	public Espresso(Coffee coffee) {
		super(coffee);
	}

	@Override
	public double cost() {
		return coffee.cost()+2.5;
	}

	@Override
	public String description() {
		return coffee.description()+" but Espresso";
	}
	
}
