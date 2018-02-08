package com.vector.design.MediatorPatternDemo;

/**
 * Created by DCITS-cs on 2018/2/8.
 */
public class MediatorPatternDemo {
    public static void main(String[] args){
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
