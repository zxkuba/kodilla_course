package com.kodilla.testing.statistic;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticTestSuite {

    @Test
    public void testCalculateStatisticWhenPostCountIsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistic calculateStatistic = new CalculateStatistic();

        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(userGenerator(100));
        //When

        calculateStatistic.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, calculateStatistic.getUserCount());
        Assert.assertEquals(0, calculateStatistic.getPostCount());
        Assert.assertEquals(1000, calculateStatistic.getCommentCount());
        Assert.assertEquals(0.0, calculateStatistic.getAvgPostPerUser(), 0.01);
        Assert.assertEquals(10.0, calculateStatistic.getAvgCommentPerUser(), 0.01);
        Assert.assertEquals(0.0, calculateStatistic.getAvgCommentPerPost(), 0.01);
    }
  @Test
    public void testCalculateStatisticWhenPostCountIsThousand(){
        //Given
      Statistics statisticsMock = mock(Statistics.class);
      CalculateStatistic calculateStatistic = new CalculateStatistic();
      when(statisticsMock.postsCount()).thenReturn(1000);
      when(statisticsMock.commentsCount()).thenReturn(1000);
      when(statisticsMock.usersNames()).thenReturn(userGenerator(100));

       //When
      calculateStatistic.calculateAdvStatistics(statisticsMock);
      //Then
      Assert.assertEquals(100, calculateStatistic.getUserCount());
      Assert.assertEquals(1000, calculateStatistic.getPostCount());
      Assert.assertEquals(1000, calculateStatistic.getCommentCount());
      Assert.assertEquals(10, calculateStatistic.getAvgPostPerUser(), 0.01);
      Assert.assertEquals(10.0, calculateStatistic.getAvgCommentPerUser(), 0.01);
      Assert.assertEquals(1.0, calculateStatistic.getAvgCommentPerPost(), 0.01);
  }
    @Test
    public void testCalculateStatisticWhenCommentCountIsZero(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        when(statisticsMock.usersNames()).thenReturn(userGenerator(100));
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        calculateStatistic.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, calculateStatistic.getUserCount());
        Assert.assertEquals(1000, calculateStatistic.getPostCount());
        Assert.assertEquals(0, calculateStatistic.getCommentCount());
        Assert.assertEquals(10, calculateStatistic.getAvgPostPerUser(), 0.01);
        Assert.assertEquals(0.0, calculateStatistic.getAvgCommentPerUser(), 0.01);
        Assert.assertEquals(0.0, calculateStatistic.getAvgCommentPerPost(), 0.01);
    }

    @Test
    public void testCalculateStatisticWhenMorePostThanComment(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        when(statisticsMock.usersNames()).thenReturn(userGenerator(100));
        when(statisticsMock.commentsCount()).thenReturn(500);
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        calculateStatistic.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, calculateStatistic.getUserCount());
        Assert.assertEquals(1000, calculateStatistic.getPostCount());
        Assert.assertEquals(500, calculateStatistic.getCommentCount());
        Assert.assertEquals(10, calculateStatistic.getAvgPostPerUser(), 0.01);
        Assert.assertEquals(5.0, calculateStatistic.getAvgCommentPerUser(), 0.01);
        Assert.assertEquals(0.5, calculateStatistic.getAvgCommentPerPost(), 0.01);
    }
    @Test
    public void testCalculateStatisticWhenMoreCommentThanPost(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        when(statisticsMock.usersNames()).thenReturn(userGenerator(100));
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.postsCount()).thenReturn(500);
        //When
        calculateStatistic.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, calculateStatistic.getUserCount());
        Assert.assertEquals(500, calculateStatistic.getPostCount());
        Assert.assertEquals(1000, calculateStatistic.getCommentCount());
        Assert.assertEquals(5.0, calculateStatistic.getAvgPostPerUser(), 0.01);
        Assert.assertEquals(10.0, calculateStatistic.getAvgCommentPerUser(), 0.01);
        Assert.assertEquals(2.0, calculateStatistic.getAvgCommentPerPost(), 0.01);
    }
    @Test
    public void testCalculateStatisticWhenIsZeroUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        when(statisticsMock.usersNames()).thenReturn(userGenerator(0));
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        calculateStatistic.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, calculateStatistic.getUserCount());
        Assert.assertEquals(0, calculateStatistic.getPostCount());
        Assert.assertEquals(0, calculateStatistic.getCommentCount());
        Assert.assertEquals(0.0, calculateStatistic.getAvgPostPerUser(), 0.01);
        Assert.assertEquals(0.0, calculateStatistic.getAvgCommentPerUser(), 0.01);
        Assert.assertEquals(0.0, calculateStatistic.getAvgCommentPerPost(), 0.01);
    }




    private List<String> userGenerator(int users){
        List<String> usersList = new ArrayList<>();
        for(int n=0; n<users; n++){
            usersList.add("user" + n);
        }
        return usersList;

    }




}
