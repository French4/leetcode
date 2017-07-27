package NineThree;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a string containing only digits,
 *  restore it by returning all possible valid IP address 
 *  combinations.

For example:
Given "25525511135",

return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
 * */
/*
 * 将字符串s分为四个子串，检查子串是否有效。
 * 长度大于3或者等于0的字符串无效
 * 长度大于1但是第一个字符为0的字符串无效
 * 整数大于255字符串无效
 * */
public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<String>();
        int len = s.length();
        for(int i = 1; i < 4 && i < len-2; i++)//len-2保证后面至少有两个字符
        {
        	for(int j = i+1; j < i+4 && j<len-1; j++){
        		for(int k = j+1; k<j+4 && k<len; k++ )
        		{
        			String s1 = s.substring(0, i);//刚开始时候截取1个
        			String s2 = s.substring(i, j);//截取1个
        			String s3 = s.substring(j, k);//截取一个，
        			String s4 = s.substring(k, len);//其余所有
        			if(isValid(s1) && isValid(s2) && isValid(s3) && isValid(s4))
        				res.add(s1+"."+s2+"."+s3+"."+s4);
        		}
        	}
        }
        return res;
    }

	private boolean isValid(String s) {
		if(s.length()>3 || s.length()==0 || (s.length()>1 && s.charAt(0)=='0') ||  Integer.valueOf(s)>255)
			return false;
		return true;
	}
}
