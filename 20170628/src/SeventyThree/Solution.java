package SeventyThree;
/*
 * 思路就是：将第一行，第一列单独判断判断是否清空。
 * 遍历其余的值，是0的话，将对应的行列值标记为0
 * */
public class Solution {
    public void setZeroes(int[][] matrix) {
       if(matrix == null)
    	   return;
       int m = matrix.length;
       int n = matrix[0].length;
       
       boolean rowHasZero = false;
       boolean colHasZero = false;
       
       for(int i = 0; i < n; i++){ //检测最第一行
    	   if(matrix[0][i] == 0){
    		   rowHasZero = true;
    		   break;
    	   }
       }
       
       for(int i = 0; i < m; i++){
    	   if(matrix[i][0] == 0){//检测第一列
    		   colHasZero = true;
    		   break;
    	   }
       }
       
       for(int i=1; i<m; i++){
           for(int j=1; j<n; j++){
               if(matrix[i][j]==0){
                   matrix[i][0] = 0; //第一列的行值标记为0
                   matrix[0][j] = 0; //第一行的列值标记为0
               }
           }
       }
       
       for(int j = 1; j < n; j++){ //遍历第一行的第二列列值
    	   if(matrix[0][j] == 0){
    		   nullifyCol(matrix, j, m, n);//清空列，列值不变，行值改变
    	   }
       }
       
       for(int i = 1; i < m; i++){//遍历第一列的第二行的行值
    	   if(matrix[i][0] == 0){
    		   nullifyRow(matrix, i, m, n);//清空行,行值不变,列值改变
    	   }
       }
       
       if(rowHasZero){//清空第一行
           nullifyRow(matrix, 0, m, n);
       }
       if(colHasZero){
           nullifyCol(matrix, 0, m, n);//清空第一列
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
