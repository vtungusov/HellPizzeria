package com.vtungusov.resolvers;

import com.vtungusov.factories.Factory;
import com.vtungusov.factories.FishPieFactory;
import com.vtungusov.factories.MeatPieFactory;
import com.vtungusov.store.order.PieOrder;
import com.vtungusov.store.order.ProductOrder;

import java.util.Arrays;
import java.util.List;

public class PieFactoryResolver implements Resolver {
    List<Factory> factories;

    public PieFactoryResolver() {
        this.factories = Arrays.asList(
                new FishPieFactory(),
                new MeatPieFactory()
        );
    }

    @Override
    public Factory resolve(ProductOrder productOrder) {
        PieOrder pieOrder = (PieOrder) productOrder;
        for (Factory factory : factories) {
            if (factory.support(pieOrder.getPieType()))
                return factory;
        }
        throw new IllegalStateException("Can`t find factory for " + pieOrder.getType());
    }
}
