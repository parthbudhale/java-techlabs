package com.model;

public class PaymentProcessorFactory {
    public static PaymentProcessor getPaymentProcessor(String type) {
        if (type.equalsIgnoreCase("CreditCard")) {
            return new CreditCardProcessor();
        } else if (type.equalsIgnoreCase("PayPal")) {
            return new PayPalProcessor();
        } else if (type.equalsIgnoreCase("UPI")) {
            return new UPIProcessor();
        }
        return null;
    }
}
