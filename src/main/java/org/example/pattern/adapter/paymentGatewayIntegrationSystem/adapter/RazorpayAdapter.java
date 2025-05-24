package org.example.pattern.adapter.paymentGatewayIntegrationSystem.adapter;

import org.example.pattern.adapter.paymentGatewayIntegrationSystem.PaymentProcessor;
import org.example.pattern.adapter.paymentGatewayIntegrationSystem.gateway.RazorpayService;

public class RazorpayAdapter implements PaymentProcessor {
    private final RazorpayService razorpayService;

    public RazorpayAdapter(RazorpayService razorpayService) {
        this.razorpayService = razorpayService;
    }

    @Override
    public void pay(int amount) {
        // Use the Razorpay service to process the payment
        razorpayService.initiatePayment(amount * 100); // Assuming the service expects amount in paise (1/100 of a rupee)
    }
}
