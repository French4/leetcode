package Fortynine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
 * 对每一个字符串进行排序，然后在hashMap中寻找键，如果键存在，之间放在键对应的值后面
 * 否则创建键，然后将值放在其后
 * */
public class Solution {
	public List<List<String>> groupAnagrams(String[] strs){
		if(strs == null || strs.length == 0) return new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();
		for(String s : strs){
			char[] ca = s.toCharArray();
			Arrays.sort(ca);//对字符数组进行排序
			String keyStr = String.valueOf(ca); //得到键值
			if(!map.containsKey(keyStr)){ //键不存在，创建键
				map.put(keyStr, new ArrayList<String>());
			}
			map.get(keyStr).add(s);//键存在的话，直接放入值中
		}
		return new ArrayList<List<String>>(map.values());
	}
}
