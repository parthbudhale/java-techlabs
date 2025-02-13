package com.aurionpro.Model;

public  class Numbers implements ICalculator,ICalculator2 {
	

	int max = 10;
	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		
		return a-b;
	}
	

	@Override
	public void display() {
		System.out.println("max" +max);
		
	}

	@Override
	public int multiplication(int a, int b) {
	
		return a*b;
	}

	@Override
	public double Divide(int a, int b) {
		
		return a%b;
	}
	
	

}
