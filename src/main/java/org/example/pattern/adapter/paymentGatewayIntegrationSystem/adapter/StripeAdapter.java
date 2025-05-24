package org.example.pattern.adapter.paymentGatewayIntegrationSystem.adapter;

import org.example.pattern.adapter.paymentGatewayIntegrationSystem.PaymentProcessor;
import org.example.pattern.adapter.paymentGatewayIntegrationSystem.gateway.StripeAPI;

public class StripeAdapter implements PaymentProcessor {

    private final StripeAPI stripeAPI;
    public StripeAdapter(StripeAPI stripeAPI) {
        this.stripeAPI = stripeAPI;
    }
    @Override
    public void pay(int amount) {
        // Use the Stripe API to process the payment
        stripeAPI.processPayment(amount); // Assuming the API expects amount in dollars
    }

}
