package onehundredandfourteen;
/*
 * 	
314/5000
����һ��������������ƽ̹����ԭ��������

���磬
�ض�

         1
         / \
        2 5
       / \ \
      3 4 6
��ƽ����Ӧ����
   1
    \
     2
      \
       3
        \
         4
          \
           ��
            \
             6
�����ʾ��ʾ��
 * */
class TreeNode {
	    int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
}
/*
 * �ȶԽڵ�����ӽ��д���Ȼ��Խڵ���Һ��ӽ��д���Ȼ����
 * ����ڵ���д����൱�ں��������˼��
 * */
public class Solution {
	public void flatten(TreeNode root){
		if(root == null) return;
		
		TreeNode left = root.left;
		TreeNode right = root.right;
		
		root.left = null;//���Ƕ�һ���ڵ�ĳ�ʼ������
		
		flatten(left);
		flatten(right);
		
		root.right = left;//�����ӷ������ҽڵ��λ��
		TreeNode cur = root;
		while(cur.right != null) cur = cur.right;//�ҵ����һ���ڵ�
		cur.right = right;//���Һ��ӷŵ�����
	}
}
