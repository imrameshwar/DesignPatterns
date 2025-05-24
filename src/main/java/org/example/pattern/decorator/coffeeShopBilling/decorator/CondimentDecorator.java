package org.example.pattern.decorator.coffeeShopBilling.decorator;

import org.example.pattern.decorator.coffeeShopBilling.Beverage;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;
    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
