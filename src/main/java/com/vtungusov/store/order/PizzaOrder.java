package com.vtungusov.store.order;

import com.vtungusov.domain.ProductType;
import com.vtungusov.domain.pizza.PizzaSize;
import com.vtungusov.domain.pizza.PizzaType;

public class PizzaOrder implements ProductOrder {
    private final ProductType productType = ProductType.PIZZA;
    private PizzaType pizzaType;
    private PizzaSize pizzaSize;

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public PizzaOrder(PizzaType pizzaType, PizzaSize pizzaSize) {
        this.pizzaType = pizzaType;
        this.pizzaSize = pizzaSize;
    }

    @Override
    public ProductType getType() {
        return productType;
    }
}
