package com.DecoratorMode;

import com.DecoratorMode.Drink;

/**
 * @author user01
 * @create 2019/9/25
 */
public abstract class Decorator implements Drink {

    private Drink drink;//要装饰的对象

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return drink.cost();
    }

    @Override
    public String description() {
        return drink.description();
    }
}

