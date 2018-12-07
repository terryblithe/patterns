package com.patterns.factory.abstractz;

public class BenzFactory extends AbstractFactory {
    @Override
    public ICar create() {
        return new Benz();
    }

    @Override
    public IEngine build() {
        return new Toyota();
    }
}
