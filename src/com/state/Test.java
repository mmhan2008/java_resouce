package com.state;

/**
 * @author user01
 * @create 2019/10/17
 */
public class Test {
    public static void main(String[] args) {
        Context ctx = new Context();
        ctx.setState(new FreeState());
        ctx.setState(new BookedState());
    }
}

