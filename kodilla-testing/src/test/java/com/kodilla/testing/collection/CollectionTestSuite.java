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
        ArrayList<Integer> numberList = oddNumbersExterminator.exterminate(list);
        System.out.println("Testing list " + numberList);
        //Then
        Assert.assertEquals(0, numberList.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> list = new ArrayList<>();
        //When
        ArrayList<Integer> numberList = oddNumbersExterminator.exterminate(list);
            numberList.add(0);
            numberList.add(1);
            numberList.add(2);
            numberList.add(3);
            numberList.add(4);
            numberList.add(5);
            numberList.add(6);
            numberList.add(7);
            numberList.add(8);
            numberList.add(9);
            numberList.add(10);

        System.out.println("Testing list: " + numberList);
        //Then
        ArrayList<Integer> evenList = oddNumbersExterminator.exterminate(numberList);
        Assert.assertNotEquals(evenList, numberList);
    }
}
