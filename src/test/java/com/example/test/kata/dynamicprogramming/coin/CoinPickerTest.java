package com.example.test.kata.dynamicprogramming.coin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class CoinPickerTest {

  private CoinPicker coinPicker = new CoinPicker();

  @Test
  public void test() {
    int count = coinPicker.pick(7);

    System.out.println("Min value:" + count);
  }
}