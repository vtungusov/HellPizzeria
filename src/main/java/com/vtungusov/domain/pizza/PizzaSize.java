package com.vtungusov.domain.pizza;

import com.vtungusov.domain.ProductSize;

public enum PizzaSize implements ProductSize {
    SMALL(25),
    MEDIUM(35),
    LARGE(45);

    private int PizzaSize;

    PizzaSize(int pizzaSize) {
        PizzaSize = pizzaSize;
    }

    public int getPizzaSize() {
        return PizzaSize;
    }
}
