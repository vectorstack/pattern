package com.vector.design.BuilderPatternDemo;

/**
 * Created by DCITS-cs on 2018/1/31.
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
