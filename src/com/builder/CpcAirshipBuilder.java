package com.builder;

/**
 * @author user01
 * @create 2019/10/10
 */
public class CpcAirshipBuilder implements AirShipBuilder {

    @Override
    public Engine builderEngine() {
        System.out.println("构建发动机");
        return new Engine("无敌牌发动机");
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("构建轨道舱");
        return new OrbitalModule("无敌牌轨道舱");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("构建逃逸塔");
        return new EscapeTower("无敌牌逃逸塔");
    }
}

