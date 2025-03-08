package com.model;

public abstract class PaymentProcessor {

	public final void pay()
	{
		initializePayment();
		validateCard();
		processPayment();
		sendReceipt();
	}
	
	public void initializePayment()
	{
		System.out.println("Payment has initialized..");
		System.out.println("do not press back button");
		System.out.println("");
	}
	
	public void validateCard()
	{
		System.out.println("Enter Card/Account for validation. ");

	}
	
	public abstract void processPayment();
	
	public void sendReceipt()
	{
		System.out.println("Generating payment receipt.");
		System.out.println("---------------------------------");
	}
}