package com.vector.design.AbstractFactoryPatternDemo;

/**
 * Created by DCITS-cs on 2018/1/29.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }else{
            return null;
        }
    }
}
