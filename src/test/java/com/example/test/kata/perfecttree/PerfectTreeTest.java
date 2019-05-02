package com.example.test.kata.perfecttree;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class PerfectTreeTest {

  private PerfectTree pt = new PerfectTree();
  Node root = new Node();

  @Test
  public void test() {

//    int a = pt.isPerfectTree(root);

//    assertThat(a).isEqualTo(1);

    Node subNod11 = new Node();
    root.addSubNode(subNod11);
//    assertThat(pt.isPerfectTree(root)).isEqualTo(2);

    Node subNod12 = new Node();
    root.addSubNode(subNod12);
//    assertThat(pt.isPerfectTree(root)).isEqualTo(2);

    Node subNod13 = new Node();
    root.addSubNode(subNod13);

    Node subNod111 = new Node();
    subNod11.addSubNode(subNod111);
//    assertThat(pt.isPerfectTree(root)).isEqualTo(-1);

    Node subNod112 = new Node();
    subNod11.addSubNode(subNod112);

    Node subNod113 = new Node();
    subNod11.addSubNode(subNod113);
//    assertThat(pt.isPerfectTree(root)).isEqualTo(-1);

    Node subNod121 = new Node();
    subNod12.addSubNode(subNod121);

    Node subNod122 = new Node();
    subNod12.addSubNode(subNod122);

    Node subNod123 = new Node();
    subNod12.addSubNode(subNod123);

    Node subNod131 = new Node();
    subNod13.addSubNode(subNod131);

    Node subNod132 = new Node();
    subNod13.addSubNode(subNod132);

    Node subNod133 = new Node();
    subNod13.addSubNode(subNod133);

    assertThat(pt.isPerfectTree(root)).isEqualTo(3);


  }
}