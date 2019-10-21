package com.mediator;

/**
 * @author user01
 * @create 2019/10/16
 */
public class Market implements Department {

    private Mediator m;

    public Market(Mediator m) {
        super();
        this.m = m;
        m.register("market",this);
    }

    @Override
    public void selfAction() {
        System.out.println("承接的项目，需要资金支持！");
    }

    @Override
    public void outAction() {
        System.out.println("跑去接项目！");
        m.command("finacial");
    }
}

