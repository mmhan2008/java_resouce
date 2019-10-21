package com.mediator;

/**
 * 〈中介者〉
 *
 * @author user01
 * @create 2019/10/16
 */
public interface Mediator {
    void register(String dname,Department d);
    void command(String dname);
}