package com.vtungusov.domain.pizza;

import java.util.List;

public abstract class AbstractPizza implements Pizza {
    PizzaType pizzaType;
    PizzaSize pizzaSize;
    List<PizzaIngredients> ingredients;

    public AbstractPizza(PizzaType pizzaType, PizzaSize pizzaSize, List<PizzaIngredients> ingredients) {
        this.pizzaType = pizzaType;
        this.pizzaSize = pizzaSize;
        this.ingredients = ingredients;
    }

    @Override
    public void prepare() {
        System.out.println("Prepare " + pizzaType + " pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking " + pizzaType + " pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting " + pizzaType + " pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing " + pizzaType + " pizza");
    }

    @Override
    public String toString() {
        return "AbstractPizza{" +
                "pizzaType=" + pizzaType +
                ", pizzaSize=" + pizzaSize +
                ", ingredients=" + ingredients +
                '}';
    }
}
