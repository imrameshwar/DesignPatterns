package org.example.pattern.decorator.coffeeShopBilling.decorator;

import org.example.pattern.decorator.coffeeShopBilling.Beverage;

public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.70 + beverage.cost();
    }
}
