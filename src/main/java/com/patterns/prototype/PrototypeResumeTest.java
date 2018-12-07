package com.patterns.prototype;

/**
 * 原型模式，浅拷贝测试
 */
public class PrototypeResumeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resume = new Resume("小明", 20, false, "Beijing", "xiaoming@163.com");
        System.out.println(resume);

        //浅拷贝
        Resume clone = (Resume) resume.clone();
        System.out.println(clone);
        clone.setEmail("xiaoming@163.com.bak");
        System.out.println(resume);
        System.out.println(clone);
    }
}
