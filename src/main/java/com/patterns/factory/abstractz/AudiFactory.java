package com.patterns.factory.abstractz;

public class AudiFactory extends AbstractFactory {
    @Override
    public ICar create() {
        return new Audi();
    }

    @Override
    public IEngine build() {
        return new Kangmings();
    }
}
