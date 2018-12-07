package com.patterns.factory.simple;

import java.util.concurrent.Callable;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        ICar audi = CarFactory.create("audi");
        audi.getCar();

        ICar jeep = CarFactory.create("jeep");
        jeep.getCar();

        ICar benz = CarFactory.create("Benz");
        benz.getCar();

        ICar other = CarFactory.create("other");
        other.getCar();
    }

}
