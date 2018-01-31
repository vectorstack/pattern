package com.vector.design.BuilderPatternDemo;

/**
 * Created by DCITS-cs on 2018/1/31.
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
