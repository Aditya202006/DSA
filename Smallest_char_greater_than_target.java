// JAVA program  binary search to find the smallest character greater than the target.

public class A {
    public static void main(String args[]){
        char [] a={'c','f','j'};
        char target='c';
        char result = smallest(a, target);
        System.out.println(result);
    }
    public static char smallest(char []a,char target){
        int  start=0;
        int  end = a.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(target < a[mid])
                end=mid-1;
            else
                start = mid +1 ;
        }
        return a[start];
    }
}

/*
OUTPUT

f

*/
