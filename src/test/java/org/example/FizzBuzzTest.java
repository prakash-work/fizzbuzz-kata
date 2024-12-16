package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @ParameterizedTest
    @CsvSource({"1,1",
            "2,2",
            "3,Fizz",
            "4,4",
            "5,Buzz",
            "6,Fizz",
            "7,7",
            "8,8",
            "9,Fizz",
            "10,Buzz",
            "15,FizzBuzz",
            "18,Fizz",
            "20,Buzz",
            "30,FizzBuzz",
            "35,Buzz",
            "60,FizzBuzz"})
    void convert_number_to_fizz_buzz(int inputValue, String expectedValue) {
        String actualValue = FizzBuzz.convert(inputValue);
        assertEquals(expectedValue, actualValue);
    }
}