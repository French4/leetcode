package Second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * �ҳ�n��������С��k����
 * */
public class Main{
	//���ڿ��������ʵ��
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
			int index = partition(a,start, end);//Ѱ��index = k-1λ��
			while(index != k-1){
				if(index > k-1){
					end = k-1;
					index = partition(a, start, end);//��ǰk����
				}else{
					start = index+1;
					index = partition(a, start, end);//�Һ�k����
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
			//���Ҳ��ҵ���һ��С�ڱȽ�ֵ��
			while(start < end && pivot <= nums[end]){
				end--;
			}
			//���ҵ�ֵ�ŵ����ȥ
			nums[start] = nums[end];
			while(start < end && pivot >= nums[start])
				start++;
			nums[end] = nums[start];
		}
		//����֮�����λ
		nums[start] = pivot;
		return start; //����
	}
}
 