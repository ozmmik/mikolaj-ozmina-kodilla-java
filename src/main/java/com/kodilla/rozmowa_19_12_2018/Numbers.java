package com.kodilla.rozmowa_19_12_2018;

public class Numbers {

    public static int conversion (int number) {
        int result = 0;



        while (number != 0) {
            int tempNumber = number % 10;
            number = number / 10;
            result = result * 10 + tempNumber;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(conversion(12384));
    }

}

