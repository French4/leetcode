package NinetyFour;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/*
 *  
94. Binary Tree Inorder Traversal
 * 二叉树的中序遍历
 * 
 * */
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 };
public class Solution {
   public List<Integer> inorderTraversal(TreeNode root) {
       ArrayList<Integer> list = new ArrayList<Integer>();
       if(root == null)
    	   return list;
       Stack<TreeNode> stack = new Stack<TreeNode>();
       TreeNode node = root;
       stack.push(node);//根节点入栈
       while(!stack.isEmpty()){
    	   //左孩子入栈
    	   while(node != null && node.left != null){
    		   stack.push(node.left);
    		   node = node.left;
    	   }
    	   TreeNode p = stack.pop();//得到最左边孩子节点,指向栈顶节点
    	   list.add(p.val);
    	   if(p.right != null){
    		   node = p.right;
    		   if(node != null)
    			   stack.push(node);
    	   }
       }
       return list;
   }
}
