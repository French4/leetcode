package FiftyThree;
/*
 * ˼·��������������ʱ����
 * һ��������ݺͣ�������ݺ�С��һ���¿�ʼ�����֣���ѡȡ�¿�ʼ��������Ϊ���
 * ��һ�����������һ�ε����ݺͺ�������ݺ��еĽϴ��ֵ
 * */
public class Solution {
    public int maxSubArray(int[] nums) {
    	int now = nums[0];//���ǵ����ڵ�����
    	int before = nums[0];//����֮ǰ������
    	for(int i = 1; i < nums.length; i++){
    		before = Math.max(before+nums[i], nums[i]);//�����
    		now  = Math.max(now, before); //������������ѡȡһ������
    	}
    	return now;
    }
}
