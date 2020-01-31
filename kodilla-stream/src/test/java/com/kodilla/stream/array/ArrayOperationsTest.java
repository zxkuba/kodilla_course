package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOperationsTest {

    @Test
    public void getAverage() {
        //Give

        int numbers[] = {2, 5, 35, 31, 58, 59, 48};


        //When

        double result = ArrayOperations.getAverage(numbers);

        //Then

        Assert.assertEquals(34.0, result, 0.001);
    }
}