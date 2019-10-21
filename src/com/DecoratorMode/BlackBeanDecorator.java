package com.DecoratorMode;

/**
 * @author user01
 * @create 2019/9/25
 */
public class BlackBeanDecorator extends Decorator {

    public BlackBeanDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public float cost(){
        return super.cost() + 2.0f;
    }

    @Override
    public String description(){
        return super.description() + "+黑豆";
    }
}

