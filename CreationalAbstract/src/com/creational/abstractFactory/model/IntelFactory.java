package com.creational.abstractFactory.model;

public class IntelFactory implements IAbstractFactory {

	@Override
	public ICPU createCpu() {
		
		return new IntelCpu();
	}

	@Override
	public IGPU createGpu() {
		
		return new NvindiaGpu();
	}
	

}