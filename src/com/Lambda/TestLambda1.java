package com.Lambda;

import org.junit.Test;

import java.util.function.BiPredicate;

/**
 * @author user01
 * @create 2019/1/30
 */
public class TestLambda1 {
    @Test
    public void test1 () {
        System.out.println("hello lambda!");
    }

    @Test
    public void test2 () {
        boolean b = compareStr("sss", "sss", (x, y) -> x.equals(y));
        System.out.println(b);
    }

    public boolean compareStr (String str1,String str2,BiPredicate bi) {
        return bi.test(str1,str2);
    }
}

