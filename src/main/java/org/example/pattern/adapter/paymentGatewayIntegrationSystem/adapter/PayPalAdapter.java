package org.example.pattern.adapter.paymentGatewayIntegrationSystem.adapter;

import org.example.pattern.adapter.paymentGatewayIntegrationSystem.PaymentProcessor;
import org.example.pattern.adapter.paymentGatewayIntegrationSystem.gateway.PaypalSDK;

public class PayPalAdapter implements PaymentProcessor {

    private final PaypalSDK paypalSDK;

    public PayPalAdapter(PaypalSDK paypalSDK) {
        this.paypalSDK = paypalSDK;
    }

    @Override
    public void pay(int amount) {
        // Use the PayPal SDK to process the payment
        paypalSDK.makePayment(amount * 100); // Assuming the SDK expects amount in cents
    }

}
