package com.example.test.kata.divideconquer;

public class MaxSum {

  private int[] array;
  private int maxSum;

  public MaxSum(int[] array) {
    this.array = array;
  }

  public int play() {
    return sum(0, array.length);
  }

  private int sum(int low, int high) {
    if (low > high) {
      return 0;
    }
    if (low == high) {
      return array[low];
    }

    int mid = (low + high) / 2;
    //left sum
    int lmaxsum = array[low];
    int lsum = 0;
    for (int i = mid; i >= low; i--) {
      lsum += array[i];
      if (lsum > lmaxsum) {
        lmaxsum = lsum;
      }
    }

    //right sum
    int rmaxsum = array[mid];
    int rsum = 0;
    for (int i = mid; i <= high; i++) {
      rsum += array[i];
      if (rsum > rmaxsum) {
        rmaxsum = rsum;
      }
    }

    // combime

    return max3(lmaxsum + rmaxsum, sum(low, mid), sum(mid + 1, high));
  }

  private int max3(int i, int j, int k) {
    if (i >= j && i >= k) {
      return i;
    }
    return max3(j, k, i);
  }
}
