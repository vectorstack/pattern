package com.vector.design.DecoratorPatternDemo;

/**
 * Created by 12345 on 2018-2-6.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args){
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();

    }
}
