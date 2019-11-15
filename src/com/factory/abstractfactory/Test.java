package com.factory.abstractfactory;

import java.util.Date;

/**
 * @author user01
 * @create 2019/10/22
 */
public class Test {
    public static void main(String[] args) {
        CarFactory factory = new LuxuryCarFactory();
        Engine engine = factory.createEngine();
        engine.run();
        engine.start();
        System.out.println(new Date().toLocaleString());

        CarFactory factory1 = new LowerCarFactory();
        Seat seat = factory1.createSeat();
        seat.massage();
        
    }
}

