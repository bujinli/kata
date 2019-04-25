package com.example.test.kata.fizzbuzz;

import static com.example.test.kata.fizzbuzz.Fizzbuzz.BUZZ;
import static com.example.test.kata.fizzbuzz.Fizzbuzz.FIZZ;
import static com.example.test.kata.fizzbuzz.Fizzbuzz.FIZZBUZZ;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class FizzbuzzTest {

  private Fizzbuzz fb = new Fizzbuzz();

  @Test
  public void test_fizz() {
    assertThat(fb.play(3)).isEqualTo(FIZZ);
  }

  @Test
  public void test_buzz() {
    assertThat(fb.play(5)).isEqualTo(BUZZ);
  }

  @Test
  public void test_fizz_buzz() {
    assertThat(fb.play(15)).isEqualTo(FIZZBUZZ);
  }

  @Test
  public void test_no_nomarl() {
    int inputNumber = 1;
    assertThat(fb.play(inputNumber)).isEqualTo("1");
  }
}