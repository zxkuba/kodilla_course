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
        ArrayList<Integer> random = new ArrayList<>();
        random.add(5);
        random.add(8);
        random.add(10);
        random.add(3);
        //When
        ArrayList<ArrayList<Integer>> test2 = oddNumbersExterminator.exterminate(random);
        ArrayList<Integer> randomEven = new ArrayList<>();
        randomEven.add(8);
        randomEven.add(10);
        //Then
        Assert.assertEquals(randomEven, test2);

        }
    }

