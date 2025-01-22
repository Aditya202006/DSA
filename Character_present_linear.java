// JAVA program to find the Character is present in the string or not.

import java.util.*;
public class Linear {
    public static void main(String args[]){
        String a = "hello";
        char target='i';
        int flag=0;
        for(int i=0;i<a.length();i++ ){
            if(a.charAt(i)==target){
                flag=1;
            }
        }
        if(flag == 1)
            System.out.print("Character is Found");
        else
            System.out.println("Character is not found");
}
}

/*
OUTPUT

Character is not found
*/
