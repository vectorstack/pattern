package com.vector.design.MementoPatternDemo;

/**
 * Created by DCITS-cs on 2018/2/10.
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
