package org.example.pattern.factory.pizzaStore;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Cheese Pizza";
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
