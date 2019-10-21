package com.proxy;

import org.junit.Test;

/**
 * @author user01
 * @create 2019/9/27
 */
public class TestDemo {
    @Test
    public void testProxy(){
        CreateProxy cp = new CreateProxy();
        Subject person = new Person();
        Subject proxy = (Subject)cp.create(person);
        proxy.shopping();
    }
}

