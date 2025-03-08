package com.test;
import com.model.*;
public class CoffeeTest {
	

	public static void main(String[] args) {
		Coffee coffee = new SimpleCoffee();
		
		System.out.println("Cost: "+coffee.cost());
		System.out.println("Description: "+coffee.description());
		
		coffee = new Cappucino(coffee);
		System.out.println("Cost: "+coffee.cost());
		System.out.println("Description: "+coffee.description());
		
		coffee = new Espresso(coffee);
		System.out.println("Cost: "+coffee.cost());
		System.out.println("Description: "+coffee.description());
		
		coffee = new ColdCoffee(coffee);
		System.out.println("Cost: "+coffee.cost());
		System.out.println("Description: "+coffee.description());
	}

}