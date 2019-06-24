package com.example.test.kata.clock;

public class Node {

  private Node next;

  public void add(Node node) {
    this.next = node;
  }

  public Node getNext() {
    return this.next;
  }
}
