package com.patterns.strategy.caocao;

public class HighRoute implements IRunStrategy {
    @Override
    public void escapeRoute() {
        System.out.println("走大陆逃跑");
    }
}
