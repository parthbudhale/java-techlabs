package com.model;

public class YellowState implements State {

	@Override
	public void handleRequest(TrafficLight trafficLight) {
		// TODO Auto-generated method stub
		System.out.println("Signal is Yellow.Vehicle must slow down");
		trafficLight.setState(new GreenState());
	}

}
