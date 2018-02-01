package com.vector.design.BridgePatternDemo;

/**
 * Created by DCITS-cs on 2018/2/1.
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
