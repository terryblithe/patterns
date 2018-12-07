package com.patterns.strategy.caocao;

/**
 * 持有IRunStrategy的引用
 */
public class EscapeStategy {

    private IRunStrategy iRunStrategy;

    public EscapeStategy(IRunStrategy iRunStrategy) {
        this.iRunStrategy = iRunStrategy;
    }

    /**
     * 选择逃跑路线
     */
    public void choiceRoad() {
        iRunStrategy.escapeRoute();
    }
}
