package SixtyFour;
/*
 * 动态规划：f(n) = f(n)+min(f(n-1), f(n-2))
 * */
public class Solution {
	public int minPathSum(int[][] grid) {
		int m = grid.length;// row
		int n = grid[0].length; // column
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 && j != 0) { //第一行到达的方式只有一种,就是从左边到达
					grid[i][j] = grid[i][j] + grid[i][j - 1];
				} else if (i != 0 && j == 0) {
					grid[i][j] = grid[i][j] + grid[i - 1][j];//第一列到达的方式只有从上面到达
				} else if (i == 0 && j == 0) {//最左上角的数字也只有一种到达方式
					grid[i][j] = grid[i][j];
				} else {
					grid[i][j] = Math.min(grid[i][j - 1], grid[i - 1][j])
							+ grid[i][j];//f(i,j) = f(i,j)+min{f(i-1, j), f(i,j-1)}
				}
			}
		}

		return grid[m - 1][n - 1];
	}
}