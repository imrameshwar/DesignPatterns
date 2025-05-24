package org.example.pattern.builder.pizzaOrderSystem;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@SuppressWarnings("unused")
@Data
public class Pizza {
    private final String size;
    private final String crust;
    private final List<String> toppings;
    private final boolean extraCheese;
    private final String instructions;

}
