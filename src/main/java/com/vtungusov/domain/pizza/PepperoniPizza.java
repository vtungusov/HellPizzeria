package com.vtungusov.domain.pizza;

import java.util.Arrays;

public class PepperoniPizza extends AbstractPizza {

    public PepperoniPizza(PizzaSize pizzaSize) {
        super(PizzaType.PEPPERONI, pizzaSize, Arrays.asList(
                PizzaIngredients.DOUGH,
                PizzaIngredients.MOZZARELLA,
                PizzaIngredients.SAUSAGE,
                PizzaIngredients.TOMATO,
                PizzaIngredients.ONION
        ));
    }

    @Override
    public String toString() {
        return "PepperoniPizza{" +
                "pizzaSize=" + pizzaSize +
                ", ingredients=" + ingredients +
                '}';
    }
}
