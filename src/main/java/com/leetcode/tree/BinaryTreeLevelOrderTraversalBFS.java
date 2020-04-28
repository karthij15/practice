package com.leetcode.tree;

/*
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
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
class BinaryTreeLevelOrderTraversalBFS {
    public List<List<Integer>> solution(TreeNode root) {
        
        List<List<Integer>> values = new ArrayList<>();

        if(root == null)
            return values;

        TreeNode node = root;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);        

        while(!q.isEmpty()) {
            List<Integer> bfsValuesList = new ArrayList<>();
            int bfsNodesCount = q.size();
            
            int i = 0;
            while(i < bfsNodesCount) {
                node = q.poll();
                bfsValuesList.add(node.val);

                if(node.left != null) {
                    q.offer(node.left);
                }
                if(node.right != null) {
                    q.offer(node.right);
                }

                i++;
            }

            values.add(bfsValuesList);
        }
        
        for(List i : values) {
            System.out.println(i.toString());
        }
        
        return values;
    }
}
