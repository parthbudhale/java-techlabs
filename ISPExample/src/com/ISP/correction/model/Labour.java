package com.ISP.correction.model;

public class Labour implements Worker {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Labour is eating");
		
	}

	@Override
	public void rest() {
		// TODO Auto-generated method stub
		System.out.println("Labour is resting");
		
	}

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Labour is working");
		
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Labour stopped");
		
	}

}
