package com.observer2;

import java.util.Observable;
import java.util.Observer;

/**
 * @author user01
 * @create 2019/10/18
 */
public class ObserverA implements Observer {

    private int myState;

    @Override
    public void update(Observable o, Object arg) {
        myState = ((ConcreteSubject)o).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}

