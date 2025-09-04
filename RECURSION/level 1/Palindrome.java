// Palindrome

class Main {
        static int rev=0;
    public static void main(String[] args) {
        int n=1441;
        sum(n);
        if(n==rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
        public static void sum(int n){ 
            if(n==0)
                return;
            int rem = n %10;
            rev = rev *10 + rem;
            sum(n/10);
        }
}

// palindrome
