package SixtySix;

public class Solution {
    public int[] plusOne(int[] digits) {
    	int n = digits.length;
      for(int i = n-1; i >= 0; i--){
    	  if(digits[i] < 9){
    		  digits[i]++;
    		  return digits;
    	  }
    	  
    	  digits[i] = 0; //这是要进位，本位归0
      }
      
      int[] newNumber = new int[n+1]; //这种情况是9999之类
      newNumber[0] = 1;
      
      return newNumber;
    }
}
