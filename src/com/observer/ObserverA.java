package com.observer;

/**
 * @author user01
 * @create 2019/10/17
 */
public class ObserverA implements Observer {

    private int myState; //需要跟目标兑现的state值保持一致

    @Override
    public void update(Subject subject) {
        myState = ((ConcreteSubject)subject).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}

