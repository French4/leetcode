package fortyEight;
/*
 * 
 * 用四个指针分别对用四个方向，先设置最外层，依次递推
 * */
public class Solution{
	public static int[][] generateMatrix(int n){
		int[][] ret = new int[n][n];
		int left = 0;
		int right = n-1;
		int top = 0;
		int down = n-1;
		int count = 1;
		while(left <= right && top <= down){
			//设置首行
			for(int j = left; j <= right; j++)
				ret[top][j] = count++;
			//设置最右边的列
			top++;
			for(int i = top; i <= down; i++)
				ret[i][right] = count++;
			right--;
			
			//设置最下边的行
			for(int i = right; i >= left; i--)
				ret[down][i] = count++;
			down--;
			
			//设置最左边的列
			for(int i = down; i >= top; i--)
				ret[i][left] = count++;
			left++;
		}
		return ret;
	}
}