package com.company.behavioural.strategy.test;

import com.company.behavioural.strategy.model.*;

public class PaymentTest {

    public static void main(String[] args) {
        PaymentContext creditCardPayment = new PaymentContext(new CreditCardPayment());
        creditCardPayment.makePayment(100);

        PaymentContext payPalPayment = new PaymentContext(new PayPalPayment());
        payPalPayment.makePayment(200);

        PaymentContext googlePayPayment = new PaymentContext(new GooglePayPayment());
        googlePayPayment.makePayment(300);
    }
}
