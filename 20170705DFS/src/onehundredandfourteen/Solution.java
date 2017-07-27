package onehundredandfourteen;
/*
 * 	
314/5000
给定一个二叉树，将其平坦化到原来的链表。

例如，
特定

         1
         / \
        2 5
       / \ \
      3 4 6
扁平的树应该像：
   1
    \
     2
      \
       3
        \
         4
          \
           五
            \
             6
点击显示提示。
 * */
class TreeNode {
	    int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
}
/*
 * 先对节点的左孩子进行处理，然后对节点的右孩子进行处理，然后在
 * 这个节点进行处理。相当于后序遍历的思想
 * */
public class Solution {
	public void flatten(TreeNode root){
		if(root == null) return;
		
		TreeNode left = root.left;
		TreeNode right = root.right;
		
		root.left = null;//这是对一个节点的初始化过程
		
		flatten(left);
		flatten(right);
		
		root.right = left;//将左孩子放在了右节点的位置
		TreeNode cur = root;
		while(cur.right != null) cur = cur.right;//找到最后一个节点
		cur.right = right;//将右孩子放到里面
	}
}
