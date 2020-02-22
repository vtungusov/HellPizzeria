package com.vtungusov.factories;

import com.vtungusov.domain.Product;
import com.vtungusov.resolvers.Supports;
import com.vtungusov.store.order.ProductOrder;

public interface Factory extends Supports {
    Product create(ProductOrder productOrder);
}
