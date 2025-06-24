// OUTPUT
*
* *
* * *
* * * *

import java.util.*;
class Sample {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();;
        }
    }
}


// OUTPUT
* * * *
* * * *
* * * *
* * * *
  
import java.util.*;
class Sample {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();;
        }
    }
}


// OUTPUT
* * * *
* * *
* *
*

import java.util.*;
class Sample {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print("* ");
            }
            System.out.println();;
        }
    }
}


// OUTPUT
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

  
import java.util.*;
class Sample {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();;
        }
    }
}


//OUTPUT
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 


import java.util.*;
class Sample {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int i=1;i<=2*n - 1;i++){
            int col = i > n ?  2 * n - i : i;
            for(int j=1;j<=col;j++){
                System.out.print("* ");
            }
            System.out.println();;
        }
    }
}


//OUTPUT
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    *

import java.util.*;
class Sample {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int i=1;i<=2*n - 1;i++){
            int col = i > n ?  2 * n - i : i;
            int spaces = n - col;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=col;j++){
                System.out.print("* ");
            }
            System.out.println();;
        }
    }
}


// OUTPUT
