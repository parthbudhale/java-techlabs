package com.model;
public class PayPalPayment extends PaymentProcessor{

	@Override
	public void processPayment() {
		System.out.println("Validating Account......");
		System.out.println("Paypal account verified. ");
		System.out.println("Processing your payment. ");
		System.out.println("Payment complete using Paypal");
		System.out.println(" ");
	}

}
