import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        char ch=scan.next().charAt(0);
        ch=Character.toLowerCase(ch);
         if(ch>='a' && ch<='z'){
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
              System.out.println(ch +"is a vowel");

        }
        else{
        System.out.println(ch+ "is a consonant");
    }

    }
    else{
        System.out.println("INVALID INPUT" );
    }

    

    }
    
}
