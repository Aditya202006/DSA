// "Staircase Search" or "Search in a Sorted 2D Matrix".


import java.util.*;

class S {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target number: ");
        int target = sc.nextInt();
        int r = 0;
        int c = arr[0].length - 1;
        
        while (r < arr.length && c >= 0) {
            if (arr[r][c] == target) {
                System.out.println("Target found at: [" + r + ", " + c + "]");
                return;
            }
            if (arr[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        
        System.out.println("Target not found.");
    }
}

// output
// Enter target number: 
// 37
// Target found at: [2, 2]
