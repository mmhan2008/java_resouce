package com.observer2;

/**
 * @author user01
 * @create 2019/10/18
 */
public class Test {
    public static void main(String[] args) {
        //创建目标对象
        ConcreteSubject subject = new ConcreteSubject();

        //创建观察者
        ObserverA obs1= new ObserverA();
        ObserverA obs2= new ObserverA();
        ObserverA obs3= new ObserverA();

        //注册到目标对象subject容器中
        subject.addObserver(obs1);
        subject.addObserver(obs2);
        subject.addObserver(obs3);

        //改变subject状态
        subject.setState(3000);
        System.out.println("状态修改为3000");
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());


        subject.setState(200);
        System.out.println("状态修改为200");
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());
    }
}

