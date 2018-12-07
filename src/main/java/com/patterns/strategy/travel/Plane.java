package com.patterns.strategy.travel;

public class Plane implements ITravel {
    @Override
    public void travelWay() {
        System.out.println("做飞机旅行");
    }
}
