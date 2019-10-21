package com.adapter;

/**
 * 适配器(类适配器方式)
 * @author user01
 * @create 2019/10/10
 */
public class Adpater extends Adaptee implements Target {

    @Override
    public void handleReq() {
        super.request();
    }
}

