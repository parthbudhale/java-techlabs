package com.model;

public class PhoneDisplay implements IObserver {

	private float temperature;
	
	@Override
	public void update(float temperature) {
		this.temperature = temperature;
		System.out.println("PhoneDisplay: Temperature update to: " + temperature );
		
	}
	
}
