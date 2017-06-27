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
	总长度减去最后一个空格在的位置减去1，就是最后一个字符串的长度
 * */
public class Solution {
	public int lengthOfLastWord(String s) {
	    return s.trim().length()-s.trim().lastIndexOf(" ")-1;//得到字符串整个的长度，减去最后空格之前的长度和空格的长度
	}
}
