//  268. Missing Number [leetcode]
//  https://leetcode.com/problems/missing-number/description/

class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correctindex = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correctindex]){
                swap(nums,i,correctindex);
            }
            else{
                i++;
            }
        }
        
        for(int j=0;j<nums.length;j++){
            if(j != nums[j]){
                return j;
            }
        }
        return nums.length;
    } 
    void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}

// OUTPUT
// 2
