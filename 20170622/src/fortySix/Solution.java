package fortySix;
import java.util.ArrayList;
import java.util.List;
/*
 * DFS���ܲμ����˲��ͣ�http://blog.csdn.net/buzhbuzh/article/details/73694809
 * */
public class Solution {
    public   List<List<Integer>> permute(int[] nums) {
    	List<List<Integer>> listAll = new ArrayList<>();
    	boolean[] used = new boolean[nums.length]; //Ĭ����false
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
			return;  //���ص���һ�ε��õ�λ��
		}
		for(int i = 0; i < nums.length; i++){ //ֻ��ÿһ��λ�ý��п���
			if(used[i] != false){ //֤�����λ�ÿ��Է�����
				used[i] = false;//���ֲ����ڼ���ʹ��
				array[step] = nums[i];
				permute(array, nums, listall,used, step+1); //������һ��λ�÷�����
				used[i] = true;
			}
		}
	}
}

 