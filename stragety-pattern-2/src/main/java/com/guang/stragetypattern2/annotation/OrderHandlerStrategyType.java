package com.guang.stragetypattern2.annotation;

import org.springframework.stereotype.Service;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Service
public @interface OrderHandlerStrategyType {

    /**
     * 订单来源
     * @return
     */
    String source();

    /**
     * 支付方式
     * @return
     */
    String payType();


    /**
     * ......
     * 其他决定策略的因素
     */

}
