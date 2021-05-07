package com.guang.stragetypattern2.strategy;

import com.guang.stragetypattern2.dto.Order;

/**
 * 策略模式的接口类
 */
public interface IOrderHandlerStrategy {

    /**
     * 业务方法
     * @param order
     * @return
     */
    String dealBusiness(Order order);

}
