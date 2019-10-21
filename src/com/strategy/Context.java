package com.strategy;

/**
 * 负责和具体的策略交互
 * 这样的话，具体的算法和直接的客户端调用分离了，是的算法可以独立于客户端独立的变化
 * @author user01
 * @create 2019/10/16
 */
public class Context {
    //当前采用的算法对象
    private Strategy strategy;
    
    //可以通过构造器来注入

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public void pringPrice(double s){
        System.out.println("你该报价：" + strategy.getPrice(s));
    }
}

