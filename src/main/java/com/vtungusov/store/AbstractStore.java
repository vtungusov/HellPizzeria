package com.vtungusov.store;

import com.vtungusov.resolvers.ProductFactoryResolver;

public abstract class AbstractStore implements Store {
    ProductFactoryResolver resolver;

    public AbstractStore() {
        this.resolver = new ProductFactoryResolver();
    }
}
