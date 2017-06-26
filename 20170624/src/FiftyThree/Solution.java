package FiftyThree;
/*
 * 思路：就是有两个临时变量
 * 一个存放数据和，如果数据和小于一个新开始的数字，则选取新开始的数据作为起点
 * 另一个变量存放上一次的数据和和这次数据和中的较大的值
 * */
public class Solution {
    public int maxSubArray(int[] nums) {
    	int now = nums[0];//这是到现在的最大和
    	int before = nums[0];//这是之前的最大和
    	for(int i = 1; i < nums.length; i++){
    		before = Math.max(before+nums[i], nums[i]);//计算和
    		now  = Math.max(now, before); //在两个最大和中选取一个最大的
    	}
    	return now;
    }
}
