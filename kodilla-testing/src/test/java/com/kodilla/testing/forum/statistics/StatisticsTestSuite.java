package com.kodilla.testing.forum.statistics;


import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class StatisticsTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: end");
    }

    @Test
    public void testCalculateAdvStatisticsPosts0(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticCalculator statisticCalculator = new StatisticCalculator();

        List<String> usersNames = new ArrayList<>();
            usersNames.add("user1");
            usersNames.add("user2");
            usersNames.add("user3");
            usersNames.add("user4");
            usersNames.add("user5");
        int postNumber = 0;
        int commentsNumber = 0;

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postCount()).thenReturn(postNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        statisticCalculator.calculateAdvStatistics(statisticsMock);

        //When
        double userAveragePosts = statisticCalculator.getUserAveragePosts();
        double userAverageComments = statisticCalculator.getUserAverageComments();
        double averageCommentsPerPost = statisticCalculator.getAverageCommentsPerPost();

        System.out.println("Testing posts: " + postNumber);

        //Then
        Assert.assertEquals(0, userAveragePosts, 0.01);
        Assert.assertEquals(0, userAverageComments, 0.01);
        Assert.assertEquals(0, averageCommentsPerPost, 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsPosts1000(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticCalculator statisticCalculator = new StatisticCalculator();

        List<String> usersNames = new ArrayList<>();
        usersNames.add("user1");
        usersNames.add("user2");
        usersNames.add("user3");
        usersNames.add("user4");
        usersNames.add("user5");
        int postNumber = 1000;
        int commentsNumber = 50;

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postCount()).thenReturn(postNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        statisticCalculator.calculateAdvStatistics(statisticsMock);

        //When
        double userAveragePosts = statisticCalculator.getUserAveragePosts();
        double userAverageComments = statisticCalculator.getUserAverageComments();
        double averageCommentsPerPost = statisticCalculator.getAverageCommentsPerPost();

        System.out.println("Testing posts: " + postNumber);

        //Then
        Assert.assertEquals(200, userAveragePosts, 0.01);
        Assert.assertEquals(10, userAverageComments, 0.01);
        Assert.assertEquals(20, averageCommentsPerPost, 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsComments0(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticCalculator statisticCalculator = new StatisticCalculator();

        List<String> usersNames = new ArrayList<>();
        usersNames.add("user1");
        usersNames.add("user2");
        usersNames.add("user3");
        usersNames.add("user4");
        usersNames.add("user5");
        int postNumber = 1000;
        int commentsNumber = 0;

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postCount()).thenReturn(postNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        statisticCalculator.calculateAdvStatistics(statisticsMock);

        //When
        double userAveragePosts = statisticCalculator.getUserAveragePosts();
        double userAverageComments = statisticCalculator.getUserAverageComments();
        double averageCommentsPerPost = statisticCalculator.getAverageCommentsPerPost();

        System.out.println("Testing comments: " + commentsNumber);

        //Then
        Assert.assertEquals(200, userAveragePosts, 0.01);
        Assert.assertEquals(0, userAverageComments, 0.01);
        Assert.assertEquals(0, averageCommentsPerPost, 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsCommentsLessThenPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticCalculator statisticCalculator = new StatisticCalculator();

        List<String> usersNames = new ArrayList<>();
        usersNames.add("user1");
        usersNames.add("user2");
        usersNames.add("user3");
        usersNames.add("user4");
        usersNames.add("user5");
        int postNumber = 1000;
        int commentsNumber = 500;

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postCount()).thenReturn(postNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        statisticCalculator.calculateAdvStatistics(statisticsMock);

        //When
        double userAveragePosts = statisticCalculator.getUserAveragePosts();
        double userAverageComments = statisticCalculator.getUserAverageComments();
        double averageCommentsPerPost = statisticCalculator.getAverageCommentsPerPost();

        System.out.println("Testing comments < posts, comments: " + commentsNumber + " posts: " + postNumber);

        //Then
        Assert.assertEquals(200, userAveragePosts, 0.01);
        Assert.assertEquals(100, userAverageComments, 0.01);
        Assert.assertEquals(2, averageCommentsPerPost, 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsCommentsMoreThenPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticCalculator statisticCalculator = new StatisticCalculator();

        List<String> usersNames = new ArrayList<>();
        usersNames.add("user1");
        usersNames.add("user2");
        usersNames.add("user3");
        usersNames.add("user4");
        usersNames.add("user5");
        int postNumber = 500;
        int commentsNumber = 1000;

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postCount()).thenReturn(postNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        statisticCalculator.calculateAdvStatistics(statisticsMock);

        //When
        double userAveragePosts = statisticCalculator.getUserAveragePosts();
        double userAverageComments = statisticCalculator.getUserAverageComments();
        double averageCommentsPerPost = statisticCalculator.getAverageCommentsPerPost();

        System.out.println("Testing comments > posts, comments: " + commentsNumber + " posts: " + postNumber);

        //Then
        Assert.assertEquals(100, userAveragePosts, 0.01);
        Assert.assertEquals(200, userAverageComments, 0.01);
        Assert.assertEquals(0.5, averageCommentsPerPost, 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsUsers0(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticCalculator statisticCalculator = new StatisticCalculator();

        List<String> usersNames = new ArrayList<>();
        int postNumber = 1000;
        int commentsNumber = 500;

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postCount()).thenReturn(postNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        statisticCalculator.calculateAdvStatistics(statisticsMock);

        //When
        double userAveragePosts = statisticCalculator.getUserAveragePosts();
        double userAverageComments = statisticCalculator.getUserAverageComments();
        double averageCommentsPerPost = statisticCalculator.getAverageCommentsPerPost();

        System.out.println("Testing users equal: " + usersNames.size());

        //Then
        Assert.assertEquals(0, userAveragePosts, 0.01);
        Assert.assertEquals(0, userAverageComments, 0.01);
        Assert.assertEquals(2, averageCommentsPerPost, 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsUsers100(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticCalculator statisticCalculator = new StatisticCalculator();

        List<String> usersNames = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            usersNames.add("user" + i);
        }
        int postNumber = 1000;
        int commentsNumber = 500;

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postCount()).thenReturn(postNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        statisticCalculator.calculateAdvStatistics(statisticsMock);

        //When
        double userAveragePosts = statisticCalculator.getUserAveragePosts();
        double userAverageComments = statisticCalculator.getUserAverageComments();
        double averageCommentsPerPost = statisticCalculator.getAverageCommentsPerPost();

        System.out.println("Testing users equal: " + usersNames.size());

        //Then
        Assert.assertEquals(10, userAveragePosts, 0.01);
        Assert.assertEquals(5, userAverageComments, 0.01);
        Assert.assertEquals(2, averageCommentsPerPost, 0.01);
    }
}
