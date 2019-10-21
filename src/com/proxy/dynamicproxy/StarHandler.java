package com.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author user01
 * @create 2019/10/10
 */
public class StarHandler implements InvocationHandler {
    private Object target;//被代理对象
    //用于创建代理对象的方法
    public Object create(Object target){
        this.target = target;
        Object proxy =
                Proxy.newProxyInstance(target.getClass().getClassLoader(),
                        target.getClass().getInterfaces(), this);
        return  proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行方法前！");
//        if (method.getName().equals("sing")){
            method.invoke(target,args);
//        }
        System.out.println("执行方法后！");
        return null;
    }
}

