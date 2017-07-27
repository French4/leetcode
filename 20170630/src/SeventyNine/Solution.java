package SeventyNine;
/*
 * 给定一个2D板和一个单词，找出这个单词是否存在于网格中。

	该单词可以由顺序相邻单元的字母构成，其中“相邻”单元是水平或垂直相邻的单元。 相同的字母单元可能不会被多次使用。
	例如，给予板=[
 	 [ 'A'， 'B'， 'C'， 'E']，
 	 [ 'S'，'F'， 'C'，'S']，
 	 [ 'A'， 'D'， 'E'， 'E']
	]
	word =“ABCCED”， - >返回true，
	word =“SEE”， - >返回true，
	word =“ABCB”， - >返回false。
 * */
public class Solution {
	static boolean[][] visited;
	public boolean exist(char[][] board, String word)
	{
		visited = new boolean[board.length][board[0].length];
		
		for(int i = 0; i < board.length; i++)
			for(int j = 0; j < board[0].length; j++){
				if(word.charAt(0) == board[i][j] && search(board, word, i, j, 0))
					return true;
			}
		return false;
	}
	private boolean search(char[][] board, String word, int i, int j, int index) {
		if(index == word.length())
			return true;
		
		if(i >= board.length || i < 0 || j >= board[i].length || j < 0) //判断边界
			return false;
		
		if(board[i][j] == word.charAt(index) && visited[i][j] == false)
		{
			visited[i][j] = true; //沿着四个方向寻找
			if(search(board, word, i-1, j, index+1) || 
			           search(board, word, i+1, j, index+1) ||
			           search(board, word, i, j-1, index+1) || 
			           search(board, word, i, j+1, index+1)){
			            return true;
			        }
			visited[i][j] = false;
		}
		return false;
	}
}
