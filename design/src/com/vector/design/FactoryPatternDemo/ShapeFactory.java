package com.vector.design.FactoryPatternDemo;

/**
 * Created by DCITS-cs on 2018/1/29.
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){

        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return  new Circle();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }else{
            return null;
        }
    }
}
