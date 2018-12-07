package com.patterns.prototype;

/**
 * 原型模式（浅拷贝）：
 *  用原型实例指定创建对象的中类，并且通过复制这些原型创建新的对象
 *  浅拷贝：8种基本类型+String类型，其它引用类型是共享使用
 *  深拷贝：所有类型都是独立的
 *  优点：
 *      如果创建新的对象比较复杂，可以利用原型模式简化对象的创建过程，同时也能提高效率
 *      可以使用深拷贝保持对象的状态
 *      原型模式提供了简化的创建结构
 *      扩展性好
 *  缺点：
 *      实现深拷贝的时候可能需要比较复杂的代码
 *      需要为每一个类配备一个拷贝方法，而且这个拷贝方法需要对类的功能进行通盘考虑，
 *      这对全新的类来说不是很难，但对已有的类进行改造时，不一定是件容易的事，必须修改其源代码，
 *      违背了“开闭原则”
 *  使用场景：
 *      如果创建新对象成本较大，可以利用已有的对象进行复制来获得
 *      系统要保存对象的状态，而对象的状态很小
 *      需要避免使用分层次的工厂类来创建分层次的对象，并且类的实例对象只有一个或很少的组合状态，
 *      通过复制原型对象得到新实例可以比使用构造函数创建一个新实例更加方便
 *
 *
 */
public class Resume implements Cloneable {

    private String name;
    private int age;
    private boolean sex;
    private String address;
    private String email;

    public Resume(String name, int age, boolean sex, String address, String email) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
