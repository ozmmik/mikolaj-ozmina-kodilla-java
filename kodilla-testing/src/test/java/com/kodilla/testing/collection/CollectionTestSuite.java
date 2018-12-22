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

            list.add(0);
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(6);
            list.add(7);
            list.add(8);
            list.add(9);
            list.add(10);

        System.out.println("Testing numberList: " + list);
        //Then
        ArrayList<Integer> checkList = new ArrayList<>();

            checkList.add(0);
            checkList.add(2);
            checkList.add(4);
            checkList.add(6);
            checkList.add(8);
            checkList.add(10);

        ArrayList<Integer> evenList = oddNumbersExterminator.exterminate(list);

        Assert.assertEquals(checkList,evenList);
    }
}
