import java.util.Scanner;
class Q6{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int mark=scan.nextInt();
        if(mark>=90 && mark<=100){
            System.out.println("GRADE A");
        }
        else if(mark>=80 && mark<=89){
            System.out.println("GRADE B");
        }
        else if(mark>=70 && mark<=79 ){
            System.out.println("GRADE C");
        }
        else if(mark>=60 && mark<=69){
            System.out.println("GRADE D");
        }
        else if(mark>=40 && mark<=59){
            System.out.println("GRADE E ");
        }
        else if(mark<40){
            System.out.println("FAIL");
        }
    }
}