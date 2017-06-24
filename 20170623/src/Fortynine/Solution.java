package Fortynine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
 * ��ÿһ���ַ�����������Ȼ����hashMap��Ѱ�Ҽ�����������ڣ�֮����ڼ���Ӧ��ֵ����
 * ���򴴽�����Ȼ��ֵ�������
 * */
public class Solution {
	public List<List<String>> groupAnagrams(String[] strs){
		if(strs == null || strs.length == 0) return new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();
		for(String s : strs){
			char[] ca = s.toCharArray();
			Arrays.sort(ca);//���ַ������������
			String keyStr = String.valueOf(ca); //�õ���ֵ
			if(!map.containsKey(keyStr)){ //�������ڣ�������
				map.put(keyStr, new ArrayList<String>());
			}
			map.get(keyStr).add(s);//�����ڵĻ���ֱ�ӷ���ֵ��
		}
		return new ArrayList<List<String>>(map.values());
	}
}
