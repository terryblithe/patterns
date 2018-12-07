package com.patterns.template.bank;

/**
 * 模板模式
 */
public abstract class BankTemplate {

    /**
     * 取号排队
     */
    public void getNum() {
        System.out.println("取号排队");
    }

    /**
     * 办理业务
     */
    public abstract void business();

    /**
     * 评分
     */
    public void score() {
        System.out.println("评价，打分");
    }

    public void process() {
        getNum();
        business();
        score();
    }

}
