package com.example.test.kata.divideconquer;

public class Search {

  private int[] array;

  public Search(int[] array) {
    this.array = array;
  }

  public int binarySearch(int target) {
    return doSearch(0, array.length - 1, target);
  }

  private int doSearch(int low, int high, int target) {
    if (low >= high) {
      return -1; //not found
    }
    int mid = (low + high) / 2;
    if (array[mid] == target) {
      return mid;
    } else if (array[mid] > target) {
      return doSearch(low, mid - 1, target);
    } else {
      return doSearch(mid + 1, high, target);
    }
  }
}
