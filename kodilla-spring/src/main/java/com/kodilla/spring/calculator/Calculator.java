package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public final class Calculator {
    public double val = 0.0;
    @Autowired
    private Display display;

    public void add(double a, double b) {
        val = a + b;
        display.displayValue(val);
    }

    public void sub(double a, double b) {
        val = a - b;
        display.displayValue(val);
    }

    public void mul(double a, double b) {
        val = a * b;
        display.displayValue(val);
    }

    public void div(double a, double b) {
        val = a / b;
        display.displayValue(val);
    }
}
