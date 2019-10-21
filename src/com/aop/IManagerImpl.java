package com.aop;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntBinaryOperator;

/**
 * @author user01
 * @create 2019/9/30
 */
public class IManagerImpl implements IManager {

    private List<String> list = new ArrayList<>();
    @Override
    public void add(String item) {
        list.add(item);
        System.out.println(item);
    }
}

