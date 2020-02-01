package com.kodilla.exception.test;

public class MainSecondChallenge {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        try{
            secondChallenge.probablyIWillThrowException(1, 1);
        }catch (ExceptionHandling e){
            System.out.println("Nie działa");
        }

    }
}
