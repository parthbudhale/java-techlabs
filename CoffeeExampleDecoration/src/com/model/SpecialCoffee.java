package com.model;


public class SpecialCoffee implements Coffee{
	
	public Coffee coffee;
	
	public SpecialCoffee(Coffee coffee)
	{
		this.coffee=coffee;
	}

	@Override
	public double cost() {
		return coffee.cost();
	}

	@Override
	public String description() {
		return coffee.description();
	}

}
