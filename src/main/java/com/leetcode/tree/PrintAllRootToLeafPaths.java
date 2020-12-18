package com.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/*
Example:
   10
  /  \
 8    2
/\    /
3 5  2
For the above example tree, all root-to-leaf paths are:

10 –> 8 –> 3
10 –> 8 –> 5
10 –> 2 –> 2

Check this also: https://www.geeksforgeeks.org/root-leaf-path-maximum-distinct-nodes/
*/

class PrintAllRootToLeafPaths {
    public List<String> solution(TreeNode root) {
        List<String> list = new ArrayList<>();
        printPaths(root, "", list);
    }
    
    void printPaths(TreeNode root, String path, List<String> list) {
        if (root.left == null && root.right == null) {
			    list.add(path + root.val);
		    }
		    if (root.left != null) {
			    printPaths(root.left, path + root.val + "->", list);
		    }
		    if (root.right != null) {
			    printPaths(root.right, path + root.val + "->", list);
		    }
    }

}
