package com.vector.design.SingletonPatternDemo;

/**
 * Created by DCITS-cs on 2018/1/29.
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject(){

    }

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }


}
