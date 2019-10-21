package com.template;

/**
 * @author user01
 * @create 2019/10/16
 */
public abstract class BankTemplateMethod {
    //具体方法
    public void takeNum(){
        System.out.println("排队取号！");
    }
    //办理具体业务，钩子方法
    public abstract void transact();

    public void feedback(){
        System.out.println("反馈评分");
    }

    public final void process(){
        //模版方法
        this.takeNum();

        this.transact();

        this.feedback();
    }
}

