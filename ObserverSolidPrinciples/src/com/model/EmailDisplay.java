package com.model;

public class EmailDisplay implements IObserver {

	private float temperature;
	
	@Override
	public void update(float temperature) {
		this.temperature = temperature;
		System.out.println("EmailDisplay: Temperature update to: " + temperature );
		
	}
	
}