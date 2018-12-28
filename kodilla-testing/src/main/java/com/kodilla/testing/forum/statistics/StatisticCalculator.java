package com.kodilla.testing.forum.statistics;

public class StatisticCalculator {
    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private double userAveragePosts;
    private double userAverageComments;
    private double averageCommentsPerPost;


    public void calculateAdvStatistics(Statistics statistics) {
        this.usersNumber = statistics.usersNames().size();
        this.postsNumber = statistics.postCount();
        this.commentsNumber = statistics.commentsCount();
        if (usersNumber > 0) {
            this.userAveragePosts = postsNumber / usersNumber;
            this.userAverageComments = commentsNumber / usersNumber;
        }
        if (commentsNumber > 0) {
            this.averageCommentsPerPost = (double)postsNumber / commentsNumber;
        }
    }

    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getUserAveragePosts() {
        return userAveragePosts;
    }

    public double getUserAverageComments() {
        return userAverageComments;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public String showStatistics(){
        return "" + "Users Number: " + usersNumber + " posts number: " + postsNumber +
                " comments bumber: " + " comments number: " + commentsNumber + " user average posts: " + userAveragePosts
                + " user average comments: " + userAverageComments + " average comments per post: " + averageCommentsPerPost;
    }
}
