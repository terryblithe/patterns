package com.patterns.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLIB动态代理：
 *  针对类来实现代理，通过继承对指定目标产生一个子类，通过方法拦截技术拦截所有父类方法的调用
 *  被代理类（目标类）无需实现接口，但必须不是final类
 */
public class Father implements MethodInterceptor {


    public Object getInstance(Object object) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(object.getClass());
        enhancer.setCallback(this);

        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        methodProxy.invokeSuper(o, objects);
        System.out.println("Dear, I will help you find a very good job!");
        return null;
    }
}
