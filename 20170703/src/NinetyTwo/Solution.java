package NinetyTwo;

import java.util.Stack;

/*
 * ����

Reverse a linked list from position m to n. Do it in-place and in one-pass.

For example:
Given 1->2->3->4->5->NULL, m = 2 and n = 4,

return 1->4->3->2->5->NULL.

Note:
Given m, n satisfy the following condition:
1 ? m ? n ? length of list.

241/5000
�������б��λ��m��ת��n�� ��ԭλ����һ��ͨ����

���磺
����1-> 2-> 3-> 4-> 5-> NULL��m = 2��n = 4��

����1-> 4-> 3-> 2-> 5-> NULL��

ע�⣺
����m��n��������������
1�� m�� n�� �б���
 * */
class ListNode {
	    int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
/*public class Solution {
public ListNode reverseBetween(ListNode head, int m, int n) {//��ת��m��n������
        ListNode dummy = new ListNode(0);
        ListNode first = dummy;
        ListNode second = head;
        first.next = second;
        if(m == n || head == null)
        	return head;
        //�ҵ���m���ڵ�
        for(int i = 1; i < m && second != null; i++){
        	first = first.next;//ָ��m���ڵ�ǰ��Ľڵ�
        	second = second.next;//ָ���m���ڵ�
        }
        if(second == null)
        	return head;
        //����һ��ջ�ڵ�
        Stack<Integer> st = new Stack<>();
       for(int i = m; i <= n && second != null; i++) //n����ڵ�ҲҪ���з�ת��������i<=n
       {
    	   st.push(second.val);
    	   second = second.next;//ָ���n+1���ڵ�
       }
       while(!st.isEmpty()){
    	   ListNode node = new ListNode(st.pop());
    	   first.next = node;
    	   first = node;
       }
       if(second != null)
    	   first.next = second.next;
       return dummy.next;
    }
}*/
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        for(int i = 0; i < m-1; i++) pre = pre.next;//�ҵ���m���ڵ�ǰһ���ڵ�
        ListNode start = pre.next;//��m���ڵ�
        ListNode then = start.next;
        
        //1-2-3-4-5; m=2, n=4----> pre=1, start=2. then=3
        //dummy-1-2-3-4-5
        for(int i = 0; i < n-m; i++)/*start�ڵ�ָ��then�ڵ�֮��ڵ㣬
         then���ڵ�һ��λ��*/
        {
        	start.next = then.next;
        	then.next = pre.next;
        	pre.next = then;//ǰ�����ǽ��н���
        	then = start.next; //thenָ��start����һ�� 
        }
        
        return dummy.next;
    }
}
