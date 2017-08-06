package onehundredandtwelve;
/*
 * 
414/5000
�������������ܺͣ�ȷ�����Ƿ���и���Ҷ��·����ʹ������·��������ֵ��ӵ��ڸ����ĺ͡�

���磺
��������Ķ�������sum = 22��
              ��
              / \
             4 8
            / / \
           11 13 4
          / \ \
         7 2 1
����true����Ϊ���ڸ���Ҷ·��5-> 4-> 11-> 2�����ܺ�Ϊ22��
 * */
class TreeNode {
	    int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
}
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        //DFS�����������
    	if(root == null) return false;
    	
    	if(root.left == null && root.right == null && sum - root.val == 0) return true;
    	
    	return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
