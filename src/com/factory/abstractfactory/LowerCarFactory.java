package com.factory.abstractfactory;

/**
 * @author user01
 * @create 2019/10/22
 */
public class LowerCarFactory implements CarFactory{

    @Override
    public Engine createEngine() {
        System.out.println("解耦");
        return new LowerEngine();
    }

    @Override
    public Seat createSeat() {
        return new LowerSeat();
    }

    @Override
    public Tyre createTyre() {
        return new LowerTyre();
    }
}

