package com.kodilla.testing.collection;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

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
        ArrayList<ArrayList<Integer>> test = oddNumbersExterminator.exterminate(null);
        //Then
        Assert.assertEquals(null, test);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){

    }
}