// Patterns using recursion 

import java.util.*;
class Main {
    public static void main(String[] args) {
        star(4,0);
    }
    public static void star(int r,int c){
        if(r==0)
            return;
        if(r>c){
            System.out.print("*"+" ");
            star(r,c++);
        }
        else{
            System.out.println();
            star(r--,0);
        }
    }
}

// output
// * * * * 
// * * * 
// * * 
// *
