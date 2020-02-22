package com.vtungusov.domain.pie;

import java.util.Arrays;

public class FishPie extends AbstractPie {
    public FishPie() {
        super(PieType.FISH, Arrays.asList(
                PieIngredients.DOUGH,
                PieIngredients.FISH,
                PieIngredients.ONION
        ));
    }

    @Override
    public String toString() {
        return "FishPie{" +
                "pieType=" + pieType +
                ", ingredients=" + ingredients +
                '}';
    }
}
