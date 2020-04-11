/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
*/

class MinStackUsingList {

    LinkedList<Integer> list = new LinkedList<>();
    int min = Integer.MAX_VALUE;
    
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        System.out.println("push: " + x);
        min = (x < min) ? x : min;
        list.add(x);
    }
    
    public void pop() {
        int rem = list.removeLast();
        System.out.println("pop: " + rem + " : min : " + min);
        System.out.println(" List: " + list.size());
        if(rem == min) {
            if(list.size() > 0) {
                LinkedList<Integer> temp = (LinkedList<Integer>) list.clone();
                System.out.println(" Temp: " + temp.size());
                Collections.sort(temp);
                min = temp.get(0);
            } else
                min = Integer.MAX_VALUE;
        }
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
