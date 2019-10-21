package com.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author user01
 * @create 2019/10/16
 */
public class President implements Mediator {

    private Map<String,Department> map = new HashMap();

    @Override
    public void register(String dname, Department d) {
        map.put(dname,d);
    }

    @Override
    public void command(String dname) {
        map.get(dname).selfAction();
    }
}

