package com.kodilla.testing;

import com.kodilla.testing.user.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();

        if(result.equals("theForumUser")){
            System.out.println("Test OK");
        }else{
            System.out.println("Error");
        }

        Calculator calculator = new Calculator();

        int test1 = calculator.add(24, 64);
        int test2 = calculator.subtract(64, 24);

         int result1 = calculator.add(24, 64);
         int result2 = calculator.subtract(64, 24);

       if(test1 == result1 && test2 == result2){
           System.out.println("alleluja i do przodu");
       }else {
           System.out.println("Error");
       }
    }
}
