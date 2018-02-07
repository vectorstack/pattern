package com.vector.design.CommandPatternDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 12345 on 2018-2-7.
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for(Order order: orderList){
            order.execute();
        }
        orderList.clear();
    }
}
