
package com.kodilla.testing.statistic;

public class CalculateStatistic {


    private int userCount;
    private int postCount;
    private int commentCount;
    private double avgPostPerUser;
    private double avgCommentPerUser;
    private double avgCommentPerPost;


    public void calculateAdvStatistics(Statistics statistics){
        userCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentCount = statistics.commentsCount();

        if(postCount != 0){
            avgCommentPerPost = commentCount/(double)postCount;
        }
        if (userCount != 0){
            avgPostPerUser = postCount/(double)userCount;
            avgCommentPerUser = commentCount/(double)userCount;
        }

    }



    public int getUserCount() {
        return userCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public double getAvgPostPerUser() {
        return avgPostPerUser;
    }

    public double getAvgCommentPerUser() {
        return avgCommentPerUser;
    }

    public double getAvgCommentPerPost() {
        return avgCommentPerPost;
    }
}
