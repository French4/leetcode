package Twelve;
/*
 * 给定一个数，将其转换成罗马数字
 * */
public class Solution {
    public String intToRoman(int num) {
         String M[] = {"", "M", "MM", "MMM"};
         String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
         String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
         String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
         return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
    }
}
