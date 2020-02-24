package com.vtungusov.resolvers;

import com.vtungusov.domain.Product;
import com.vtungusov.factories.Factory;
import com.vtungusov.factories.PizzaFactory;
import com.vtungusov.store.order.ProductOrder;

import java.util.Arrays;
import java.util.List;

public class ProductFactoryResolver<RESULT, CRITERIA> implements AbstractResolver<RESULT, CRITERIA> {
    private List<Factory> factories;

    public ProductFactoryResolver() {
        this.factories = Arrays.asList(
                new PizzaFactory()
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
