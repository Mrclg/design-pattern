package com.guang.strategypattern.strategy;

import com.guang.strategypattern.annotation.AnimalStrategyType;

/**
 * 狗类的策略模式的实现类
 */
@AnimalStrategyType(type = 2)
public class DogStrategy implements IAnimalStrategy {

    @Override
    public String dealBusiness(String name) {
        return "狗类的实现类" + name;
    }

}
