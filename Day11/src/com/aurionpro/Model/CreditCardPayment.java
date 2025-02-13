package com.aurionpro.Model;

public class CreditCardPayment implements Payment {

	@Override
	public void processPayment(double amount) {

		if (amount <= 0) {
			System.out.println("Invalid amount. Payment failed.");
			return;
		}
		System.out.println("Processing credit card payment of Rs." + amount);
		
		
	}
}
