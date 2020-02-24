package com.vtungusov.factories;

import com.vtungusov.domain.ProductType;
import com.vtungusov.domain.pizza.Pizza;
import com.vtungusov.resolvers.PizzaFactoryResolver;
import com.vtungusov.store.order.PizzaOrder;

public class PizzaFactory<FACTORY_RESULT extends Pizza, SUP_CRITERIA extends PizzaOrder> implements Factory<FACTORY_RESULT, SUP_CRITERIA> {
    PizzaFactoryResolver pizzaFactoryResolver;

    public PizzaFactory() {
        this.pizzaFactoryResolver = new PizzaFactoryResolver();
    }

    @Override
    public FACTORY_RESULT create(SUP_CRITERIA productOrder) {
        return pizzaFactoryResolver.resolve(productOrder.getType());
    }

    @Override
    public boolean support(SUP_CRITERIA type) {
        return type.getType().equals(ProductType.PIZZA);
    }
}