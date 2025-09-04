// Sum of the digits

class Main {
    public static void main(String[] args) {
        System.out.println(sum(1342));
    }
        public static int sum(int n){
            if(n==0){
                return 0;
            }
            int rem = n %10;
            return rem + sum(n/10);
        }
}

// 10
