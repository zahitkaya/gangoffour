package com.example.gof.creational_patterns.abstract_factory;

import com.example.gof.creational_patterns.abstract_factory.guru.BaseCheeseFactory;
import com.example.gof.creational_patterns.abstract_factory.guru.TurkeyCheeseFactory;
import com.example.gof.creational_patterns.abstract_factory.guru.product.Cheese;
import org.junit.jupiter.api.Test;


public class TurkeyCheeseFactoryTest {
    @Test
    public void testCreatePizza() throws Exception {
    //BaseToppingFactory baseToppingFactory;
    BaseCheeseFactory baseCheeseFactory = new TurkeyCheeseFactory();
    Cheese cheese = baseCheeseFactory.createCheese("ezine");
}
}