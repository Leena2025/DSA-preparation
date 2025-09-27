public class Findmax {
    public static void main(String[] args) {
         Findmax obj=new Findmax();
         int num=obj.max(20,10);
         System.out.println(num);   
    }
    int max(int a,int b){
        if(a>b){
           return a;
        }
        else{
            return b;
        }
    }
    
}
