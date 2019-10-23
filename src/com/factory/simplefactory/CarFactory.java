package com.factory.simplefactory;

/**
 * @author user01
 * @create 2019/10/22
 */
public class CarFactory {

    public static Car createCar(String type){
        if("奥迪".equals(type)){
            return new Audi();
        } else if("比亚迪".equals(type)){
            return new Byd();
        }
        return null;
    }
}

