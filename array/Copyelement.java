import java.util.Scanner;
public class Copyelement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[arr1.length];
         for(int i=0;i<arr1.length;i++){
             arr1[i]=scan.nextInt();
            System.out.println("values of arr1: "+arr1[i]);

             arr2[i]=arr1[i];

         }
         for(int i=0;i<arr2.length;i++){
            System.out.println("values of arr2: "+arr2[i]);
         }
    }
    
}
