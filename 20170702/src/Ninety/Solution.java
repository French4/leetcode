package Ninety;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given a collection of integers that might contain duplicates, nums, return all possible subsets.

Note: The solution set must not contain duplicate subsets.

For example,
If nums = [1,2,2], a solution is:

[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]
 * */
/*public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       Arrays.sort(nums);//排序数组
       List<List<Integer>> result = new ArrayList<>();
       dfs(nums, 0, new ArrayList<Integer>(), result);
       return result;
    }

	private void dfs(int[] nums, int index, List<Integer> path,
			List<List<Integer>> result) {
		result.add(path);
		for(int i=index; i<nums.length; i++){ //这个是选择开头的位置
			if(i>index && nums[i-1] == nums[i]) continue;//同一个位置不能放相同的字母
			List<Integer> nPath = new ArrayList<>(path);
			nPath.add(nums[i]);
			dfs(nums, i+1, nPath, result);
		}
	}
}*/
//全排列
public class Solution{
	public static void allSort(int[] nums){
		int n = nums.length;
		Arrays.sort(nums);
		int[] used = new int[n];
		dfs(nums,1,n, new ArrayList<Integer>(), used);
	}

	private static void dfs(int[] nums, int step, int n, List<Integer>path, int[] used) {//第一个参数是数组，第二个参数是步数(站在第几个盒子前)
			//第三个参数是长度(盒子个数)，第四个参数存放从数组中取出的数，第五个参数是标记
		if(step == n+1){
			System.out.println(path.toString());
		}
		for(int i = 0; i < n; i++){
			if(used[i] == 0){//表示牌在手中，即数字可以使用
			path.add(nums[i]);//取出
			used[i] = 1;//标记已经被使用
			dfs(nums, step+1, n, path, used);//放置下一个盒子
			used[i] = 0;//标记没有使用
			path.remove(path.size()-1);//取出
			}
		}
	}
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4};
		allSort(array);
	}
}
