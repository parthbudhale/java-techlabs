package com.ISP.violation.model;

public class Robot implements IWorker {

	@Override
	public void startWork() {
		
		System.out.println("Robot stopped working");
		
	}

	@Override
	public void stopWork() {

		System.out.println("Robot is eating");
		
	}

	@Override
	public void eat() {
		
		System.out.println("Robot is eating");
		
	}

	@Override
	public void drink() {
		
		System.out.println("Robot is drinking");
		
		
	}

}
