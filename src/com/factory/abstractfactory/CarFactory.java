package com.factory.abstractfactory;

/**
 * @author user01
 * @create 2019/10/22
 */
public interface CarFactory {
    Engine createEngine();
    Seat createSeat();
    Tyre createTyre();
}

