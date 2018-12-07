package com.patterns.factory.abstractz;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractFactory audiFactory = new AudiFactory();
        audiFactory.build().getEngine();
        audiFactory.create().getCar();

        AbstractFactory benzFactory = new BenzFactory();
        benzFactory.build().getEngine();
        benzFactory.create().getCar();

        AbstractFactory jeepFactory = new JeepFactory();
        jeepFactory.build().getEngine();
        jeepFactory.create().getCar();
    }

}
