package com.patterns.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * CGLIB动态代理测试
 */
public class CglibProxyText {
    public static void main(String[] args) {
        Son proxy = (Son) new Father().getInstance(new Son());
        proxy.findJob();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Son.class);
        enhancer.setCallback(new Father());
        Son proxy2 = (Son) enhancer.create();
        proxy2.findJob();
    }
}
