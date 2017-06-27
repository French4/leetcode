package fortyEight;
/*
 * 
 * ���ĸ�ָ��ֱ�����ĸ���������������㣬���ε���
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
			//��������
			for(int j = left; j <= right; j++)
				ret[top][j] = count++;
			//�������ұߵ���
			top++;
			for(int i = top; i <= down; i++)
				ret[i][right] = count++;
			right--;
			
			//�������±ߵ���
			for(int i = right; i >= left; i--)
				ret[down][i] = count++;
			down--;
			
			//��������ߵ���
			for(int i = down; i >= top; i--)
				ret[i][left] = count++;
			left++;
		}
		return ret;
	}
}