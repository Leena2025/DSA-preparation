public class Factorial {
    public static void main(String args[]){
        
       Factorial obj=new Factorial();
        
       int num=obj.fact(5);
       System.out.println(num);
    }
    int fact(int n){
        int result=1;
        for(int a=1;a<=n;a++){

         result=a*result;   
        }
        return result;
    }
    
}
