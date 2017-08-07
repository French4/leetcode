package Three;

import java.util.HashMap;

/*
 * 给定一个字符串，找到最长子串的长度，而不重复字符。
 *给定“abcabcbb”，答案是“abc”，长度为3。

 *给定“bbbbb”，答案是“b”，长度为1。

 *给定“pwwkew”，答案是“wke”，长度为3.请注意，答案必须是子字符串，“pwke”是子序列而不是子字符串。
 *将字符串分别为两侧，就是j前面和j和j后面,j前面的字符串的最长子串已经被计算出来。
 * */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for(int i=0, j=0; i<s.length(); i++)//遍历字符串
        {
        	if(map.containsKey(s.charAt(i))){
        		j = Math.max(j, map.get(s.charAt(i)+1));
        	}//hashmap中有字符串,则将j移动到这个字符的右侧
        	map.put(s.charAt(i), i);//放入字符和其下标
        	max = Math.max(max, i-j+1);
        }
        return max;
    }
}
