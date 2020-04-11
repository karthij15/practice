/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
*/

import java.util.*;

public class MinStack {

    public static void main(String...args) {
        MinStackNode obj = new MinStackNode();
       // System.out.println(obj.getMin());

        System.out.println(obj.push(2147483646));
        System.out.println(obj.push(2147483646));
        System.out.println(obj.push(2147483647));
        System.out.println(obj.top());
        System.out.println(obj.pop());
        System.out.println(obj.getMin());
        System.out.println(obj.pop());
        System.out.println(obj.getMin());
        System.out.println(obj.pop());
        System.out.println(obj.push(2147483647));
        System.out.println(obj.top());
        System.out.println(obj.getMin());
        System.out.println(obj.push(-2147483648));
        System.out.println(obj.top());
        System.out.println(obj.getMin());
        System.out.println(obj.pop());
        System.out.println(obj.getMin());
    }
}

//Based on the online solutions
class MinStackNode {
    private Node head;

    public String push(int x) {
        if(head == null)
            head = new Node(x, x, null);
        else
            head = new Node(x, Math.min(x, head.min), head);
        return null;
    }

    public String pop() {
        head = head.next;
        return null;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }

    private class Node {
        int val;
        int min;
        Node next;

        private Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}

class MinStackUsingList {

    LinkedList<Integer> list = new LinkedList<>();
    int min = Integer.MAX_VALUE;

    /** initialize your data structure here. */
    public MinStackUsingList() {

    }

    public String push(int x) {
        min = Math.min(x, min);
        list.add(x);
        return null;
    }

    public String pop() {
        int rem = list.removeLast();
        if(rem == min && list.size() > 0) {
                LinkedList<Integer> temp = (LinkedList<Integer>) list.clone();
                Collections.sort(temp);
                min = temp.get(0);
        }
        return null;
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
