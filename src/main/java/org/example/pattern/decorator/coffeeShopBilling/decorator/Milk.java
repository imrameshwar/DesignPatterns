package org.example.pattern.decorator.coffeeShopBilling.decorator;

import org.example.pattern.decorator.coffeeShopBilling.Beverage;

public class Milk extends CondimentDecorator{
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10; // Adding cost of milk
    }
}
