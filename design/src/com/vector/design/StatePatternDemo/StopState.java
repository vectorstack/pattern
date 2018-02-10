package com.vector.design.StatePatternDemo;

/**
 * Created by DCITS-cs on 2018/2/10.
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }

}
