package org.example.pattern.factory.pizzaStore;

public class ChicagoStyleVeggiePizza extends Pizza{
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Veggie Pizza";
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
