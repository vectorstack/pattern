package com.vector.design.DecoratorPatternDemo;

/**
 * Created by 12345 on 2018-2-6.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
