// Ordered check

class Main {
    public static void main(String[] args) {
        int[] arr={1,5,7,9};
        if(order(arr,0))
            System.out.println("Ordered");
        else{
            System.out.println("Unordered")
        };
        
    }
    public static boolean order(int[] arr,int i){
        if(i==arr.length-1)
            return true;
        return arr[i]<arr[i+1] && order(arr,i+1);
    }
}

// Ordered 
