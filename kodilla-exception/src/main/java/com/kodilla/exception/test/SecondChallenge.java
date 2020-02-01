package com.kodilla.exception.test;

public class SecondChallenge {

    public String probablyIWillThrowException(double x, double y) throws ExceptionHandling {
        if(x >= 2 || x < 1 || y == 1.5) {
            System.out.println("Działa");
        }else {
            throw new ExceptionHandling();
        }
        return "Done!";
    }
}
