package com.leetcode.thirtydaychallenge;

/*
Given a non-empty binary tree, find the maximum path sum.

For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The path must contain at least one node and does not need to go through the root.

Example 1:

Input: [1,2,3]

       1
      / \
     2   3

Output: 6
Example 2:

Input: [-10,9,20,null,null,15,7]

   -10
   / \
  9  20
    /  \
   15   7

Output: 42
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BinaryTreeMaximumPathSum {
   
    int sum = Integer.MIN_VALUE;
    //PriorityQueue<Integer> q = new PriorityQueue<>((x, y) -> (y - x));

    public int maxPathSum(TreeNode root) {       
        dfsSum(root);
        return sum;
       // return q.peek();
    }
    
    public int dfsSum(TreeNode root) {
        if(root == null)
            return 0;

        int x = dfsSum(root.left);
        int y = dfsSum(root.right);

        int newSum = (root.val + x + y);
        sum = Math.max(sum, newSum);

        //System.out.println(root.val + " : " + sum + " : " + newSum);

        //q.add(root.val + dfsSum(root.left) + dfsSum(root.right));

        return Math.max(0, root.val + Math.max(x, y));
    }
}
