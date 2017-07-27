package thirtynine;

import java.util.ArrayList;
import java.util.List;
/**
 * Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.

Note:
All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
For example, given candidate set [2, 3, 6, 7] and target 7, 
A solution set is: 
[
  [7],
  [2, 2, 3]
]
 * */
public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //深度优先搜索
    	List<List<Integer>> list = new ArrayList<>();
    	combinationSum(list, new ArrayList<Integer>(), candidates, target-0, 0);
    	return list;
    }

	private void combinationSum(List<List<Integer>> list, ArrayList<Integer> arrayList,
			int[] candidates, int target, int start) {
        if(target < 0)
            return;
		if(target == 0){
			list.add(new ArrayList<>(arrayList));
			return;
		}
		for(int i = start; i < candidates.length; i++){
			arrayList.add(candidates[i]);
			combinationSum(list, arrayList,candidates, target-candidates[i], i);
			arrayList.remove(arrayList.size()-1);
		}
    }
	
}