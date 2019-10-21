package com.state;

/**
 * @author user01
 * @create 2019/10/17
 */
public class Context {
    //如果是银行系统，这个context就是账号。根据金额不同，切换不同的状态
    private State state;

    public void setState(State s){
        System.out.println("修改状态");
        state = s;
        state.handle();
    }

}

