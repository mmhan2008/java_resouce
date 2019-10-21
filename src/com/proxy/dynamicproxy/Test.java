package com.proxy.dynamicproxy;

/**
 * @author user01
 * @create 2019/10/10
 */
public class Test {
    public static void main(String[] args) {
        StarHandler handler = new StarHandler();
        Star star = new RealStar();
        Star proxy = (Star)handler.create(star);
        proxy.bookTicker();
        proxy.signContract();
        proxy.sing();
    }
}

