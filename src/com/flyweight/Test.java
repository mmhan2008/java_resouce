package com.flyweight;

/**
 * @author user01
 * @create 2019/10/15
 *
 * 开发中应用的场景
 *      ——享元模式由于其共享的特性，可以在任何‘池’中操作，
 *        比如：线程池、数据库连接池
 *      ——String类的设计也是享元模式
 */
public class Test {
    public static void main(String[] args) {
        ChessFlyweight chess1 = ChessFlyweightFactory.getChess("黑色");
        ChessFlyweight chess2 = ChessFlyweightFactory.getChess("黑色");
        System.out.println(chess1);
        System.out.println(chess2);

        System.out.println("~~~~~~~~~~~增加外部状态的处理~~~~~~~~~~~~~~~~~~~");
        chess1.display(new Coordinate(10,10));
        chess2.display(new Coordinate(10,20));
    }
}

