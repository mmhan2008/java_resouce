package com.template;

/**
 * @author user01
 * @create 2019/10/16
 */
public class Test {
    public static void main(String[] args) {
        BankTemplateMethod btm = new DrawMoney();
        btm.process();

        BankTemplateMethod btm1 = new BankTemplateMethod() {
            @Override
            public void transact() {
                System.out.println("我要存钱！");
            }
        };
        btm1.process();
    }
}

