package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        try { SecondChallenge.probablyIWillThrowException(1.5,1.5);
        } catch (Exception e) {
            System.out.println("And I've done it!!!");
        } finally {
            System.out.println("I tried -_-");
        }
    }
}
