package EightyOne;
/*
 * ��һ��Ԫ��Ӧ���Ǵ��ڵ������һ��Ԫ�ء����Ԫ��λ��ǰ��ĵ�������
 * ����ô��Ӧ�ô��ڵ��ڵ�һ��ָ��ָ���Ԫ�ء�����м�Ԫ��λ�ں���ĵ�������
 * ��ô��Ӧ��С�ڵ��ڵڶ���ָ��ָ���Ԫ�ء�
 * ��һ��ָ������ָ��ǰ�������Ԫ�أ��ڶ���ָ��ָ��ڶ��������Ԫ��
 * */
public class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0, end = nums.length - 1, mid = -1;
        while(start <= end){
        	mid = (start+end)/2;
        	if(nums[mid] == target){
        		return true;
        	}
        	//��mid�ڶ���������
        	if(nums[mid] < nums[end] || nums[mid] < nums[start]){
        		if(target > nums[mid] && target <= nums[end])
        			start = mid + 1;
        		else{
        			end = mid - 1;//ǰ�������û���ҵ����Ǿ��ں���
        		}
        	}else if(nums[mid] > nums[start] || nums[mid] > nums[end]){
        		if(target < nums[mid] && target >= nums[start]){
        			end = mid - 1;
        		}else{
        			start = mid + 1;
        		}
        	}else{
        		end--;//��ʱ,nums[mid] == nums[start] == nums[]
        	}
        }
        return false;
    }
}
