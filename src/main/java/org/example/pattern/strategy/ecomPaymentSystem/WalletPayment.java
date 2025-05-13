package org.example.pattern.strategy.ecomPaymentSystem;

public class WalletPayment implements PaymentStrategy{

    @Override
    public String pay(int amount) {
        System.out.println("Paid " + amount + " using Wallet.");
        return "Paid " + amount + " using Wallet.";
    }
}
