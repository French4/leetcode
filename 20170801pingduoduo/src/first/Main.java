package first;
/*
 * 在一个数组中找到三个数,使得这三个数乘积最大
 * */
import java.util.Scanner;
public class  Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++)
			array[i] = sc.nextInt();
		int sum = getSum(n, array);
		System.out.println(sum);
	}

	private static int getSum(int n, int[] array) {
		int first = 1;
		first = findMax(array, 0);
		first = first*findMax(array, 0);
		first = first*findMax(array, 0);
		return first;
	}

	private static int findMax(int[] array, int index) {
		int first = 1;
		for(int i = 0; i < array.length; i++){
			if(array[i] == 0)
				continue;
			if(array[i] >= array[index]){
				first = array[i];//找到最小值
				index = i;//记录最大值
			}
		}
		array[index] = 0;
		return first;
	}
}
