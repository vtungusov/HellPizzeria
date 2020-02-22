package com.vtungusov.store.order;

import java.util.List;

public class Order {
    private List<ProductOrder> productOrders;

    public Order(List<ProductOrder> productOrders) {
        this.productOrders = productOrders;
    }

    public List<ProductOrder> getProductOrders() {
        return productOrders;
    }
}
