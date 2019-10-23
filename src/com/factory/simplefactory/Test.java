package com.factory.simplefactory;

/**
 * @author user01
 * @create 2019/10/22
 */
public class Test {
    public static void main(String[] args) {
        Car audi = CarFactory.createCar("奥迪");
        Car byd = CarFactory.createCar("比亚迪");
        audi.run();
        byd.run();
    }
}

