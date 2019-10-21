package com.strategy;

/**
 * @author user01
 * @create 2019/10/16
 */
public class Test {
    public static void main(String[] args) {
        Strategy s1 = new OldCustomerFewStrategy();
        Context ctx = new Context(s1);
        ctx.pringPrice(998);
    }
}

