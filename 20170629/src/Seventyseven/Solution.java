package Seventyseven;

import java.util.ArrayList;
import java.util.List;

/*
 * 给出两个整数n和k，返回1到n中k个数的所有可能的组合...n。n

	例如
	如果n = 4和k =2，则为！
	[
		[ 2，4]，，
		[ 3，4]，
		[ 2，3]，
		[ 1，2]，
		[ 1，3]，
		[ 1，4]，
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
		for(int i=start;i<=n;i++) {//注意i从start开始，看成1固定2,3的组合，2固定，3的组合
			comb.add(i);
			combine(combs, comb, i+1, n, k-1);
			comb.remove(comb.size()-1);
		}
	}

}
