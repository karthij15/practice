package com.leetcode.thirtydaychallenge;

/*
Return the root node of a binary search tree that matches the given preorder traversal.

(Recall that a binary search tree is a binary tree where for every node, any descendant of node.left has a value < node.val, and any descendant of node.right has a value > node.val.  Also recall that a preorder traversal displays the value of the node first, then traverses node.left, then traverses node.right.)

 

Example 1:

Input: [8,5,1,7,10,12]
Output: [8,5,10,1,7,null,12]

       8
      /  \
     5   10
    / \     \
   1   7     12
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
class ConstructBinarySearchTreefromPreorderTraversal {
    public TreeNode solution(int[] preorder) {
       
        Stack<TreeNode> stack = new Stack<>();

        TreeNode root = new TreeNode(preorder[0]);
        stack.push(root);

        int i = 1;
        while(i < preorder.length) {
            TreeNode parent = stack.peek();

            if(preorder[i] < parent.val) {
                parent.left = new TreeNode(preorder[i]);
                stack.push(parent.left); //make new parent
            }

            if(preorder[i] > parent.val) {
                /*
                boolean isRightNodeFound = false;

                while(!stack.isEmpty() && !isRightNodeFound) {
                    if(preorder[i] > stack.peek().val) {
                        parent = stack.pop();
                    } else {
                        parent.right = new TreeNode(preorder[i]);
                        stack.push(parent.right);
                        isRightNodeFound = true;
                    }
                }

                if(stack.isEmpty() && !isRightNodeFound) {
                    parent.right = new TreeNode(preorder[i]);
                    stack.push(parent.right);
                }
                */
                
                while(!stack.isEmpty() && preorder[i] > stack.peek().val) {
                    parent = stack.pop();
                }
                parent.right = new TreeNode(preorder[i]);
                stack.push(parent.right);
            }

            i++;
        }

        return root;       
    }
}
