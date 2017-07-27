package onehundredandthirteenth;

import java.util.LinkedList;
import java.util.List;

/*
 * 
Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
return
[
   [5,4,11,2],
   [5,8,4,5]
]
 * */
class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
}
public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        List<Integer> currentResult = new LinkedList<Integer>();
        pathSum(root, sum, result,currentResult);
        return result;
    }

	private void pathSum(TreeNode node, int sum, List<List<Integer>> result,
			List<Integer> currentResult) {
		if(node == null)
			return;
		//添加一个元素
		currentResult.add(new Integer(node.val));
		//如果这个元素是最后一个节点，且符合条件则
		if(node.left == null && node.right == null && sum == node.val){
			result.add(new LinkedList<>(currentResult));
			currentResult.remove(currentResult.size() - 1);
			return;
		}else{
			pathSum(node.left, sum-node.val, result, currentResult);
			pathSum(node.right, sum-node.val, result, currentResult);
		}
		currentResult.remove(currentResult.size() - 1);
	}
}