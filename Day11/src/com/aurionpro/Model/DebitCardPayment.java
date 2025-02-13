package com.aurionpro.Model;

public class DebitCardPayment implements Payment {

	@Override
	public void processPayment(double amount) {
	
			if (amount <= 0) {
				System.out.println("Invalid amount. Payment failed.");
				return;
			}
			System.out.println("Processing debit card payment of Rs." + amount);
		}
	}
		
		
		
	
	
