package com.vector.design.StatePatternDemo;

/**
 * Created by DCITS-cs on 2018/2/10.
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
