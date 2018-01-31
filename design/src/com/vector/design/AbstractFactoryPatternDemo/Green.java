package com.vector.design.AbstractFactoryPatternDemo;

/**
 * Created by DCITS-cs on 2018/1/29.
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Green fill ...");
    }
}
