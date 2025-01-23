//  JAVA Program to find the row in a 2D array with the highest sum of its elements.

class A{
    public static void main(String args[]){
        int [][]a={{1,782,3},{78,2,1}};
        int max=0;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=0;j<a[i].length;j++){
                sum+=a[i][j];
            }
            
            if(sum>max ){
                max=sum;
            }
        }
        System.out.println(max);
    }
}

/*

OUTPUT:

786

*/
