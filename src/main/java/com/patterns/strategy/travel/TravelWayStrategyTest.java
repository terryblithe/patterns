package com.patterns.strategy.travel;

/**
 * 旅游策略模式测试
 */
public class TravelWayStrategyTest {

    public static void main(String[] args) {
        ITravel iTravel = new Car();
        TravelStrategy travelStrategy = new TravelStrategy(iTravel);
        travelStrategy.choiceTravelWay();
    }
}
