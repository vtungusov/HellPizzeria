package com.vtungusov.store.order;

import com.vtungusov.domain.ProductType;
import com.vtungusov.domain.pizza.PizzaSize;
import com.vtungusov.domain.pizza.PizzaType;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PizzaOrder that = (PizzaOrder) o;
        return pizzaType == that.pizzaType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pizzaType);
    }
}
