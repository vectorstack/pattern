package com.vector.design.BuilderPatternDemo;

/**
 * Created by DCITS-cs on 2018/1/31.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
