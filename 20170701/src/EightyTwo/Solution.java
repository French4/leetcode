package EightyTwo;
/*
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
	For example,
	Given 1->2->3->3->4->4->5, return 1->2->5.
	Given 1->1->1->2->3, return 2->3.
 * */


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
    	ListNode dummy = new ListNode(0), fast = head, slow = dummy;
    	slow.next = fast;
    	while(fast != null){
    		//找到了重复数字的最后一个数字或者是最后一个节点
    		while(fast.next != null && fast.val == fast.next.val){
    			fast = fast.next; //
    		}
    		if(slow.next != fast){//证明fast.val == fast.next.val条件成立,此时fast指向重复节点中的最后一个
    			slow.next = fast.next; //删除重复的节点
    			fast = slow.next;  		//将指向无序链表第一个值
    		}else{ //没有重复的节点，因为slow的下一个节点就是fast,证明链表就只有一个节点或者fast.val == fast.next.value成立
    			slow = slow.next;
    			fast = fast.next;
    		}
    	}
    	return dummy.next;
    }
}
