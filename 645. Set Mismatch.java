// 645. Set Mismatch [leetcode]
// https://leetcode.com/problems/set-mismatch/

class Solution {
    public int[] findErrorNums(int[] nums) {
        return cycle(nums);
    }
    static int[] cycle(int[] nums){
        int i=0;
        while(i<nums.length){
            int correctindex = nums[i] - 1;
            if(nums[i] != nums[correctindex]){
                swap(nums,i,correctindex);
            }else{
                i++;
            }
        }
        int[] arr;
        for(int j=0;j<nums.length;j++){
            if(nums[j] != j + 1){
                return new int[]{nums[j],j+1};
            }
        }
        return new int[]{-1,-1};
    }
    static void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}

// Input: nums = [1,2,2,4] 
// Output: [2,3]
