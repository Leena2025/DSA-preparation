
import java.util.Scanner;
public class Oddoreven {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      int a=scan.nextInt();
      if(a%2==0){
        System.out.println(a+" is a even number");
      }
      else{
        System.out.println(a+" is a odd number");
      }
    }
    
}
