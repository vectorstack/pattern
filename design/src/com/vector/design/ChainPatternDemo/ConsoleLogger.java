package com.vector.design.ChainPatternDemo;

/**
 * Created by 12345 on 2018-2-7.
 */
public class ConsoleLogger extends AbstractLogger{

    public ConsoleLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger:"+message);
    }
}
