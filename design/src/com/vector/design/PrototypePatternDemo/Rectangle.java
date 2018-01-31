package com.vector.design.PrototypePatternDemo;

/**
 * Created by DCITS-cs on 2018/1/31.
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle:: draw() method");
    }
}
