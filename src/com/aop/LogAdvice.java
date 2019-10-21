package com.aop;

/**
 * @author user01
 * @create 2019/9/27
 * 切面实现类
 */
public class LogAdvice implements Advice {

    @Override
    public void beforeAdvice() {
        System.out.println("start time:" + System.currentTimeMillis());
    }

    @Override
    public void afterAdvice() {
        System.out.println("end time:" + System.currentTimeMillis());
    }
}

