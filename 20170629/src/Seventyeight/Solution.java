package Seventyeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/*
 * 
 * 给定一组不同的整数，nums，返回所有可能的子集。
	注意：解决方案集不能包含重复的子集。

	例如，
	如果nums = [1,2,3]，解决方案是：

	[
 	 	[3]，
  		[1]，
  		[2]，
  	[1,2,3]，
  	  [1,3]，
  	  [2,3]，
  	  [1,2]，
  		[]
]*/
public class Solution {
	public List<List<Integer>> subsets(int[] S) {
	    List<List<Integer>> result = new ArrayList<List<Integer>>();
	   
	    if(S.length == 0){
	        return result;
	    }
	    
	    Arrays.sort(S);
	    dfs(S, 0, new ArrayList<Integer>(), result);
	    return result;
	}

	public void dfs(int[] s, int index, List<Integer> path, List<List<Integer>> result){
	    result.add(new ArrayList<Integer>(path));
	    
	    for(int i = index; i < s.length; i++){
	        path.add(s[i]);
	        dfs(s, i+1, path, result);
	        path.remove(path.size()-1);
	    }
	}
}
