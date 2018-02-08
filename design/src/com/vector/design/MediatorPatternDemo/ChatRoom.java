package com.vector.design.MediatorPatternDemo;

import java.util.Date;

/**
 * Created by DCITS-cs on 2018/2/8.
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() +
            " ["+user.getName()+"]:"+message);
    }
}
