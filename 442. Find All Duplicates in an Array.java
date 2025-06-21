//  442. Find All Duplicates in an Array [leetcode]
// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        return cycle(nums);
    }
    static List<Integer> cycle(int[] nums){
        int i=0;
        while(i<nums.length){
            int correctindex = nums[i] - 1;
            if(nums[i] != nums[correctindex]){
                swap(nums,i,correctindex);
            }else{
                i++;
            }
        }
        List<Integer> arr = new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j] != j+1){
                arr.add(nums[j]);
            }
        }
        return arr;
    }
    static void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}

// OUTPUT
// [2,3]
