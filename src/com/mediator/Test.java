package com.mediator;

/**
 * @author user01
 * @create 2019/10/16
 */
public class Test {
    public static void main(String[] args) {
        Mediator m = new President();

        Market market = new Market(m);
        Development devp = new Development(m);
        Finacial f = new Finacial(m);

        market.selfAction();
        market.outAction();
    }
}

