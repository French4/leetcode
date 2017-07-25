package SixtyTwo;
/*
 * ���ǻ���DFS�ĵݹ飬���ã�ʹ�ö�̬�滮
 * ��̬�滮:f(n) = f��(n-1)+f��(n-1)
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
//			return count;//�ߵ������½ǣ�����
//		}else if(i > m || j > n){
//				return count;//�����ߵ���ͷ������
//		}else{
//			count = uniquePaths(i+1, j, count, m, n);//������
//			count = uniquePaths(i, j+1, count, m,n);//������
//			return count;
//		}
//		
//	}
//}
public class Solution {
    public int uniquePaths(int m, int n) {
        Integer[][] map = new Integer[m][n];
        for(int i = 0; i<m;i++){
            map[i][0] = 1;//���ڱ߽�ֻ��һ�ַ���
        }
        for(int j= 0;j<n;j++){
            map[0][j]=1;//���ڱ߽�ֻ��һ�ַ���
        }
        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                map[i][j] = map[i-1][j]+map[i][j-1];//�Ǳ߽������ֿ�����
            }
        }
        return map[m-1][n-1];
    }
}