package com.leetcode.algo;

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {
  /**
   * Definition for singly-linked list.
   * 
   */
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    ListNode temp = new ListNode(0);
    ListNode l3 = temp;
    int c = 0;

    while (l1 != null || l2 != null) {

      int l1Val = l1 == null ? 0 : l1.val;
      int l2Val = l2 == null ? 0 : l2.val;

      c = l1Val + l2Val + c;

      int val = c % 10;
      c = c / 10;

      l3.next = new ListNode(val);
      l3 = l3.next;

      l1 = l1 != null ? l1.next : l1;
      l2 = l2 != null ? l2.next : l2;

    }

    if (c > 0) {
      l3.next = new ListNode(c);
    }

    return temp.next;

  }
}

class ListNode {
  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
  }
}
