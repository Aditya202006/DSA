/*Design JAVA Program to implement the Sorting technique - BUBBLE SORT */

import java.util.*;
class Sample{
    public static void main(String[] args){
        int[] arr={3,1,5,4,2};
        boolean swapped = false;
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
        }
    }
}

//  OUTPUT
//  [1,2,3,4,5]
