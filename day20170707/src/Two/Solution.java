package Two;
/*
 * ���������ǿյ�������ʾ�����Ǹ������� �������෴��˳��洢��ÿ���ڵ����һ�����֡� ����������ֲ�������Ϊ�����ء�

�����Լ����������ֲ������κ�ǰ���㣬��������0����

���룺��2 - > 4 - > 3��+��5 - > 6 - > 4��
�����7 - > 0 - > 8
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
        while(l1 != null && l2 != null){//A��B��ִ����
        	head.next =  new ListNode(0);
        	sum += l1.val + l2.val;
        	head.next.val = sum % 10;
        	sum = sum/10;
        	l1 = l1.next;
        	l2 = l2.next;
        	head = head.next;
        }
        while(l1 == null && l2 != null){//A����ˣ�Bû�����
        	head.next =  new ListNode(0);
        	sum += l2.val;
        	head.next.val = sum % 10;
        	l2 = l2.next;
        	head = head.next;
            sum = sum/10;
        }
        while(l2 == null && l1 != null){//B����ˣ�Aû�����
        	head.next =  new ListNode(0);
        	sum += l1.val;
        	head.next.val = sum % 10;
        	l1 = l1.next;
        	head = head.next;
            sum = sum/10;
        }
        if(sum != 0){//sum����
            head.next = new ListNode(0);
            head.next.val = sum;
            head = head.next;
        }
        return dummy.next;
    }
}
