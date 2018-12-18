package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;


public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
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
    public void testOddNumbersExterminatorList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> list = new ArrayList<>();
        //When
        ArrayList<Integer> resultsList = oddNumbersExterminator.exterminate(list);
        System.out.println("Testing list " + resultsList);
        //Then
        Assert.assertEquals(0, resultsList.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> list = new ArrayList<>();
        //When
        ArrayList<Integer> resultsList = oddNumbersExterminator.exterminate(list);
        for (int i = 0; i < 50; i++){
            resultsList.add(i);
        }
        System.out.println("Testing list: " + resultsList);
        //Then
        Assert.assertNotEquals(oddNumbersExterminator.exterminate(resultsList), resultsList);
    }
}
