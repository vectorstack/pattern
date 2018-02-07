package com.vector.design.InterpreterPatternDemo;

/**
 * Created by 12345 on 2018-2-7.
 */
public class TerminalExpression implements Expression {

    private String data;
    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
