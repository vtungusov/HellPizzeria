package com.vtungusov.store.order;

import com.vtungusov.domain.ProductType;
import com.vtungusov.domain.pie.PieType;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PieOrder pieOrder = (PieOrder) o;
        return pieType == pieOrder.pieType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pieType);
    }
}
