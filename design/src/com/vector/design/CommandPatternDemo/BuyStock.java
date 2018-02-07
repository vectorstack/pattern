package com.vector.design.CommandPatternDemo;

/**
 * Created by 12345 on 2018-2-7.
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
