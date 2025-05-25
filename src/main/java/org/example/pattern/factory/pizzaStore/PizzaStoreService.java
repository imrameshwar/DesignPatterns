package org.example.pattern.factory.pizzaStore;

public class PizzaStoreService {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza1 = nyStore.orderPizza("cheese");
        System.out.println("Ordered a " + pizza1.getName() + "\n");

        Pizza pizza2 = chicagoStore.orderPizza("veggie");
        System.out.println("Ordered a " + pizza2.getName() + "\n");

        // You can add more orders and test different pizzas

    }
}
