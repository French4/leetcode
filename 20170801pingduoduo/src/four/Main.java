package four;

import java.util.Scanner;

/*
 * ��һ��ͯ�ڣ��ɿ�������w[j]
 * С�����õ��ɿ���Ϊh[i]<=w[j]�Ż���ȥ����
 * ʹ�����ĺ�����ȥ����,���ѧ����ȥ��������
 * */
public class Main {
	private static int max = 0;
	private static int[] used;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//h����ĸ���,ѧ������
		int n = sc.nextInt();
		int[] h = new int[n];
		//ÿ��ѧ��Ӧ�õõ��ĸ���
		for(int i = 0; i < n; i++)
			h[i] = sc.nextInt();
		int m = sc.nextInt();
		//ʵ�ʵõ���
		int[] w = new int[m];
		used = new int[m];
		for(int i=0;  i<m; i++)
			w[i] = sc.nextInt();
		int sum = 0;
		getTotal(sum, h,0,w);
		System.out.println(max);
	}

	private static void getTotal(int sum, int[] h, int n, int[] w) {
		if(n == h.length-1){
			if(max < sum){
				max = sum;
			}
		}else{
		for(int i = 0; i < w.length; i++){//ʵ�ʵõ��ĺͷֵĽ��бȽ�
			if(used[i] != 1)//û�б�ʹ��
			{
					used[i] = 1;//���ʹ�ù�
					if(w[i] >= h[n])
						getTotal(sum+1, h, n+1, w);
					else
						getTotal(sum, h, n+1, w);
					used[i] = 0;
				
			}
		}
		}
	}
}
