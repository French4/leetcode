package sevenfifty;
/*
 * ����һ��n����������飬��ɫ����ɫ����ɫ�������������Ա���ͬ��ɫ�Ķ������ڣ�˳��Ϊ��ɫ����ɫ����ɫ��

������ǽ�ʹ��0��1��2��������ʾ��ɫ��ɫ����ɫ����ɫ��

ע��
����Ӧ��ʹ�ÿ�������������������⡣
 * */
public class Solution {
	public void sortColors(int[] nums) {
        int num0 = 0, num1 = 0, num2 = 0;
        for(int i = 0; i < nums.length; i++){
        	if(nums[i] == 0) num0++;
        	if(nums[i] == 1) num1++;
        	if(nums[i] == 2) num2++;
        }
        for(int i = 0; i < num0; i++)
        	nums[i] = 0;
        for(int i = num0; i < num1+num0; i++)
        	nums[i] = 1;
        for(int i = num0+num1; i < num0+num1+num2; i++)
        	nums[i] = 2;
    }
}
