package com.vtungusov.factories;

import com.vtungusov.domain.Product;
import com.vtungusov.domain.ProductType;
import com.vtungusov.domain.Type;
import com.vtungusov.domain.pizza.PepperoniPizza;
import com.vtungusov.domain.pizza.PizzaType;
import com.vtungusov.store.order.PizzaOrder;
import com.vtungusov.store.order.ProductOrder;

public class PepperoniPizzaFactory implements Factory {

    @Override
    public boolean support(Type type) {
        return type.equals(PizzaType.PEPPERONI);
    }

    @Override
    public Product create(ProductOrder productOrder) {
        if (productOrder.getType().equals(ProductType.PIZZA)) {
            PizzaOrder pizzaOrder = (PizzaOrder) productOrder;
            return new PepperoniPizza(pizzaOrder.getPizzaSize());
        }
        throw new IllegalStateException("Can`t find factory for " + productOrder.getType());
    }
}
