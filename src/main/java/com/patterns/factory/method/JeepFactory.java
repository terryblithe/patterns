package com.patterns.factory.method;

public class JeepFactory implements CarFactory {
    @Override
    public ICar create() {
        return new Jeep();
    }
}
