package org.example.pattern.strategy.ecomPaymentSystem;

public class CreditCardPayment implements PaymentStrategy{

    @Override
    public String pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
        return "Paid " + amount + " using Credit Card.";

    }
}
