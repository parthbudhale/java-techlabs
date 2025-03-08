package com.test;

import java.util.Scanner;
import com.model.PaymentProcessor;
import com.model.PaymentProcessorFactory;

public class PaymentGatewayTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter payment method (CreditCard/PayPal/UPI) or type 'exit' to quit: ");
            String paymentMethod = scanner.nextLine();
            
            if (paymentMethod.equalsIgnoreCase("exit")) {
                System.out.println("Exiting payment gateway.");
                break;
            }

            PaymentProcessor processor = PaymentProcessorFactory.getPaymentProcessor(paymentMethod);
            
            if (processor != null) {
                System.out.print("Enter amount: ");
                double amount = scanner.nextDouble();
                scanner.nextLine(); // Consume newline left after nextDouble()

                processor.processPayment(amount);
            } else {
                System.out.println("Invalid payment method. Please try again.");
            }
        }
        
        scanner.close();
    }
}
