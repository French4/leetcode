package thirtyeight;

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
				count++;  //ͳ���ַ����ֵ�Ƶ��
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
 