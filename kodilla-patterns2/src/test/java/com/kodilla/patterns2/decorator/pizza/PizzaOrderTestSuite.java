package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaWithHamAndPineappleGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HamDecorator(theOrder);
        theOrder = new PineappleDecorator(theOrder);

        System.out.println(theOrder.getCost());
        //When
        BigDecimal theOrderCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(19), theOrderCost);
    }
    @Test
    public void testPizzaWithHamAndPineappleGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HamDecorator(theOrder);
        theOrder = new PineappleDecorator(theOrder);

        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with souse and cheese, ham, pineapple", description);
    }
}
