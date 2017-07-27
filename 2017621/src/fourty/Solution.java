package fourty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * 这是组合问题,且数组中有重复数据，但是每个数组中的数不能够重复利用，不能出现重复的组合。
 * 假设候选号码（C）和目标号码（T）的集合，找到C中所有独特的组合，其中候选号码与T相加。

C中的每个数字只能在组合中使用一次。

注意：
所有数字（包括目标）将为正整数。
解决方案集不能包含重复的组合。
例如，给定候选集[10，1，2，7，6，1，5]和目标8，
解决方案是：
[
   [1,7]
   [1，2，5]
   [2，6]
   [1，1，6]
]
 * */
public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
       
        combinationSum2(candidates, result, new ArrayList<Integer>(), 0, target-0);
        return result;
    }
    private void combinationSum2(int[] candidates, List<List<Integer>> result, List<Integer> tempList, int start, int target)
    {
        if(target < 0)
            return;
        if(target == 0)
        {
            result.add(new ArrayList<Integer>(tempList));
            return;
        }
        
            for(int i = start; i < candidates.length; i++){
                    if(i>start && candidates[i]==candidates[i-1])
                        continue;//i > start保证这个只是头部的比较，
                    tempList.add(candidates[i]);
                    combinationSum2(candidates, result,tempList, i+1, target-candidates[i]);//是i+1不是start+1,i+1保证重复使用过的数据
                    tempList.remove(tempList.size()-1);
                }

        }
}

