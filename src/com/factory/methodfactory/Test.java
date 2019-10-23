package com.factory.methodfactory;

/**
 * @author user01
 * @create 2019/10/22
 */
public class Test {
    public static void main(String[] args) {
        Car audi = new AudiFactory().createCar();
        Car byd = new BydFactory().createCar();

        audi.run();
        byd.run();
    }
}

