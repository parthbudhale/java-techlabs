package com.aurionpro.Test;
import java.util.Scanner;
import com.aurionpro.Model.Payment;
import com.aurionpro.Model.CreditCardPayment;
import com.aurionpro.Model.DebitCardPayment;
import com.aurionpro.Model.UpiPayment;

class PaymentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuePayment = true; // Control variable for the loop

        while (continuePayment) {
        
        System.out.println("Select Payment Method: 1. Credit Card  2. Debit Card  3. UPI");
        int choice = scanner.nextInt();
        
        System.out.print("Enter amount to pay: ");
        double amount = scanner.nextDouble();
        
      //  Payment paymentMethod = new CreditCardPayment();
        Payment paymentMethod;
        
        
        
        switch (choice) {
            case 1:
            	paymentMethod = new CreditCardPayment();
                break;
            case 2:
            	paymentMethod = new DebitCardPayment();
                break;
            case 3:
            	paymentMethod = new UpiPayment();
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                return;
        }
        
       paymentMethod.processPayment(amount);
        }
        scanner.close();
    }
}

