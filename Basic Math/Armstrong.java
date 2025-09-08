// Armstrong number 

import java.util.*;
class Main{
    public static void main(String[] args){
        int n = 153;
        int temp = n;
        int x=n;
        int count=0;
        int sum=0;
        while(n>0){
            n/=10;
            count+=1;
        }
        while(temp>0){
            int rem=temp%10;
            sum+=(int)(Math.pow(rem,count));
            temp/=10;
        }
        if(x==sum)
            System.out.println("Armstrong");
        else
            System.out.println("Not an Armstrong");
    }
}

// Armstrong
