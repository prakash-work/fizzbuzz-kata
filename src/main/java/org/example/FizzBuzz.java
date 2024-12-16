package org.example;

public class FizzBuzz {
    public static String convert(Integer number) {
        if(isDivisibleByThreeAndFive(number)){
            return "FizzBuzz";
        }
        if(isDivisibleByThree(number)) {
            return "Fizz";
        }
        if(isDivisibleByFive(number)) {
            return "Buzz";
        }
        return number.toString();
    }

    private static boolean isDivisibleByFive(Integer number) {
        return number % 5 == 0;
    }

    private static boolean isDivisibleByThree(Integer number) {
        return number % 3 == 0;
    }

    private static boolean isDivisibleByThreeAndFive(Integer number) {
        return number % 3 == 0 && number % 5 == 0;
    }
}
