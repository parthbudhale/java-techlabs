package com.aurionpro.Model;

public class Bike implements IVehicle {

	@Override
	public void start() {
		System.out.println("Bike start");
		
		
	}

	@Override
	public void stop() {
		System.out.println("Bike Stops");
		
		
	}

	@Override
	public String fuelType() {
		return "Petrol";
	
		
	}

}
