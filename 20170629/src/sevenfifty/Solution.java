package sevenfifty;
/*
 * 给定一个n个对象的数组，红色、白色或蓝色，对它们排序，以便相同颜色的对象相邻，顺序为红色、白色和蓝色。

这里，我们将使用0、1和2的整数表示颜色红色、白色和蓝色。

注意
您不应该使用库的排序函数来解决这个问题。
 * */
public class Solution {
	public void sortColors(int[] nums) {
        int num0 = 0, num1 = 0, num2 = 0;
        for(int i = 0; i < nums.length; i++){
        	if(nums[i] == 0) num0++;
        	if(nums[i] == 1) num1++;
        	if(nums[i] == 2) num2++;
        }
        for(int i = 0; i < num0; i++)
        	nums[i] = 0;
        for(int i = num0; i < num1+num0; i++)
        	nums[i] = 1;
        for(int i = num0+num1; i < num0+num1+num2; i++)
        	nums[i] = 2;
    }
}
