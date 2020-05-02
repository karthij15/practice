package com.leetcode.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/*
Given a binary tree, return the postorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [3,2,1]
Follow up: Recursive solution is trivial, could you do it iteratively?
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //Notes: Post-order traversal is to traverse the left subtree first. Then traverse the right subtree. Finally, visit the root.
 
class BinaryTreePostorderTraversal {
    public List<Integer> solution(TreeNode root) {
        LinkedList<Integer> values = new LinkedList<>();//new ArrayList<>();
        
        if(root == null)
            return values;
        
        TreeNode node = root;
        Stack<TreeNode> nodeStack = new Stack<>();

        nodeStack.push(node);

        while(!nodeStack.isEmpty()) {
            node = nodeStack.pop();
            values.addFirst(node.val);
            
            if(node.left != null) {
                nodeStack.push(node.left);
            } 
            if(node.right != null) {
                nodeStack.push(node.right);
            }
        }
        
        //System.out.println(values.toString());
        return values;
    }
}
