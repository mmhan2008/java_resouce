package com.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * //享元工厂类
 * @author user01
 * @create 2019/10/15
 */
public class ChessFlyweightFactory {
    //享元池
    private static Map<String,ChessFlyweight> map = new HashMap<>();

    public static ChessFlyweight getChess(String color){
        if (map.get(color) != null){
            return map.get(color);
        } else {
            ChessFlyweight cfw = new ConcreteChess(color);
            map.put(color,cfw);
            return cfw;
        }
    }
}

