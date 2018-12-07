package com.patterns.strategy.travel;

public class Train implements ITravel {
    @Override
    public void travelWay() {
        System.out.println("做火车旅行");
    }
}
