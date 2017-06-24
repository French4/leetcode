package fifty;

public class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1; //指数等于0，返回1
        if (x == 1) return 1; //底数等于1 返回1
        if (x == -1) {
            if (n % 2 == 0) return 1; //底数等于-1，返回1
            else return -1;  //返回-1
        }
        if (n == Integer.MIN_VALUE) return 0; //n数无穷小时候，返回0
        if (n < 0) {
            n = -n;
            x = 1/x;
        }
        double ret = 1.0;
        while (n > 0) {
            if ((n & 1) != 0)  //n不等于偶数，因为奇数总会留下一个x
                ret *= x;
            x = x * x;//取平方一次
            n = n >> 1;//n除以2，n相对应的减少一半
        }
        return ret;
    }
}
