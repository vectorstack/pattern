package com.vector.design.FactoryPatternDemo;

/**
 * Created by DCITS-cs on 2018/1/29.
 */
public class FactoryPatternDemo {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape("circle");
        shape.draw();
    }
}
