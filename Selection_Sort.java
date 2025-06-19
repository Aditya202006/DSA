/* Design JAVA program to implement the sorting technique - SELECTION SORT */


import java.util.*;
class Sample {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length - i -1;
            int maxIndex = maxIndex(arr,0,last);
            swap(arr,last, maxIndex);
        }
    }
    static int maxIndex(int[] arr,int start,int end){
        int max = start;
        for(int i=0;i<=end;i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

//  OUTPUT
//  [1,2,3,4,5]
