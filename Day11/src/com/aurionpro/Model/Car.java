package com.aurionpro.Model;

public class Car implements IVehicle {

	@Override
	public void start() {
		System.out.println("Car Starts");
		
		
	}

	@Override
	public void stop() {
		System.out.println("Car Stops");
		
		
	}

	@Override
	public String fuelType() {
		return "Diesel or Petrol";
		
		
	}

}
