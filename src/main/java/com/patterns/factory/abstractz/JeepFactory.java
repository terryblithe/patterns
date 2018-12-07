package com.patterns.factory.abstractz;

public class JeepFactory extends AbstractFactory {
    @Override
    public ICar create() {
        return new Jeep();
    }

    @Override
    public IEngine build() {
        return new Honda();
    }
}
