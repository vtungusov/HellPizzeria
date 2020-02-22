package com.vtungusov.factories;

import com.vtungusov.domain.Product;
import com.vtungusov.domain.ProductType;
import com.vtungusov.domain.Type;
import com.vtungusov.domain.pizza.CheesePizza;
import com.vtungusov.domain.pizza.PizzaType;
import com.vtungusov.store.order.PizzaOrder;
import com.vtungusov.store.order.ProductOrder;

public class CheesePizzaFactory implements Factory {

    @Override
    public boolean support(Type type) {
        return type.equals(PizzaType.CHEESE);
    }

    @Override
    public Product create(ProductOrder productOrder) {
        if (productOrder.getType().equals(ProductType.PIZZA)) {
            PizzaOrder pizzaOrder = (PizzaOrder) productOrder;
            return new CheesePizza(pizzaOrder.getPizzaSize());
        }
        throw new IllegalStateException("Can`t create product for " + productOrder.getType());
    }
}
