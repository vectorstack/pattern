package com.vector.design.BuilderPatternDemo;

/**
 * Created by DCITS-cs on 2018/1/31.
 */
public abstract class ColdDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
