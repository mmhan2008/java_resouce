package com.iterator;

/**
 * 自定义迭代器接口
 * @author user01
 * @create 2019/10/15
 */
public interface MyIterator {
    void first();
    void next();
    boolean hasNext();

    boolean isFirst();
    boolean isLast();

    Object getCurrentObj();
}

