package com.model;

public class TrafficLight {

	private State currentState;

	public TrafficLight() {
		currentState = new RedState();

	}

	public void setState(State state) {
		this.currentState = state;
	}

	public void changeLight() {
		currentState.handleRequest(this);
	}

}
