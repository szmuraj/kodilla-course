package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //Calculator
        Calculator calculator = new Calculator(5,4);

        int resultA = calculator.getAdd();
        int resultB = calculator.getSubstract();

        if (resultA == 9) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        if (resultB == 1) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}