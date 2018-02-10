package com.vector.design.MementoPatternDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DCITS-cs on 2018/2/10.
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
