package com.guang.strategypattern.strategy;

/**
 * 策略模式的接口类
 */
public interface IAnimalStrategy {

    /**
     * 业务方法
     * @param name
     * @return
     */
    String dealBusiness(String name);

}
