package com.patterns.proxy.jdk;

import java.lang.reflect.Proxy;

/**
 * JDK动态代理测试类
 */
public class JDKProxyTest {

    public static void main(String[] args) {
        Son son = new Son();
        Person father = (Person) new Father().getInstance(son);
        father.findJob();

        Person fatherProxy = (Person) Proxy.newProxyInstance(son.getClass().getClassLoader(), son.getClass().getInterfaces(), new Father(son));
        fatherProxy.findJob();
    }
}
