//  287. Find the Duplicate Number [leetcode]
//  https://leetcode.com/problems/find-the-duplicate-number/description/

class Solution {
    public int findDuplicate(int[] nums) {
        return cycle(nums);
    }
    static int cycle(int[] nums){
        int i=0;
        while(i<nums.length){
            int correctindex = nums[i] - 1;
            if(nums[i] != nums[correctindex]){
                swap(nums,i,correctindex);
            }else{
                i++;
            }
        }
        int res=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j] != j + 1){
                res = nums[j];
            }
        }
        return res;
    }
    static void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}

//OUTPUT

// 2
