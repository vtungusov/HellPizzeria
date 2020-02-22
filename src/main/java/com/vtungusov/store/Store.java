package com.vtungusov.store;

import com.vtungusov.domain.Product;
import com.vtungusov.store.order.Order;

import java.util.List;

public interface Store {
    List<Product> makeOrder(Order order);
}
