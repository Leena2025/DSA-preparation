import java.util.Scanner;
public class SumAverage {
    public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=scan.nextInt();
         }
         double avg=(double)sum/n;
         
         System.out.println(sum);
         System.out.println(avg);
        
    }
    
}
