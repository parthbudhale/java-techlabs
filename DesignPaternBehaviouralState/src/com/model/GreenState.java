package com.model;

public class GreenState implements State {

	@Override
	public void handleRequest(TrafficLight trafficLight) {
		// TODO Auto-generated method stub
		System.out.println("signal is green.lets go");
		trafficLight.setState(new RedState());
	}

}
