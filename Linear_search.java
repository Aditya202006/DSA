// JAVA program to implement linear search technique

import java.util.*;

class A{
    public static void main(String[] args) {
        int [] arr={1,7,8,55,18};
        System.out.println("Enter the Number to be find : ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        boolean find = false;
        for(int i =0;i<arr.length;i++){
            if (key == arr[i]){
                find = true;
            }
        }
        if(find){
            System.out.println("Key is Found");
        }
        else{
            System.out.println("Key is not Found");
        }
    }
}

/*
OUTPUT

Enter the Number to be find : 
7
Key is Found

Enter the Number to be find : 
2
Key is not Found

*/
