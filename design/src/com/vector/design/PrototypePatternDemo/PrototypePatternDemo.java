package com.vector.design.PrototypePatternDemo;

/**
 * Created by DCITS-cs on 2018/1/31.
 */
public class PrototypePatternDemo {
    public static void main(String[] args){
        ShapeCache.loadCache();

        Shape clonedShape = (Shape)ShapeCache.getShape("1");
        clonedShape.draw();

        Shape clonedShape2 = ShapeCache.getShape("2");
        clonedShape2.draw();

        Shape clonedShape3 = ShapeCache.getShape("3");
        clonedShape3.draw();
    }
}
