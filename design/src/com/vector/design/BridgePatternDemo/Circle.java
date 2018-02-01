package com.vector.design.BridgePatternDemo;

/**
 * Created by DCITS-cs on 2018/2/1.
 */
public class Circle extends Shape {
    private int x, y, radius;

    protected Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
