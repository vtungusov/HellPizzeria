package com.vtungusov.factories;

import com.vtungusov.domain.pizza.PepperoniPizza;
import com.vtungusov.domain.pizza.PizzaType;
import com.vtungusov.store.order.PizzaOrder;

public class PepperoniPizzaFactory implements Factory<PepperoniPizza, PizzaOrder, PizzaType> {

    @Override
    public PepperoniPizza create(PizzaOrder productOrder) {
        return new PepperoniPizza(productOrder.getPizzaSize());
    }

    @Override
    public boolean support(PizzaType type) {
        return type.equals(PizzaType.PEPPERONI);
    }
}
