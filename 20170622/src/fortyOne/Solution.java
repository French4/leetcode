package fortyOne;
/*
 * ¼ÙÉè¼ÆËã 12*11,
 * */
public class Solution {
    public static String multiply(String num1, String num2) {
       int m = num1.length(), n = num2.length(); // m=2, n=2
       int[] pos = new int[m+n]; //m+n=4
       for(int i = m-1; i >= 0; i--){ //i=1
    	   for(int j = n-1; j >=0 ; j--){//j=1 j=0
    		   int mul = (num1.charAt(i) - '0') *(num2.charAt(j)-'0');
    		   int p1 = i+j;//2 1
    		   int p2 = i+j+1;//3 2
    		   int sum = mul+pos[p2]; // sum=2
    		   
    		   System.out.println(p2);
    		   pos[p1] = sum/10; //pos[2] = 0
    		   pos[p2] = sum%10; //pos[3] = 2
    	   }
       }
       StringBuilder sb = new StringBuilder();
       for(int p : pos){
    	   if(!(sb.length() == 0 && p == 0))
    		   sb.append(p);
       }
       return sb.length() == 0? "0" : sb.toString();
    }
    public static void main(String[] args) {
    	String multiply = multiply("11", "23");
    	System.out.println(multiply);
	}
}