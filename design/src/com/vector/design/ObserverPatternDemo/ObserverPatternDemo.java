package com.vector.design.ObserverPatternDemo;

/**
 * Created by DCITS-cs on 2018/2/10.
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change:15");
        subject.setState(15);
        System.out.println("Second state change:10");
        subject.setState(10);

    }
}
