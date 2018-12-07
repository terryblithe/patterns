package com.patterns.factory.method;

public class AudiFactory implements CarFactory {
    @Override
    public ICar create() {
        return new Audi();
    }
}
