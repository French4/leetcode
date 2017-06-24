package fifty;

public class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1; //ָ������0������1
        if (x == 1) return 1; //��������1 ����1
        if (x == -1) {
            if (n % 2 == 0) return 1; //��������-1������1
            else return -1;  //����-1
        }
        if (n == Integer.MIN_VALUE) return 0; //n������Сʱ�򣬷���0
        if (n < 0) {
            n = -n;
            x = 1/x;
        }
        double ret = 1.0;
        while (n > 0) {
            if ((n & 1) != 0)  //n������ż������Ϊ�����ܻ�����һ��x
                ret *= x;
            x = x * x;//ȡƽ��һ��
            n = n >> 1;//n����2��n���Ӧ�ļ���һ��
        }
        return ret;
    }
}
