package com.proxy.staticproxy;

/**
 * @author user01
 * @create 2019/10/10
 */
public class Test {
    public static void main(String[] args) {
        Star real = new RealStar();
        Star proxy = new ProxyStart(real);
        proxy.confer();
        proxy.signContract();
        proxy.bookTicker();
        proxy.sing();
        proxy.collectMoney();
    }
}

