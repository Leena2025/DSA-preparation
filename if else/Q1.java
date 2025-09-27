import java.util.Scanner;
class Q1{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if(num%2==0){
            System.out.println("THE NUMBER IS EVEN");
        }
        else{
            System.out.println("THE NUMBER IS ODD");
        }
    }
}
