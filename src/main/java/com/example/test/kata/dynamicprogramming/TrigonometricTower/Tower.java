package com.example.test.kata.dynamicprogramming.TrigonometricTower;

import java.util.Arrays;

public class Tower {

  private int[][] valueMatrix;
  private int depth;
  private int rowCount;
  private int columnCount;

  public void initMatrix(Node node) {
    this.depth = getDepth(node);
    this.rowCount = depth - 1;
    this.columnCount = depth - 1;

    valueMatrix = new int[depth][depth];

    parse(node, 0, 0);

    printTower();

    int maxValue = calculate();
    System.out.println("Max Value:" + maxValue);
  }

  private void printTower() {
    for (int i = 0; i < depth; i++) {
      for (int j = 0; j < depth; j++) {
        System.out.print(this.valueMatrix[i][j] + " ");
      }
      System.out.println("");
    }
  }

  private void printLine(int[] line) {
    for (int j = 0; j < line.length; j++) {
      System.out.print(line[j] + " ");
    }
    System.out.println("");
  }

  private int calculate() {

    int[] ret =
        Arrays.copyOf(this.valueMatrix[this.rowCount], this.valueMatrix[this.rowCount].length);

    for (int i = this.rowCount - 1; i >= 0; i--) {
      for (int j = 0; j < this.columnCount; j++) {
        ret[j] = this.valueMatrix[i][j] + Math.max(ret[j], ret[j + 1]);
      }
      printLine(ret);
    }

    return ret[0];
  }

  private int getDepth(Node node) {
    int tempDepth = 1;

    Node tempNode = node;
    while (!tempNode.isLeaf()) {
      tempDepth++;
      tempNode = tempNode.getLeftNode();
    }
    return tempDepth;
  }

  private void parse(Node node, int row, int column) {

    this.valueMatrix[row][column] = node.getValue();
    if (!node.isLeaf()) {
      parse(node.getLeftNode(), row + 1, column);
      parse(node.getRightNode(), row + 1, column + 1);
    }
  }
}
