package com.model;

public class ColdCoffee extends SpecialCoffee{

	public ColdCoffee(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	public double cost() {
		return coffee.cost()+5.5;
	}

	@Override
	public String description() {
		return coffee.description()+" but Cold Coffee";
	}

}