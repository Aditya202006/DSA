// Binary Search on a 2D Matrix

import java.util.*;
class S{
    public static void main(String[] args){
        int [][] arr={
            {1,3,5},{7,9,11},{13,15,17}
        };
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the target element:");
        int target = sc.nextInt();
        int start = 0;
        int end = arr.length*arr[0].length;
        int row,col;
        boolean flag=false;
        while(start<=end){
            int mid = start + (end - start)/2;
            row = mid / arr[0].length;
            col = mid % arr[0].length;
            if(arr[row][col]==target){
                flag = true;
                break;
            }
            else if(arr[row][col] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        System.out.println(flag ? "Target found!" : "Target not found.");
    }
}

// OUTPUT
// Enter the target element:
// 7
// Target found!
