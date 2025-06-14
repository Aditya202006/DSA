//Find First and Last Position of Element in Sorted Array

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] def={-1,-1};
        def[0] = index(nums,target,true);
        def[1] = index(nums,target,false);
        return def;
    }
    static int index(int[] arr,int target,boolean revisit){
        int start = 0;
        int end  = arr.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > target){
                end = mid -1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                ans = mid;
                if(revisit){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}

/*
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
*/
