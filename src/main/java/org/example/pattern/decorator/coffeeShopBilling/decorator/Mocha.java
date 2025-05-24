package org.example.pattern.decorator.coffeeShopBilling.decorator;

import org.example.pattern.decorator.coffeeShopBilling.Beverage;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
