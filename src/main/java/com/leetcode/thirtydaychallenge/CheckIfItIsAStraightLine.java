package com.leetcode.thirtydaychallenge;

/*
You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.
Example 1:

Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
Output: true
Example 2:
7 |           .
6 |         .
5 |       .
4 |     .
3 |   .
2 | . 
1 |_ _ _ _ _ _ _
   1 2 3 4 5 6 7
Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
Output: false

Constraints:

2 <= coordinates.length <= 1000
coordinates[i].length == 2
-10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4
coordinates contains no duplicate point.

*/

/*
    // find slope from point 1 and point 2
    // compare the slopes of all other points wrt to the original slope
    //
    // Slope of points (x1, y1) and (x2, y2) is:
    // (y2 - y1) / (x2 - x1)
    //
    // Slope of points (x1, y1) and (x3, y3) is:
    // (y3 - y1) / (x3 - x1)
    //
    // for all three points to be on the same line, the slopes should be equal, in other words:
    // (x3 - x1)*(y2 - y1) = (y3 - y1)*(x2 - x1)
    //
    // to avoid running into divide by zero error, use multiplication to find slope
*/
class CheckIfItIsAStraightLine {
    public boolean solution(int[][] coordinates) {
        
        if(coordinates.length == 2)
            return true;
        //https://math.stackexchange.com/questions/701862/how-to-find-if-the-points-fall-in-a-straight-line-or-not
        int[] a = coordinates[0];
        int[] b = coordinates[1];
        
        for(int i = 2; i < coordinates.length; i++) {
            int[]c = coordinates[i];
            
            if(((c[0]-a[0])*(b[1] - a[1])) - ((c[1] - a[1])*(b[0]-a[0])) != 0)
                return false;
        }
        
        return true;
    }
}
