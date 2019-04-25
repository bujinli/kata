package com.example.test.kata.fizzbuzz;

public class Fizzbuzz {

  public static final String FIZZ = "FIZZ";
  public static final String BUZZ = "BUZZ";
  public static final String FIZZBUZZ = "FIZZBUZZ";

  public String play(int inputNumber) {

    if (inputNumber % 15 == 0) {
      return FIZZBUZZ;
    }
    if (inputNumber % 3 == 0) {
      return FIZZ;
    } else if (inputNumber % 5 == 0) {
      return BUZZ;
    }

    return String.valueOf(inputNumber);
  }
}
