package com.strategy;

/**
 * @author user01
 * @create 2019/10/16
 */
public class NewCustomerFewStrategy implements Strategy {

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("打八五折");
        return standardPrice * 0.85;
    }
}

