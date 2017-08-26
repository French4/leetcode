package fourteen;
/*
 * 求解数组中的字符串的公共子串
 * 假设第一个是最长公共子串。将其取出认为是最长公共子串
 * 然后和其余的字符串比较
 * */
public class Solution {
	 public String longestCommonPrefix(String[] strs) {
		 if(strs == null || strs.length == 0) return "";
		 String pre = strs[0];
		 int i = 1;
		 while(i < strs.length){
			 while(strs[i].indexOf(pre) != 0){
				 pre = pre.substring(0, pre.length()-1);
			 }
			 i++;
		 }
		 return pre;
	 }
}
