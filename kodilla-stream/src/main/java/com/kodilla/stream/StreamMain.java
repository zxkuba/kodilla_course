package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;


public class StreamMain {

    public static void main(String[] args) {

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, ((a, b) -> a+b));
        expressionExecutor.executeExpression(10, 5, (a,b) -> a-b);
        expressionExecutor.executeExpression(10, 5,(a, b)-> a*b);
        expressionExecutor.executeExpression(10, 5, (a,b)-> a/b);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Zima", ((str -> str.toUpperCase())));
        poemBeautifier.beautify("Lato", (str -> str + "ABC"));
        poemBeautifier.beautify("Wiosna", (str -> str.toLowerCase()));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }
}
