package com.memento;

/**
 * 负责人类
 * 负责管理备忘录对象
 * @author user01
 * @create 2019/10/18
 */
public class CareTaker {
    private EmpMemento emp;

    public EmpMemento getEmp() {
        return emp;
    }

    public void setEmp(EmpMemento emp) {
        this.emp = emp;
    }
}

