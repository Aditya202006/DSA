//  Find Numbers with Even Number of Digits
//   https://leetcode.com/submissions/detail/1661436829/

class Solution {
    public int findNumbers(int[] nums) {
        int evennum =0;
        for(int i=0;i<nums.length;i++){
            if(even(nums[i])){
                evennum++;
            }
        }
        return evennum;
    }
    static boolean even(int num){
        int count = 0;
        while(num!=0){
            num/=10;
            count++;
        }
        if(count % 2==0){
            return true;
        }
        return false;
    }
}
