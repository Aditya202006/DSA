// Prime numbers in range through sieve's method

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value : ");
        int n = sc.nextInt();
        boolean[] primes = new boolean[n+1];
        sieve(n,primes);
    }
    public static void sieve(int n,boolean[] primes){
        for(int i=2;i*i<=n;i++){
            if(!primes[i]){
                for(int j=i*2;j<=n;j+=i){
                    primes[j] = true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!primes[i]){
                System.out.print(i+" ");
            }
        }
    }
}

// OUTPUT
// Enter the n value : 
// 40
// 2 3 5 7 11 13 17 19 23 29 31 37
