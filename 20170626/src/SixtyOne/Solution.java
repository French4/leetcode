package SixtyOne;

/*
 * 1,2   1 ---> 2,1
 * */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x;}
 }

public class Solution {
	public ListNode rotateRight(ListNode head, int n) {//n是后一个链表的个数
	    if (head==null||head.next==null) return head;//若是只有一个节点就返回一个节点
	    ListNode dummy=new ListNode(0);
	    dummy.next=head;
	    ListNode fast=dummy,slow=dummy;//这些都是都指
	    int i;
	    for (i=0;fast.next!=null;i++)//得到总长度
	    	fast=fast.next;//指向  
	    for (int j=i-n%i;j>0;j--) //j = 2-1%2 = 1
	    	slow=slow.next;//slow指向1，就是前一个链表的最后一个元素    
	    fast.next=dummy.next; //2指向1，后一个链表的最后一个节点指向前一个链表的头结点
	    dummy.next=slow.next;//指向头结点
	    slow.next=null;//断开中间链表
	    
	    return dummy.next;
	}
}