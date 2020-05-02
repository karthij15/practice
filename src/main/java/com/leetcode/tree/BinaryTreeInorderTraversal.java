package com.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
In-order traversal is to traverse the left subtree first. Then visit the root. Finally, traverse the right subtree.

Let's do in-order traversal together:

Given a binary tree, return the inorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,3,2]
Follow up: Recursive solution is trivial, could you do it iteratively?
*/

class BinaryTreeInorderTraversal {
    public List<Integer> solution(TreeNode root) {
        
        List<Integer> values = new ArrayList<>();
        TreeNode node = root;
        Stack<TreeNode> nodeStack = new Stack<>();
        
        while(node != null || !nodeStack.isEmpty()) {//only check to traverse
           
            if(node != null) {
                nodeStack.push(node);
                node = node.left;
            } else {
                node = nodeStack.pop();
                values.add(node.val);
                node = node.right;
            }
        }
        
        return values;        
        
    }
}
