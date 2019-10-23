package com.factory.methodfactory;

/**
 * @author user01
 * @create 2019/10/22
 */
public class AudiFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Audi();
    }
}

