package com.vtungusov.factories;

import com.vtungusov.domain.pizza.CheesePizza;
import com.vtungusov.domain.pizza.PizzaType;
import com.vtungusov.store.order.PizzaOrder;

public class CheesePizzaFactory implements Factory<CheesePizza, PizzaOrder, PizzaType> {

    @Override
    public CheesePizza create(PizzaOrder productOrder) {
        return new CheesePizza(productOrder.getPizzaSize());
    }

    @Override
    public boolean support(PizzaType type) {
        return type.equals(PizzaType.CHEESE);
    }
}
