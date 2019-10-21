package com.aop;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author user01
 * @create 2019/9/30
 */
public class BeanFactory {
    Properties prop = new Properties();
    public BeanFactory(InputStream inputStream){
        try {
            prop.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取bean实例
     * @param name
     * @return
     */
    public Object getBean(String name){
        String className = prop.getProperty(name);
        Object bean = null;
        try {
            //获取ProxyFactoryBean的class对象
            Class<?> aClass = Class.forName(className);
            //实例化对象
            bean = aClass.newInstance();
            //根据配置文件实例化target和advice对象
            Object target = Class.forName(prop.getProperty(name + ".target")).newInstance();
            Object advice = Class.forName(prop.getProperty(name + ".advice")).newInstance();
            //通过内省实现对ProxyFactoryBean的属性赋值
            BeanInfo beanInfo = Introspector.getBeanInfo(aClass);
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor pd:propertyDescriptors) {
                String propertyName = pd.getName();
                Method writeMethod = pd.getWriteMethod();
                if ("target".equals(propertyName)){
                    writeMethod.invoke(bean,target);
                } else if("advice".equals(propertyName)){
                    writeMethod.invoke(bean,advice);
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IntrospectionException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return bean;
    }
}

