package Five;

/*
 * 求一个字符串的最长回文子串
 * DP的解决方式：假设一个字符是回文字符串,则判断其对应的左边和右边是否相同就可以了。
 * 时间复杂度是o(n^2),使用一个变量max记录字符串的长度。
 * */
public class Solution {
    private int max = 0;
    private String res = "";
    public String longestPalindrome(String s){
    	if(s.length() == 1) return s;
    	for(int i = 0; i < s.length()-1; i++){
    		check(s,i,i);
    		check(s,i,i+1);
    	}
    	return res;
    }
	private void check(String s, int low, int high) {
		while(low >= 0 && high < s.length()){
			if(s.charAt(low) == s.charAt(high)){
				if(high - low + 1 > max){
					max = high - low + 1;
					res = s.substring(low, high+1);
				}
				low--;high++;
			}else{
				return;
			}
		}
	}
}