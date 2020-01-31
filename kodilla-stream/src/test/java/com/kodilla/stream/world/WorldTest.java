package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.Assert.*;

public class WorldTest {

    @Test
    public void getPeopleQuantity() {
        //Given

        Country poland = new Country("Polska", new BigDecimal("38000000"));
        Country germany = new Country("Niemcy", new BigDecimal("86000000"));
        Country italy = new Country("Włochy", new BigDecimal("68000000"));
        Country tajland = new Country("Tajladnia", new BigDecimal("1250000000"));
        Country china = new Country("Chiny", new BigDecimal("25000000000"));
        Country korea = new Country("Korea", new BigDecimal("4580000000"));
        Country usa = new Country("USA", new BigDecimal("254179600000"));
        Country canada = new Country("Kanada", new BigDecimal("5840000000"));

        Continent europe = new Continent("Europa", Arrays.asList(poland, germany, italy));
        Continent asia = new Continent("Azja", Arrays.asList(tajland, china, korea));
        Continent america = new Continent("Ameryka", Arrays.asList(usa, canada));

        World world =new World(Arrays.asList(europe, asia, america));

        //When

        BigDecimal result = world.getPeopleQuantity();

        //Then
        BigDecimal total = new BigDecimal("291041600000");
        Assert.assertEquals(total, result);


    }
}