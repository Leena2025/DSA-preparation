import java.util.Scanner;
public class Arrsum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[4]; 
        int total=0;

        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
            total=total+arr[i];
        } 
        System.out.println(total);

    }
    
    
}
