package com.mediator;

/**
 * @author user01
 * @create 2019/10/16
 */
public class Finacial implements Department {

    private Mediator m;

    public Finacial(Mediator m) {
        super();
        this.m = m;
        m.register("finacial",this);
    }

    @Override
    public void selfAction() {
        System.out.println("数钱！");
    }

    @Override
    public void outAction() {
        System.out.println("钱太多了话不完，怎么办？");
    }
}

