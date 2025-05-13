package org.example.pattern.strategy.ecomPaymentSystem;

public class UpiPayment implements PaymentStrategy{

    @Override
    public String pay(int amount) {
        System.out.println("Paid " + amount + " using UPI.");
        return "Paid " + amount + " using UPI.";
    }
}
