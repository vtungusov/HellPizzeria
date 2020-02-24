package com.vtungusov.resolvers;

import com.vtungusov.domain.Product;
import com.vtungusov.factories.Factory;
import com.vtungusov.store.order.ProductOrder;

import java.util.List;

public abstract class AbstractResolver<FACTORY_RESULT extends Product, SUP_CRITERIA extends ProductOrder,
        RESOLVER_RESULT extends Factory<FACTORY_RESULT, SUP_CRITERIA>,
        RESOLVER_CRITERIA extends ProductOrder>
        implements Resolver<RESOLVER_RESULT, RESOLVER_CRITERIA> {

    List<RESOLVER_RESULT> factories;

    @Override
    public RESOLVER_RESULT resolve(RESOLVER_CRITERIA productOrder) {
        for (RESOLVER_RESULT factory : factories) {
            if (factory.support(SUP_CRITERIA) {
                return factory;
            }
        }
        throw new IllegalStateException("Can`t find factory for " + productOrder.getType());
    }
}
