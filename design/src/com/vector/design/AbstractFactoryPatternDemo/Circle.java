package com.vector.design.AbstractFactoryPatternDemo;

/**
 * Created by DCITS-cs on 2018/1/29.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle draw ...");
    }
}
