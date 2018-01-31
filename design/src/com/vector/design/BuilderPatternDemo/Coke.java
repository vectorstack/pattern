package com.vector.design.BuilderPatternDemo;

/**
 * Created by DCITS-cs on 2018/1/31.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Cold Drink";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
