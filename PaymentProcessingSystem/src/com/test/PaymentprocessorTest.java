package com.test;
import com.model.*;

public class PaymentprocessorTest {

	public static void main(String[] args) {
		System.out.println("----Welcome to Quick Pay----");
		System.out.println("");
		
		PaymentProcessor creditCard = new CreditcardPayment();
		creditCard.pay();
		
		System.out.println();
		
		PaymentProcessor paypal = new PayPalPayment();
		paypal.pay();

	}

}