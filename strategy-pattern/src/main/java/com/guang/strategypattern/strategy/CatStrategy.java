package com.guang.strategypattern.strategy;

import com.guang.strategypattern.annotation.AnimalStrategyType;

/**
 * 猫类的策略模式实现类
 */
@AnimalStrategyType(type = 1)
public class CatStrategy implements IAnimalStrategy {

    @Override
    public String dealBusiness(String name) {
        return "猫类的实现类" + name;
    }

}
