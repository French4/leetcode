package Three;

import java.util.HashMap;

/*
 * ����һ���ַ������ҵ���Ӵ��ĳ��ȣ������ظ��ַ���
 *������abcabcbb�������ǡ�abc��������Ϊ3��

 *������bbbbb�������ǡ�b��������Ϊ1��

 *������pwwkew�������ǡ�wke��������Ϊ3.��ע�⣬�𰸱��������ַ�������pwke���������ж��������ַ�����
 *���ַ����ֱ�Ϊ���࣬����jǰ���j��j����,jǰ����ַ�������Ӵ��Ѿ������������
 *�������˳������ַ����е��ַ���������ַ���֮ǰ�ı����г��ֹ�
 *���ҳ��ֵ�λ����Ŀǰ����ͳ�Ƶ����ַ�����λ��֮����ô���Ǿ���Ҫ�������ַ�������㣻������ַ���û�г��ֹ���
 *���߳��ֵ�λ����Ŀǰ����ͳ�Ƶ����ַ�����λ��֮ǰ����������ڵ����ַ������Ȳ�ˢ�����Ž��ֵ��
 �ڱ��������У�ͨ��һ���ֵ�������´���������ַ���λ�ã�֪������������
 * */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for(int i=0, j=0; i<s.length(); i++)//�����ַ���
        {
        	if(map.containsKey(s.charAt(i))){
        		j = Math.max(j, map.get(s.charAt(i)+1));
        	}//hashmap�����ַ���,��j�ƶ�������ַ����Ҳ�
        	map.put(s.charAt(i), i);//�����ַ������±�,����ظ��Ͳ���
        	max = Math.max(max, i-j+1);//����max��ֵ,����ظ��Ļ�,��ʱi-j+1 = 0
        }
        return max;
    }
}
