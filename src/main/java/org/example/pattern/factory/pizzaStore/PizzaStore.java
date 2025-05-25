package org.example.pattern.factory.pizzaStore;

// orderPizza method is the template method
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type); // Factory method to be implemented by subclasses
}
