//  JAVA program to find a specific number in a given array within a specified range.

class A{
    public static void main(String[] args) {
        int [] arr={1,7,8,55,18};
        System.out.println("Enter the Number to be find : ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        System.out.println("Enter start & end range : ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        boolean find = false;
        for(int i =start;i<end;i++){
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
6
Enter start & end range : 
2
4
Key is not Found

Enter the Number to be find : 
7
Enter start & end range : 
1
3
Key is Found
*/
