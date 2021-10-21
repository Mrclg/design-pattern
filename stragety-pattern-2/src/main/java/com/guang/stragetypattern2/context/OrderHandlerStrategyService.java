package com.guang.stragetypattern2.context;

import com.guang.stragetypattern2.annotation.OrderHandlerStrategyTypeImpl;
import com.guang.stragetypattern2.dto.Order;
import com.guang.stragetypattern2.strategy.IOrderHandlerStrategy;
import com.guang.stragetypattern2.annotation.OrderHandlerStrategyType;
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
public class OrderHandlerStrategyService {

    private Map<OrderHandlerStrategyType, IOrderHandlerStrategy> orderStrategyMap;

    @Autowired
    public void setOrderStrategyMap(List<IOrderHandlerStrategy> orderStrategies) {
        // 注入各种类型的处理类
        orderStrategyMap = orderStrategies.stream().collect(
                Collectors.toMap(orderStrategy -> Objects.requireNonNull(AnnotationUtils.findAnnotation(orderStrategy.getClass(), OrderHandlerStrategyType.class)),
                        v -> v, (v1, v2) -> v1));
    }

    public String dealBusiness(Order order) {
        OrderHandlerStrategyType orderHandlerType = new OrderHandlerStrategyTypeImpl(order.getSource(), order.getPayType());
        IOrderHandlerStrategy orderHandlerStrategy = orderStrategyMap.get(orderHandlerType);
        return orderHandlerStrategy.dealBusiness(order);
    }

}
