package com.vtungusov.resolvers;

import com.vtungusov.domain.Type;
import com.vtungusov.factories.CheesePizzaFactory;
import com.vtungusov.factories.PepperoniPizzaFactory;
import com.vtungusov.factories.PizzaFactory;
import com.vtungusov.store.order.PizzaOrder;

import java.util.Arrays;
import java.util.List;

public class PizzaFactoryResolver<SUP_CRITERIA extends Type, RESOLVER_RESULT extends PizzaFactory<RESOLVER_RESULT, SUP_CRITERIA>, RES_CRITERIA extends PizzaOrder> implements Resolver<RESOLVER_RESULT, RES_CRITERIA> {
    List<RESOLVER_RESULT> factories;

    public PizzaFactoryResolver() {
        factories = Arrays.asList(
                new CheesePizzaFactory(),
                new PepperoniPizzaFactory()
        );
    }

    @Override
    public RESOLVER_RESULT resolve(RES_CRITERIA productOrder) {
        for (RESOLVER_RESULT factory : factories) {
            factory.support(productOrder.getPizzaType()){
                return factory;
            }
        }
        return ;
    }
}
