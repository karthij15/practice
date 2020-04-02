/*
Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 

Input: 19
Output: true
Explanation: 
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1

*/

/*
For this we will encounter cyclic error for input 2. for those values. We need to use Tortoise-Hare algorithm to avoid.
This is popular algorithm used to determine a linked is cycle or not. 

https://medium.com/@monisha.mary.mathew/happy-number-e31f869cee70


*/


class Solution {

    public boolean isHappy(int n) {
        
        int slow = n;
        int fast = n;
        
        do {
            slow = squareOfSum(slow);
            /*
            fast = squareOfSum(fast);
            fast = squareOfSum(fast);*/
            fast = squareOfSum(squareOfSum(fast));
            /*
            you can check fast == 1 and return true here itself. which avoids the slow to come up with the fast value.
            */
        } while(slow != fast);
        return slow == 1;
    }
    
    int squareOfSum(int n) {
        int a = 0;

        while(n != 0) {
            a += ((n%10) * (n%10));
            n/=10;
        }

        return a;
    }
}
