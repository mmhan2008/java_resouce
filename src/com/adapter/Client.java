package com.adapter;

/**
 * @author user01
 * @create 2019/10/10
 * 客户端类
 */
public class Client {

    public void test1(Target t){
        t.handleReq();
    }

    public static void main(String[] args) {
        Client client = new Client();
        Target t1 = new Adpater();
        Adaptee a = new Adaptee();
        Target t2 = new Adpater2(a);
        client.test1(t1);
        client.test1(t2);
    }
}

