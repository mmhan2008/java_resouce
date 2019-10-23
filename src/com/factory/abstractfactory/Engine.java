package com.factory.abstractfactory;

/**
 * 〈〉
 *
 * @author user01
 * @create 2019/10/22
 */
public interface Engine {
    void run();
    void start();
}


//高端发动机
class LuxuryEngine implements Engine{

    @Override
    public void run() {
        System.out.println("转的快！");
    }

    @Override
    public void start() {
        System.out.println("启动快！可以自动启停！");
    }
}

//低端发动机
class LowerEngine implements Engine{

    @Override
    public void run() {
        System.out.println("转的慢！");
    }

    @Override
    public void start() {
        System.out.println("启动慢！可以自动启停！");
    }
}