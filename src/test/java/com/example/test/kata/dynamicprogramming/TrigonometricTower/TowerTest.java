package com.example.test.kata.dynamicprogramming.TrigonometricTower;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class TowerTest {

  private Tower tower = new Tower();

  @Test
  public void test() {
    Node root = new Node(1);
    Node node11 = new Node(11);
    Node node111 = new Node(111);
    Node node112 = new Node(112);
    Node node12 = new Node(12);
    Node node121 = new Node(121);
    Node node122 = new Node(122);

    root.setLeftNode(node11);
    root.setRightNode(node12);
    node11.setLeftNode(node111);
    node11.setRightNode(node112);
    node12.setLeftNode(node121);
    node12.setRightNode(node122);

    tower.initMatrix(root);
  }
}