package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String results = simpleUser.getUsername();

        if (results.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // *** Kolejny test ***

        Calculator calculator = new Calculator();

        int add = calculator.add(5, 4);
        int sub = calculator.substract(10, 5);

        System.out.println("Add: " + add + " Substract: " + sub);


    }

}
