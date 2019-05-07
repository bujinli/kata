package com.example.test.kata.divideconquer;

public class Hannota {

  public void play(int total) {
    move(total, 'A', 'B', 'C');
  }

  private void move(int total, char src, char trans, char dest) {

    if (total == 1) {
      System.out.println(src + "->" + dest); //move action
      return;
    }

    move(total - 1, src, dest, trans);
    System.out.println(src + "->" + dest);
    move(total - 1, trans, src, dest);
  }
}
