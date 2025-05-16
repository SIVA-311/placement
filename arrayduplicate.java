import java.util.*;
import java.io.*;
public class arrayduplicate {
    public static void main (String [] args){
        int a[] ={1,2,2,2,3,4,76,8,98,76,8,87,5,4};
        int n = a.length;
        int b = -1;
        Arrays.sort(a);
        //System.out.println(Arrays.toString(a));
        for(int i=0;i<n;i++){
            if(a[i]!=-1){
            for(int j=i+1;j<n;j++){
                if( a[i]==a[j]){
                a[j]=b;
                }
            }
        System.out.println(a[i]);
            }
        }
    }
}