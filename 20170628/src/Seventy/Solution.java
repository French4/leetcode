package Seventy;
/*
 * 动态规划问题:f(n) = f(n-1) + f(n-2)
 * */
public class Solution {
    public int climbStairs(int n) {
       if(n == 1 || n == 2)
    	   return n;
       int first = 1,  second = 2; 
       for(int i = 3; i <= n; i++){
    	   second = second + first;
    	   first = second - first;
       }
       
       return second;
    }
}