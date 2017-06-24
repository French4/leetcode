package fortySeven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums==null || nums.length==0) return res;
        boolean[] used = new boolean[nums.length]; //Ĭ��false
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
            if(used[i]) continue;//�ҵ���һ���ܹ�ʹ�õ�
            if(i>0 &&nums[i-1]==nums[i] && !used[i-1]) continue; //��һ��ȡ��������һ�������Ϊfalse
            used[i]=true;//������ֱ�ʹ��
            list.add(nums[i]);//
            dfs(nums,used,list,res);//������һ���ط�
            used[i]=false; //�����ٴ�ʹ���������
            list.remove(list.size()-1);
        }
    }
}