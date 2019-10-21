package com.bridge;

/**
 * @author user01
 * @create 2019/10/10
 */
public interface Computer {
    void sale();
}
class Desktop implements Computer{

    @Override
    public void sale() {
        System.out.println("销售笔记本！");
    }
}

class Pad implements  Computer{

    @Override
    public void sale() {
        System.out.println("销售平板电脑！");
    }
}
