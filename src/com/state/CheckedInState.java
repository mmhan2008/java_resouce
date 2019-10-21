package com.state;

/**
 * @author user01
 * @create 2019/10/17
 */
public class CheckedInState implements State {

    @Override
    public void handle() {
        System.out.println("已入住房间！");
    }
}

