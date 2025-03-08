package com.creational.abstractFactory.model;

public class NvindiaGpu implements IGPU {

	@Override
	public void assemble() {
		System.out.println("Nvidia GPU assembled.");
		
	}

}