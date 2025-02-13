package com.aurionproModel;

public class Bank {
//	public long accountNumber;
//	public String holderName;
//	public long balance;
	
	

	public void displaybalance() {
		System.out.println("Your balance is : Rs" + balance + "/-");
		System.out.println("");
	}

	public void deposit(long l) {
		if (l < 0) {
			System.out.println("Please enter valid amount number");
			System.out.println();
		}
		long temp = l;
		balance += l;
		System.out.println("Rs" + l + "/- has been deposited.");
		System.out.println("");
	}

	public void withdraw(long l) {
		long temp = l;
		if (l < balance) {
			balance -= l;
			System.out.println("Available balance is : Rs" + balance + "/-");
			System.out.println("");
		} else {
			System.out.println("Insufficient balance");
			System.out.println("");
		}
	}
}
