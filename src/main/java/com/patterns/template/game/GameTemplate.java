package com.patterns.template.game;

/**
 * 模板模式：
 *  定义一个操作中的算法骨架，而将一些步骤延迟到子类中，模板方法使得子类可以不改变一个算法的结构即可重定义该算法
 *
 *  优点：
 *      具体细节步骤实现定义在子类中，子类定义详细处理算法是不会改变算法整体结构
 *      代码复用的基本技术，在数据库设计中尤为重要
 *      存在一种反向的控制结构，通过一个父类调用其子类的操作，通过子类对父类进行扩展增加新的行为，符合“开闭原则”
 *  缺点：
 *      每个不同的实现都需要定义一个子类，会导致类的个数增加，系统更加庞大
 */
public abstract class GameTemplate {

    /**
     * 开始游戏
     */
    public void start() {
        System.out.println("开始游戏");
    }

    /**
     * 玩游戏
     */
    public abstract void playGame();

    /**
     * 游戏结束
     */
    public void end() {
        System.out.println("游戏结束");
    }

    /**
     * 玩游戏
     */
    public void play() {
        start();
        playGame();
        end();
    }

}
