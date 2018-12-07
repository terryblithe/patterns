package com.patterns.factory.simple;

/**
 * 简单工厂模式（静态工厂模式）：
 *  由一个工厂对象根据收到的消息决定要创建哪一个类的对象实例
 *  优点：
 *      工厂类中包含了必要的逻辑，根据客户需要的逻辑（if或switch）动态实例化相关的类
 *  缺点：
 *      扩展性差
 *      不同的产品需要不同额外参数的时候不支持
 */
public class CarFactory {

    public static ICar create(String name) {
        if ("audi".equalsIgnoreCase(name)) {
            return new Audi();
        } else if ("benz".equalsIgnoreCase(name)) {
            return new Benz();
        } else if ("jeep".equalsIgnoreCase(name)) {
            return new Jeep();
        } else {
            return new ICar() {
                @Override
                public void getCar() {
                    System.out.println("奥拓 Car");
                }
            };
        }
    }

}
