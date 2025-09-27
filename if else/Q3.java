import java.util.Scanner;
public class Q3 {
    public static void main(String args[]){
       Scanner scan=new Scanner(System.in);
       int age=scan.nextInt();
       if(age>=18){
        System.out.println("eligible for driving license" );
       }
       else{
        System.out.println("not eligible for driving license");
       }
    }
    
}
