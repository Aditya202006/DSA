/*Design JAVA Program to implement the Sorting technique - BUBBLE SORT */

import java.util.*;
class Bubble{
   public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements: ");
	int n=sc.nextInt();
	int[] A=new  int[n];
	System.out.println("Enter the elements: ");
	for(int i=0;i<A.length;i++){
		A[i]=sc.nextInt();
	}
	bubbleSort(A);
	System.out.println("Sorted List: ");
	for(int i=0;i<A.length;i++){
		System.out.println(A[i]+" ");
	}
}
static void bubbleSort(int[] A){
  int n=A.length;
  for(int i=0;i<n-1;i++){
	for(int j=0;j<n-i-1;j++){
		if(A[j] > A[j+1]){
			int temp=A[j];
			A[j]=A[j+1];
			A[j+1]=temp;
	}
      }
   }
 }
}

OUTPUT
  
Enter the number of elements: 
5
Enter the elements: 
7
5
4
9
8
Sorted List: 
4 
5 
7 
8 
9 
