package com.leetcode.alog;

/*
Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

 

Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
Example 2:

Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3
*/

class Solution {
    public int numIslands(char[][] grid) {
        
        int count = 0;
        
       // printGrid(grid);
        
        for(int r = 0; r < grid.length; r++) {
            
            for(int c = 0; c < grid[r].length; c++) {
                
                if(grid[r][c] == '1') {
                    dfs(grid, r, c);
               //     printGrid(grid);
                    count++;
                }
            }
        }
        
        return count;
    }
    
    public void printGrid(char[][] grid) {
        System.out.println("-----------------");
        
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("-----------------");
    }
    
    public void dfs(char[][] grid, int r, int c) {
        
        if(r < grid.length && c < grid[0].length && r >= 0 && c >= 0 && grid[r][c] == '1' ) {
            grid[r][c] = '0';
        
            dfs(grid, r + 1, c);
            dfs(grid, r - 1, c);
            dfs(grid, r, c + 1);
            dfs(grid, r, c - 1);
        }
    }
}
