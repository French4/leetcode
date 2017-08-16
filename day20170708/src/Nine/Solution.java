package Nine;
/*
 * 判断是否是回文数
 * */
public class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        if(x < 0 || (x>0 && x%10 == 0))
        	return false;
        while(x > rev){
        	rev = rev*10 + x%10;
        	x = x/10;
        }
        return (rev==x)||(rev/10 == x);
    }
}
