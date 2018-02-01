package com.vector.design.AdapterPatternDemo;

/**
 * Created by DCITS-cs on 2018/2/1.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //nothing to do
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+fileName);
    }
}
