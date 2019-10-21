package com.DecoratorMode;

import com.DecoratorMode.Drink;

/**
 * @author user01
 * @create 2019/9/25
 */
public class SoyBeanMilk implements Drink {

    @Override
    public float cost() {
        return 10f;
    }

    @Override
    public String description() {
        return "纯豆浆";
    }
}

