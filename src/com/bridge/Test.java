package com.bridge;

/**
 * 桥接模式
 * @author user01
 * @create 2019/10/15
 *
 * 开发中应用场景
 *      ——JDBC驱动程序
 *      ——银行日志管理
 *          格式分类：操作日志、交易日志、异常日志
 *          距离分类：本地日志记录、异地日志记录
 *      ——人力资源系统中的奖金计算模块
 *          奖金分类：个人奖金、团体奖金、激励奖金
 *          部门分类：人事部门、销售部门、研发部门
 *      ——OA系统中的消息处理
 *          业务类型：普通消息、加急消息、特级消息
 *          发送消息方式：系统内消息、手机短信、邮件
 */
public class Test {
    public static void main(String[] args) {
        //销售联想笔记本
        Computer2 c  = new Laptop2(new Lenovo());
        c.sale();


        //销售神舟台式机
        Computer2 c1 = new Desktop2(new ShenZhou());
        c1.sale();
    }
}

