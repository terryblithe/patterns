package com.patterns.strategy.travel;

public class Bus implements ITravel {
    @Override
    public void travelWay() {
        System.out.println("做大巴旅行");
    }
}
