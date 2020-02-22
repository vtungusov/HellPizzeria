package com.vtungusov.domain.pie;

import java.util.Arrays;

public class MeatPie extends AbstractPie {

    public MeatPie() {
        super(PieType.MEAT, Arrays.asList(
                PieIngredients.DOUGH,
                PieIngredients.MEAT,
                PieIngredients.ONION
        ));
    }

    @Override
    public String toString() {
        return "MeatPie{" +
                "pieType=" + pieType +
                ", ingredients=" + ingredients +
                '}';
    }
}
