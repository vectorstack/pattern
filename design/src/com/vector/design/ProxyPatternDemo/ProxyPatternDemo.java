package com.vector.design.ProxyPatternDemo;

/**
 * Created by 12345 on 2018-2-6.
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");
        image.display();
        System.out.println("");
        image.display();
    }
}
