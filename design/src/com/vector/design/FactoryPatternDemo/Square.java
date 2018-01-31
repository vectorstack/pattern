package com.vector.design.FactoryPatternDemo;

/**
 * Created by DCITS-cs on 2018/1/29.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square draw ...");
    }
}
