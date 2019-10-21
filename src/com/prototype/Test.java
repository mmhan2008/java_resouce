package com.prototype;

import java.util.Date;

/**
 * @author user01
 * @create 2019/10/10
 * 原型模式/克隆模式
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep s1 = new Sheep("多利",new Date());
        System.out.println(s1);
        System.out.println(s1.getSname());
        System.out.println(s1.getBirthday());

        Sheep s2 = (Sheep) s1.clone();
        s2.setSname("少利");
        System.out.println(s2);
        System.out.println(s2.getSname());
        System.out.println(s2.getBirthday());
    }
}

