package OnoHundred;


/*
 *  100:判断是否是一个相同的树
 * */
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 };
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isSame(p, q);
    }

	private boolean isSame(TreeNode p, TreeNode q) {
		if(p == null && q == null)
        	return true;
        if(p!=null && q==null)
        	return false;
        if(p==null && q!=null)
        	return false;
        if(p.val != q.val)
        	return false;
        else
        	return isSame(p.left, q.left) && isSame(p.right, q.right);
	}
}
