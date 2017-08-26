package first;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] arrayLine = line.split(" ");
		int[] array = new int[arrayLine.length];
		for(int i = 0; i < array.length; i++){
			array[i] = Integer.valueOf(arrayLine[i]);
		}
		System.out.println(getSum(array));
	}

	private static int getSum(int[] array) {
		int max = array[0];
		int endMax = array[0];
		System.out.println("endMax:"+endMax+"max:"+max);
		for(int i = 1; i < array.length; i++){
			endMax = Math.max(endMax+array[i], array[i]);
			max = Math.max(max, endMax);
			System.out.println("endMax:"+endMax+"max:"+max);
		}
		return max;
	}
}
