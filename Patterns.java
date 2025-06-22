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
