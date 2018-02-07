package com.vector.design.ChainPatternDemo;

/**
 * Created by 12345 on 2018-2-7.
 */
public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger:"+message);
    }
}
