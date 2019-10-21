package com.strategy;

/**
 * @author user01
 * @create 2019/10/16
 */
public class OldCustomerManyStrategy implements Strategy {

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("打七折");
        return standardPrice * 0.7;
    }
}

