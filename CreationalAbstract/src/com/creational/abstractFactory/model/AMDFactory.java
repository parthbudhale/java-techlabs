package com.creational.abstractFactory.model;


public class AMDFactory implements IAbstractFactory {

	@Override
	public ICPU createCpu() {
		
		return new AmdCpu();
	}

	@Override
	public IGPU createGpu() {
		
		return new AmdGpu();
	}

}
