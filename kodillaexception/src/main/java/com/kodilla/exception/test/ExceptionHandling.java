package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            double y = 0.0;
            double x = 0.0;
            secondChallenge.probablyIWillThrowException(x,y);
        } catch (Exception e){
            System.out.println("Yupi");
        }
    }
}
