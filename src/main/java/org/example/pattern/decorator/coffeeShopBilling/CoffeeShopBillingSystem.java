package org.example.pattern.decorator.coffeeShopBilling;

import org.example.pattern.decorator.coffeeShopBilling.decorator.Mocha;
import org.example.pattern.decorator.coffeeShopBilling.decorator.Whip;

public class CoffeeShopBillingSystem {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
