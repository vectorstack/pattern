package com.vector.design.BridgePatternDemo;

/**
 * Created by DCITS-cs on 2018/2/1.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract  void draw();
}
