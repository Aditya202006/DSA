//  Richest Customer Wealth 
//  https://leetcode.com/submissions/detail/1661531001/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        for(int i=0;i<accounts.length;i++){
            int row =0;
            for(int j=0;j<accounts[i].length;j++){
                row += accounts[i][j];
                if(sum<row){
                    sum = row;
                }
            }
        }
        return sum;
    }
}
