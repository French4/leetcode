package Fiftyfive;
/*
 * 动态规划的解法：维持两个变量，一个是全局最优，一个是局部最优
 * 全局最优是我们维护一个到目前为止能跳到的最远距离
 * 局部最优是我们维护一个当前一步出发能跳到的最远距离
 * 动态规划：两个特性
 * 	全局最优一定包含局部最优
 *  具有临时保存的特性
 * */
public class Solution {
	public boolean canJump(int[] nums) {
	    int maxIndex = nums.length-1;//记录最后一个位置
	    int maxJump  = nums[0];//当前最远的位置
	    for(int i = 0; i <= maxJump; i++){//注意一定是maxJump不是maxIndex，因为一定是i可以到达的地方
	        maxJump=Math.max(maxJump,i+nums[i]);//从当前最远的位置和当前所能去的最远的位置选择一个作为全剧最优解
	        if(maxJump>=maxIndex) return true;//进行判断
	    }
	    return false;
	}
}
