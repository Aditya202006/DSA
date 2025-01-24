// JAVA program to find the element using binary search.

import java.util.*;

class Binary {
    public static void main(String[] args) {
        int[] a = {2, 4, 5, 7, 9, 12, 16, 36, 48};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be found: ");
        int target = sc.nextInt();
        
        int result = binarySearch(a, target);
        if (result == -1) {
            System.out.println("Number not found");
        } else {
            System.out.println("Number found at index: " + result);
        }
    }

    public static int binarySearch(int[] a, int target) {
        int start = 0;
        int end = a.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > a[mid]) {
                start = mid + 1;
            } else if (target < a[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

/*
OUTPUT:

Enter the number to be found: 
7
Number found at index: 3
*/
