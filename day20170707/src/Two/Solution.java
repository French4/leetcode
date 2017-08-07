package Two;
/*
 * 给定两个非空的链表，表示两个非负整数。 数字以相反的顺序存储，每个节点包含一个数字。 添加两个数字并将其作为链表返回。

您可以假设两个数字不包含任何前导零，除了数字0本身。

输入：（2 - > 4 - > 3）+（5 - > 6 - > 4）
输出：7 - > 0 - > 8
 * */
class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        int sum = 0;
        while(l1 != null && l2 != null){//A和B都执行完
        	head.next =  new ListNode(0);
        	sum += l1.val + l2.val;
        	head.next.val = sum % 10;
        	sum = sum/10;
        	l1 = l1.next;
        	l2 = l2.next;
        	head = head.next;
        }
        while(l1 == null && l2 != null){//A完成了，B没有完成
        	head.next =  new ListNode(0);
        	sum += l2.val;
        	head.next.val = sum % 10;
        	l2 = l2.next;
        	head = head.next;
            sum = sum/10;
        }
        while(l2 == null && l1 != null){//B完成了，A没有完成
        	head.next =  new ListNode(0);
        	sum += l1.val;
        	head.next.val = sum % 10;
        	l1 = l1.next;
        	head = head.next;
            sum = sum/10;
        }
        if(sum != 0){//sum还有
            head.next = new ListNode(0);
            head.next.val = sum;
            head = head.next;
        }
        return dummy.next;
    }
}
