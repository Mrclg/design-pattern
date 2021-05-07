package com.guang.stragetypattern2;

import com.guang.stragetypattern2.context.OrderHandlerStrategyService;
import com.guang.stragetypattern2.dto.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StrategyPattern2Application.class)
public class TestService {

    @Autowired
    private OrderHandlerStrategyService orderHandlerStrategyService;

    @Test
    public void testStrategy(){
        System.out.println(orderHandlerStrategyService.dealBusiness(new Order("1001", "pc", "alipay")));
        System.out.println(orderHandlerStrategyService.dealBusiness(new Order("1002", "mobile", "wxpay")));
    }
}
