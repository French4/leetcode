package fourty;
/*
 * �ҳ�������Ԫ�صĺ͵���Ŀ�����ֵ�
 * */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
      //�ȶ������������
        Arrays.sort(candidates);
        getResult(result, candidates, new ArrayList<Integer>(), 0, target);
        return result;
    }

	private void getResult(List<List<Integer>> result, int[] candidates, ArrayList<Integer> cur, int start,
			int target) {
		if(target > 0){ //֤�������Լ����ں���ȡ������
			for(int i = start; i < candidates.length && target >= candidates[i];i++){
			    if(i > start && candidates[i] == candidates[i-1]) continue;
				cur.add(candidates[i]);//�����������ӽ�ȥ���������ڻ���֪���ܲ������������֣����������������Ҫ�����ȷ��,����target��ֵ
				getResult(result, candidates, cur, i+1, target-candidates[i]);//�������ֲ����ظ�������start�����1
				cur.remove(cur.size()-1);
			}
		}else if( target == 0){
			result.add(new ArrayList<Integer>(cur));
			return;
		}
	}
}
