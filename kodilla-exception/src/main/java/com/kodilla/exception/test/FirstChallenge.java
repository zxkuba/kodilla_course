package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) {
        if (b == 0)
            throw new ArithmeticException("Nie dzielimy przez 0");
        else
            return a / b;
    }
}