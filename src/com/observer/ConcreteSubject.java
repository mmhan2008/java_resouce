package com.observer;

/**
 * @author user01
 * @create 2019/10/17
 */
public class ConcreteSubject extends Subject {
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        //主题对象发生变化，通知所有的观察者
        this.notifyAllObservers();
    }
}

