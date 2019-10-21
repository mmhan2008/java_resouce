package com.DecoratorMode;

import com.DecoratorMode.Drink;
import com.DecoratorMode.BlackBeanDecorator;
import com.DecoratorMode.EggDecorator;
import com.DecoratorMode.SoyBeanMilk;
import com.DecoratorMode.SugarDecorator;

/**
 * @author user01
 * @create 2019/9/25
 * 装饰器模式
 */
public class Test {
    public static void main(String[] args) {
        Drink drink = new SoyBeanMilk();
        SugarDecorator sugar = new SugarDecorator(drink);
        EggDecorator egg = new EggDecorator(sugar);
        BlackBeanDecorator blackBean = new BlackBeanDecorator(egg);

        System.out.println("豆浆是:" + blackBean.description());
        System.out.println("总价是：" + blackBean.cost());
    }
}

