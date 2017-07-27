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
    		//�ҵ����ظ����ֵ����һ�����ֻ��������һ���ڵ�
    		while(fast.next != null && fast.val == fast.next.val){
    			fast = fast.next; //
    		}
    		if(slow.next != fast){//֤��fast.val == fast.next.val��������,��ʱfastָ���ظ��ڵ��е����һ��
    			slow.next = fast.next; //ɾ���ظ��Ľڵ�
    			fast = slow.next;  		//��ָ������������һ��ֵ
    		}else{ //û���ظ��Ľڵ㣬��Ϊslow����һ���ڵ����fast,֤��������ֻ��һ���ڵ����fast.val == fast.next.value����
    			slow = slow.next;
    			fast = fast.next;
    		}
    	}
    	return dummy.next;
    }
}