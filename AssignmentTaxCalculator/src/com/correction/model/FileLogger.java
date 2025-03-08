package com.correction.model;

public class FileLogger implements ILogger {

	@Override
	public void log(String err) {
		System.out.println("File log error"+err);
		
	}

}
