package com.vector.design.PrototypePatternDemo;

/**
 * Created by DCITS-cs on 2018/1/31.
 */
public class Square extends Shape {

    public Square(){
        type="square";
    }
    @Override
    void draw() {
        System.out.println("square draw ...");
    }
}
