// Number of zeroes

class Main {
    public static void main(String[] args) {
        int n = 1000045;
        System.out.println(count(n,0));
        
    }
    public static int count(int n,int c){
        if(n==0)
            return c;
        int rem = n%10;
        if(rem==0)
            c++;
        return count(n/10,c);
    }
}
