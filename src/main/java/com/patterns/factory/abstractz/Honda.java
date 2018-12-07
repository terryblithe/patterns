package com.patterns.factory.abstractz;

public class Honda implements IEngine {
    @Override
    public void getEngine() {
        System.out.println("Honda Engine");
    }
}
