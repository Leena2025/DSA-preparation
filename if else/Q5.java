import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("The number divisible by 3 and 5");
        }
        
        else{
            System.out.println("The number not divisible by 3 and 5");
        }
    }
    
}
