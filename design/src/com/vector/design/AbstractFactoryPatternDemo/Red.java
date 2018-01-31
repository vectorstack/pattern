package com.vector.design.AbstractFactoryPatternDemo;

/**
 * Created by DCITS-cs on 2018/1/29.
 */
public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Red fill ...");
    }
}
