package com.vtungusov.factories;

import com.vtungusov.domain.Product;
import com.vtungusov.domain.ProductType;
import com.vtungusov.domain.Type;
import com.vtungusov.resolvers.PieFactoryResolver;
import com.vtungusov.store.order.ProductOrder;

public class PieFactory implements Factory {
    PieFactoryResolver factoryResolver;

    public PieFactory() {
        factoryResolver = new PieFactoryResolver();
    }

    @Override
    public boolean support(Type type) {
        return type.equals(ProductType.PIE);
    }

    @Override
    public Product create(ProductOrder productOrder) {
        return factoryResolver.resolve(productOrder).create(productOrder);
    }
}
