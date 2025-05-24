package org.example.pattern.decorator.coffeeShopBilling;

public class HouseBlend extends Beverage{
    @Override
    public String getDescription() {
        return "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
