package com.vector.design.AbstractFactoryPatternDemo;

/**
 * Created by DCITS-cs on 2018/1/29.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle draw...");
    }
}
