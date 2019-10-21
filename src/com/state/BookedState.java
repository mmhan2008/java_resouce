package com.state;

/**
 * @author user01
 * @create 2019/10/17
 */
public class BookedState implements State {

    @Override
    public void handle() {
        System.out.println("房间已预订！");
    }
}

