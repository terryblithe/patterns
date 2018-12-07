package com.patterns.strategy.caocao;

/**
 * 策略模式：曹操选择逃跑路线测试
 */
public class CaocaoStrategyTest {

    public static void main(String[] args) {
        /**
         * 曹操选择了华容道逃跑
         */
        IRunStrategy huaRong = new HuarongRoute();
        EscapeStategy escapeStategy = new EscapeStategy(huaRong);
        escapeStategy.choiceRoad();
    }
}
