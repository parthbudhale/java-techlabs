package com.model;

public class LightOffCommand implements Command {
	private Light light;

	public LightOffCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void Execute() {
		System.out.println("light is off");

	}
}
