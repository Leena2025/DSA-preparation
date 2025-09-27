import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int temp=scan.nextInt();
        if(temp<20){
            System.out.println("cold");
        }
        else if(temp>=20 && temp<=30){
            System.out.println("warm");
        }
        else if(temp>30){
            System.out.println("hot");
        }else{
            System.out.println();
        }

    }
    
}
