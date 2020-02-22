package com.vtungusov.store.order;

import com.vtungusov.domain.ProductType;
import com.vtungusov.domain.pie.PieType;

public class PieOrder implements ProductOrder {
    private final ProductType productType = ProductType.PIE;
    private PieType pieType;

    public PieType getPieType() {
        return pieType;
    }

    public PieOrder(PieType pieType) {
        this.pieType = pieType;
    }

    @Override
    public ProductType getType() {
        return productType;
    }
}
