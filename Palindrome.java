// palindrome

import java.util.*;
class S{
    public static void main(String[] args){
        boolean result = palindrome();
        System.out.println(result);
    }
    public static boolean palindrome(){
        String str = "Madam";
        if(str == null || str.length() == 0){
            return true;
        }
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start != end){
                return false;
            }
        }
        return true;
    }
}

// true
