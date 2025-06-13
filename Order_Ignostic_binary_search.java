// Java program for order ignostic binary serach

import java.util.*;
class Sample{
    public static void main(String[] args) {
        // int[] arr = {1,4,7,9,13,46,215};
        int[] arr = {215,46,13,9,7,4,1};
        int target = 1;
        System.out.println(binary(arr, target));
    }
    static int binary(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;
        boolean asc;
        if(arr[start] < arr[end]){
            asc = true;
        }
        else{
            asc = false;
        }
        while (start<=end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;    
            }
            if(asc){
                if(arr[mid] < target){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            else{
                if(arr[mid] > target){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}

/*
output :
6
*/
