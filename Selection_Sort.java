/* Design JAVA program to implement the sorting technique - SELECTION SORT */


import java.util.*;

class Selection {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
      
        int[] A = new int[n];
        
        
        System.out.println("Enter the elements: ");
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        
        
        selectionSort(A);
        
        // Print the sorted array
        System.out.println("Sorted List: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }

    static void selectionSort(int[] A) {
        int n = A.length;

        for (int i = 0; i < n - 1; i++) {
            int min_index = i;

            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[min_index]) {
                    min_index = j;
                }
            }

            if (min_index != i) {
                int temp = A[min_index];
                A[min_index] = A[i];
                A[i] = temp;
            }
        }
    }
}

OUTPUT

Enter the number of elements: 
5
Enter the elements: 
7
45
99
33
31
Sorted List: 
7 
31 
33 
45 
99 
