package com.chainOfResp;

/**
 * @author user01
 * @create 2019/10/15
 */
public abstract class Leader {
    protected String name;
    protected Leader nextLeader; //责任链上的后继对象

    public Leader(String name) {
        super();
        this.name = name;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    /**
     * 处理请假请求
     * @param request
     */
    public abstract void handleRequest(LeaveRequest request);
}

