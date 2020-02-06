
package com.kodilla.testing.statistic;

public class CalculateStatistic {



    int avgPostPerUser;
    int avgCommentPerUser;
    int avgCommentPerPost;


    public int calculateAdvStatistics(Statistics statistics){
        /**
         * Nie wiem jak ma to wszystko zwrócić w jednej metodzie.
         */
        avgPostPerUser = statistics.postsCount()/statistics.usersNames().size();

        //avgCommentPerUser = statistics.commentsCount()/statistics.usersNames().size();
       //avgCommentPerPost = statistics.commentsCount()/statistics.postsCount();

        return avgPostPerUser;

    }

}
