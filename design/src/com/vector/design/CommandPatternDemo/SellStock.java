package com.vector.design.CommandPatternDemo;

/**
 * Created by 12345 on 2018-2-7.
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }
    @Override
    public void execute() {
        abcStock.sell();
    }
}
