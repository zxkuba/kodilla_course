package com.kodilla.testing.collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

public class OtherSolutionOddNumbersExterminatorTest {

    @Test
    public void exterminate2WhenEmpty(){
        //Given
        OtherSolutionOddNumbersExterminator other = new OtherSolutionOddNumbersExterminator();
        ArrayList<Integer> test = new ArrayList<>();
        //When
        List<Integer> result = other.exterminate2(test);
        //Then
        Assert.assertEquals(test, result);
    }

    @Test
    public void exterminate2Sort() {
        //Given
        OtherSolutionOddNumbersExterminator other = new OtherSolutionOddNumbersExterminator();
        List<Integer> test = Arrays.asList(25, 85,18,24,70,14,19);
        List<Integer> expectedList = Arrays.asList(18, 24, 70, 14);
        //When
        List<Integer> result = other.exterminate2(test);
        //Then
        Assert.assertEquals(expectedList, result);

    }
}
