package com.patterns.factory.abstractz;

public class Toyota implements IEngine {
    @Override
    public void getEngine() {
        System.out.println("Toyota Engine");
    }
}
