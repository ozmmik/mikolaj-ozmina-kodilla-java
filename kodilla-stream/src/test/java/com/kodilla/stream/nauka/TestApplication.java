package com.kodilla.stream.nauka;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestApplication {
    @Test
    public void testCountEmptyStringUsingJava8() {
        //given
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        //when
        Application app = new Application();
        long count = app.getCountEmptyStringUsingJava8(strings);
        //then
        Assert.assertEquals(2, count);
    }
    @Test
    public void testDeleteEmptyStringsUsingJava8() {
        //given
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> expected = Arrays.asList("abc", "bc", "efg", "abcd", "jkl");
        Application app = new Application();
        //when
        List<String> result = app.deleteEmptyStringsUsingJava8(strings);
        //then
        Assert.assertEquals(5, result.size());
        Assert.assertEquals(expected, result);
    }
    @Test
    public void testMaxJava8() {
        //given
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        Integer expected = 7;
        Application app = new Application();
        //when
        Integer result = app.getMaxJava8(numbers);
        //then
        Assert.assertEquals(expected, result);
    }
}
