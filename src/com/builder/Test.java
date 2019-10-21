package com.builder;

/**
 * @author user01
 * @create 2019/10/10
 * 建造者模式测试 
 */
public class Test {
    public static void main(String[] args) {
        AirShipDirector director = new CpcAirshipDirector(new CpcAirshipBuilder());

        AirShip airShip = director.directAirShip();
        
        System.out.println(airShip.getEngine().getName());

        airShip.launch();
    }
}

