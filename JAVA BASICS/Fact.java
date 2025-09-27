public class Fact {
    public static void main(String[] args) {
        int fac=5;
        int n=1;
        for(int i=1;i<=fac;i++){
            n=i*n;
        }
        System.out.println("Factorial of " +fac+ " is "+n);

    }
    
}
