package com.adapter;

/**
 * 适配器（对象适配器方式，使用组合的方式跟被适配的对象整合)
 * @author user01
 * @create 2019/10/10
 */
public class Adpater2 implements Target {

    private Adaptee adaptee;

    public Adpater2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleReq() {
        adaptee.request();
    }
}

