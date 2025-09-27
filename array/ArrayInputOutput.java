package array;
import java.util.*;

public class ArrayInputOutput {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int[] num=new int[n];
        for(int i=0;i<n;i++){
            num[i]= scan.nextInt();

        }
        for(int i=0;i<n;i++){
            System.out.println("index" +i +":"+ num[i] );
        }


    }
    
}
