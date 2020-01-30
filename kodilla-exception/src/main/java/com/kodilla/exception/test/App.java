package com.kodilla.exception.test;

public class App {

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

        try{
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        }catch (ArithmeticException r){
            System.err.println(r.getMessage());
        }finally {
            System.out.println("Dziękuje");
        }

    }
}
