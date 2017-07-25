package SixtySeven;

public class Solution {
   public String addBinary(String a, String b){
	   StringBuffer sb = new StringBuffer();
	   int i = a.length() - 1, j = b.length() - 1, carry = 0;
	   while(i >= 0 || j >= 0){
		   int sum = carry; //sum = ��λ + �����λ֮��
		   if(j >= 0) sum += b.charAt(j--) - '0';
		   if(i >= 0) sum += a.charAt(i--) - '0';
		   sb.append(sum % 2); //���Ǳ�λ
		   carry = sum / 2;//�����Ľ�λ
	   }
	   
	   if(carry != 0) sb.append(carry); //���Ͻ�λ
	   return sb.reverse().toString(); //��ת
   }
}