package com.patterns.proxy.statiz;

/**
 * 静态代理：
 *  1.同接口：代理类和被代理类（目标类）都需要实现相同的接口
 *  2.对象引用：代理类需要持有被代理类（目标类）的引用
 *  3.代理类完成代理：通过调用代理类的方法，实现被代理类（目标类）方法的增强
 *  优点：
 *      扩展原功能，不侵入原代码
 *  缺点：
 *      当代理很多不同的方法时，会重复创建很多相同的逻辑，导致代理类十分繁多，不易维护，
 *      同时，一旦接口方法增加，则被代理类（目标类）和代理类都需要维护
 *
 */
public class Father implements Person {

    private Person person;

    public Father(Person person) {
        this.person = person;
    }

    @Override
    public void findJob() {
        person.findJob();
        System.out.println("-------------------------------");
        System.out.println("Son, Father help you find a job");
        System.out.println("I help you find a very good Job");
    }

}
