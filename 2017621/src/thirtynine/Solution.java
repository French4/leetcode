package thirtynine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * 思路分析：题目意思是从数组中选出一组数据，使得起等于目标数据。数组中的数据可以重复
 * 假设是[2,3,6,7] target=7
 * 输出的集合应该是223和7，深度优先搜索
 * */
public class Solution {
	public  List<List<Integer>> combinationSum(int[] candidates, int target)
	{
		Arrays.sort(candidates);
		List<List<Integer>> result = new ArrayList<List<Integer>>(); //定义结果集合
		getResult(result, new ArrayList<Integer>(), candidates, target, 0);//结果集合，新添加的一行测试是否和等于target的数据
		//数组，目标，其实位置
		return result;
	}

	private  void getResult(List<List<Integer>> result,
			ArrayList<Integer> cur, int[] candidates, int target, int start) {
		if(target > 0){
			for(int i = start; i < candidates.length && target >= candidates[i];i++){
				cur.add(candidates[i]);//当前面的数字没有加到targrt的时候
				getResult(result, cur, candidates, target - candidates[i], i); //继续添加这个元素知道大于或者等于target
				cur.remove(cur.size()-1);//到了这步骤，说明前面的说字添加导致导致失败，所以要删除前面添加的数字
			}
		}else if(target == 0){
			result.add(new ArrayList<Integer>(cur)); //添加的数字正确，得到答案
			
		}
	}
}
