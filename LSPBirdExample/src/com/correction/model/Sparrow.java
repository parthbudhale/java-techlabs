package com.correction.model;

public class Sparrow implements IFlyable{

	@Override
	public void bodyColor() {
		System.out.println("Sparrow color is brown");
		
	}

	@Override
	public void Fly() {
		System.out.println("Sparrow is flying");
	}

}