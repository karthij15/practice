package com.leetcode.linkedlist;

import java.util.ArrayList;
import java.util.List;

/*
Given a linked list, remove the n-th node from the end of list and return its head.

Example:

Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:

Given n will always be valid.

Follow up:

Could you do this in one pass?
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class RemoveNthNodeFromEndOfList {

    public ListNode solution(ListNode head, int n) {
        
        //find other alternate way
        return usingList(head, n);
    }
    
    ListNode usingList(ListNode head, int n) {
        
        List<ListNode> list = new ArrayList<>();

        while(head != null) {
            list.add(head);
            head = head.next;
        }

        int l = (list.size() - n);
        list.remove(l);

        if(!list.isEmpty()) {
            int i = 0;
            for (ListNode a : list) {
                if (i < list.size() - 1)
                    a.next = list.get(++i);
                else
                    a.next = null;
            }
        }
        return !list.isEmpty() ? list.get(0) : null;
    }
}

