// Write a program to find the ceiling of the given number target in the array.

import java.util.Scanner;

class Ceiling {
    public static void main(String[] args) {
        int[] a = {2, 4, 5, 7, 9, 12, 16, 36, 48};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be found: ");
        int target = sc.nextInt();
        
        int result = ceiling(a, target);
        if (result == -1) {
            System.out.println("Number not found");
        } else {
            System.out.println("Number found at index: " + result);
        }
    }

    public static int ceiling(int[] a, int target) {
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > a[mid])
                start = mid + 1;
            else if (target < a[mid])
                end = mid - 1;
            else
                return mid;
        }
        return start;
}
}

/*

OUPUT:
Enter the number to be found: 
15
Number found at index: 6

Enter the number to be found: 
3 
Number found at index: 1
*/
