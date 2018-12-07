package com.patterns.strategy.travel;

public class Car implements ITravel {
    @Override
    public void travelWay() {
        System.out.println("自驾游");
    }
}
