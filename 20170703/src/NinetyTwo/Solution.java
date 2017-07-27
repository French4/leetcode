package NinetyTwo;

import java.util.Stack;

/*
 * 翻译

Reverse a linked list from position m to n. Do it in-place and in one-pass.

For example:
Given 1->2->3->4->5->NULL, m = 2 and n = 4,

return 1->4->3->2->5->NULL.

Note:
Given m, n satisfy the following condition:
1 ? m ? n ? length of list.

241/5000
将链接列表从位置m反转到n。 在原位进行一次通过。

例如：
给定1-> 2-> 3-> 4-> 5-> NULL，m = 2和n = 4，

返回1-> 4-> 3-> 2-> 5-> NULL。

注意：
给定m，n满足以下条件：
1？ m？ n？ 列表长度
 * */
class ListNode {
	    int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
/*public class Solution {
public ListNode reverseBetween(ListNode head, int m, int n) {//反转从m到n的链表
        ListNode dummy = new ListNode(0);
        ListNode first = dummy;
        ListNode second = head;
        first.next = second;
        if(m == n || head == null)
        	return head;
        //找到第m个节点
        for(int i = 1; i < m && second != null; i++){
        	first = first.next;//指向m个节点前面的节点
        	second = second.next;//指向第m个节点
        }
        if(second == null)
        	return head;
        //定义一个栈节点
        Stack<Integer> st = new Stack<>();
       for(int i = m; i <= n && second != null; i++) //n这个节点也要进行反转，所以是i<=n
       {
    	   st.push(second.val);
    	   second = second.next;//指向第n+1个节点
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
        for(int i = 0; i < m-1; i++) pre = pre.next;//找到第m个节点前一个节点
        ListNode start = pre.next;//第m个节点
        ListNode then = start.next;
        
        //1-2-3-4-5; m=2, n=4----> pre=1, start=2. then=3
        //dummy-1-2-3-4-5
        for(int i = 0; i < n-m; i++)/*start节点指向then节点之后节点，
         then放在第一个位置*/
        {
        	start.next = then.next;
        	then.next = pre.next;
        	pre.next = then;//前三句是进行交换
        	then = start.next; //then指向start的下一个 
        }
        
        return dummy.next;
    }
}
