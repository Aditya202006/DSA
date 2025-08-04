// Square root of a number

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = sc.nextInt();
        int p=3;
        System.out.println(sqrt(n,p));
    }
    public static double sqrt(int n,int p){
        int s = 0;
        int e = n;
        double root=0.0;
        while(s<=e){
            int m = s + (e-s)/2;
            if(m*m==n){
                return m;
            }
            if(m*m>n){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        root = e;
        double inc= 0.1;
        for(int i=0;i<p;i++){
            while(root*root<=n){
                root+=inc;
            }
            root-=inc;
            inc/=10;
            }
        return root;
    }   
}

// OUTPUT
// 37
// 4.123
