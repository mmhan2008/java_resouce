package com.observer;

/**
 * @author user01
 * @create 2019/10/17
 */
public class Test {
    public static void main(String[] args) {
        //目标对象
        ConcreteSubject subject = new ConcreteSubject();

        //创建多个观察者
        ObserverA obs1 = new ObserverA();
        ObserverA obs2 = new ObserverA();
        ObserverA obs3= new ObserverA();

        //将这三个观察者添加到subject对象的观察者队伍当中
        subject.registerObserver(obs1);
        subject.registerObserver(obs2);
        subject.registerObserver(obs3);


        //改变subject的状态
        subject.setState(3000);
        System.out.println("~~~~~~~~~~~~~");
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());

        subject.setState(1000);
        System.out.println("~~~~~~~~~~~~~");
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());
    }
}

