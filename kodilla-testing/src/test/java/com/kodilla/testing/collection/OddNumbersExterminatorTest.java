package com.kodilla.testing.collection;


import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * Nie wiem jak te testy napisać, szczególnie ten testOddNumbersExterminatorEmptyList(),
 * natomiast testOddNumbersExterminatorNormalList() //Given //When ok ale asercja powinna być boolean?
         */
public class OddNumbersExterminatorTest {

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> zero = new ArrayList<>();
        ArrayList<ArrayList<Integer>> test = oddNumbersExterminator.exterminate(zero);
        //Then
        Assert.assertEquals(zero, test);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> random = new ArrayList<>();
        Random random1 = new Random();
        for(int n=0; n<20; n++){
            random.add(random1.nextInt(20));
        }
        ArrayList<ArrayList<Integer>> test = oddNumbersExterminator.exterminate(random);
        //Then

    }
}