package org.example.pattern.adapter.paymentGatewayIntegrationSystem;

import org.example.pattern.adapter.paymentGatewayIntegrationSystem.adapter.PayPalAdapter;
import org.example.pattern.adapter.paymentGatewayIntegrationSystem.adapter.RazorpayAdapter;
import org.example.pattern.adapter.paymentGatewayIntegrationSystem.adapter.StripeAdapter;
import org.example.pattern.adapter.paymentGatewayIntegrationSystem.gateway.PaypalSDK;
import org.example.pattern.adapter.paymentGatewayIntegrationSystem.gateway.RazorpayService;
import org.example.pattern.adapter.paymentGatewayIntegrationSystem.gateway.StripeAPI;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PaymentGatwayClient {
    public static void main(String[] args) {
        // Create instances of payment processors
        PaymentProcessor razorpay = new RazorpayAdapter(new RazorpayService());
        PaymentProcessor stripe = new StripeAdapter(new StripeAPI());
        PaymentProcessor paypal = new PayPalAdapter(new PaypalSDK());

        // Process payments using different gateways
        razorpay.pay(100);
        stripe.pay(200);
        paypal.pay(300);

    }
}