package com.creational.singleton.model;

public class DatabaseConnectionManager {
	
	private static  DatabaseConnectionManager instance;
	
	private DatabaseConnectionManager()
	{
		
	}
	
	public static DatabaseConnectionManager getInstance()
	{
		if (instance == null) {
			instance = new DatabaseConnectionManager();
		}
		return instance;
	}
	
	public void connect()
	{
		System.out.println("Database Connected");
	}
	 public void disconnect() {
	        System.out.println("Database disconnected");
	    }

}
