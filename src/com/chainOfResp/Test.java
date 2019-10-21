package com.chainOfResp;

/**
 * @author user01
 * @create 2019/10/15
 */
public class Test {
    public static void main(String[] args) {
        Leader a = new Director("张三");
        Leader b = new Manager("李四");
        Leader c = new GeneralManager("王五");

        //组织责任链对象关系
        a.setNextLeader(b);
        b.setNextLeader(c);

        //开始请假操作
        LeaveRequest req = new LeaveRequest("TOM",1,"去东方明珠游玩！");
        a.handleRequest(req);
        LeaveRequest req1 = new LeaveRequest("JERRY",35,"回华盛顿老家！");
        a.handleRequest(req1);
    }
}

