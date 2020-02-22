package com.vtungusov.resolvers;

import com.vtungusov.factories.CheesePizzaFactory;
import com.vtungusov.factories.Factory;
import com.vtungusov.factories.PepperoniPizzaFactory;
import com.vtungusov.store.order.PizzaOrder;
import com.vtungusov.store.order.ProductOrder;

import java.util.Arrays;
import java.util.List;

public class PizzaFactoryResolver implements Resolver {
    List<Factory> factories;

    public PizzaFactoryResolver() {
        factories = Arrays.asList(
                new CheesePizzaFactory(),
                new PepperoniPizzaFactory()
        );
    }

    @Override
    public Factory resolve(ProductOrder productOrder) {
        PizzaOrder pizzaOrder = (PizzaOrder) productOrder;
        for (Factory factory : factories) {
            if (factory.support(pizzaOrder.getPizzaType())) {
                return factory;
            }
        }

        throw new IllegalStateException("Can`t find factory for " + productOrder.getType());
    }
}
