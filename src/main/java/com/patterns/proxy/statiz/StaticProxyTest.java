package com.patterns.proxy.statiz;

/**
 * 静态代理测试类
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        Son son = new Son();
        Father father = new Father(son);
        father.findJob();
    }

}
