package com.patterns.factory.method;

public class BenzFactory implements CarFactory {
    @Override
    public ICar create() {
        return new Benz();
    }
}
