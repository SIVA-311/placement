public class addmatrix {
    public static void main(String args[]){
        int arr[][]={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        int num=0;
        int right=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[1].length;j++){
                if(i==j){
                num=num+arr[i][j];
            }
        else 
        if(j+i==arr[i].length){
            right=arr[i][j]+right;
                }       
             }
        }
            System.out.println(num);
            System.out.println(right);
    }
}
