package com.patterns.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理：
 *  1.被代理类（目标类）必须实现接口
 *  2.代理类实现InvocationHandler或者使用匿名类
 *  3.需要持有被代理类（目标类）对象的引用
 *  优点：
 *      代理对象无需实现接口，免去了编写很多代理类的烦恼，同时接口增加方法也无需再维护目标对象和代理对象，
 *      只需在事件处理器中添加对方法的判断即可
 *  缺点：
 *      代理对象不需要实现接口，但是目标对象一定要实现接口，否则无法使用JDK动态代理
 */
public class Father implements InvocationHandler {

    private Person person;

    public Father() {

    }

    public Father(Person person) {
        this.person = person;
    }

    public Object getInstance(Person person) {
        this.person = person;
        Class<? extends Person> clazz = person.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(person, args);
        System.out.println("Father will help you find a very good job, Don't give up!");
        return null;
    }
}
