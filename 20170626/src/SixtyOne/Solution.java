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
	public ListNode rotateRight(ListNode head, int n) {//n�Ǻ�һ������ĸ���
	    if (head==null||head.next==null) return head;//����ֻ��һ���ڵ�ͷ���һ���ڵ�
	    ListNode dummy=new ListNode(0);
	    dummy.next=head;
	    ListNode fast=dummy,slow=dummy;//��Щ���Ƕ�ָ
	    int i;
	    for (i=0;fast.next!=null;i++)//�õ��ܳ���
	    	fast=fast.next;//ָ��  
	    for (int j=i-n%i;j>0;j--) //j = 2-1%2 = 1
	    	slow=slow.next;//slowָ��1������ǰһ����������һ��Ԫ��    
	    fast.next=dummy.next; //2ָ��1����һ����������һ���ڵ�ָ��ǰһ�������ͷ���
	    dummy.next=slow.next;//ָ��ͷ���
	    slow.next=null;//�Ͽ��м�����
	    
	    return dummy.next;
	}
}