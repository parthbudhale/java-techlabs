package com.correction.model;

public class DBLogger implements ILogger {

	@Override
	public void log(String err) {
		// TODO Auto-generated method stub
		System.out.println("Database log error:"+err);
		
	}

}
