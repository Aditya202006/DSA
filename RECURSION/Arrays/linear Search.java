// Linear Search 

class Main {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9};
        if(linear(arr,3,0))
            System.out.println("Element is found");
        else
            System.out.println("Element not found");
    }
    public static boolean linear(int[] arr,int n,int index){
        if(index>arr.length-1)
            return false;
        if(arr[index]==n)
            return true;
        return linear(arr,n,index+1);
    }
}

// Element is found
