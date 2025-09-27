public class Fabonacci {
    public static void main(String[] args) {
        Fabonacci obj=new Fabonacci();
       System.out.println(obj.fab(5));
    }

    int fab(int n){
       int a=0, b=1,next=0; 
       if(n==0) return a;
       if(n==1) return b;
       for(int i=0;i<=n;i++){

         next =a+b;
         a=b;
         b=next;
       }
       
       
       return next;


    }
    
}
