package com.vector.design.AdapterPatternDemo;

/**
 * Created by DCITS-cs on 2018/2/1.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //nothing to do
    }
}
