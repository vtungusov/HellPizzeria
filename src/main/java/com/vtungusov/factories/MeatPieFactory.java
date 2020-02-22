package com.vtungusov.factories;

import com.vtungusov.domain.Product;
import com.vtungusov.domain.Type;
import com.vtungusov.domain.pie.MeatPie;
import com.vtungusov.domain.pie.PieType;
import com.vtungusov.store.order.ProductOrder;

public class MeatPieFactory implements Factory {
    @Override
    public Product create(ProductOrder productOrder) {
        MeatPie meatPie = new MeatPie();
        meatPie.createPie();
        return meatPie;
    }

    @Override
    public boolean support(Type type) {
        return type.equals(PieType.MEAT);
    }
}
