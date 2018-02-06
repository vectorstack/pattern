package com.vector.design.FlyWeightPatternDemo;

import java.util.HashMap;

/**
 * Created by 12345 on 2018-2-6.
 */
public class ShapeFactory {
    private static final HashMap<String,Shape> circleMap = new HashMap<String,Shape>();

    public static Shape getCircle(String color){
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null){
            circle = new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Creating circle of color:"+color);
        }
        return circle;
    }
}
