package com.vtungusov.store;

import com.vtungusov.domain.Product;
import com.vtungusov.factories.Factory;
import com.vtungusov.resolvers.ProductFactoryResolver;
import com.vtungusov.store.money.CashBox;
import com.vtungusov.store.money.Money;
import com.vtungusov.store.money.MoneyType;
import com.vtungusov.store.order.Order;
import com.vtungusov.store.order.ProductOrder;

import java.util.ArrayList;
import java.util.List;

public class SimpleStore implements Store {
    private ProductFactoryResolver resolver;
    CashBox cashBox;

    public SimpleStore(MoneyType moneyType) {
        resolver = new ProductFactoryResolver();
        cashBox = new CashBox(moneyType);
    }

    @Override
    public List<Product> makeOrder(Order order) {
        List<Product> products = new ArrayList<>();

        List<ProductOrder> productOrders = order.getProductOrders();
        for (ProductOrder productOrder : productOrders) {
            Factory factory = resolver.resolve(productOrder);
            products.add(factory.create(productOrder));
        }

        return products;
    }

    @Override
    public Money calcOrder(Order order) {
        return cashBox.getInvoice(order);
    }
}
