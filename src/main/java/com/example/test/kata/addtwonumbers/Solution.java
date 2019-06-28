package com.example.test.kata.addtwonumbers;

public class Solution {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    ListNode ret = new ListNode(0);
    ListNode current = ret;
    int increase = 0;
    int sum;

    while (l1 != null || l2 != null || increase != 0) {

      int l1val = l1 != null ? l1.val : 0;
      int l2val = l2 != null ? l2.val : 0;

      sum = l1val + l2val + increase;

      current.val = sum % 10;
      increase = sum / 10;
      current = current.next;

      l1 = l1 != null ? l1.next : null;
      l2 = l2 != null ? l2.next : null;
    }

    return ret;
  }

  public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {

    if (l1 == null) {
      return l1;
    }
    if (l2 == null) {
      return l2;
    }

    ListNode head = new ListNode(0);
    ListNode curl = head;
    int increase = 0;
    int sum = 0;

    do {
      sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + increase;
      increase = sum / 10;
      curl.next = new ListNode(sum % 10);

      curl = curl.next;
      l1 = l1 != null ? l1.next : null;
      l2 = l2 != null ? l2.next : null;
    } while (l1 != null || l2 != null || increase > 0);
    return head.next;
  }

  public static class ListNode {
    int val;
    ListNode next;

    public ListNode(int x) {
      val = x;
    }
  }
}
