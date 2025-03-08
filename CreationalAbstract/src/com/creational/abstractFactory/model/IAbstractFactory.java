package com.creational.abstractFactory.model;

public interface IAbstractFactory {
	ICPU createCpu();
	IGPU createGpu();

}
