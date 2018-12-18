package com.kodilla.testing.collection;

import java.util.*;

class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        for (Integer numberCheck : numbers){
            if (numberCheck % 2 == 0) {
                evenNumbers.add(numberCheck);
            }
        }
        return evenNumbers;
    }
}
