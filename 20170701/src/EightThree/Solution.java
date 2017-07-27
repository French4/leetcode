package EightThree;


/*Given a sorted linked list, 
 * delete all duplicates such that each element 
 * appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
 * */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Solution {
	 public ListNode deleteDuplicates(ListNode head) {
		 ListNode dummy = new ListNode(0);
		 ListNode slow = dummy;
		 ListNode fast = head;
		 slow.next = fast;
		 while(fast != null)
		 {
			 //�ҵ����һ���ڵ���������һ����ͬ�Ľڵ�
			 while(fast.next != null && fast.val == fast.next.val)
				 fast = fast.next;
			 slow.next = fast;//�ڵ����һ����ͬ�Ľڵ�
			 slow = slow.next;//ָ�����һ���ڵ�
			 fast = fast.next;//ָ��û������Ľڵ�
		 }
		 return dummy.next;
	  }
}
