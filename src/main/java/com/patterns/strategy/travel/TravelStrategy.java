package com.patterns.strategy.travel;

/**
 * 策略模式：
 *  是一种行为模式，是对算法的封装
 *  过程不同，但是结果相同
 *
 *  优点:
 *      结构清晰，把策略分离成一个个单独的类[替换了传统的if else]
 *      代码耦合度降低，安全性提高[各个策略的细节被屏蔽]
 *  缺点：
 *      客户端必须要知道所有的策略类，否则不知道使用那个策略，所以策略模式适用于提前知道所有策略的情况下
 *      增加了类的编写，本来只需要if else即可
 *
 */
public class TravelStrategy {

    private ITravel iTravel;

    public TravelStrategy(ITravel iTravel) {
        this.iTravel = iTravel;
    }

    public void choiceTravelWay() {
        iTravel.travelWay();
    }
}
