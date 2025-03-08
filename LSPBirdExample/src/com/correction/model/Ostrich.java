package com.correction.model;

public class Ostrich implements INonFlyable{

	@Override
	public void bodyColor() {
		System.out.println("Ostrich color is Hazel Brown");
		
	}

	@Override
	public void Walk() {
		System.out.println("Ostrich is walking");
		
	}

}