package com.kodilla.testing.collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.*;

public class OtherSolutionOddNumbersExterminatorTest {

    @Test
    public void exterminate2WhenEmpty(){
        //Given
        OtherSolutionOddNumbersExterminator other = new OtherSolutionOddNumbersExterminator();
        //When
        ArrayList<Integer> test = new ArrayList<>();
        ArrayList<Integer> xz = other.exterminate2(test);
        //Then
        Assert.assertEquals(test, xz);
    }

    @Test
    public void exterminate2Sort() {
        //Given
        OtherSolutionOddNumbersExterminator other = new OtherSolutionOddNumbersExterminator();
        //When
        ArrayList<Integer> test = new ArrayList<>();
        Random random = new Random();
        for (int n = 0; n < 20; n++) {
            test.add(random.nextInt(20));
        }
        ArrayList<Integer> zx = other.exterminate2(test);
        //Then
        Assert.assertEquals(test, zx);

    }
}
