package thirtynine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * ˼·��������Ŀ��˼�Ǵ�������ѡ��һ�����ݣ�ʹ�������Ŀ�����ݡ������е����ݿ����ظ�
 * ������[2,3,6,7] target=7
 * ����ļ���Ӧ����223��7�������������
 * */
public class Solution {
	public  List<List<Integer>> combinationSum(int[] candidates, int target)
	{
		Arrays.sort(candidates);
		List<List<Integer>> result = new ArrayList<List<Integer>>(); //����������
		getResult(result, new ArrayList<Integer>(), candidates, target, 0);//������ϣ�����ӵ�һ�в����Ƿ�͵���target������
		//���飬Ŀ�꣬��ʵλ��
		return result;
	}

	private  void getResult(List<List<Integer>> result,
			ArrayList<Integer> cur, int[] candidates, int target, int start) {
		if(target > 0){
			for(int i = start; i < candidates.length && target >= candidates[i];i++){
				cur.add(candidates[i]);//��ǰ�������û�мӵ�targrt��ʱ��
				getResult(result, cur, candidates, target - candidates[i], i); //����������Ԫ��֪�����ڻ��ߵ���target
				cur.remove(cur.size()-1);//�����ⲽ�裬˵��ǰ���˵����ӵ��µ���ʧ�ܣ�����Ҫɾ��ǰ����ӵ�����
			}
		}else if(target == 0){
			result.add(new ArrayList<Integer>(cur)); //��ӵ�������ȷ���õ���
			
		}
	}
}
