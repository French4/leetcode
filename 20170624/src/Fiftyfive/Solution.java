package Fiftyfive;
/*
 * ��̬�滮�Ľⷨ��ά������������һ����ȫ�����ţ�һ���Ǿֲ�����
 * ȫ������������ά��һ����ĿǰΪֹ����������Զ����
 * �ֲ�����������ά��һ����ǰһ����������������Զ����
 * ��̬�滮����������
 * 	ȫ������һ�������ֲ�����
 *  ������ʱ���������
 * */
public class Solution {
	public boolean canJump(int[] nums) {
	    int maxIndex = nums.length-1;//��¼���һ��λ��
	    int maxJump  = nums[0];//��ǰ��Զ��λ��
	    for(int i = 0; i <= maxJump; i++){//ע��һ����maxJump����maxIndex����Ϊһ����i���Ե���ĵط�
	        maxJump=Math.max(maxJump,i+nums[i]);//�ӵ�ǰ��Զ��λ�ú͵�ǰ����ȥ����Զ��λ��ѡ��һ����Ϊȫ�����Ž�
	        if(maxJump>=maxIndex) return true;//�����ж�
	    }
	    return false;
	}
}
