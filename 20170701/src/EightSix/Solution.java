package EightSix;


/*
 * Given a linked list and a value x, 
 * partition it such that all nodes less 
 * than x come before nodes greater than or equal to x.
 *You should preserve the original relative 
 *order of the nodes in each of the two partitions.
 *For example,
 *Given 1->4->3->2->5->2 and x = 3,
  return 1->2->2->4->3->5.* */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Solution {
    public ListNode partition(ListNode head, int x) {
    	 if(head == null || head.next == null) 
     		return head;
        ListNode dummy = new ListNode(0);
        ListNode slow = dummy;
        ListNode fast = head;
        slow.next = fast;
        ListNode tail = head;
        int num = 1;
        while(tail.next != null){
        	tail = tail.next;
        	num++;
        }
        while(num != 0)//用来计数
        {
        	if(fast.val >= x) //删除大的,添加到最后
        	{
        		ListNode node = new ListNode(fast.val);
        		tail.next = node;
        		tail = node;
        		slow.next = fast.next;
        		fast = slow.next;
        	}else{
        		slow = slow.next;
        		fast = fast.next;
        	}
        	num--;
        }
        return dummy.next;
    }
}
