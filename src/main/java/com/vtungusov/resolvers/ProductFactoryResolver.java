package com.vtungusov.resolvers;

import com.vtungusov.factories.Factory;
import com.vtungusov.factories.PieFactory;
import com.vtungusov.factories.PizzaFactory;
import com.vtungusov.store.order.ProductOrder;

import java.util.Arrays;
import java.util.List;

public class ProductFactoryResolver implements Resolver {
    private List<Factory> factories;

    public ProductFactoryResolver() {
        this.factories = Arrays.asList(
                new PizzaFactory(),
                new PieFactory()
        );
    }

    @Override
    public Factory resolve(ProductOrder productOrder) {
        for (Factory factory : factories) {
            if (factory.support(productOrder.getType())) {
                return factory;
            }
        }
        throw new IllegalStateException("Can`t find factory for " + productOrder.getType());
    }
}
