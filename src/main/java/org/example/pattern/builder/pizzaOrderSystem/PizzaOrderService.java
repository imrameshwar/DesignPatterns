package org.example.pattern.builder.pizzaOrderSystem;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PizzaOrderService {
    public static void main(String[] args) {
        Pizza.PizzaBuilder pizzaBuilder = Pizza.builder();

        pizzaBuilder.size("Large")
                .crust("Thin")
                .toppings(List.of("Pepperoni", "Mushrooms", "Olives"))
                .extraCheese(true)
                .instructions("Cut into 8 slices");
        // Build the pizza object
        Pizza pizza = pizzaBuilder.build();

        System.out.println("Pizza Order Details:");
        System.out.println("Size: " + pizza.getSize());
        System.out.println("Crust: " + pizza.getCrust());
        System.out.println("Toppings: " + String.join(", ", pizza.getToppings()));
        System.out.println("Extra Cheese: " + (pizza.isExtraCheese() ? "Yes" : "No"));
        System.out.println("Instructions: " + pizza.getInstructions());

    }
}