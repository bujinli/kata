package com.example.test.kata.addtwonumbers;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  private Solution solution = new Solution();


  @Test
  public void test1(){
    Solution.ListNode l1 = new Solution.ListNode(2);
    l1.next = new Solution.ListNode(4);
    l1.next.next = new Solution.ListNode(3);

    Solution.ListNode l2 = new Solution.ListNode(5);
    l2.next = new Solution.ListNode(6);
    l2.next.next = new Solution.ListNode(4);


    solution.addTwoNumbers(l1,l2);

  }



}