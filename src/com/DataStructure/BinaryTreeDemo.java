package com.DataStructure;

import jdk.nashorn.internal.ir.BinaryNode;

/**
 * @author user01
 * @create 2019/9/26
 */
public class BinaryTreeDemo {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(1);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(2);
        bt.add(4);
        bt.add(6);
        bt.add(8);
        bt.add(10);
        bt.add(11);
        bt.print();
    }
}

