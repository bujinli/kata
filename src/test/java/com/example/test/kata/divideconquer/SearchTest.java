package com.example.test.kata.divideconquer;

import static org.assertj.core.api.Java6Assertions.assertThat;

import org.junit.Test;

public class SearchTest {

  @Test
  public void test_binary_search() {

    int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Search search = new Search(array);

    assertThat(search.binarySearch(11)).isEqualTo(-1);
  }

  @Test
  public void test_binary_search_2() {

    int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    Search search = new Search(array);

    assertThat(search.binarySearch(4)).isEqualTo(3);
  }
}