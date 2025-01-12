//  JAVA program for finding the minimum value in the array.

import java.util.*;
class A{
    public static void main(String[] args) {
        int [] arr={7,8,55,18,-7};
        int min=arr[0];
        boolean find = false;
        for(int i = 0;i<arr.length;i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum value in the array : "+min);
    }
}

/*
OUTPUT

Minimum value in the array : -7
*/
