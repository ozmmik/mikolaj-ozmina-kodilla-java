package com.kodilla.testing.Numbers;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestNumbersSuite {
    @Test
    public void testNumber(){
        // Given
        Numbers number = new Numbers();
        List<Integer> listNumber = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 2);

        // When
        int numberCheck = number.numberCheck(listNumber);

        // Then
        Assert.assertEquals(2, numberCheck);
    }
    /*@Test
    public void testNumberTwo(){
        // Given
        Numbers number = new Numbers();
        List<Integer> listNumber = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 2);

        // When
        int numberCheck = number.numberCheck(listNumber);

        // Then
        Assert.assertEquals(2, numberCheck);
    }*/
}
