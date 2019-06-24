package com.example.test.kata.clock;

public class Calculator {

  private Node firstNode;
  private Node lastNode;

  private Node hourPoint;
  private Node mintuesPoint;

  private void prepare() {

    firstNode = new Node();

    for (int i = 0; i < 60; i++) {
      Node tempNode = new Node();
      firstNode.add(tempNode);
      lastNode = tempNode;
    }

    lastNode.add(firstNode);
  }

  public int getMatchCount() {
    prepare();
    hourPoint = firstNode;
    mintuesPoint = firstNode;
    int matchCount = 1;

    for (int mintues = 0; mintues < 24 * 60; mintues++) {
      mintuesPoint = mintuesPoint.getNext();
      if (mintues % 12 == 0) {
        hourPoint = hourPoint.getNext();
      }
      if (mintuesPoint == hourPoint) {
        matchCount++;
      }
    }
    return matchCount;
  }
}
