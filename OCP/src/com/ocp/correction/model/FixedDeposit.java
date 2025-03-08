package com.ocp.correction.model;

public class FixedDeposit {

	private int accountNumber;
	private String name;
	private double principal;
	private int duration;
	private IFestivalInterest interest;
	

	public FixedDeposit(int accountNumber, String name, double principal, int duration, IFestivalInterest interest) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.interest = interest;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public double calculateSimpleInterest()
	{
		double amount = (principal*duration*interest.getInterestRate())/100;
		System.out.println("Simple Interest is: "+amount);
		return amount;
	}
}

