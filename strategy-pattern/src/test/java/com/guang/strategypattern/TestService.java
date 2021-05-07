package com.guang.strategypattern;

import com.guang.strategypattern.context.AnimalStrategyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StrategyPatternApplication.class)
public class TestService {

    @Autowired
    private AnimalStrategyService animalStrategyService;

    @Test
    public void testStrategy(){
        System.out.println(animalStrategyService.dealBusiness(1));
        System.out.println(animalStrategyService.dealBusiness(2));
    }
}
