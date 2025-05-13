package org.example.pattern.strategy.ecomPaymentSystem;

public class PaymentSystem {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor(new CreditCardPayment());
        paymentProcessor.processPayment(1000);

        paymentProcessor.setPaymentStrategy(new WalletPayment());
        paymentProcessor.processPayment(2000);

        paymentProcessor.setPaymentStrategy(new UpiPayment());
        paymentProcessor.processPayment(3000);
    }
}