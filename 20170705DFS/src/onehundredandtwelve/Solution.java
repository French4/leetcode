package onehundredandtwelve;
/*
 * 
414/5000
给定二叉树和总和，确定树是否具有根到叶的路径，使得沿着路径的所有值相加等于给定的和。

例如：
给定下面的二叉树和sum = 22，
              五
              / \
             4 8
            / / \
           11 13 4
          / \ \
         7 2 1
返回true，因为存在根到叶路径5-> 4-> 11-> 2，其总和为22。
 * */
class TreeNode {
	    int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
}
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        //DFS深度优先搜索
    	if(root == null) return false;
    	
    	if(root.left == null && root.right == null && sum - root.val == 0) return true;
    	
    	return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
