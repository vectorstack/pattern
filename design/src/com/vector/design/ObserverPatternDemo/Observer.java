package com.vector.design.ObserverPatternDemo;

/**
 * Created by DCITS-cs on 2018/2/10.
 */
public abstract class Observer {
    protected  Subject subject;
    public abstract void update();
}
