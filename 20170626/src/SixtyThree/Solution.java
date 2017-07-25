package SixtyThree;

public class Solution {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
	    int width = obstacleGrid[0].length;//�õ�������
	    int[] dp = new int[width];//����������������ͬ����ʾ��λ���ܹ�����ĸ���
	    dp[0] = 1;//�߽�ֻ��һ�ַ�ʽ
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
