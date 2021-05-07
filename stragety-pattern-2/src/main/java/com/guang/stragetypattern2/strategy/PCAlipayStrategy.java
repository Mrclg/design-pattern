package com.guang.stragetypattern2.strategy;

import com.guang.stragetypattern2.annotation.OrderHandlerStrategyType;
import com.guang.stragetypattern2.dto.Order;

/**
 * PC端的支付宝支付的订单的策略模式的实现类
 */
@OrderHandlerStrategyType(source = "pc", payType = "alipay")
public class PCAlipayStrategy implements IOrderHandlerStrategy {

    @Override
    public String dealBusiness(Order order) {
        return "订单号="+order.getOrderNo() + ",来源="+order.getSource() +",支付方式="+ order.getPayType();
    }

}
