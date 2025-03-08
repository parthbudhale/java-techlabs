package com.creational.abstractFactory.model;

public class AmdGpu implements IGPU {

	@Override
	public void assemble() {
		System.out.println("AMD GPU assembled.");
		
	}

}
