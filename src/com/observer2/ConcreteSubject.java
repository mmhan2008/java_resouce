package com.observer2;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * 目标对象
 * @author user01
 * @create 2019/10/18
 */
public class ConcreteSubject extends Observable {

    private int state;

    public void setState(int state) {
        this.state = state;//目标对象发生变化
        setChanged();  //表示目标对象已经做了更改
        notifyObservers(state);  //通知所有的观察者
    }

    public int getState() {
        return state;
    }


}

