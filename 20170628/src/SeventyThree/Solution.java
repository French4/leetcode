package SeventyThree;
/*
 * ˼·���ǣ�����һ�У���һ�е����ж��ж��Ƿ���ա�
 * ���������ֵ����0�Ļ�������Ӧ������ֵ���Ϊ0
 * */
public class Solution {
    public void setZeroes(int[][] matrix) {
       if(matrix == null)
    	   return;
       int m = matrix.length;
       int n = matrix[0].length;
       
       boolean rowHasZero = false;
       boolean colHasZero = false;
       
       for(int i = 0; i < n; i++){ //������һ��
    	   if(matrix[0][i] == 0){
    		   rowHasZero = true;
    		   break;
    	   }
       }
       
       for(int i = 0; i < m; i++){
    	   if(matrix[i][0] == 0){//����һ��
    		   colHasZero = true;
    		   break;
    	   }
       }
       
       for(int i=1; i<m; i++){
           for(int j=1; j<n; j++){
               if(matrix[i][j]==0){
                   matrix[i][0] = 0; //��һ�е���ֵ���Ϊ0
                   matrix[0][j] = 0; //��һ�е���ֵ���Ϊ0
               }
           }
       }
       
       for(int j = 1; j < n; j++){ //������һ�еĵڶ�����ֵ
    	   if(matrix[0][j] == 0){
    		   nullifyCol(matrix, j, m, n);//����У���ֵ���䣬��ֵ�ı�
    	   }
       }
       
       for(int i = 1; i < m; i++){//������һ�еĵڶ��е���ֵ
    	   if(matrix[i][0] == 0){
    		   nullifyRow(matrix, i, m, n);//�����,��ֵ����,��ֵ�ı�
    	   }
       }
       
       if(rowHasZero){//��յ�һ��
           nullifyRow(matrix, 0, m, n);
       }
       if(colHasZero){
           nullifyCol(matrix, 0, m, n);//��յ�һ��
       }
    }

	private void nullifyRow(int[][] matrix, int i, int m, int n) {
		for(int col=0; col<n; col++)
			matrix[i][col] = 0;
	}

	private void nullifyCol(int[][] matrix, int j, int m, int n) {
		for(int row=0; row<m; row++)
			matrix[row][j] = 0;
	}
}
