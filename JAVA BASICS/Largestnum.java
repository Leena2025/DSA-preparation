import java.util.Scanner;
public class Largestnum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("num1= ");
        int num1=scan.nextInt();
        System.out.print("num2= ");
        int num2=scan.nextInt();
        if(num1>num2){
            System.out.println(num1+" is largest");
        }
        else if(num1<num2){
            System.out.println(num2+" is largest");
        }
        else{
            System.out.println(num1+","+num2+" is equal");
        }
        
    }
    
}

