package thirtyeight;
/*
 * The count-and-say sequence is the sequence of integers with the first five terms as following:

1.     1
2.     11
3.     21
4.     1211
5.     111221
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth term of the count-and-say sequence.

Note: Each term of the sequence of integers will be represented as a string.

Example 1:

Input: 1
Output: "1"
Example 2:

Input: 4
Output: "1211"
 * */
public class Solution {
	public static  String countAndSay(int n){
		String ret = ""+1;
		
		while(--n > 0){  //�����ּ��ٵ�0
			ret = organ(ret);  //�����ı�����ͳ��ͬһ�������ַ����ֵĴ���
		}
		return ret;
	}

	private static String organ(String ret) {
		System.out.println("os");
		StringBuilder sb = new StringBuilder();
		for(int i = 0, count = 0; i < ret.length();){ //ȡ����һ��������ַ�
			while(i+count < ret.length()&& ret.charAt(i) == ret.charAt(i+count))
				count++;  //ͳ���ַ����ֵ�Ƶ�ʣ��տ�ʼ���Լ��Ƚ�
			sb.append(count).append(ret.charAt(i)); //��Ƶ�ʺ��ַ�����һ��
			i = i+count; //iָ���һ��'�µ�'�ַ���
			count = 0; //��ʱ�ظ��ַ��ĸ�����0
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		String s = null;
		s = countAndSay(4);
		System.out.println(s);
	}
	
};
/*
 * �ܽ᣺ʵ�ʾ���֪���ַ�1������������ַ��������ַ����ֵĸ�����
 * ͳ���ַ����������ַ����ֵĸ�����
 * 		iָ��Ҫÿһ�εĵ�һ���ַ���countָ���һ��ֱ����iָ����ַ�����ͬ��
 *      i��countָ��ͬ�������ǣ����count��������ַ����ֵ�Ƶ�ʣ�ƴ�ӡ�
 * */
 