package com.bridge;

/**
 * 〈品牌〉
 *
 * @author user01
 * @create 2019/10/15
 */
public interface Brand {
    void sale();
}

class Lenovo implements Brand{

    @Override
    public void sale() {
        System.out.println("销售联想电脑");       
    }
}

class Dell implements Brand{

    @Override
    public void sale() {
        System.out.println("销售戴尔电脑");
    }
}

class ShenZhou implements Brand{

    @Override
    public void sale() {
        System.out.println("销售神舟电脑");
    }
}