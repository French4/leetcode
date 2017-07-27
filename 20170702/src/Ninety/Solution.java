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
       Arrays.sort(nums);//��������
       List<List<Integer>> result = new ArrayList<>();
       dfs(nums, 0, new ArrayList<Integer>(), result);
       return result;
    }

	private void dfs(int[] nums, int index, List<Integer> path,
			List<List<Integer>> result) {
		result.add(path);
		for(int i=index; i<nums.length; i++){ //�����ѡ��ͷ��λ��
			if(i>index && nums[i-1] == nums[i]) continue;//ͬһ��λ�ò��ܷ���ͬ����ĸ
			List<Integer> nPath = new ArrayList<>(path);
			nPath.add(nums[i]);
			dfs(nums, i+1, nPath, result);
		}
	}
}*/
//ȫ����
public class Solution{
	public static void allSort(int[] nums){
		int n = nums.length;
		Arrays.sort(nums);
		int[] used = new int[n];
		dfs(nums,1,n, new ArrayList<Integer>(), used);
	}

	private static void dfs(int[] nums, int step, int n, List<Integer>path, int[] used) {//��һ�����������飬�ڶ��������ǲ���(վ�ڵڼ�������ǰ)
			//�����������ǳ���(���Ӹ���)�����ĸ�������Ŵ�������ȡ������������������Ǳ��
		if(step == n+1){
			System.out.println(path.toString());
		}
		for(int i = 0; i < n; i++){
			if(used[i] == 0){//��ʾ�������У������ֿ���ʹ��
			path.add(nums[i]);//ȡ��
			used[i] = 1;//����Ѿ���ʹ��
			dfs(nums, step+1, n, path, used);//������һ������
			used[i] = 0;//���û��ʹ��
			path.remove(path.size()-1);//ȡ��
			}
		}
	}
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4};
		allSort(array);
	}
}
