package com.vtungusov.domain.pie;

import java.util.List;

public class AbstractPie implements Pie {
    PieType pieType;
    List<PieIngredients> ingredients;

    public AbstractPie(PieType pieType, List<PieIngredients> ingredients) {
        this.pieType = pieType;
        this.ingredients = ingredients;
    }

    public void createPie() {
        prepare();
        bake();
        box();
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + pieType + " pie");
    }

    @Override
    public void bake() {
        System.out.println("Baking " + pieType + " pie");
    }

    @Override
    public void box() {
        System.out.println("Boxing " + pieType + " pie");
    }
}
