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
			 //找到最后一个节点或者是最后一个相同的节点
			 while(fast.next != null && fast.val == fast.next.val)
				 fast = fast.next;
			 slow.next = fast;//节点最后一个相同的节点
			 slow = slow.next;//指向最后一个节点
			 fast = fast.next;//指向没有排序的节点
		 }
		 return dummy.next;
	  }
}
