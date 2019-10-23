package com.factory.abstractfactory;

/**
 * 〈〉
 *
 * @author user01
 * @create 2019/10/22
 */
public interface Seat {
    void massage();
}

class LuxurySeat implements Seat{

    @Override
    public void massage() {
        System.out.println("可以按摩！");
    }
}

class LowerSeat implements Seat{

    @Override
    public void massage() {
        System.out.println("不能按摩！");
    }
}