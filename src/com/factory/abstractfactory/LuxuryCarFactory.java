package com.factory.abstractfactory;

/**
 * @author user01
 * @create 2019/10/22
 */
public class LuxuryCarFactory implements CarFactory{

    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Seat createSeat() {
        return new LuxurySeat();
    }

    @Override
    public Tyre createTyre() {
        return new LuxuryTyre();
    }
}

