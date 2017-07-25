package SixtyThree;

public class Solution {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
	    int width = obstacleGrid[0].length;//得到起列数
	    int[] dp = new int[width];//申请数组与列数相同，表示该位置能够到达的个数
	    dp[0] = 1;//边界只有一种方式
	    for (int[] row : obstacleGrid) {
	        for (int j = 0; j < width; j++) {
	            if (row[j] == 1)
	                dp[j] = 0; 
	            else if (j > 0)
	                dp[j] += dp[j - 1];
	        }
	    }
	    return dp[width - 1];
	}
}
