package com.factory.methodfactory;

/**
 * @author user01
 * @create 2019/10/22
 */
public class BydFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Byd();
    }
}

