package SixtyFour;
/*
 * ��̬�滮��f(n) = f(n)+min(f(n-1), f(n-2))
 * */
public class Solution {
	public int minPathSum(int[][] grid) {
		int m = grid.length;// row
		int n = grid[0].length; // column
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 && j != 0) { //��һ�е���ķ�ʽֻ��һ��,���Ǵ���ߵ���
					grid[i][j] = grid[i][j] + grid[i][j - 1];
				} else if (i != 0 && j == 0) {
					grid[i][j] = grid[i][j] + grid[i - 1][j];//��һ�е���ķ�ʽֻ�д����浽��
				} else if (i == 0 && j == 0) {//�����Ͻǵ�����Ҳֻ��һ�ֵ��﷽ʽ
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