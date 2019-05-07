package com.example.test.kata.dynamicprogramming.coin;

public class CoinPicker {

  private static final int ONE = 1;
  private static final int THREE = 3;
  private static final int FIVE = 5;

  private int[] arrayCount;

  public int pick(int target) {
    arrayCount = new int[target];

    initArrayValue();

    return min(target);
  }

  private void initArrayValue() {
    arrayCount[1] = 1;
    arrayCount[2] = 2;
    arrayCount[3] = 1;
    arrayCount[4] = 2;
    arrayCount[5] = 1;
  }

  private int min(int target) {
    if (target <= 5) {
      return arrayCount[target];
    }

    if (arrayCount[target - 5] == 0) {
      arrayCount[target - 5] = min(target - 5);
    }
    if (arrayCount[target - 3] == 0) {
      arrayCount[target - 3] = min(target - 3);
    }
    if (arrayCount[target - 1] == 0) {
      arrayCount[target - 1] = min(target - 1);
    }

    if (arrayCount[target - 5] > arrayCount[target - 3]) {
      if (arrayCount[target - 3] > arrayCount[target - 1]) {
        return arrayCount[target - 1] + 1;
      } else {
        return arrayCount[target - 3] + 1;
      }
    } else {
      if (arrayCount[target - 5] > arrayCount[target - 1]) {
        return arrayCount[target - 1] + 1;
      } else {
        return arrayCount[target - 5] + 1;
      }
    }
  }

  private void min2(int index, int target) {
    if (index == 1) {
      this.arrayCount[index] = 1;
    } else {
      int min = 0;
      for (int coin : coins) {
        if ((index >= coin && this.arrayCount[index - coin] + 1 < min) || min == 0) {
          min = this.arrayCount[index - coin] + 1;
        }
      }
      this.arrayCount[index] = min;
    }

    if (index < target) {
      min2(index + 1, target);
    }
  }

  private int[] d;
  private int[] coins = {1, 3, 5};

  private void d_func(int i, int num) {
    if (i == 0) {
      d[i] = 0;
      d_func(i + 1, num);
    } else {
      int min = 9999999;
      for (int coin : coins) {
        if (i >= coin && d[i - coin] + 1 < min) {
          min = d[i - coin] + 1;
        }
      }
      d[i] = min;

      if (i < num) {
        d_func(i + 1, num);
      }
    }
  }
}
