package com.patterns.factory.method;

public class MethodFactoryTest {

    public static void main(String[] args) {
        ICar audi = new AudiFactory().create();
        audi.getCar();

        ICar benz = new BenzFactory().create();
        benz.getCar();

        ICar jeep = new JeepFactory().create();
        jeep.getCar();
    }

}
