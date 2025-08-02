//  Prime Numbers in the given Range

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = sc.nextInt();
        printprimes(n);
    }
    public static void printprimes(int n){
        if(n <= 1){
            System.out.println("There are no primes in the given range");
        }
        for(int i=2;i<=n;i++){
            boolean b = prime(i);
            if(b)
                System.out.print(i+" ");
        }
    }
    public static boolean prime(int n){
            if(n <= 1){
                return false;
            }
            for(int i=2;i*i<=n;i++){
                if(n%i == 0){
                    return false;
                }
            }
            return true;
    }
}

// OUTPUT
// Enter n value: 
// 40
// 2 3 5 7 11 13 17 19 23 29 31 37 
