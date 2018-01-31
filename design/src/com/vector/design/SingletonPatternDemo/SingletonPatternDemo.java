package com.vector.design.SingletonPatternDemo;

/**
 * Created by DCITS-cs on 2018/1/29.
 */
public class SingletonPatternDemo {
    public static void main(String[] args){
//        SingleObject singleObject = new SingleObject();
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }
}
