package SixtyTwo;
/*
 * 这是基于DFS的递归，不好，使用动态规划
 * 动态规划:f(n) = f上(n-1)+f左(n-1)
 * */
//public class Solution {
//    public int uniquePaths(int m, int n) {
//        int count = 0;
//       return uniquePaths(0, 0, count, m,n);
//    }
//
//	private int uniquePaths( int i, int j, int count, int m, int n) {
//		if(i  == m &&j == n){
//			count++;
//			return count;//走到了最下角，返回
//		}else if(i > m || j > n){
//				return count;//单边走到了头，返回
//		}else{
//			count = uniquePaths(i+1, j, count, m, n);//向右走
//			count = uniquePaths(i, j+1, count, m,n);//向下走
//			return count;
//		}
//		
//	}
//}
public class Solution {
    public int uniquePaths(int m, int n) {
        Integer[][] map = new Integer[m][n];
        for(int i = 0; i<m;i++){
            map[i][0] = 1;//对于边界只有一种方法
        }
        for(int j= 0;j<n;j++){
            map[0][j]=1;//对于边界只有一种方法
        }
        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                map[i][j] = map[i-1][j]+map[i][j-1];//非边界有两种可能性
            }
        }
        return map[m-1][n-1];
    }
}