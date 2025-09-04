// Reverse a number

class Main {
        static int rev=0;
    public static void main(String[] args) {
        sum(1342);
        System.out.println(rev);
    }
        public static void sum(int n){ 
            if(n==0)
                return;
            int rem = n %10;
            rev = rev *10 + rem;
            sum(n/10);
        }
}

// 2431
