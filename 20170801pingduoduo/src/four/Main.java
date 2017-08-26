package four;

import java.util.Scanner;

/*
 * 六一儿童节，巧克力重量w[j]
 * 小朋友拿到巧克力为h[i]<=w[j]才会上去表演
 * 使得最多的孩子上去表演,输出学生上去人数最多的
 * */
public class Main {
	private static int max = 0;
	private static int[] used;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//h数组的个数,学生人数
		int n = sc.nextInt();
		int[] h = new int[n];
		//每个学生应该得到的个数
		for(int i = 0; i < n; i++)
			h[i] = sc.nextInt();
		int m = sc.nextInt();
		//实际得到的
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
		for(int i = 0; i < w.length; i++){//实际得到的和分的进行比较
			if(used[i] != 1)//没有被使用
			{
					used[i] = 1;//标记使用过
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
