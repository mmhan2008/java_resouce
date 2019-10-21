package com.proxy.staticproxy;

/**
 * @author user01
 * @create 2019/10/10
 */
public class RealStar implements Star {

    /**
     * 面谈
     */
    @Override
    public void confer() {
        System.out.println("RealStar.confer()");
    }

    /**
     * 签合同
     */
    @Override
    public void signContract() {
        System.out.println("RealStar.signContract()");
    }

    /**
     * 订票
     */
    @Override
    public void bookTicker() {
        System.out.println("RealStar.bookTicker()");
    }

    /**
     * 唱歌
     */
    @Override
    public void sing() {
        System.out.println("RealStar(周杰伦本人).sing()");
    }

    /**
     * 收钱
     */
    @Override
    public void collectMoney() {
        System.out.println("RealStar.collectMoney()");
    }
}

