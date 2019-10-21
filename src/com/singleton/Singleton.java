package com.singleton;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @author user01
 * @create 2019/4/16
 */
public class Singleton {

    private Singleton(){
        if (SingletonInstance.instance!=null)
            throw new RuntimeException("不允许非法创建对象");
    };

    private static class SingletonInstance{
        private static final Singleton instance = new Singleton();
    }


    public static Singleton getInstance(){
        return  SingletonInstance.instance;
    }

}

