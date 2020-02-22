package com.vtungusov.domain.pizza;

import java.util.Arrays;

public class CheesePizza extends AbstractPizza {

    public CheesePizza(PizzaSize pizzaSize) {
        super(PizzaType.CHEESE, pizzaSize, Arrays.asList(
                PizzaIngredients.DOUGH,
                PizzaIngredients.MOZZARELLA,
                PizzaIngredients.PARMESAN,
                PizzaIngredients.ONION
        ));
    }

    @Override
    public String toString() {
        return "CheesePizza{" +
                "pizzaSize=" + pizzaSize +
                ", ingredients=" + ingredients +
                '}';
    }
}
