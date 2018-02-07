package com.vector.design.ChainPatternDemo;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by 12345 on 2018-2-7.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("File::Logger:"+message);
    }
}
