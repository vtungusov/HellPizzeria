package com.vtungusov.factories;

import com.vtungusov.domain.Product;
import com.vtungusov.domain.Type;
import com.vtungusov.domain.pie.FishPie;
import com.vtungusov.domain.pie.PieType;
import com.vtungusov.store.order.ProductOrder;

public class FishPieFactory implements Factory {
    @Override
    public Product create(ProductOrder productOrder) {
        FishPie fishPie = new FishPie();
        fishPie.createPie();
        return fishPie;
    }

    @Override
    public boolean support(Type type) {
        return type.equals(PieType.FISH);
    }
}
