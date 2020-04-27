package com.leetcode.thirtydaychallege;
/*
Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.

Example:

Input:
[
  [1,3,1],
  [1,5,1],
  [4,2,1]
]
Output: 7
Explanation: Because the path 1→3→1→1→1 minimizes the sum
*/
class MinPathSum {
    public int solution(int[][] grid) {

        /*
        int[][] grid = new int[][]{
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
        };
        */
        int[][] m = new int[grid.length][grid[0].length];
        
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                m[i][j] += grid[i][j];
                
                if(i > 0 && j > 0) {
                    m[i][j] += Math.min(m[i - 1][j], m[i][j-1]);
                } else if(i > 0) {
                    m[i][j] += m[i - 1][j];
                } else if(j > 0) {
                    m[i][j] += m[i][j - 1];
                }
            }
        }
        
        /*
        //dp array
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                System.out.print(m[i][j] +",");
            }
            System.out.println();
        }
        */
        
        return m[grid.length - 1][grid[0].length - 1];
 
    }
}
