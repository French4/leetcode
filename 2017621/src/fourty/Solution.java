package fourty;
/*
 * 找出数组中元素的和等于目标数字的
 * */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
      //先对数组进行排序
        Arrays.sort(candidates);
        getResult(result, candidates, new ArrayList<Integer>(), 0, target);
        return result;
    }

	private void getResult(List<List<Integer>> result, int[] candidates, ArrayList<Integer> cur, int start,
			int target) {
		if(target > 0){ //证明还可以继续在后面取出数据
			for(int i = start; i < candidates.length && target >= candidates[i];i++){
			    if(i > start && candidates[i] == candidates[i-1]) continue;
				cur.add(candidates[i]);//将这个数字添加进去，但是现在还不知道能不能添加这个数字，于是下面这个步骤要检查正确性,就是target的值
				getResult(result, candidates, cur, i+1, target-candidates[i]);//由于数字不能重复，所以start必须加1
				cur.remove(cur.size()-1);
			}
		}else if( target == 0){
			result.add(new ArrayList<Integer>(cur));
			return;
		}
	}
}
