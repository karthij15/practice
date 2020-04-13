package com.leetcode.linkedlist;

import java.util.Stack;

/*
Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?
*/

//Based On: https://medium.com/@jimdaosui/reverse-linked-list-ca8be5651326

class ReverseLinkedList {
    public ListNode solution(ListNode head) {
        return reverseListUsingRecursion(head);
    }
    
   public ListNode reverseListUsingRecursion(ListNode head) {
       //1->2->3->4->5->NULL
        if(head == null || head.next == null)
            return head;
        
       ListNode lastNode = reverseListUsingRecursion(head.next);
       head.next.next = head;
       head.next = null;       
       
       return lastNode;
    }
    
    
    public ListNode reverseListUsingIteration(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = head;
        
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
    }
    
    public ListNode reverseListUsingStack(ListNode head) {
       //Replace the synchronized class "Stack" by an unsynchronized one such as "Deque" 
       Stack<ListNode> stack = new Stack<>();
        
        while(head != null) {
            stack.push(new ListNode(head.val));
            head = head.next;
        }
        
        ListNode dummy = new ListNode(-1);
        head = dummy.next;
        
        while(!stack.isEmpty()) {
            head = stack.pop();
            head = head.next;
        }
        
        return dummy.next;
    }
}
