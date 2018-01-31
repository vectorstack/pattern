package com.vector.design.AbstractFactoryPatternDemo;

/**
 * Created by DCITS-cs on 2018/1/29.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
