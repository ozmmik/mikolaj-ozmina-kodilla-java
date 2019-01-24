package com.kodilla.stream.nauka;

import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public long getCountEmptyStringUsingJava8(List<String> strings){
        return strings.stream()
                .filter(string -> string.length() == 0)
                .count();
    }
    public List<String> deleteEmptyStringsUsingJava8(List<String> strings){
        return strings.stream()
                .filter(string -> string.length() != 0)
                .collect(Collectors.toList());
    }
    public int getMaxJava8(List<Integer> numbers){
        return numbers.stream()
                .mapToInt(digit -> digit)
                .max()
                .orElse(0);
    }
}
