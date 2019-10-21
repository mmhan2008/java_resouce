package com.flyweight;

/**
 * 享元类
 * @author user01
 * @create 2019/10/15
 */
public interface ChessFlyweight {
    void setColor(String c);
    String getColor();
    void display(Coordinate c);
}
class ConcreteChess implements ChessFlyweight{
    private String color;

    public ConcreteChess(String color) {
        super();
        this.color = color;
    }

    @Override
    public void setColor(String c) {
        this.color = c;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate c) {
        System.out.println("棋子颜色：" + color);
        System.out.println("棋子位置：" + c.getX() + "—" + c.getY());
    }
}
