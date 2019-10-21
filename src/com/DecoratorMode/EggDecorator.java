package com.DecoratorMode;

/**
 * @author user01
 * @create 2019/9/25
 */
public class EggDecorator extends Decorator {

    public EggDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public float cost(){
        return super.cost() + 3.0f;
    }

    @Override
    public String description(){
        return super.description() + "+鸡蛋";
    }
}

