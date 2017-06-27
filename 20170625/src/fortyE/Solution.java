package fortyE;

import java.util.HashMap;

/*
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', 
 * return the length of last word in the string
	If the last word does not exist, return 0.	
	Note: A word is defined as a character sequence consists of non-space characters only.
	For example, 
	Given s = "Hello World",
	return 5.	
	�ܳ��ȼ�ȥ���һ���ո��ڵ�λ�ü�ȥ1���������һ���ַ����ĳ���
 * */
public class Solution {
	public int lengthOfLastWord(String s) {
	    return s.trim().length()-s.trim().lastIndexOf(" ")-1;//�õ��ַ��������ĳ��ȣ���ȥ���ո�֮ǰ�ĳ��ȺͿո�ĳ���
	}
}
