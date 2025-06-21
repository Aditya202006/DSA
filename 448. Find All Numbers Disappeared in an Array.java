//  448. Find All Numbers Disappeared in an Array [leetcode]
//  https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

class Solution{
    public List<Integer> findDisappearedNumbers(int[] arr){
        // cycle(arr);
        return cycle(arr);
    }
    static List<Integer> cycle(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correctindex = arr[i] -1;
            if(arr[i] != arr[correctindex]){
                swap(arr, i, correctindex);
            }else{
                i++;
            }
        }
        List<Integer> nums = new ArrayList<>();
        for(int j=0;j<arr.length;j++){
            if(j+1 != arr[j]){
                nums.add(j+1);
            }
        }
        return nums;
    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

//  OUTPUT
//  [5,6]
