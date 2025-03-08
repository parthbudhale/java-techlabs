package com.correction.model;

public class Duck implements INonFlyable,ISwimmable{

	@Override
	public void bodyColor() {
		System.out.println("Duck color is brown and green");
		
	}

	@Override
	public void Swim() {
		System.out.println("Duck is swimming");
		
	}

	@Override
	public void Walk() {
		System.out.println("Duck is Walking");
		
	}

}