package com.aop;

import org.junit.Test;

import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

/**
 * @author user01
 * @create 2019/9/30
 */
public class AopTest {
    @Test
    public void test(){
        //读取配置文件
        InputStream in = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("com/aop/bean.properties");
        //创建bean的工厂对象
        BeanFactory beanFactory = new BeanFactory(in);
        //获取代理对象
        ProxyFactoryBean proxyFactoryBean = (ProxyFactoryBean) beanFactory.getBean("bean");
        IManager proxy = (IManager) proxyFactoryBean.getProxy();
        proxy.add("^_^");
    }

    @Test
    public void operation(){
        List<String> list = Arrays.asList("20190108 15:16:22",
                "20190208 15:16:22",
                "20190308 15:16:22",
                "20190408 15:16:22",
                "20190508 15:16:22",
                "20190608 15:16:22",
                "20190708 15:16:22");
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd hh:mm:ss");
        SimpleDateFormat format1 = new SimpleDateFormat("yyyyMMdd");
        list.forEach(o->{
            try {
                if (format.parse(o).getTime()>format1.parse("20190308").getTime()){
                    System.out.println(o);
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        });
    }
}

