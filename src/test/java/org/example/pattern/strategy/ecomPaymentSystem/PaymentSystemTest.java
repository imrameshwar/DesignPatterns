package org.example.pattern.strategy.ecomPaymentSystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentSystemTest {
    @Test
    void testCreditCardPayment() {
        PaymentProcessor paymentProcessor = new PaymentProcessor(new CreditCardPayment());
        String result = paymentProcessor.processPayment(1000);
        assertEquals("Paid 1000 using Credit Card.", result);
    }

    @Test
    void testWalletPayment() {
        PaymentProcessor paymentProcessor = new PaymentProcessor(new WalletPayment());
        String result = paymentProcessor.processPayment(2000);
        assertEquals("Paid 2000 using Wallet.", result);
    }

    @Test
    void testUpiPayment() {
        PaymentProcessor paymentProcessor = new PaymentProcessor(new UpiPayment());
        String result = paymentProcessor.processPayment(3000);
        assertEquals("Paid 3000 using UPI.", result);
    }

    @Test
    void testChangePaymentMethod() {
        PaymentProcessor paymentProcessor = new PaymentProcessor(new CreditCardPayment());
        String result = paymentProcessor.processPayment(1000);
        assertEquals("Paid 1000 using Credit Card.", result);

        paymentProcessor.setPaymentStrategy(new WalletPayment());
        result = paymentProcessor.processPayment(2000);
        assertEquals("Paid 2000 using Wallet.", result);

        paymentProcessor.setPaymentStrategy(new UpiPayment());
        result = paymentProcessor.processPayment(3000);
        assertEquals("Paid 3000 using UPI.", result);
    }
}