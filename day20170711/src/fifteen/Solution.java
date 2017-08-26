package fifteen;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


/*
 * 给定n个整数的数组S，S中有元素a，b，c，使得+ b + c = 0？ 查找数组中所有独特的三元组，它们的总和为零。

注意：解决方案集不能包含重复的三元组。

例如，给定数组S = [-1,0,1,2，-1，-4]，

解决方案是：
[
   [-1,0,1]，
   [-1，-1,2]
]
 * */
public class Solution {
  /*  public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        threeSum(nums, list, new ArrayList<Integer>(), used, 0, 0);
        return list;
    }

	private static void threeSum(int[] nums, List<List<Integer>> result,
			ArrayList<Integer> list, boolean[] used, int sum, int start) {
		if(list.size() == 3){
			if(sum == 0){
			//	System.out.println(list);
				result.add(new ArrayList<Integer>(list));
				System.out.println("list的值是:"+result);
			}
			return;
		}
		for(int i = start; i < nums.length; i++){
			if(used[i] == true) continue; //使用过的
			if(i > 0 && nums[i] == nums[i-1] && used[i-1] == false) continue;//如果有相同的,去除重复
			used[i] = true; //标记已经使用过
			list.add(nums[i]);
			threeSum(nums, result, list, used, sum+nums[i], i+1);
			used[i] = false;
			list.remove(list.size()-1);
		}
	}
	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		List list = threeSum(nums);
		System.out.println("list的值是:"+list);
	}*/
	public  List<List<Integer>> threeSum(int[] num){
		Arrays.sort(num);
		List<List<Integer>> res = new LinkedList<>();
		for(int i = 0; i < num.length-2; i++){
			if(i == 0 ||(i >0 && num[i] != num[i-1])){
				int lo = i+1, hi = num.length-1, sum = 0 - num[i];
				while(lo < hi){ //排序后,将其余数组二者相加和sum做比较
					if(num[lo] + num[hi] == sum){
						res.add(Arrays.asList(num[i], num[lo], num[hi]));
						while(lo < hi && num[lo] == num[lo+1]) lo++;
						while(lo < hi && num[hi] == num[hi-1]) hi--;
						lo++;hi--;
					}else if(num[lo] + num[hi] < sum) lo++;
					else	hi--;
				}
			}
		}
		return res;
	}
}
