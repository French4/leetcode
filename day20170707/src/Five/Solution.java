package Five;

/*
 * ��һ���ַ�����������Ӵ�
 * DP�Ľ����ʽ������һ���ַ��ǻ����ַ���,���ж����Ӧ����ߺ��ұ��Ƿ���ͬ�Ϳ����ˡ�
 * ʱ�临�Ӷ���o(n^2),ʹ��һ������max��¼�ַ����ĳ��ȡ�
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