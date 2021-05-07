package com.guang.stragetypattern2.dto;

import lombok.Data;

@Data
public class Order {

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 来源
     */
    private String source;

    /**
     * 支付方式
     */
    private String payType;

    public Order(String orderNo, String source, String payType) {
        this.orderNo = orderNo;
        this.source = source;
        this.payType = payType;
    }
}
