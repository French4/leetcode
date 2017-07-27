package Eighty;
/*
 * Follow up for "Remove Duplicates":
What if duplicates are allowed at most twice?

For example,
Given sorted array nums = [1,1,1,2,2,3],

Your function should return length = 5, 
with the first five elements of nums being 1, 1, 2, 2 and 3. 
It doesn't matter what you leave beyond the new length.
在数组里面留下出现一次或者两次的元素
 * */
public class Solution {
	public int removeDuplicates(int[] nums)
	{
		int i = 0;
		for(int n : nums)
		{
			if(i < 2 || n > nums[i-2])//如果n == nums[i-2]证明n已经出现了三次了，所以要把这个n给放弃
				nums[i++] = n;
		}
		return i;
	}
}
