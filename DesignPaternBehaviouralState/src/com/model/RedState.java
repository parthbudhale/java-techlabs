package com.model;

public class RedState implements State{

	@Override
	public void handleRequest(TrafficLight trafficLight) {
		// TODO Auto-generated method stub
		System.out.println("Signal is red.Vehicle must stop");
		
		trafficLight.setState(new YellowState());
		
	}

}
