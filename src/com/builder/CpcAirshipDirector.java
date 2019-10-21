package com.builder;

/**
 * @author user01
 * @create 2019/10/10
 */
public class CpcAirshipDirector implements AirShipDirector{

    private AirShipBuilder builder;

    public CpcAirshipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    /**
     * 组装飞船
     *
     * @return
     */
    @Override
    public AirShip directAirShip() {
        Engine engine = builder.builderEngine();
        EscapeTower escapeTower = builder.builderEscapeTower();
        OrbitalModule orbitalModule = builder.builderOrbitalModule();

        AirShip airShip = new AirShip();
        airShip.setEngine(engine);
        airShip.setEscapeTower(escapeTower);
        airShip.setOrbitalModule(orbitalModule);

        return airShip;
    }
}

