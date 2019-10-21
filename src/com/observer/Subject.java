package com.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author user01
 * @create 2019/10/17
 */
public class Subject {

    protected List<Observer> list = new ArrayList<>();

    public void registerObserver(Observer obs){
        list.add(obs);
    }

    public void removeObserver(Observer obs){
        list.remove(obs);
    }

    //通知所有观察者更新状态
    public void notifyAllObservers(){
        for (Observer obs:list) {
            obs.update(this);
        }
    }

}

