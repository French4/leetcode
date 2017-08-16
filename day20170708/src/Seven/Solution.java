package Seven;
/*
 * 将数字逆置，如果数字超出有限值，就返回0
 * */
public class Solution {
    public int reverse(int x) {
    	int sum = 0;
        int result = 0;
    	while(x != 0){
            int tail = x % 10;
    		sum = 10*sum + tail;
            if((sum - tail)/10 != result)
                return 0;
            result = sum;
    		x = x/10;
    	}
    	return result;
    }
}