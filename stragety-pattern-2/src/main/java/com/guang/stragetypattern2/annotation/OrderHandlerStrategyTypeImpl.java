package com.guang.stragetypattern2.annotation;

import com.guang.stragetypattern2.annotation.OrderHandlerStrategyType;

import java.lang.annotation.Annotation;

public class OrderHandlerStrategyTypeImpl implements OrderHandlerStrategyType {

    private String source;

    private String payType;

    public OrderHandlerStrategyTypeImpl(String source, String payType) {
        this.source = source;
        this.payType = payType;
    }

    @Override
    public String source() {
        return source;
    }

    @Override
    public String payType() {
        return payType;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return OrderHandlerStrategyType.class;
    }


    @Override
    public int hashCode() {
        int hashCode = 0;
        hashCode += (127 * "source".hashCode()) ^ source.hashCode();
        hashCode += (127 * "payType".hashCode()) ^ payType.hashCode();
        return hashCode;
    }


    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof OrderHandlerStrategyType)) {
            return false;
        }
        OrderHandlerStrategyType other = (OrderHandlerStrategyType) obj;
        return source.equals(other.source()) && payType.equals(other.payType());
    }

}
