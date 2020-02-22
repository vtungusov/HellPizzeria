package com.vtungusov.resolvers;

import com.vtungusov.domain.Type;
import com.vtungusov.factories.Factory;
import com.vtungusov.store.order.ProductOrder;

public interface Resolver {
    Factory resolve(ProductOrder productOrder);
}
