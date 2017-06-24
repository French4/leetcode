package fortySeven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums==null || nums.length==0) return res;
        boolean[] used = new boolean[nums.length]; //默认false
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        dfs(nums, used, list, res);
        return res;
    }

    public void dfs(int[] nums, boolean[] used, List<Integer> list, List<List<Integer>> res){
        if(list.size()==nums.length){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;//找到第一个能够使用的
            if(i>0 &&nums[i-1]==nums[i] && !used[i-1]) continue; //上一次取出的数字一定被标记为false
            used[i]=true;//这个数字被使用
            list.add(nums[i]);//
            dfs(nums,used,list,res);//处理下一个地方
            used[i]=false; //可以再次使用这个数字
            list.remove(list.size()-1);
        }
    }
}