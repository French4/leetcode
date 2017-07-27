package Seventyseven;

import java.util.ArrayList;
import java.util.List;

/*
 * ������������n��k������1��n��k���������п��ܵ����...n��n

	����
	���n = 4��k =2����Ϊ��
	[
		[ 2��4]����
		[ 3��4]��
		[ 2��3]��
		[ 1��2]��
		[ 1��3]��
		[ 1��4]��
	]
 * */
public class Solution {
	public static List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> combs = new ArrayList<List<Integer>>();
		combine(combs, new ArrayList<Integer>(), 1, n, k);
		return combs;
	}
	public static void combine(List<List<Integer>> combs, List<Integer> comb, int start, int n, int k) {
		if(k==0) {
			combs.add(new ArrayList<Integer>(comb));
			return;
		}
		for(int i=start;i<=n;i++) {//ע��i��start��ʼ������1�̶�2,3����ϣ�2�̶���3�����
			comb.add(i);
			combine(combs, comb, i+1, n, k-1);
			comb.remove(comb.size()-1);
		}
	}

}
