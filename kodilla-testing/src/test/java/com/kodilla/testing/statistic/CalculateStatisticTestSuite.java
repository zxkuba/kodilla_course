package com.kodilla.testing.statistic;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticTestSuite {

    @Test
    public void testCalculateStatisticWithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersList = new ArrayList<>();
        usersList.add("Janek");
        usersList.add("Andrzej");
        usersList.add("Mateusz");
        usersList.add("Kot");
        usersList.add("Pies");
        usersList.add("Koń");
        when(statisticsMock.usersNames()).thenReturn(usersList);

        int posts = 1000;
        when(statisticsMock.postsCount()).thenReturn(posts);

        int comments = 0;
        when(statisticsMock.commentsCount()).thenReturn(comments);

        CalculateStatistic calculateStatistic = new CalculateStatistic();

        //When
        int test1 = statisticsMock.postsCount() / statisticsMock.usersNames().size();
        int avg = calculateStatistic.calculateAdvStatistics(statisticsMock);


        //Then
        Assert.assertEquals(test1, avg);
    }
}
