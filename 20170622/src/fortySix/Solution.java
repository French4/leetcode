package fortySix;
import java.util.ArrayList;
import java.util.List;
/*
 * DFS介绍参见个人博客：http://blog.csdn.net/buzhbuzh/article/details/73694809
 * */
public class Solution {
    public   List<List<Integer>> permute(int[] nums) {
    	List<List<Integer>> listAll = new ArrayList<>();
    	boolean[] used = new boolean[nums.length]; //默认是false
    	for(int i = 0; i < used.length; i++){
    		used[i] = true;
    	}
    	int[] array = new int[nums.length];
    	permute(array, nums, listAll, used, 0);
    	return listAll;
    }
	private  void permute(int[] array, int[] nums, List<List<Integer>> listall, boolean[] used, int step) {
		if(step == nums.length){
			List<Integer> list = new ArrayList<>();
			for(int i = 0; i < array.length; i++){
				list.add(array[i]);
			}
			listall.add(list);
			return;  //返回到上一次调用的位置
		}
		for(int i = 0; i < nums.length; i++){ //只对每一个位置进行考虑
			if(used[i] != false){ //证明这个位置可以放数字
				used[i] = false;//数字不能在继续使用
				array[step] = nums[i];
				permute(array, nums, listall,used, step+1); //继续下一个位置放数字
				used[i] = true;
			}
		}
	}
}

 