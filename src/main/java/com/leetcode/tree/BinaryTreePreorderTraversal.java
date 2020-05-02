package com.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
Given a binary tree, return the preorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,2,3]
Follow up: Recursive solution is trivial, could you do it iteratively
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
 
 /*
 Notes: (Recall that a binary search tree is a binary tree where for every node, any descendant of node.left has a value < node.val, 
 and any descendant of node.right has a value > node.val.  Also recall that a preorder traversal displays the value of the node first, 
 then traverses node.left, then traverses node.right.)
 */
class BinaryTreePreorderTraversal {
    public List<Integer> solution(TreeNode root) {
        
        TreeNode node = root;
        List<Integer> valueList = new ArrayList<>();
        Stack<TreeNode> rightNodes = new Stack<>(); //back up right nodes here
        
        while(node != null) {
            valueList.add(node.val);

            if(node.right != null)
            rightNodes.push(node.right);

            node = node.left;
            if(node == null && !rightNodes.isEmpty())
                node = rightNodes.pop();
        }
        
        return valueList;
    }
}
