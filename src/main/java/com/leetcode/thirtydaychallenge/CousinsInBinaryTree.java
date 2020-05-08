package com.leetcode.thirtydaychallenge;

/*
In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.

Two nodes of a binary tree are cousins if they have the same depth, but have different parents.

We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.

Return true if and only if the nodes corresponding to the values x and y are cousins.

 

Example 1:


Input: root = [1,2,3,4], x = 4, y = 3
Output: false
Example 2:


Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
Output: true
Example 3:



Input: root = [1,2,3,null,4], x = 2, y = 3
Output: false
 

Note:

The number of nodes in the tree will be between 2 and 100.
Each node has a unique integer value from 1 to 100.
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
class Solution {

    int xD, yD; //depths
    TreeNode xP, yP; //parents

    public boolean isCousins(TreeNode root, int x, int y) {
        /*
        List<List<Integer>> values = bfsList(root);
        
        int bfs = 0;
        for(List i : values) {
            int xIdx = i.indexOf(x);
            int yIdx = i.indexOf(y);
            
            System.out.println(i.toString() + " : " + xIdx + " : " + yIdx);
            if(xIdx != -1 && yIdx != -1 && (Math.abs(xIdx-yIdx) > 1 || (bfs > 1 && i.size() == 2))) {
                System.out.println(xIdx + " : " + yIdx);
                return true;
            }
            bfs++;
        }
        */
        getDepthAndParent(root, x, y, 0, null);
        return (xD == yD && xP != yP);
    }   
    
    public void getDepthAndParent(TreeNode root, int x, int y, int depth, TreeNode parent){
        if(root == null){
            return;
        }
        if(root.val == x){
            xP = parent;
            xD = depth;
        }else if(root.val == y){
            yP = parent;
            yD = depth;
        }       
        //getDepthAndParent(root.left, x, y, depth + 1, root);
        //getDepthAndParent(root.right, x, y, depth + 1, root);
        else {
            getDepthAndParent(root.left, x, y, depth + 1, root);
            getDepthAndParent(root.right, x, y, depth + 1, root);
        }
    }
    
    //find bfs list. to find the nodes are on the same bfs
    //but it won't work, since it is not possible to retrieve its parents
    public List<List<Integer>> bfsList(TreeNode root) {
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
      
        return values;
    }
    
}
