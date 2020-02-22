package com.vtungusov.factories;

import com.vtungusov.domain.Product;
import com.vtungusov.domain.ProductType;
import com.vtungusov.domain.Type;
import com.vtungusov.resolvers.PizzaFactoryResolver;
import com.vtungusov.store.order.ProductOrder;

public class PizzaFactory implements Factory {
    PizzaFactoryResolver pizzaFactoryResolver;

    public PizzaFactory() {
        this.pizzaFactoryResolver = new PizzaFactoryResolver();
    }

    @Override
    public boolean support(Type type) {
        return type.equals(ProductType.PIZZA);
    }

    @Override
    public Product create(ProductOrder productOrder) {
        return pizzaFactoryResolver.resolve(productOrder).create(productOrder);
    }
}
