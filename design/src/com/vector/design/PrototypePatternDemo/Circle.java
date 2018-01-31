package com.vector.design.PrototypePatternDemo;

/**
 * Created by DCITS-cs on 2018/1/31.
 */
public class Circle extends Shape {

    public Circle(){
        type="Circle";
    }
    @Override
    void draw() {
        System.out.println("Circle draw...");
    }
}
