package com.patterns.factory.abstractz;

/**
 * 抽象工厂方法：
 *  围绕一个超级工厂创建其他工厂，该超级工厂又称为其他工厂的工厂
 *  提供一个创建一系列相关或相互以来对象的接口，而无需指定它们具体的类
 *  优点：
 *      当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象
 *  缺点：
 *      产品族中扩展将是一件十分费力的事情，假如产品族中要增加一个新的产品，则几乎所有的工厂类都需要进行修改
 *      所以使用抽象工厂模式时，对产品等级结构的划分是非常重要的
 */
public abstract class AbstractFactory {

    public abstract ICar create();

    public abstract IEngine build();

}
