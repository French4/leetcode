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
 * ���ַ���s��Ϊ�ĸ��Ӵ�������Ӵ��Ƿ���Ч��
 * ���ȴ���3���ߵ���0���ַ�����Ч
 * ���ȴ���1���ǵ�һ���ַ�Ϊ0���ַ�����Ч
 * ��������255�ַ�����Ч
 * */
public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<String>();
        int len = s.length();
        for(int i = 1; i < 4 && i < len-2; i++)//len-2��֤���������������ַ�
        {
        	for(int j = i+1; j < i+4 && j<len-1; j++){
        		for(int k = j+1; k<j+4 && k<len; k++ )
        		{
        			String s1 = s.substring(0, i);//�տ�ʼʱ���ȡ1��
        			String s2 = s.substring(i, j);//��ȡ1��
        			String s3 = s.substring(j, k);//��ȡһ����
        			String s4 = s.substring(k, len);//��������
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
