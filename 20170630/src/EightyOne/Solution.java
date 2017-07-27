package EightyOne;
/*
 * 第一个元素应该是大于等于最后一个元素。如果元素位于前面的递增数组
 * ，那么它应该大于等于第一个指针指向的元素。如果中间元素位于后面的递增数组
 * 那么它应该小于等于第二个指针指向的元素。
 * 第一个指针总是指向前面递增的元素，第二个指针指向第二个数组的元素
 * */
public class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0, end = nums.length - 1, mid = -1;
        while(start <= end){
        	mid = (start+end)/2;
        	if(nums[mid] == target){
        		return true;
        	}
        	//在mid第二个数组中
        	if(nums[mid] < nums[end] || nums[mid] < nums[start]){
        		if(target > nums[mid] && target <= nums[end])
        			start = mid + 1;
        		else{
        			end = mid - 1;//前半段数组没有找到，那就在后半段
        		}
        	}else if(nums[mid] > nums[start] || nums[mid] > nums[end]){
        		if(target < nums[mid] && target >= nums[start]){
        			end = mid - 1;
        		}else{
        			start = mid + 1;
        		}
        	}else{
        		end--;//此时,nums[mid] == nums[start] == nums[]
        	}
        }
        return false;
    }
}
