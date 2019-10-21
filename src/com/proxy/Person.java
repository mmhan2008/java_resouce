package com.proxy;

/**
 * @author user01
 * @create 2019/9/27
 */
public class Person implements Subject {

    @Override
    public void shopping() {
        System.out.println("付款，买到心仪的东西");
    }
}

