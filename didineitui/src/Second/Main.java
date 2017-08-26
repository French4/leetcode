package Second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * 找出n个数中最小的k个数
 * */
public class Main{
	//基于快速排序的实现
	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(
						new InputStreamReader(System.in));
		String line = null;
		while((line=br.readLine()) != null){
			String[] s = line.trim().split(" ");
			int[] a = new int[s.length-1];
			for(int i = 0; i < a.length; i++){
				a[i] = Integer.parseInt(s[i]);
			}
			int k = Integer.parseInt(s[s.length-1]);
			int start = 0, end = a.length-1;
			int index = partition(a,start, end);//寻找index = k-1位置
			while(index != k-1){
				if(index > k-1){
					end = k-1;
					index = partition(a, start, end);//找前k个数
				}else{
					start = index+1;
					index = partition(a, start, end);//找后k个数
				}
			}
			Arrays.sort(a, 0, k-1);
			for(int i=0;i<k;i++){
                if(i != k-1){
                    System.out.print(a[i]);
                    System.out.print(" ");
                }else{
                    System.out.println(a[i]);
                }
            }
		}
	}

	private static int partition(int[] nums, int start, int end) {
		int pivot = nums[start];
		while(start < end){
			//在右侧找到第一个小于比较值的
			while(start < end && pivot <= nums[end]){
				end--;
			}
			//将找到值放到左册去
			nums[start] = nums[end];
			while(start < end && pivot >= nums[start])
				start++;
			nums[end] = nums[start];
		}
		//结束之后将其归位
		nums[start] = pivot;
		return start; //返回
	}
}
 