package com.example.test.kata.clock;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class CalculatorTest {

  @Test
  public void getMatchCount() {

    Calculator cal = new Calculator();

    int matchCount = cal.getMatchCount();

    assertThat(22 == matchCount);
  }
}