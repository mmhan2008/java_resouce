package com.memento;

/**
 * @author user01
 * @create 2019/10/18
 */
public class Test {
    public static void main(String[] args) {
        CareTaker taker = new CareTaker();
        Emp emp = new Emp("张三",18,999);
        System.out.println("第一次创建对象：" + emp.getEname() +
        "----" + emp.getAge() + "----" + emp.getSalary());

        //备忘一次
        taker.setEmp(emp.memento());

        emp.setAge(38);
        emp.setEname("李四");
        emp.setSalary(666);
        System.out.println("第二次更改后对象：" + emp.getEname() +
                "----" + emp.getAge() + "----" + emp.getSalary());

        emp.recovery(taker.getEmp());
        System.out.println("第三次恢复对象：" + emp.getEname() +
                "----" + emp.getAge() + "----" + emp.getSalary());

    }
}

