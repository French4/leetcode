package SixtySeven;

public class Solution {
   public String addBinary(String a, String b){
	   StringBuffer sb = new StringBuffer();
	   int i = a.length() - 1, j = b.length() - 1, carry = 0;
	   while(i >= 0 || j >= 0){
		   int sum = carry; //sum = 进位 + 这个两位之和
		   if(j >= 0) sum += b.charAt(j--) - '0';
		   if(i >= 0) sum += a.charAt(i--) - '0';
		   sb.append(sum % 2); //这是本位
		   carry = sum / 2;//产生的进位
	   }
	   
	   if(carry != 0) sb.append(carry); //加上进位
	   return sb.reverse().toString(); //反转
   }
}