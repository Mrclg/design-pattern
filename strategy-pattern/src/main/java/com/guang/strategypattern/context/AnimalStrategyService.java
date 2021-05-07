package com.guang.strategypattern.context;

import com.guang.strategypattern.annotation.AnimalStrategyType;
import com.guang.strategypattern.strategy.IAnimalStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 策略模式的工厂类
 */
@Service
public class AnimalStrategyService {

    private Map<Integer, IAnimalStrategy> animalStrategyMap;

    @Autowired
    public void setAnimalStrategyMap(List<IAnimalStrategy> animalStrategies) {
        // 注入各种类型的处理类
        animalStrategyMap = animalStrategies.stream().collect(
                Collectors.toMap(animalStrategy -> Objects.requireNonNull(AnnotationUtils.findAnnotation(animalStrategy.getClass(), AnimalStrategyType.class)).type(),
                        v -> v, (v1, v2) -> v1));
    }

    public String dealBusiness(int type) {
        return animalStrategyMap.get(type).dealBusiness("-" + type);
    }

}
